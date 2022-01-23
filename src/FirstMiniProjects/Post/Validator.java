package FirstMiniProjects.Post;

public interface Validator {

    static boolean validate(Parcel input) {
        if (input.xLength + input.yLength + input.zLength > 300) {
            System.err.println("Too big parcel than possible!");
            return false;
        } else if (input.xLength < 30 || input.yLength < 30 || input.zLength < 30) {
            System.err.println("Too small parcel than it's possible!");
            return false;
        } else if (input.weight > 30.0 || input.weight < 15.0) {
            System.err.println("Incorrect weight of Parcel.");
            input.isExpress = false;
            return false;
        } else {
            System.out.println("Everything's fine!");
            return true;
        }
    }
}