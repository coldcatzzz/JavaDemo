package oop.Task;

public class Task3 {
    public static void main(String[] args) {
        Book book = new Book();
        book.updatePrice(-90);
    }
}

class Book{
    public void updatePrice(double price){
        if (price > 0){
            System.out.println(price > 150 ? 150 : (price > 100 ? 100 : price));
        }else {
            System.out.println("请输入大于零的价格");
        }
    }
}
