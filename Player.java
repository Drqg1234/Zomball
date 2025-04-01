import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private double speed;
    private int size;
    private int maxHealth;
    private int maxReadyAmmo;
    private int health;
    private int totalAmmo;
    private int readyAmmo;
    
    private int level;
    private int xp;
    private int xpMax;
    
    private XpBar xpBar;
    private HealthBar healthBar;
    private Weapon primaryGun;
    
    
    public Player(XpBar xb, HealthBar hb) {
        super();
        this.speed = 5;
        this.size = 50;
        this.maxHealth = 3;
        this.maxReadyAmmo = 10;
        this.health = maxHealth;
        this.totalAmmo = 30;
        this.readyAmmo = maxReadyAmmo;
        this.level = 0;
        this.xp = 0;
        this.xpMax = 25;
        this.xpBar = xb;
        this.healthBar = hb;
        
        GreenfootImage image = getImage();
        image.scale(this.size,this.size);
        setImage(image);

    }

    public void act()
    {
        Stage world = (Stage) getWorld();
        if (this.primaryGun == null) {
            int d = (6 * this.size) / 8;
            int gunX = (int) (d * Math.cos(1.17601)) + getX();
            int gunY = (int) (d * Math.sin(1.17601)) + getY();
            double r = 67.38040967;
            this.primaryGun = new Weapon(this, d, r);
            world.addObject(this.primaryGun, gunX, gunY);
        }
        
        //world.showText("Health: " + health, 51, 25);
        world.showText("Ammo: " + readyAmmo + "/" + totalAmmo, 72, 50);
        world.showText("Level: " + level, 47, 75);
        //world.showText("XP: " + xp + "/" + xpMax, 50, 100);
        
        move();
        checkTouching();
        rotate();    
    }

    private void move() {
        int dx = 0, dy = 0;
        if (Greenfoot.isKeyDown("a"))  dx = -5;
        if (Greenfoot.isKeyDown("d")) dx = 5;
        if (Greenfoot.isKeyDown("w"))    dy = -5;
        if (Greenfoot.isKeyDown("s"))  dy = 5;
        if (Greenfoot.isKeyDown("r"))  reload();

        int px = getX(), py = getY();
        int qx = Math.max(Math.min(px + dx, 900), 300);
        int qy = Math.max(Math.min(py + dy, 600), 200);
        
        double rx = (dx != 0) ? (1.0 * qx - px) / dx : 1.0;
        double ry = (dy != 0) ? (1.0 * qy - py) / dy : 1.0;
        double r = Math.min(rx, ry);

        int bx = (int) (dx * r), by = (int) (dy * r);
        
        setLocation(px+bx, py+by);
        healthBar.update(bx, by);  
        
        Stage stage = (Stage) getWorld();
        stage.updateTiles(bx-dx, by-dy);
        stage.updateMunitions(bx-dx, by-dy);
        stage.updateNPCs(bx-dx, by-dy);
        
        this.primaryGun.update(bx, by);
    }
    
    private void rotate() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mouseX, mouseY;
        if (mouse != null) {
            mouseX = mouse.getX();
            mouseY = mouse.getY();
            //turnTowards(mouseX, mouseY);
            primaryGun.rotate(this.getRotation(), mouseX, mouseY);
        }

        if (Greenfoot.mouseClicked(null))
        {
            shoot();
        }  
    }

    private void shoot()
    {
        if (readyAmmo < 1) {
            return;
        }
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();

        Munition bullet = new Munition(mouseX, mouseY);
        getWorld().addObject(bullet, primaryGun.getX(), primaryGun.getY());
        
        readyAmmo -= 1;
    }
    
    private void checkTouching() {        
        if (isTouching(NPC.class)) {
            NPC npc = (NPC) getOneIntersectingObject(NPC.class);
            npc.touchedPlayer(this);
            getWorld().removeObject(npc);
        }
    }
    
    public void incHealth(int amt) {
        health += amt;
    
        if (health > maxHealth) {
            health = maxHealth;
        } else if (health <= 0) {
            health = 0;
            Stage world = (Stage) getWorld();
            //world.gameOver = true;
            //return;
        }
        
        int fill = (int) (((double) health / maxHealth) * 40);
        this.healthBar.animate(fill);
    }

    
    public void reload() {
        int ammoNeeded = maxReadyAmmo - readyAmmo;
                
        int ammoLoaded = Math.min(ammoNeeded, totalAmmo);
        
        readyAmmo += ammoLoaded;
        totalAmmo -= ammoLoaded;
    }
    
    public void incAmmo(int amt) {
        totalAmmo += amt;
    }
    
    public void incXP(int amt) {
        boolean levelup = false;
        xp += amt;
        if (xp > xpMax) {
            xp -= xpMax;
            level += 1;
            speed += level/10;
            xpMax += (int) Math.round(Math.sqrt(xpMax) * level * level);
            levelup = true;
        }
        int fill = (int) (((double) xp / xpMax) * 100);
        this.xpBar.animate(fill, levelup);
    }
    
    public int getSize() { return this.size; }
}

