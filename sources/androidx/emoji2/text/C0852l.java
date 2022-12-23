package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.C0836f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mf0.C24361g;
import p190o1.C5910e;
import p190o1.C5912f;
import p190o1.C5919l;
import p190o1.C5920m;
import p304x.C7082o;
import p358af.C13437d;

/* renamed from: androidx.emoji2.text.l */
public final class C0852l extends C0836f.C0839c {

    /* renamed from: d */
    public static final C0853a f3530d = new C0853a();

    /* renamed from: androidx.emoji2.text.l$a */
    public static class C0853a {
    }

    /* renamed from: androidx.emoji2.text.l$b */
    public static class C0854b implements C0836f.C0843g {

        /* renamed from: a */
        public final Context f3531a;

        /* renamed from: b */
        public final C5912f f3532b;

        /* renamed from: c */
        public final C0853a f3533c;

        /* renamed from: d */
        public final Object f3534d = new Object();

        /* renamed from: e */
        public Handler f3535e;

        /* renamed from: f */
        public Executor f3536f;

        /* renamed from: g */
        public ThreadPoolExecutor f3537g;

        /* renamed from: h */
        public C0836f.C0844h f3538h;

        public C0854b(Context context, C5912f fVar) {
            C0853a aVar = C0852l.f3530d;
            C24361g.m61185s(context, "Context cannot be null");
            this.f3531a = context.getApplicationContext();
            this.f3532b = fVar;
            this.f3533c = aVar;
        }

        /* renamed from: a */
        public final void mo3613a(C0836f.C0844h hVar) {
            synchronized (this.f3534d) {
                this.f3538h = hVar;
            }
            mo3637c();
        }

        /* renamed from: b */
        public final void mo3636b() {
            synchronized (this.f3534d) {
                this.f3538h = null;
                Handler handler = this.f3535e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f3535e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3537g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3536f = null;
                this.f3537g = null;
            }
        }

        /* renamed from: c */
        public final void mo3637c() {
            synchronized (this.f3534d) {
                if (this.f3538h != null) {
                    if (this.f3536f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C0828a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f3537g = threadPoolExecutor;
                        this.f3536f = threadPoolExecutor;
                    }
                    this.f3536f.execute(new C7082o(this, 3));
                }
            }
        }

        /* renamed from: d */
        public final C5920m mo3638d() {
            try {
                C0853a aVar = this.f3533c;
                Context context = this.f3531a;
                C5912f fVar = this.f3532b;
                aVar.getClass();
                C5919l a = C5910e.m14390a(context, fVar);
                if (a.f19007a == 0) {
                    C5920m[] mVarArr = a.f19008b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(C13437d.m33707l(C13555b.m33972k("fetchFonts failed ("), a.f19007a, ")"));
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public C0852l(Context context, C5912f fVar) {
        super(new C0854b(context, fVar));
    }
}
