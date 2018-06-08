package HouseColors;

public class Main {

    public static void main(String[] args) {

        House alpha = new House("blue");
        System.out.println("Alpha original color: " + alpha.getColor());
        House beta = alpha;
        System.out.println("Beta original color: " + beta.getColor());

        beta.setColor("yellow");
        System.out.println("Alpha second color: " + alpha.getColor());
        System.out.println("Beta second color: " + beta.getColor());

        House gamma = new House("green");
        System.out.println("Gamma original color: " + gamma.getColor());
        beta = gamma;
        System.out.println("Beta new color: " + beta.getColor());
        System.out.println("Alpha new color: " + alpha.getColor());
        System.out.println("Gamma new color: " + gamma.getColor());

        alpha.setColor("blue");
        beta.setColor("yellow");
        System.out.println("Beta color: " + beta.getColor());
        System.out.println("Alpha color: " + alpha.getColor());
        System.out.println("Gamma color: " + gamma.getColor());
    }
}
