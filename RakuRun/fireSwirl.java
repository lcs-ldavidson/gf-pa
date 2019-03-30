import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireSwirl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireSwirl extends Effects
{
    
    int transparency;
    
    public void act() 
    {
        transparency = ((Paluno)getWorld()).raku1.currentLaunchTimer();
        
        if (transparency >= 255) {
         transparency = 254;   
        }
        
        setImage("fireSwirl.png");
        getImage().setTransparency(transparency);
        getImage().scale(transparency / 2 + 20, transparency / 2 + 20);
        turn(transparency / 10);
    }    
}
