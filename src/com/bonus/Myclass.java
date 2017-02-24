package com.bonus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myclass
 */
@WebServlet("/Myclass")
public class Myclass extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Myclass() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printResultOfVote = response.getWriter();
		
		String resultOfVote = request.getParameter("group1");
		System.out.println("Result of vote :	" + resultOfVote);
		
		try {
			if(resultOfVote.equals("El-Zamalek")){
				printResultOfVote.println("Result of vote is El-Zamalek");
				
			}else if(resultOfVote.equals("El-Ahly")){
				printResultOfVote.println("Result of vote is El-Ahly");
				
			}
			
		} catch (Exception e) {
			printResultOfVote.println("You didn't select a team");
			printResultOfVote.println("<a href='index.html'>back</a>");
			
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
