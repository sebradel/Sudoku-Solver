package com.example.test;

public class SudokuSolver {
    public static void main(String[] args){

        int[][] grid = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        if(solve(grid)){
            print(grid);
        }else{
            System.out.print("can't solve");
        }



    }
    //Returns true if the row contains the inputted number
    public static boolean containsRow(int[][] grid, int row, int num){
        boolean contains = false;
        for(int i=0; i<9; i++){
            if (grid[row][i] == num){
                contains = true;
            }
        }
        return contains;
    }
    //Returns true if the column contains the inputted number
    public static boolean containsColumn(int[][] grid, int column, int num){
        boolean contains = false;
        for(int i=0; i<9; i++){
            if(grid[i][column] == num){
                contains = true;
            }
        }
        return contains;
    }
    //Returns true if the 3x3 square the inputted number
    public static boolean containsSquare(int[][] grid, int column, int row, int num){
        boolean contains = false;
        int columnLow, rowLow;
        if(row<3){
            rowLow = 0;
        }else if(row<6){
            rowLow = 3;
        }else{
            rowLow = 6;
        }

        if(column<3){
            columnLow = 0;
        }else if(column<6){
            columnLow = 3;
        }else{
            columnLow = 6;
        }

        for(int i=columnLow; i<columnLow+3; i++){

            for(int j=rowLow; j<rowLow+3; j++){
                if(grid[j][i] == num){
                    contains = true;
                }
            }
        }
        return contains;
    }
    //Function uses containsRow, containsColumn, and containsSquare methods to
    //determine if a number can be placed in a certain position
    public static boolean canPlace(int[][] grid, int row, int column, int num){
        boolean canPlace = true;
        if(containsRow(grid, row, num)){
            canPlace = false;
        }
        if(containsColumn(grid, column, num)){
            canPlace = false;
        }
        if(containsSquare(grid, column, row, num)){
            canPlace = false;
        }
        return canPlace;
    }

    //Primary function used to solve the Sudoku grid, utilizes a backtracking algorithm
    //by calling itself recursively
    public static boolean solve(int[][] grid){
        //Iterates through rows
        for(int i=0; i<9; i++){
            //Iterates through columns
            for(int j=0; j<9; j++){
                //Testing if loop is at the last position of the grid, aka the base case.
                //If this space successfully had a value assigned to it, then we
                //return true
                if(i==8 && j==8){
                    if(grid[i][j] != 0){
                        return true;
                    }
                }
                //For any given position that is not already filled in the grid, every possible
                //number 1-9 is attempted to fill the space. If a certain number being placed
                //leads to a solution, true is returned. If not, false is returned.
                if(grid[i][j] == 0){
                    for(int t=1; t<10; t++){
                        if(canPlace(grid, i, j, t)){
                            grid[i][j] = t;
                            if(solve(grid)){
                                return true;
                            }else{
                                grid[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(int[][] grid){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

}
