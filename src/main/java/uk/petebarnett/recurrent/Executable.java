package uk.petebarnett.recurrent;

import java.time.LocalDate;

public class Executable {

    private final LocalDate startFrom;
    private LocalDate lastEvent;

    public Executable(LocalDate startFrom) {
        this.startFrom = startFrom;
    }
}
