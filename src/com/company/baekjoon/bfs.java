package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bfs {

    static int[][] map;
    static boolean[] visit;
    static StringTokenizer st;
    static int a, b, c,start, end;

    public static void Bfs(int i){
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(i);
        visit[i] = true;

        while(!qu.isEmpty()){
            int x = qu.poll();
            System.out.print(x + " ");
            for(int j=1; j<=a; j++){
                if(map[x][j] == 1 && visit[j] == false){
                    qu.offer(j);
                    visit[j] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine()," ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new int[a+1][a+1];
        visit = new boolean[a+1];

        for(int m = 0; m < b ; m++){
            st = new StringTokenizer(bf.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }
        Bfs(c);

    }

}
