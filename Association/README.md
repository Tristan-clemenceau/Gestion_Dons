Gestion des dons pour une association en POO
Langages d’implémentation Java
L’association «Mobilier_Pour_Tous » a pour but d’aider les personnes âgées en
difficulté.
Elle peut notamment fournir des meubles ou autres besoins matériels aux personnes âgées
qui en font la demande.
L’association est donc fréquemment sollicitée pour recevoir des dons d’objets d’usage
domestique (tels que du mobilier, des couverts, de l’électroménager…). L’application
informatique à réaliser doit leur permettre de mieux gérer les propositions de dons et
les stocks de mobilier afin de répondre plus efficacement aux besoins des personnes
âgées.
Le système actuel de gestion des offres de dons
Les propositions de dons sont étudiées par l’association puis elle décide d’acquérir ou
non l’objet proposé. Les dons effectivement reçus sont stockés soit à l’association
elle-même, soit dans des entrepôts ou enfin dans des dépôts-Ventes.
Actuellement la gestion du stock est traitée grâce à des feuilles de suivi d’un objet
donné.
Les carences du système actuel de gestion des offres de dons sont principalement :
• Manque de réactivité de l’association lorsqu’une personne âgée manifeste un
besoin latent. Souvent contactée par téléphone, l’association n’est pas en mesure
de dire rapidement si elle possède à ce jour l’objet désiré.
• La traçabilité des dons acquis par l’association est perfectible : elle n’est pas
toujours capable de dire quel est le statut d’un don en temps réel.
• A la fin d’une année, l’association ne connaît pas exactement le nombre d’offres
de dons qui lui ont été proposées et combien elle en a réellement acceptées.
Application informatique de gestion des propositions de dons
L’association souhaite donc disposer d’une application informatique qui facilitera sa
gestion des dons. L’application permettra de saisir tous les dons proposés à
l’association ainsi que leurs caractéristiques, puis indiquera les offres effectivement
acquises et les offres refusées. Lors d’une demande de mobilier par une personne âgée,
l’application devra dire rapidement si le type de mobilier souhaité est actuellement en
possession de l’association. L’application devra également gérer précisément la
traçabilité de tous les dons acquis.
Objectifs
L’objectif principal est la gestion des propositions de dons et des stocks de dons
acceptés.
L’application devra notamment :
• permettre de dresser un état des stocks immédiat par dépôt-vente, par entrepôt.
• permettre de visualiser la position d’un article dans l’association (traçabilité)
• permettre la gestion au quotidien des propositions de dons :
◦ Référencement (don accepté ou refusé, date, nom du donateur…)
Les objectifs de second niveau, découlant des objectifs principaux sont :
• permettre d’établir des statistiques relatives aux informations enregistrées
(nombre d’acceptation d’offres par an et par catégorie ; nombre de donateurs par
mois/an; nombre de dons par mois/an …) ;
• permettre l’impression de certaines pages (fiches de dons, fiche référencement…)
Les fonctions principales de l’application seront :
• Un module de gestion des propositions de dons
• Un module de gestion des stocks de l’association
• Un module de recherche rapide dans les stocks
• Un module proposant des statistiques sur les dons, les stockages et les donateurs
Module DON
Un don fait à l’association peut être décrit par les champs suivants :
• Date de réception du don
• Type de matériel
• Référence de l’objet
• Nom du donateur (adhérent de l’association)
• Numéro de téléphone
• Adresse
• Description complémentaire
Ensuite, l’utilisateur (adhérent de l’association) doit pouvoir accepter ou non le don
en fonction de l’état de l’objet. L’objet passe alors dans le statut « accepté » ou «
refusé ».
Si le don est refusé, il est stocké dans les archives pour être en mesure de faire des
statistiques sur les dons refusés.
Si le don est accepté, plusieurs cas de figures sont possibles :
• Le don peut rester chez le donateur jusqu’au déménagement par des transporteurs
(la logistique n’est pas prise en charge dans ce projet) ou bien si c’est
possible stocké dans le bâtiment de l’association. Dans tous les cas, il est
répertorié dans les dons pris en charge par l’association et donc prend le statut
« accepté »
• Le don peut être accepté et stocké dans un entrepôt (garde-meuble) ou dans un
dépôt vente. Dans ce cas, le don prend le statut « stocké »
Dans les cas ci-dessus, il faut mentionner le membre de l’association qui a traité le
dossier et le lieu de stockage prévu (Entrepôt ou Dépôt-Vente ou Association elle-même)
dans l’instance du don.
Les objets donnés ou vendus à un bénéficiaire doivent avoir les informations
suivantes :
• Référence de l’objet donné
• Type
• Description
• Bénéficiaire (information de la personne âgée)
• Un lieu de stockage (instance d’un lieu de stockage)
• Montant (0.0 dans le cas d’un don)
Les bénéficiaires ne sont connus qu’au moment de la vente ou de la donation.
Pour les objets volumineux, il faudra ajouter les hauteurs, largeurs et longueurs.
Les caractéristiques spécifiques pour chaque objet sont précisées en annexe.
Les objets refusés, vendus et donnés sont archivés dans une collection d’objets afin de
pouvoir faire des statistiques sur les nombres d’objets traités dans un temps donné.
Gestion des stocks
L’application doit pouvoir permettre de visualiser les objets stockés par entrepôt et
d’enregistrer les sorties de stocks.
Si un don quitte l’association, c’est qu’il a été vendu ou donné. Ce don est alors
archivé.
Il y 3 destinations possibles pour les dons reçus : Garde-meuble, Dépôt-Vente et
Association.
Pour le garde meuble, on connait la date de dépôt et la personne récupérant le don. Le
don est stocké jusqu’à enlèvement par la personne bénéficiaire à une date d’enlèvement.
Pour le dépôt-vente, il faut connaître la date du dépôt, le montant, la date de la
vente. On suppose que le montant estimé est le montant vendu. Il se peut qu’il y ait
plusieurs dépôt-ventes.
Il faut connaître à tout moment le solde de chaque dépôt-vente sachant qu’à la
création, chaque dépôt-vente reçoit un montant de 1000 euros.
Statistiques
• Nombre de propositions de dons reçues
• Nombre de donateurs, de bénéficiaires
• Nombre de propositions de dons acceptées et ratio reçues/acceptées pour les
objets volumineux
• Volume des ventes ventilé suivant les destinations possibles
• Principales catégories d’articles en stock
• …
Tout ou partie de ces informations sont à écrire dans des fichiers.
Les personnes
Les personnes qui interagissent avec l’association sont soient des personnes
bénéficiaires de l’association, soient les adhérents de l’association, soient des
personnes morales (entrepôts, dépôt-ventes ou l’association elle-même).
Les adhérents ont les informations suivantes : Identifiant, nom, prénom, coordonnées
(adresse), téléphone et une fonction particulière dans l’association. Cette fonction
peut être « trésorier », « président » ou « membre ».
Les donateurs sont membres de l’association.
Les différentes informations peuvent être modifiables hormis l’identifiant.
Les bénéficiaires ont un identifiant, un nom, prénom, coordonnées (adresse), téléphone
et leur date de naissance.
Les personnes morales ont un nom, un identifiant, des coordonnées, un téléphone et un
type d’activité (dépôt-vente, transporteurs …)
Livrable
Le projet peut se faire seul ou en binôme.
Il doit rendre compte du cahier des charges ci-dessus. Toute information non écrite
peut être interprétée comme vous le souhaitez.
Livrer une archive NOM1_NOM2.zip contenant
- rapport au format pdf
- les fichiers csv des adhérents et des bénéficiaires
- les fichiers générés par l’application (ce que l’on veut pouvoir imprimer)
- les éventuels fichiers ressources (sons, images ...)
- les sources Java sous la forme d’une archive association.jar contenant
uniquement les .java
MODE CONSOLE
La solution se présente sous forme d’un menu:
Module Personne
1. Lire les fichiers donnés en pièces jointes pour constituer l’ensemble des
personnes qui interagissent avec l’association
2. Donner les possibilités de recherche sur les bénéficiaires
a. Par téléphone
b. Par nom
3. Modification/Suppression des personnes
4. Recherche sur les personnes autres que bénéficiaires
Module Don
Il prend en charge le circuit du don en tenant compte des lieux de stockage et du
statut du don.
1. Création d’un don
2. Stockage d’un don
3. Transfert du don au bénéficiaire
4. Archive d’un don
Module Recherche
1. Rechercher les dons refusés.
2. Rechercher les dons en traitement (accepté ou stocké).
3. Rechercher les dons vendus.
4. Rechercher les dons donnés
5. Rechercher les dons stockés par entrepôt.
6. Rechercher les dons par dépôt-vente
Suite à une recherche, il convient d’afficher en mode console les résultats obtenus et
également de les sauvegarder dans un fichier.
Module Statistique
En plus du paragraphe Statistiques ci-dessus)
1. Calculer la moyenne de temps entre la date de réception et la date de retrait
des dons dans les zones de stockage
2. Calculer la moyenne de prix des objets dans les dépôts-ventes
3. Calculez la moyenne d’âge des bénéficiaires
Module Autre
Il est le résultat de votre créativité sur la gestion de l’association.
4 suggestions personnelles sont attendues.
Dans tous les cas, il faut utiliser des concepts POO:
• POO avec héritage et polymorphisme
• Classe abstraite
• Interface (utilisation d’interfaces existantes et création d’interface)
• Au moins 3 collections génériques différentes