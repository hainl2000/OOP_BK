package hust.soict.hedspi.Lab2;

import java.util.Scanner;

public class Matrix {
    int row;
    int col;
    int[][] matrix;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int r,int c)
    {
        this.row = r;
        this.col = c;
    }

    public void inputMatrix(Scanner scanner)
    {
        this.matrix = new int[this.row][this.col];
        for (int i=0;i<this.row;i++)
            for (int j=0;j<this.col;j++)
                this.matrix[i][j] = scanner.nextInt();
    }

    public void show()
    {
        for (int i=0;i<this.row;i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] add(Matrix b)
    {
        int[][] result = new int[this.row][this.col];
        for (int i=0;i<this.row;i++) {
            for (int j = 0; j < this.col; j++) {
                result[i][j] = this.matrix[i][j] + b.matrix[i][j];
            }
        }
        return result;
    }
}
