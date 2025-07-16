package ObserverPattern.DesignYoutube;
//subject means youtube channel
public interface Subject {
      void subscribe(Observer ob);
      void unsubscribe(Observer ob);
      void notifyObservers();

}
