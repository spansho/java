package com.newService.superDuper;

import java.util.concurrent.Semaphore;

/**
 * Hello world!
 */
public class App {
	
	
	//Кароче хз успею или нет сегодня напаисать но реализовать так что бы в классе jhread была статическая переменная и когда один поток начинает выполняться все остальные потоки блкоируеют ну семафор кароче
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Semaphore semaphore= new Semaphore(2);
        //for(int i =0;i<5;i++)
       // {
        //	new JThread("good thread number",i ,i,i+5,semaphore).start();;
 //
       // }

    	System.out.print("Стартуем");
    	System.out.print("Стартуем");
    	System.out.print("Другая ветка");
        UserService userService = new UserService();
        User user = new User(1,"Masha",26);
        userService.saveUser(user);
    	
    	
    }
}
