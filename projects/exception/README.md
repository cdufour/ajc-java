## Objectifs
- Découvrir le mécanisme de la gestion des exceptions.
- Clause try, catch, finally.
- Clause throw, throws.

## A faire
On veut écrire la fonction correctInput qui permet de saisir correctement un entier.  
Si l'utilisateur saisit une donnée dont le format n'est pas celui d'un entier, le programme lève l'exception __InputMismatchException__.

### Partie 1
La fonction devra traiter cette erreur en fournissant une solution alternative.  
Un message d'erreur sera affiché avec la proposition d'effectuer une nouvelle saisie.

*Exemple d'exécution*
```
Donnez un entier :
java
Erreur de saisi
Fin
Donnez un entier :
-7
L'entier saisi est : -7
Fin
```

### Partie 2
L'entier saisi doit être impérativement supérieur à 10.  
On demande donc de créer une classe d'exception adaptée à cette erreur, puis de modifier le programme afin de traiter ce cas d'erreur.  

__note__  
On aurait pu utiliser l'exception prédéfinie IllegalArgumentException pour vérifier que l'entier saisi est supérieur à 10.  

*Exemple d'exécution*
```
Donnez un entier :
java
Erreur de saisi
Donnez un entier :
4
valeur < 10
Donnez un entier :
34
L'entier saisi est : 34
```

