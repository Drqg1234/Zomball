import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class XpBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends UI
{
    private int state;
    private int fill;
    private long lastAdded;
    
    private int width;
    private int height;
    
    public HealthBar() {
        this.width = 44;
        this.height = 10;
        this.state = 40;
        this.fill = 40;
        this.lastAdded = System.currentTimeMillis();
        
        GreenfootImage image = new GreenfootImage("health_bar40.png");
        image.scale(this.width, this.height);
        setImage(image);
    }
    
    public void act()
    {
        animate(this.fill);
    }
    
    public void animate(int targetFill) {
        this.fill = targetFill;
    
        long curTime = System.currentTimeMillis();
        
        if (state == 40 && fill == 40) { 
            if  (curTime >= lastAdded + 4000) {
                GreenfootImage image = new GreenfootImage("health_bar41.png");
                image.scale(this.width, this.height);
                setImage(image);
                lastAdded = curTime;
            }
        } else if (curTime >= lastAdded + 10) {
            if (state < fill) {
                state++;
            } else if (state > fill) {
                state--;
            }
            
            if (state >= 0 && state <= 40) {
                GreenfootImage image = new GreenfootImage("health_bar" + String.format("%02d", state) + ".png");
                image.scale(this.width, this.height);
                setImage(image);
            }
    
            lastAdded = curTime;
        }
    }
    
    public void update(int dx, int dy) { setLocation(getX() + dx, getY() + dy); }
    
}
