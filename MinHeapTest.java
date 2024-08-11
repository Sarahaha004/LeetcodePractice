

class MinHeap {

    private int[] HeapArray;

    private int capacity;

    private int currentsize;

    public  MinHeap(int n){

        capacity=n;
        HeapArray=new int[capacity];
        currentsize=0;
    }

    private void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private int parent(int key){

        return (key-1)/2;
    }

    private int left(int key){

        return 2*key+1;
    }

    private int right(int key){

        return 2*key+2;
    }

    public boolean insertkey(int key){

        if(currentsize==capacity){

            return false;
        }

        //first insert at the end

        int i=currentsize;
        HeapArray[i]=key;
        currentsize++;

        //maintain min Heap property

        while(i!=0 && HeapArray[i]<HeapArray[parent(i)]){

            swap(HeapArray,i,parent(i) );
            i=parent(i);
        }
            return true;

    }
        //decrease value of key assuming with a minimum value
    public void decreaseKey(int key,int val){

        HeapArray[key]=val;

        while(key!=0 && HeapArray[key]< HeapArray[parent(key)]){

            swap(HeapArray, key, parent(key));
            key=parent(key);
        }
    }

    //return the min val which is the root of the minheap so index 0
    public int getMin() { 
        return HeapArray[0]; 
    } 

    public int extractMin(){

        if(currentsize<=0){
            return Integer.MAX_VALUE;
        }

        if(currentsize==1){

            currentsize--;
            return HeapArray[0];
        }

        int root=HeapArray[0];

        HeapArray[0]=HeapArray[currentsize-1];
        currentsize--;
        Minheapify(0);

        return root;
    }

    //delete a key

    public void deleteKey(int key){

        decreaseKey(key, Integer.MIN_VALUE);
        extractMin();
    }

        //increase key to new value..assumed to be greater than HeapArray[key]
    private void increaseKey(int key,int new_val){

        HeapArray[key]=new_val;
        Minheapify(0);
    }

    private void Minheapify(int key){

        int l = left(key); 
         int r = right(key); 
      
        int smallest = key; 
            if (l < currentsize && HeapArray[l] < HeapArray[smallest]) { 
                smallest = l; 
            } 
            if (r < currentsize && HeapArray[r] < HeapArray[smallest]) { 
                smallest = r; 
            } 
      
            if (smallest != key) { 
                swap(HeapArray, key, smallest); 
                Minheapify(smallest); 
            } 
        
    }

    public void changeValueOnAKey(int key, int new_val) { 
        if (HeapArray[key] == new_val) { 
            return; 
        } 
        if (HeapArray[key] < new_val) { 
            increaseKey(key, new_val); 
        } else { 
            decreaseKey(key, new_val); 
        } 
    }    
}

public class MinHeapTest { 
    public static void main(String[] args) { 
        MinHeap h = new MinHeap(11); 
        h.insertkey(3); 
        h.insertkey(2); 
        h.deleteKey(1); 
        h.insertkey(15); 
        h.insertkey(5); 
        h.insertkey(4); 
        h.insertkey(45); 
        System.out.print(h.extractMin() + " "); 
        System.out.print(h.getMin() + " "); 
          
        h.decreaseKey(2, 1); 
        System.out.print(h.getMin()); 
    } 
} 