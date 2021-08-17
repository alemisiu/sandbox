class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product prod, double pr, boolean s) {
        product =prod;
        price =pr;
        special =s;
    }
    void printInfo() {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }
}