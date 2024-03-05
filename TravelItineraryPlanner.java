import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Destination {
    private String name;
    private String description;

    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class TravelPlan {
    private List<Destination> destinations;
    private String startDate;
    private String endDate;
    private double budget;

    public TravelPlan() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void displayPlan() {
        System.out.println("Travel Plan:");
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Budget: $" + budget);
        System.out.println("Destinations:");
        for (Destination destination : destinations) {
            System.out.println("- " + destination.getName() + ": " + destination.getDescription());
        }
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TravelPlan plan = new TravelPlan();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.print("Enter start date (MM/DD/YYYY): ");
        String startDate = scanner.nextLine();
        plan.setStartDate(startDate);

        System.out.print("Enter end date (MM/DD/YYYY): ");
        String endDate = scanner.nextLine();
        plan.setEndDate(endDate);

        System.out.print("Enter your budget: $");
        double budget = scanner.nextDouble();
        plan.setBudget(budget);

        scanner.nextLine(); // Consume newline

        System.out.println("Enter destinations (type 'done' to finish):");
        while (true) {
            System.out.print("Destination name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Description: ");
            String description = scanner.nextLine();
            plan.addDestination(new Destination(name, description));
        }

        System.out.println("\nGenerating travel plan...");
        plan.displayPlan();

        scanner.close();
    }
}
