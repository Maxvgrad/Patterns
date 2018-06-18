package org.study.patterns.behavioral.chainofresp;

import org.study.entities.events.Event;
import org.study.entities.notifiers.EmailNotifier;
import org.study.entities.notifiers.MonitorNotifer;
import org.study.entities.notifiers.Notifier;
import org.study.entities.notifiers.TelegramNotifier;
import org.study.patterns.Pattern;
import org.study.utils.Levels;

public class ChainOfRespPattern implements Pattern {
    @Override
    public void execute() {
        Notifier notifier = new MonitorNotifer()
                                    .setNextNotifier(new EmailNotifier())
                                    .setNextNotifier(new TelegramNotifier());
        notifier.notifyManager(new Event("Raise me salary dude", Levels.WEEK));
    }
}
