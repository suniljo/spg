package com.spg.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.spg.boot.beans.DBConnection;
import com.spg.boot.beans.Ticket;

@SpringBootApplication
public class Application {

    private final DBConnection DBConnection;

    Application(DBConnection DBConnection) {
        this.DBConnection = DBConnection;
    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("-".repeat(100));
		
		Ticket ticket = context.getBean(Ticket.class);
		System.out.println(ticket);
		System.out.println("-".repeat(100));
		
		DBConnection dbcon = context.getBean(DBConnection.class);
		System.out.println(dbcon);
	}

}
