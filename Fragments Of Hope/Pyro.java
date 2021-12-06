import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pyro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pyro extends Actor
{
    protected static int fullHealthPyro = 10;
    protected int health = fullHealthPyro;   
    public void act()
    {
        
        if(isTouching(y.class))
        {
            damagePyroY();
        }
        if(isTouching(W.class))
        {
            damagePyroW();
        }
        if(isTouching(x.class))
        {
            damagePyroX();
        }
        if(isTouching(z.class))
        {
            damagePyroZ();
        }
        if (health <= 0)
        {
        getWorld().removeObject(this);
        }
        if(Greenfoot.isKeyDown("right")) move(5);
        turn(90);
        if(Greenfoot.isKeyDown("down")) move(5);
        turn(90);
        if(Greenfoot.isKeyDown("left")) move(5);
        turn(90);
        if(Greenfoot.isKeyDown("up")) move(5);
        turn(90);
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo() != null)
        {
            Weapon weapon = new Weapon();
            getWorld().addObject(weapon, getX(), getY());
            weapon.rotateMouse();
        }
        
    }
    public void damagePyroY()
    {
        health--;
        health--;
        health--;
        health--;
        health--;
    }
    public void damagePyroW()
    {
        health--;
    }
    public void damagePyroX()
    {
        health--;
        health--;
        health--;
    }
    public void damagePyroZ()
    {
        health--;
        health--;
    }
}
