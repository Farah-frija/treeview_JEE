# treeview_JEE
Treeview dynamique JEE/Js/html/css
- J'ai développé une TreeView dynamique en utilisant Java EE (JEE).
- J'ai implémenté un algorithme DFS pour générer du code HTML avec des balises `<ul>` et `<li>`.
- J'ai créé une classe Java contenant une `HashMap<String, String[]>` pour représenter un graphe orienté où chaque nœud est le fils d'un seul parent.
  Pour la recherche:
- J'ai prévu un nœud racine qui contient une chaîne vide pour gérer le cas où l'utilisateur n'a rien saisi dans la requête.
- J'ai initialement tenté de masquer les éléments qui n'ont pas de relation avec le mot-clé de recherche en utilisant JavaScript, mais cela a conduit à des imperfections.
- J'ai opté pour l'appel d'un servlet qui génère un nouveau code HTML à chaque recherche en utilisant la fonction `dfshelper` et prend comme parametre le mot saisi.
