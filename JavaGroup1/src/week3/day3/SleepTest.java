package week3.day3;
//Sleep for a while
public class SleepTest {
	public static void main(String[] args) {
		// Thread.sleep(ms);//
		int start = 1;
		int stop = 5;
		final int INTERVAL = 1000; // milliseconds
		try {
			while (start <= stop) {
				System.out.println(start);
				Thread.sleep(INTERVAL);
				start++;
			}
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		} finally {
			System.out.println("Finally");
		}

	}

}
