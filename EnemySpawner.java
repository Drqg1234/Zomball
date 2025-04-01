import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemySpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpawner extends Spawner {
    private final Class<? extends NPC>[] enemies = new Class[]{Zombie.class};
    private final int[] minSpawnInterval = {25};
    private final int[] maxSpawnInterval = {100};
    private int[] spawnInterval;
    private int[] spawnTimer;

    public EnemySpawner() {
        spawnTimer = new int[enemies.length];
        spawnInterval = new int[enemies.length];

        for (int i = 0; i < enemies.length; i++) {
            spawnInterval[i] = getRandomInterval(minSpawnInterval[i], maxSpawnInterval[i]);
        }
    }

    @Override
    public void spawn(Stage stage) {
        for (int i = 0; i < enemies.length; i++) {
            spawnTimer[i]++;
            if (spawnTimer[i] >= spawnInterval[i]) {
                try {
                    enemies[i].getMethod("spawnInWorld", Stage.class).invoke(null, stage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                spawnTimer[i] = 0;
                spawnInterval[i] = getRandomInterval(minSpawnInterval[i], maxSpawnInterval[i]);
            }
        }
    }
}

