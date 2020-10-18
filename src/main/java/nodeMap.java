public class nodeMap<K,V>
{
    K key;
    V value;
    nodeMap next;

    public nodeMap(K key, V value) {
        this.key=key;
        this.value=value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public nodeMap<K,V> getNext() {
        return next;
    }

    public void setNext(nodeMap<K,V> next) {
        this.next = next;
    }

    public String toString(){
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("{ K= ").append(key).append(", V= ").append(value).append(" }");
        if(next!=null)
            strBuild.append("->");
        return strBuild.toString();
    }
}
