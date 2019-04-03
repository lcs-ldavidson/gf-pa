import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AtmosphereClouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtmosphereClouds extends Effects
{
    /**
     * Act - do whatever the AtmosphereClouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int speed;
    int wiggle;
    int collectionX;
    int collectionY;
    int selfDestruct;
    int collect;

    public AtmosphereClouds()
    {
        speed = Greenfoot.getRandomNumber(4) + 8;
        wiggle = Greenfoot.getRandomNumber(8) + 2;
        getImage().setTransparency(100);
        getImage().scale(100, 100);
        collectionX = 350 + Greenfoot.getRandomNumber(100) - 50;
        collectionY = 180 + Greenfoot.getRandomNumber(100) - 50;
        selfDestruct = Greenfoot.getRandomNumber(50);
        collect = speed + 3;
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

