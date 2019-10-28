package zhonghai.xue.design.composite;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.composite.ConcreteCompany;
import zhonghai.xue.design.structure.composite.FinanceDepartment;
import zhonghai.xue.design.structure.composite.HRDepartment;

public class CompositeTest  {

    @Test
    public void test2(){
        //一个总公司
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        //三个子公司
        ConcreteCompany com1 = new ConcreteCompany("广州分公司");
        com1.add(new HRDepartment("广州分公司人力资源部"));
        com1.add(new FinanceDepartment("广州分公司财务部"));
        root.add(com1);

        ConcreteCompany com2 = new ConcreteCompany("杭州分公司");
        com2.add(new HRDepartment("杭州分公司人力资源部"));
        com2.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(com2);

        ConcreteCompany com3 = new ConcreteCompany("深圳分公司");
        com3.add(new HRDepartment("深圳分公司人力资源部"));
        com3.add(new FinanceDepartment("深圳分公司财务部"));
        root.add(com3);

        System.out.println("-------公司结构图--------");
        root.display(1);
        System.out.println("----------各部门职责----------");
        root.lineofDuty();
    }
}
