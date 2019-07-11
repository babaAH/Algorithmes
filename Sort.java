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
}
