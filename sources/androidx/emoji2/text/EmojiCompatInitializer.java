package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.C0836f;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p177n1.C5813l;
import p294w2.C6969a;
import p294w2.C6970b;

public class EmojiCompatInitializer implements C6970b<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C0825a extends C0836f.C0839c {
        public C0825a(Context context) {
            super(new C0826b(context));
            this.f3504b = 1;
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0826b implements C0836f.C0843g {

        /* renamed from: a */
        public final Context f3485a;

        public C0826b(Context context) {
            this.f3485a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final void mo3613a(C0836f.C0844h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C0828a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new C0846g(0, this, hVar, threadPoolExecutor));
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C0827c implements Runnable {
        public final void run() {
            boolean z;
            try {
                int i = C5813l.f18762a;
                C5813l.C5814a.m14246a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0836f.f3491j != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C0836f.m2528a().mo3620c();
                }
                C5813l.C5814a.m14247b();
            } catch (Throwable th) {
                int i2 = C5813l.f18762a;
                C5813l.C5814a.m14247b();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final Boolean create(Context context) {
        Object obj;
        C0825a aVar = new C0825a(context);
        if (C0836f.f3491j == null) {
            synchronized (C0836f.f3490i) {
                if (C0836f.f3491j == null) {
                    C0836f.f3491j = new C0836f(aVar);
                }
            }
        }
        C6969a c = C6969a.m16442c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c.getClass();
        synchronized (C6969a.f21733e) {
            try {
                obj = c.f21734a.get(cls);
                if (obj == null) {
                    obj = c.mo23218b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final Lifecycle lifecycle = ((C1033p) obj).getLifecycle();
        lifecycle.mo4224a(new C1006f() {
            /* renamed from: e */
            public final /* synthetic */ void mo3607e(C1033p pVar) {
            }

            public final /* synthetic */ void onDestroy(C1033p pVar) {
            }

            public final /* synthetic */ void onPause(C1033p pVar) {
            }

            public final void onResume(C1033p pVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = C0829b.m2522a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new C0827c(), 500);
                lifecycle.mo4226c(this);
            }

            public final /* synthetic */ void onStart(C1033p pVar) {
            }

            public final /* synthetic */ void onStop(C1033p pVar) {
            }
        });
        return Boolean.TRUE;
    }

    public final List<Class<? extends C6970b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
