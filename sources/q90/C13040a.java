package q90;

import ce0.C21100e;
import com.moovit.barcode.BarcodeFormat;
import com.moovit.ticketing.ticket.TicketId;
import java.io.IOException;
import m90.C12890b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: q90.a */
public final class C13040a extends C12890b {

    /* renamed from: f */
    public static final C13041a f32261f = new C13041a();

    /* renamed from: d */
    public final BarcodeFormat f32262d;

    /* renamed from: e */
    public final String f32263e;

    /* renamed from: q90.a$a */
    public class C13041a extends C19619s<C13040a> {
        public C13041a() {
            super(0, C13040a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            TicketId.C7749b bVar = TicketId.f23510f;
            pVar.getClass();
            return new C13040a((TicketId) bVar.read(pVar), pVar.mo51925m(), pVar.mo51948t(), (BarcodeFormat) C13555b.m33968g(BarcodeFormat.getCODER(), pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C13040a aVar = (C13040a) obj;
            TicketId ticketId = aVar.f31901a;
            TicketId.C7749b bVar = TicketId.f23510f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketId, qVar);
            qVar.mo51940m(aVar.f31902b);
            qVar.mo51955t(aVar.f31903c);
            qVar.mo51967q(aVar.f32262d, BarcodeFormat.getCODER());
            qVar.mo51954p(aVar.f32263e);
        }
    }

    public C13040a(TicketId ticketId, long j, String str, BarcodeFormat barcodeFormat, String str2) {
        super(ticketId, j, str);
        this.f32262d = barcodeFormat;
        C21100e.m49373x(str2, "data");
        this.f32263e = str2;
    }

    /* renamed from: a */
    public final <R, E extends Exception> R mo24270a(C12890b.C12891a<R, E> aVar) throws Exception {
        return aVar.mo39740b(this);
    }
}
