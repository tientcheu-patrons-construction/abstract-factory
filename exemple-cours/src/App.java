public class App {
    public static void main(String[] args) throws Exception {
      
        AbstractFactory factoryEssence = new FabriqueEssence();
        AbstractFactory factoryElectrique = new FabriqueElectrique();
        
        Automobile automobileEssence = null;
        Automobile automobileElectrique = null;
    
        
        Scooter scooterEssence = null;
        Scooter scooterElectrique = null;
        
        // Création de la fabrique pour les véhicules à essence
        automobileEssence = factoryEssence.construireAutomobile();
        scooterEssence = factoryEssence.construireScooter();
        
        // Appel des méthodes spécifiques aux véhicules à essence
        System.out.println("Véhicules à essence :");
        automobileEssence.methodeAutomobile();
        scooterEssence.methodeScooter();

        // Création de la fabrique pour les véhicules électriques
        automobileElectrique = factoryElectrique.construireAutomobile();
        scooterElectrique = factoryElectrique.construireScooter();
        
        // Appel des méthodes spécifiques aux véhicules électriques
        System.out.println("\nVéhicules électriques :");
        automobileElectrique.methodeAutomobile();   
        scooterElectrique.methodeScooter();
    }
}
