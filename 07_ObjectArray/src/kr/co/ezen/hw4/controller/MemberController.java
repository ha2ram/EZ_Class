package kr.co.ezen.hw4.controller;

import kr.co.ezen.hw4.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{
		mem[0] = new Member("user01", "pass01", "홍길동1", 20, 'M', "hong1123@naver.com");
		mem[1] = new Member("user02", "pass02", "홍길동2", 60, 'M', "hong2123@naver.com");
		mem[2] = new Member("user03", "pass03", "홍길동3", 17, 'F', "hong3123@naver.com");
		mem[3] = new Member("user04", "pass04", "홍길동4", 57, 'M', "hong4123@naver.com");
		mem[4] = new Member("user05", "pass05", "홍길동5", 45, 'F', "hong5123@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return this.memberCount;
	}

	public Member[] getMem() {
		return this.mem;
	}

	public Member checkId(String userid) {
		Member m = null;

		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userid))
				m = mem[i];
		}
		return m;
	}

	public void insertMember(Member m) {
		mem[memberCount] = m;
		memberCount++;
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;

		for (int i = 0; i < memberCount; i++) {
			if (menu == 1) {
				if (mem[i].getUserId().equals(search))
					searchMember = mem[i];
			} else if (menu == 2) {
				if (mem[i].getName().equals(search))
					searchMember = mem[i];
			} else {
				if (mem[i].getEmail().equals(search))
					searchMember = mem[i];
			}
		}

		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {
		if (menu == 1) {
			m.setUserId(update);
		} else if (menu == 2) {
			m.setName(update);
		} else {
			m.setEmail(update);
		}
	}

	public void deleteMember(String userId) {

		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				for (int j = i; j < memberCount; j++) {
					if (j == memberCount - 1) {
						break;
					} else {
						mem[j] = mem[j + 1];
					}
				}
			}
		}
		memberCount--;
	}

	public Member[] sortIdAsc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;

				}
			}
		}
		return copy;
	}

	// A,B A == B --> 0 A > B --> -1 A < B --> 1
	public Member[] sortIdDesc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;

				}
			}
		}
		return copy;
	}

	public Member[] sortAsc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortAgeDesc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() - copy[j].getAge() > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}

	public Member[] sortGenderDesc() {
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getGender() == 'M' && copy[j].getGender() == 'F') {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		return copy;
	}
}
