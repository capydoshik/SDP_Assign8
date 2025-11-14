public class PriceCalcVisitor implements ProductVisitor {

    private double total = 0;

    @Override
    public void visit(Book book) {
        total += book.getPrice();
    }

    @Override
    public void visit(Electronics electronics) {
        total += electronics.getPrice();
    }

    public double getTotal() {
        return total;
    }
}
