package trains;

public interface TrainBuilderInterface {

    public TrainBuilderInterface reset();

    public TrainBuilderInterface addCargoWagon();

    public TrainBuilderInterface addPassengerWagon();

    public TrainBuilderInterface addEngine(int power);

    public Train build();
}
