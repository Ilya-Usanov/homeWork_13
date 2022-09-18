package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class StorePerson {

    public HashMap<String, Integer> employees = new HashMap<>();

    public StorePerson() {
    }

    // Добавление сотрудника
    public void addEmployee(String fullName, int index) {
        employees.put(fullName, index);
    }

    // Поиск сотрудника
    public void searchEmployee(int index) {
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue().equals(index)) {
                System.out.println("Сотрудник найден! " + entry);
                break;
            }
        }
    }

    // Удаление сотрудника
    public void deleteEmployee(String fullName, int index) {
        employees.remove(fullName, index);
    }

    // Вывод всех сотрудников
    public void showAllEmployees() {
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}
