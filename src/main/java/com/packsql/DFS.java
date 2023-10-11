package com.packsql;
import java.util.HashMap;
public class DFS {
	
	
	 public  String dfs(HashMap<String, String[]> graph, String depart) {
	        StringBuilder html = new StringBuilder();
	        dfsHelper(graph, depart, html);
	        return html.toString();
	    }
	    private  void dfsHelper(HashMap<String, String[]> graph, String depart, StringBuilder html) {
	    	 html.append("<li class='toggle'>");
	    	 if(depart!=" ")
	        html.append("<p class='span'>"+depart+"</p>");
	       
	       
	        if (graph.get(depart) != null) {
	            html.append("<ul class='grand'>");
	            for (String adjacentVertex : graph.get(depart)) {
	                dfsHelper(graph, adjacentVertex, html);
	            }
	            html.append("</ul>");
	        }
	        html.append("</li>");
	    }

}
