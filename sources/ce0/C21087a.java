package ce0;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p988j$.util.concurrent.ConcurrentHashMap;
import xd0.C25247e;

/* renamed from: ce0.a */
public final class C21087a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k */
    public static final C21087a f52911k = new C21087a();

    /* renamed from: b */
    public boolean f52912b;

    /* renamed from: c */
    public int f52913c;

    /* renamed from: d */
    public int f52914d;

    /* renamed from: e */
    public CopyOnWriteArraySet<C21093f> f52915e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    public ConcurrentHashMap<C21092e, C21093f> f52916f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public Handler f52917g;

    /* renamed from: h */
    public boolean f52918h = true;

    /* renamed from: i */
    public boolean f52919i = true;

    /* renamed from: j */
    public C21088a f52920j = new C21088a();

    /* renamed from: ce0.a$a */
    public class C21088a implements Runnable {
        public C21088a() {
        }

        public final void run() {
            C21087a aVar = C21087a.this;
            if (aVar.f52914d == 0 && !aVar.f52918h) {
                aVar.f52918h = true;
                Iterator<C21093f> it = aVar.f52915e.iterator();
                while (it.hasNext()) {
                    it.next().mo53286a();
                }
            }
            C21087a aVar2 = C21087a.this;
            if (aVar2.f52913c == 0 && aVar2.f52918h && !aVar2.f52919i) {
                aVar2.f52919i = true;
                Iterator<C21093f> it2 = aVar2.f52915e.iterator();
                while (it2.hasNext()) {
                    it2.next().mo53288d();
                }
            }
        }
    }

    /* renamed from: ce0.a$b */
    public class C21089b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ WeakReference f52922b;

        public C21089b(WeakReference weakReference) {
            this.f52922b = weakReference;
        }

        public final void run() {
            C21087a.this.f52917g.removeCallbacks(this);
            C21087a aVar = C21087a.this;
            C21092e eVar = (C21092e) this.f52922b.get();
            if (eVar == null) {
                aVar.getClass();
                return;
            }
            C21093f remove = aVar.f52916f.remove(eVar);
            if (remove != null) {
                aVar.f52915e.remove(remove);
            }
        }
    }

    /* renamed from: ce0.a$c */
    public class C21090c extends C21093f {

        /* renamed from: a */
        public boolean f52924a = false;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f52925b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f52926c;

        public C21090c(WeakReference weakReference, C21089b bVar) {
            this.f52925b = weakReference;
            this.f52926c = bVar;
        }

        /* renamed from: a */
        public final void mo53286a() {
            this.f52924a = true;
            C21087a.this.f52917g.removeCallbacks(this.f52926c);
        }

        /* renamed from: b */
        public final void mo53287b() {
            C21087a.this.f52917g.postDelayed(this.f52926c, 1400);
        }

        /* renamed from: d */
        public final void mo53288d() {
            C21092e eVar = (C21092e) this.f52925b.get();
            if (this.f52924a && eVar != null && C21087a.this.f52916f.containsKey(eVar)) {
                eVar.mo53290a();
            }
            C21087a aVar = C21087a.this;
            if (eVar == null) {
                aVar.getClass();
            } else {
                C21093f remove = aVar.f52916f.remove(eVar);
                if (remove != null) {
                    aVar.f52915e.remove(remove);
                }
            }
            C21087a.this.f52917g.removeCallbacks(this.f52926c);
        }
    }

    /* renamed from: ce0.a$d */
    public class C21091d extends C21093f {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f52928a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f52929b;

        public C21091d(WeakReference weakReference, C21089b bVar) {
            this.f52928a = weakReference;
            this.f52929b = bVar;
        }

        /* renamed from: c */
        public final void mo53289c() {
            C21087a.f52911k.f52915e.remove(this);
            C21093f fVar = C21087a.this.f52916f.get(this.f52928a.get());
            if (fVar != null) {
                C21087a.this.f52917g.postDelayed(this.f52929b, 3000);
                C21087a.this.mo53275a(fVar);
            }
        }
    }

    /* renamed from: ce0.a$e */
    public interface C21092e {
        /* renamed from: a */
        void mo53290a();
    }

    /* renamed from: ce0.a$f */
    public static class C21093f {
        /* renamed from: a */
        public void mo53286a() {
        }

        /* renamed from: b */
        public void mo53287b() {
        }

        /* renamed from: c */
        public void mo53289c() {
        }

        /* renamed from: d */
        public void mo53288d() {
        }
    }

    static {
        Class<C21087a> cls = C21087a.class;
    }

    /* renamed from: c */
    public static boolean m49279c(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
        PresenterAdOpenCallback.AdOpenType adOpenType;
        if (intent == null && intent2 == null) {
            return false;
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.getLocalizedMessage();
                if (!(intent == null || intent2 == null)) {
                    try {
                        context.startActivity(intent2);
                        if (presenterAdOpenCallback != null) {
                            presenterAdOpenCallback.mo58331a(PresenterAdOpenCallback.AdOpenType.DEFAULT);
                        }
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        return false;
                    }
                }
                return false;
            }
        } else {
            context.startActivity(intent2);
        }
        if (presenterAdOpenCallback != null) {
            if (intent != null) {
                adOpenType = PresenterAdOpenCallback.AdOpenType.DEEP_LINK;
            } else {
                adOpenType = PresenterAdOpenCallback.AdOpenType.DEFAULT;
            }
            presenterAdOpenCallback.mo58331a(adOpenType);
        }
        return true;
    }

    /* renamed from: d */
    public static void m49280d(Context context, Intent intent, Intent intent2, C25247e eVar, PresenterAdOpenCallback presenterAdOpenCallback) {
        boolean z;
        WeakReference weakReference = new WeakReference(context);
        C21087a aVar = f52911k;
        if (!aVar.f52912b || aVar.f52913c > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            aVar.mo53275a(new C21094b(weakReference, intent, intent2, presenterAdOpenCallback, eVar));
        } else if (m49279c(context, intent, intent2, presenterAdOpenCallback)) {
            aVar.mo53276b(eVar);
        }
    }

    /* renamed from: a */
    public final void mo53275a(C21093f fVar) {
        this.f52915e.add(fVar);
    }

    /* renamed from: b */
    public final void mo53276b(C21092e eVar) {
        boolean z;
        if (eVar != null) {
            if (!this.f52912b) {
                eVar.mo53290a();
                return;
            }
            WeakReference weakReference = new WeakReference(eVar);
            C21089b bVar = new C21089b(weakReference);
            C21090c cVar = new C21090c(weakReference, bVar);
            this.f52916f.put(eVar, cVar);
            if (!this.f52912b || this.f52913c > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f52917g.postDelayed(bVar, 3000);
                mo53275a(cVar);
                return;
            }
            f52911k.mo53275a(new C21091d(weakReference, bVar));
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f52914d = Math.max(0, this.f52914d - 1);
        this.f52917g.postDelayed(this.f52920j, 700);
    }

    public final void onActivityResumed(Activity activity) {
        int i = this.f52914d + 1;
        this.f52914d = i;
        if (i != 1) {
            return;
        }
        if (this.f52918h) {
            this.f52918h = false;
            Iterator<C21093f> it = this.f52915e.iterator();
            while (it.hasNext()) {
                it.next().mo53287b();
            }
            return;
        }
        this.f52917g.removeCallbacks(this.f52920j);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        int i = this.f52913c + 1;
        this.f52913c = i;
        if (i == 1 && this.f52919i) {
            this.f52919i = false;
            Iterator<C21093f> it = this.f52915e.iterator();
            while (it.hasNext()) {
                it.next().mo53289c();
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.f52913c = Math.max(0, this.f52913c - 1);
        this.f52917g.postDelayed(this.f52920j, 700);
    }
}
