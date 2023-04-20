package solid.dependency_ip.before;

public class BMainDIP {

  public static void main(String[] args) {
    BProductService productService = new BProductService();

    System.out.println(productService.getProductByNameToJson("G14"));
    System.out.println(productService.getProductByNameToXml("G14"));
  }
}
