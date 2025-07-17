package scheduler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * A simple Round-Robin scheduler simulation.
 */
public class Scheduler {

    static class Process {
        int pid;
        int burstTime;
        int remainingTime;

        Process(int pid, int burstTime) {
            this.pid = pid;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
        }
    }

    /**
     * Launches the scheduler simulation from console.
     */
    public static void runScheduler() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        Queue<Process> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter burst time for Process " + i + ": ");
            int bt = sc.nextInt();
            queue.offer(new Process(i, bt));
        }

        System.out.print("Enter time quantum: ");
        int quantum = sc.nextInt();

        System.out.println("\n--- Scheduling Order ---");
        int currentTime = 0;

        while (!queue.isEmpty()) {
            Process p = queue.poll();

            int exec = Math.min(p.remainingTime, quantum);
            System.out.printf("Time %d to %d: Process %d executes for %d unit(s)\n",
                              currentTime, currentTime + exec, p.pid, exec);
            currentTime += exec;
            p.remainingTime -= exec;

            // If process still has work, re-queue
            if (p.remainingTime > 0) {
                queue.offer(p);
            } else {
                System.out.printf("Process %d completed at time %d\n", p.pid, currentTime);
            }
        }

        System.out.println("All processes have finished.");
    }
}

