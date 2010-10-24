public class tujuh {
	public static void main(String args[]){

		double awal=1;
		double akhir=20;
		double jumlah=0;
		double rata;
		System.out.println("Angka Yang Pertama = "+awal);
		System.out.println("Angka Yang Terakhir = "+akhir);
		System.out.print("Jumlah Dari deretan angka diatas = ");

		while(awal<=akhir){
			jumlah=jumlah+awal;
			awal++;
		}
		System.out.println(jumlah);
		rata=jumlah/akhir;
		System.out.print("Rata-Rata Dari deretan diatas = "+rata);
	}
}