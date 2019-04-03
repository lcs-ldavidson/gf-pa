import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{

    int transparency;
    int move;
    int timeElapsed;

    public Portal() {
        transparency = 1;
        move = 0;
        timeElapsed = 1;
    }

    public void act() 
    {
        if(timeElapsed == 1) {
            setLocation(getX() + move, getY());
        }
        if(timeElapsed == 2) {
            setLocation(getX() - move, getY());
        }
        if(timeElapsed == 3) {
            setLocation(getX() - move, getY());
        }
        if(timeElapsed == 4) {
            setLocation(getX() + move, getY());
        }
      
        transparency += 1;
        getImage().setTransparency(transparency);

        timeElapsed += 1;
        if (timeElapsed == 5) {
            timeElapsed = 1;
            move += 1;
        }
        
        if (transparency == 255) {
            ((Paluno)getWorld()).portalIsOpening = false;
            getWorld().removeObject(this);
        }
    }    
}
