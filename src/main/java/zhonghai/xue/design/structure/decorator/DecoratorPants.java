package zhonghai.xue.design.structure.decorator;

public class DecoratorPants extends Decorator {

    public DecoratorPants(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个短裤");
    }
}
