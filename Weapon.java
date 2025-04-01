import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Item
{
    private Player player;
    private int distance;
    private double rotation;
    
    public Weapon (Player player, int d, double r) {
        super(player.getX(), player.getY(), player.getSize() / 2);
        this.player = player;
        this.distance = d;
        this.rotation = r;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void rotate(double r, int mX, int mY) {
        //double degree = (r + this.rotation) % 360;
        double degree = Math.toDegrees(Math.atan2(mY - this.getY(), mX - this.getX()));
        int newX = (int) (distance * Math.cos(degree/180 * Math.PI)) + player.getX();
        int newY = (int) (distance * Math.sin(degree/180 * Math.PI)) + player.getY();
        setLocation(newX, newY);
        turnTowards(mX, mY);
    }
}
