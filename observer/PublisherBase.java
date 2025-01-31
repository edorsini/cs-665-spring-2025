package patterns.observer;

public interface PublisherBase { // Subject or Observable

  void subscribe(SubscriberBase o);

  void unsubscribe(SubscriberBase o);

  void notifySubscribers();

}
