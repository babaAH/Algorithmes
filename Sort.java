class Sort<T extends Comparable>
{
    /*
      Insertion sort with GENERICS on java lang
    */
    public void InsertionSort(T[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int j = i -1;
            T value = arr[i];

            while(j >= 0 && arr[j].compareTo(value) > 0)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
    }
    
    class HeapSort
    {
        public int heapSize;
        
        //swap 2 variable without theard variable
        public static void swap(int[] arr, int i, int j)
        {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }

        public static void heapify(int[] arr, int idx)
        {
            int largest = idx;
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;

            if(left < heapSize && arr[left] > arr[idx])
            {
                largest = left;
            }

            if(right < heapSize && arr[right] > arr[largest])
            {
                largest = right;
            }

            if(idx != largest)
            {
                swap(arr, idx, largest);
                heapify(arr, largest);
            }
        }

        public static void buildHeap(int[] arr)
        {
            heapSize = arr.length;
            for(int i = (arr.length/ 2) - 1; i >=0; i--)
            {
                heapify(arr, i);
            }
        }

        public static void sort(int[] arr)
        {
            buildHeap(arr);

            while(heapSize > 1)
            {
                swap(arr, 0, heapSize - 1);
                heapSize--;
                heapify(arr,0);
            }
        }
    }
}
