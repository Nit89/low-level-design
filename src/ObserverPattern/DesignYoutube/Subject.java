package ObserverPattern.DesignYoutube;
//subject means YouTube channel
public interface Subject {
      void subscribe(Observer ob);
      void unsubscribe(Observer ob);
      void notifyObservers(String title);

}
