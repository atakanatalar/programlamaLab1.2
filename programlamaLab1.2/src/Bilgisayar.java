import java.util.Random;

public class Bilgisayar extends Oyuncu {
	Random random = new Random();
	static int bSec;
	public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
		super(oyuncuID, oyuncuAdi, skor);
	}
	
	public Bilgisayar() {
		
	}
	@Override
	public void kartSec() {
		if(Kullanici.sayac%2==0) {	
			bSec = random.nextInt(Oyuncu.bSecilenFutbolcu.size());
			System.out.println("Bilgisayar tarafýndan seçilen kart: " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getSporcuIsim() + " -- " + " Penaltý : " +
					Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getPenalti() + " Serbest Atýþ : " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getSerbestAtis()
					+ " Kaleci ile karþý karþýya : " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getKaleciKarsiKarsiya());
		}
		else {
			bSec = random.nextInt(Oyuncu.bSecilenBasketbolcu.size());
			System.out.println("Bilgisayar tarafýndan seçilen kart: " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getSporcuIsim() + " -- " + " Ýkilik : " +
					Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getIkilik() + " Üçlük : " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getUcluk()
					+ " Serbest Atýþ : " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getSerbestAtis());
		}
	}

	@Override
	public int skorGoster() {
		return getSkor();
		
	}

}
