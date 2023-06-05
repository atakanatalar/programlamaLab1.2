import javax.swing.ImageIcon;

public class Futbolcu extends Sporcu{
	private int penalti;
	private int serbestAtis;
	private int kaleciKarsiKarsiya;
	
	public Futbolcu(String sporcuIsim, String sporcuTakim,ImageIcon imageIcon,int penalti,int serbestAtis,int kaleciKarsiKarsiya) {
		super(sporcuIsim, sporcuTakim,imageIcon);
		this.penalti = penalti;
		this.serbestAtis = serbestAtis;
		this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
	}
	
	public Futbolcu() {
		
	}
	
	@Override
	public void sporcuPuaniGoster() {
		System.out.println("-----Futbolcu Kartlariniz-----");
		for(int i=0;i<Oyuncu.secilenFutbolcu.size();i++) {
			System.out.print(" Isim = " + Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getSporcuIsim());
			System.out.print(" Takim = " + Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getSporcuTakim());
			System.out.print(" Penalti = " + Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getPenalti());
			System.out.print(" Serbest Atýþ = " + Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getSerbestAtis());
			System.out.print(" Kaleci ile karþý karþýya = " + Test.futbolcuList.get(Oyuncu.secilenFutbolcu.get(i)).getKaleciKarsiKarsiya());
			System.out.println();
		
		}
	}
	public boolean kartKullanildiMi() {
		return true;
	}

	public int getPenalti() {
		return penalti;
	}

	public void setPenalti(int penalti) {
		this.penalti = penalti;
	}

	public int getSerbestAtis() {
		return serbestAtis;
	}

	public void setSerbestAtis(int serbestAtis) {
		this.serbestAtis = serbestAtis;
	}

	public int getKaleciKarsiKarsiya() {
		return kaleciKarsiKarsiya;
	}

	public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
		this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
	}
	
	

}
