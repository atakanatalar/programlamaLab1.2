import java.util.Random;

public class Kullanici extends Oyuncu{
	Random random = new Random();
	static int futbolcuSec;
	static int basketbolcuSec;
	static int sayac;
	public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
		super(oyuncuID, oyuncuAdi, skor);
		sayac=0;
	}
	
	public Kullanici() {
		sayac = 0;
	}
	
	
	@Override
	public void kartSec() {
		if(sayac % 2 == 0) {
			while(OyunEkrani.futbolcuSecim==true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			OyunEkrani.sira = "basketbolcu";
			OyunEkrani.futbolcuSecim=true;
			System.out.println("Kullanýcý tarafýndan seçilen kart: " + Test.futbolcuList.get(secilenFutbolcu.get(futbolcuSec)).getSporcuIsim() + " -- " + " Penaltý : " +
					Test.futbolcuList.get(secilenFutbolcu.get(futbolcuSec)).getPenalti() + " Serbest Atýþ : " + Test.futbolcuList.get(secilenFutbolcu.get(futbolcuSec)).getSerbestAtis()
					+ " Kaleci ile karþý karþýya : " + Test.futbolcuList.get(secilenFutbolcu.get(futbolcuSec)).getKaleciKarsiKarsiya());
		}
		
		else {
			while(OyunEkrani.basketbolcuSecim==true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			OyunEkrani.sira="futbolcu";
			OyunEkrani.basketbolcuSecim=true;
			System.out.println("Kullanýcý tarafýndan seçilen kart: " + Test.basketbolcuList.get(secilenBasketbolcu.get(basketbolcuSec)).getSporcuIsim() + " -- " + " Ýkilik : " +
					Test.basketbolcuList.get(secilenBasketbolcu.get(basketbolcuSec)).getIkilik() + " Üçlük : " + Test.basketbolcuList.get(secilenBasketbolcu.get(basketbolcuSec)).getUcluk()
					+ " Serbest Atýþ : " + Test.basketbolcuList.get(secilenBasketbolcu.get(basketbolcuSec)).getSerbestAtis());
		}
		
		sayac++;
	}
	
	@Override
	public int skorGoster() {
		return getSkor();	
	}

}
