package Directory1600.Sub70;

import Model.FrontMiddleBackQueue;

public class Leetcode1670 {
    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        queue.popFront();
        queue.popMiddle();
    }
}
