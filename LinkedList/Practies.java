package LinkedList;

public class Practies {

    static class Node{

        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static  Node tail;

   // add  First Node;
    public  void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // Add in LastNode;

    public void addLast(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // print linkedlist

    public void print(){

        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

//  Reverse a linked list
    public void reverse(){

        Node pre=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head=pre;
    }

    // Detecting cycle in linked list;

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;


        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;

             if(slow==fast){
                  return true;
             }
        }

        return  false;
    }

    public static void main(String[] args) {

        Practies linked=new Practies();

        linked.addFirst(5);
        linked.addFirst(6);
        linked.addFirst(7);
        linked.addFirst(8);

        linked.print();
        linked.reverse();
        linked.print();
    }
}


