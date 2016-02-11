package es.opileak.hashcode.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import es.opileak.hashcode.model.Candidate;
import es.opileak.hashcode.model.Product;
import es.opileak.hashcode.model.Warehouse;

public class WarehouseService {
	Map<Integer, int[]> warehouseMap;

	public WarehouseService(List<Warehouse> warehouseList) {
		super();
		warehouseMap = new HashMap<>();
		int id = 0;
		for (Warehouse warehouse : warehouseList) {
			if (!warehouseMap.containsKey(id)) {
				warehouseMap.put(id, new int[warehouse.getProductsQuantity().size()]);
			}
			for (Entry<Product, Integer> entry : warehouse.getProductsQuantity().entrySet()) {
				warehouseMap.get(id)[entry.getKey().getId()] = entry.getValue();
			}
		}

	}

	public void update(Candidate operationCandidate) {

	}

}
