package com.schedulers;

import java.util.Timer;

public class SchedularCell {
	public static void main(String[] args) {
		Timer timer =new Timer();
		SchedularMain scMain=new SchedularMain();
		timer.scheduleAtFixedRate(scMain, 0, 5000);
	}

}
