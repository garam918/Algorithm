package com.company.baekjoon;

import java.util.*;
import java.io.*;

public class Baekjoon_1012 {

    static StringTokenizer st;
    static int t, m, n, k, x, y, count;
    static int[][] map;
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};

    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine(), " ");
        t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(bf.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new int[m + 1][n + 1];
            visit = new boolean[m + 1][n + 1];
            count = 0;

            for (int j = 0; j < k; j++) {

                st = new StringTokenizer(bf.readLine(), " ");
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;

            }

            for (int ii = 0; ii < m; ii++) {
                for (int jj = 0; jj < n; jj++) {
                    if (map[ii][jj] == 1 && !visit[ii][jj]) {
                        bfs(ii, jj);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Integer> qux = new LinkedList<>();
        Queue<Integer> quy = new LinkedList<>();
        qux.offer(x);
        quy.offer(y);

        while (!qux.isEmpty() && !quy.isEmpty()) {
            x = qux.poll();
            y = quy.poll();
            visit[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int _x = x + dx[i];
                int _y = y + dy[i];
                if (_x >= 0 && _y >= 0 && _x < m && _y < n) {
                    if (map[_x][_y] == 1 && !visit[_x][_y]){
                        qux.add(_x);
                        quy.add(_y);
                        visit[_x][_y] = true;
                    }
                }

            }
        }
    }
}
