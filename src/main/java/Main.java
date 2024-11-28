import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OgrenciYonetim yonetim = new OgrenciYonetim();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n ----Öğrenci yönetim sistemi ------");
            System.out.println("1.ürünü ekle ");
            System.out.println("2.öğrencileri listele ");
            System.out.println("3.öğrenci sil ");
            System.out.println("4.çıkış ");
            System.out.println("seçiminiz :");

            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    System.out.print("Öğrenciniin adı : ");
                    String ad = scanner.nextLine();
                    System.out.print("Öğrencini numarası : ");
                    int numara = scanner.nextInt();
                    System.out.print("Not ortalaması : ");
                    double notOrtalamasi = scanner.nextDouble();

                    yonetim.ogrenciEkle(new Ogrenci(ad, numara, notOrtalamasi));

                    break;
                case 2:
                    yonetim.ogrencileriListele();
                    break;

                case 3:
                    System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz :");
                    int silinecekNumara = scanner.nextInt();
                    yonetim.ogrenciSil(silinecekNumara);
                    break;
                case 4:
                    System.out.println("Sistemden çıkılıyor ....");
                    return;
                default:
                    System.out.println("Geçesiz seçim Lütfen tekrar deneyiniz.");
            }

        }


    }


}
