package uk.petebarnett.recurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LifeCycle {

    private List<Phase> phases = new ArrayList<>();

    /**
     * Enforce use of builder.
     */
    private LifeCycle() {}

    @Override
    public String toString() {
        return Arrays.toString(phases.toArray());
    }

    /**
     * Static factory method for builder.
     * @return Builder
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private LifeCycle managedInstance = new LifeCycle();

        /**
         *
         * @return A builder for lifecycle phase.
         */
        public Phase.Builder withPhase() {
            return new Phase.Builder(this, managedInstance.phases::add);
        }

        public LifeCycle build() {
            return managedInstance;
        }
    }
}
