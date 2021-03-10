package com.ltts.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Dao.PlayerDao;
import com.ltts.model.Player;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			// TODO Auto-generated method stub
			//doGet(request, response);
		    int id=Integer.parseInt(request.getParameter("ivalue"));
		    String s=request.getParameter("nvalue");
		    String d=request.getParameter("dvalue");
		    String n=request.getParameter("Nvalue");
		    String sk=request.getParameter("svalue");
		    int r=Integer.parseInt(request.getParameter("rvalue"));
		    int w=Integer.parseInt(request.getParameter("wvalue"));
		    int No=Integer.parseInt(request.getParameter("Nuvalue"));
		    int t=Integer.parseInt(request.getParameter("tvalue"));
		    
		    Player p1=new Player(id,s,d,n,sk,r,w,No,t);
		    System.out.println("Inside Servlet: "+p1);
			PlayerDao pd=new PlayerDao();
			boolean b=false;
			try 
			{
				b=pd.insertPlayer(p1);
				System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

