package uk.petebarnett.recurrent;

import java.time.chrono.ChronoPeriod;

public class RecurringPeriod {

    private final ChronoPeriod period;
    private final int recurrences;

    public RecurringPeriod(ChronoPeriod period, int recurrences) {
        this.period = period;
        this.recurrences = recurrences;
    }
}
