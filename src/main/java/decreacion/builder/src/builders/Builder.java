package decreacion.builder.src.builders;

import decreacion.builder.src.cars.CarType;
import decreacion.builder.src.components.Engine;
import decreacion.builder.src.components.GPSNavigator;
import decreacion.builder.src.components.Transmission;
import decreacion.builder.src.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}