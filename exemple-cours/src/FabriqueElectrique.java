public class FabriqueElectrique extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }


    @Override
    public Scooter construireScooter() {
        return new ScooterElectrique();
    }
    
}
