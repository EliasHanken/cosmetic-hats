package com.streafe.cosmetichats.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.bukkit.event.Listener;

public class SQL implements Listener{
	
	private static Connection connection;
	private static Statement statement;

	public void Connect(){
		
	}
	
	public void Disconnect(){
		
	}
	
	public boolean isConnected(){
		try {
			if(!connection.isClosed()){
				return true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
