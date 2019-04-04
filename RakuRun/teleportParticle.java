import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teleportParticle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teleportParticle extends Effects
{
    int velocity;
    int drag;
    int timeElapsed;
    int size;

    public teleportParticle(int fireOrDark) {
        velocity = Greenfoot.getRandomNumber(10) + 5;
        drag = -3;
        setRotation(Greenfoot.getRandomNumber(360));
        size = Greenfoot.getRandomNumber(40) + 25;
        if (fireOrDark == 1) {
            
        }
        if (fireOrDark == 2) {
            setImage("Explosion.png");
        }
        
    }

    public void act() 
    {
        move(velocity);
        setLocation(getX(), getY() + drag);
        getImage().scale(size, size);
        
        if (timeElapsed % 3 == 0) {
            velocity -= 1;
            drag += 1;
        }
        
        timeElapsed += 1;

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
