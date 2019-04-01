import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skollack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skollack extends Boss
{

    GreenfootImage image1;
    GreenfootImage image2;
    GreenfootImage image3;
    GreenfootImage image4;
    Paluno paluno;
    int timeElapsed;
    int driftSpeed;

    public skollack() {
        image1 = new GreenfootImage("skollack1.png");
        image2 = new GreenfootImage("skollack2.png");
        image3 = new GreenfootImage("skollack1.png");
        image4 = new GreenfootImage("skollack3.png");
        driftSpeed = Greenfoot.getRandomNumber(10) - 5;
        paluno = (Paluno) getWorld();
        timeElapsed = 0;
        setImage(image1);


    }

    public void act() 
    {

        if (timeElapsed == 0) {
            ((Paluno)getWorld()).addObject(((Paluno)getWorld()).tentacles1, 1, 1);
            ((Paluno)getWorld()).addObject(((Paluno)getWorld()).smoke1, 1, 1);
            ((Paluno)getWorld()).addObject(((Paluno)getWorld()).barrier1, 1, 1);
        }

        animate();
        changeDrift();
        drift();
        correctPosition();
        turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
        timeElapsed += 1;
    }    

    void animate() {
        if (timeElapsed % 7 == 0) {

            if (getImage() == image1)
            {
                setImage(image2);
            }

            else if (getImage() == image2)
            {
                setImage(image3);
            }

            else if (getImage() == image3)
            {
                setImage(image4);
            }

            else if (getImage() == image4)
            {
                setImage(image1);
            }
        }
    }

    void changeDrift() {
        if (timeElapsed % 50 == 0) {
            driftSpeed = Greenfoot.getRandomNumber(10) - 5;
        }
    }

    void drift() {
        setLocation(getX() + driftSpeed, getY());
    }

    void correctPosition() {
        if (getX() <= 90) {
            driftSpeed = 5;
        }

        if (getX() >= 610) {
            driftSpeed = -5;
        }

    }

    void teleportAway() {
        getWorld().removeObject(this);
        getWorld().removeObject(((Paluno)getWorld()).tentacles1);
        getWorld().removeObject(((Paluno)getWorld()).smoke1);
        getWorld().removeObject(((Paluno)getWorld()).barrier1);

    }
}
