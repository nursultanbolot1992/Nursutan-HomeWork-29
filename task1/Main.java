package kz.attractor.java;

import java.util.Comparator;
import java.util.Scanner;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
//        Printer.print(cats);


        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();

        cats.sort(Comparator.comparing(Cat::getBreed));
        for (Cat c:cats) {
            if (Cat.Breed.BRITAIN == Cat.Breed.BRITAIN) {
                cats.remove(Cat.Breed.BRITAIN);
            }
        }
            System.out.println(" Сортировка список по породе кота");
        cats.sort(Comparator.comparing(Cat::getAge));
        Printer.print(cats);
        System.out.println("Сортировка список по имени и возрасту.");
        cats.sort(Comparator.comparing(Cat::getName));


        Printer.print(cats);
        System.out.println(" Сортировка список по породе кота");

        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getColor));

        while (Cat.Color.values() == Cat.Color.values()) {
            cats.remove(Cat.Color.values());

            if ((Cat.Color.GRAY) == (Cat.Color.GRAY)) {
                cats.remove(Cat.Color.GRAY);
            }
            if ((Cat.Color.GINGER) == (Cat.Color.GINGER)) {
                cats.remove(Cat.Color.GINGER);
            }
            if ((Cat.Color.PEACH) == (Cat.Color.PEACH)) {
                cats.remove(Cat.Color.PEACH);
            }
            if ((Cat.Color.SILVER) == (Cat.Color.SILVER)) {
                cats.remove(Cat.Color.SILVER);
            }
            if ((Cat.Color.TABBY) == (Cat.Color.TABBY)) {
                cats.remove(Cat.Color.TABBY);

            }
            if ((Cat.Color.TORTIE) == (Cat.Color.TORTIE)) {
                cats.remove(Cat.Color.TABBY);
            }
        }
        System.out.println("Удаление из списка всех котов определенного цвета.");
        Printer.print(cats);
//
//
//        Printer.print(cats);
//        System.out.println(cats);

        System.out.println();

    }


}
