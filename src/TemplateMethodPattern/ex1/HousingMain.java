package TemplateMethodPattern.ex1;

public class HousingMain {
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println();
        System.out.println("**************");
        System.out.println();

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
