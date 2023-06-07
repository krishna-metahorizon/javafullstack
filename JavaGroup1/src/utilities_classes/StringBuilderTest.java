package utilities_classes;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder	append(boolean b)
		StringBuilder sb1 = new StringBuilder("Metahorizon");
		StringBuilder sb2 = sb1.append(false);
		System.out.println(sb1);
		System.out.println(sb2);
	}
}