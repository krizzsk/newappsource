package com.moovit.aws.kinesis;

import ce0.C21100e;
import com.moovit.env.ServerEnvironment;

public enum KinesisStream {
    ANALYTICS("AnalyticsStream"),
    MESSAGE("ServerStream"),
    SENSORS("CrowdData");
    
    private final String name;
    private volatile String streamName;

    /* renamed from: com.moovit.aws.kinesis.KinesisStream$a */
    public static /* synthetic */ class C15674a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40781a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.env.ServerEnvironment[] r0 = com.moovit.env.ServerEnvironment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40781a = r0
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.PROD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40781a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.STG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40781a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.QA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40781a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.DEV     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.aws.kinesis.KinesisStream.C15674a.<clinit>():void");
        }
    }

    private KinesisStream(String str) {
        C21100e.m49373x(str, "name");
        this.name = str;
    }

    private static String adapt(ServerEnvironment serverEnvironment, String str) {
        int i = C15674a.f40781a[serverEnvironment.ordinal()];
        if (i == 1 || i == 2) {
            return str;
        }
        if (i == 3) {
            return C25541a.m63881k("QA-", str);
        }
        if (i == 4) {
            return C25541a.m63881k("DEV-", str);
        }
        throw new IllegalStateException("Unknown server environment: " + serverEnvironment);
    }

    public static void setKinesisEnvironment(ServerEnvironment serverEnvironment) {
        for (KinesisStream kinesisStream : values()) {
            synchronized (kinesisStream.name) {
                kinesisStream.streamName = adapt(serverEnvironment, kinesisStream.name);
            }
        }
    }

    public String getName() {
        if (this.streamName == null) {
            synchronized (this.name) {
                if (this.streamName == null) {
                    this.streamName = adapt(ServerEnvironment.PROD, this.name);
                }
            }
        }
        return this.streamName;
    }
}
