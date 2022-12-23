package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.recyclerview.widget.g */
public final class C1179g extends C1185g0 {

    /* renamed from: s */
    public static TimeInterpolator f4469s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C1119a0> f4470h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C1119a0> f4471i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C1184e> f4472j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C1183d> f4473k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C1119a0>> f4474l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C1184e>> f4475m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C1183d>> f4476n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C1119a0> f4477o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C1119a0> f4478p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C1119a0> f4479q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C1119a0> f4480r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.g$a */
    public class C1180a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4481b;

        public C1180a(ArrayList arrayList) {
            this.f4481b = arrayList;
        }

        public final void run() {
            Iterator it = this.f4481b.iterator();
            while (it.hasNext()) {
                C1184e eVar = (C1184e) it.next();
                C1179g gVar = C1179g.this;
                RecyclerView.C1119a0 a0Var = eVar.f4493a;
                int i = eVar.f4494b;
                int i2 = eVar.f4495c;
                int i3 = eVar.f4496d;
                int i4 = eVar.f4497e;
                gVar.getClass();
                View view = a0Var.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
                }
                if (i6 != 0) {
                    view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
                }
                ViewPropertyAnimator animate = view.animate();
                gVar.f4478p.add(a0Var);
                animate.setDuration(gVar.f4310e).setListener(new C1198j(gVar, a0Var, i5, view, i6, animate)).start();
            }
            this.f4481b.clear();
            C1179g.this.f4475m.remove(this.f4481b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public class C1181b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4483b;

        public C1181b(ArrayList arrayList) {
            this.f4483b = arrayList;
        }

        public final void run() {
            View view;
            Iterator it = this.f4483b.iterator();
            while (it.hasNext()) {
                C1183d dVar = (C1183d) it.next();
                C1179g gVar = C1179g.this;
                gVar.getClass();
                RecyclerView.C1119a0 a0Var = dVar.f4487a;
                View view2 = null;
                if (a0Var == null) {
                    view = null;
                } else {
                    view = a0Var.itemView;
                }
                RecyclerView.C1119a0 a0Var2 = dVar.f4488b;
                if (a0Var2 != null) {
                    view2 = a0Var2.itemView;
                }
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(gVar.f4311f);
                    gVar.f4480r.add(dVar.f4487a);
                    duration.translationX((float) (dVar.f4491e - dVar.f4489c));
                    duration.translationY((float) (dVar.f4492f - dVar.f4490d));
                    duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C1202k(gVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    gVar.f4480r.add(dVar.f4488b);
                    animate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(gVar.f4311f).alpha(1.0f).setListener(new C1205l(gVar, dVar, animate, view2)).start();
                }
            }
            this.f4483b.clear();
            C1179g.this.f4476n.remove(this.f4483b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    public class C1182c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4485b;

        public C1182c(ArrayList arrayList) {
            this.f4485b = arrayList;
        }

        public final void run() {
            Iterator it = this.f4485b.iterator();
            while (it.hasNext()) {
                RecyclerView.C1119a0 a0Var = (RecyclerView.C1119a0) it.next();
                C1179g gVar = C1179g.this;
                gVar.getClass();
                View view = a0Var.itemView;
                ViewPropertyAnimator animate = view.animate();
                gVar.f4477o.add(a0Var);
                animate.alpha(1.0f).setDuration(gVar.f4308c).setListener(new C1189i(view, animate, gVar, a0Var)).start();
            }
            this.f4485b.clear();
            C1179g.this.f4474l.remove(this.f4485b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    public static class C1183d {

        /* renamed from: a */
        public RecyclerView.C1119a0 f4487a;

        /* renamed from: b */
        public RecyclerView.C1119a0 f4488b;

        /* renamed from: c */
        public int f4489c;

        /* renamed from: d */
        public int f4490d;

        /* renamed from: e */
        public int f4491e;

        /* renamed from: f */
        public int f4492f;

        public C1183d(RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2, int i, int i2, int i3, int i4) {
            this.f4487a = a0Var;
            this.f4488b = a0Var2;
            this.f4489c = i;
            this.f4490d = i2;
            this.f4491e = i3;
            this.f4492f = i4;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ChangeInfo{oldHolder=");
            k.append(this.f4487a);
            k.append(", newHolder=");
            k.append(this.f4488b);
            k.append(", fromX=");
            k.append(this.f4489c);
            k.append(", fromY=");
            k.append(this.f4490d);
            k.append(", toX=");
            k.append(this.f4491e);
            k.append(", toY=");
            return C16530d.m42014g(k, this.f4492f, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    public static class C1184e {

        /* renamed from: a */
        public RecyclerView.C1119a0 f4493a;

        /* renamed from: b */
        public int f4494b;

        /* renamed from: c */
        public int f4495c;

        /* renamed from: d */
        public int f4496d;

        /* renamed from: e */
        public int f4497e;

        public C1184e(RecyclerView.C1119a0 a0Var, int i, int i2, int i3, int i4) {
            this.f4493a = a0Var;
            this.f4494b = i;
            this.f4495c = i2;
            this.f4496d = i3;
            this.f4497e = i4;
        }
    }

    /* renamed from: n */
    public static void m3244n(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.C1119a0) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo4773c(RecyclerView.C1119a0 a0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4773c(a0Var, list);
    }

    /* renamed from: f */
    public final void mo4776f(RecyclerView.C1119a0 a0Var) {
        View view = a0Var.itemView;
        view.animate().cancel();
        int size = this.f4472j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4472j.get(size).f4493a == a0Var) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                mo4774d(a0Var);
                this.f4472j.remove(size);
            }
        }
        mo5063p(a0Var, this.f4473k);
        if (this.f4470h.remove(a0Var)) {
            view.setAlpha(1.0f);
            mo4774d(a0Var);
        }
        if (this.f4471i.remove(a0Var)) {
            view.setAlpha(1.0f);
            mo4774d(a0Var);
        }
        int size2 = this.f4476n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f4476n.get(size2);
            mo5063p(a0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.f4476n.remove(size2);
            }
        }
        int size3 = this.f4475m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f4475m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C1184e) arrayList2.get(size4)).f4493a == a0Var) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    mo4774d(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4475m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f4474l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f4474l.get(size5);
                if (arrayList3.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    mo4774d(a0Var);
                    if (arrayList3.isEmpty()) {
                        this.f4474l.remove(size5);
                    }
                }
            } else {
                this.f4479q.remove(a0Var);
                this.f4477o.remove(a0Var);
                this.f4480r.remove(a0Var);
                this.f4478p.remove(a0Var);
                mo5062o();
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo4777g() {
        int size = this.f4472j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1184e eVar = this.f4472j.get(size);
            View view = eVar.f4493a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            mo4774d(eVar.f4493a);
            this.f4472j.remove(size);
        }
        int size2 = this.f4470h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo4774d(this.f4470h.get(size2));
            this.f4470h.remove(size2);
        }
        int size3 = this.f4471i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1119a0 a0Var = this.f4471i.get(size3);
            a0Var.itemView.setAlpha(1.0f);
            mo4774d(a0Var);
            this.f4471i.remove(size3);
        }
        int size4 = this.f4473k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1183d dVar = this.f4473k.get(size4);
            RecyclerView.C1119a0 a0Var2 = dVar.f4487a;
            if (a0Var2 != null) {
                mo5064q(dVar, a0Var2);
            }
            RecyclerView.C1119a0 a0Var3 = dVar.f4488b;
            if (a0Var3 != null) {
                mo5064q(dVar, a0Var3);
            }
        }
        this.f4473k.clear();
        if (mo4778h()) {
            int size5 = this.f4475m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f4475m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C1184e eVar2 = (C1184e) arrayList.get(size6);
                        View view2 = eVar2.f4493a.itemView;
                        view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                        view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                        mo4774d(eVar2.f4493a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f4475m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f4474l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f4474l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.C1119a0 a0Var4 = (RecyclerView.C1119a0) arrayList2.get(size8);
                        a0Var4.itemView.setAlpha(1.0f);
                        mo4774d(a0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f4474l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f4476n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f4476n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C1183d dVar2 = (C1183d) arrayList3.get(size10);
                            RecyclerView.C1119a0 a0Var5 = dVar2.f4487a;
                            if (a0Var5 != null) {
                                mo5064q(dVar2, a0Var5);
                            }
                            RecyclerView.C1119a0 a0Var6 = dVar2.f4488b;
                            if (a0Var6 != null) {
                                mo5064q(dVar2, a0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f4476n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    m3244n(this.f4479q);
                    m3244n(this.f4478p);
                    m3244n(this.f4477o);
                    m3244n(this.f4480r);
                    mo4775e();
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo4778h() {
        if (!this.f4471i.isEmpty() || !this.f4473k.isEmpty() || !this.f4472j.isEmpty() || !this.f4470h.isEmpty() || !this.f4478p.isEmpty() || !this.f4479q.isEmpty() || !this.f4477o.isEmpty() || !this.f4480r.isEmpty() || !this.f4475m.isEmpty() || !this.f4474l.isEmpty() || !this.f4476n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo4779i() {
        long j;
        long j2;
        boolean z = !this.f4470h.isEmpty();
        boolean z2 = !this.f4472j.isEmpty();
        boolean z3 = !this.f4473k.isEmpty();
        boolean z4 = !this.f4471i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1119a0> it = this.f4470h.iterator();
            while (it.hasNext()) {
                RecyclerView.C1119a0 next = it.next();
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.f4479q.add(next);
                animate.setDuration(this.f4309d).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C1186h(view, animate, this, next)).start();
            }
            this.f4470h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4472j);
                this.f4475m.add(arrayList);
                this.f4472j.clear();
                C1180a aVar = new C1180a(arrayList);
                if (z) {
                    View view2 = ((C1184e) arrayList.get(0)).f4493a.itemView;
                    long j3 = this.f4309d;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15054n(view2, aVar, j3);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4473k);
                this.f4476n.add(arrayList2);
                this.f4473k.clear();
                C1181b bVar = new C1181b(arrayList2);
                if (z) {
                    View view3 = ((C1183d) arrayList2.get(0)).f4487a.itemView;
                    long j4 = this.f4309d;
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    C6333d0.C6337d.m15054n(view3, bVar, j4);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4471i);
                this.f4474l.add(arrayList3);
                this.f4471i.clear();
                C1182c cVar = new C1182c(arrayList3);
                if (z || z2 || z3) {
                    long j5 = 0;
                    if (z) {
                        j = this.f4309d;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.f4310e;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j5 = this.f4311f;
                    }
                    View view4 = ((RecyclerView.C1119a0) arrayList3.get(0)).itemView;
                    WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
                    C6333d0.C6337d.m15054n(view4, cVar, Math.max(j2, j5) + j);
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: j */
    public final void mo5058j(RecyclerView.C1119a0 a0Var) {
        mo5065r(a0Var);
        a0Var.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f4471i.add(a0Var);
    }

    /* renamed from: k */
    public final boolean mo5059k(RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2, int i, int i2, int i3, int i4) {
        if (a0Var == a0Var2) {
            return mo5060l(a0Var, i, i2, i3, i4);
        }
        float translationX = a0Var.itemView.getTranslationX();
        float translationY = a0Var.itemView.getTranslationY();
        float alpha = a0Var.itemView.getAlpha();
        mo5065r(a0Var);
        a0Var.itemView.setTranslationX(translationX);
        a0Var.itemView.setTranslationY(translationY);
        a0Var.itemView.setAlpha(alpha);
        mo5065r(a0Var2);
        a0Var2.itemView.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        a0Var2.itemView.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        a0Var2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f4473k.add(new C1183d(a0Var, a0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: l */
    public final boolean mo5060l(RecyclerView.C1119a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) a0Var.itemView.getTranslationY());
        mo5065r(a0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4774d(a0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f4472j.add(new C1184e(a0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: m */
    public final void mo5061m(RecyclerView.C1119a0 a0Var) {
        mo5065r(a0Var);
        this.f4470h.add(a0Var);
    }

    /* renamed from: o */
    public final void mo5062o() {
        if (!mo4778h()) {
            mo4775e();
        }
    }

    /* renamed from: p */
    public final void mo5063p(RecyclerView.C1119a0 a0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C1183d dVar = (C1183d) arrayList.get(size);
                if (mo5064q(dVar, a0Var) && dVar.f4487a == null && dVar.f4488b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final boolean mo5064q(C1183d dVar, RecyclerView.C1119a0 a0Var) {
        if (dVar.f4488b == a0Var) {
            dVar.f4488b = null;
        } else if (dVar.f4487a != a0Var) {
            return false;
        } else {
            dVar.f4487a = null;
        }
        a0Var.itemView.setAlpha(1.0f);
        a0Var.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        a0Var.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        mo4774d(a0Var);
        return true;
    }

    /* renamed from: r */
    public final void mo5065r(RecyclerView.C1119a0 a0Var) {
        if (f4469s == null) {
            f4469s = new ValueAnimator().getInterpolator();
        }
        a0Var.itemView.animate().setInterpolator(f4469s);
        mo4776f(a0Var);
    }
}
