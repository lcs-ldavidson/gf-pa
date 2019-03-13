import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthDisplay extends Actor
{

  

    

    public void act() 
    {
        setImage(new GreenfootImage("HP: " + ((Paluno)getWorld()).raku1.health + "/100", 30, Color.WHITE, new Color(0, 0, 0, 0), Color.RED));

        
    }    
}
