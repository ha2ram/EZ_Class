package chap12.Thread_01;

class SmallLetters implements Runnable {

	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
	}
}

public class MultithreadExample_04 {

	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		
		for(char ch:arr)
			System.out.print(ch);
	}
}
