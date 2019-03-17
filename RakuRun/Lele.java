import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lele here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lele extends Actor
{
    GreenfootImage lele1;
    GreenfootImage lele2;
    GreenfootImage lele3;
    GreenfootImage lele4;
    GreenfootImage lele5;
    GreenfootImage lele6;
    int timeElapsed;

    public Lele() {
        lele1 = new GreenfootImage("lele1.png");
        lele2 = new GreenfootImage("lele2.png");
        lele3 = new GreenfootImage("lele3.png");
        lele4 = new GreenfootImage("lele4.png");
        lele5 = new GreenfootImage("lele5.png");
        lele6 = new GreenfootImage("lele6.png");

        timeElapsed = 0;
        setImage(lele1);
    }

    public void act()
    {
        if (timeElapsed == 0) {
            setRotation(-90);
        }
        
        if (timeElapsed % 3 == 0) {

            if (getImage() == lele1) {
                setImage(lele2);
            } else if (getImage() == lele2) {
                setImage(lele3);
            } else if (getImage() == lele3) {
                setImage(lele4);
            } else if (getImage() == lele4) {
                setImage(lele5);
            } else if (getImage() == lele5) {
                setImage(lele6);
            } else if (getImage() == lele6) {
                setImage(lele1);
            }
        }
        timeElapsed += 1;
        turn(Greenfoot.getRandomNumber(7) - 3);
        move(5);

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
