package FirstMiniProjects.Gun;

import java.util.Stack;

public class Gun {

    private final Stack<Bullet> bulletStorage;
    private final int bulletStorageCapacity; // 10

    public Gun (int capacity) {
        this.bulletStorage = new Stack<Bullet>();
        this.bulletStorageCapacity = capacity;
    }

    public void loadBullet (Bullet bullet) {
        if (bulletStorageCapacity > bulletStorage.size()) {
            bulletStorage.push(bullet);
        } else {
            System.err.println("The pistol's clip is full.");
        }
    }

    public boolean isLoaded() {
        return !bulletStorage.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            System.out.printf("...Bum! The bullet %s if flying!\n", bulletStorage.pop());
        } else {
            System.err.println("The clip of the gun is empty!");
        }
    }
}