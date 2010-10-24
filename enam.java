public class enam {
	public static void main(String args[]){

		int awal=1;
		int akhir=10;
		int jumlah=0;
		System.out.println("Angka Yang Pertama = "+awal);
		System.out.println("Angka Yang Terakhir = "+akhir);

		while(awal<=akhir){
			jumlah=jumlah+awal;
			awal++;
		}
		System.out.println(jumlah);
	}
}