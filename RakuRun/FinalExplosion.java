import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalExplosion extends Effects
{
    int size;

    public FinalExplosion() {
        size = 800;
    }

    public void act() 
    {
        getImage().scale(size, size);
        if (size <= 10000) {
            size += 90;
        }
    }    
}
