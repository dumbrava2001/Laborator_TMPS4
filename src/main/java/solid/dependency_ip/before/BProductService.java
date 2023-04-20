package solid.dependency_ip.before;

import java.util.ArrayList;
import java.util.List;
import solid.dependency_ip.Product;

public class BProductService {

  private final BJsonConvertor jsonConvertor = new BJsonConvertor();

  private final BXmlConvertor xmlConvertor = new BXmlConvertor();

  private final List<Product> productList = new ArrayList<>(List.of(
      new Product("G14", "Asus", 1300),
      new Product("Macbook Pro 14", "Apple", 2000),
      new Product("XPS 15", "Dell", 2100)
  ));

  public String getProductByNameToJson(String name) {
    Product product = productList.stream()
        .filter(pr -> pr.name().trim().toLowerCase().equals(name.trim().toLowerCase()))
        .findFirst()
        .orElseThrow();

    return jsonConvertor.toJson(product);
  }

  public String getProductByNameToXml(String name) {
    Product product = productList.stream()
        .filter(pr -> pr.name().trim().equalsIgnoreCase(name.trim()))
        .findFirst()
        .orElseThrow();
    return xmlConvertor.toXml(product);
  }
}
