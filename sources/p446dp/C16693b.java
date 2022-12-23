package p446dp;

import com.masabi.justride.sdk.internal.models.ticket.TicketState;

/* renamed from: dp.b */
public final /* synthetic */ class C16693b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f43480a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f43481b;

    static {
        int[] iArr = new int[TicketState.values().length];
        f43480a = iArr;
        TicketState ticketState = TicketState.EXPIRED;
        iArr[ticketState.ordinal()] = 1;
        TicketState ticketState2 = TicketState.USED;
        iArr[ticketState2.ordinal()] = 2;
        TicketState ticketState3 = TicketState.CANCELLED;
        iArr[ticketState3.ordinal()] = 3;
        TicketState ticketState4 = TicketState.REFUNDED;
        iArr[ticketState4.ordinal()] = 4;
        int[] iArr2 = new int[TicketState.values().length];
        f43481b = iArr2;
        iArr2[ticketState.ordinal()] = 1;
        iArr2[ticketState2.ordinal()] = 2;
        iArr2[ticketState3.ordinal()] = 3;
        iArr2[ticketState4.ordinal()] = 4;
    }
}
