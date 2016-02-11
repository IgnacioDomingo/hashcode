package es.opileak.hashcode.util;

import java.awt.geom.Point2D;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.opileak.hashcode.model.Order;
import es.opileak.hashcode.model.ProblemState;
import es.opileak.hashcode.model.Product;
import es.opileak.hashcode.model.Warehouse;

public class DataReader {
	public static ProblemState readFile(String path) throws IOException {
		List<String> lines = FileUtils.readFileByLines(Paths.get(path));

		String[] line1 = lines.get(0).split(" ");
		int droneNumber = Integer.parseInt(line1[2]);
		int turnNumber = Integer.parseInt(line1[3]);
		int maxPayload = Integer.parseInt(line1[4]);

		//Product types
		String[] line3 = lines.get(2).split(" ");
		List<Product> productList = new ArrayList<>();
		int idProductCounter = 0;
		for (String weight : line3) {
			productList.add(new Product(idProductCounter, Integer.parseInt(weight)));
			idProductCounter++;
		}

		//Warehouses
		int warehouseNumber = Integer.parseInt(lines.get(3));
		int lineIndex = 4;
		List<Warehouse> warehouseList = new ArrayList<>();
		for (int i = 0; i < warehouseNumber; i++) {
			String[] position = lines.get(lineIndex).split(" ");
			Point2D pos = new Point2D.Double(Integer.parseInt(position[0]), Integer.parseInt(position[1]));

			String[] products = lines.get(lineIndex + 1).split(" ");
			Map<Product, Integer> productsQuantity = new HashMap<>();
			for (int j = 0; j < products.length; j++) {
				productsQuantity.put(productList.get(j), Integer.parseInt(products[j]));
			}
			warehouseList.add(new Warehouse(pos, productsQuantity));
			lineIndex += 2;
		}

		//Orders
		int numberOfOrders = Integer.parseInt(lines.get(lineIndex));
		lineIndex++;
		List<Order> orderList = new ArrayList<>();
		for (int i = 0; i < numberOfOrders; i++) {
			String[] position = lines.get(lineIndex).split(" ");
			Point2D pos = new Point2D.Double(Integer.parseInt(position[0]), Integer.parseInt(position[1]));

			String[] products = lines.get(lineIndex + 2).split(" ");
			Map<Product, Integer> productsQuantity = new HashMap<>();
			for (int j = 0; j < products.length; j++) {
				Product product = productList.get(Integer.parseInt(products[j]));
				if (!productsQuantity.containsKey(product)) {
					productsQuantity.put(product, 0);
				}
				productsQuantity.put(product, productsQuantity.get(product) + 1);
			}
			orderList.add(new Order(pos, productsQuantity));
			lineIndex += 3;
		}
		return null;
	}
}
