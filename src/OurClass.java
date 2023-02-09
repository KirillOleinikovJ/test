public class OurClass {

    public static void main(String[] args) {
        Method method= new Method();
        method.ourFigure(new Pentagon());
        method.ourFigure(new Triangle());
        method.ourFigure(new Quad());
        method.ourFigure(new Triangle());
        method.ourFigure(new Circle());
    }

}
