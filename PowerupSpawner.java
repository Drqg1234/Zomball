import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerupSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class PowerupSpawner extends Spawner {
    private final String[] powerupTypes = new String[]{"medpack", "ammocrate"};
    private Map<String, Integer> powerupTimers;
    private Map<String, Integer> powerupIntervals;

    public PowerupSpawner() {
        powerupTimers = new HashMap<>();
        powerupIntervals = new HashMap<>();

        for (String powerup : powerupTypes) {
            powerupTimers.put(powerup, 0);
            powerupIntervals.put(powerup, getRandomInterval(500, 1500));
        }
    }

    @Override
    public void spawn(Stage stage) {
        for (String powerup : powerupTypes) {
            powerupTimers.put(powerup, powerupTimers.get(powerup) + 1);
            if (powerupTimers.get(powerup) >= powerupIntervals.get(powerup)) {
                Powerup.spawnInWorld(stage, powerup);
                powerupTimers.put(powerup, 0);
                powerupIntervals.put(powerup, getRandomInterval(500, 1500));
            }
        }
    }
}

