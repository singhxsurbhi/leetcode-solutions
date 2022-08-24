class MyHashMap {
    private int[] hash;
    
    public MyHashMap() {
        hash = new int[1000001];
    }
    
    public void put(int key, int value) {
        hash[key]=value+1;
    }
    
    public int get(int key) {
        return hash[key]-1;
    }
    
    public void remove(int key) {
        hash[key]=0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
