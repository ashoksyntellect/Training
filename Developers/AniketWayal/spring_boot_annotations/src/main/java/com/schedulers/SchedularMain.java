package com.schedulers;

import java.sql.Date;
import java.util.TimerTask;

public class SchedularMain extends TimerTask{
	
	java.util.Date current;
	int cnt=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		current = new java.util.Date();
		System.out.println("Current Date and time is :"+current);
		cnt++;
		if(cnt ==5) {
			System.out.println("exit.");
			System.exit(0);
		}
	}

}
