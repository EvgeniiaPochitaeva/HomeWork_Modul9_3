package HomeWork_Modul9_3;

public class MyQueue {
    Node head;

    public MyQueue() {
        this.head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    } //додає елемент в кінець++

    public Object pool() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Очередь пуста");
        }
        Object data = head.data;
        head = head.next;

        return data;
    }      //poll() повертає перший елемент з черги і видаляє його з колекції

    public Node peek() {
        if (head != null) {
            return head;
        } else {
            return null;
        }
    }     //    peek() повертає перший елемент з черги ++
    public int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }      //повертає розмір колекції++

    public void clear() {
        head = null;
    }//очищає колекцію++
}
class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

