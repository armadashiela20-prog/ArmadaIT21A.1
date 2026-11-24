public class PolymorphismDemo {

         class Payment {
        public void makePayment() {
            System.out.println("Processing a payment...");
        }
    }

       static class CashPayment extends Payment {

        @Override
        public void makePayment() {
            System.out.println("Payment made using Cash.");
        }
    }
    static class OnlinePayment extends Payment {

        @Override
        public void makePayment() {
            System.out.println("Payment made using Online Banking.");
        }
    }

    public static void main(String[] args) {

        Payment payment1 = new CashPayment();
        Payment payment2 = new OnlinePayment();

        payment1.makePayment();
        payment2.makePayment();
    }
}