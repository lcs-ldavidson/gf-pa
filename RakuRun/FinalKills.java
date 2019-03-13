import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalKills here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalKills extends Actor
{
    int timeElapsed;
    int runningKills;
    public FinalKills() {
        runningKills = 0;
    }

    public void act() 
    {
        setImage(new GreenfootImage("Kills: " + runningKills, 100, new Color(145, 2, 255, 255), new Color(0, 0, 0, 0), Color.BLACK));

        if (runningKills < ((Paluno)getWorld()).raku1.kills) {
            runningKills += 1;
        }   

        if (runningKills >= ((Paluno)getWorld()).raku1.kills) {

            runningKills = ((Paluno)getWorld()).raku1.kills;

        }    
    }
}
