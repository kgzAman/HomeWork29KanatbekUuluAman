package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

            var cats = Cat.makeCats(10);
            Printer.print(cats);

            cats.sort(Cat::sortByBread);
            Printer.print(cats);

            cats.sort(Cat::sortByName);
            cats.sort(Cat::SortByAge);
            Printer.print(cats);

            cats.removeIf(Cat::removeSilverColorCat);
            Printer.print(cats);

                cats.removeIf(Cat::removerCatNameLengthFife);
                Printer.print(cats);

            // А сюда добавьте код, который будет сортировать коллекцию котов
            // используйте лямбда-выражения и ссылки на методы
            //cats.sort(?);
            //Printer.print(cats);

    }
}
