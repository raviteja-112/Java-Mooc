
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ravi
 */
public class MessagingService {

    private ArrayList<Message> inbox;

    public MessagingService() {
        this.inbox = new ArrayList<>();
    }

    public void add(Message message) {

        if (message.getContent().length() <= 280) {
            this.inbox.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.inbox;
    }

}
