package awt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class adda implements Serializable {
	public static void t(int a, int b) {
		System.out.println("a" + (a + b));

	}

	public static void t(int a, float b) {
		System.out.println("b" + (a + b));

	}

	public static void t(int a, double b) {
		System.out.println("d" + (a + b));

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Integer> s = new ArrayList<Integer>();
		String t = in.nextLine();
		int min;
		String[] ss = t.trim().split(" ");
		for (int i = 0; i < ss.length; i++) {
			s.add(Integer.parseInt(ss[i]));
		}
		in.close();
		min=s.get(0);
		int z=0;
		for (int j = 1; j < s.size()-1; j++) {
			if(s.get(j)<min){
				min=s.get(j);
				z++;
			}
			min=s.get(j);
		}
		System.out.println(z);
		// 19 2 4 16 10
	}
}
