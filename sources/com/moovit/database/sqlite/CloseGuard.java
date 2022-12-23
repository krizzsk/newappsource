package com.moovit.database.sqlite;

import p358af.C13437d;

public final class CloseGuard {
    private static volatile boolean ENABLED = true;
    private static final CloseGuard NOOP = new CloseGuard();
    private static volatile Reporter REPORTER = new DefaultReporter();
    private Throwable allocationSite;

    public static final class DefaultReporter implements Reporter {
        private DefaultReporter() {
        }

        public void report(String str, Throwable th) {
        }
    }

    public interface Reporter {
        void report(String str, Throwable th);
    }

    private CloseGuard() {
    }

    public static CloseGuard get() {
        if (!ENABLED) {
            return NOOP;
        }
        return new CloseGuard();
    }

    public void close() {
        this.allocationSite = null;
    }

    public void open(String str) {
        if (str == null) {
            throw new NullPointerException("closer == null");
        } else if (this != NOOP && ENABLED) {
            this.allocationSite = new Throwable(C13437d.m33706k("Explicit termination method '", str, "' not called"));
        }
    }

    public void warnIfOpen() {
        if (this.allocationSite != null && ENABLED) {
            REPORTER.report("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.allocationSite);
        }
    }
}
