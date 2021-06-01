import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
        int choice = -1;

        while(choice != 0)
        {
            System.out.println("\n\r1. Add a home subscriber");
            System.out.println("2. Add an official subscriber");
            System.out.println("3. Add an industrial subscriber");
            System.out.println("4. print sum of all amount");
            System.out.println("5. List all of home subscribers");
            System.out.println("0. Exit");
            System.out.println("================================\n\r");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Home name: ");
                    String home_name = scanner.next();
                    System.out.print("Usage: ");
                    int home_us = scanner.nextInt();
                    subscribers.add(new HomeSub(home_name, home_us));
                    System.out.println("Home sub added successfully\n\r");
                    break;
                
                case 2:
                    System.out.print("Office name: ");
                    String official_name = scanner.next();
                    System.out.print("Usage: ");
                    int official_us = scanner.nextInt();
                    System.out.print("is educational (1/0): ");
                    int official_is_ed = scanner.nextInt();
                    subscribers.add(new OfficialSub(official_name, official_us, official_is_ed));
                    System.out.println("Official sub added successfully\n\r");
                    break;
                
                case 3:
                    System.out.print("Industry name: ");
                    String industry_name = scanner.next();
                    System.out.print("Usage: ");
                    int industry_us = scanner.nextInt();
                    System.out.print("Fuzz (1/3): ");
                    int industry_fuzz = scanner.nextInt();
                    subscribers.add(new IndustrialSub(industry_name, industry_us, industry_fuzz));
                    System.out.println("Industrial sub added successfully\n\r");
                    break;
                
                case 4:
                    int sum = 0;
                    for(Subscriber s: subscribers) {
                        sum += s.calculateUsageCost();
                    }
                    System.out.println("== Overall cost is " + sum + " ==");
                    break;
                
                case 5:
                    for(Subscriber s: subscribers) {
                        if(s instanceof HomeSub) {
                            System.out.println("|-> NAME : " + s.name);
                            System.out.println("|-> USAGE : " + s.usage);
                            System.out.println("|-> COST : " + s.calculateUsageCost());
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
                
                default:
                    System.out.print("== Invalid choice ==\n\r");
            }
        }
    }
}