/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithreadapp;

/**
 *
 * @author Laptop Outlet
 */
public class Runnabletask implements Runnable {
    
@Override
public void run() {
System.out.println(Thread.currentThread().getId() + " is executingthe runnable task.");
}
public static void main(String[] args) {
Runnabletask task1 = new Runnabletask();
Runnabletask task2 = new Runnabletask();
Thread thread1 = new Thread(task1);
Thread thread2 = new Thread(task2);
thread1.start(); // Starts thread1
thread2.start(); // Starts thread2
}
}

