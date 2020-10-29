package com.company.programmers;

import java.util.Arrays;
import java.util.Hashtable;

public class Hash_level1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        answer += participant[participant.length -1]; // 왜?
        return answer;
    }
}
