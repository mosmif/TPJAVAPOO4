import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        int choice;
        do {
            System.out.println("\n1. Display products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add product");
            System.out.println("4. Delete product");
            System.out.println("5. Save products");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("ID: ");
                    System.out.println(metier.findById(sc.nextLong()));
                    break;

                case 3:
                    System.out.print("ID , Name , Brand , Price , Desc , Stock: ");
                    metier.add(new Product(
                            sc.nextLong(),
                            sc.next(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next(),
                            sc.nextInt()
                    ));
                    break;

                case 4:
                    System.out.print("ID: ");
                    metier.delete(sc.nextLong());
                    System.out.println("Save the deletion by clicking '5' !");
                    break;

                case 5:
                    metier.saveAll();
                    break;
            }
        } while (choice != 6);
            System.out.println("Exiting the menu ...");
    }
}
