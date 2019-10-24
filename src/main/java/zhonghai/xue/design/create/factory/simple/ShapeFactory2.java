package zhonghai.xue.design.create.factory.simple;

public class ShapeFactory2 {

    public static Object getShape(Class<? extends Shape> clazz){
        Object object = null;

        try {
           object = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return object;
    }
}
