package as;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.processing.ProcessingEnvironment;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SubClass{
	
	public static void main(String[] args){
	
			Thread thread=new Thread();
			
			thread.run();
			System.out.println("ping");
	}
	static void pong(){
		System.out.println("pong");
	}
	
}

