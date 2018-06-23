package org.study.patterns.creational.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.entities.developers.Developer;
import org.study.patterns.Pattern;
import org.study.utils.Patterns;
import org.study.utils.ProgrammingLanguage;
import org.study.utils.Utils;

import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.ResourceBundle;
import java.util.TimeZone;

import static org.study.utils.ProgrammingLanguage.*;

public class FactoryMethodPattern implements Pattern {

    private final static Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());

    public void execute() {
        DeveloperFactory developerFactory = createDeveloperFactory(JAVA);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("us");
//        NumberFormat nf = NumberFormat.getCurrencyInstance();
//        Charset charset = Charset.forName("utf8");
        EnumSet<Patterns> es = EnumSet.allOf(Patterns.class);
        es.stream().forEach(p -> LOGGER.info(p.name()));


    }

    public static DeveloperFactory createDeveloperFactory (ProgrammingLanguage pl) {
        switch(pl) {
            case JAVA: return new JavaDeveloperFactory();
            case CPP: return new CppDeveloperFactory();
            default: throw new IllegalArgumentException("Prgramming language " +
                    pl.toString() + " is not found.");
        }
    }
}
