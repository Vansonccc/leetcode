package Model;

import java.util.*;

public class FrontMiddleBackQueue {
    private Deque<Integer> frontQueue;
    private Deque<Integer> backQueue;

    public FrontMiddleBackQueue() {
        frontQueue = new ArrayDeque<>();
        backQueue = new ArrayDeque<>();
    }

    public void pushFront(int val) {
        frontQueue.offerFirst(val);
        if(frontQueue.size()==backQueue.size()+2){
            backQueue.offerFirst(frontQueue.pollLast());
        }

    }

    public void pushMiddle(int val) {
        if (frontQueue.size() == backQueue.size() + 1) {
            backQueue.offerFirst(frontQueue.pollLast());
        }
        frontQueue.offerLast(val);
    }

    public void pushBack(int val) {
        backQueue.offerLast(val);
        if(frontQueue.size() ==backQueue.size()-1){
            frontQueue.offerLast(backQueue.pollFirst());
        }
    }

    public int popFront() {
        if(frontQueue.isEmpty()){
            return -1;
        }
        int res = frontQueue.pollFirst();
        if(frontQueue.size()+1 == backQueue.size()){
            frontQueue.offerLast(backQueue.pollFirst());
        }
        return res;
    }

    public int popMiddle() {
        if(frontQueue.isEmpty()){
            return -1;
        }
        int res = frontQueue.pollLast();
        if(frontQueue.size()+1 == backQueue.size()){
            frontQueue.offerLast(backQueue.pollFirst());
        }
        return res;
    }

    public int popBack() {
        if(frontQueue.isEmpty()&&backQueue.isEmpty()){
            return -1;
        }
        if(backQueue.isEmpty()){
            return frontQueue.pollLast();
        }
        int res =backQueue.pollLast();
        if(frontQueue.size()==backQueue.size()+2){
            backQueue.offerFirst(frontQueue.pollLast());
        }
        return res;
    }
}
