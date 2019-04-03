import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class windBlast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class windBlast extends Boss
{
    GreenfootImage blast1;
    GreenfootImage blast2;
    GreenfootImage blast3;
    GreenfootImage blast4;
    GreenfootImage blast5;
    GreenfootImage blast6;
    GreenfootImage blast7;
    GreenfootImage full1;
    GreenfootImage full2;
    GreenfootImage full3;
    
    int timeElapsed;
    int transparency;
    
    public windBlast() {
        blast1 = new GreenfootImage("blast1.PNG");
        blast2 = new GreenfootImage("blast2.PNG");
        blast3 = new GreenfootImage("blast3.PNG");
        blast4 = new GreenfootImage("blast4.PNG");
        blast5 = new GreenfootImage("blast5.PNG");
        blast6 = new GreenfootImage("blast6.PNG");
        blast7 = new GreenfootImage("blast7.PNG");
        
        full1 = new GreenfootImage("full1.PNG");
        full2 = new GreenfootImage("full2.PNG");
        full3 = new GreenfootImage("full3.PNG");
        
        setImage(blast1);
        transparency = 255;
    }
    
    public void act() 
    {
        if (timeElapsed >= 100) {
            transparency -= 5;
        }
        
        animate();
        timeElapsed += 1;
        getImage().setTransparency(transparency);
        blowDust();
        
        if (transparency <= 5) {
            getWorld().removeObject(this);
        }
    }    
    
    void animate() {
        if (timeElapsed % 4 == 0) {
            if (getImage() == blast1)
            {
                setImage(blast2);
            }

            else if (getImage() == blast2)
            {
                setImage(blast3);
            }

            else if (getImage() == blast3)
            {
                setImage(blast4);
            }

            else if (getImage() == blast4)
            {
                setImage(blast5);
            }

            else if (getImage() == blast5)
            {
                setImage(blast6);
            }

            else if (getImage() == blast6)
            {
                setImage(blast7);
            }

            else if (getImage() == blast7)
            {
                setImage(full1);
            } 
            
            else if (getImage() == full1)
            {
                setImage(full2);
            } 
            
            else if (getImage() == full2)
            {
                setImage(full3);
            }
            
            else if (getImage() == full3)
            {
                setImage(full1);
            }
        }
    }    
    
    void blowDust() {
        if (timeElapsed % 5 == 0 && transparency >= 100) {
            getWorld().addObject(new Dust(), getX(), Greenfoot.getRandomNumber(500));
        }
    }
}
