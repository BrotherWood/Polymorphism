package keluarga;

public class AnakLaki extends Ayah {
	private int berat;
	private int umur;
	
	public AnakLaki() {
		this.berat=50;
		this.umur=15;
		
	}
	
	public int getBerat() {
		return berat;
	}
	public void setBerat(int berat) {
		this.berat = berat;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	//overload
	public int setBerat()
	{
		return berat=60;
	}

	@Override
	public void MencariUang() {
		// TODO Auto-generated method stub
		
		System.out.println("Minta Ke Bapak");
	}

	
	
	
	
}
