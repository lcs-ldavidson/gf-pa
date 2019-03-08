import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paluno extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Paluno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Terrain terrain = new Terrain();
        addObject(terrain,350,50);
        Terrain terrain2 = new Terrain();
        addObject(terrain2,350,130);
        Terrain terrain3 = new Terrain();
        addObject(terrain3,350,210);
        Terrain terrain4 = new Terrain();
        addObject(terrain4,350,315);
        Terrain terrain5 = new Terrain();
        addObject(terrain5,350,420);
        Terrain terrain6 = new Terrain();
        addObject(terrain6,350,525);
        Terrain terrain7 = new Terrain();
        addObject(terrain7,350,630);
        Terrain terrain8 = new Terrain();
        addObject(terrain8,350,735);
        Terrain terrain9 = new Terrain();
        addObject(terrain9,350,800);

    }
}
