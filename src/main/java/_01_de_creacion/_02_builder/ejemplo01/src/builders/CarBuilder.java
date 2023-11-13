package _01_de_creacion._02_builder.ejemplo01.src.builders;

import _01_de_creacion._02_builder.ejemplo01.src.cars.Car;
import _01_de_creacion._02_builder.ejemplo01.src.cars.CarType;
import _01_de_creacion._02_builder.ejemplo01.src.components.Engine;
import _01_de_creacion._02_builder.ejemplo01.src.components.GPSNavigator;
import _01_de_creacion._02_builder.ejemplo01.src.components.Transmission;
import _01_de_creacion._02_builder.ejemplo01.src.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}