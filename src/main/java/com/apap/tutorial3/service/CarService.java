package com.apap.tutorial3.service;

import java.util.List;

import com.apap.tutorial3.model.CarModel;

public interface CarService {

	void addCar(CarModel car);
	List<CarModel> getCarList();
	CarModel getCarDetail(String id);
	void updateCarDetail(String id,int amount);
	void deleteCarDetail(String id);
}
