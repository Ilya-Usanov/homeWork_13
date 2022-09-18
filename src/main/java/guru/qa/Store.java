package guru.qa;

import java.util.ArrayList;

public class Store {
    public ArrayList<String> products = new ArrayList<>();

    public Store() {
    }

    // Добавление продукта
    public void addProduct(String product) {
        products.add(product);
    }

    // Поиск продукта по наименованию
    public void searchProduct(String product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.contains(product)) {
                System.out.println("Продукт найден! " + product);
                break;
            } else {
                System.out.println("Продукт не найден! ");
            }
        }
    }

    // Удаление продукта
    public void deleteProduct(String product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.contains(product)) {
                products.remove(product);
                break;
            } else {
                System.out.println("Продукт не найден! ");
            }
        }
    }

    // Вывод всех продуктов
    public void showAllProducts() {
        System.out.println("Вывод всех продуктов " + products);
    }
}
