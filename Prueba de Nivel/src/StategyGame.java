public class StategyGame extends Game{

    private StrategyCategory category;

    public StategyGame(String id, String name, String category, double quantity, double price, double dificulty) {
        super(id, name, category, quantity, price, dificulty);
        this.category = new StrategyCategory();
    }

    @Override
    public String getCategory() {
        return category.getClass().getSimpleName();
    }

}