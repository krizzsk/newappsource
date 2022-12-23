package com.moovit.ticketing.validation.receipt.media;

import ce0.C21100e;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent;
import java.io.IOException;
import m90.C12890b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20950l0;

/* renamed from: com.moovit.ticketing.validation.receipt.media.a */
public final class C7772a extends C12890b {

    /* renamed from: i */
    public static final C7773a f23591i = new C7773a();

    /* renamed from: d */
    public final C20950l0<Long> f23592d;

    /* renamed from: e */
    public final MediaTicketReceiptContent f23593e;

    /* renamed from: f */
    public final MediaTicketReceiptContent f23594f;

    /* renamed from: g */
    public final MediaTicketReceiptContent f23595g;

    /* renamed from: h */
    public final boolean f23596h;

    /* renamed from: com.moovit.ticketing.validation.receipt.media.a$a */
    public class C7773a extends C19619s<C7772a> {
        public C7773a() {
            super(1, C7772a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Long l;
            boolean z;
            TicketId.C7749b bVar = TicketId.f23510f;
            pVar.getClass();
            TicketId ticketId = (TicketId) bVar.read(pVar);
            long m = pVar.mo51925m();
            String t = pVar.mo51948t();
            Long l2 = null;
            if (!pVar.mo51919b()) {
                l = null;
            } else {
                l = Long.valueOf(pVar.mo51925m());
            }
            if (!(!pVar.mo51919b())) {
                l2 = Long.valueOf(pVar.mo51925m());
            }
            C20950l0 l0Var = new C20950l0(l, l2);
            MediaTicketReceiptContent.C7771b bVar2 = MediaTicketReceiptContent.f23585f;
            MediaTicketReceiptContent mediaTicketReceiptContent = (MediaTicketReceiptContent) bVar2.read(pVar);
            MediaTicketReceiptContent mediaTicketReceiptContent2 = (MediaTicketReceiptContent) bVar2.read(pVar);
            MediaTicketReceiptContent mediaTicketReceiptContent3 = (MediaTicketReceiptContent) bVar2.read(pVar);
            if (i < 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            return new C7772a(ticketId, m, t, l0Var, mediaTicketReceiptContent, mediaTicketReceiptContent2, mediaTicketReceiptContent3, z);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C7772a aVar = (C7772a) obj;
            TicketId ticketId = aVar.f31901a;
            TicketId.C7749b bVar = TicketId.f23510f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketId, qVar);
            qVar.mo51940m(aVar.f31902b);
            qVar.mo51955t(aVar.f31903c);
            C20950l0<Long> l0Var = aVar.f23592d;
            T t = l0Var.f52695a;
            if (t == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51940m(((Long) t).longValue());
            }
            T t2 = l0Var.f52696b;
            if (t2 == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51940m(((Long) t2).longValue());
            }
            MediaTicketReceiptContent mediaTicketReceiptContent = aVar.f23593e;
            MediaTicketReceiptContent.C7771b bVar2 = MediaTicketReceiptContent.f23585f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(mediaTicketReceiptContent, qVar);
            MediaTicketReceiptContent mediaTicketReceiptContent2 = aVar.f23594f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(mediaTicketReceiptContent2, qVar);
            MediaTicketReceiptContent mediaTicketReceiptContent3 = aVar.f23595g;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(mediaTicketReceiptContent3, qVar);
            qVar.mo51934b(aVar.f23596h);
        }
    }

    public C7772a(TicketId ticketId, long j, String str, C20950l0<Long> l0Var, MediaTicketReceiptContent mediaTicketReceiptContent, MediaTicketReceiptContent mediaTicketReceiptContent2, MediaTicketReceiptContent mediaTicketReceiptContent3, boolean z) {
        super(ticketId, j, str);
        C21100e.m49373x(l0Var, "validityTime");
        this.f23592d = l0Var;
        C21100e.m49373x(mediaTicketReceiptContent, "beforeValidityMedia");
        this.f23593e = mediaTicketReceiptContent;
        C21100e.m49373x(mediaTicketReceiptContent2, "validityMedia");
        this.f23594f = mediaTicketReceiptContent2;
        C21100e.m49373x(mediaTicketReceiptContent3, "afterValidityMedia");
        this.f23595g = mediaTicketReceiptContent3;
        this.f23596h = z;
    }

    /* renamed from: a */
    public final <R, E extends Exception> R mo24270a(C12890b.C12891a<R, E> aVar) throws Exception {
        return aVar.mo39739a(this);
    }
}
