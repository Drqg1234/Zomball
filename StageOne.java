import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageOne extends Stage
{

    /**
     * Constructor for objects of class StageOne.
     * 
     */
    public StageOne(){
        super();
        XpBar xp_bar = new XpBar();
        addObject(xp_bar, this.getWidth() / 2, this.getHeight() - 20);
        HealthBar health_bar = new HealthBar();
        addObject(health_bar, this.getWidth() / 2, this.getHeight()/2 - 30);
        addObject(new Player(xp_bar, health_bar), this.getWidth() / 2, this.getHeight() / 2);
        addObject(new EnemySpawner(), 0, 0);
        addObject(new PowerupSpawner(), 0, 0);
        
        setPaintOrder(UI.class, NPC.class);
        
        for(int i = 0; i < 10; i++) {
            int x = Greenfoot.getRandomNumber(this.getWidth());
            int y = Greenfoot.getRandomNumber(this.getHeight());
            addObject(new Zombie(), x, y);
        }
    }
}
