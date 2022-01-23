package FirstMiniProjects.Gun;

public class Main {
    public static void main(String[] args) {
        Gun aps = new Gun(5);
        aps.loadBullet(Bullet.TRACER);
        aps.loadBullet(Bullet.ANTIARMOR);
        aps.loadBullet(Bullet.SUBCALIBER);
        aps.loadBullet(Bullet.TRACER);
        aps.isLoaded();
        aps.shot();
        aps.isLoaded();
        aps.shot();
        aps.isLoaded();
        aps.loadBullet(Bullet.TRACER);
        aps.loadBullet(Bullet.TRACER);
        aps.loadBullet(Bullet.TRACER);
        aps.loadBullet(Bullet.TRACER);
        aps.shot();
        aps.shot();
        aps.shot();
        aps.shot();
        aps.shot();
        aps.shot();
        aps.shot();
        aps.shot();
    }
}
