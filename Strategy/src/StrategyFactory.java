public class StrategyFactory {
    public IStrategy createStrategy(String strategy){
        switch(strategy.toLowerCase()){
            case "add":
                return new AddStrategy();
            case "sub":
                return new SubStrategy();
            default:
                throw new IllegalArgumentException("Unknown action");
        }
    }
}
