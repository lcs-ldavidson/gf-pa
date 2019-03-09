import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldShow extends Actor
{

    int transparency;
    String damageText;
    boolean healRaku;

    public GoldShow(String riches)
    {
        setImage(new GreenfootImage("+" + riches, 50, Color.YELLOW, new Color(0, 0, 0, 0), Color.BLACK));

        transparency = 150;
        damageText = riches;

    }

    public void act() 
    {

        transparency -= 1;
        setImage(new GreenfootImage("+" + damageText, (transparency / 3), new Color(255, 255, 0, transparency), new Color(0, 0, 0, 0), Color.BLACK));

        if (transparency <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
