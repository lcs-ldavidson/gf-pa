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
    
    public HealthShow(String damage)
    {
        setImage(new GreenfootImage("-" + damage, 50, Color.RED, new Color(0, 0, 0, 0), Color.BLACK));
        transparency = 150;
        damageText = damage; 
    }

    public void act() 
    {
        transparency -= 1;
        setImage(new GreenfootImage("-" + damageText, (transparency / 2), new Color(200, 0, 0, transparency), new Color(0, 0, 0, 0), new Color(200, 0, 0, transparency)));
        if (transparency <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
