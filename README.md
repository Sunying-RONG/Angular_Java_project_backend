# projetJavaAvance
## Architecture
Ce projet utilise l'architecture de MVC (modèle, vue, contrôleur) et consisté par deux petits projets: 

Ce projet de Java Spring Boot est pour les parties modèle et contrôleur. Le projet Angular est pour la partie vue.

- La configuration de la connexion de la base de donnée est dans /projetJavaAvance/src/main/resources/application.properties  
- Class modèle est pour les tables utilisées, mapping leurs relations par hibernate.  
- Resposities correspondent à chaque modèle et extends JpaRepository pour utiliser sa CRUD opérations.   
- Interface de service qui correspondent à chaque modèle et mettre les signatures de fonctions pour les opérations nécessaires.  
- Classe service implémente interface de service et utilisant repository, implémenter les fonctions.  
- Contrôleurs correspondent à chaque modèle, et qui utilisent les fonctions de service, exposent les méthodes pour être consumées par Web vue par RestController (GetMapping, PutMapping, PostMapping, DeleteMapping) et les chemins et paramètres pour les appeler.  

Diagramme de classes:  
![alt text](https://github.com/Sunying-RONG/projetJavaAvance/blob/main/material/classUml.png)

Diagrammes de cas d’utilisation:  
![alt text](https://github.com/Sunying-RONG/projetJavaAvance/blob/main/material/diagrammesCasUtilisation.png)

Diagrammes de séquences:  
![alt text](https://github.com/Sunying-RONG/projetJavaAvance/blob/main/material/DiagrammesSequences.png)
