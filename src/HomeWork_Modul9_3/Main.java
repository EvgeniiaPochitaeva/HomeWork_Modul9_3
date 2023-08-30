package HomeWork_Modul9_3;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        String colorBlack = "Black";
        String colorWhite = "White";
        String colorGreen = "Green";
        myQueue.add(colorBlack);
        myQueue.add(colorWhite);
        myQueue.add(colorGreen);

        System.out.println(myQueue.size());
        myQueue.printList();

        myQueue.peek();
        myQueue.pool();

        myQueue.clear();


    }


}
