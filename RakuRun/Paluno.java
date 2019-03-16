import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paluno extends World
{

    int timeElapsed;
    int gaugeY;
    int endTimer;
    public Raku raku1 = new Raku();
    int difficulty;
    public Blade blade1 = new Blade();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Paluno()
    {    
        // Create a new world with 700x800 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 
        prepare();
        timeElapsed = 19;
        Greenfoot.setSpeed(50);
        difficulty = 0;
        endTimer = 0;

        setPaintOrder(RakuRun.class,  OpenerImage.class, skollackOpener.class, FinalScore.class, FinalKills.class, FinalGold.class, FireHealth.class, 
            Blade.class, Eyes.class, endSkollack.class, EndCloud.class, startCloud.class, kiFlare.class, readyFlare.class, kiSwirl.class, 
            fireSwirl.class, KiGauge.class, fireGauge.class, HealthDisplay.class, HealthShow.class, GoldShow.class, Lightning.class, Interface.class, 
            AtmosphereClouds.class, Cloud.class, Particle.class, Snake.class, Spider.class, Monster.class, TeleportEffect.class, Raku.class, 
            Fireball.class, Potion.class, Gold.class, Terrain.class);
    }

    public void act()
    {

        createTerrain();
        timeElapsed = timeElapsed + 1;
        createParticle();
        spawnEnemy();
        createGold();
        createPotion();
        createCloud();

        if (difficulty >= 1) {
            spawnSpider();
        }
        if (difficulty >= 2){
            spawnSnake();
        }
        if (difficulty >= 3) {
            spawnLightning();
        }
        
        if (raku1.getImage() == raku1.corpse && timeElapsed % 4 == 0 && endTimer < 250) {
            addObject(new EndCloud(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        }

        if (timeElapsed % 600 == 0) {
            difficulty += 1;
        }

        if (raku1.getImage() == raku1.corpse) {
            endTimer += 1;
        }

        if (endTimer == 50) {
            addObject(new FinalGold(), 350, 110);
        }

        if (endTimer == 75) {
            addObject(new FinalKills(), 350, 210);
        }

        if (endTimer == 80) {
            addObject(new FinalScore(), 350, 750);
        }
        
        if (endTimer == 75) {
            addObject(new endSkollack(), 350, 799);
        }
        
        if (endTimer == 130) {
            addObject(new Eyes(), 350, 625);
        }

    }

    void createGold() {
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Gold(), Greenfoot.getRandomNumber(600) + 50, 1);   
        }
    }

    void createPotion() {
        if (Greenfoot.getRandomNumber(700) < 1)
        {
            addObject(new Potion(), Greenfoot.getRandomNumber(700), 1);   
        }
    }

    void spawnEnemy()
    {
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Monster(), Greenfoot.getRandomNumber(700), 1);   
        }
    }

    void spawnLightning()
    {
        if (Greenfoot.getRandomNumber(800) < 4)
        {
            addObject(new Lightning(), 1, 1);   
        }
    }

    void spawnSpider()
    {
        if (Greenfoot.getRandomNumber(600) < 4)
        {
            addObject(new Spider(), Greenfoot.getRandomNumber(700), 1);   
        }
    }

    void spawnSnake()
    {
        if (Greenfoot.getRandomNumber(600) < 3)
        {
            addObject(new Snake(), Greenfoot.getRandomNumber(700), 1);   
        }
    }

    void createTerrain()
    {
        if (timeElapsed % 20 == 0)
        {
            addObject(new Terrain(), 350, 0);
        }
    }

    void createParticle()
    {
        if (timeElapsed % 3 == 0)
        {
            addObject(new Particle(), Greenfoot.getRandomNumber(700), 0);
        }
    }

    void createCloud()
    {
        if (timeElapsed % 5 == 0)
        {
            addObject(new AtmosphereClouds(), Greenfoot.getRandomNumber(700), 0);
        }
    }

    public int getTimeElapsed()
    {
        return timeElapsed; 
    }

    private void prepare()
    {
        Terrain terrain = new Terrain();
        addObject(terrain,350,50);
        Terrain terrain2 = new Terrain();
        addObject(terrain2,350,155);
        Terrain terrain3 = new Terrain();
        addObject(terrain3,349,260);
        Terrain terrain4 = new Terrain();
        addObject(terrain4,349,365);
        Terrain terrain5 = new Terrain();
        addObject(terrain5,349,470);
        Terrain terrain6 = new Terrain();
        addObject(terrain6,350,575);
        Terrain terrain7 = new Terrain();
        addObject(terrain7,348,680);
        Terrain terrain8 = new Terrain();
        addObject(terrain8,346,785);
        Interface Interface1 = new Interface();
        addObject(Interface1,350,450);

        addObject(raku1,350,650);

        addObject(new RakuRun(), 350, 170);
        
        addObject(new OpenerImage(), 490, 580);

        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new startCloud(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));

        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700), 800);

        addObject(blade1, 350, 270);

        addObject(new FireHealth(), 300, 270);

        addObject(new HealthDisplay(), 350, 720);
        
        addObject(new skollackOpener(), 199, 633);

        gaugeY = 710;
        addObject(new KiGauge(), 90, gaugeY);
        addObject(new kiSwirl(), 90, gaugeY);
        addObject(new kiFlare(), 90, gaugeY + 10);

        addObject(new fireGauge(), 610, gaugeY);
        addObject(new fireSwirl(), 610, gaugeY);
        addObject(new readyFlare(), 610, gaugeY + 10);
    }

    public int rakuX() {
        return raku1.getX();
    }

    public int rakuY() {
        return raku1.getY();
    }

}
