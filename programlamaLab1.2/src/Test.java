import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;


public class Test {
    Random random = new Random();
	static ArrayList<Futbolcu> futbolcuList = new ArrayList<Futbolcu>();
	static ArrayList<Basketbolcu> basketbolcuList = new ArrayList<Basketbolcu>();
	static Kullanici kullanici;
	static Bilgisayar bilgisayar;
	static int pB;
	Oyuncu oyuncu;
	Futbolcu futbolcu;
	Basketbolcu basketbolcu;
	OyunEkrani oyunEkrani;
	BaslangicEkrani baslangicEkrani;
	
	public void baslat() {
		ozellikAta();
		baslangicEkrani = new BaslangicEkrani();
		baslangicEkrani.ekran();
		kullanici = new Kullanici(1,BaslangicEkrani.isim,0);
		bilgisayar = new Bilgisayar(2,"Bilgisayar",0);
		futbolcu = new Futbolcu();
		basketbolcu = new Basketbolcu();
		kullanici.kartListesi();
		run();
		BitisEkrani bitisEkrani = new BitisEkrani(BaslangicEkrani.isim);
		bitisEkrani.setVisible(true);
	}
	
    public void run() {
		while(true) {		
			kartKaldiMi();
			bilgisayar.kartSec();
			kullanici.kartSec();
			pozisyonBilgisi();
			if(Bilgisayar.bSecilenFutbolcu.size()==0 && Bilgisayar.bSecilenBasketbolcu.size()==0)
				break;
		}
	}
	
    
	public void kartKaldiMi() {
		if(Kullanici.sayac%2==0) {
			if(Bilgisayar.bSecilenFutbolcu.size()==0) {
				Kullanici.sayac++;
			}
		}else {
			if(Bilgisayar.bSecilenBasketbolcu.size()==0) {
				Kullanici.sayac++;
			}
		}
	}
	
	public int pozisyonSecimi() {
		int pB = random.nextInt(3);
		if(pB==0 && Kullanici.sayac % 2 == 1)
			OyunEkrani.pozisyonBilgisi = "Penalti";
		else if(pB==1 && Kullanici.sayac % 2 == 1)
			OyunEkrani.pozisyonBilgisi = "Serbest Atýþ";
		else if(pB==2 && Kullanici.sayac % 2 == 1)
			OyunEkrani.pozisyonBilgisi = "Kaleci ile karþý karþýya";
		else if(pB==0 && Kullanici.sayac % 2 == 0)
			OyunEkrani.pozisyonBilgisi = "Ýkilik";
		else if(pB==1 && Kullanici.sayac % 2 == 0)
			OyunEkrani.pozisyonBilgisi = "Üçlük";
		else if(pB==2 && Kullanici.sayac % 2 == 0)
			OyunEkrani.pozisyonBilgisi = "Serbest Atýþ";
		return pB;
	}
	
