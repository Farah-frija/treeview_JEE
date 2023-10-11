<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>DFS Display</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
     <link rel="stylesheet" href="dfs.css" />
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"> <!-- Link to Font Awesome for icons -->
    <title>Search Input</title>
</head>

<body>
 <section>
  <div class="search-container">
   <input type="text" class="search-input" placeholder="Search..." id="prepositionInput" value=<%= session.getAttribute("word")%>>
       
    </div>
    <div class="liste">
       <ul id="prepositionList" >
       </ul>
    </div>
    <ul>
       <%= (String) session.getAttribute("dfs")%>
   
    </ul>
    </section>
    <script src="search.js"></script>
</body>
</html>



