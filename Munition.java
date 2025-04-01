import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Munition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Munition extends Actor
{
   private int speed;
   private double direction;
   private int targetX;
   private int targetY;
   private int deltaX;
   private int deltaY;

   public Munition(int tX, int tY) {
      this.targetX = tX;
      this.targetY = tY;
      this.speed = 10;
      this.direction = 1111.0; //ridiculous temp value to indicate direction has not been set yet
      
   }

   public void act() {
      this.moveBullet();
   }

   private void moveBullet() {
        if (direction == 1111) {
            int deltaX = targetX - getX();
            int deltaY = targetY - getY();
        
            direction = Math.atan2(deltaY, deltaX);
        }
        
        int deltaX = (int)(Math.cos(direction) * speed);
        int deltaY = (int)(Math.sin(direction) * speed);

        setLocation(getX() + deltaX, getY() + deltaY);

        if (getX() <= 5 || getX() >= getWorld().getWidth()-5 || getY() <= 5 || getY() >= getWorld().getHeight()-5)
        {
            getWorld().removeObject(this);
        } 
   }
    
   public void update (int dX, int dY) {
    int x = getX() + dX;
    int y = getY() + dY;
    this.setLocation(x,y);
   }
}
