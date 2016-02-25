package demo.example.com.customarrayadapter;

/**
 * Creating a custom class called AndroidFlavor. Objects of this class will have 3 properties - versionName, versionNumber, image.
 */
public class AndroidFlavor {
    String versionName;
    String versionNumber;
    int image; // drawable reference id

    public AndroidFlavor(String vName, String vNumber, int image)
    {
        this.versionName = vName;
        this.versionNumber = vNumber;
        this.image = image;
    }

}
