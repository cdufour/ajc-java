# Project/Room

## Objectifs
- Découvrir la programmation en couche
- Définir les propriétés et méthodes d'une classe
- Définir un constructeur d'initilialisation
- Créer une instance de classe
- Utiliser les variables de classe (static)
- Utiliser les interfaces génériques 
- Utiliser les collections

### Couche métier 
- Définir une classe Room avec les attributs suivants : id, code et label.
- Définir les accesseurs  aux différents attributs de la classe.
- Définir un constructeur permettant d’initialiser les attributs d'un objet salle par des valeurs saisies par l'utilisateur. 
Sachant que Id doit être auto-incrément. 
- Définir la méthode toString() permettant d'afficher les informations de la salle en cours.

### Couche accès aux données
- Créer l'interface générique IDao avec les méthodes : 
    - boolean create(T o) : Méthode permettant d'ajouter un objet o de type T.  
    - boolean delete(T o) : Méthode permettant de supprimer un objet o de type T.  
    - boolean update(T o) : Méthode permettant de modifier un objet o de type T.  
    - T findById (int id) : Méthode permettant de renvoyer un objet dont id est passé en paramètre.  
    - List <T> findAll() : Méthode permettant de renvoyer la liste des objets de type T.  
- Créer la classe RoomService qui implémente l'interface IDao. 
Dans cette classe les données seront stockés dans une collection de type List.

### Couche de présentation 
- Dans une classe de test : 
    - Créer cinq salles.
    - Afficher la liste des salles.
    - Supprimer une salle.
    - Modifier les informations d'une salle.
    - Afficher la liste des salles.