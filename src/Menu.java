import java.util.Scanner;

/**
 * Menu sınıfı, kullanıcıya bir menü gösterir ve kullanıcının seçimlerine göre işlemler yapar.
 */
public class Menu {
    /**
     * Bu fonksiyon programın giriş noktasıdır. Kullanıcıya bir menü gösterir, kullanıcının seçimlerine göre işlemler yapar ve döngüyle devam eder. Program, kullanıcının “0” seçeneğini seçene kadar çalışır.
     * @param args komut satırı argümanları
     */
    public static void main(String[] args) {
        MusicPlayer player = MusicPlayer.getInstance();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("LibraryMenu");
            System.out.println("Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Display available book");
            System.out.println("3. Check out a book");
            System.out.println("4. Return a book ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name : ");
                    scanner.nextLine();
                    String songToAdd = scanner.nextLine();
                    player.addToPlaylist(songToAdd);
                    break;

                case 2:
                    System.out.print("Enter name for remove playlist: ");
                    scanner.nextLine();
                    String songToRemove = scanner.nextLine();
                    player.removeFromPlaylist(songToRemove);
                    break;
                case 3:
                    player.showPlaylist();
                    break;
                case 4:
                    System.out.print("Enter username: ");
                    String username = scanner.next();
                    System.out.print("Enter password: ");
                    String password = scanner.next();
                    player.authenticateUser(username, password);
                    break;
                case 0:
                    System.out.println("Exit is done!!! ");
                    break;
                default:
                    System.out.println("Invalid, try again :( ");
            }
        } while (choice != 0);

        scanner.close();
    }
}