package week1.day2;

public class Twosumproblem {

	public static void main(String[] args) {

		int num[] = { 2,11,5,7,3,5,4,8,1 };
		int target = 9;
		for (int i = 0; i < num.length; i++) {
			System.out.println("i value" +i );
			for (int j = i + 1; j < num.length; j++) {
				System.out.println("j value" +j );
				if (num[i] + num[j] == target) {
					System.out.println(num[i] + "with index" +i);
					System.out.println(num[j] + "with index" +j);

				}

			}

		}

	}

}
