public abstract class Game {

    private String id;
    private String name;
    private String category;
    private double quantity;
    private double price;
    private double dificulty;

    public Game(String id, String name, String category, double quantity, double price, double dificulty) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.dificulty = dificulty;
    }

    public abstract String getCategory();

    public double priceWithIVA(){
        return price * 1.1;
    }

    public void updateQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDificulty() {
        return dificulty;
    }

    public void setDificulty(double dificulty) {
        this.dificulty = dificulty;
    }
}