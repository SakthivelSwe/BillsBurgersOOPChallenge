public class Hamburger {
    private String name;
    private String meet;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meet, double price, String breadRollType) {
        this.name = name;
        this.meet = meet;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name,double price) {
        this.addition1Name = name;
        this.addition1Price =price;
    }
    public void addHamburgerAddition2(String name,double price) {
        this.addition2Name = name;
        this.addition2Price =price;
    }

    public void addHamburgerAddition3(String name,double price) {
        this.addition3Name = name;
        this.addition3Price =price;
    }

    public void addHamburgerAddition4(String name,double price) {
        this.addition4Name = name;
        this.addition4Price =price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger "+" on a "+this.breadRollType+" roll with "+this.meet+", price is "+this.price);

        if(addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added "+addition1Name+" for an extra "+addition1Price);
        }

        if(addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added "+addition2Name+" for an extra "+addition2Price);
        }

        if(addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added "+addition3Name+" for an extra "+addition3Price);
        }

        if(addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added "+addition4Name+" for an extra "+addition4Price);
        }
        return hamburgerPrice;
    }

}
