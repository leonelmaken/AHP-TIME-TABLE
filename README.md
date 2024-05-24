Vendredi, 24 Mai 2024



                                                                       TP INFO-4178
                          THÈME : Conception d’un logiciel pour la création du meilleur emploie de temps de la Faculté des Sciences de l’Université de yaoundé I

Problème : Le problème clairement énoncé dans ce passage est celui de l'élaboration d'un emploi du temps pour les cours universitaires à l'Université de Yaoundé1. Il s'agit d'un défi majeur rencontré par les établissements éducatifs du monde entier. Ce problème de planification des horaires de cours est une tâche d'optimisation complexe qui nécessite une prise en compte minutieuse de diverses contraintes et objectifs afin de produire un emploi du temps réalisable et efficace pour un semestre académique.

Objectif : L'objectif est de développer un modèle mathématique pour la planification des cours magistraux dans cette université, ce qui implique de trouver une solution qui respecte les contraintes de disponibilité des salles, les préférences des enseignants, les besoins des étudiants et autres contraintes similaires.


Modèle mathématique:



    1. Définition du problème ::Identifie clairement le problème à résoudre, y compris l'objectif du    modèle, les variables impliquées, ainsi que les contraintes ou limitations.
    2. Formulation mathématique: Utilise les mathématiques pour formuler le modèle en définissant les ensembles, paramètres, contraintes et variables de décision.
    3. Solutions / techniques: Sélectionne un solveur ou une technique de solution adaptée pour résoudre le problème, en tenant compte de sa complexité, de la nature des variables et des contraintes, ainsi que du niveau d'optimisation requis.
    4. Vérification et validation: Après l'obtention d'une solution, il est crucial de valider le modèle en testant sa sensibilité aux changements des paramètres ou des contraintes d'entrée. Cela implique de tester le modèle avec différents scénarios pour évaluer sa robustesse et sa fiabilité.
      
      Contraintes (Hard and Soft) :
    • Hard Contraintes :
    2. Absence de chevauchement des horaires de cours : Aucun cours ne doit se chevaucher avec un autre pour un même enseignant ou une même salle.

    3. Temps de repos pour les enseignants : Les enseignants doivent avoir au moins une heure de repos entre leurs cours.
    4. Équilibre des horaires pour les étudiants : Les étudiants ne doivent pas être surchargés par des cours successifs sans pauses adéquates.
    5. Durée maximale des cours : La durée maximale d'un cours est fixée à 3 heures.
    6. Respect des plages horaires et jours de cours : Les horaires de cours doivent respecter les règles administratives de l'université.
    7. Distances adéquates entre les cours : Les déplacements entre les salles de cours ne doivent pas être trop longs ni trop courts, respectant une norme appropriée.
    • Soft Contraintes :
    1. Préférences des enseignants : Les préférences de créneaux horaires des enseignants doivent être prises en compte autant que possible.
    2. Concentration des cours : Les cours d'un même programme ou d'un même groupe d'étudiants doivent être concentrés pour minimiser les périodes de temps libre non productives.
    3. Répartition équilibrée des cours : Les cours devraient être répartis de manière équilibrée tout au long de la semaine pour éviter des journées trop chargées ou trop légères.
    4. Utilisation optimale des ressources : Les salles de cours et autres ressources doivent être utilisées de manière optimale pour éviter des périodes de sous-utilisation ou de sur-utilisation.
    5. Adaptabilité aux changements : Le modèle doit être flexible pour s'adapter facilement aux modifications de dernière minute, telles que les absences d'enseignants ou les changements de salle.
                                                                      
            Modèle mathématique pour les systèmes d'ordonnancement de cours magistraux


    1) Set :
               E : Représente l’ensemble des étudiants avec (e ∈ E)
               T : Représente l’ensemble des enseignants avec (t ∈ T)
               C : Représente l’ensemble des Classes avec (c∈ C)
               L : Représente l’ensemble des Cours avec (l∈ L)
               J : Représente l’ensemble des Jours d’ouvertures avec (j ∈ J)
              H : Représente l’ensemble des Heure de cours avec (h ∈ H)
    2) Définition des paramètres :
           Ct,c : paramètres binaire qui indique qu’un enseignant enseigne un cours à une période donnée.
              Al,e :   paramètres binaire qui indique qu’un étudiant peut suivre un cours à une période donnée.    
                  el,j : paramètre binaire qui indique qu’un cours se déroule à des jours précis.    
                  Fr  : paramètre binaire qui représente la capacité maximale d’une salle de classe. 
                 qj   : paramètre binaire qui représente la capacité maximale d’une salle de classe. 
                ae,c​ : Indicateur si l'enseignant e est assigné au cours c
    • bs,c​ : Indicateur si la salle s est assignée au cours c
    • pe,t​ : Préférence de l'enseignant e pour la plage horaire t
    • lc​ : Durée du cours c
    6) 
                 sh   : paramètre binaire qui représente les heures de cours.
    7) Définition des variables décisionnelles : 
    • représente qu’un cours l est dispensé par un enseignant t le jour j à l’heure h : Xl,t,j,h
    • représente qu’un cours l est dispensé dans une salle r : Wl,r
    •  représente le nombre de jours j d’ouvertures pour les cours  des étudiants e : Zj,e
    •  représente le nombre de cours l suivie par un étudiant e : Sl,e
    • représente  les jours j qu’une salle r peut être occupé par des  étudiants e et un enseignant t pour un cours l : Oj,r,e,t,l  
    A) Formule Mathématique : 
    • Il ne peut pas avoir différents cours c dispensés le même jours j à la même  h, par le même enseignant t
    • Un enseignant t ne peut pas être programmé à la même heure h pour des cours l différents
    • les étudiants e ne peuvent pas avoir plusieurs cours l qui se succèdent le même jour j  sans repos
    • les enseignants t doivent avoir des heures  h de repos après chaque l 
    • On ne peut pas programmer des cours c différents à la même heure h dans une même salle de classe r
    • Les étudiants e doivent être présent au campus seulement pendant leur jour j de cours l pour libérer les salle de classe r

        
                                                               Modèle hiérarchique :
       


