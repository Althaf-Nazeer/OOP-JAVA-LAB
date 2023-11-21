abstract class Shape{
    public void numberofside(){
        System.out.println("Hello check");
    }
}
class Rectangle extends Shape{
    public void numberofside(){
        System.out.println("Rectangle has 4sides");
    }
}

class Triangle extends Shape{
    public void numberofside(){
        System.out.println("Triangle has 3sides");
    }
}
class Hexagon extends Shape{
    public void numberofside(){
        System.out.println("Hexagon has 6sides");
    }
}
public class Abstract {
    public static void main(String arg[]){
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        t.numberofside();
        r.numberofside();
        h.numberofside();

    }
}
