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
    GreenfootImage explosion;

    public teleportParticle(int fireOrDark) {
        velocity = Greenfoot.getRandomNumber(10) + 5;
        drag = -3;
        setRotation(Greenfoot.getRandomNumber(360));
        size = Greenfoot.getRandomNumber(40) + 25;
        explosion = new GreenfootImage("Explosion.png");
        if (fireOrDark == 1) {

        }
        if (fireOrDark == 2) {
            setImage(explosion);
        }

    }

    public void act() 
    {
        move(velocity);
        if (getImage() != explosion) {
            setLocation(getX(), getY() + drag);
        }
        getImage().scale(size, size);

        if (timeElapsed % 3 == 0) {
            velocity -= 1;
            drag += 1;
        }

        timeElapsed += 1;

        if (getImage() == explosion) {
            if (timeElapsed >= 200) {
                getWorld().removeObject(this);
            }
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
