import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JobFileReader {
    public void readJobsFromFile(String filePath, SPT scheduler) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                int jobId = Integer.parseInt(parts[0]);
                int processingTime = Integer.parseInt(parts[1]);
                int priority = 1;
                int arrivalTime = 0;
                scheduler.addJob(new Job(jobId, processingTime, priority, arrivalTime));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
