public class OurClass {
    public void ourFigure(Schape schape){
        System.out.println("schape = " + schape.getname());
    }
    public static void main(String[] args) {

        new OurClass().ourFigure(new Pentagon());
        new OurClass().ourFigure(new Triangle());
        new OurClass().ourFigure(new Quad());
        new OurClass().ourFigure(new Triangle());
        new OurClass().ourFigure(new Circle());
    }

}
