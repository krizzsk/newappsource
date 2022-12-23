package com.vungle.warren;

import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.w */
public final class C23244w implements C23235v {

    /* renamed from: a */
    public final C23235v f58991a;

    /* renamed from: b */
    public final ExecutorService f58992b;

    /* renamed from: com.vungle.warren.w$a */
    public class C23245a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58993b;

        /* renamed from: c */
        public final /* synthetic */ String f58994c;

        public C23245a(String str, String str2) {
            this.f58993b = str;
            this.f58994c = str2;
        }

        public final void run() {
            C23244w.this.f58991a.mo58347a(this.f58993b, this.f58994c);
        }
    }

    /* renamed from: com.vungle.warren.w$b */
    public class C23246b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58996b;

        /* renamed from: c */
        public final /* synthetic */ String f58997c;

        public C23246b(String str, String str2) {
            this.f58996b = str;
            this.f58997c = str2;
        }

        public final void run() {
            C23244w.this.f58991a.mo58348b(this.f58996b, this.f58997c);
        }
    }

    public C23244w(ExecutorService executorService, C23235v vVar) {
        this.f58991a = vVar;
        this.f58992b = executorService;
    }

    /* renamed from: a */
    public final void mo58347a(String str, String str2) {
        if (this.f58991a != null) {
            this.f58992b.execute(new C23245a(str, str2));
        }
    }

    /* renamed from: b */
    public final void mo58348b(String str, String str2) {
        if (this.f58991a != null) {
            this.f58992b.execute(new C23246b(str, str2));
        }
    }
}
