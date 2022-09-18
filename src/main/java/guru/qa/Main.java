package guru.qa;

public class Main {

    public static void main(String[] args) {

        // Проверка работы методов Provider
        Provider exist = new Provider();
        exist.addService("online order");
        exist.addService("consultation");
        exist.addService("consultation");
        exist.searchService("consultation");
        exist.deleteService("online order");
        exist.showAllServices();
        System.out.println("...");

        // Проверка работы методов Store
        Store mVideo = new Store();
        mVideo.addProduct("laptop");
        mVideo.addProduct("iphone");
        mVideo.addProduct("iphone");
        mVideo.searchProduct("iphone");
        mVideo.deleteProduct("laptop");
        mVideo.showAllProducts();
        System.out.println("...");

        // Проверка работы методов StorePerson
        StorePerson factory = new StorePerson();
        factory.addEmployee("John Smith", 101);
        factory.addEmployee("Ruby Wilshare", 102);
        factory.addEmployee("Albert Fisher", 103);
        factory.addEmployee("Albert Fisher", 103);
        factory.searchEmployee(102);
        factory.deleteEmployee("Ruby Wilshare", 102);
        factory.showAllEmployees();
        System.out.println("...");

        // Проверка работы методов FootballPlayers
        FootballPlayers club = new FootballPlayers();
        club.addPlayer("Messi");
        club.addPlayer("Ronaldo");
        club.searchPlayer("Ronaldo");
        club.deletePlayer("Messi");
        club.showAllPlayers();
    }
}
