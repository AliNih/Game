import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class X here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class X extends Enemies
{
    /**
     * Act - do whatever the x wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected static int FullHealthX = 8;
    protected int healthX = FullHealthX;
    protected int walkOneDirection;
    protected int chosenDirection = 0;
    pumpLaser laser;

    
    boolean PyroClosePump = false; 
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 15)
            {
                MovementX();
            }    
        //code related to his gun (shoots every 9sec)
        long lastOne = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();
        /*if (currentTime >= lastOne + 9000)
        {
            checkIfPyroClose(); 
            lastOne = currentTime;
        }
        if (PyroClosePump = true)
        {
            getWorld().addObject(laser, x.getX(), x.getY());
            turnTowards(pyro.getX(), pyro.getY());
            List<pumpLaser> laserGun = getIntersectingObjects(pumpLaser.class);
            pumpLaser laser = laserGun.get(0);
            laser.shoot();
        }*/
    }
    public void damageX()
    {
        healthX--;        
    }
    public void MovementX()
    {   
        
        if(chosenDirection == 0)
        {
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(-4);
                turn(4);
                chosenDirection = 1;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(6);
                turn(5);
                chosenDirection = 2;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(-4);
                turn(0);
                chosenDirection = 3;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
            if(Greenfoot.getRandomNumber(100) < 20)
            {
                move(5);
                turn(4);
                chosenDirection = 4;
                walkOneDirection = Greenfoot.getRandomNumber(20) + 30;
            }
        }
        else
        {
            if(chosenDirection == 1 && walkOneDirection > 0)
            {
                move(-8);
                turn(90);
                walkOneDirection--;
            }
            if(chosenDirection == 2 && walkOneDirection > 0)
            {
                move(5);
                turn(5);
                walkOneDirection--;
            }
            if(chosenDirection == 3 && walkOneDirection > 0)
            {
                move(-10);
                turn(4);
                walkOneDirection--;
            }
            if(chosenDirection == 4 && walkOneDirection > 0)
            {
                move(8);
                turn(5);
                walkOneDirection--;
            }
            if(walkOneDirection == 0)
            {
                chosenDirection = 0;
            }
        } 
    }
    public void checkIfPyroClose()
    {
        List<Pyro> pyro = getObjectsInRange(75, Pyro.class);
        if(pyro.isEmpty())
        {
            PyroClosePump = false;
        }
        else
        {
            PyroClosePump = true; 
        }
        
    }
    

}