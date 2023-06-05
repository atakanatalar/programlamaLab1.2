import javax.swing.ImageIcon;

public abstract class Sporcu {
	private String sporcuIsim;
	private String sporcuTakim;
	private ImageIcon imageIcon;
	
	public Sporcu(String sporcuIsim,String sporcuTakim,ImageIcon imageIcon) {
		this.sporcuIsim = sporcuIsim;
		this.sporcuTakim = sporcuTakim;
		this.imageIcon = imageIcon;
	}
	
	
	public Sporcu() {
		
	}
	
	public abstract void sporcuPuaniGoster();
		
	public String getSporcuIsim() {
		return sporcuIsim;
	}

	public void setSporcuIsim(String sporcuIsim) {
		this.sporcuIsim = sporcuIsim;
	}

	public String getSporcuTakim() {
		return sporcuTakim;
	}

	public void setSporcuTakim(String sporcuTakim) {
		this.sporcuTakim = sporcuTakim;
	}
	
	public ImageIcon getImageIcon() {
		return imageIcon;
	}


	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}


}
