package com.packsql;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static HashMap<String, String[]>  creationfunc()
	{
			HashMap<String, String[]> graph = new HashMap<String, String[]>();
			graph.put(" ", new String[] { "Etudiants","Profs","assistants" });
			 graph.put("Etudiants", new String[] { "licence", "mastére", "doctorat" });
			 graph.put("licence", new String[] { "informatique", "math", "chimie" });
			 graph.put("Profs", new String[] { "prof1", "prof2", "prof3" });
			    /*String[] keys = {"key2", "World", "Java", "lala", "tat", "J","faf", "fa", "Ja" };

		        for (String key : keys) {
		            graph.put(key, null);
		        }*/

             
		     return graph;    
	}
	public static int count() {
		return 11;
	}


	

	  public static void dfs(HashMap<String, String[]>  graph, String depart) {

	    
 
	        for (String adjacentVertex : graph.get(depart)) {
	             {System.out.println("<li>");
	             System.out.println(adjacentVertex);
	             
	               if(graph.get(adjacentVertex)!=null)
	            	   {System.out.println("<ul>");
	            	   
	                dfs(graph, adjacentVertex);
	                System.out.println("</ul>");
	            }
	               System.out.println("</li>");
	        }
	    }
	}


}
