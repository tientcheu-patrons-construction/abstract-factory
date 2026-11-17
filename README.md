# Patron Abstract Factory

Devoir n°1 – Patrons de construction (INF461)
TIENTCHEU TCHOKOUATOU Emmanuel – 20Q2998

## Principe

La classe abstraite `AbstractFactory` déclare une méthode de création pour
chaque type de produit (`construireAutomobile()`, `construireScooter()`, …).
Chaque fabrique concrète (`FabriqueEssence`, `FabriqueElectrique`) crée une
famille complète de produits compatibles entre eux (tous à essence ou tous
électriques). Le client manipule seulement `AbstractFactory` et les classes
abstraites des produits, sans connaître les classes concrètes créées.

## Contenu du dépôt

| Dossier | Description |
|---|---|
| `exemple-cours/` | Exemple vu en cours : `Automobile` et `Scooter`, en version essence et électrique |
| `exemple-modifie/` | Exemple modifié : ajout d'un nouveau produit `Moto` |

## Modification apportée

- Ajout de la classe abstraite `Moto`
- Ajout des classes `MotoEssence` et `MotoElectrique` (héritent de `Moto`)
- Ajout de la méthode `construireMoto()` dans `AbstractFactory`
- Implémentation de `construireMoto()` dans `FabriqueEssence` et `FabriqueElectrique`
- `App` crée et utilise aussi les motos

Contrairement à Factory Method, ajouter un nouveau type de produit oblige à
modifier `AbstractFactory` et toutes les fabriques concrètes : c'est la
principale limite de ce patron. En revanche, ajouter une nouvelle famille
(par exemple `FabriqueHybride`) ne demanderait que de nouvelles classes.
