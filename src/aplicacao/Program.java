/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Circle;
import entidades.Rectangle;
import entidades.Shape;
import entidades.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        Shape shape = null;
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + (" data:"));
            System.out.print("Rectangle or Circle (r/c)? ");
            char opcoes = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (opcoes == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                shape = new Rectangle(color, width, heigth);
                list.add(shape);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(color, radius);
                list.add(shape);
            }

        }
        System.out.println("");
        System.out.println("SHAPE AREAS:");
        for (Shape elemento : list) {
            System.out.println(String.format("%.2f", elemento.area()));
        }
    }
}
