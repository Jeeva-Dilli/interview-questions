package com.dev.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {


    /*

    Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
    Output: [0,2,1,3]
     */
    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] inDeg = new int[numCourses];
        List<Integer>[] chl = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            chl[i] = new ArrayList<>();
        }

        int pre;
        int cour;

        for (int[] pair : prerequisites) {
            pre = pair[1];
            cour = pair[0];

            chl[pre].add(cour);
            inDeg[cour]++;
        }

        int[] res = new int[numCourses];
        int k = 0;

        for (int i = 0; i < numCourses; i++) {
            if (inDeg[i] == 0) {
                res[k++] = i;
            }
        }

        if (k == 0) {
            return new int[0];
        }

        int j = 0;
        List<Integer> tmp;

        while (k < numCourses) {
            tmp = chl[res[j++]];

            for (int id : tmp) {
                if (--inDeg[id] == 0) {
                    res[k++] = id;
                }
            }

            if (j == k) {
                return new int[0];
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int[] a= findOrder(numCourses,prerequisites);

        Arrays.stream(a).forEach(System.out::println);

    }
}
