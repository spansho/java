package com.newService.superDuper;

import java.util.concurrent.Semaphore;

public class JThread extends Thread
{

	
	private static publicRes res;
	private Semaphore semaphorez;
	private int numberr;
	private int started;
	private int ended;
    
	public JThread(String nameString,int nubmerz,int start,int ende,Semaphore sem) {
		super(nameString);
		numberr=nubmerz;
		started=start;
		ended=ende;
		semaphorez=sem;
	    res=new publicRes(0);
	}
	
	
	
	@Override
	public void run()
	{
		System.out.println("thread number "+ numberr + " waited");
		int localSum=0;
		int localz=1;
		{
			try 
			{
				semaphorez.acquire();
				synchronized (res) 
				{
				
					for(int i =started;i<ended;i++)
					{
						synchronized (res)
						{
						res.value+=i;
						}
					
					System.out.println("Iteration number "+(localz++)+" of Thread "+numberr);
					//System.out.println("Kolvol mest v semaphore "+semaphorez.availablePermits());
					}
				}
			System.out.println("Curent sum is "+ res.value);
			} 
			
			catch (InterruptedException  e) 
			{
				System.out.println(e.getMessage());// TODO: handle exception
			}
			
			semaphorez.release();
			
		
	    }
		
    }
}
