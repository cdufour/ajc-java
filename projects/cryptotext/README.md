# Project/cryptotext

## A faire
Sur la base du diagramme de classes suivant:
![Diagramme](diagram.png)  

- Ecrire l'interface ICrypto dans un package project.crypto
- Ecrire les classes CustomText et Quote dans un package project.crypto
- Ecrire une classe de Test (package.test) dans laquelle vous devrez
    - Créer des citations
    - Lister des citations en affichant body, source et catégorie
    - Lister les citations en affichant uniquement une version raccourcie du body
    - Lister les citations en affichant que le body, dans sa version cryptée

### Note
L'algorithme de cryptage est au choix: substitution, inversion des lettres, ROT13 (https://rot13.com/), etc.  

## Exemple d'exécution
```
Liste des citations:
--- Citation 1 ---
Du fanatisme à la barbarie il n'y a q'un pas. (Source: Diderot - Catégorie: Fanastime)

--- Citation 2 ---
Qui n'a jamais été ridicule ne sait point rire. (Source: Alain - Catégorie: Rire)

--- Citation 3 ---
Rien ne désarme comme le rire. (Source: Henri Bergson - Catégorie: Rire)


Liste des citations raccourcies:
--- Citation 1 ---
Du fanatisme à la...

--- Citation 2 ---
Qui n'a jamais été...

--- Citation 3 ---
Rien ne désarme ...


Liste des citations cryptées (rot1):
--- Citation 1 ---
Ev gbobujtnf à mb cbscbsjf jm o'z b r'vo qbt.

--- Citation 2 ---
Rvj o'b kbnbjt éué sjejdvmf of tbju qpjou sjsf.

--- Citation 3 ---
Sjfo of eétbsnf dpnnf mf sjsf.
```