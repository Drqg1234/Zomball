import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    private int x;
    private int y;
    private int size;
    
    public Item(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        GreenfootImage image = new GreenfootImage("gun.png");
        image.scale(2*this.size,this.size);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void update (int dX, int dY) {
        this.x += dX;
        this.y += dY;
        this.setLocation(x,y);
    }
}
