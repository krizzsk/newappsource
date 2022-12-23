package com.moovit.payment.clearance.tokenization;

import aa0.C7540l;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import java.util.IdentityHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p451du.C16705b;
import p977zz.C20935e;
import q50.C19083d;
import t50.C19628a;

public class TokenizeStatusObserver implements C1025n {

    /* renamed from: g */
    public static final IdentityHashMap f42612g = new IdentityHashMap();

    /* renamed from: b */
    public final AtomicBoolean f42613b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C16308a f42614c = new C16308a();

    /* renamed from: d */
    public final C13752e f42615d;

    /* renamed from: e */
    public final String f42616e;

    /* renamed from: f */
    public final C20935e<TokenizeStatus> f42617f;

    /* renamed from: com.moovit.payment.clearance.tokenization.TokenizeStatusObserver$a */
    public class C16308a extends C7540l {
        public C16308a() {
            super(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
        }

        /* renamed from: a */
        public final void mo19433a() {
            ExecutorService executorService = MoovitExecutors.f37327IO;
            TokenizeStatusObserver tokenizeStatusObserver = TokenizeStatusObserver.this;
            Tasks.call(executorService, new C19628a(tokenizeStatusObserver.f42615d, tokenizeStatusObserver.f42616e)).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C16705b(this, 5));
        }
    }

    /* renamed from: com.moovit.payment.clearance.tokenization.TokenizeStatusObserver$b */
    public static /* synthetic */ class C16309b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42619a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42619a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42619a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42619a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.clearance.tokenization.TokenizeStatusObserver.C16309b.<clinit>():void");
        }
    }

    public TokenizeStatusObserver(C13752e eVar, String str, C20935e<TokenizeStatus> eVar2) {
        C21100e.m49373x(eVar, "requestContext");
        this.f42615d = eVar;
        C21100e.m49373x(str, "paymentToken");
        this.f42616e = str;
        this.f42617f = eVar2;
    }

    /* renamed from: a */
    public static void m41610a(C19083d dVar, C13752e eVar, String str, C20935e eVar2) {
        IdentityHashMap identityHashMap = f42612g;
        TokenizeStatusObserver tokenizeStatusObserver = (TokenizeStatusObserver) identityHashMap.get(dVar);
        if (tokenizeStatusObserver == null || !tokenizeStatusObserver.f42616e.equals(str)) {
            Lifecycle lifecycle = dVar.getLifecycle();
            if (tokenizeStatusObserver != null) {
                lifecycle.mo4226c(tokenizeStatusObserver);
            }
            TokenizeStatusObserver tokenizeStatusObserver2 = new TokenizeStatusObserver(eVar, str, eVar2);
            identityHashMap.put(dVar, tokenizeStatusObserver2);
            lifecycle.mo4224a(tokenizeStatusObserver2);
        }
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        int i = C16309b.f42619a[event.ordinal()];
        if (i == 1) {
            this.f42613b.set(true);
            this.f42614c.mo23804e();
        } else if (i == 2) {
            this.f42613b.set(false);
            this.f42614c.mo23803d();
        } else if (i == 3) {
            this.f42613b.set(false);
            pVar.getLifecycle().mo4226c(this);
            f42612g.remove(pVar);
        }
    }
}
