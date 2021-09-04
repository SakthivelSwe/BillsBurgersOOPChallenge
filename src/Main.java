public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());


//        BillsBurger dominoBurgersShop = new BillsBurger(hamburger,healthyBurger,db);
//
//        dominoBurgersShop.getHamburger().addHamburgerAddition1("Tomato", 0.27);
//        dominoBurgersShop.getHamburger().addHamburgerAddition2("Lettuce", 0.75);
//        dominoBurgersShop.getHamburger().addHamburgerAddition3("Cheese", 1.13);
//        dominoBurgersShop.getHamburger().addHamburgerAddition4("Onion",0.89);
//        System.out.println("Total Burger price is " + dominoBurgersShop.getHamburger().itemizeHamburger());
//
//        dominoBurgersShop.getHealthyBurger().addHamburgerAddition1("Egg", 5.43);
//        dominoBurgersShop.getHealthyBurger().addHealthyAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is  " + dominoBurgersShop.getHealthyBurger().itemizeHamburger());
//
//        dominoBurgersShop.getDeluxeBurger().addHamburgerAddition3("Should not do this", 50.53);
//        System.out.println("Total Deluxe Burger price is " + dominoBurgersShop.getDeluxeBurger().itemizeHamburger());
    }
}
