package org.study.entities.events;

public class Event {
    private String msg;
    private int level;

    public Event(String msg, int level) {
        this.msg = msg;
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public int getLevel() {
        return level;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