On se base sur 3 principaux critères : Disponibilité des étudiants, enseignants, et les préférences de l’administration  



1- Pour calculer l'Analyse Hiérarchique des Processus (AHP) avec seulement trois critères pour les enseignants, nous suivrons la méthodologie AHP en ajustant les exemples donnés.
Étapes pour calculer l'AHP
    1. Construction de la Matrice de Comparaisons par Paires
    2. Normalisation de la Matrice
    3. Calcul des Poids des Critères
    4. Calcul du Ratio de Consistance (CI et CR)
1. Matrice de Comparaisons par Paires
Disons que nos trois critères sont :
    • Disponibilité des enseignants (D)
    • Préférences horaires des enseignants (P)
    • Temps de repos entre les cours (R)
Supposons que les comparaisons par paires soient les suivantes :

D
P
R
D
1
3
5
P
1/3
1
4
R
1/5
1/4
1
2. Matrice Normalisée
Normalisons la matrice en divisant chaque élément par la somme de sa colonne :
Sommes des Colonnes

D
P
R
Sum
1.5333
4.25
10
Matrice Normalisée

D
P
R
Sum Row
Criteria Weight
D
0.652
0.706
0.5
1.858
0.619
P
0.217
0.235
0.4
0.852
0.284
R
0.131
0.059
0.1
0.290
0.097
3. Calcul des Poids des Critères
Les poids des critères sont les sommes de chaque ligne divisées par 3 (le nombre de critères) pour obtenir les valeurs moyennes des critères :

Criteria Weight
D
0.619
P
0.284
R
0.097
4. Calcul du Ratio de Consistance (CI et CR)
Matrice des Poids Multipliés par les Poids des Critères

D
P
R
Criteria Sum Weight
D
1*0.619 = 0.619
3*0.284 = 0.852
5*0.097 = 0.485
1.956
P
0.333*0.619 = 0.206
1*0.284 = 0.284
4*0.097 = 0.388
0.878
R
0.2*0.619 = 0.124
0.25*0.284 = 0.071
1*0.097 = 0.097
0.292
Calcul du Ratio (Xc)
Pour chaque critère :

Criteria Weight
Criteria Sum Weight
Xc
D
0.619
1.956
3.159
P
0.284
0.878
3.091
R
0.097
0.292
3.011
Calcul de λ_max
La moyenne de Xc :
λmax​=33.159+3.091+3.011​=3.087
Indice de Consistance (CI)
CI=n−1λmax​−n​=3−13.087−3​=0.0435
Ratio de Consistance (CR)
Pour n=3, le RI est de 0.58.
CR=RICI​=0.580.0435​=0.075
Conclusion
Puisque CR<0.1, notre matrice est consistante.
Les poids des critères pour les enseignants sont :
    • Disponibilité des enseignants (D) : 0.619
    • Préférences horaires des enseignants (P) : 0.284
    • Temps de repos entre les cours (R) : 0.097
       
       2- Pour calculer l'Analyse Hiérarchique des Processus (AHP) pour les étudiants en utilisant trois critères, nous allons suivre la même méthodologie que précédemment. Supposons que les trois critères pour les étudiants sont les suivants :
    1. Absence de chevauchement des cours (A)
    2. Charge de cours équilibrée (C)
    3. Répartition des cours sur la semaine (R)
