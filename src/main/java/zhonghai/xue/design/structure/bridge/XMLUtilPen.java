package zhonghai.xue.design.structure.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilPen {


    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("E:\\github\\design\\src\\main\\resources\\configPen.xml"));
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            if (args.equals("color")) {
                //获取包含类名的文本节点
                classNode = nl.item(0).getFirstChild();

            } else if (args.equals("pen")) {
                //获取包含类名的文本节点
                classNode = nl.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
