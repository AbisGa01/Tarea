public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck model = new ModelDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        
    }
}
