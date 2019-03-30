import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smoke extends Boss
{
    

    GreenfootImage smoke1;
    GreenfootImage smoke2;
    GreenfootImage smoke3;
    GreenfootImage smoke4;
    GreenfootImage smoke5;
    GreenfootImage smoke6;
    GreenfootImage smoke7;
    GreenfootImage smoke8;

    int timeElapsed;

    public Smoke() {
        smoke1 = new GreenfootImage("smoke1.png");
        smoke2 = new GreenfootImage("smoke2.png");
        smoke3 = new GreenfootImage("smoke3.png");
        smoke4 = new GreenfootImage("smoke4.png");
        smoke5 = new GreenfootImage("smoke5.png");
        smoke6 = new GreenfootImage("smoke6.png");
        smoke7 = new GreenfootImage("smoke7.png");
        smoke8 = new GreenfootImage("smoke8.png");

        setImage(smoke1);
    }

    public void act() 
    {
        animate();
        setLocation(((Paluno)getWorld()).skollack1.getX() - 2, ((Paluno)getWorld()).skollack1.getY() + 60);
        timeElapsed += 1;
    }    

    void animate() {
        if (timeElapsed % 6 == 0) {
            if (getImage() == smoke1)
            {
                setImage(smoke2);
            }

            else if (getImage() == smoke2)
            {
                setImage(smoke3);
            }

            else if (getImage() == smoke3)
            {
                setImage(smoke4);
            }

            else if (getImage() == smoke4)
            {
                setImage(smoke5);
            }

            else if (getImage() == smoke5)
            {
                setImage(smoke6);
            }

            else if (getImage() == smoke6)
            {
                setImage(smoke7);
            }

            else if (getImage() == smoke7)
            {
                setImage(smoke8);
            }

            else if (getImage() == smoke8)
            {
                setImage(smoke1);
            }
        }
    }    
}
