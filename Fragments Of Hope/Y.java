import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Y here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Y extends Enemies
{
    protected int chosenDirection = 0;
    protected int walkOneDirection;
    protected static int FullHealthY = 20;
    protected int healthY = FullHealthY;
    public void damageY()
    {
        healthY--;
    } 

    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 35)
            {
                movementX();
            }
    }
    public void movementX()
    {   
        
        if(chosenDirection == 0)
        {
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(2);
                turn(2);
                chosenDirection = 1;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(2);
                turn(-2);
                chosenDirection = 2;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(2);
                turn(1);
                chosenDirection = 3;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(2);
                turn(-1);
                chosenDirection = 4;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
        }
        else
        {
            if(chosenDirection == 1 && walkOneDirection > 0)
            {
                move(2);
                turn(1);
                walkOneDirection--;
            }
            if(chosenDirection == 2 && walkOneDirection > 0)
            {
                move(2);
                turn(2);
                walkOneDirection--;
            }
            if(chosenDirection == 3 && walkOneDirection > 0)
            {
                move(2);
                turn(1);
                walkOneDirection--;
            }
            if(chosenDirection == 4 && walkOneDirection > 0)
            {
                move(2);
                turn(-1);
                walkOneDirection--;
            }
            if(walkOneDirection == 0)
            {
                chosenDirection = 0;
            }
        } 
    }
}
