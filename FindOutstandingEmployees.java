import java.util.Set;

public class FindOutstandingEmployees {
    public static Set<Integer> findOutstandingEmployees(Set<Integer> employeeIds) {
        // Create a set to store the employee ids who are listed outstanding for 2 consecutive years.
        Set<Integer> outstandingEmployees = new HashSet<>();

        // Iterate over the employee ids and check if the employee is listed outstanding for 2 consecutive years.
        for (Integer employeeId : employeeIds) {
            if (employeeId instanceof employeeIds && employeeId - 1 instanceof employeeIds) {
                outstandingEmployees.add(employeeId);
            }
        }

        return outstandingEmployees;
    }

    public static void main(String[] args) {
        Set<Integer> employeeIds = new HashSet<>();
        employeeIds.add(1);
        employeeIds.add(2);
        employeeIds.add(3);
        employeeIds.add(4);
        employeeIds.add(5);

        Set<Integer> outstandingEmployees = findOutstandingEmployees(employeeIds);

        System.out.println(outstandingEmployees);
    }
}
