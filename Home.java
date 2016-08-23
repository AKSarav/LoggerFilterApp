package com.logger.app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Home() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML>");
		out.println("<head>"
				+"<style>"
				+"table"
				+ "{"
				+ "border-collapse: collapse;"
				+ "border-bgcolor: gray;"
				+ "}"
				+"th"
				+ "{"
				+ "border: 1px solid;"
				+ "font: 16px calibri;"
				+ "font-weight: bold;"
				+ "background-color: gray;"
				+ "color: white;"
				+ "}"
				+"td"
				+ "{"
				+ "border: 1px solid;"
				+ "font: 14px calibri;"
				+ "color: black;"			
				+ "}"
				+"</style>"
				+ "</head>");
		out.println("<body>" +
				"<table style=\"border-collapse: true; border: 1px solid;\"><tr><th>Object</th><th>Value</th></tr>" +
				"<tr><td>Session ID </td><td>"+request.getRequestedSessionId()+"</td></tr>"+ 
				"<tr><td>QueryString </td><td>"+request.getQueryString()+"</td></tr>"+
				"<tr><td>ContextPath </td><td>"+request.getContextPath()+"</td></tr>"+
				"<tr><td>Requested URL</td><td>"+request.getRequestURL()+"</td></tr>"+
				"</table></body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
