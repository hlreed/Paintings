/**
 * Created by Hope on 11/8/2016.
 */
public class Painting {
    protected String artist;
    protected String title;
    protected double value;

    public Painting (String t, String a) {
        title = t;
        artist = a;
        value = 400;
    }

    public void display() {
        System.out.print("Title: " + title + "\nArtist: " + artist + "\nValue: " + value);
    }

}
