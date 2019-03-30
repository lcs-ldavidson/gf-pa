import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireGauge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireGauge extends Effects
{
    int transparency;

    public fireGauge() {

    }

    public void act() 
    {
        transparency = ((Paluno)getWorld()).raku1.currentLaunchTimer() ;

        if (transparency >= 255) {
            transparency = 254;   
        }

        setImage("fireGauge.png");
        getImage().setTransparency(transparency / 2 + 128);
        getImage().scale(transparency / 2 + 1, transparency / 2 + 1);
        turn(-3);

    }    
}
