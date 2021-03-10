package com.ltts.Dao;


import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Connection.MyConnection;
import com.ltts.model.Player;


public class PlayerDao {

		public List<Player> getAllPlayers()
		{
			List<Player> li= new ArrayList<Player>();
			return li;
		}
		public Player getPlayerById(int id)
		{
			Player p=new Player();
			return p;
		}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("select * from Player where player_id=?");
		ps.setInt(1, p.getPlayer_id());
		/*ps.setString(2, p.getName());
		ps.setString(3, p.getDateOfBirth());
		ps.setString(4, p.getNationality());
		ps.setString(5, p.getSkills());
		ps.setInt(6, p.getRuns());
		ps.setInt(7, p.getWickets());
		ps.setInt(8, p.getNumber_of_matches());
		ps.setInt(9, p.getTeam_id());*/
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
		
	}
	
}