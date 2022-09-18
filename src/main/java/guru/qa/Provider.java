package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Provider {
    public Set<String> services = new HashSet<>();

    public Provider() {
    }

    // Добавление сервиса
    public void addService(String service) {
        services.add(service);
    }

    // Поиск сервиса по наименованию
    public void searchService(String service) {
        for (int i = 0; i < services.size(); i++) {
            if (services.contains(service)) {
                System.out.println("Сервис найден: " + service);
                break;
            } else {
                System.out.println("Сервис не найден! ");
            }
        }
    }


    // Удаление сервиса
    public void deleteService(String service) {
        for (int i = 0; i < services.size(); i++) {
            if (services.contains(service)) {
                services.remove(service);
            } else {
                System.out.println("Сервис не найден! ");
            }
        }
    }

    // Вывод всех сервисов
    public void showAllServices() {
        System.out.println("Вывод всех сервисов " + services);
    }
}
