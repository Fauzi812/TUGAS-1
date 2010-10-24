public class sembilan {
	public static void main(String args[]){

		int awal=1;
		int akhir=110;
		int b;

		for(awal=1;awal<=akhir;awal++){
			if(awal%5==0){
				System.out.print("JONI");
			} else {
				System.out.print(awal);
			}
			if(awal<akhir){
			System.out.print(" ");
			if(awal%11==0){
				System.out.print("\n");
			}	
			}
		}
	}
}