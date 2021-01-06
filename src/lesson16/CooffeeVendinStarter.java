package lesson16;

class CoffeeVendingStarter {
    public static void main(String[] args) {
        myChoose(3);

    }

    private static void myChoose(int customerChoice) {
        switch (customerChoice) {
            case 3:
                CoffeeMachine.latte();
                break;
            case 1:
                CoffeeMachine.americano();
                break;
            case 2:
                CoffeeMachine.cappuccino();
                break;
            case 4:
                CoffeeMachine.hotWatter(100);
                break;
            default:
                System.out.println("Uncorrectly choice");
                break;

        }
    }
}
