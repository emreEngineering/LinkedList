import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Listeye Eleman Ekle (Başta)");
            System.out.println("2. Listeye Eleman Ekle (Sonda)");
            System.out.println("3. Listeyi Yazdır");
            System.out.println("4. Başta Eleman Sil");
            System.out.println("5. Sonda Eleman Sil");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz elemanı girin: ");
                    int firstData = scanner.nextInt();
                    list.addFirst(firstData);
                    break;
                case 2:
                    System.out.print("Eklemek istediğiniz elemanı girin: ");
                    int lastData = scanner.nextInt();
                    list.addLast(lastData);
                    break;
                case 3:
                    list.printList();
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}
