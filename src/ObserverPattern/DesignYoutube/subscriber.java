package ObserverPattern.DesignYoutube;

public class subscriber implements  Observer{

    String name;
    subscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.print(this.name+ " new video uploaded "+ title);
    }
}
