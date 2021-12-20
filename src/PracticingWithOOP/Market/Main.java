package PracticingWithOOP.Market;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static String name;

    public static void main(String[] args) {
        Basket mainBasket = new Basket();
        //mainBasket.addProductToBasket(new Product ("Rower", 1600.0F, ));
        System.out.println(mainBasket);


        interface MySupplier extends Supplier<Double> {

                }



    }
}

//design pattern repository









    /* Utwórz aplikację imitującą sklep. Utwórz klasę Basket, która pozwoli dodawać, usuwać i
        pobierać wszystkie elementy z koszyka. Każdy element jest instancją interfejsu Product,
        który definiuje dwie metody: jedną, aby uzyskać cenę produktu, a drugą, aby sprawdzić
        dostępność na podstawie podanej daty.
        Utwórz klasę GenericProduct, która implementuje interfejs Product i będzie w
        konstruktorze przyjmować Supplier używany do określania ceny i Function używany do
        określania dostępności produktu na podstawie podanej daty.
        Upewnij się, że Basket nie ujawnia swojej wewnętrznej listy przechowującej produkty
        (co oznacza, że nie zwróci odniesienia do wewnętrznej listy, ale raczej kopię), wszystkie
        operacje na tej liście powinny być wykonane metodami klasy Basket.
        www.sdacademy.plwww.sdacademy.pl
        Zadanie 11.
        Dodaj kilka produktów do koszyka z zadania 11. Sprawdź, czy wszystko działa zgodnie z
        oczekiwaniami. */