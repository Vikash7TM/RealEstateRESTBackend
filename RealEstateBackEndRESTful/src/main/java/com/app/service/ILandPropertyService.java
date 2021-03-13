package com.app.service;

import java.util.List;

import com.app.pojos.Buyer;
import com.app.pojos.LandProperty;

public interface ILandPropertyService {
	
	// add new landProperty
	LandProperty saveNewProperty(LandProperty l);
	
	
	//fetch property by ownerId
	List<LandProperty> fetchPropertyByOId(int ownerId);
	
	//fetch by cityName
	List<LandProperty> fetchPropertyByCity(String city);
	
	//fetch prop by id
	LandProperty fetchById(int propId);
	
	//delete prop by id
	LandProperty deletePropertyByEntity(LandProperty l);
	
	//update prop by id
	LandProperty updateProperty(int propId , LandProperty l);
	
	// fetch favBuyers of prop
	List<Buyer> fetchAllFavBuyers(int propId);
	
	//fetch prop by priceRange
	List<LandProperty> fetchPropertyByPriceBetween(double minPrice, double maxPrice);
	
}
