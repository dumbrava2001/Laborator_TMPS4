package solid.dependency_ip.before;

import solid.dependency_ip.Product;

public class BXmlConvertor {

  public String toXml(Product product) {
    return "<product>" + "<name>" + product.name() + "<name/>" + "<brand>" + product.brand()
        + "<brand/>" + "<price>" + product.price() + "<price/>" + "<product>";
  }
}
