package ObserverPattern.DesignYoutube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements  Subject {

    List<Observer> subscriber = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
           this.subscriber.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscriber.remove(ob);
    }

    @Override
    public void notifyObservers(String title) {
        for(Observer ob : subscriber)
        {
           ob.notified(title);
        }
    }
}
