import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kiFlare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kiFlare extends Actor
{

    int transparency;
    int size;

    public kiFlare() {
        size = 1;
    }

    public void act() 
    {
        transparency = ((Paluno)getWorld()).raku1.currentTP();

        setImage("kiFlare.png");
        if (transparency >= 510) {
            size += 40;
            getImage().setTransparency(255);
        } else {
            size = 1;
            getImage().setTransparency(0);
        }

        if (size >= 200) {
            size = 200;   
        }

        getImage().scale(size + 170, size);;
    }    
}
