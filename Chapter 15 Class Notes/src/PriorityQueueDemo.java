
import java.util.*;
/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //create a to-do list
        //workorder class has a priority and a description
        Queue<WorkOrder/* <- must be comparable */> toDo = new PriorityQueue<>();
        // lower == more important
        toDo.add(new WorkOrder(3,"Water Plants"));
        toDo.add(new WorkOrder(2,"Make Dinner"));
        toDo.add(new WorkOrder(1,"cw"));
        toDo.add(new WorkOrder(9,"p"));
        toDo.add(new WorkOrder(3,"study"));

        System.out.println(toDo);//stored randomly not in order

        while(toDo.size() > 0){
            System.out.println(toDo.remove());//removes the lowest numbers first
        }
    }
}
