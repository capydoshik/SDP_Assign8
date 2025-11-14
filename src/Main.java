public class Main {
    public static void main(String[] args) {

        Product book = new Book("Clean Code", 29.99);
        Product laptop = new Electronics("Laptop", 499.99);

        PriceCalcVisitor priceVisitor = new PriceCalcVisitor();

        book.accept(priceVisitor);
        laptop.accept(priceVisitor);

        System.out.println("Total price: " + priceVisitor.getTotal());
    }
}
