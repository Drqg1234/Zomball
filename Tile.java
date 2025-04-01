import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile extends Actor
{
    private int id;
    private boolean visible;
    public Tile() {
        this.id = Greenfoot.getRandomNumber(3);
        GreenfootImage image = new GreenfootImage("tile" + id + "00.png");
        image.scale(40,40);
        setImage(image);
        this.visible = true;
    }
    
    public void act()
    {
    }
    
    public void update (int dX, int dY) {
        int x = getX() + dX;
        int y = getY() + dY;
        this.setLocation(x,y);
    }
}
