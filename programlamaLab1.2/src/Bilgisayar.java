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
			System.out.println("Bilgisayar taraf�ndan se�ilen kart: " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getSporcuIsim() + " -- " + " Penalt� : " +
					Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getPenalti() + " Serbest At�� : " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getSerbestAtis()
					+ " Kaleci ile kar�� kar��ya : " + Test.futbolcuList.get(bSecilenFutbolcu.get(bSec)).getKaleciKarsiKarsiya());
		}
		else {
			bSec = random.nextInt(Oyuncu.bSecilenBasketbolcu.size());
			System.out.println("Bilgisayar taraf�ndan se�ilen kart: " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getSporcuIsim() + " -- " + " �kilik : " +
					Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getIkilik() + " ��l�k : " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getUcluk()
					+ " Serbest At�� : " + Test.basketbolcuList.get(bSecilenBasketbolcu.get(bSec)).getSerbestAtis());
		}
	}

	@Override
	public int skorGoster() {
		return getSkor();
		
	}

}
