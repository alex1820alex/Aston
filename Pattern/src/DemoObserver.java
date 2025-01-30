import observer.ConcreteObserver;
import observer.ConcreteSubject;
import observer.Observer;

public class DemoObserver {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        //Создаем 2 обсервера
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");
        // Добовляем в список обсерверов
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        // первое изменение объекта
        System.out.println("First state change: State1");
        subject.setState("State1");
        // второе изменение объекта
        System.out.println("Second state change: State2");
        subject.setState("State2");
        // удаляем один обсервер из списка обсерверов
        subject.removeObserver(observer1);
        // третье изменение
        System.out.println("Third state change: State3");
        subject.setState("State3");


    }
}
