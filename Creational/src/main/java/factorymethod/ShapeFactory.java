package factorymethod;

public class ShapeFactory {

    public static Shape getShape(ShapeType type) {

        Shape shape = null;
        switch (type) {
            case LINE:
                return new Line();
            case CIRCLE:
                return new Circle();
        }
        return null;
    }
}
