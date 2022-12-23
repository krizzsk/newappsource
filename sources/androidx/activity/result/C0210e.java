package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import p065e.C4410a;

/* renamed from: androidx.activity.result.e */
public abstract class C0210e {

    /* renamed from: a */
    public Random f544a = new Random();

    /* renamed from: b */
    public final HashMap f545b = new HashMap();

    /* renamed from: c */
    public final HashMap f546c = new HashMap();

    /* renamed from: d */
    public final HashMap f547d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f548e = new ArrayList<>();

    /* renamed from: f */
    public final transient HashMap f549f = new HashMap();

    /* renamed from: g */
    public final HashMap f550g = new HashMap();

    /* renamed from: h */
    public final Bundle f551h = new Bundle();

    /* renamed from: androidx.activity.result.e$a */
    public static class C0211a<O> {

        /* renamed from: a */
        public final C0206a<O> f552a;

        /* renamed from: b */
        public final C4410a<?, O> f553b;

        public C0211a(C4410a aVar, C0206a aVar2) {
            this.f552a = aVar2;
            this.f553b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    public static class C0212b {

        /* renamed from: a */
        public final Lifecycle f554a;

        /* renamed from: b */
        public final ArrayList<C1025n> f555b = new ArrayList<>();

        public C0212b(Lifecycle lifecycle) {
            this.f554a = lifecycle;
        }
    }

    /* renamed from: a */
    public final boolean mo774a(int i, int i2, Intent intent) {
        String str = (String) this.f545b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0211a aVar = (C0211a) this.f549f.get(str);
        if (aVar == null || aVar.f552a == null || !this.f548e.contains(str)) {
            this.f550g.remove(str);
            this.f551h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        aVar.f552a.mo771b(aVar.f553b.mo3997c(i2, intent));
        this.f548e.remove(str);
        return true;
    }

    /* renamed from: b */
    public abstract void mo742b(int i, C4410a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    /* renamed from: c */
    public final C0208c mo775c(String str, C1033p pVar, C4410a aVar, C0206a aVar2) {
        Lifecycle lifecycle = pVar.getLifecycle();
        if (!lifecycle.mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
            mo777e(str);
            C0212b bVar = (C0212b) this.f547d.get(str);
            if (bVar == null) {
                bVar = new C0212b(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, aVar2, aVar);
            bVar.f554a.mo4224a(activityResultRegistry$1);
            bVar.f555b.add(activityResultRegistry$1);
            this.f547d.put(str, bVar);
            return new C0208c(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.mo4225b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: d */
    public final C0209d mo776d(String str, C4410a aVar, C0206a aVar2) {
        mo777e(str);
        this.f549f.put(str, new C0211a(aVar, aVar2));
        if (this.f550g.containsKey(str)) {
            Object obj = this.f550g.get(str);
            this.f550g.remove(str);
            aVar2.mo771b(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f551h.getParcelable(str);
        if (activityResult != null) {
            this.f551h.remove(str);
            aVar2.mo771b(aVar.mo3997c(activityResult.f528b, activityResult.f529c));
        }
        return new C0209d(this, str, aVar);
    }

    /* renamed from: e */
    public final void mo777e(String str) {
        if (((Integer) this.f546c.get(str)) == null) {
            int nextInt = this.f544a.nextInt(2147418112);
            while (true) {
                int i = nextInt + SQLiteDatabase.OPEN_FULLMUTEX;
                if (this.f545b.containsKey(Integer.valueOf(i))) {
                    nextInt = this.f544a.nextInt(2147418112);
                } else {
                    this.f545b.put(Integer.valueOf(i), str);
                    this.f546c.put(str, Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo778f(String str) {
        Integer num;
        if (!this.f548e.contains(str) && (num = (Integer) this.f546c.remove(str)) != null) {
            this.f545b.remove(num);
        }
        this.f549f.remove(str);
        if (this.f550g.containsKey(str)) {
            Objects.toString(this.f550g.get(str));
            this.f550g.remove(str);
        }
        if (this.f551h.containsKey(str)) {
            Objects.toString(this.f551h.getParcelable(str));
            this.f551h.remove(str);
        }
        C0212b bVar = (C0212b) this.f547d.get(str);
        if (bVar != null) {
            Iterator<C1025n> it = bVar.f555b.iterator();
            while (it.hasNext()) {
                bVar.f554a.mo4226c(it.next());
            }
            bVar.f555b.clear();
            this.f547d.remove(str);
        }
    }
}
