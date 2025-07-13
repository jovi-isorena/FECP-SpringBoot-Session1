package ZooSimulation.views;

import ZooSimulation.models.Visitor;

import java.util.Scanner;

public class VisitorRegistrationView {

    public static Visitor register(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = sc.nextLine();

    System.out.print("Enter age: ");
    int age = sc.nextInt();
    sc.nextLine();

    return new Visitor(name, age);
    }
}