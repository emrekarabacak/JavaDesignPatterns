package factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        //
        Shape line = ShapeFactory.getShape(ShapeType.LINE);
        line.draw();

        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
