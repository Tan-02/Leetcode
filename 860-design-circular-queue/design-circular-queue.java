class MyCircularQueue {
    int queue[];
    int front, size, capacity;

    public MyCircularQueue(int k) {
        queue=new int[k];
        front=0;
        size=0;
        capacity=k;
    }
    
    public boolean enQueue(int value) {
        if(size == capacity)
            return false;
            queue[size] = value;
            size++;
            return true;
    }
    
    public boolean deQueue() {

        if(size == 0)
            return false;
        for(int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        size--;
        return true; 
    }
    
    public int Front() {
         if(size == 0)
         return -1;
         return queue[0];
        
    }
    
    public int Rear() {
         if(size == 0)
            return -1;
         return queue[size - 1];
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return capacity==size;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */