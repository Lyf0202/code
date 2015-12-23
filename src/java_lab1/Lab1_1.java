package java_lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 梁焱烽 2013213463
 * Java programming Fall 2015-2016
 * Lab 1
 * 第一次代码修改
 * 又一次修改
 */
public class Lab1_1 {

	public static Map<String, String> getTime(long seconds) {

		seconds = seconds < 0? -1*seconds : seconds;
		Map<String, String> map = new HashMap<String, String>();
		int time = 0;
		String type = "";
		if (seconds >= 86400) {
			time = (int) (seconds / 86400);
			type = "days";
		} else if (seconds >= 3600) {
			time = (int) (seconds / 3600);
			type = "hours";
		} else {
			time = (int) (seconds / 60);
			type = "minutes";
		}
		map.put("type", type);
		map.put("time", String.valueOf(time));
		return map;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the number of seconds: ");
			long seconts = 0;
			try {
				seconts = in.nextLong();
				Map<String, String> map = Lab1_1.getTime(seconts);
				System.out.println("The number of " + map.get("type")
						+ " in that many seconds is: " + map.get("time"));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("无效输入!");
				i--;
			}
		}
	}

}
