package Interview;

public class practies7 {

    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }

    // linked list is palidrome or not
    static Node Reverse(Node head){
        Node prev=null;

        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
      return prev;
    }

    public static boolean isPalindrome(Node head){
        Node fast=head,slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        if(fast!=null){
            slow=slow.next;
        }
        slow=Reverse(slow);
        fast=head;

        while(slow!=null && fast!=null){
            if(slow.val!=fast.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
     return true;
    }

    public static void main(String[] args) {

    }
}
