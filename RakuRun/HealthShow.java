import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthShow extends Actor
{

    int transparency;
    String damageText;
    boolean healRaku;

    public HealthShow(String damage, Boolean heal)
    {

        if (heal == false) {
            setImage(new GreenfootImage("-" + damage, 50, Color.RED, new Color(0, 0, 0, 0), Color.BLACK));
        }
        else
        {
            setImage(new GreenfootImage("+" + damage, 50, Color.GREEN, new Color(0, 0, 0, 0), Color.BLACK));
        }

        transparency = 150;
        damageText = damage;
        healRaku = heal;

    }

    public void act() 
    {
        if (healRaku == false)
        {
            transparency -= 1;
            setImage(new GreenfootImage("-" + damageText, (transparency / 2), new Color(200, 0, 0, transparency), new Color(0, 0, 0, 0), Color.BLACK));
        }
        else
        {
            transparency -= 1;
            setImage(new GreenfootImage("+" + damageText, (transparency / 2), new Color(0, 255, 0, transparency), new Color(0, 0, 0, 0), Color.BLACK));
        }
        
        
        if (transparency <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
