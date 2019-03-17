import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vaerminaHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vaerminaHead extends Actor
{
    int transparency;

    public vaerminaHead() {
        transparency = 0;
    }

    public void act() 
    {
        if (transparency == 255) {
            setImage("vaerminaShine.png");
        } else {
            setImage("vaerminaHead.png");
        }
        
        transparency = ((Paluno)getWorld()).raku1.vaerminaTimer;
        getImage().setTransparency(transparency);
    }    
}
