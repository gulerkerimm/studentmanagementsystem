import java.lang.ref.PhantomReference;

public class Ogrenci {
//Ogrenci bilgilerini tutmak için alanlar (fieldss)oluşturuyoru.
    private String ad; // Öğrencini adi (Nesneye özgüü bir bilgi )
    private int numara ;//Öğrenci numarası (Benzersiz kimlik)
    private double notOrtalmasi; //Öğrencinin not ortalaması

    //Constructor :Bu metot bir nesne oluşturulduğunda bilgileri başlatır


    public Ogrenci(String ad, int numara, double notOrtalmasi) {
        this.ad = ad;
        this.numara = numara;
        this.notOrtalmasi = notOrtalmasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getNotOrtalmasi() {
        return notOrtalmasi;
    }

    public void setNotOrtalmasi(double notOrtalmasi) {
        this.notOrtalmasi = notOrtalmasi;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
}
