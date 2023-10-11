package com.packsql;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HashMap<String, String[]> graph = Test.creationfunc();
		 String depart = request.getParameter("depart");
		 System.out.println(depart);
		 DFS filler=new DFS();
	        String dfsResult = filler.dfs(graph, depart);
	        System.out.println(dfsResult+" search");
	        HttpSession session = request.getSession();
	       session.setAttribute("dfs", dfsResult);
	       session.setAttribute("word", depart);
	       String dfsResultat = (String) session.getAttribute("dfs");
	       System.out.println("Stored dfsResult: " + dfsResultat);
	       response.sendRedirect("dfs.jsp");
	}


}
