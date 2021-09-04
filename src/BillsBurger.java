public class BillsBurger {
    private Hamburger hamburger;
    private HealthyBurger healthyBurger;
    private DeluxeBurger deluxeBurger;

    public BillsBurger(Hamburger hamburger, HealthyBurger healthyBurger, DeluxeBurger deluxeBurger) {
        this.hamburger = hamburger;
        this.healthyBurger = healthyBurger;
        this.deluxeBurger = deluxeBurger;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public HealthyBurger getHealthyBurger() {
        return healthyBurger;
    }

    public DeluxeBurger getDeluxeBurger() {
        return deluxeBurger;
    }
}
