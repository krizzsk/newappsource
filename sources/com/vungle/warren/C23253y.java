package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.y */
public final class C23253y implements C23250x {

    /* renamed from: a */
    public final C23250x f59005a;

    /* renamed from: b */
    public final ExecutorService f59006b;

    /* renamed from: com.vungle.warren.y$a */
    public class C23254a implements Runnable {
        public C23254a() {
        }

        public final void run() {
            C23253y.this.f59005a.onSuccess();
        }
    }

    /* renamed from: com.vungle.warren.y$b */
    public class C23255b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ VungleException f59008b;

        public C23255b(VungleException vungleException) {
            this.f59008b = vungleException;
        }

        public final void run() {
            C23253y.this.f59005a.mo15748a(this.f59008b);
        }
    }

    /* renamed from: com.vungle.warren.y$c */
    public class C23256c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f59010b;

        public C23256c(String str) {
            this.f59010b = str;
        }

        public final void run() {
            C23253y.this.f59005a.mo15749b(this.f59010b);
        }
    }

    public C23253y(ExecutorService executorService, C23250x xVar) {
        this.f59005a = xVar;
        this.f59006b = executorService;
    }

    /* renamed from: a */
    public final void mo15748a(VungleException vungleException) {
        if (this.f59005a != null) {
            this.f59006b.execute(new C23255b(vungleException));
        }
    }

    /* renamed from: b */
    public final void mo15749b(String str) {
        if (this.f59005a != null) {
            this.f59006b.execute(new C23256c(str));
        }
    }

    public final void onSuccess() {
        if (this.f59005a != null) {
            this.f59006b.execute(new C23254a());
        }
    }
}
