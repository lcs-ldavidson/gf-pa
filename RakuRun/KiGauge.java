import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KiGauge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KiGauge extends Effects
{
    int transparency;

    public KiGauge() {

    }

    public void act() 
    {
        transparency = ((Paluno)getWorld()).raku1.currentTP() ;


        setImage("kiGauge.png");
        getImage().setTransparency(transparency / 2);
        getImage().scale(transparency / 4 + 1, transparency / 4 + 1);
        turn(-3);

    }    
}
