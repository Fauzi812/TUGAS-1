public class duabelas {
	public static void main(String args[]){

		int a;
		int b;
		int panjang=10;
		int lebar=5;

		for(a=1;a<=lebar;a++){
			if(a%2==0){
				System.out.print(" ");
			}
			for(b=1;b<=panjang;b++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	
	}
}