package Task;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateOP {

    public static void main(String[] args) {
        List<Candidate> candidates = InterviewRep.getCandidateList();

        // List of Pune Candidates
        System.out.println("List of Pune Candidates:");
        candidates.stream()
                .filter(c -> "Pune".equalsIgnoreCase(c.city)) // Filter by city (case insensitive)
                .forEach(c -> System.out.println(c.name));

        printLine();

        // Candidate count per city
        System.out.println("Candidate count per city:");
        Map<String, Long> cityCount = candidates.stream()
                .collect(Collectors.groupingBy(ca -> ca.city, Collectors.counting()));
        cityCount.forEach((city, count) -> System.out.println(city + ": " + count));

        printLine();

        // Candidate count by Technical Expertise
        System.out.println("Candidate count by Technical Expertise:");
        Map<Object, Long> expertiseCount = candidates.stream()
                .collect(Collectors.groupingBy(ca -> ca.experience, Collectors.counting())); // Group by expertise
        expertiseCount.forEach((expertise, count) -> System.out.println(expertise + ": " + count));

        printLine();

        // Fresher Candidate list
        System.out.println("Fresher Candidate list:");
        candidates.stream()
                .filter(c -> c.experience == 0)  // Filter for fresher candidates (experience 0)
                .forEach(c -> System.out.println(c.name));

        printLine();

        // Sorted List of Candidates by Experience
        System.out.println("Sorted List of Candidates by Experience:");
        candidates.stream()
            .sorted((c1, c2) -> Integer.compare(c2.experience, c1.experience))  // Compare based on experience (descending order)
            .forEach(c -> System.out.println(c.name + " - " + c.experience + " years"));

        printLine();

        // Sorted List of Candidates by City Name
        System.out.println("Sorted List of Candidates by City Name:");
        candidates.stream()
            .sorted((c1, c2) -> c1.city.compareTo(c2.city)) // Sort by city name using compareTo
            .forEach(c -> System.out.println(c.name + " - " + c.city));
    }

    private static void printLine() {
        System.out.println("======================================================");
    }
}
