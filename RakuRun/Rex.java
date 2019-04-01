import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rex extends Support
{
    GreenfootImage rex1;
    GreenfootImage rex2;
    GreenfootImage rex3;
    GreenfootImage rex4;
    int timeElapsed;

    public Rex() {
        rex1 = new GreenfootImage("rex1.png");
        rex2 = new GreenfootImage("rex2.png");
        rex3 = new GreenfootImage("rex1.png");
        rex4 = new GreenfootImage("rex3.png");

        setImage(rex1);
    }

    public void act() 
    {
        setLocation(getX(), getY() - 3 );
        rexCollect(Greenfoot.getRandomNumber(100) + 1);
        animate();
        timeElapsed += 1;
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    

    void animate()
    {
        if (timeElapsed % 5 == 0)
        {

            if (getImage() == rex1)
            {
                setLocation(getX() - 10, getY());
                setImage(rex2);   
            } else if (getImage() == rex2)
            {
                setLocation(getX() + 10, getY());
                setImage(rex3);
            } else if (getImage() == rex3)
            {
                setLocation(getX() + 10, getY());
                setImage(rex4);
            } else 
            {
                setLocation(getX() - 10, getY());
                setImage(rex1);
            }
        }
    }
    
    void rexCollect(int amount) {
        if (isTouching(Gold.class)) {
            removeTouching(Gold.class);
            ((Paluno)getWorld()).raku1.gold += amount;
            getWorld().addObject(new GoldShow("" + amount), getX() + 30, getY() - 30);
            if (((Paluno)getWorld()).raku1.vaerminaTimer < 255) {
                ((Paluno)getWorld()).raku1.vaerminaTimer += 5;
            }
        }
    }

    
}
