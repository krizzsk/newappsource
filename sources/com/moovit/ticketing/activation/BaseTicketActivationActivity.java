package com.moovit.ticketing.activation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.activation.C7634b;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.ticket.TicketRef;
import com.moovit.ticketing.validation.TicketValidationActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12879n;
import m80.C12883r;
import m80.C12887v;
import n80.C12915b;
import n80.C12916c;
import n80.C12918d;
import p009a8.C0112l;
import p032c0.C1754d;
import p054d0.C4291k0;
import p148k8.C5524c;
import p244s3.C6442q;
import p451du.C16705b;
import p484ff.C16978i0;
import p543hq.C17474b;
import p664mu.C18459n;
import p688nu.C18631c;
import p926xv.C20626g;
import p926xv.C20628i;
import s90.C13076d;

public abstract class BaseTicketActivationActivity extends MoovitActivity implements C7632a.C7633a, C7634b.C7635a {

    /* renamed from: X */
    public static final /* synthetic */ int f23235X = 0;

    /* renamed from: U */
    public final ArrayList f23236U = new ArrayList();

    /* renamed from: z2 */
    public static <A extends BaseTicketActivationActivity> Intent m17425z2(Context context, Class<A> cls, List<TicketId> list, List<Ticket> list2) {
        Intent intent = new Intent(context, cls);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new TicketRef(list2.get(i), list.get(i)));
        }
        intent.putParcelableArrayListExtra("ticketsIds", C13717b.m34264k(list));
        intent.putParcelableArrayListExtra("ticketsRefs", arrayList);
        return intent;
    }

    /* renamed from: A2 */
    public final ArrayList mo23964A2() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("ticketsIds");
        if (parcelableArrayListExtra != null) {
            return parcelableArrayListExtra;
        }
        StringBuilder k = C13555b.m33972k("Did you use ");
        k.append(getClass().getName());
        k.append(".CreateStartingIntent(...)?");
        throw new ApplicationBugException(k.toString());
    }

    /* renamed from: B2 */
    public abstract void mo23965B2();

    /* renamed from: C2 */
    public final void mo23966C2(boolean z) {
        ArrayList arrayList;
        mo23972H2(true);
        ArrayList A2 = mo23964A2();
        if (z) {
            arrayList = null;
        } else {
            arrayList = getIntent().getParcelableArrayListExtra("ticketsRefs");
        }
        if (!C13717b.m34258e(arrayList)) {
            ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C0112l(20));
            Tasks.whenAllComplete((Collection<? extends Task<?>>) c).continueWith(MoovitExecutors.COMPUTATION, new C4291k0(c, 1)).addOnCompleteListener((Activity) this, new C20628i(this, 6));
            return;
        }
        C12887v b = C12887v.m32668b();
        Task<C13076d> g = b.mo39736g(false);
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        g.onSuccessTask(executorService, new C5524c(A2)).continueWithTask(executorService, new C12879n(b, A2)).addOnCompleteListener((Activity) this, new C16978i0(this, 7));
    }

    /* renamed from: D2 */
    public final void mo23967D2(Ticket ticket) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "activate_ticket_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
        C7755c cVar = ticket.f23487p;
        if (cVar != null) {
            aVar.mo49935c(AnalyticsAttributeKey.COUNT, cVar.f23536d);
            aVar.mo49935c(AnalyticsAttributeKey.ACTIVE_COUNT, C13717b.m34263j(Arrays.asList(new Ticket.Status[]{Ticket.Status.ACTIVE, Ticket.Status.EXPIRED}), new C20626g(cVar, 1)) + 1);
        }
        mo44545v2(aVar.mo49933a());
        TicketId ticketId = ticket.f23473b;
        int i = C7632a.f23237h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("ticket_id", ticketId);
        C7632a aVar2 = new C7632a();
        aVar2.setArguments(bundle);
        aVar2.show(getSupportFragmentManager(), "ticket_activation_confirmation_dialog");
    }

    /* renamed from: E2 */
    public void mo23968E2(Ticket ticket) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "view_ticket_details_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
        mo44545v2(aVar.mo49933a());
        Intent z2 = m17425z2(this, TicketDetailsActivity.class, Collections.singletonList(ticket.f23473b), Collections.singletonList(ticket));
        z2.addFlags(603979776);
        startActivity(z2);
    }

    /* renamed from: F2 */
    public final void mo23969F2(Ticket ticket) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "view_ticket_receipt_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
        mo44545v2(aVar.mo49933a());
        TicketId ticketId = ticket.f23473b;
        Intent y2 = TicketValidationActivity.m17717y2(this, ticketId.f23511b, ticketId.f23512c, ticketId);
        y2.addFlags(603979776);
        startActivity(y2);
        finish();
    }

    /* renamed from: G2 */
    public abstract void mo23970G2(List<Ticket> list);

    /* renamed from: H0 */
    public final void mo23971H0(TicketId ticketId) {
        Object obj;
        ArrayList arrayList = this.f23236U;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                if (ticketId.equals(((Ticket) obj).f23473b)) {
                    break;
                }
            }
        }
        obj = null;
        Ticket ticket = (Ticket) obj;
        if (ticket != null) {
            mo23974y2(new C12918d(ticket));
        }
    }

    /* renamed from: H2 */
    public abstract void mo23972H2(boolean z);

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo23966C2(false);
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        mo23965B2();
        mo23966C2(false);
    }

    /* renamed from: k */
    public final void mo23973k(Ticket ticket) {
        mo23974y2(new C12915b(ticket));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        TicketId ticketId = (TicketId) C13717b.m34256c(mo23964A2());
        if (ticketId != null) {
            m1.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketId.f23511b);
            m1.mo49939g(AnalyticsAttributeKey.ID, ticketId.f23513d);
        }
        return m1;
    }

    /* renamed from: y2 */
    public final void mo23974y2(C12916c cVar) {
        mo23972H2(true);
        C12887v b = C12887v.m32668b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C12883r(b, 1)).onSuccessTask(executorService, new C1754d(6, b, cVar)).addOnCompleteListener((Executor) executorService, new C16705b(b, 7)).addOnSuccessListener(new C6442q(4, b, cVar)).addOnCompleteListener((Activity) this, new C16705b(this, 8)).addOnFailureListener((Activity) this, (OnFailureListener) new C18631c(this, 5)).addOnSuccessListener((Activity) this, new C18459n(3, this, cVar));
    }
}
