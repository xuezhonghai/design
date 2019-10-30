package zhonghai.xue.design.behavior.mediator;

public class ChatUser {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatUser(String name) {
        this.name = name;
    }

    public void sendMsg(String message){
        ChatRoom.showMessage(this, message);
    }
}
