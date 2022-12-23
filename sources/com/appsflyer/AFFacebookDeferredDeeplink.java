package com.appsflyer;

public final class AFFacebookDeferredDeeplink {
    private final boolean $$a;
    public final long AFDateFormat;
    public final String valueOf;

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(String str, String str2, String str3);
    }

    public AFFacebookDeferredDeeplink() {
    }

    public AFFacebookDeferredDeeplink(String str, long j, boolean z) {
        this.valueOf = str;
        this.AFDateFormat = j;
        this.$$a = z;
    }

    public final boolean values() {
        return this.$$a;
    }
}
