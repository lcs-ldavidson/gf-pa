import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalGold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalGold extends Text
{
    int timeElapsed;
    int runningGold;
    public FinalGold() {
        runningGold = 0;
    }

    public void act() 
    {
        setImage(new GreenfootImage("Gold: " + runningGold, 100, Color.YELLOW, new Color(0, 0, 0, 0), Color.BLACK));

        if (runningGold < ((Paluno)getWorld()).raku1.gold) {
            runningGold += 20;
        }   

        if (runningGold >= ((Paluno)getWorld()).raku1.gold) {

            runningGold = ((Paluno)getWorld()).raku1.gold;

        }    
    }
}
