/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypro;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class ArrayPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums;
        nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        System.out.print("nums = ");
        System.out.print("[");
        for(int i = 0; i<nums.length; i++){
            System.out.printf("%-3d", nums[i]);
        }
        System.out.println("]");
        System.out.println("nums = "+Arrays.toString(nums));
        
        //
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
        System.out.println("matrix = ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("matrix = ");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(Arrays.toString(matrix[i]));
            System.out.println();
        }
        
        //зубчатый массив
        int[][] matrixZ = new int[5][];
//        matrixZ[0] = new int[2];
//        matrixZ[1] = new int[3];
//        matrixZ[2] = new int[4];
//        matrixZ[3] = new int[5];
//        matrixZ[4] = new int[6];
        for(int i = 0; i < matrixZ.length; i++){
            for(int j = 2; j < 7; j++){
                matrixZ[i] = new int[j];
            }
        }
        for(int i = 0; i < matrixZ.length; i++){
            for(int j = 0; j < matrixZ[i].length; j++){
                matrixZ[i][j] = random.nextInt(10);
            }
        }
        System.out.println("matrixZ = ");
        for(int i = 0; i < matrixZ.length; i++){
            System.out.print(Arrays.toString(matrixZ[i]));
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}
