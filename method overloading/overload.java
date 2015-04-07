public class overload {
	public static int average(int n1, int n2){ //A
		return (n1+n2)/2;
	}

	public static double average(double n1, double n2){ //B
		return (n1+n2)/2;
	}

	public static int average(int n1, int n2, int n3){ //C
		return (n1+n2+n3)/3;
	}

	public static int average(int n1, int n2, int n3, int n4){ //D
		return (n1+n2+n3+n4)/4;
	}

	public static void main(String args[]){
		System.out.println(average (1, 2)); 			//A
		System.out.println(average (1.0, 2.0));			//B
		System.out.println(average (1, 2, 3));			//C
		System.out.println(average (1.0, 2));			//B
		System.out.println(average(1, 2, 3, 4));		//D
	}
}