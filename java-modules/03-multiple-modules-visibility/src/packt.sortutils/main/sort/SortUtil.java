package main.sort;

import strategies.BubbleSort;

import java.util.List;

public class SortUtil {

    private BubbleSort bubbleSort = new BubbleSort();

    public <T extends Comparable> List<T> sortList(List<T> list) {
        return this.bubbleSort.sortList(list);
    }
}
