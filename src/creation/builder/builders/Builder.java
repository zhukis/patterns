package creation.builder.builders;

import creation.builder.cars.Type;
import creation.builder.components.Engine;
import creation.builder.components.GPSNavigator;
import creation.builder.components.Transmission;
import creation.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
