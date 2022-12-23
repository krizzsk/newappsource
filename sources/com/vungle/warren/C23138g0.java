package com.vungle.warren;

import ce0.C21118s;
import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.g0 */
public final class C23138g0 implements C23135f0 {

    /* renamed from: a */
    public final C23135f0 f58732a;

    /* renamed from: b */
    public final ExecutorService f58733b;

    /* renamed from: com.vungle.warren.g0$a */
    public class C23139a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58734b;

        public C23139a(String str) {
            this.f58734b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.creativeId(this.f58734b);
        }
    }

    /* renamed from: com.vungle.warren.g0$b */
    public class C23140b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58736b;

        public C23140b(String str) {
            this.f58736b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdStart(this.f58736b);
        }
    }

    /* renamed from: com.vungle.warren.g0$c */
    public class C23141c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58738b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58739c;

        /* renamed from: d */
        public final /* synthetic */ boolean f58740d;

        public C23141c(String str, boolean z, boolean z2) {
            this.f58738b = str;
            this.f58739c = z;
            this.f58740d = z2;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdEnd(this.f58738b, this.f58739c, this.f58740d);
        }
    }

    /* renamed from: com.vungle.warren.g0$d */
    public class C23142d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58742b;

        public C23142d(String str) {
            this.f58742b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdEnd(this.f58742b);
        }
    }

    /* renamed from: com.vungle.warren.g0$e */
    public class C23143e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58744b;

        public C23143e(String str) {
            this.f58744b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdClick(this.f58744b);
        }
    }

    /* renamed from: com.vungle.warren.g0$f */
    public class C23144f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58746b;

        public C23144f(String str) {
            this.f58746b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdLeftApplication(this.f58746b);
        }
    }

    /* renamed from: com.vungle.warren.g0$g */
    public class C23145g implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58748b;

        public C23145g(String str) {
            this.f58748b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdRewarded(this.f58748b);
        }
    }

    /* renamed from: com.vungle.warren.g0$h */
    public class C23146h implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58750b;

        /* renamed from: c */
        public final /* synthetic */ VungleException f58751c;

        public C23146h(String str, VungleException vungleException) {
            this.f58750b = str;
            this.f58751c = vungleException;
        }

        public final void run() {
            C23138g0.this.f58732a.onError(this.f58750b, this.f58751c);
        }
    }

    /* renamed from: com.vungle.warren.g0$i */
    public class C23147i implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58753b;

        public C23147i(String str) {
            this.f58753b = str;
        }

        public final void run() {
            C23138g0.this.f58732a.onAdViewed(this.f58753b);
        }
    }

    public C23138g0(ExecutorService executorService, C23135f0 f0Var) {
        this.f58732a = f0Var;
        this.f58733b = executorService;
    }

    public final void creativeId(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.creativeId(str);
            } else {
                this.f58733b.execute(new C23139a(str));
            }
        }
    }

    public final void onAdClick(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdClick(str);
            } else {
                this.f58733b.execute(new C23143e(str));
            }
        }
    }

    public final void onAdEnd(String str, boolean z, boolean z2) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdEnd(str, z, z2);
            } else {
                this.f58733b.execute(new C23141c(str, z, z2));
            }
        }
    }

    public final void onAdLeftApplication(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdLeftApplication(str);
            } else {
                this.f58733b.execute(new C23144f(str));
            }
        }
    }

    public final void onAdRewarded(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdRewarded(str);
            } else {
                this.f58733b.execute(new C23145g(str));
            }
        }
    }

    public final void onAdStart(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdStart(str);
            } else {
                this.f58733b.execute(new C23140b(str));
            }
        }
    }

    public final void onAdViewed(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdViewed(str);
            } else {
                this.f58733b.execute(new C23147i(str));
            }
        }
    }

    public final void onError(String str, VungleException vungleException) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onError(str, vungleException);
            } else {
                this.f58733b.execute(new C23146h(str, vungleException));
            }
        }
    }

    public final void onAdEnd(String str) {
        if (this.f58732a != null) {
            if (C21118s.m49418a()) {
                this.f58732a.onAdEnd(str);
            } else {
                this.f58733b.execute(new C23142d(str));
            }
        }
    }
}
