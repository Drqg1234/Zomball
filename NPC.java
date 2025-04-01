import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class NPC extends Actor
{
    public NPC() {
        super();
    }
    
    public void touchedPlayer(Player player)
    {
        return;
    }
    
    public static void spawnInWorld(Stage stage) {
        return;
    }
    
    public static int[] getRandomCoords(Stage stage) {     
        int[] coords = {Greenfoot.getRandomNumber(stage.getWidth()), Greenfoot.getRandomNumber(stage.getHeight())};
        
        return coords;
    }
    
    public void die() {
        return;
    }
    
    public void update (int dX, int dY) {
        int x = getX() + dX;
        int y = getY() + dY;
        this.setLocation(x,y);
    }
}
