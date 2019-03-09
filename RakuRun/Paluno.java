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
        setPaintOrder(HealthShow.class, Interface.class, Cloud.class, Particle.class, Monster.class, Raku.class, Potion.class, 
        Gold.class, Terrain.class);
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
         addObject(new Gold(), Greenfoot.getRandomNumber(700), 1);   
        }
    }
    
    void createPotion() {
        if (Greenfoot.getRandomNumber(200) < 1)
        {
         addObject(new Potion(), Greenfoot.getRandomNumber(700), 1);   
        }
    }
    
    void spawnEnemy()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
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
        Raku raku = new Raku();
        addObject(raku,350,650);
        Particle particle = new Particle();
        addObject(particle,146,170);
        Particle particle3 = new Particle();
        addObject(particle3,459,190);
        Particle particle5 = new Particle();
        addObject(particle5,336,241);
        Particle particle7 = new Particle();
        addObject(particle7,460,321);
        Particle particle9 = new Particle();
        addObject(particle9,200,227);
        Particle particle11 = new Particle();
        addObject(particle11,189,160);
        Particle particle13 = new Particle();
        addObject(particle13,135,236);
        Particle particle15 = new Particle();
        addObject(particle15,132,343);
        Particle particle17 = new Particle();
        addObject(particle17,214,416);
        Particle particle19 = new Particle();
        addObject(particle19,380,353);
        Particle particle21 = new Particle();
        addObject(particle21,317,426);
        Particle particle23 = new Particle();
        addObject(particle23,140,459);
        Particle particle25 = new Particle();
        addObject(particle25,131,583);
        Particle particle27 = new Particle();
        addObject(particle27,351,574);
        Particle particle29 = new Particle();
        addObject(particle29,635,533);
        Particle particle31 = new Particle();
        addObject(particle31,415,477);
        Particle particle33 = new Particle();
        addObject(particle33,404,267);
        Particle particle35 = new Particle();
        addObject(particle35,544,190);
        Particle particle37 = new Particle();
        addObject(particle37,553,356);
        Particle particle39 = new Particle();
        addObject(particle39,266,583);
        Particle particle41 = new Particle();
        addObject(particle41,266,662);
        Particle particle43 = new Particle();
        addObject(particle43,123,680);
        Particle particle45 = new Particle();
        addObject(particle45,441,578);
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
        
       
    }
}
