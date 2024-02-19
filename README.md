Nous avons structuré notre projet en suivant les étapes suivantes :

Définition des interfaces : Nous avons défini deux interfaces, IDao et IMetier, représentant respectivement la couche d'accès aux données et la logique métier de notre application.

Implémentation des interfaces : Nous avons créé des implémentations concrètes pour chaque interface. La classe DaoImpl fournit une implémentation de la méthode getDate définie dans IDao, tandis que la classe MetierImpl implémente la méthode calcul de l'interface IMetier.

Injection de dépendances : Nous avons exploré trois méthodes d'injection de dépendances :

a. Instanciation statique : Dans cette approche, nous avons instancié directement les dépendances dans notre code en utilisant le mot-clé new.

b. Instanciation dynamique : Nous avons utilisé la réflexion pour instancier dynamiquement les dépendances à l'exécution, ce qui permet une plus grande flexibilité mais introduit également une complexité supplémentaire.

c. Utilisation de Spring Framework : Nous avons utilisé Spring Framework pour gérer l'injection de dépendances en utilisant à la fois la configuration XML et les annotations. Spring simplifie considérablement la gestion des dépendances en automatisant le processus d'instanciation et de gestion des objets.
