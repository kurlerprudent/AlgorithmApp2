import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLooping = true;

        while (continueLooping) {
            System.out.println("Please choose an option(1 - 3)");
            System.out.print("1.Brute Force Algorithm     2.Exhaustive Search     3.Quit :");
            String choice = scanner.nextLine().toLowerCase();
            
            if (choice.equals("3") || choice.equals("quit")) {
                boolean isCorrect = true;
                while (isCorrect) {
                    System.out.print("Are you sure you want to quit?        1.Yes       2.No");
                String quitOption = scanner.nextLine();
                if (quitOption.equals("1") || quitOption.equals("yes")) {
                    System.out.println("Exiting program.....");
                    isCorrect = false;
                    continueLooping = false;
                }else if (quitOption.equals("2") || quitOption.equals("no")) {
                    break;
                }else {System.out.println("Invalid choice: ");}
                }
                

                
                
            }

            else if (choice.equals("1") || choice.equals("brute force algorithm")) {
                System.out.print("Select a Brute Force Algorithm: ");
                System.out.println("1.Bubble Sorting   2.Selection Sort   3.String Matching   4.Polinomial Evaluation     5.Closest Points:");
                String bruteForceOption = scanner.nextLine();

                switch (bruteForceOption) {
                    case "1":
                        System.out.println("Bubble Sorting");
                        BruteForceBubbleSort bruteForceBubbleSort = new BruteForceBubbleSort();
                        bruteForceBubbleSort.sortArray();
                        break;
                    case "2":
                        System.out.println("Bubble Sorting");
                        BruteForceSelectionSort bruteForceSelectionSort = new BruteForceSelectionSort();
                        bruteForceSelectionSort.sortArray();
                        break; 
                    case "3":
                        System.out.println("Bubble Sorting");
                        BruteForceStringMatching bruteForceStringMatching =new BruteForceStringMatching();
                        bruteForceStringMatching.findPattern();
                        break;
                    case "4":
                        System.out.println("Bubble Sorting");
                        BruteForcePoly bruteForcePoly = new BruteForcePoly();
                        bruteForcePoly.calculatePolynomial();
                        break;
                    case "5":
                        System.out.println("Bubble Sorting");
                        BruteForceCLosestPoints bruteForceCLosestPoints = new BruteForceCLosestPoints();
                        bruteForceCLosestPoints.findClosestPair();
                        break;   
                
                    default:
                        break;
                }
            }

            else if (choice.equals("2") || choice.equals("exhaustive search")) {
                System.out.println("Select An Exhaustive Search Option");
                System.out.print("1.Traveling Salesman       2.Knapsack Problem      3.NQueen's Problem     4.Fibonacci Sequence: ");
                String exhaustiveSearchOption = scanner.nextLine();
                switch (exhaustiveSearchOption) {
                    case "1":
                        System.out.println("You selected the traveling salesman option");
                        TravellingSalesman travellingSalesman = new TravellingSalesman();
                        travellingSalesman.findShortestTour();
                        break;
                    case "2":
                        System.out.println("You selected the Knapsack option");
                        Knapsack knapsack = new Knapsack();
                        knapsack.solveKnapsack();
                        knapsack.printSolution();
                        break;
                    case "3":
                        System.out.println("You selected the NQueen's option");
                        NQueensProblem nQueensProblem = new NQueensProblem();
                        nQueensProblem.solveNQueens(0);
                        break;
                    case "4":
                        System.out.println("You selected the Fibonacci Sequence option");
                        FibonacciSequence fibonacciSequence = new FibonacciSequence();
                        fibonacciSequence.generateFibonacciSequence();
                        break;
                    default:
                        System.out.println("Please enter a valid option: ");
                        break;
                }
            }

            else{
                System.out.println("Please Enter a valid option(An Integer from 1 - 3):");
                continue;
            }
            continue;
        }
        
    }
}