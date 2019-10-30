package zhonghai.xue.design.behavior.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(ChatUser user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
