package uk.petebarnett.recurrent;

import java.time.Period;
import java.util.function.Consumer;

public class Phase {

    private String name;
    private Period period;

    private Phase() {}

    public String getName() {
        return name;
    }

    public Period getPeriod() {
        return period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Phase managedInstance = new Phase();
        private LifeCycle.Builder parentBuilder;
        private Consumer<Phase> callback;

        public Builder() {}

        public Builder(LifeCycle.Builder b, Consumer<Phase> f) {
            parentBuilder = b;
            callback = f;
        }

        public Builder named(String name) {
            managedInstance.name = name;
            return this;
        }

        public Builder lasting(Period period) {
            managedInstance.period = period;
            return this;
        }

        public Phase build() {
            return managedInstance;
        }

        public LifeCycle.Builder end() {
            callback.accept(managedInstance);
            return parentBuilder;
        }
    }


    public String toString() {
        return this.name + ": " + this.period.toString();
    }
}
