import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 1697 숨바꼭질
public class Main {

	static int N;	// 수빈이의 위치
	static int K;	// 동생의 위치
	static Queue q;
	static int[] visited;

	public static int bfs(){
		q.offer(N);
		visited[N] = 1;
		int p;

		while(!q.isEmpty()){
			p = (int)q.poll();
			if(p==K)
				return visited[p]-1;

			if(p-1 >= 0 && visited[p-1] == 0) {
				visited[p-1] = visited[p]+1;
				q.offer(p-1);
			}

			if(p+1 <= 100000 && visited[p+1] == 0) {
				visited[p+1] = visited[p]+1;
				q.offer(p+1);
			}

			if(p*2 <= 100000 && visited[p*2] == 0) {
				visited[p*2] = visited[p]+1;
				q.offer(p*2);
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		q = new LinkedList();
		visited = new int[100001];

		System.out.println(bfs());
	}
}
