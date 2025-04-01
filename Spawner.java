import greenfoot.*;  
import java.util.Random;

public abstract class Spawner extends Actor {
    protected Random random = new Random();
    
    protected int getRandomInterval(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public abstract void spawn(Stage stage);

    public void act() {
        Stage stage = (Stage) getWorld();
        spawn(stage);
    }
}
