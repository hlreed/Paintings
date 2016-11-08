import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hope on 11/8/2016.
 */
public class Paintings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Painting> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.print("Enter artist name: ");
            String artist = sc.nextLine();
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            if(artist.equals("Monet") || artist.equals("Degas") || artist.equals("Picasso") || artist.equals("Rembrandt")){
                list.add(new FamousPainting(artist, title));
            }
            else{
                list.add(new Painting(artist, title));
            }
        }
        for(Painting p: list){
            p.display();
        }
    }
}
