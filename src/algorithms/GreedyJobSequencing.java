package algorithms;
import utilities.Job;
import java.util.*;

public class GreedyJobSequencing {
    public void init() {
        ArrayList<Job> arr = new ArrayList<Job>();

        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        // Function call
        System.out.println("Following is maximum "
                + "profit sequence of jobs");

        Job job = new Job();

        // Calling function
        job.printJobScheduling(arr, 3);
    }
}
