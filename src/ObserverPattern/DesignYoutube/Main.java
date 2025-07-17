package ObserverPattern.DesignYoutube;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       YoutubeChannel channel = new YoutubeChannel();
       subscriber aman = new subscriber();
       channel.subscribe(aman);
       channel.notifyObservers();
    }
}