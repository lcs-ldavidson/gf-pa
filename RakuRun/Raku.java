import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raku extends Actor
{

    GreenfootImage run1;
    GreenfootImage run2;
    GreenfootImage run3;
    GreenfootImage run4;
    int timeAlive;
    int health;

    public Raku()
    {
        run1 = new GreenfootImage("raku1.PNG");
        run2 = new GreenfootImage("raku3.PNG");
        run3 = new GreenfootImage("raku2.PNG");
        run4 = new GreenfootImage("raku3.PNG");
        timeAlive = 0;
        setImage(run1);
        health = 100;
    }

    public void act() 
    {
        enteredStorm();
        control();
        showHealth();
        timeAlive = timeAlive + 1;
    } 

    void showHealth()
    {
        getWorld().showText("HP: " + health + "/100", 585, 50);
    }

    void enteredStorm()
    {
        if ((getX() <= 10 || getX() >= 690 || getY() >= 760 || getY() <= 20) && timeAlive % 3 == 0) 
        {
            takeDamage(1);
        }
    }

    public void takeDamage (int amount)
    {
        health = health - amount;
        String damage  = "-" + amount;
        getWorld().addObject(new HealthShow("" + amount), getX() + 30, getY() - 30);
        
    }

    void control()
    {
        if (Greenfoot.isKeyDown("up")) 
        {

            if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left"))
            {
                setLocation(getX(), getY()-2);
            } else
            {
                setLocation(getX(), getY()-4);   
            }

            animate(2);
        }

        else if (Greenfoot.isKeyDown("down")) 
        {
            if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left"))
            {
                setLocation(getX(), getY()+2);
            } else
            {
                setLocation(getX(), getY()+4);   
            }

            animate(7);
        } else 
        {
            animate(4);
        }

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() + 4, getY());
            setRotation(30);
        }

        else if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - 4, getY());
            setRotation(-30);
        }   

        else
        {
            setRotation(0);
        }

    }

    void animate(int runSpeed)
    {
        if (timeAlive % runSpeed == 0)
        {

            if (getImage() == run1)
            {
                setImage(run2);
            }

            else if (getImage() == run2)
            {
                setImage(run3);
            }

            else if (getImage() == run3)
            {
                setImage(run4);
            }

            else if (getImage() == run4)
            {
                setImage(run1);
            }

        }

    }
}