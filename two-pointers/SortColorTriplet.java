import java.util.*;

class SortColorTriplet {
    public static int[] sortColors(int[] colors) {

        // Initialize the red, white, and blue pointers
        int red = 0;
        int white = 0;
        int blue = colors.length - 1;

        while (white <= blue) {

            // If the white pointer is pointing to red
            if (colors[white] == 0) {

                // Swap the values if the red pointer is not pointing to red
                if (colors[red] != 0) {
                    int temp = colors[red];
                    colors[red] = colors[white];
                    colors[white] = temp;
                }

                // Increment both the red and white pointers
                white++;
                red++;
            }

            // If the white pointer is pointing to white, no swapping is required
            // Just increment the white pointer
            else if (colors[white] == 1) {
                white++;
            }

            // If the white pointer is pointing to blue
            else {

                // Swap the values if the blue pointer is not pointing to blue
                if (colors[blue] != 2) {
                    int temp = colors[white];
                    colors[white] = colors[blue];
                    colors[blue] = temp;
                }

                // Decrement the blue pointer
                blue--;
            }
        }

        return colors;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] inputs = {
                { 0, 1, 0 },
                { 1, 1, 0, 2 },
                { 2, 1, 1, 0, 0 },
                { 2, 2, 2, 0, 1, 0 },
                { 2, 1, 1, 0, 1, 0, 2 }
        };

        // Iterate over the inputs and print the sorted array for each
        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));
        }
    }
}