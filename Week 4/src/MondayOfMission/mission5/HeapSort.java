package MondayOfMission.mission5;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HeapSort {

    private int[] heap;
    private int heapSize;

    public HeapSort(){
        heap = new int[10000];
        heapSize = 0;
    }

    public void exchangeTopAndBottom() {
        exchangeValue(0,heapSize-1);
    }

    public void exchangeValue(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }


    public void heapify(){
        int i = heapSize - 1;
        while (i != 0 && heap[i] > heap[(i-1)/2] ) {
            exchangeValue(i,(i-1)/2);
            i = (i-1)/2;
        }
    }


    public void insertHeap(int x) {
        heapSize++;
        heap[heapSize-1] = x;
        heapify(); // heap 만들기
    }



    public void printHeap() {
        System.out.print("Min Heap : ");
        for (int i=0; i<heapSize; i++) {
            System.out.printf("[%d] ", heap[i]);
        }
    }

    public int getHeapSize() {
        return heapSize;
    }

    public int deleteHeap() {
        int output = heap[0];
        exchangeTopAndBottom();
        heap[heapSize-1] = 0;
        heapSize--;

        int i =0;
        while (true) {
            int childNode = i * 2 + 1;
            if (childNode > heapSize - 1) break;

            if (heap[childNode] < heap[childNode + 1]) {
                childNode++;
            }

            if (heap[i] < heap[childNode]) {
                exchangeValue(i,childNode);
            }
            i = childNode;
        }
        return output;
    }







}