	public void pozisyonBilgisi() {
		pB = pozisyonSecimi();
		int [] pFutbolcu = new int[3];
		int [] pBasketbolcu = new int[3];
		if(Kullanici.sayac%2==1) {
			pFutbolcu[0] = futbolcuList.get(Oyuncu.bSecilenFutbolcu.get(Bilgisayar.bSec)).getPenalti();
			pFutbolcu[1] = futbolcuList.get(Oyuncu.bSecilenFutbolcu.get(Bilgisayar.bSec)).getSerbestAtis();
			pFutbolcu[2] = futbolcuList.get(Oyuncu.bSecilenFutbolcu.get(Bilgisayar.bSec)).getKaleciKarsiKarsiya();
		}
		if(Kullanici.sayac%2==0) {
			pBasketbolcu[0] = basketbolcuList.get(Oyuncu.bSecilenBasketbolcu.get(Bilgisayar.bSec)).getIkilik();
			pBasketbolcu[1] = basketbolcuList.get(Oyuncu.bSecilenBasketbolcu.get(Bilgisayar.bSec)).getUcluk();
			pBasketbolcu[2] = basketbolcuList.get(Oyuncu.bSecilenBasketbolcu.get(Bilgisayar.bSec)).getSerbestAtis();
		}
		
		int [] pkFutbolcu = new int[3];
		pkFutbolcu[0] = futbolcuList.get(Oyuncu.secilenFutbolcu.get(Kullanici.futbolcuSec)).getPenalti();
		pkFutbolcu[1] = futbolcuList.get(Oyuncu.secilenFutbolcu.get(Kullanici.futbolcuSec)).getSerbestAtis();
		pkFutbolcu[2] = futbolcuList.get(Oyuncu.secilenFutbolcu.get(Kullanici.futbolcuSec)).getKaleciKarsiKarsiya();
		
		int [] pkBasketbolcu = new int[3];
		pkBasketbolcu[0] = basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(Kullanici.basketbolcuSec)).getIkilik();
		pkBasketbolcu[1] = basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(Kullanici.basketbolcuSec)).getUcluk();
		pkBasketbolcu[2] = basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(Kullanici.basketbolcuSec)).getSerbestAtis();
		
		if(Kullanici.sayac%2==1) {
			if(pFutbolcu[pB] > pkFutbolcu[pB]) {
				bilgisayarKazandi(Oyuncu.bSecilenFutbolcu);
			}
			else if(pFutbolcu[pB] == pkFutbolcu[pB]) {
				System.out.println("Berabere");
				OyunEkrani.oyunDurum = "Berabere";
				if(kullanici.getSkor() + bilgisayar.getSkor() == 70) {
					pozisyonBilgisi();
				}
			}
			else {
				kullaniciKazandi(Oyuncu.bSecilenFutbolcu);
			}
		}
		
		else if(Kullanici.sayac%2==0) {
			if(pBasketbolcu[pB] > pkBasketbolcu[pB]) {
				bilgisayarKazandi(Oyuncu.bSecilenBasketbolcu);
			}
			else if(pBasketbolcu[pB] == pkBasketbolcu[pB]) {
				System.out.println("Berabere");
				OyunEkrani.oyunDurum = "Berabere";
				if(kullanici.getSkor() + bilgisayar.getSkor() == 70) {
					pozisyonBilgisi();
				}
			}
			else {
				kullaniciKazandi(Oyuncu.bSecilenBasketbolcu);
			}
		}
	}
	
	public void bilgisayarKazandi(ArrayList<Integer> oyuncu) {
		System.out.println("Bilgisayar kazandý");
		oyuncu.remove(Bilgisayar.bSec);
		bilgisayar.setSkor(10);
		OyunEkrani.oyunDurum = "Bilgisayar Kazandi";
	}
	
	
    public void kullaniciKazandi(ArrayList<Integer> oyuncu) {
		System.out.println("Kullanýcý kazandý");
		oyuncu.remove(Bilgisayar.bSec);
		kullanici.setSkor(10);
		OyunEkrani.oyunDurum = "Kullanici Kazandi";
	}
    
	
    public void ozellikAta() {
		futbolcuList.add(new Futbolcu("Ronaldo", "Juventus",new ImageIcon("RONALDO.png"),95,85,90));
		futbolcuList.add(new Futbolcu("Messi", "Barcelona",new ImageIcon("MESSI.png"),90,95,95));
		futbolcuList.add(new Futbolcu("Lewandowski", "Bayern",new ImageIcon("LEWANDOWSKI.png"),85,80,90));
		futbolcuList.add(new Futbolcu("Neymar", "PSG",new ImageIcon("NEYMAR.png"),85,90,85));
		futbolcuList.add(new Futbolcu("Hakan", "Milan",new ImageIcon("HAKAN.png"),70,85,75));
		futbolcuList.add(new Futbolcu("Cengiz", "Roma",new ImageIcon("CENGIZ.png"),75,70,85));
		futbolcuList.add(new Futbolcu("Burak", "Lille",new ImageIcon("BURAK.png"),90,70,80));
		futbolcuList.add(new Futbolcu("Ozan", "Fenerbahçe",new ImageIcon("OZAN.png"),80,75,80));

		basketbolcuList.add(new Basketbolcu("Giannis", "Milwaukee Bucks",new ImageIcon("Giannis.png"),85,70,90));
		basketbolcuList.add(new Basketbolcu("Damian", "Portland Trail Blazers",new ImageIcon("Damian.png"),70,85,95));
		basketbolcuList.add(new Basketbolcu("Stephen", "Golden State Warriors",new ImageIcon("Stephen.png"),85,95,90));
		basketbolcuList.add(new Basketbolcu("Kawhi", "Los Angeles Clippers",new ImageIcon("Kawhi.png"),75,75,95));
		basketbolcuList.add(new Basketbolcu("James", "Houston Rockets",new ImageIcon("James.png"),95,95,75));
		basketbolcuList.add(new Basketbolcu("Jimmy", "Miami Heat",new ImageIcon("Jimmy.png"),75,90,80));
		basketbolcuList.add(new Basketbolcu("Lebron", "Los Angeles Lakers",new ImageIcon("Lebron.png"),90,80,90));
		basketbolcuList.add(new Basketbolcu("Anthony", "Los Angeles Lakers",new ImageIcon("Anthony.png"),80,85,85));
	}
}
