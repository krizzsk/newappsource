package p494fp;

import com.masabi.justride.sdk.internal.models.ticket.TicketState;

/* renamed from: fp.f */
public final /* synthetic */ class C17055f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f44217a;

    static {
        int[] iArr = new int[TicketState.values().length];
        f44217a = iArr;
        iArr[TicketState.REFUNDED.ordinal()] = 1;
        iArr[TicketState.EXPIRED.ordinal()] = 2;
        iArr[TicketState.CANCELLED.ordinal()] = 3;
        iArr[TicketState.USED.ordinal()] = 4;
    }
}
