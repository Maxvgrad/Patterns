package org.study.entities.notifiers;

import org.study.utils.Levels;

public class TelegramNotifier extends Notifier {
    public TelegramNotifier() {
        super(Levels.MIDDLE);
    }

    @Override
    protected void write(String msg) {
        System.out.println("Writing telegram msg: " + msg);
    }
}
