package observer;

public class ConcreteObserver implements Observer {
    private String name;
    private String state;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        this.state = state;
        display();
    }

    public void display() {
        System.out.println("Observer " + name + " has received an update: " + state);
    }
}

