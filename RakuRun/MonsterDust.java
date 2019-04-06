import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonsterDust here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonsterDust extends Effects
{

    int awayX;
    int awayY;
    int speed;
    int timeElapsed;

    public MonsterDust(int x, int y) {
        awayX = x;
        awayY = y;
        speed = Greenfoot.getRandomNumber(30) + 5;
    }

    public void act() 
    {
        turnTowards(awayX, awayY);
        move(-speed);
        setLocation(getX(), getY() - speed + 15);
        speed -= 1;
        
        timeElapsed += 1;
        
        if (speed == 0) {
            getWorld().addObject(new Particle(), getX(), getY());
            getWorld().removeObject(this);
        }
    }    
}
