package keluarga;

public class Ayah {

	private String muka;
	private String hidung;
	private String nama;
	public Ayah()
	{
		this.muka= "Oval";
		this.hidung="Mancung";
	}

	public String getHidung() {
		return hidung;
	}

	public void setHidung(String hidung) {
		this.hidung = hidung;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getMuka() {
		return muka;
	}

	public void setMuka(String muka) {
		this.muka = muka;
	}

	public void MencariUang()
	{
		System.out.println("Dengan Bekerja");
	}	
	
	
}
