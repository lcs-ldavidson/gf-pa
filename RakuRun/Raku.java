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
    GreenfootImage swinger;
    int launchTimer;
    boolean canShoot;
    int timeAlive;
    int health;
    int gold;
    int vulnerability;
    int swingTimer;
    boolean canSwing;
    int teleportTimer;
    int kills;
    int leleTimer;
    int vaerminaTimer;
    boolean leleIsActive;
    int leleCoolDown;

    public Raku()
    {
        raku1 = this;
        run1 = new GreenfootImage("raku1.png");
        run2 = new GreenfootImage("raku3.png");
        run3 = new GreenfootImage("raku2.png");
        run4 = new GreenfootImage("raku3.png");
        corpse = new GreenfootImage("deadRaku.png");
        swinger = new GreenfootImage("swordRaku.png");
        timeAlive = 0;
        setImage(run1);
        health = 100;
        gold = 0;
        canShoot = true;
        vulnerability = 255;
        swingTimer = 0;
        canSwing = true;
        teleportTimer = 0;
        kills = 0;
        leleTimer = 50;
        vaerminaTimer = 50;
        leleIsActive = false;
        leleCoolDown = 400;

    }

    public void act() 
    {
        if (getImage() != corpse) {
            
            // detect and take damage when at the edge of the screen
            enteredStorm();
            // move basd on user input
            control();
            // display number of monsters slain
            showKills();
            //die when hit by bolt
            hitByLightning();
            //display amount of gold collected
            showGold();
            // collect a random amount of gold when touching bag
            collectGold(Greenfoot.getRandomNumber(100) + 1);
            //recover a random amount of health when touching bottle
            drinkPotion(Greenfoot.getRandomNumber(12) + 1);
            //launch fireball based on user input
            checkShoot();
            //use ki teleport based on user input
            teleport();
            //swing sword based on user input
            swingManagement();
            // manage fireball stats
            fireballManagement();
            //determine whether or not you can be hit
            vulnerabilityManagement();
            //manage and display current health
            healthManagement();
            //manage and activate lele based on user input
            leleManagement();
            //manage and activate vaermina based on user input
            vaerminaManagement();
            //get hit by skollack's magic
            hitByMagic();
            //move backwards when touching a wind tunnel
            blownBack();

            //get knocked back when hit by a monster
            if (isTouching(Monster.class)) {
                knockBack(getOneIntersectingObject(Monster.class).getX(), getOneIntersectingObject(Monster.class).getY(), 5);
            }
            //get knocked back when hit by a rock
            if (isTouching(Rock.class)) {
                knockBack(getOneIntersectingObject(Rock.class).getX(), getOneIntersectingObject(Rock.class).getY(), 5);
            }
            //get knocked back when hit by a spider
            if (isTouching(Spider.class)) {
                knockBack(getOneIntersectingObject(Spider.class).getX(), getOneIntersectingObject(Spider.class).getY(), 5);
            }
            //get knocked back when hit by a snake
            if (isTouching(Snake.class)) {
                knockBack(getOneIntersectingObject(Snake.class).getX(), getOneIntersectingObject(Snake.class).getY(), 5);
            }

        }
        
        //die when health is 0
        die();
        //increase the amount of time you have been alive
        timeAlive = timeAlive + 1;
    }

    void hitByLightning() {
        //if you are touching a lightning bolt and can be hit
        if (isTouching(Lightning.class) && vulnerability != 30) {
            //change image to corpse
            setImage(corpse);
        }
    }

    void teleport() {
        //check if the ki gauge is full and activate ki ability if space is pressed
        if (teleportTimer >= 510 && Greenfoot.isKeyDown("space")) {
            //add the teleporting effect
            getWorld().addObject(new TeleportEffect(false), getX(), getY());
            //teleport to new location and set short invincibiliity
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(), getY() - 400);
                vulnerability = 0;
            } else if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(), getY() + 400);
                vulnerability = 0;
            } else if (Greenfoot.isKeyDown("left")) {
                setLocation(getX() - 400, getY());
                vulnerability = 0;
            } else if (Greenfoot.isKeyDown("right")) {
                setLocation(getX() + 400, getY());
                vulnerability = 0;
            } else {
                takeDamage(Greenfoot.getRandomNumber(20) + 1, true);
            }
            //add the second teleporting effect
            getWorld().addObject(new TeleportEffect(true), getX(), getY());
            //reset the ki gauge
            teleportTimer = 0;

        }
        //fill the ki gauge
        if (teleportTimer <= 510) {
            teleportTimer += 1;   
        }
    }

    void healthManagement() {
        //can't heal above 100 health
        if (health >= 101) {
            health = 100;
        }
        //make sure health is 0 when dead
        if (getImage() == corpse) {
            health = 0;
        }   
    }

    void checkShoot() {
        //shoot the fireball in desired direction
        if (Greenfoot.isKeyDown("w")) {
            launchFireball("forward");   
        } else if (Greenfoot.isKeyDown("d")) {
            launchFireball("right");   
        } else if (Greenfoot.isKeyDown("a")) {
            launchFireball("left");
        }
    }

    void launchFireball (String shotDirection) {
        //if the fire gauge is full
        if (launchTimer >= 254) {
            //check what direction it is being shot in
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
            //reset fire gauge
            launchTimer = 0;

        }
        //reset
        canShoot = false;
    }

    void drinkPotion(int healthRegained) {
        //if you are touching a potion, heal, remove the potion, and display heal effect
        if (isTouching(Potion.class)) {
            removeTouching(Potion.class);
            health += healthRegained;
            takeDamage(healthRegained, true);
        }
    }

    void collectGold(int amount) {
        //if you are touching a bag of gold, remove the bag, add the gold to total, display amount collected, and increase vaermina's timer
        if (isTouching(Gold.class)) {
            removeTouching(Gold.class);
            gold += amount;
            getWorld().addObject(new GoldShow("" + amount), getX() + 30, getY() - 30);
            if (vaerminaTimer < 255) {
                vaerminaTimer += 5;
            }
        }
    }

    void hitByEnemy()
    {
        //if you are touching a monster, take damage
        if (isTouching(Monster.class))
        {
            takeDamage(Greenfoot.getRandomNumber(20) + 1, false);
        }
    }

    void hitBySnake()
    {
        //if you are touching a snake, take damage
        if (isTouching(Snake.class) && timeAlive % 15 == 0)
        {
            takeDamage(Greenfoot.getRandomNumber(50) + 1, false);
        }
    }

    void hitBySpider()
    {
        //if you are touching a spider, take damage
        if (isTouching(Spider.class))
        {
            takeDamage(Greenfoot.getRandomNumber(6) + 1, false);
        }
    }

    void showKills()
    {
        //display the number of kills you have
        getWorld().showText("Kills: " + kills, 585, 50);
    }

    void showGold()
    {
        //display how much gold you have
        getWorld().showText("Gold: " + gold, 110, 45);
    }

    void swingManagement() {
        //make sure you can't constantly swing
        if (swingTimer <= 50) {
            swingTimer += 1;   
        }
        //turn with the swing
        if (swingTimer <= 9) {
            turn(10);
        }
        //reset
        if (swingTimer == 10) {
            setRotation(0);
            setImage(run1);
        }
    }

    void fireballManagement() {
        //fill the fire gauge
        if (launchTimer <= 255) {
            launchTimer += 1;
        }
        //reset the animation
        if (launchTimer == 15) {
            setImage(run1);
        }
    }

    void vulnerabilityManagement() {
        //if you are vulnerable, get hit by a monster
        if (vulnerability >= 255 && getImage() != swinger) {
            hitByEnemy();
            hitBySnake();
            hitBySpider();
        }
        //increase vulnerability
        if (vulnerability <= 255) {
            vulnerability += 3;
        }
        //make sure vulnerability caps at 255
        if (vulnerability >= 256) {
            vulnerability = 255;
        }   
        //set the transparency to vulnerability
        getImage().setTransparency(vulnerability);
    }

    void leleManagement() {
        //activate lele if LeleTimer is full
        if (leleTimer == 255 && Greenfoot.isKeyDown("q")) {
            activateLele();
        }
        //if Lele is active, decrease the time and make you invulnerable
        if (leleIsActive == true) {
            vulnerability = 30;
            leleCoolDown -= 1;
        }
        //end Lele's activity
        if (leleCoolDown == 0) {
            leleCoolDown = 400;
            leleIsActive = false;
        }   
    }

    void vaerminaManagement() {
        //activate Vaermina
        if (vaerminaTimer == 255 && Greenfoot.isKeyDown("e")) {
            activeVaermina();
        }   
    }

    void enteredStorm()
    {
        // if you are out of bounds, take damage
        if ((getX() <= 10 || getX() >= 690 || getY() >= 740 || getY() <= 70) && timeAlive % 15 == 0) 
        {
            takeDamage(Greenfoot.getRandomNumber(6) + 1, false);
        }
    }

    void hitByMagic() {
        //if you are hit by magic and are vulnerable, take damage
        if (isTouching(Magic.class) && vulnerability >= 200) {
            takeDamage(Greenfoot.getRandomNumber(4) + 1, false);
            if (vulnerability > 200) {
                vulnerability -= 20;
            }
        }
    }

    public void takeDamage (int amount, boolean heal)
    {
        //if you aren't dead and you haven't won, take damage or heal, display health lost/gained, set vulnerability
        if (getImage() != corpse && ((Paluno)getWorld()).haveWon == false) {

            if (heal == false) 
            {
                health = health - amount;
                getWorld().addObject(new hit(), getX(), getY());
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
    }

    void control()
    {
        //control the movement up, down, left, and right
        if (Greenfoot.isKeyDown("up")) 
        {

            if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left"))
            {
                setLocation(getX(), getY()-2);
            } else
            {
                setLocation(getX(), getY()-3);   
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
            if (getImage() != swinger) {
                setRotation(20);
            }
        }

        else if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - 6, getY());
            if (getImage() != swinger) {
                setRotation(-20);
            }
        }   

        else
        {

            if (getImage() != swinger) {
                setRotation(0);
            }
        }

        if (Greenfoot.isKeyDown("s")) {
            swingSword();
        }

    }

    void animate(int runSpeed)
    {
        //animate the run cycle with the desired speed
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
        //die if health is 0
        if (health <= 0)
        {
            setImage(corpse);
        }   
        //move back with terrain
        if (getImage() == corpse) {
            setLocation(getX(), getY() + 5);
            health = 0;

        }
    }

    public int currentLaunchTimer() {
        //unnecessary
        return launchTimer;
    }

    public int currentTP() {
        //unnecessary
        return teleportTimer;
    }

    void swingSword() {
        //if you can swing, swing
        if (swingTimer >= 50) {

            setImage(swinger);
            setRotation(-45);

            canSwing = false;
            swingTimer = 0;
        }
    }

    void activateLele() {
        getWorld().addObject(new Lele(), getX(), 799);
        leleIsActive = true;
        leleTimer = 0;
        kills -= 30;
    }

    void activeVaermina() {
        //heal and spawn the t-rex
        vaerminaTimer = 0;
        takeDamage(25, true);
        getWorld().addObject(new Rex(), getX(), 800);
        //drain the gold
        gold -= 1000;
    }

    void knockBack(int x, int y, int severity) {
        //turn towards the source and move back to simulate collision
        if (getImage() != swinger) {
            turnTowards(x, y);
            move(-severity);
            setRotation(0);
        }
    }
    
    void blownBack() {
        //move back in the wind tunnels
        if (isTouching(windBlast.class)) {
            setLocation(getX(), getY() + 4);
        }
    }

}