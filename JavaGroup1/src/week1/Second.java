public class Second{
	public static void main(String []args){
		//System.out.println(args.length);
		//System.out.println("Hi from Second");
		int argLength = args.length;
		if(argLength>0){
			for(int i=0; i<args.length; i++){
				System.out.println(args[i]);
			}
		}
	}
}