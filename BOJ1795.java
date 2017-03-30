import java.util.Arrays;
import java.util.Scanner;

// 1795번 암호만들기
public class Main {
	static int L;
	static int C;
	static char[] set;

	public static void dfs(int index, String str) {
		String password = str;

		if (str.length() < L) {
			password += set[index];

			if (password.length() == L) {
				int aeio = 0;
				int bcdf = 0;
				char[] pSet = password.toCharArray();

				for (int i = 0; i < L; i++) {
					if (pSet[i] == 'a' || pSet[i] == 'e' || pSet[i] == 'i' || pSet[i] == 'o' || pSet[i] == 'u')
						aeio++;
					else
						bcdf++;
				}

				if (aeio > 0 && bcdf > 1)
					System.out.println(password);

				return;
			}

			for (int i = 1; i < C - index; i++) {
				dfs(index + i, password);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		C = sc.nextInt();
		set = new char[C];

		for (int i = 0; i < set.length; i++) {
			set[i] = sc.next().charAt(0);
		}

		Arrays.sort(set);

		for (int i = 0; i < C; i++)
			dfs(i, "");
	}

}
