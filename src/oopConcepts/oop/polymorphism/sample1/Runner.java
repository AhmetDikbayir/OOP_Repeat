package oopConcepts.oop.polymorphism.sample1;


public class Runner {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.draw();

        //circle1 = new Triangle();
        //yukarıdaki bu problewmi çözmek için
        Square square1 = new Square();
        square1.draw();

        Triangle triangle1 = new Triangle();
        triangle1.draw();

        // 2. yol : polymorphism
        System.out.println("******** POLYMORHISM************");
        Shape shape1 = new Triangle();

        shape1.draw();

        shape1 = new Circle();
        shape1.draw();

        shape1 = new Square();
        shape1.draw();

        // SONUC : 1 değişken ile aynı turde farklı nesneleri karşılayabiliyorum

    }
}
