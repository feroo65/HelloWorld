package helloworld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bárki!");
		System.out.println("hossz: "+args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		
		int a, b, c, d, e;
		
		//a = Integer.parseInt(args[0]);
		//b = Integer.parseInt(args[1]);
		//c = Integer.parseInt(args[2]);
		//d = Integer.parseInt(args[3]);
		//e = Integer.parseInt(args[4]);
		
		a = 10; b = 10; c = 12;
		
		
		
		System.out.println(a*b*c);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//System.out.println(a*b*c*d*e/5);
		
		
		waiting(40000);
		
		System.out.println("vége");
	}
	public static void waiting(long millisecond){
        long max = millisecond;
        for(long i = 0;  i < max; i++){
            for(long j = 0;  j < max; j++){
                 
            }
        }
    }

}
