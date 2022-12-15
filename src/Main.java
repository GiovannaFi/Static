public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Mario", "Rossi", "via Milano");
        Badge badge1 = new Badge(worker1);
        badge1.showBadgeDetails();

        Employee worker2 = new Employee("Luca", "Verdi", "via Lucca");
        Badge badge2 = new Badge(worker2);
        badge2.showBadgeDetails();
    }
}