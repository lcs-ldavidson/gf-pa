import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raku extends Actor
{

    public Raku raku1;
    
    GreenfootImage run1;
    GreenfootImage run2;
    GreenfootImage run3;
    GreenfootImage run4;
    GreenfootImage corpse;
    int launchTimer;
    boolean canShoot;
    int timeAlive;
    int health;
    int gold;
    int vulnerability;

    public Raku()
    {
        raku1 = this;
        run1 = new GreenfootImage("raku1.png");
        run2 = new GreenfootImage("raku3.png");
        run3 = new GreenfootImage("raku2.png");
        run4 = new GreenfootImage("raku3.png");
        corpse = new GreenfootImage("deadRaku.png");
        timeAlive = 0;
        setImage(run1);
        health = 100;
        gold = 0;
        canShoot = true;
        vulnerability = 255;

    }

    public void act() 
    {
        if (getImage() != corpse) {

            enteredStorm();
            control();
            showHealth();
            timeAlive = timeAlive + 1;
            if (vulnerability >= 255) {
                hitByEnemy();
            }
            showGold();
            collectGold(Greenfoot.getRandomNumber(100) + 1);
            drinkPotion(Greenfoot.getRandomNumber(12) + 1);
            checkShoot();

            if (launchTimer <= 255) {
                launchTimer += 1;
            }

            if (launchTimer == 15) {
                setImage(run1);
            }
        }

        if (vulnerability <= 255) {
            vulnerability += 3;
        }

        if (vulnerability >= 256) {
            vulnerability = 255;
        }

        getImage().setTransparency(vulnerability);

        die();

        if (health >= 101) {
            health = 100;
        }

    }

    void checkShoot() {
        if (Greenfoot.isKeyDown("w")) {
            launchFireball("forward");   
        } else if (Greenfoot.isKeyDown("d")) {
            launchFireball("right");   
        } else if (Greenfoot.isKeyDown("a")) {
            launchFireball("left");
        }
    }

    void launchFireball (String shotDirection) {
        if (launchTimer >= 254) {

            if (shotDirection == "forward") {
                setImage("launchForward.png");
                getWorld().addObject(new Fireball(getRotation() - 90), getX() + 20, getY() - 50);
            } else if (shotDirection == "right") {
                setImage("launchRight.png");
                getWorld().addObject(new Fireball(getRotation()), getX() + 50, getY());
            } else if (shotDirection == "left") {
                setImage("launchLeft.png");
                getWorld().addObject(new Fireball(getRotation() - 180), getX() - 50, getY());
            }

            launchTimer = 0;

        }

        canShoot = false;
    }

    void drinkPotion(int healthRegained) {
        if (isTouching(Potion.class)) {
            removeTouching(Potion.class);
            health += healthRegained;
            takeDamage(healthRegained, true);
        }
    }

    void collectGold(int amount) {
        if (isTouching(Gold.class)) {
            removeTouching(Gold.class);
            gold += amount;
            getWorld().addObject(new GoldShow("" + amount), getX() + 30, getY() - 30);
        }
    }

    void hitByEnemy()
    {
        if (isTouching(Monster.class) && timeAlive % 15 == 0)
        {
            takeDamage(Greenfoot.getRandomNumber(20) + 1, false);
        }
    }

    void showHealth()
    {
        getWorld().showText("HP: " + health + "/100", 585, 50);
    }

    void showGold()
    {
        getWorld().showText("Gold: " + gold, 110, 45);
    }

    void enteredStorm()
    {
        if ((getX() <= 10 || getX() >= 690 || getY() >= 740 || getY() <= 70) && timeAlive % 15 == 0) 
        {
            takeDamage(Greenfoot.getRandomNumber(6) + 1, false);
        }
    }

    public void takeDamage (int amount, boolean heal)
    {

        if (heal == false) 
        {
            health = health - amount;
        } else
        {
            health = health + amount;
        }
        String damage  = "-" + amount;
        getWorld().addObject(new HealthShow("" + amount, heal), getX() + 30, getY() - 30);

        if (heal == false) {
            vulnerability = 100;
        }
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
            setLocation(getX() + 6, getY());
            setRotation(20);
        }

        else if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - 6, getY());
            setRotation(-20);
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

    void die() {
        
        
        
        if (health <= 0)
        {
            setImage(corpse);
        }   

        if (getImage() == corpse) {
            setLocation(getX(), getY() + 5);
            health = 0;
            if (isAtEdge()) {
                getWorld().removeObject(this);   

            }
        }
    }
    
    public int getRakuX() {
       return getX(); 
    }
    
    public int getRakuY() {
       return getY(); 
    }
}