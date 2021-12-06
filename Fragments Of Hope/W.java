import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W extends Enemies
{
    /**
     * Act - do whatever the W wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected static int FullHealthW = 3;
    protected int healthW = FullHealthW;
    protected int walkOneDirection;
    protected int chosenDirection = 0;
    W wah;
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 30)
            {
                randomMovement();
            }
        if (healthW <= 0)
        {
        getWorld().removeObject(this);
        }
        if(isTouching(Pyro.class))
        {
            
            getWorld().addObject(w, Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(1000));
        }
    }
       
    public void damageW()
    {
        healthW--;
    } 
    public void randomMovement()
    {   
        
        if(chosenDirection == 0)
        {
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(3);
                chosenDirection = 1;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(-6);
                chosenDirection = 2;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(4);
                chosenDirection = 3;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(4);
                chosenDirection = 4;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
        }
        else
        {
            if(chosenDirection == 1 && walkOneDirection > 0)
            {
                move(3);
                turn(-4);
                walkOneDirection--;
            }
            if(chosenDirection == 2 && walkOneDirection > 0)
            {
                move(3);
                turn(1);
                walkOneDirection--;
            }
            if(chosenDirection == 3 && walkOneDirection > 0)
            {
                move(3);
                turn(-5);
                walkOneDirection--;
            }
            if(chosenDirection == 4 && walkOneDirection > 0)
            {
                move(3);
                turn(0);
                walkOneDirection--;
            }
            if(walkOneDirection == 0)
            {
                chosenDirection = 0;
            }
        } 
    }
}