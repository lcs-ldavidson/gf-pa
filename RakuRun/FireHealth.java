import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireHealth extends Actor
{

    GreenfootImage fire1;
    GreenfootImage fire2;
    GreenfootImage fire3;
    GreenfootImage fire4;
    GreenfootImage fire5;

    int transparency;
    int stretch;
    int whichImage;
    int timeElapsed;

    public FireHealth() {
        fire1 = new GreenfootImage("fire1.png");
        fire2 = new GreenfootImage("fire2.png");
        fire3 = new GreenfootImage("fire3.png");
        fire4 = new GreenfootImage("fire4.png");
        fire5 = new GreenfootImage("fire5.png");

        stretch = 520;
        transparency = 0;

    }

    public void act() 
    {

        setLocation((getX()), ((Paluno)getWorld()).blade1.getY());

        stretch = ((((Paluno)getWorld()).raku1.health) * 5) + 1;

        if (((Paluno)getWorld()).blade1.getY() == 760) {
            transparency += 5;
        }

        if (transparency >= 254) {
            transparency = 254;
        }

        if (timeElapsed % 3 == 0) {

            whichImage = Greenfoot.getRandomNumber(5) + 1;

            if (whichImage == 1) {
                setImage(fire1);
            } 

            if (whichImage == 2) {
                setImage(fire2);
            }

            if (whichImage == 3) {
                setImage(fire3);
            }

            if (whichImage == 4) {
                setImage(fire4);
            }

            if (whichImage == 5) {
                setImage(fire5);
            }

        }

        getImage().scale(stretch, 58);
        timeElapsed += 1;
        getImage().setTransparency(transparency);

        if (((Paluno)getWorld()).endTimer > 1) {
            getImage().setTransparency(0);   
        }
    }    
}
