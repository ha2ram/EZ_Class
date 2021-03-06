package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample_16 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수=" + set.size());

		for (String st : set)
			System.out.println(st);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			// System.out.println(itr.next());
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
