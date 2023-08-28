public class Bill {
    final static double tax = 0.065;

    public static void main(String[] args) {


        double FirstBill = computeBill(559.99);
        System.out.println("Total for one item including taxes: " + FirstBill);

        double SecondBill = computeBill(559.99, 2);
        System.out.println("Total for a quantity of 2 including taxes " + SecondBill);

        double ThirdBill = computeBill(559.99, 4, 50.00);
        System.out.println("Total for a quantity of 4 at discounted rate including taxes " + ThirdBill);

    }


    public static double computeBill(double PriceOfOneOrderedItem) {
        double TotalDue = PriceOfOneOrderedItem + PriceOfOneOrderedItem * tax;
        return TotalDue;
        //System.out.println("Total for one item including taxes");
        // System.out.printf("Total: $%.2f\n", (PriceOfOneOrderedItem * tax) * PriceOfOneOrderedItem);

    }

    public static double computeBill(double PriceOfOrderedItem, int QuantityOrdered) {
        double TotalDue = (PriceOfOrderedItem * QuantityOrdered);
        TotalDue = TotalDue + (TotalDue * tax);
        return TotalDue;
        //System.out.println("Total for a quantity of 2 including taxes");
        //System.out.printf("Total: $%.2f\n", PriceOfOrderedItem * QuantityOrdered + (tax));
    }

    public static double computeBill(double PriceOfOrderedItem, int QuantityOrdered, double DiscountedAmount) {
        double TotalDue = (PriceOfOrderedItem * QuantityOrdered);
        TotalDue = TotalDue- DiscountedAmount;
        TotalDue = TotalDue + (TotalDue * tax);
        return TotalDue;
        //System.out.println("Total for a quantity of 4 at discounted rate including taxes");
        //System.out.printf("Total: $%.2f\n", PriceOfOrderedItem * QuantityOrdered - (DiscountedAmount) + (tax));

    }
}
