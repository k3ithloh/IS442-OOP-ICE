public class Test {
    public static void main(String[] args) {
        Octagon obj = new Octagon(12.5);
        System.out.printf("An octagon whose side is %.0f will have an area and perimeter of %.2f and %.0f respectively.%n", obj.getSide(), obj.getArea(), obj.getPerimeter());
        System.out.println(obj);
    }
}