//* This is the New Image class that Identify each image and establish its attributes */

public class NewsImage {

    //Attributes
    private String url;
    private String imageDescription;
    private String caption;
    private int width;
    private int height;
    private String newId;

    //Constructor
    public NewsImage(String url, String imageDescription, String caption, int width, int height, String newId){

        this.url = url;
        this.imageDescription = imageDescription;
        this.caption = caption;
        this.width = width;
        this.height = height;
        this.newId = newId; // <-- Addition, news image needs a news to exist but news does not need an image.
    }

    //Getters

    //Setters

    public void setUrl(String url){
        if (url == null){
            throw new IllegalArgumentException (" The url cannot be empty. ");
        }
        this.url = url;
    }
    public void setCaption(String caption){
        if (caption == null){
            throw new IllegalArgumentException ("The caption cannot be empty. ");
        }
        this.caption = caption;
    }
    public void setWidth(int width){
        if (width <= 0){
            throw new IllegalArgumentException ("The width connot be negative or zero. ");
        }
    }
    public void setHeight(int height){
        if (height <= 0){
            throw new IllegalArgumentException ("The height cannot be negative or zero");
        }
    }

}