1. Matrice de Comparaisons par Paires
Supposons que les comparaisons par paires soient les suivantes :

A
C
R
A
1
3
5
C
1/3
1
2
R
1/5
1/2
1
2. Matrice Normalisée
Normalisons la matrice en divisant chaque élément par la somme de sa colonne :
Sommes des Colonnes

A
C
R
Sum
1.533
4.5
8
Matrice Normalisée

A
C
R
Sum Row
Criteria Weight
A
0.652
0.667
0.625
1.944
0.648
C
0.217
0.222
0.25
0.689
0.230
R
0.131
0.111
0.125
0.367
0.122
3. Calcul des Poids des Critères
Les poids des critères sont les sommes de chaque ligne divisées par 3 (le nombre de critères) pour obtenir les valeurs moyennes des critères :

Criteria Weight
A
0.648
C
0.230
R
0.122
4. Calcul du Ratio de Consistance (CI et CR)
Matrice des Poids Multipliés par les Poids des Critères

A
C
R
Criteria Sum Weight
A
1*0.648 = 0.648
3*0.230 = 0.690
5*0.122 = 0.610
1.948
C
0.333*0.648 = 0.216
1*0.230 = 0.230
2*0.122 = 0.244
0.690
R
0.2*0.648 = 0.130
0.5*0.230 = 0.115
1*0.122 = 0.122
0.367
Calcul du Ratio (Xc)
Pour chaque critère :

Criteria Weight
Criteria Sum Weight
Xc
A
0.648
1.948
3.006
C
0.230
0.690
3.000
R
0.122
0.367
3.008
Calcul de λ_max
La moyenne de Xc :
λmax​=33.006+3.000+3.008​=3.00467
Indice de Consistance (CI)
CI=n−1λmax​−n​=3−13.00467−3​=0.00233
Ratio de Consistance (CR)
Pour n=3, le RI est de 0.58.
CR=RICI​=0.580.00233​=0.004
Conclusion
Puisque CR<0.1, notre matrice est consistante.
Les poids des critères pour les étudiants sont :
    • Absence de chevauchement des cours (A) : 0.648
    • Charge de cours équilibrée (C) : 0.230
    • Répartition des cours sur la semaine (R) : 0.122
3- Pour calculer l'Analyse Hiérarchique des Processus (AHP) pour l'administration en utilisant trois critères, nous allons suivre la méthodologie AHP décrite précédemment. Supposons que les trois critères pour l'administration soient les suivants :
    1. Utilisation optimale des ressources (U)
    2. Respect des contraintes administratives (C)
    3. Distance entre les cours (D)
1. Matrice de Comparaisons par Paires
Supposons que les comparaisons par paires soient les suivantes :

U
C
D
U
1
3
4
C
1/3
1
2
D
1/4
1/2
1
2. Matrice Normalisée
Normalisons la matrice en divisant chaque élément par la somme de sa colonne :
Sommes des Colonnes

U
C
D
Sum
1.583
4.5
7
Matrice Normalisée

U
C
D
Sum Row
Criteria Weight
U
0.632
0.667
0.571
1.870
0.623
C
0.211
0.222
0.286
0.719
0.240
D
0.158
0.111
0.143
0.412
0.137
3. Calcul des Poids des Critères
Les poids des critères sont les sommes de chaque ligne divisées par 3 (le nombre de critères) pour obtenir les valeurs moyennes des critères :

Criteria Weight
U
0.623
C
0.240
D
0.137
4. Calcul du Ratio de Consistance (CI et CR)
Matrice des Poids Multipliés par les Poids des Critères

U
C
D
Criteria Sum Weight
U
1*0.623 = 0.623
3*0.240 = 0.720
4*0.137 = 0.548
1.891
C
0.333*0.623 = 0.208
1*0.240 = 0.240
2*0.137 = 0.274
0.722
D
0.25*0.623 = 0.156
0.5*0.240 = 0.120
1*0.137 = 0.137
0.413
Calcul du Ratio (Xc)
Pour chaque critère :

Criteria Weight
Criteria Sum Weight
Xc
U
0.623
1.891
3.034
C
0.240
0.722
3.008
D
0.137
0.413
3.015
Calcul de λ_max
La moyenne de Xc :
λmax​=33.034+3.008+3.015​=3.019
Indice de Consistance (CI)
CI=n−1λmax​−n​=3−13.019−3​=0.0095
Ratio de Consistance (CR)
Pour n=3, le RI est de 0.58.
CR=RICI​=0.580.0095​=0.0164
Conclusion
Puisque CR<0.1, notre matrice est consistante.
Les poids des critères pour l'administration sont :
    • Utilisation optimale des ressources (U) : 0.623
    • Respect des contraintes administratives (C) : 0.240
    • Distance entre les cours (D) : 0.137
