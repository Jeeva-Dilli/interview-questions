/*
package com.dev.interview.paypal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Distance {
    public static void main(String[] args) {

    }

    public static int distance(int task[][], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      //  Arrays.sort(task,Comparator.comparing((int[] o1,int[] o2)->o2[0]-o1[0]));

        int pqSum = 0;
        int max =0;
        for(int i=0;i<n;i++)
        {
            int totaltime = i;
            int distance = 2*task[i][0];
            int remainingTime = totaltime-distance;
            int currEffort=task[i][1];
            if(remainingTime<0){
                break;

            }
            while(pqSum>remainingTime)
            {
                pqSum -=pqSum.poll();

            }
            if(pq.isEmpty()&&remainingTime>currEffort)
            {
                pq.add(currEffort);
                pqSum+=currEffort;
            }

            else if(pqSum+currEffort<=remainingTime)
            {
                pq.add(currEffort);
                pqSum+=currEffort;
            }
            else {
                Integer currMax = pq.peek();
                if(currMax!=null&&currMax>currEffort)
                {
                    pq.poll();
                    pq.add(currEffort);
                    pqSum=pqSum-currMax+currEffort;
                }
            }
            max=Math.max(max,pq.size());
        }


        return max;
    }
    }
}
*/
