package com.moovit.ticketing.ticket;

import aa0.C7540l;
import android.content.Context;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p011aa.C0141e;
import p583jk.C17884p;
import p638lr.C18267n;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;
import q80.C13029r;
import q80.C13030s;

public abstract class TicketRefreshHelper extends C7540l {

    /* renamed from: h */
    public static final EnumSet f23518h = EnumSet.of(Ticket.Status.ISSUING_IN_PROGRESS);

    /* renamed from: d */
    public final C7752a f23519d = new C7752a();

    /* renamed from: e */
    public final Context f23520e;

    /* renamed from: f */
    public final CollectionHashMap.HashSetHashMap<ServerId, Ticket> f23521f = new CollectionHashMap.HashSetHashMap<>();

    /* renamed from: g */
    public final CollectionHashMap.HashSetHashMap<C1033p, TicketLifecycleHelper> f23522g = new CollectionHashMap.HashSetHashMap<>();

    public static class TicketLifecycleHelper implements C1006f {

        /* renamed from: b */
        public final TicketRefreshHelper f23523b;

        /* renamed from: c */
        public final Ticket f23524c;

        public TicketLifecycleHelper(TicketDetailsActivity.C7746b bVar, Ticket ticket) {
            this.f23523b = bVar;
            this.f23524c = ticket;
        }

        /* renamed from: e */
        public final /* synthetic */ void mo3607e(C1033p pVar) {
        }

        public final /* synthetic */ void onDestroy(C1033p pVar) {
        }

        public final /* synthetic */ void onPause(C1033p pVar) {
        }

        public final /* synthetic */ void onResume(C1033p pVar) {
        }

        public final void onStart(C1033p pVar) {
            TicketRefreshHelper ticketRefreshHelper = this.f23523b;
            Ticket ticket = this.f23524c;
            ticketRefreshHelper.getClass();
            if (TicketRefreshHelper.f23518h.contains(ticket.f23475d) && ticketRefreshHelper.f23521f.mo47001a(ticket.f23473b.f23511b, ticket)) {
                ticketRefreshHelper.mo24247g(true);
            }
        }

        public final void onStop(C1033p pVar) {
            TicketRefreshHelper ticketRefreshHelper = this.f23523b;
            Ticket ticket = this.f23524c;
            ticketRefreshHelper.getClass();
            String str = ticket.f23474c;
            if (ticketRefreshHelper.f23521f.mo47007p(ticket.f23473b.f23511b, ticket)) {
                ticketRefreshHelper.mo24247g(false);
            }
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.TicketRefreshHelper$a */
    public class C7752a extends C0141e {
        public C7752a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13029r rVar = (C13029r) cVar;
            TicketRefreshHelper.this.mo24247g(false);
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13029r rVar = (C13029r) cVar;
            TicketRefreshHelper ticketRefreshHelper = TicketRefreshHelper.this;
            Map<String, Ticket.Status> map = ((C13030s) gVar).f32240m;
            ticketRefreshHelper.getClass();
            C13717b.m34270q(map);
            Iterator<C20944i0<ServerId, Ticket>> it = ticketRefreshHelper.f23521f.iterator();
            while (it.hasNext()) {
                Ticket ticket = (Ticket) it.next().f52693b;
                Ticket.Status status = map.get(ticket.f23473b.f23513d);
                if (status != null && !status.equals(ticket.f23475d)) {
                    ticketRefreshHelper.mo24235f();
                    it.remove();
                }
            }
        }
    }

    public TicketRefreshHelper(Context context) {
        super(TimeUnit.SECONDS.toMillis(5));
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f23520e = context;
    }

    /* renamed from: a */
    public final void mo19433a() {
        C13756i a = C13756i.m34349a(this.f23520e.getApplicationContext());
        C13752e b = a.mo40679b();
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        for (Map.Entry next : this.f23521f.entrySet()) {
            ServerId serverId = (ServerId) next.getKey();
            ArrayList c2 = C13720d.m34273c((Iterable) next.getValue(), (C13722f) null, new C18267n(27));
            if (!C13717b.m34258e(c2)) {
                C13717b.m34269p(c2);
                C13029r rVar = new C13029r(b, serverId, c2);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C13029r.class, sb, "#");
                sb.append(C17884p.m44335F(rVar.f33922v));
                a.mo40684g(sb.toString(), rVar, c, this.f23519d);
            }
        }
    }

    /* renamed from: f */
    public abstract void mo24235f();

    /* renamed from: g */
    public final void mo24247g(boolean z) {
        if (this.f23521f.isEmpty()) {
            mo23803d();
        } else if (z) {
            mo23804e();
        } else {
            mo23802c();
        }
    }
}
