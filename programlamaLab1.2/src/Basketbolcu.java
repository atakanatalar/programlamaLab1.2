import javax.swing.ImageIcon;

public class Basketbolcu extends Sporcu {
	private int ikilik;
	private int ucluk;
	private int serbestAtis;
	

	public Basketbolcu(String sporcuIsim, String sporcuTakim,ImageIcon imageIcon ,int ikilik,int ucluk,int serbestAtis) {
		super(sporcuIsim, sporcuTakim,imageIcon);
		this.ikilik = ikilik;
		this.ucluk = ucluk;
		this.serbestAtis = serbestAtis;
		
	}
	
	public Basketbolcu() {
		
	}
	
	@Override
	public void sporcuPuaniGoster() {
		System.out.println("-----Basketbolcu Kartlariniz-----");
		for(int i=0;i<Oyuncu.secilenBasketbolcu.size();i++) {
			System.out.print(" Isim = " + Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getSporcuIsim());
			System.out.print(" Takim = " + Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getSporcuTakim());
			System.out.print(" Ýkilik = " + Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getIkilik());
			System.out.print(" Üçlük = " + Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getUcluk());
			System.out.print(" Serbest Atýþ = " + Test.basketbolcuList.get(Oyuncu.secilenBasketbolcu.get(i)).getSerbestAtis());
			System.out.println();
		}
	}
	
	public boolean kartKullanildiMi() {
		return true;
	}

	public int getIkilik() {
		return ikilik;
	}

	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}

	public int getUcluk() {
		return ucluk;
	}

	public void setUcluk(int ucluk) {
		this.ucluk = ucluk;
	}

	public int getSerbestAtis() {
		return serbestAtis;
	}

	public void setSerbestAtis(int serbestAtis) {
		this.serbestAtis = serbestAtis;
	}

}
