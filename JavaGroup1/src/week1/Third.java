public class Third{
	public static void main(String []args){
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		if(args.length>=2){
			int num1 = Integer.parseInt(args[0]); //String
			int num2 = Integer.parseInt(args[1]); //String
			//read from file (notepad file)
			//read from database (mysql)
			int num3 = num1 + num2;
			System.out.println("Sum : "+num3);
		}
	}
}