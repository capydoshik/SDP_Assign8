public class Electronics implements Product {

    private final String name;
    private final double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
