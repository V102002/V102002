import java.util.ArrayList;
import java.util.List;

public class PolicemenVsThieves {

    public static int maxThievesCaught(char[][] grid, int policemenCount, int k) {
        int maxThieves = 0;

        // Create lists to store the indices of policemen and thieves
        List<Integer> policemanIndices = new ArrayList<>();
        List<Integer> thiefIndices = new ArrayList<>();

        // Populate the lists with indices of policemen and thieves
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'P') {
                    policemanIndices.add(i * grid[i].length + j);
                } else if (grid[i][j] == 'T') {
                    thiefIndices.add(i * grid[i].length + j);
                }
            }
        }

        // Iterate through all possible combinations of policemen to catch thieves
        int[] combination = new int[policemenCount];
        int gridSize = grid.length * grid[0].length;
        for (int i = 0; i < policemenCount; i++) {
            combination[i] = i;
        }

        while (combination[0] < gridSize - policemenCount + 1) {
            int currentThievesCaught = 0;

            // Check if the current combination catches the maximum number of thieves
            for (int i : combination) {
                for (int j : thiefIndices) {
                    int x1 = i / grid[0].length;
                    int y1 = i % grid[0].length;
                    int x2 = j / grid[0].length;
                    int y2 = j % grid[0].length;

                    if (Math.abs(x1 - x2) + Math.abs(y1 - y2) <= k) {
                        currentThievesCaught++;
                        thiefIndices.remove((Integer) j);
                        break;
                    }
                }
            }

            maxThieves = Math.max(maxThieves, currentThievesCaught);

            // Generate the next combination
            int j = policemenCount - 1;
            while (j >= 0 && combination[j] == gridSize - policemenCount + j) {
                j--;
            }

            if (j < 0) {
                break;
            }

            combination[j]++;
            for (int l = j + 1; l < policemenCount; l++) {
                combination[l] = combination[l - 1] + 1;
            }
        }

        return maxThieves;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'P', 'T', 'T', 'P', 'P'},
            {'T', 'P', 'P', 'T', 'T'},
            {'P', 'T', 'P', 'P', 'P'},
            {'P', 'P', 'T', 'P', 'T'}
        };
        int policemenCount = 3;
        int k = 1;

        int maxThievesCaught = maxThievesCaught(grid, policemenCount, k);
        System.out.println("Maximum number of thieves caught: " + maxThievesCaught);
    }
}
