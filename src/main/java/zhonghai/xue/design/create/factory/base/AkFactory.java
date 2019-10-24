package zhonghai.xue.design.create.factory.base;

public class AkFactory extends AbstractFactory {
    @Override
    public Gun produceGun() {
        return new Ak47();
    }

    @Override
    public Bullet produceBullet() {
        return new Ak47Bullet();
    }
}
