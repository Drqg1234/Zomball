import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class XpBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class XpBar extends UI
{
    private int state;
    private int fill;
    private long lastAdded;
    
    public XpBar() {
        GreenfootImage image = getImage();
        image.scale(444,20);
        setImage(image);
        
        this.state = 0;
        this.fill = 0;
        this.lastAdded = System.currentTimeMillis();
    }
    
    public void act()
    {
        animate(this.fill, false);
    }
    
    public void animate(int targetFill, boolean levelup) {
    if (targetFill > this.fill) {
        this.fill = targetFill;
    } else if (levelup) {
        this.fill = 101;
    }

    long curTime = System.currentTimeMillis();
    if (curTime >= lastAdded + 10) {
        if (state <= fill) {
            state++;
        } 
        
        if (state > 100) {
            GreenfootImage image = new GreenfootImage("xp_bar000.png");
            image.scale(444,20);
            setImage(image);
            this.fill = 0;
            this.state = 0;
        }
        
        if (state >= 0 && state <= 100) {
            GreenfootImage image = new GreenfootImage("xp_bar" + String.format("%03d", state) + ".png");
            image.scale(444, 20);
            setImage(image);
        }

        lastAdded = curTime;
    }
}

    
    
}
