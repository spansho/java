package com.newService.superDuper;
import java.lang.Object;

public class classForTesting {
	
	int inputValueX;
	int inpitValueY;
	
	String df;
	
	public classForTesting()
	{
		inpitValueY=0;
		inputValueX=0;
		df="empty";
	}
	
	public classForTesting(int x,int y,String kv)
	{
		inpitValueY=y;
		inputValueX=x;
		df=kv;
	}
	
	
	public int getX()
	{
		return inputValueX;
	}
	
	public int getY()
	{
		return inpitValueY;
	}
	
	public String getString()
	{
		return df;
	}

}
