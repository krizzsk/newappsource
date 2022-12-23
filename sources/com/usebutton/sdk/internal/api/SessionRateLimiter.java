package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.internal.functional.Getter;

class SessionRateLimiter {
    private static final int MAX_RESET_MILLI_SECONDS = 900000;
    public static final String RATE_LIMIT_RESET_HEADER = "X-Button-Limit-Reset-Seconds";
    private Getter<Long> clock;
    private long sessionRateLimitEnd;

    public SessionRateLimiter() {
        this.clock = new Getter<Long>() {
            public Long get() {
                return Long.valueOf(System.currentTimeMillis());
            }
        };
        this.sessionRateLimitEnd = 0;
    }

    public boolean isRateLimited() {
        return this.clock.get().longValue() <= this.sessionRateLimitEnd;
    }

    public void parseException(ButtonHttpStatusException buttonHttpStatusException) {
        String limitResetSeconds;
        if (buttonHttpStatusException.wasRateLimited() && (limitResetSeconds = buttonHttpStatusException.getLimitResetSeconds()) != null && !limitResetSeconds.isEmpty()) {
            this.sessionRateLimitEnd = this.clock.get().longValue() + ((long) Math.min(Integer.parseInt(limitResetSeconds) * 1000, MAX_RESET_MILLI_SECONDS));
        }
    }

    public SessionRateLimiter(Getter<Long> getter) {
        new Getter<Long>() {
            public Long get() {
                return Long.valueOf(System.currentTimeMillis());
            }
        };
        this.sessionRateLimitEnd = 0;
        this.clock = getter;
    }
}
