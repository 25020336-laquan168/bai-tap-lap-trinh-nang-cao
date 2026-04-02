public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K _key, V _value){
        key = _key;
        value = _value;
    }

    public void setKey(K newK){
        key = newK;
    }

    public void setValue(V newV){
        value = newV;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public String showinfo(){
        return key + " - " + value;
    }
}
