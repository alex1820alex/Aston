import abstractFactory.AbstractFactory;
import abstractFactory.Color;
import abstractFactory.FactoryProducer;
import abstractFactory.Shape;

public class DemoAbstractFactory {
    public static void main(String[] args) {
        // Получение фабрики Shape через класс FactoryProducer и метода getFactory()
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // Создание объекта Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //рисуем этот объект
        shape1.draw();
        // Создание объекта Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //рисуем этот объект
        shape2.draw();
        // Получение фабрики Color через класс FactoryProducer и метода getFactory()
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        // Создание объекта Red
        Color color1 = colorFactory.getColor("RED");
        //заполняем наш цвет
        color1.fill();
        // Создание объекта Blue
        Color color2 = colorFactory.getColor("BLUE");
        //заполняем наш цвет
        color2.fill();
    }
}
