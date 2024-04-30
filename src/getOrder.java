import java.util.Scanner;

public class getOrder {
    Scanner scanner = new Scanner(System.in);
    double total;

    public getOrder() {
        this.total = 0.0;
    }

    public void placeOrder() {
        boolean ordering = true;
        while (ordering) {
            System.out.println("What would you like to order today!");
            System.out.println("Pizza");
            System.out.println("Sushi");
            System.out.println("Burger");
            System.out.println("Choose your item: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case ("pizza"):
                    orderPizza();
                    break;
                case ("sushi"):
                    orderSushi();
                    break;
                case ("burger"):
                    orderBurger();
                    break;
                default:
                    System.out.println("invalid choice. try again!");
                    continue;
            }
            System.out.println("Would you like to purchase anything else? (yes/no)");
            String continueOrder = scanner.nextLine().toLowerCase();
            ordering = continueOrder.equals("yes");
        }}

        public void orderPizza () {
            System.out.println("What would you like as your topping \n 1. Sausage \n 2. pepperoni \n 3. Veggie");
            String pizzaTop = scanner.nextLine().toLowerCase();
            total += 10.99;

            switch (pizzaTop) {
                case ("sausage"):
                    System.out.println("you ordered a pizza with sausage as your topping!");
                    break;
                case ("veggie"):
                    System.out.println("you ordered a pizza with Veggies as your topping!");
                    break;
                case ("pepperoni"):
                    System.out.println("you ordered a pizza with pepperoni as your topping!");
                    break;
                default:
                    System.out.println("invalid choice. choose again");
                    orderPizza();



            }

        }

        public void orderSushi () {
            System.out.println("What type of Sushi would you like: \n 1. Veggie \n 2. Shrimp \n 3. Crab");
            String sushiType = scanner.nextLine().toLowerCase();
            total += 14.99;

            switch (sushiType) {
                case ("veggie"):
                    System.out.println("you ordered " + sushiType + " Sushi!");
                    break;
                case ("shrimp"):
                    System.out.println("you ordered " + sushiType + " Sushi!");
                    break;
                case ("crab"):
                    System.out.println("you ordered " + sushiType + " Sushi!");
                    break;
                default:
                    System.out.println("invalid choice. choose again");
                    orderSushi();

            }
        }

        public void orderBurger () {
            System.out.println("What type of Burger: \n 1. Cheese Burger \n 2. Veggie");
            String burgerType = scanner.nextLine().toLowerCase();
            total += 7.99;

            switch (burgerType) {
                case ("veggie"):
                    System.out.println("you ordered " + burgerType + " Burger");
                    break;
                case ("cheese burger"):
                    System.out.println("you ordered " + burgerType);
                    break;
                default:
                    System.out.println("invalid choice. choose again");
                    orderBurger();


            }

        }

        public double getTotal () {
            return total;
        }
    }



