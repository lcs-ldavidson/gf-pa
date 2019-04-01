import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leleHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leleHead extends Support
{
    int transparency;

    public leleHead() {
        transparency = 0;
    }

    public void act() 
    {
        if (transparency == 255) {
            setImage("leleShine.png");
        } else {
            setImage("leleHead.png");
        }

        transparency = ((Paluno)getWorld()).raku1.leleTimer;
        getImage().setTransparency(transparency);
    }    
}
