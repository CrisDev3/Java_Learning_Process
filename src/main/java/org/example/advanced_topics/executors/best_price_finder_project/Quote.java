package org.example.advanced_topics.executors.best_price_finder_project;

public class Quote {
    private final String websiteName;
    private final double price;

    public Quote(String websiteName, double price) {
        this.websiteName = websiteName;
        this.price = price;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "websiteName='" + websiteName + '\'' +
                ", price=" + price +
                '}';
    }
}
