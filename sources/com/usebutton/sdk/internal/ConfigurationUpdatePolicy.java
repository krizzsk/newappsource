package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.util.TimeProvider;
import java.util.concurrent.TimeUnit;

public class ConfigurationUpdatePolicy {
    private boolean isLaunchCheck = true;
    private final long launchIntervalSeconds;
    private final State state;
    private final TimeProvider timeProvider;
    private final long updateIntervalSeconds;

    public static class State {
        /* access modifiers changed from: private */
        public long timeOfLastCheckInMs;

        public State(long j) {
            this.timeOfLastCheckInMs = j;
        }

        public long getTimeOfLastCheckInMs() {
            return this.timeOfLastCheckInMs;
        }

        public void setState(TimeProvider timeProvider) {
            this.timeOfLastCheckInMs = timeProvider.getTimeInMs();
        }
    }

    public ConfigurationUpdatePolicy(TimeProvider timeProvider2, int i, int i2, State state2) {
        this.timeProvider = timeProvider2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.launchIntervalSeconds = timeUnit.toMillis((long) i);
        this.updateIntervalSeconds = timeUnit.toMillis((long) i2);
        this.state = state2;
    }

    public State getState() {
        return this.state;
    }

    public void setState() {
        this.state.setState(this.timeProvider);
    }

    public boolean shouldUpdate() {
        if (this.isLaunchCheck) {
            this.isLaunchCheck = false;
            if (this.state.timeOfLastCheckInMs + this.launchIntervalSeconds < this.timeProvider.getTimeInMs()) {
                return true;
            }
            return false;
        } else if (this.state.timeOfLastCheckInMs + this.updateIntervalSeconds < this.timeProvider.getTimeInMs()) {
            return true;
        } else {
            return false;
        }
    }
}
