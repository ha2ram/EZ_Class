package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

public class SetExample_17 {

	public static void main(String[] args) {
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set<Object> set = new HashSet<Object>();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set); // [1, 1, 2, 3, 4] 중복된 값 제외, 1은 String과 Wraper 타입
	}
}
