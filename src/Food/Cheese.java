package Food;
public class Cheese extends food {

    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " was eaten");
    }
}