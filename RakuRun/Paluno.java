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
        setPaintOrder(Interface.class, Particle.class, Raku.class, Terrain.class);
    }
    
    
    public void act()
    {
        timeElapsed = timeElapsed + 1;
        createTerrain();
    }
    
    void createTerrain()
    {
        if (timeElapsed % 20 == 0)
        {
            addObject(new Terrain(), 350, 0);
        }
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
        addObject(raku,348,703);

        Particle particle = new Particle();
        addObject(particle,146,170);

        Particle particle2 = new Particle();
        addObject(particle2,577,243);

        Particle particle3 = new Particle();
        addObject(particle3,459,190);

        Particle particle4 = new Particle();
        addObject(particle4,251,302);

        Particle particle5 = new Particle();
        addObject(particle5,336,241);

        Particle particle6 = new Particle();
        addObject(particle6,546,430);

        Particle particle7 = new Particle();
        addObject(particle7,460,321);

        Particle particle8 = new Particle();
        addObject(particle8,299,189);

        Particle particle9 = new Particle();
        addObject(particle9,200,227);

        Particle particle10 = new Particle();
        addObject(particle10,228,169);

        Particle particle11 = new Particle();
        addObject(particle11,189,160);

        Particle particle12 = new Particle();
        addObject(particle12,156,213);

        Particle particle13 = new Particle();
        addObject(particle13,135,236);

        Particle particle14 = new Particle();
        addObject(particle14,181,269);

        Particle particle15 = new Particle();
        addObject(particle15,132,343);

        Particle particle16 = new Particle();
        addObject(particle16,237,465);

        Particle particle17 = new Particle();
        addObject(particle17,214,416);

        Particle particle18 = new Particle();
        addObject(particle18,212,353);

        Particle particle19 = new Particle();
        addObject(particle19,380,353);

        Particle particle20 = new Particle();
        addObject(particle20,324,286);

        Particle particle21 = new Particle();
        addObject(particle21,317,426);

        Particle particle22 = new Particle();
        addObject(particle22,301,360);

        Particle particle23 = new Particle();
        addObject(particle23,140,459);

        Particle particle24 = new Particle();
        addObject(particle24,183,532);

        Particle particle25 = new Particle();
        addObject(particle25,131,583);

        Particle particle26 = new Particle();
        addObject(particle26,183,626);

        Particle particle27 = new Particle();
        addObject(particle27,351,574);

        Particle particle28 = new Particle();
        addObject(particle28,558,634);

        Particle particle29 = new Particle();
        addObject(particle29,635,533);

        Particle particle30 = new Particle();
        addObject(particle30,508,477);

        Particle particle31 = new Particle();
        addObject(particle31,415,477);

        Particle particle32 = new Particle();
        addObject(particle32,479,401);

        Particle particle33 = new Particle();
        addObject(particle33,404,267);

        Particle particle34 = new Particle();
        addObject(particle34,382,196);

        Particle particle35 = new Particle();
        addObject(particle35,544,190);

        Particle particle36 = new Particle();
        addObject(particle36,590,330);

        Particle particle37 = new Particle();
        addObject(particle37,553,356);

        Particle particle38 = new Particle();
        addObject(particle38,307,500);

        Particle particle39 = new Particle();
        addObject(particle39,266,583);

        Particle particle40 = new Particle();
        addObject(particle40,279,730);

        Particle particle41 = new Particle();
        addObject(particle41,266,662);

        Particle particle42 = new Particle();
        addObject(particle42,154,719);

        Particle particle43 = new Particle();
        addObject(particle43,123,680);

        Particle particle44 = new Particle();
        addObject(particle44,357,710);

        Particle particle45 = new Particle();
        addObject(particle45,441,578);

        Particle particle46 = new Particle();
        addObject(particle46,550,722);
    }
}
