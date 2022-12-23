package yb0;

import ac0.C7557a;
import ce0.C21100e;
import com.google.android.play.core.appupdate.C14226d;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.C23825c;
import lf0.C24236l;
import mf0.C24362h;
import p001a0.C0017h;
import p043ch.qos.logback.classic.Logger;

/* renamed from: yb0.a */
public final class C13290a {

    /* renamed from: a */
    public final List<String> f32971a;

    /* renamed from: b */
    public final String f32972b;

    /* renamed from: c */
    public final int f32973c;

    /* renamed from: d */
    public final C13291a f32974d;

    /* renamed from: e */
    public Timer f32975e;

    /* renamed from: yb0.a$a */
    public interface C13291a {
        void zza();
    }

    /* renamed from: yb0.a$b */
    public static final class C13292b extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ C13290a f32976b;

        /* renamed from: c */
        public final /* synthetic */ String f32977c;

        public C13292b(C13290a aVar, String str) {
            this.f32976b = aVar;
            this.f32977c = str;
        }

        public final void run() {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("PREFETCH_AD_EXPIRY_");
            J0.append(this.f32976b.f32972b);
            J0.append(": Timer EXPIRED");
            J0.append(this.f32977c);
            logger.mo6672i(J0.toString());
            this.f32976b.mo40154b(true);
            C13291a aVar = this.f32976b.f32974d;
            if (aVar != null) {
                aVar.zza();
            }
        }
    }

    public C13290a(List<String> list, String str, int i, C13291a aVar) {
        C24362h.m61211f(list, "spotIds");
        this.f32971a = list;
        this.f32972b = str;
        this.f32973c = i;
        this.f32974d = aVar;
    }

    /* renamed from: a */
    public final void mo40153a() {
        String str;
        List<String> list = this.f32971a;
        boolean z = true;
        if (list == null || !(!list.isEmpty())) {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (SpotId(s): [");
            C24362h.m61208c(list);
            str = C14226d.m35344K0(sb, C23825c.m58520q0(list, ", ", (String) null, (String) null, (C24236l) null, 62));
        } else {
            str = "";
        }
        if (this.f32975e != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("PREFETCH_AD_EXPIRY_");
            J0.append(this.f32972b);
            J0.append(": Timer already running");
            J0.append(str);
            logger.mo6666c(J0.toString());
            return;
        }
        StringBuilder J02 = C21100e.m49315J0("AKPrefetchAdExpiryTimer[");
        J02.append(this.f32971a);
        J02.append("]_");
        J02.append(this.f32972b);
        String sb2 = J02.toString();
        int i = this.f32973c;
        if (i <= 0) {
            i = 25;
        }
        this.f32975e = new Timer(sb2, false);
        Logger logger2 = C7557a.f23040a;
        StringBuilder J03 = C21100e.m49315J0("PREFETCH_AD_EXPIRY_");
        C0017h.m61R(J03, this.f32972b, ": Starting Timer", str, ": [");
        J03.append(i);
        J03.append(" minutes]...");
        logger2.mo6672i(J03.toString());
        Timer timer = this.f32975e;
        if (timer != null) {
            timer.schedule(new C13292b(this, str), ((long) i) * ((long) 60) * ((long) 1000));
        }
    }

    /* renamed from: b */
    public final void mo40154b(boolean z) {
        String str;
        if (this.f32975e != null) {
            List<String> list = this.f32971a;
            boolean z2 = true;
            if (list == null || !(!list.isEmpty())) {
                z2 = false;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" (SpotId(s): [");
                C24362h.m61208c(list);
                str = C14226d.m35344K0(sb, C23825c.m58520q0(list, ", ", (String) null, (String) null, (C24236l) null, 62));
            } else {
                str = "";
            }
            if (!z) {
                C7557a.f23040a.mo6672i(C13715c.m34246l(C21100e.m49315J0("PREFETCH_AD_EXPIRY_"), this.f32972b, ": Stopping Timer", str, "..."));
            }
            Timer timer = this.f32975e;
            if (timer != null) {
                timer.cancel();
            }
            this.f32975e = null;
        }
    }
}
