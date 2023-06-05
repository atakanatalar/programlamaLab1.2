import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Oyuncu {
	Scanner scanner = new Scanner(System.in);
	private int oyuncuID;
	private String oyuncuAdi;
	private int skor;
	static ArrayList<Integer> secilenFutbolcu = new ArrayList<>();
	static ArrayList<Integer> bSecilenFutbolcu = new ArrayList<>();
	static ArrayList<Integer> secilenBasketbolcu = new ArrayList<>();
	static ArrayList<Integer> bSecilenBasketbolcu = new ArrayList<>();
	
	public Oyuncu(int oyuncuID,String oyuncuAdi,int skor) {
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.skor = skor;
	}
	
	public Oyuncu() {
		
	}
	
	public void kartListesi() {
		ArrayList<Integer> futbolcular;
		ArrayList<Integer> basketbolcular;
		futbolcular = new ArrayList<>();
		basketbolcular = new ArrayList<>();
		for(int i=0;i<Test.futbolcuList.size();i++)
			futbolcular.add(i);
		for(int i=0;i<Test.basketbolcuList.size();i++)
			basketbolcular.add(i);
		
		
		Collections.shuffle(futbolcular);
		Collections.shuffle(basketbolcular);
		for(int i=0;i<Test.futbolcuList.size() / 2;i++) {
			secilenFutbolcu.add(futbolcular.get(i));
			bSecilenFutbolcu.add(futbolcular.get(Test.futbolcuList.size()/2 + i));
			secilenBasketbolcu.add(basketbolcular.get(i));
			bSecilenBasketbolcu.add(basketbolcular.get(Test.basketbolcuList.size()/2 + i));
		}
	}
	
	public abstract int skorGoster();
	
	public abstract void kartSec();
		
	public int getOyuncuID() {
		return oyuncuID;
	}

	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}

	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getSkor() {
		return skor;
	}

	public void setSkor(int skor) {
		this.skor += skor;
	}
	
	
}
