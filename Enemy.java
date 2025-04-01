// Source code is decompiled from a .class file using FernFlower decompiler.
import greenfoot.GreenfootImage;
import java.util.Iterator;

public class Enemy extends NPC {
   public boolean dying;
   public int size = 50;
   private int speed = 3;

   public Enemy() {
      GreenfootImage image = this.getImage();
      image.scale(this.size, this.size);
      this.setImage(image);
   }

   public void act() {
      this.moveTowardsPlayer();
      this.checkIfShot();
   }

   public void moveTowardsPlayer() {
      Player nearestPlayer = this.findNearestPlayer();
      if (nearestPlayer != null) {
         int enemyX = this.getX();
         int enemyY = this.getY();
         int playerX = nearestPlayer.getX();
         int playerY = nearestPlayer.getY();
         double angle = Math.atan2((double)(playerY - enemyY), (double)(playerX - enemyX));
         int deltaX = (int)(Math.cos(angle) * (double)this.speed);
         int deltaY = (int)(Math.sin(angle) * (double)this.speed);
         this.setLocation(enemyX + deltaX, enemyY + deltaY);
      }

   }

   public Player findNearestPlayer() {
      Player nearestPlayer = null;
      double nearestDistance = Double.MAX_VALUE;
      Iterator var4 = this.getWorld().getObjects(Player.class).iterator();

      while(var4.hasNext()) {
         Object obj = var4.next();
         Player player = (Player)obj;
         double distance = Math.hypot((double)(player.getX() - this.getX()), (double)(player.getY() - this.getY()));
         if (distance < nearestDistance) {
            nearestDistance = distance;
            nearestPlayer = player;
         }
      }

      return nearestPlayer;
   }

   public void checkIfShot() {
      if (this.isTouching(Munition.class)) {
         Munition bullet = (Munition)this.getOneIntersectingObject(Munition.class);
         this.getWorld().removeObject(bullet);
         this.dying = true;
      }

   }

   public void die(Stage stage, Player player) {
   }
}
