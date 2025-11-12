package Interview;

/*Here is the **text extracted** from your image:

---

### **Merge Two Sorted Lists**

You are given the heads of two sorted linked lists **list1** and **list2**.
Merge the **two lists** in a **one sorted list**. The list should be made by
splicing together the nodes of the first two lists.
Return the head of the merged linked list.

**Input:**
list1 = [1,2,4], list2 = [1,3,4]

**Output:**
[1,1,2,3,4,4]

---
*/
public class practies5 {
    static class Node{
        int val;
        Node next;
    }
    public static Node merge(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return  l1;

        Node ans=l1;

        while (l1!=null && l2!=null){
            Node temp=l1;

            while (l1!=null && l1.val<=l2.val){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;

            Node t=l1;
            l1=l2;
            l2=t;
        }
     return ans;
    }
    public static void main(String[] args) {

    }
}
