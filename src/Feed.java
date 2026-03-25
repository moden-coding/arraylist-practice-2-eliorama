import java.util.ArrayList;

public class Feed {
    public static void main(String[] args) {
          // Step 1: Create your ArrayList to hold post descriptions
        ArrayList<String> feed = new ArrayList<String>();
System.out.println("--- Top of Feed ---");
        // Step 2: Add 7 post descriptions using .add()
        // Example: feed.add("Maya posted a photo");
        feed.add("Maya posted a photo");
        feed.add("John posted a photo");
        feed.add("Ella posted a reel");
        feed.add("Raylee started a live");
        feed.add("Nina posted a reel");
        feed.add("Henry started a live");
        feed.add("Alex shared a meme");
      


        // Step 3: Print only the FIRST 3 posts (the top of the feed)
        // Use a for loop — think carefully about when your loop should stop
        for(int i= 0; i<feed.size()-4; i++){
        System.out.println(feed.get(i));
        }


        // Step 4: Print how many posts are still waiting below the top 3
        System.out.println(feed.size()-3 + " more posts below...");

    }
}
