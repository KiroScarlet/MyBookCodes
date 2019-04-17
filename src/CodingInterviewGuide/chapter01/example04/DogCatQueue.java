package CodingInterviewGuide.chapter01.example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author KiroScarlet
 * @date 2019-04-14  -23:01
 * 猫狗队列
 */

public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            dogQ.add(new PetEnterQueue(pet, count++));
        } else if (pet.getPetType().equals("cat")) {
            catQ.add(new PetEnterQueue(pet, count++));
        } else {
            throw new RuntimeException("err ,not dog or cat");
        }
    }

    public Pet pollAll() {
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (dogQ.peek().getCount() < catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!catQ.isEmpty()) {
            return catQ.poll().getPet();
        } else if (!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public Dog pollDog() {
        if (!isDogQueueEmpty()) {
            return (Dog) dogQ.poll().getPet();
        } else {
            throw new RuntimeException("dog queue is empty!");
        }
    }

    public boolean isDogQueueEmpty() {
        return dogQ.isEmpty();
    }
}
