public class StrategyCategory extends Category{

    public StrategyCategory() {
        super("Strategy");
    }

    @Override
    public void showCategories() {
        System.out.println("The strategy game, requires planning, decision making and sometimes luck.");
    }
}