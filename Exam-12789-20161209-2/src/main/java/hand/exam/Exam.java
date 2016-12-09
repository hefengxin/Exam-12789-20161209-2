package hand.exam;

import java.util.Scanner;

public class Exam {
	static Scanner sr = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("请输入工资：");
		float sum = giveMoney();
		System.out.println("应该纳税：" + sum);

	}

	private static float giveMoney() {
		float gongzi = sr.nextFloat();
		float sum = 0;
		if (gongzi <= 1500) {
			sum = (float) (gongzi * 0.03);
		} else if (gongzi > 1500 & gongzi <= 4500) {
			sum = (float) ((gongzi - 1500) * 0.1);
		} else if (gongzi > 4500 && gongzi <= 9000) {
			sum = (float) ((gongzi - 4500) * 0.2);
		} else if (gongzi > 9000 && gongzi <= 35000) {
			sum = (float) ((gongzi - 9000) * 0.25);
		} else if (gongzi > 35000 && gongzi <= 55000) {
			sum = (float) ((gongzi - 35000) * 0.3);
		} else if (gongzi > 55000 && gongzi <= 80000) {
			sum = (float) ((gongzi - 55000) * 0.35);
		} else if (gongzi > 80000) {
			sum = (float) ((gongzi - 80000) * 0.45);
		}
		return sum;
	}

}
