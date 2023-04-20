package solid.dependency_ip.before;

import solid.dependency_ip.Product;

public class BJsonConvertor {

  public String toJson(Product product) {
    return "{" + "name:" + product.name() + ",brand:" + product.brand() + ",price:"
        + product.price() + "}";
  }

}
