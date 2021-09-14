package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber {
	int num;

	public SimpleNumber(int n) {
		num = n;
	}

	public String toString() {

		// return num + "";
		return String.valueOf(num); // 생성자 호출 없이 객체 생성, num 타입을 String 타입으로 변경
	}

	public boolean equals(Object obj) {
		SimpleNumber comp = (SimpleNumber) obj;
		if (comp.num == num)
			return true;
		else
			return false;
	}

	public int hashCode() {

		return num % 3; // 확실하게 비교하려고 나머지 비교
	}
}

public class SetExample_20 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));

		System.out.println("저장된 데이터 수:" + hSet.size());

		Iterator<SimpleNumber> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
