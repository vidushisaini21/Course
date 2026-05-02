public class Array {
    public static void main(Strings[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        int nums[] = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    

        // multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // System.out.println(matrix[0][0]); // 1
        // System.out.println(matrix[1][1]); // 5
        // System.out.println(matrix[2][2]); // 9
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }


        int nums1[][] = new int[3][4];
    
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums1[i].length; j++){
                nums1[i][j] = (int)(Math.random() * 100); // Generate a random number between 0 and 99
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }
// enhanced for loop (for-each loop)
        for(int num : numbers){
            System.out.println(num);
        }

        for(int n[] : matrix){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }



// Jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];

        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = (int)(Math.random() * 100);
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

// 3D array
        int[][][] threeDArray = new int[2][3][4];
        for(int i=0; i<threeDArray.length; i++){
            for(int j=0; j<threeDArray[i].length; j++){
                for(int k=0; k<threeDArray[i][j].length; k++){
                    threeDArray[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


 
    }
}
