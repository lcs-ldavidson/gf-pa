import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eyes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eyes extends Effects
{int transparency;

    public Eyes() {
        transparency = 0;
    }

    public void act() 
    {
        if (transparency <= 253) {
            transparency += 2;
        }

        getImage().setTransparency(transparency);
    }    
}
