import greenfoot.*;
import java.util.HashMap;
import java.util.Map;

public class Powerup extends NPC {
    private String type;
    private static final Map<String, String> IMAGE_MAP = new HashMap<>();
    private static final Map<String, PowerupEffect> EFFECT_MAP = new HashMap<>();
    
    static {
        IMAGE_MAP.put("medpack", "medpack.png");
        IMAGE_MAP.put("ammocrate", "ammo_crate.png");
        
        EFFECT_MAP.put("medpack", (player) -> player.incHealth(1));
        EFFECT_MAP.put("ammocrate", (player) -> player.incAmmo(10));
    }
    
    public Powerup(String type) {
        this.type = type;
        if (IMAGE_MAP.containsKey(type)) {
            GreenfootImage image = new GreenfootImage(IMAGE_MAP.get(type));
            image.scale(40, 40);
            setImage(image);
        }
    }
    
    public void touchedPlayer(Player player) {
        if (EFFECT_MAP.containsKey(type)) {
            EFFECT_MAP.get(type).applyEffect(player);
            getWorld().removeObject(this);
        }
    }
    
    public static void spawnInWorld(Stage stage, String type) {
        int[] coords = getRandomCoords(stage);
        stage.addObject(new Powerup(type), coords[0], coords[1]);
    }
    
    @FunctionalInterface
    private interface PowerupEffect {
        void applyEffect(Player player);
    }
}
