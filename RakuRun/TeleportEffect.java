import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeleportEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeleportEffect extends Actor
{

    boolean appearing;
    int size;
    int transparency;

    public TeleportEffect(boolean isAppearing) {

        appearing = isAppearing;
        size = 1;
        transparency = 254;

    }

    public void act() 
    {

        setImage("kiGauge.png");

        if (size >= 100) {
            getWorld().removeObject(this);
        }

        if (appearing == false) {
            getImage().scale(130 - size , 130 - size);

        }

        if (appearing == true) {

            getImage().scale(size, size);
            
        }

        turn(15);
        getImage().setTransparency(transparency);
        size += 5;
        transparency -= 10;
    }    
}
