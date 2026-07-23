package practical9.good;

import java.util.ArrayList;
import java.util.List;

public class ResultPublisher {

    private List<ResultObserver> observers = new ArrayList<>();

    public void subscribe(ResultObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(ResultObserver observer) {
        observers.remove(observer);
    }

    public void publishResult(String studentName, String result) {
        for (ResultObserver observer : observers) {
            observer.update(studentName, result);
        }
    }
}
