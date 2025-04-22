public class SmartCampusManagementSystem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        StudentRecordManager studentManager = new StudentRecordManager();
        RoomScheduler roomScheduler = new RoomScheduler();
        ResourceManager resourceManager = new ResourceManager();
        
        System.out.println("Welcome to the Smart Campus Management System");
        boolean exit = false;
        while (!exit) {
            System.out.println("Main Menu:");
            System.out.println("1. Student Record Management");
            System.out.println("2. Room Scheduling");
            System.out.println("3. Resource Tracking");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            String choiceStr = scanner.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input please enter a number between 1 and 4.");
                continue;
            }