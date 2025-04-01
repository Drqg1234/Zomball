import greenfoot.*;
import java.util.*;

public abstract class Stage extends World {
    public static final int TILE_SIZE = 40;
    public static final int VIEW_WIDTH = 1200;
    public static final int VIEW_HEIGHT = 800;
    private static final int BUFFER = 20;

    private int playerX = 0, playerY = 0;
    private HashSet<String> loadedTiles = new HashSet<>();

    public Stage() {    
        super(VIEW_WIDTH, VIEW_HEIGHT, 1, false);
        loadTilesAround(0, 0);
    }

    private void loadTilesAround(int x, int y) {
        int cols = VIEW_WIDTH / TILE_SIZE + BUFFER;
        int rows = VIEW_HEIGHT / TILE_SIZE + BUFFER;

        for (int i = -BUFFER; i <= cols; i++) {
            for (int j = -BUFFER; j <= rows; j++) {
                int tileX = (x / TILE_SIZE) + i;
                int tileY = (y / TILE_SIZE) + j;
                
                addTile(tileX, tileY);
            }
        }
    }

    private void addTile(int tileX, int tileY) {
        int x = tileX * TILE_SIZE;
        int y = tileY * TILE_SIZE;
        Tile tile = new Tile();
        addObject(tile, x, y);
    }

    public void updateTiles(int dx, int dy) {
        List<Tile> tiles = getObjects(Tile.class);
        for (Tile tile : tiles) {
            tile.update(dx, dy);
        }
    }
    
    public void updateMunitions(int dx, int dy) {
        List<Munition> munitions = getObjects(Munition.class);
        for (Munition m : munitions) {
            m.update(dx, dy);
        }
    }
    
    public void updateNPCs(int dx, int dy) {
        List<NPC> npcs = getObjects(NPC.class);
        for (NPC n : npcs) {
            n.update(dx, dy);
        }
    }
}
