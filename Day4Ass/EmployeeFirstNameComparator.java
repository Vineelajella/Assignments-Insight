package Day4Ass;
public class EmployeeFirstNameComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getFname().compareTo(e2.getFname()); // Sorting by firstname (alphabetically)
    }
}