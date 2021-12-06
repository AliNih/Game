import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    GreenfootImage image = new GreenfootImage("StartButtonHighlighted.png");
    GreenfootImage image2 = new GreenfootImage("StartButton.png");
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this))
        {
            setImage(image);
        }
        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage(image2);
        }
        if (Greenfoot.mouseClicked(this))
        {
            
        }
    }
}
