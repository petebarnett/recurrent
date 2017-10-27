package uk.petebarnett.recurrent;

import java.time.Period;
import java.util.logging.Logger;

public class App {

    public static void main (String[] args) {

        LifeCycle lifeCycle = LifeCycle.builder()
                .withPhase()
                    .named("Trial")
                    .lasting(Period.ofDays(5))
                    .end()
                .withPhase()
                    .named("Main")
                    .lasting(Period.ofYears(1))
                    .end()
                .build();

        Logger logger = Logger.getGlobal();

        logger.info(lifeCycle.toString());
    }
}
