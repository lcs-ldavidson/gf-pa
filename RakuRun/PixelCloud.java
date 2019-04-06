import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PixelCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PixelCloud extends Effects
{
    int transparency;
    int speed;
    int timeElapsed;
    int leftOrRight;

    public PixelCloud() {
        transparency = 0;
        speed = Greenfoot.getRandomNumber(10) + 2;
        leftOrRight = Greenfoot.getRandomNumber(2);
    }

    public void act() 
    {

        getImage().setTransparency(transparency);
        if (transparency < 200) {
            transparency += 2;
        }
        timeElapsed += 1;

        if (timeElapsed >= 30) {
            if (leftOrRight == 0) {
                setLocation(getX() + speed, getY());
            }
            if (leftOrRight == 1) {
                setLocation(getX() - speed, getY());
            }
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }

    }    
}
