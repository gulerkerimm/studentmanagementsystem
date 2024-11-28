import java.util.ArrayList; // Öğrencileri bir liste içinde tutmak için ArrayList kullanıyoruz.

public class OgrenciYonetim {

    private ArrayList<Ogrenci> ogrenciler;// Öğrenci listesini tanımlıyoruz.

    // Constructor: Listeyi başlatmak için.
    public OgrenciYonetim() {
        ogrenciler = new ArrayList<>();// Listeyi oluşturuyoruz. Başlangıçta boş.

    }
    // Öğrenci eklemek için metot
    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci); // Öğrenciyi listeye ekliyoruz.
        System.out.println(ogrenci.getAd() + "başarıyla eklendi .");
    }
    // Öğrencileri listelemek için metot
    public void ogrencileriListele() {
        if (ogrenciler.isEmpty()) { // Eğer liste boşsa kullanıcıya mesaj gösteriyoruz.
            System.out.println("Liatede öğrenci bulunmuyor.");

            return;
        }

        // Liste boş değilse tüm öğrencileri döngüyle yazdırıyoruz.
        System.out.println("Öğrenci listesi : ");
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("Ad: " + ogrenci.getAd() + ", Numara: " + ogrenci.getNumara() + ", Not Ortalaması: " + ogrenci.getNotOrtalmasi());

        }

    }

    public void ogrenciSil(int numara) {
        for (Ogrenci ogrenci : ogrenciler) { // Her bir öğrenciyi kontrol ediyoruz.
            if (ogrenci.getNumara() == numara) {
                ogrenciler.remove(ogrenci);
                System.out.println("Öğrenci başarıyşa silindi. ");
                return;
            }

        }
        System.out.println("Belirtilen numara sahip öğrenci bulunamadı .");
    }


}
