package p934yf;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p316y.C7219n;

/* renamed from: yf.a */
public final class C20714a {

    /* renamed from: c */
    public static final C20714a f52305c = new C20714a();

    /* renamed from: a */
    public final HashMap f52306a = new HashMap();

    /* renamed from: b */
    public final Object f52307b = new Object();

    /* renamed from: yf.a$a */
    public static class C20715a {

        /* renamed from: a */
        public final Activity f52308a;

        /* renamed from: b */
        public final Runnable f52309b;

        /* renamed from: c */
        public final Object f52310c;

        public C20715a(Activity activity, Object obj, C7219n nVar) {
            this.f52308a = activity;
            this.f52309b = nVar;
            this.f52310c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C20715a)) {
                return false;
            }
            C20715a aVar = (C20715a) obj;
            if (aVar.f52310c.equals(this.f52310c) && aVar.f52309b == this.f52309b && aVar.f52308a == this.f52308a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f52310c.hashCode();
        }
    }

    /* renamed from: yf.a$b */
    public static class C20716b extends LifecycleCallback {

        /* renamed from: b */
        public final ArrayList f52311b = new ArrayList();

        public C20716b(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("StorageOnStopCallback", this);
        }

        public final void onStop() {
            ArrayList arrayList;
            synchronized (this.f52311b) {
                arrayList = new ArrayList(this.f52311b);
                this.f52311b.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20715a aVar = (C20715a) it.next();
                if (aVar != null) {
                    aVar.f52309b.run();
                    C20714a.f52305c.mo52860a(aVar.f52310c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo52860a(Object obj) {
        synchronized (this.f52307b) {
            C20715a aVar = (C20715a) this.f52306a.get(obj);
            if (aVar != null) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(new LifecycleActivity(aVar.f52308a));
                C20716b bVar = (C20716b) fragment.getCallbackOrNull("StorageOnStopCallback", C20716b.class);
                if (bVar == null) {
                    bVar = new C20716b(fragment);
                }
                synchronized (bVar.f52311b) {
                    bVar.f52311b.remove(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo52861b(Activity activity, Object obj, C7219n nVar) {
        synchronized (this.f52307b) {
            C20715a aVar = new C20715a(activity, obj, nVar);
            LifecycleFragment fragment = LifecycleCallback.getFragment(new LifecycleActivity(activity));
            C20716b bVar = (C20716b) fragment.getCallbackOrNull("StorageOnStopCallback", C20716b.class);
            if (bVar == null) {
                bVar = new C20716b(fragment);
            }
            synchronized (bVar.f52311b) {
                bVar.f52311b.add(aVar);
            }
            this.f52306a.put(obj, aVar);
        }
    }
}
