package DesignPattern.Strategy;

public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
