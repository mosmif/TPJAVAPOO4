import java.io.File;
import java.util.Scanner;

public class LsSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = dir.listFiles();

        for (File f : files) {
            String type = f.isDirectory() ? "<DIR>" : "<FILE>";

            String permissions = "";
            permissions += f.canRead() ? "r" : "-";
            permissions += f.canWrite() ? "w" : "-";
            permissions += f.isHidden() ? "h" : "-";

            System.out.println(f.getAbsolutePath() + " " + type + " " + permissions);
        }
    }
}


