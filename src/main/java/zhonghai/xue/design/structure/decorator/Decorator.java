package zhonghai.xue.design.structure.decorator;

public class Decorator implements People {

    private People people;

    public  Decorator(People people) {
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}
