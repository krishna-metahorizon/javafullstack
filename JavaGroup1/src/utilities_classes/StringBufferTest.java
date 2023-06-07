package utilities_classes;

public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer	append(boolean b)		
		StringBuffer sb1 = new StringBuffer("Meta");
		StringBuffer sb2 = sb1.append(true);
		System.out.println(sb1);
		System.out.println(sb2);

	}

}
