/**
 * __this program will calculate locations___ 
 * @author __Oguz Kuyucu___
 * @version __22.11.2020__
 */ 
import java.util.Scanner;

import sun.tools.jstat.RowClosure;

public class Lab05b{
    public static void main(String[]args){
        //variables
        int row;
        int column;
        int rowSoFar;
        int columnSoFar;
        int space;
        int numberOfCells;
        int cellNumber;

        //program code

        Scanner scan = new Scanner(System.in);
        //1.get row and coloum from the user
        System.out.println("please write row and coloum");
        row = scan.nextInt();
        column = scan.nextInt();

        //2. write row and columns
        System.out.println("Table for row and columns ");
        for(rowSoFar = 1 ;rowSoFar <= row ;rowSoFar++ ){
            for(columnSoFar = 1; columnSoFar <= column; columnSoFar++){
                space = 3 -(columnSoFar / 10 + rowSoFar / 10);
                while(space > 0){
                    space = space - 1;
                    System.out.print(" ");
                }
                System.out.print(rowSoFar + "," + columnSoFar); 
            }
            System.out.println(" ");
        }
        
        //3 write product of row and columns
        System.out.println("Table for product of row and columns");
        for(rowSoFar = 1; rowSoFar <= row; rowSoFar++ ){
            for(columnSoFar = 1; columnSoFar <= column; columnSoFar++){
                space =5 - (int)((Math.log10(rowSoFar * columnSoFar)));
                while(space > 0){
                    space = space - 1;
                    System.out.print(" ");
                }
                System.out.print(rowSoFar * columnSoFar); 
            }
            System.out.println();
        }
        
        //4 write table of cell numbers
        System.out.println("Table for cell numbers");
        //4.1 set number of cells to product of row and column
        numberOfCells = row * column;
        //4.2 set cellNumber to 0
        cellNumber = 0;
        //4.3 create a table such that each cell have six character
        for(rowSoFar = 1; row >= rowSoFar; rowSoFar++ ){
            for(columnSoFar = 1; columnSoFar <= column; columnSoFar++){
                space = 5 - (int)((Math.log10(cellNumber + 0.999)));
                while(space > 0){
                    System.out.print(" ");
                    space = space - 1;
                }
                System.out.print(cellNumber);
                cellNumber = cellNumber + 1; 
            }
            System.out.println();
        }
        
        //5. write a table with row number and -
        System.out.println("Table for row numbers and lines");
        for(rowSoFar = 1; rowSoFar <= row; rowSoFar++ ){
            System.out.print(rowSoFar);
            for(columnSoFar = 2; columnSoFar<= column; columnSoFar++ ){
                System.out.print("-");
            }
            System.out.println();
        }
    }//end of method
}//end of class