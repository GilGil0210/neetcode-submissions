class DynamicArray {
    private int capacity;
    private int[] arr;
    private int length;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity)
        {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0)
        {
            length--;
        }
        return arr[length];
    }

    private void resize() {
        this.capacity *= 2;
        int[] newarr = new int[capacity];
        for (int i = 0; i < length; i++)
        {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
