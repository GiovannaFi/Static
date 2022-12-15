public class Badge {
    private static int totalNumberOfEmployees;
    private int badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;

    }

    private String generateBadgeIdCode() {
        return "NJN" + employee.getName() + employee.getSurname() + "XgP";

    }

    public void showBadgeDetails() {
        System.out.println("total number of employee tracked by the badges: " + totalNumberOfEmployees);
        System.out.println(generateBadgeIdCode());
        employee.getEmployeeDetails();
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        generateBadgeIdCode();
    }

}

/*
the details of the employee
the badgeIdCode
a constructor method that takes an Employee param called employeeThatNeedsBadge and:
call the static method for keeping track of the number of employees
assign the value of employeeThatNeedsBadge to the object's employee property
assign a generated id code to the object's badgeIdCode*/
