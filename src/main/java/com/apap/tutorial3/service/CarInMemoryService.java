package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.apap.tutorial3.model.CarModel;

import org.springframework.stereotype.Service;

@Service
public class CarInMemoryService implements CarService{

	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}

	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
		
	}

	@Override
	public List<CarModel> getCarList() {
		return archiveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		for (int idx=0;idx<archiveCar.size();idx++) {
			CarModel temp = archiveCar.get(idx);
			if (temp.getId().equals(id)) {
				return temp;
			}
		}
		return null;
	}
	
	@Override
	public void updateCarDetail(String id, int amount) {
		CarModel updatedCar = getCarDetail(id);
		updatedCar.setAmount(amount);
	}
	
	@Override
	public void deleteCarDetail(String id) {
		archiveCar.removeIf(car -> car.getId().equals(id));
	}
	
}
