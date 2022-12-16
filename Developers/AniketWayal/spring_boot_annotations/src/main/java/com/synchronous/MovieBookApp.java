package com.synchronous;

import jakarta.transaction.Synchronization;

class BookTheaterSeat
{
	int total_seats=10;
	synchronized void bookSeat(int seats) //method synchronized
	{
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());

		synchronized(this) { // blocksynchronized is used
			if(total_seats>=seats)
			{
				System.out.println(seats +" Seats booked successfully");
				total_seats=total_seats-seats;
				System.out.println("seats left : "+total_seats);
			}
			else {
				System.out.println("sorry seats not booked");
				System.out.println("seats left :" +total_seats);
			}
		}
		
		
		System.out.println("hi: "+Thread.currentThread().getName());

		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());

		
	}
	
}

public class MovieBookApp extends Thread{

	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats );
	}
	public static void main(String[] args) {

		b=new BookTheaterSeat();
		MovieBookApp Aniket=new MovieBookApp();
		Aniket.seats=7;
		Aniket.start();
		
		MovieBookApp Amit=new MovieBookApp();
		Amit.seats=6;
		Amit.start();
	}

}
