import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Particle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particle extends Effects
{

    int speed;
    int wiggle;
    int collect;
    int collectionX;
    int collectionY;
    int selfDestruct;

    public Particle()
    {
        speed = Greenfoot.getRandomNumber(4) + 8;
        wiggle = Greenfoot.getRandomNumber(8) + 2;
        collect = speed + 3;
        collectionX = 350 + Greenfoot.getRandomNumber(100) - 50;
        collectionY = 180 + Greenfoot.getRandomNumber(100) - 50;
        selfDestruct = Greenfoot.getRandomNumber(50);

    }

    public void act() 
    {

        setLocation(getX() + Greenfoot.getRandomNumber(wiggle) - (wiggle / 2), getY() + speed); 


        if (((Paluno)getWorld()).portalIsOpening == true) {
            turnTowards(collectionX, collectionY);
            move(collect);
            selfDestruct += 1;

        }

        if (getY() == 799 || selfDestruct >= 140)
        {
            getWorld().removeObject(this);   
        }

    }    
}
