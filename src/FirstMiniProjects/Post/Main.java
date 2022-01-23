package FirstMiniProjects.Post;

public class Main {

    public static void main(String[] args) {
        Parcel parcel = new Parcel(23,24,25,(float) 17);
        Parcel parcel1 = new Parcel(34,35,36, (float) 30);

        boolean checker = Validator.validate(parcel);
        // if checker contains true, some next logic starts ...
    }
}