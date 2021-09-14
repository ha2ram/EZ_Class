package kr.co.ezen.silsub1.run;

import kr.co.ezen.silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		Member mem = new Member();

		mem.setMemberId("user");
		mem.setMemberPwd("1234");
		mem.setMemberName("루피");
		mem.setAge(20);
		mem.setGender('남');
		mem.setPhone("010-1234-5678");
		mem.setEmail("user@abc.com");

		System.out.println(mem.getMemberId());
		System.out.println(mem.getMemberPwd());
		System.out.println(mem.getMemberName());
		System.out.println(mem.getAge());
		System.out.println(mem.getGender());
		System.out.println(mem.getPhone());
		System.out.println(mem.getEmail());
	}

}
