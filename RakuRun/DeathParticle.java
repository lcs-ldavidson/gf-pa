import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathParticle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathParticle extends Effects
{
    int explodeX;
    int explodeY;
    int speed;
    int size;
    
    public DeathParticle(int x, int y) {
        explodeX = x;
        explodeY = y;
        speed = Greenfoot.getRandomNumber(10) + 5;
        size = Greenfoot.getRandomNumber(40) + 20;
        
    }
    
    public void act() 
    {
        turnTowards(explodeX, explodeY);
        move(-speed);
        getImage().scale(size, size);
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
