package Interview;
/*Here’s the text from the image:

---

**Intersection of Two Linked Lists**

Given the two singly linked-lists **l1** and **l2**, return the **node** at which the two lists intersect. If the two linked lists have no intersection at all, return **null**.

**Input:**
l1 = [1,2,3,4], l2 = [5,3,4]
**Output:**
3  /// 3 par intersection ho rha hai
*/
public class practies6 {

    static class Node{
        int val;

        Node next;
    }

    public Node intersection(Node l1,Node l2){

        if(l1==null || l2==null){
            return null;
        }

        Node p1=l1,p2=l2;

        while(p1!=p2){
            p1= p1==null ? l2 :p1.next;
            p2=p2==null ?l1: p2.next;
          }
    return p1;
    }

    public static void main(String[] args) {

    }
}
