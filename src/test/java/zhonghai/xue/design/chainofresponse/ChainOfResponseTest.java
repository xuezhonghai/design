package zhonghai.xue.design.chainofresponse;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.chainofresponse.DeptManager;
import zhonghai.xue.design.behavior.chainofresponse.GeneralManager;
import zhonghai.xue.design.behavior.chainofresponse.ProjectManager;

public class ChainOfResponseTest {
    
    @Test
    public void test1(){
        ProjectManager projectManager = new ProjectManager();
        DeptManager deptManager = new DeptManager();
        GeneralManager generalManager = new GeneralManager();

        projectManager.setSuccessor(deptManager);
        deptManager.setSuccessor(generalManager);

        String test1 = projectManager.handleFeeRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = projectManager.handleFeeRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = projectManager.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = projectManager.handleFeeRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = projectManager.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = projectManager.handleFeeRequest("李四", 1500);
        System.out.println("test6 = " + test6);


    }
}
