package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_2606 {

    static int[][] map;
    static boolean[] visit;
    static StringTokenizer st,st2;
    static int a, b, c,start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine());
        st2 = new StringTokenizer(bf.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st2.nextToken());
        c = 0;
        map = new int[a+1][a+1];
        visit = new boolean[a+1];

        for (int m = 0 ; m < b; m++ ){
            st = new StringTokenizer(bf.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while (!q.isEmpty()){
            int x = q.poll();

            for (int i=0; i<=a; i++){
               if(map[x][i] == 1 && !visit[i]){
                   q.offer(i);
                   visit[i] = true;
                   c++;
               }
            }

    }
        System.out.println(c-1);
    }
}
