package Main;


import SortingAlgorithims.BubbleSort;
import SortingAlgorithims.InsertionSort;
import SortingAlgorithims.SelectionSort;
import SortingAlgorithims.ShellSort;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        BubbleSort bubble = new BubbleSort();
        ShellSort shell = new ShellSort();

        Scanner input = new Scanner(System.in);
        String choice;

        int arr[] = {-22, 1, 30, 55, 2, 44, -32, 20};

        System.out.println("The array is:");

        for(int x : arr){
            System.out.print(x + " ");
        }

        System.out.println("How would you like to sort the array?");
        choice = input.next();


        switch (choice) {
            case "selection":
                selection.sortInt(arr);
                break;

            case "bubble":
                bubble.sortInt(arr);
                break;

            case "shell":
                shell.sortInt(arr);
                break;

        }
    }

}
