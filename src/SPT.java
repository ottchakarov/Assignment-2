import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SPT {
    private PriorityQueue<Job> jobQueue;

    public SPT() {
        this.jobQueue = new PriorityQueue<>(Comparator.comparingInt(Job::getProcessingTime));
      }

    public void addJob(Job job) {
        jobQueue.add(job);
    }

    public String executeJobs() {
        List<Integer> executionOrder = new ArrayList<>();
        int currentTime = 0;
        int totalCompletionTime = 0;

        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            currentTime += job.getProcessingTime();
            totalCompletionTime += currentTime;
            executionOrder.add(job.getJobId());
        }

        double averageCompletionTime = (double) totalCompletionTime / executionOrder.size();
        String result = "Execution Order: " + executionOrder + "\n" +
                "Average Completion Time: " + averageCompletionTime + "\n";

        System.out.println(result);
        return result;
    }
}
