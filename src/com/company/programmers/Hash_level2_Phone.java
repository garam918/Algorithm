package com.company.programmers;

import java.util.*;

public class Hash_level2_Phone {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int i;
        Arrays.sort(phone_book);
        for (i=0;i<phone_book.length-1;i++){
            if (phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            }
        }

        return answer;
    }
}
