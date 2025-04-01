import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Enemy
{
    private int state;
    private long lastAdded;

    public Zombie() {
        super();
        this.dying = false;
        this.state = 0;
        this.lastAdded = System.currentTimeMillis();
    }
    
    public void act()
    {
        super.moveTowardsPlayer();
        super.checkIfShot();
        animate();
    }
    
    public static void spawnInWorld(Stage stage) {
        int worldWidth = stage.getWidth();
        int worldHeight = stage.getHeight();
        int spawnX, spawnY;
        
        int border = Greenfoot.getRandomNumber(4);

        if (border == 0) {
            spawnX = Greenfoot.getRandomNumber(worldWidth);
            spawnY = 0;
        } else if (border == 1) {
            spawnX = Greenfoot.getRandomNumber(worldWidth);
            spawnY = worldHeight - 1;
        } else if (border == 2) {
            spawnX = 0;
            spawnY = Greenfoot.getRandomNumber(worldHeight);
        } else {
            spawnX = worldWidth - 1;
            spawnY = Greenfoot.getRandomNumber(worldHeight);
        }

        stage.addObject(new Zombie(), spawnX, spawnY);
    }
    
    public void touchedPlayer(Player player)
    {
        if (!dying) {
            player.incHealth(-1);
        }
    }
    
    private boolean animate() {
        long curTime  = System.currentTimeMillis();
        if (dying) {
            if (curTime >= lastAdded + 10) {
                state++;
                if (state >= 8) return die((Player) findNearestPlayer());
                GreenfootImage image = new GreenfootImage("zombie00" + state + ".png");
                image.scale(this.size,this.size);
                setImage(image);
                lastAdded = curTime;
            }
        }
        return false;
    }
    
    public boolean die(Player player) {
        player.incXP(3);
        Stage stage = (Stage) getWorld();
        stage.removeObject(this);
        return true;
    }
}
