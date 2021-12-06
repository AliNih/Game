import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{   
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int Notdestroyed = 50;
    public static int Destroyed = Notdestroyed;
    public void rotateMouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        turnTowards(mouse.getX(), mouse.getY());
    }
    public void act()
    {
        move(9);
        boolean hitDamage = false;
        //Destroyed--;
        if(getOneIntersectingObject(w.class) != null)
        {
            List<w> wenemy = getIntersectingObjects(w.class);
            w we = wenemy.get(0);
            we.damageW();
            getWorld().removeObject(this);
            hitDamage = true;
        }
        if(getOneIntersectingObject(x.class) != null)
        {
            List<x> xenemy = getIntersectingObjects(x.class);
            x xe = xenemy.get(0);
            xe.damageX();
            getWorld().removeObject(this);
            hitDamage = true;
        }
    
        if intersect wall getWorld().removeObject(this);

        if(Destroyed <= 0 || hitDamage)
        {
            if(this.getWorld() != null)
            {
                getWorld().removeObject(this);
            }            
        }
    }
}