import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic extends Boss
{   int timeElapsed;
    int transparency;
    GreenfootImage image1;
    GreenfootImage image2;
    int angle;

    public Magic(int shot) {

        image1 = new GreenfootImage("lightning1.png");
        image2 = new GreenfootImage("lightning2.png");
        transparency = 0;
        if (shot == 1) {
            angle = -20;
        } else if (shot == 2) {
            angle = 0;
        } else if (shot == 3) {
            angle = 20;
        }

        setImage(image1);
        getImage().setTransparency(0);

        timeElapsed = 0;

    }

    public void act() 
    {   

        
        if (timeElapsed <= 60) {
            turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());

            if (angle == -20) {
                setLocation(((Paluno)getWorld()).skollack1.getX() - 80, ((Paluno)getWorld()).skollack1.getY());
                turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
                setRotation(getRotation() + angle);
            } else if (angle == 0) {
                setLocation(((Paluno)getWorld()).skollack1.getX(), ((Paluno)getWorld()).skollack1.getY() + 50);
                turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
                setRotation(getRotation() + angle);
            } else if (angle == 20) {
                setLocation(((Paluno)getWorld()).skollack1.getX() + 80, ((Paluno)getWorld()).skollack1.getY());
                turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
                setRotation(getRotation() + angle);
            }

        }
        if (timeElapsed >= 120) {
            move(20);
        }

        if (timeElapsed % 3 == 0) {

            if (getImage() == image1) {
                setImage(image2);
            } else {
                setImage(image1);
            }

            getImage().scale(90 + Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(20) + 30);
        }
        timeElapsed += 1;

        if (transparency <= 250) {
            transparency += 5;
        }

        getImage().setTransparency(transparency);

        if (isAtEdge()) {
            getWorld().removeObject(this);   
        }

    }    
}
