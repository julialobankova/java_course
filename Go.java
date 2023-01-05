import java.util.Scanner;

public class Go {
    public static void main(String[] args) {
        Laptop[] laptops = {
            new Laptop("APPLE MacBook Air M1ll","MacOS", "Silver", "FullHD"),
            new Laptop("Microsoft Surface Laptop 4.", "Windows", "Black", "HD"),
            new Laptop("HP Spectre x360","Windows","Silver","FullHD"),
            new Laptop("DELL XPS 13","Linux","White","FullHD"),
            new Laptop("Acer Swift 3","Windows","Black","FullHD"),
            new Laptop("APPLE MacBook Pro 16","MacOS","Black","FullHD"),
            new Laptop("ASUS ROG Zephyrus G14","Windows","Silver","FullHD"),
            new Laptop("Lenovo ThinkPad X1 Carbon","Linux","Silver","HD")

        };
        searchLaptop();
        Laptop search = null;
        String color = "Black";
        for (Laptop laptop : laptops) {
            if (laptop != null && laptop.getColor() != null && laptop.getColor().toLowerCase().equals(color.toLowerCase())) {
                search = laptop;
                break;
            }
        }
        System.out.println("Search: " + search);
    }

    public static void searchLaptop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете фильтр: 1 - Операционная система, 2 - Цвет, 3 - Разрещение экрана");
        String s1 = sc.nextLine();
        sc.close();
        int count = 0;
        while (count < 10) {
            if (s1 == "1") {
                System.out.println("");
            }
        }
    }
}
