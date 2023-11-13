package _01_de_creacion._02_builder.ejemplo01.src.builders;

import _01_de_creacion._02_builder.ejemplo01.src.cars.CarType;
import _01_de_creacion._02_builder.ejemplo01.src.components.Engine;
import _01_de_creacion._02_builder.ejemplo01.src.components.GPSNavigator;
import _01_de_creacion._02_builder.ejemplo01.src.components.Transmission;
import _01_de_creacion._02_builder.ejemplo01.src.components.TripComputer;

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