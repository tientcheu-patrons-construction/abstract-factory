public class FabriqueElectrique extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Moto construireMoto() {
        return new MotoElectrique();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterElectrique();
    }
    
}
