package oop;

/*
    # # # # # #
    # # # # # #
    # # # # # #
    # # # # # #
    # # # # # #
**/

public class RowAndColumn {
    public static void main(String[] args) {
        Method03 method03 = new Method03();
        method03.print(10, 12, '*');
    }
}

class Method03{
    public void print(int row, int column, char c){
        for (int i = 0; i < row; i++){
            for (int j = 0; j< column; j++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
