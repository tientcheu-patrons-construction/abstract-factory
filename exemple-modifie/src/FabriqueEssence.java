public class FabriqueEssence extends AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Moto construireMoto() {
        return new MotoEssence();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterEssence();
    }

}
