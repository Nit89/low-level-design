package ObserverPattern.DesignYoutube;

public class subscriber implements  Observer{
    @Override
    public void notified() {
        System.out.println("new video uploaded");
    }
}
