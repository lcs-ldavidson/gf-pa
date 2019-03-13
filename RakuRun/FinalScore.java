import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalScore extends Actor
{
    int timeElapsed;
    int runningKills;
    int transparency;
    
    public FinalScore() {
        runningKills = 0;
        transparency = 0;
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score: " + runningKills, 100, Color.RED, new Color(0, 0, 0, 0), Color.BLACK));

        if (runningKills < ((Paluno)getWorld()).raku1.kills + ((Paluno)getWorld()).raku1.gold) {
            runningKills += 30;
        }   

        if (runningKills >= ((Paluno)getWorld()).raku1.kills + ((Paluno)getWorld()).raku1.gold) {

            runningKills = ((Paluno)getWorld()).raku1.kills + ((Paluno)getWorld()).raku1.gold;

        }    
        
        transparency += 5;
        
        if (transparency >= 255) {
            transparency = 255;
        }
        
        getImage().setTransparency(transparency);
    }
}
