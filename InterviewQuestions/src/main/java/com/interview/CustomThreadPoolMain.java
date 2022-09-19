package com.interview;

public class CustomThreadPoolMain {
    public static void main(String[] args) {
        CustomThreadPool customThreadPool = new CustomThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());

            customThreadPool.execute(task);
        }
    }

    public static class Task implements Runnable {

        private String name;

        public Task(String n) {
            name = n;
        }

        public String getName() {
            return name;
        }

        public void run() {
            System.out.println("Task " + name + " is running.");
        }
    }
}
