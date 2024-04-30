import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        namePass namePass = new namePass();
        getOrder getOrder = new getOrder();

        System.out.println("Welcome " + namePass.name + "" + namePass.lastName + "!");
        System.out.println("Your password is: " + namePass.password);

        getOrder.placeOrder();

        finalPrice price1 = new finalPrice();
        System.out.println("total price" + price1.getTotal());


        //double subTotal = getOrder.getTotal();
        //System.out.println(subTotal);

    }
}