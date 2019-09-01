package HeadFirstDesignPattern.chapter2;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -10:28
 * @title Subject
 * @project MyBookCodes
 * @desc TODO
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}


