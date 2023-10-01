import java.util.Arrays;
import java.util.Comparator;

// Definition of the Item class representing items with weight and value
class Item {
    int weight;
    int value;

    // Constructor for the Item class
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

// Main class named FractionalKnapsack
public class FractionalKnapsack {
    // Method to find the maximum value obtainable in the knapsack
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length; // Get the number of items
        Item[] items = new Item[n]; // Create an array of Item objects to represent the items

        // Create Item objects and store them in the 'items' array
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i]);
        }

        // Sort the 'items' array based on value-to-weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double ratioA = (double) a.value / a.weight; // Calculate the ratio for item 'a'
                double ratioB = (double) b.value / b.weight; // Calculate the ratio for item 'b'
                // Compare the ratios in descending order (higher ratio first)
                return Double.compare(ratioB, ratioA);
            }
        });

        double totalValue = 0.0; // Initialize the total value to 0
        int currentWeight = 0; // Initialize the current weight in the knapsack to 0

        // Loop through the sorted items
        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= capacity) {
                // If the current item fits completely in the knapsack, take it
                currentWeight += items[i].weight; // Update the current weight
                totalValue += items[i].value; // Update the total value
            } else {
                // If the current item doesn't fit completely, take a fraction of it to fill the capacity
                int remainingWeight = capacity - currentWeight; // Calculate the remaining capacity
                double fraction = (double) remainingWeight / items[i].weight; // Calculate the fraction to take
                totalValue += fraction * items[i].value; // Update the total value
                break; // Knapsack is full, so exit the loop
            }
        }

        return totalValue; // Return the maximum value obtainable
    }

    // The main method to run the program
    public static void main(String[] args) {
        int[] weights = { 10, 20, 30 }; // Array of item weights
        int[] values = { 60, 100, 120 }; // Array of item values
        int capacity = 50; // Knapsack capacity

        // Call the getMaxValue method to find the maximum value obtainable
        double maxValue = getMaxValue(weights, values, capacity);

        // Print the result
        System.out.println("Maximum value obtainable: " + maxValue);
    }
}
