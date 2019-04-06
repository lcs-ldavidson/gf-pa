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
        size = 80;

    }

    public void act() 
    {
        if (size == 80) {
            turn(Greenfoot.getRandomNumber(360));
            move(Greenfoot.getRandomNumber(150));
        }

        getImage().scale(size, size);

        if (size <= 200) {
            size += 10;
            turn(30);
        }

        if (size >= 199) {
            getWorld().removeObject(this);
        }
    }    
}
