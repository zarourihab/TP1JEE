TP 1 : Programmation dynamique par réflexion
Objectif :

L’objectif de ce TP est de comprendre et de mettre en œuvre le concept d’injection de dépendances en Java en utilisant la réflexion. Cela permet de découpler les composants d’une application (DAO et Métier) et de charger dynamiquement les classes à partir d’un fichier de configuration.

Étapes réalisées :

Création du package dao :

Interface IDao : définit une méthode getValue() retournant un double.

Classe DaoImpl : implémente IDao et renvoie une valeur fixe (100.0).
But : représenter la couche d’accès aux données.

Création du package metier :

Interface IMetier : définit une méthode calcul() retournant un double.

Classe Métier (implémentation) : contient une référence à IDao et utilise la méthode getValue() pour effectuer un calcul.
But : représenter la logique métier indépendante de la DAO.

Fichier de configuration (config.txt) :

Contient les noms des classes DAO et Métier à instancier dynamiquement.
But : permettre le changement de l’implémentation sans modifier le code.

Création du package presentation :

Classe Presentation2 :

Lit le fichier de configuration pour récupérer les noms des classes.

Utilise la réflexion pour charger et instancier les classes DAO et Métier.

Injecte la dépendance DAO dans la classe Métier dynamiquement.

Exécute la méthode calcul() et affiche le résultat.
But : démontrer l’injection de dépendances sans couplage direct.

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003514" src="https://github.com/user-attachments/assets/23a219ea-58ff-46e5-abda-3aadad563689" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003510" src="https://github.com/user-attachments/assets/3f2932d4-a0b4-47b4-b2f1-2ae39ff15385" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003510" src="https://github.com/user-attachments/assets/0b761c41-cfbd-48f0-b119-bb53a8d46b79" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003448" src="https://github.com/user-attachments/assets/7a8d2bb9-a230-44b0-bd19-41378716a537" />
<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003451" src="https://github.com/user-attachments/assets/452aa0d0-999c-4368-9fa5-f33b595d9a38" />
<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003503" src="https://github.com/user-attachments/assets/4dceafd6-61d7-44de-95d3-8d0c026ceaad" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-10 003437" src="https://github.com/user-attachments/assets/079ad2e6-ae43-41c3-9e3e-7babb9c5cd5b" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-09 214025" src="https://github.com/user-attachments/assets/d7a01f08-4d7f-4d0f-86e4-bb03dc0b3631" />

<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-09 121423" src="https://github.com/user-attachments/assets/4396ea76-6758-4f70-8778-014820526791" />
<img width="1920" height="1080" alt="Capture d&#39;écran 2026-03-09 121702" src="https://github.com/user-attachments/assets/b077e379-6def-4406-976c-6a0e2c07e4a2" />

