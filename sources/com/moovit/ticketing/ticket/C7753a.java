package com.moovit.ticketing.ticket;

import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import java.util.List;
import m80.C12887v;
import p066e0.C4454r0;

/* renamed from: com.moovit.ticketing.ticket.a */
public class C7753a extends C7758e {

    /* renamed from: v */
    public static final /* synthetic */ int f23530v = 0;

    /* renamed from: m2 */
    public final Task<List<Ticket>> mo24249m2(boolean z) {
        return C12887v.m32668b().mo39736g(z).onSuccessTask(MoovitExecutors.COMPUTATION, new C4454r0(15));
    }
}
