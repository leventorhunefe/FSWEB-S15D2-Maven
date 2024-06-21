package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        // Set lerde verilerin içerikleri unique olmalı, yoksa diğer verileri filtreler (equals a dikakt et)
        Set<Task> annsTasks = new HashSet<>();
        Task annTask = new Task("workintech", "dummy desc", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task annTask2 = new Task("workintech", "dummy desc 2", "ann", Status.IN_PROGRESS, Priority.HIGH);

        annsTasks.add(annTask);
        annsTasks.add(annTask2);

        Set<Task> bobsTasks = new HashSet<>();
        Task bobsTask = new Task("workintech", "dummy desc", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task bobsTask2 = new Task("workintech", "dummy desc 2", "bob", Status.IN_PROGRESS, Priority.HIGH);

        bobsTasks.add(bobsTask);
        bobsTasks.add(bobsTask2);


        Set<Task> carolsTasks = new HashSet<>();
        Task carolsTask = new Task("workintech", "dummy desc", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task carolsTask2 = new Task("workintech", "dummy desc 2", "carol", Status.IN_PROGRESS, Priority.HIGH);

        carolsTasks.add(carolsTask);
        carolsTasks.add(carolsTask2);


        Set<Task> unassignedTasks  = new HashSet<>();
        Task unassignedTask = new Task("workintech", "dummy desc", null, Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks );

        System.out.println("bobstasks: " + taskData.getTasks("bob"));
        System.out.println("annstasks: " + taskData.getTasks("ann"));
        System.out.println("carolstasks: " + taskData.getTasks("carol"));
        System.out.println("alltasks: " + taskData.getTasks("all"));

        System.out.println("unassigned: " + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));
         */
        StringSet.findUniqueWords();
    }
}