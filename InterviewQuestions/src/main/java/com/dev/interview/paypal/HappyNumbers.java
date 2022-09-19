package com.dev.interview.paypal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    static long[] result = new long[1000005];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter wr = new PrintWriter(System.out);

        pre();

        int T = Integer.parseInt(br.readLine().trim());

        for(int t_i = 0; t_i < T; t_i++)

        {

            String[] str = br.readLine().split(" ");

            int l = Integer.parseInt(str[0]);

            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);

            wr.write(out_ + "\n");


        }

        wr.close();

        br.close();

    }

    static void pre() {

        for(int i=1;i <1000005;i++){

            Set<Long> set =new HashSet<>();

            if(isBeautiful(i,set)){

                result[i] = i;
            }

        }

        for(int i=1;i <1000005;i++){

            result[i] += result[i-1];
        }

    }

    static boolean isBeautiful(long n, Set<Long> set){

        while(true){

            if(n==1){

                return true;

            }else if(set.contains(n)){

                return false;

            }

            set.add(n);

            long num =0;

            while(n>0){

                num+= (n%10)*(n%10);

                n =n/10;
            }
            n = num;

        }

    }

    static long solve(int l, int r){

        return result[r] - result[l-1];
    }

}
