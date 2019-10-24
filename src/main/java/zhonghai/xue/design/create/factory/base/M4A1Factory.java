package zhonghai.xue.design.create.factory.base;

public class M4A1Factory extends AbstractFactory {
    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    @Override
    public Bullet produceBullet() {
        return new M4A1Bullet();
    }
}
