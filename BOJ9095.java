import java.util.Scanner;

// 9095번 1,2,3 더하기
public class Main {
	static int N;
	static int count;

	public static void dfs(int adder) {
		if(adder < N){
			dfs(adder+1);
			dfs(adder+2);
			dfs(adder+3);
		}else if(adder == N){
			count++;
			return;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			// dfs 재귀
			N = sc.nextInt();
			dfs(0);
			System.out.println(count);
			count = 0;
		}
	}
}
