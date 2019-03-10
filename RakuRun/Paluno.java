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
    public Raku raku1 = new Raku();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Paluno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 
        prepare();
        timeElapsed = 19;
        Greenfoot.setSpeed(75);
        setPaintOrder(fireSwirl.class, fireGauge.class, HealthShow.class, GoldShow.class, Interface.class, Cloud.class, 
            Particle.class, Monster.class, Raku.class, Fireball.class, Potion.class, Gold.class, Terrain.class);
    }

    public void act()
    {
        timeElapsed = timeElapsed + 1;
        createTerrain();
        createParticle();
        spawnEnemy();
        createGold();
        createPotion();
        
    }

    void createGold() {
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Gold(), Greenfoot.getRandomNumber(600) + 50, 1);   
        }
    }

    void createPotion() {
        if (Greenfoot.getRandomNumber(500) < 1)
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

    void createTerrain()
    {
        if (timeElapsed % 20 == 0)
        {
            addObject(new Terrain(), 350, 0);
        }
    }

    void createParticle()
    {
        if (timeElapsed % 2 == 0)
        {
            addObject(new Particle(), Greenfoot.getRandomNumber(700), 0);
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
        
        
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        addObject(new Particle(),Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),780);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),786);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),789);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),789);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),789);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),789);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        addObject(new Cloud(),Greenfoot.getRandomNumber(700),799);
        
        addObject(new fireGauge(), 350, 60);
        addObject(new fireSwirl(), 350, 60);
    }

    public int rakuX() {
        return raku1.getX();
    }

    public int rakuY() {
        return raku1.getY();
    }
}
