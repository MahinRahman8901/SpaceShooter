import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Shot extends Actor
{
    public boolean alive;
    public Shot()
    {
        alive = true;
    }
    public void act()
    {
        // Add your action code here.
        moving();
        colliding();
        checkAtScreenEdge();
        if (!alive)
        {
            getWorld().removeObject(this);
        }
    }
    public void moving()
    {
        setLocation(getX(), getY() - 5);
    }
    public void checkAtScreenEdge()
    {
        if (isAtEdge())
        {
            alive = false;
        }
    }
    public void colliding()
    {
        if (isTouching(Rock.class))
        {
            removeTouching(Rock.class);
            alive = false;
            SpaceShooter spaceWorld = (SpaceShooter) getWorld();
            Counter counter = spaceWorld.getCounter();
            counter.increaseCounter(5);
        }
    }
}
