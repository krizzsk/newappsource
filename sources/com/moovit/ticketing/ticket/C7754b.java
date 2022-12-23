package com.moovit.ticketing.ticket;

import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import java.util.List;
import m80.C12887v;
import p115i0.C5227c;

/* renamed from: com.moovit.ticketing.ticket.b */
public class C7754b extends C7758e {

    /* renamed from: v */
    public static final /* synthetic */ int f23531v = 0;

    /* renamed from: m2 */
    public final Task<List<Ticket>> mo24249m2(boolean z) {
        return C12887v.m32668b().mo39733a(z).onSuccessTask(MoovitExecutors.COMPUTATION, new C5227c(20));
    }
}
