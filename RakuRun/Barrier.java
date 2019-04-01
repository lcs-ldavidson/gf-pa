import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier extends Boss
{
    int transparency;

    public Barrier() {
        transparency = 0;
    }

    public void act() 
    {
        getImage().setTransparency(transparency);
        setLocation(((Paluno)getWorld()).skollack1.getX(), ((Paluno)getWorld()).skollack1.getY() + 30);
        manageTransparency();
        if(isTouching(Fireball.class)) {
            deflect();
        }
    }    

    void manageTransparency() {
        if (transparency >= 3) {
            transparency -= 3;
        }
    }

    void deflect() {
        transparency = 200;

    }
}
