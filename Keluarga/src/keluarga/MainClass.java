package keluarga;

public class MainClass {

	public static void main(String[] args) {
	
		AnakLaki anak= new AnakLaki();
		anak.setNama("Seno");
		anak.setMuka("Lonjong");
		System.out.println("Namanya	:"+anak.getNama());
		System.out.println("Beratnya "+anak.getBerat());
		System.out.println("Hidungnya : "+anak.getHidung());
		System.out.println("Mukanya "+anak.getMuka());
		System.out.println("Umurnya "+anak.getUmur());
		System.out.print("Cara Mencari Uang : "); 
		anak.MencariUang();
	}

}
