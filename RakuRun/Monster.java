import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{

    GreenfootImage monster1;
    GreenfootImage monster2;
    int size;
    Paluno paluno;
    int difficulty;

    int timeElapsed;
    int speed;

    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Monster()
    {
        timeElapsed = 0;
        

        
        monster1 = new GreenfootImage("monster1.PNG");
        monster2 = new GreenfootImage("monster2.PNG");
        setImage(monster1);
        size = Greenfoot.getRandomNumber(40) + 70;

        speed = Greenfoot.getRandomNumber(7) + 5;
    }

    public void act() 
    {

        paluno = (Paluno) getWorld();
        timeElapsed += 1;
        movement();
        animate();

        getImage().scale(size, size + 10);

        turnTowards(paluno.raku1.getX(), paluno.raku1.getY());

        if (Greenfoot.getRandomNumber(100) <= 30) {
            move(((Paluno)getWorld()).difficulty);   
        }

        if (this != null) {
            hitBySword();
        }

        if(getWorld() == null) return;

        if (getY() >= 799)
        {
            getWorld().removeObject(this);
        }
    }

    void movement()
    {
        setLocation(getX(), getY() + speed);
    }

    void animate()
    {
        if (timeElapsed % 5 == 0)
        {

            if (getImage() == monster1)
            {
                setImage(monster2);   
            } else
            {
                setImage(monster1);
            }
        }
    }

    void hitBySword() {

        if (intersects(((Paluno)getWorld()).raku1) && ((Paluno)getWorld()).raku1.getImage() == ((Paluno)getWorld()).raku1.swinger) {
            getWorld().removeObject(this);
        }

    }


}
