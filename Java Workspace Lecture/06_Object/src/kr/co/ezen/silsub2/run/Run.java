package kr.co.ezen.silsub2.run;

import kr.co.ezen.silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pro = new Product();

		pro.setpName("mouse");
		pro.setPrice(50000);
		pro.setBrand("ezen");

		System.out.println(pro.informaion());
	}

}
