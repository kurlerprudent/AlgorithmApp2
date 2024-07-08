import java.util.Scanner;

public class TravellingSalesman {
    private int[][] distances;
    private int numCities;
    private int[] tour;
    private int totalDistance;

    public TravellingSalesman() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        numCities = scanner.nextInt();
        distances = new int[numCities][numCities];
        tour = new int[numCities];

        System.out.println("Enter the distances between cities:");
        for (int i = 0; i < numCities; i++) {
            for (int j = 0; j < numCities; j++) {
                distances[i][j] = scanner.nextInt();
            }
        }

        
    }

    public void findShortestTour() {
        boolean[] visited = new boolean[numCities];
        tour[0] = 0; // Start from the first city
        visited[0] = true;

        for (int i = 1; i < numCities; i++) {
            int minDistance = Integer.MAX_VALUE;
            int nextCity = -1;

            for (int j = 0; j < numCities; j++) {
                if (!visited[j] && distances[tour[i - 1]][j] < minDistance) {
                    minDistance = distances[tour[i - 1]][j];
                    nextCity = j;
                }
            }

            tour[i] = nextCity;
            visited[nextCity] = true;
        }

        // Calculate the total distance of the tour
        totalDistance = 0;
        for (int i = 0; i < numCities - 1; i++) {
            totalDistance += distances[tour[i]][tour[i + 1]];
        }
        totalDistance += distances[tour[numCities - 1]][tour[0]]; // Add the distance from the last city to the first city
    }

    public void printTour() {
        System.out.println("Shortest Tour:");
        for (int i = 0; i < numCities; i++) {
            System.out.print((tour[i] + 1) + " "); // Print city numbers starting from 1
        }
        System.out.println("\nTotal Distance: " + totalDistance);
    }
}
