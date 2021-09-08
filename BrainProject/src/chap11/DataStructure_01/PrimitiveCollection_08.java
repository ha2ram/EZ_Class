package chap11.DataStructure_01;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection_08 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
	}

}

// 정수 10,20,30을 LinkedList에 저장하여 이터레이터로 출력하기