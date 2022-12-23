package p104h2;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1034p0;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p001a0.C0016g;
import p091g2.C4749c;
import p104h2.C5037a;
import p117i2.C5260b;
import p241s0.C6314i;
import p389bl.C13641g;

/* renamed from: h2.b */
public final class C5039b extends C5037a {

    /* renamed from: a */
    public final C1033p f17013a;

    /* renamed from: b */
    public final C5042c f17014b;

    /* renamed from: h2.b$a */
    public static class C5040a<D> extends C1043v<D> implements C5260b.C5262b<D> {

        /* renamed from: a */
        public final int f17015a = 0;

        /* renamed from: b */
        public final Bundle f17016b = null;

        /* renamed from: c */
        public final C5260b<D> f17017c;

        /* renamed from: d */
        public C1033p f17018d;

        /* renamed from: e */
        public C5041b<D> f17019e;

        /* renamed from: f */
        public C5260b<D> f17020f;

        public C5040a(C5260b bVar, C5260b bVar2) {
            this.f17017c = bVar;
            this.f17020f = bVar2;
            bVar.registerListener(0, this);
        }

        /* renamed from: a */
        public final C5260b<D> mo20767a(boolean z) {
            this.f17017c.cancelLoad();
            this.f17017c.abandon();
            C5041b<D> bVar = this.f17019e;
            if (bVar != null) {
                removeObserver(bVar);
                if (z && bVar.f17023c) {
                    bVar.f17022b.onLoaderReset(bVar.f17021a);
                }
            }
            this.f17017c.unregisterListener(this);
            if ((bVar == null || bVar.f17023c) && !z) {
                return this.f17017c;
            }
            this.f17017c.reset();
            return this.f17020f;
        }

        /* renamed from: b */
        public final void mo20768b() {
            C1033p pVar = this.f17018d;
            C5041b<D> bVar = this.f17019e;
            if (pVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(pVar, bVar);
            }
        }

        public final void onActive() {
            this.f17017c.startLoading();
        }

        public final void onInactive() {
            this.f17017c.stopLoading();
        }

        public final void removeObserver(C1044w<? super D> wVar) {
            super.removeObserver(wVar);
            this.f17018d = null;
            this.f17019e = null;
        }

        public final void setValue(D d) {
            super.setValue(d);
            C5260b<D> bVar = this.f17020f;
            if (bVar != null) {
                bVar.reset();
                this.f17020f = null;
            }
        }

        public final String toString() {
            StringBuilder r = C0016g.m34r(64, "LoaderInfo{");
            r.append(Integer.toHexString(System.identityHashCode(this)));
            r.append(" #");
            r.append(this.f17015a);
            r.append(" : ");
            C13641g.m34115c(r, this.f17017c);
            r.append("}}");
            return r.toString();
        }
    }

    /* renamed from: h2.b$b */
    public static class C5041b<D> implements C1044w<D> {

        /* renamed from: a */
        public final C5260b<D> f17021a;

        /* renamed from: b */
        public final C5037a.C5038a<D> f17022b;

        /* renamed from: c */
        public boolean f17023c = false;

        public C5041b(C5260b<D> bVar, C5037a.C5038a<D> aVar) {
            this.f17021a = bVar;
            this.f17022b = aVar;
        }

        public final void onChanged(D d) {
            this.f17022b.onLoadFinished(this.f17021a, d);
            this.f17023c = true;
        }

        public final String toString() {
            return this.f17022b.toString();
        }
    }

    /* renamed from: h2.b$c */
    public static class C5042c extends C1019k0 {

        /* renamed from: d */
        public static final C5043a f17024d = new C5043a();

        /* renamed from: b */
        public C6314i<C5040a> f17025b = new C6314i<>();

        /* renamed from: c */
        public boolean f17026c = false;

        /* renamed from: h2.b$c$a */
        public static class C5043a implements C1026n0.C1028b {
            /* renamed from: a */
            public final <T extends C1019k0> T mo4064a(Class<T> cls) {
                return new C5042c();
            }

            /* renamed from: b */
            public final C1019k0 mo4065b(Class cls, C4749c cVar) {
                return mo4064a(cls);
            }
        }

        public final void onCleared() {
            super.onCleared();
            int i = this.f17025b.f19973d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C5040a) this.f17025b.f19972c[i2]).mo20767a(true);
            }
            C6314i<C5040a> iVar = this.f17025b;
            int i3 = iVar.f19973d;
            Object[] objArr = iVar.f19972c;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            iVar.f19973d = 0;
        }
    }

    public C5039b(C1033p pVar, C1034p0 p0Var) {
        this.f17013a = pVar;
        this.f17014b = (C5042c) new C1026n0(p0Var, (C1026n0.C1028b) C5042c.f17024d).mo4313a(C5042c.class);
    }

    /* renamed from: b */
    public final C5260b mo20760b(C5037a.C5038a aVar) {
        if (this.f17014b.f17026c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C5260b bVar = null;
            C5040a aVar2 = (C5040a) this.f17014b.f17025b.mo22434g(0, (Integer) null);
            if (aVar2 != null) {
                bVar = aVar2.mo20767a(false);
            }
            return mo20764c(aVar, bVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final C5260b mo20764c(C5037a.C5038a aVar, C5260b bVar) {
        try {
            this.f17014b.f17026c = true;
            C5260b onCreateLoader = aVar.onCreateLoader(0, (Bundle) null);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                    }
                }
                C5040a aVar2 = new C5040a(onCreateLoader, bVar);
                this.f17014b.f17025b.mo22435h(0, aVar2);
                this.f17014b.f17026c = false;
                C1033p pVar = this.f17013a;
                C5041b<D> bVar2 = new C5041b<>(aVar2.f17017c, aVar);
                aVar2.observe(pVar, bVar2);
                C5041b<D> bVar3 = aVar2.f17019e;
                if (bVar3 != null) {
                    aVar2.removeObserver(bVar3);
                }
                aVar2.f17018d = pVar;
                aVar2.f17019e = bVar2;
                return aVar2.f17017c;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f17014b.f17026c = false;
            throw th;
        }
    }

    @Deprecated
    /* renamed from: d */
    public final void mo20765d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C5042c cVar = this.f17014b;
        if (cVar.f17025b.f19973d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i = 0;
            while (true) {
                C6314i<C5040a> iVar = cVar.f17025b;
                if (i < iVar.f19973d) {
                    C5040a aVar = (C5040a) iVar.f19972c[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(cVar.f17025b.f19971b[i]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(aVar.f17015a);
                    printWriter.print(" mArgs=");
                    printWriter.println(aVar.f17016b);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f17017c);
                    aVar.f17017c.dump(C25541a.m63881k(str2, "  "), fileDescriptor, printWriter, strArr);
                    if (aVar.f17019e != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f17019e);
                        C5041b<D> bVar = aVar.f17019e;
                        bVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(bVar.f17023c);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    printWriter.println(aVar.f17017c.dataToString(aVar.getValue()));
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.println(aVar.hasActiveObservers());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder r = C0016g.m34r(RecyclerView.C1119a0.FLAG_IGNORE, "LoaderManager{");
        r.append(Integer.toHexString(System.identityHashCode(this)));
        r.append(" in ");
        C13641g.m34115c(r, this.f17013a);
        r.append("}}");
        return r.toString();
    }
}
