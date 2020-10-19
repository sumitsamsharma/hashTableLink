


public class LinkedList<K,V> {
    private nodeMap head = null;
    private nodeMap tail = null;

    public void append(nodeMap end) {

        nodeMap node = head;
        tail = end;
        if (head == null) {
            head = end;
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(end);
        }
    }

    public nodeMap<K,V> search(K key) {
        nodeMap temp = head;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void delete(K key) {
        nodeMap tempNode = head;
        while (tempNode != null) {
            if(head.getKey().equals(key)){
                if(head.getNext()==null){
                    head=null;
                    tail=null;
                    break;
                }
                else{
                    head=head.getNext();
                    break;
                }
            }
            if (tempNode.getNext().getKey().equals(key)) {
                tempNode.setNext(tempNode.getNext().getNext());
            }
            tail = tempNode;
            tempNode = tempNode.getNext();
        }
    }

    public void printLinkedList() {
        nodeMap node = head;
        while (node != null) {
            System.out.print(node);
            if (node != tail) {
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
    }
}
