package calculator;

public class Main {
    public static void main(String[] args) {
        // First activity
        // System.out.println("Prices:");
        // System.out.println("Bubblegum: $2");
        // System.out.println("Toffee: $0.2");
        // System.out.println("Ice cream: $5");
        // System.out.println("Milk chocolate: $4");
        // System.out.println("Doughnut: $2.5");
        // System.out.println("Pancake: $3.2");
        // System.out.println("Earned amount:");

        // Second activity
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;

        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.print("Pancake: $" + pancake + "\n\n");
        System.out.print("Income: $" + (bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake));
    }
}
