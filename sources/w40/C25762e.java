package w40;

import ce0.C21100e;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: w40.e */
public final class C25762e {

    /* renamed from: d */
    public static final C25763a f64273d = new C25763a();

    /* renamed from: a */
    public final String f64274a;

    /* renamed from: b */
    public final String f64275b;

    /* renamed from: c */
    public final long f64276c;

    /* renamed from: w40.e$a */
    public class C25763a extends C19619s<C25762e> {
        public C25763a() {
            super(0, C25762e.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C25762e(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C25762e eVar = (C25762e) obj;
            qVar.mo51954p(eVar.f64275b);
            qVar.mo51954p(eVar.f64274a);
            qVar.mo51940m(eVar.f64276c);
        }
    }

    public C25762e(String str, String str2, long j) {
        C21100e.m49373x(str2, FirebaseMessagingService.EXTRA_TOKEN);
        this.f64275b = str2;
        C21100e.m49373x(str, "paymentContext");
        this.f64274a = str;
        this.f64276c = j;
    }
}
