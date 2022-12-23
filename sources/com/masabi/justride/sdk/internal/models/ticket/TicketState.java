package com.masabi.justride.sdk.internal.models.ticket;

public enum TicketState {
    BEFORE_VP("BEFORE_VP"),
    LIVE("LIVE"),
    LIVE_UNUSABLE("LIVE"),
    ACTIVE("ACTIVE"),
    USED("USED"),
    EXPIRED("EXPIRED"),
    CANCELLED("CANCELLED"),
    REFUNDED("REFUNDED"),
    UNKNOWN("UNKNOWN");
    
    private final String brokerName;

    /* renamed from: com.masabi.justride.sdk.internal.models.ticket.TicketState$a */
    public static /* synthetic */ class C14653a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37116a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.masabi.justride.sdk.internal.models.ticket.TicketState[] r0 = com.masabi.justride.sdk.internal.models.ticket.TicketState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37116a = r0
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.USED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37116a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37116a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37116a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.internal.models.ticket.TicketState.C14653a.<clinit>():void");
        }
    }

    private TicketState(String str) {
        this.brokerName = str;
    }

    public static TicketState parse(String str) {
        try {
            return (TicketState) Enum.valueOf(TicketState.class, str);
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    public String getBrokerName() {
        return this.brokerName;
    }

    public boolean isActive() {
        return this == ACTIVE;
    }

    public boolean isBeforeValidityPeriod() {
        return this == BEFORE_VP;
    }

    public boolean isFinalized() {
        int i = C14653a.f37116a[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public boolean isLive() {
        return this == LIVE;
    }

    public boolean isLiveUnusable() {
        return this == LIVE_UNUSABLE;
    }
}
