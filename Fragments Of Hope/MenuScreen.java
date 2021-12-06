import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class MenuScreen extends World
{
    private GreenfootSound Menu1;
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 550, 1); 
        Menu1 = new GreenfootSound("Fly.wav");
        setBackground(new GreenfootImage("Background-0.png"));
        prepare();
    }

    public void started()
    {
        Menu1.playLoop(); 
    }

    public void stopped()
    {
        Menu1.stop(); 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,411,355);
        startButton.setLocation(465,366);
        startButton.setLocation(469,370);
        startButton.setLocation(478,370);
        startButton.setLocation(446,376);
        startButton.setLocation(486,381);
        startButton.setLocation(447,387);
        startButton.setLocation(463,384);
        startButton.setLocation(480,397);
        startButton.setLocation(448,371);
        startButton.setLocation(433,349);
        startButton.setLocation(106,355);
        startButton.setLocation(115,332);
        startButton.setLocation(185,363);
        startButton.setLocation(195,339);
        startButton.setLocation(172,355);
        startButton.setLocation(91,327);
        startButton.setLocation(139,345);
        Title title = new Title();
        addObject(title,551,89);
        startButton.setLocation(183,398);
        startButton.setLocation(197,404);
        startButton.setLocation(40,374);
        startButton.setLocation(126,383);
        startButton.setLocation(178,363);
        startButton.setLocation(157,368);
    }
}
