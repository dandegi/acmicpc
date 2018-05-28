import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;


public class Main {

    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[][] W = new int[13][13];
        int[]dist = new int[13];

        for (int i = 0; i < 13; i++) {
            Arrays.fill(W[i], INF);
        }
        Arrays.fill(dist, INF);

        for (int i = 1; i < 37; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[2]);

            W[a][b] = W[a][b] > w ? w : W[a][b];
        }

        dijkstra(1, W, dist);
        System.out.println("대구에서 서울까지 : " + dist[3]);

        Arrays.fill(dist, INF);
        dijkstra(3, W, dist);
        System.out.println("서울에서 대구까지 : " + dist[1]);
    }

    static void dijkstra(int start, int[][] W, int[] dist) {

        PriorityQueue<Element> q = new PriorityQueue<>();
        dist[start] = 0;
        q.add(new Element(start, dist[start]));

        while (!q.isEmpty()) {
            Element e = q.poll();

            if (dist[e.node] < e.dist)
                continue;

            for (int i = 1; i < 13; i++) {
                if (W[e.node][i] < INF) {
                    if (dist[i] > dist[e.node] + W[e.node][i]) {
                        dist[i] = dist[e.node] + W[e.node][i];
                        q.add(new Element(i, dist[i]));
                    }
                }
            }
        }
    }
}

class Element implements Comparable<Element> {

    int node;
    int dist;

    Element(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }

    @Override
    public int compareTo(Element o) {
        return this.dist < o.dist ? -1 : 1;
    }
}

//1 대구
//2 인천
//3 서울
//4 천안
//5 강릉
//6 청주
//7 동해
//8 대전
//9 울진
//10 광주
//11 울산
//12 부산

//입력
//1 6 6    간선정보
//1 8 6
//1 11 2
//1 12 1
//2 3 7
//2 4 1
//3 2 3
//3 5 5
//3 6 8
//4 2 3
//4 6 4
//4 8 4
//5 3 3
//5 7 3
//6 3 13
//6 4 3
//6 7 1
//6 9 2
//7 5 5
//7 6 2
//7 10 5
//8 1 3
//8 4 5
//8 9 5
//8 10 3
//9 1 3
//9 6 2
//9 7 3
//9 11 3
//10 1 6
//10 8 3
//10 12 5
//11 9 1
//11 12 2
//12 10 4
//12 11 3