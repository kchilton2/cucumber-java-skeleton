package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public void moveTo(Integer distance) {

    }

    public void shout(String message) {

    }

    public List<String> getMessagesHeard() {
        List<String> messages = new ArrayList<>();
        messages.add("free bagles at Sean's");
        return messages;
    }
}
