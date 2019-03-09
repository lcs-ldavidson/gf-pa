import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{

    GreenfootImage fire1;
    GreenfootImage fire2;
    int timeElapsed;

    public Fireball(int direction) {
        setRotation(direction);

        fire1 = new GreenfootImage("fireball1.PNG");
        fire2 = new GreenfootImage("fireball2.PNG");

        timeElapsed = 0;
        setImage(fire1);

    }

    public void act() 
    {
        removeTouching(Monster.class);

        if (this != null) {

            if (getY() <= 5 || getY() >= 795 || getX() <= 5 || getX() >= 695) {
                getWorld().removeObject(this);
            }

            move(13);

            if (timeElapsed % 3 == 0) {

                if (getImage() == fire1) {
                    setImage(fire2);
                } else {
                    setImage(fire1);   
                }
            }

            
            timeElapsed += 1;
        }    
    }
}
