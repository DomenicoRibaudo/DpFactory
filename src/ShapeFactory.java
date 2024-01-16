public class ShapeFactory {
    public static Shape getShape(ShapeType type) {
        switch (type) {
            case CERCHIO:
                return new Circle();
            case RETTANGOLO:
                return new Rectangle();
            default:
                return null;
        }
    }
}
