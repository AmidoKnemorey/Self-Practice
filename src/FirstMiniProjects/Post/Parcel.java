package FirstMiniProjects.Post;

public class Parcel implements Validator {
    protected int xLength;
    protected int yLength;
    protected int zLength;
    protected float weight;
    protected boolean isExpress;

    public Parcel (int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }
}