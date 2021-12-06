import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Z extends Enemies
{
    /**
     * Act - do whatever the z wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int walkOneDirection;
    protected int chosenDirection = 0;
    protected static int FullHealthZ = 15;
    protected int healthZ = FullHealthZ;
    public void damageZ()
    {
        healthZ--;
    } 
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 20)
            {
                movementZ();
            }
    }
    public void movementZ()
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
                turn(-3);
                chosenDirection = 2;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(3);
                chosenDirection = 3;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(3);
                turn(-3);
                chosenDirection = 4;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
        }
        else
        {
            if(chosenDirection == 1 && walkOneDirection > 0)
            {
                move(3);
                turn(-3);
                walkOneDirection--;
            }
            if(chosenDirection == 2 && walkOneDirection > 0)
            {
                move(3);
                turn(3);
                walkOneDirection--;
            }
            if(chosenDirection == 3 && walkOneDirection > 0)
            {
                move(3);
                turn(-3);
                walkOneDirection--;
            }
            if(chosenDirection == 4 && walkOneDirection > 0)
            {
                move(3);
                turn(3);
                walkOneDirection--;
            }
            if(walkOneDirection == 0)
            {
                chosenDirection = 0;
            }
        } 
    }
}
