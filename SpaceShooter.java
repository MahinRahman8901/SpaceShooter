import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShooter extends World
{
    private Counter counter = new Counter();
    /**
     * Constructor for objects of class SpaceShooter.
     * 
     */
    public SpaceShooter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,66,387);
        rocket.setLocation(49,375);
        Rock rock = new Rock();
        addObject(rock,82,38);
        Rock rock2 = new Rock();
        addObject(rock2,164,47);
        Rock rock3 = new Rock();
        addObject(rock3,546,128);
        Rock rock4 = new Rock();
        addObject(rock4,357,95);
        Rock rock5 = new Rock();
        addObject(rock5,463,34);
        Rock rock6 = new Rock();
        addObject(rock6,260,104);
        Rock rock7 = new Rock();
        addObject(rock7,42,107);
        Rock rock8 = new Rock();
        addObject(rock8,464,104);
        Rock rock9 = new Rock();
        addObject(rock9,317,32);
        Rock rock10 = new Rock();
        addObject(rock10,148,122);
        
        addObject(counter,31,30);
    }
    public Counter getCounter()
    {
        return counter;
    }
}
