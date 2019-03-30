import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lightning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lightning extends Threats
{int timeElapsed;
    int rightOrLeftOrUp;
    GreenfootImage image1;
    GreenfootImage image2;

    public Lightning() {
        rightOrLeftOrUp = Greenfoot.getRandomNumber(3) + 1;
        image1 = new GreenfootImage("lightning1.png");
        image2 = new GreenfootImage("lightning2.png");

        setImage(image1);

        timeElapsed = 0;

    }

    public void act() 
    {

        if (timeElapsed < 1) {

            if (rightOrLeftOrUp == 1) {
                setLocation(1, Greenfoot.getRandomNumber(600));
            } else if (rightOrLeftOrUp == 2) {
                setLocation(699, Greenfoot.getRandomNumber(600));
            } else if (rightOrLeftOrUp == 3) {
                setLocation(Greenfoot.getRandomNumber(699), 1);
            }
            turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
        }

        if (timeElapsed >= 120) {
            move(30);
        }

        if (timeElapsed % 3 == 0) {

            if (getImage() == image1) {
                setImage(image2);
            } else {
                setImage(image1);
            }
            
            getImage().scale(185 + Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(40) + 30);
        }
        timeElapsed += 1;
        if (isAtEdge()) {
            getWorld().removeObject(this);   
        }

    }    
}
