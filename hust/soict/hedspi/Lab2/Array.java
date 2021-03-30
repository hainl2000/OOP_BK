package hust.soict.hedspi.Lab2;

import java.util.Scanner;

public class Array {
    int totalIndex;
    int[] numArr;
    
    public int getTotalIndex() {
        return totalIndex;
    }

    public void setTotalIndex(int totalIndex) {
        this.totalIndex = totalIndex;
    }

    public int[] getNumArr() {
        return numArr;
    }

    public void setNumArr(int[] numArr) {
        this.numArr = numArr;
    }

    public Array(int n){
        this.totalIndex = n;
    }

    public void addArray(Scanner scanner)
    {
        this.numArr = new int[this.totalIndex];
        for (int i=0;i<this.totalIndex;i++) {
            this.numArr[i] = scanner.nextInt();
        }
    }

    public void show()
    {
        for (int i=0;i<this.totalIndex;i++)
            System.out.print(this.numArr[i] +" ");
        System.out.println();
    }

    public int total()
    {
        int total= 0;
        for (int i=0;i<this.totalIndex;i++)
            total += this.numArr[i];
        return total;
    }

    public void sort()
    {
        for (int i = 0; i < this.totalIndex; i++)
        {
            for (int j = i + 1; j < this.totalIndex; j++)
            {
                if (this.numArr[i] > this.numArr[j])
                {
                    int temp = this.numArr[i];
                    this.numArr[i] = this.numArr[j];
                    this.numArr[j] = temp;
                }
            }
        }
    }
}
