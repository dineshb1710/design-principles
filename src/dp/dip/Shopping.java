package dp.dip;

public class Shopping {

    private IPay iPay; // Debit Card, Credit Card, NetBanking, UPI.. [Loosely Coupled]

    public void doShopping() {
        // Cart is filled with groceries, and other Items..
        Cart cart = new Cart();
        checkout(cart);
    }

    public void checkout(Cart cart) {
        doPay(cart.getAmount());
    }

    public void doPay(Double amount) {
        iPay.makePayment(amount);
    }
}
