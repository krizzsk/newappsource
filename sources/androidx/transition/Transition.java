package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import ci0.C21211f;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.InAppMessageBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import p001a0.C0016g;
import p116i1.C5256j;
import p241s0.C6302b;
import p241s0.C6305e;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7422a0;
import p330z2.C7424b0;
import p330z2.C7438n;
import p330z2.C7439o;
import p330z2.C7440p;
import p330z2.C7441q;
import p330z2.C7442r;
import p330z2.C7444t;
import p330z2.C7448v;
import p330z2.C7452z;
import p358af.C13437d;
import p389bl.C13637c;

public abstract class Transition implements Cloneable {

    /* renamed from: w */
    public static final int[] f4939w = {2, 1, 3, 4};

    /* renamed from: x */
    public static final C1312a f4940x = new C1312a();

    /* renamed from: y */
    public static ThreadLocal<C6302b<Animator, C1313b>> f4941y = new ThreadLocal<>();

    /* renamed from: b */
    public String f4942b = getClass().getName();

    /* renamed from: c */
    public long f4943c = -1;

    /* renamed from: d */
    public long f4944d = -1;

    /* renamed from: e */
    public TimeInterpolator f4945e = null;

    /* renamed from: f */
    public ArrayList<Integer> f4946f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f4947g = new ArrayList<>();

    /* renamed from: h */
    public C7442r f4948h = new C7442r();

    /* renamed from: i */
    public C7442r f4949i = new C7442r();

    /* renamed from: j */
    public TransitionSet f4950j = null;

    /* renamed from: k */
    public int[] f4951k = f4939w;

    /* renamed from: l */
    public ArrayList<C7441q> f4952l;

    /* renamed from: m */
    public ArrayList<C7441q> f4953m;

    /* renamed from: n */
    public ArrayList<Animator> f4954n = new ArrayList<>();

    /* renamed from: o */
    public int f4955o = 0;

    /* renamed from: p */
    public boolean f4956p = false;

    /* renamed from: q */
    public boolean f4957q = false;

    /* renamed from: r */
    public ArrayList<C1315d> f4958r = null;

    /* renamed from: s */
    public ArrayList<Animator> f4959s = new ArrayList<>();

    /* renamed from: t */
    public C21211f f4960t;

    /* renamed from: u */
    public C1314c f4961u;

    /* renamed from: v */
    public PathMotion f4962v = f4940x;

    /* renamed from: androidx.transition.Transition$a */
    public static class C1312a extends PathMotion {
        /* renamed from: a */
        public final Path mo5353a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    public static class C1313b {

        /* renamed from: a */
        public View f4963a;

        /* renamed from: b */
        public String f4964b;

        /* renamed from: c */
        public C7441q f4965c;

        /* renamed from: d */
        public C7424b0 f4966d;

        /* renamed from: e */
        public Transition f4967e;

        public C1313b(View view, String str, Transition transition, C7422a0 a0Var, C7441q qVar) {
            this.f4963a = view;
            this.f4964b = str;
            this.f4965c = qVar;
            this.f4966d = a0Var;
            this.f4967e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    public static abstract class C1314c {
        /* renamed from: a */
        public abstract Rect mo5431a();
    }

    /* renamed from: androidx.transition.Transition$d */
    public interface C1315d {
        /* renamed from: a */
        void mo5374a();

        /* renamed from: b */
        void mo5375b();

        /* renamed from: c */
        void mo5376c();

        /* renamed from: d */
        void mo5377d(Transition transition);

        /* renamed from: e */
        void mo5432e();
    }

    public Transition() {
    }

    /* renamed from: c */
    public static void m3522c(C7442r rVar, View view, C7441q qVar) {
        ((C6302b) rVar.f22858b).put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) rVar.f22860d).indexOfKey(id) >= 0) {
                ((SparseArray) rVar.f22860d).put(id, (Object) null);
            } else {
                ((SparseArray) rVar.f22860d).put(id, view);
            }
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        String k = C6333d0.C6342i.m15094k(view);
        if (k != null) {
            if (((C6302b) rVar.f22859c).containsKey(k)) {
                ((C6302b) rVar.f22859c).put(k, null);
            } else {
                ((C6302b) rVar.f22859c).put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C6305e eVar = (C6305e) rVar.f22861e;
                if (eVar.f19944b) {
                    eVar.mo22328h();
                }
                if (C13637c.m34068g(eVar.f19945c, eVar.f19947e, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((C6305e) rVar.f22861e).mo22329i(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        C6333d0.C6337d.m15058r(view2, false);
                        ((C6305e) rVar.f22861e).mo22331k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C6333d0.C6337d.m15058r(view, true);
                ((C6305e) rVar.f22861e).mo22331k(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: p */
    public static C6302b<Animator, C1313b> m3523p() {
        C6302b<Animator, C1313b> bVar = f4941y.get();
        if (bVar != null) {
            return bVar;
        }
        C6302b<Animator, C1313b> bVar2 = new C6302b<>();
        f4941y.set(bVar2);
        return bVar2;
    }

    /* renamed from: u */
    public static boolean m3524u(C7441q qVar, C7441q qVar2, String str) {
        Object obj = qVar.f22854a.get(str);
        Object obj2 = qVar2.f22854a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo5403A(long j) {
        this.f4944d = j;
    }

    /* renamed from: B */
    public void mo5404B(C1314c cVar) {
        this.f4961u = cVar;
    }

    /* renamed from: D */
    public void mo5405D(TimeInterpolator timeInterpolator) {
        this.f4945e = timeInterpolator;
    }

    /* renamed from: E */
    public void mo5406E(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f4962v = f4940x;
        } else {
            this.f4962v = pathMotion;
        }
    }

    /* renamed from: F */
    public void mo5407F(C21211f fVar) {
        this.f4960t = fVar;
    }

    /* renamed from: G */
    public void mo5408G(long j) {
        this.f4943c = j;
    }

    /* renamed from: H */
    public final void mo5409H() {
        if (this.f4955o == 0) {
            ArrayList<C1315d> arrayList = this.f4958r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4958r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1315d) arrayList2.get(i)).mo5432e();
                }
            }
            this.f4957q = false;
        }
        this.f4955o++;
    }

    /* renamed from: I */
    public String mo5410I(String str) {
        StringBuilder k = C13555b.m33972k(str);
        k.append(getClass().getSimpleName());
        k.append("@");
        k.append(Integer.toHexString(hashCode()));
        k.append(": ");
        String sb = k.toString();
        if (this.f4944d != -1) {
            sb = C25541a.m63884o(C0016g.m36t(sb, "dur("), this.f4944d, ") ");
        }
        if (this.f4943c != -1) {
            sb = C25541a.m63884o(C0016g.m36t(sb, "dly("), this.f4943c, ") ");
        }
        if (this.f4945e != null) {
            StringBuilder t = C0016g.m36t(sb, "interp(");
            t.append(this.f4945e);
            t.append(") ");
            sb = t.toString();
        }
        if (this.f4946f.size() <= 0 && this.f4947g.size() <= 0) {
            return sb;
        }
        String k2 = C25541a.m63881k(sb, "tgts(");
        if (this.f4946f.size() > 0) {
            for (int i = 0; i < this.f4946f.size(); i++) {
                if (i > 0) {
                    k2 = C25541a.m63881k(k2, ", ");
                }
                StringBuilder k3 = C13555b.m33972k(k2);
                k3.append(this.f4946f.get(i));
                k2 = k3.toString();
            }
        }
        if (this.f4947g.size() > 0) {
            for (int i2 = 0; i2 < this.f4947g.size(); i2++) {
                if (i2 > 0) {
                    k2 = C25541a.m63881k(k2, ", ");
                }
                StringBuilder k4 = C13555b.m33972k(k2);
                k4.append(this.f4947g.get(i2));
                k2 = k4.toString();
            }
        }
        return C25541a.m63881k(k2, ")");
    }

    /* renamed from: a */
    public void mo5411a(C1315d dVar) {
        if (this.f4958r == null) {
            this.f4958r = new ArrayList<>();
        }
        this.f4958r.add(dVar);
    }

    /* renamed from: b */
    public void mo5412b(View view) {
        this.f4947g.add(view);
    }

    /* renamed from: d */
    public abstract void mo5356d(C7441q qVar);

    /* renamed from: e */
    public final void mo5414e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C7441q qVar = new C7441q(view);
                if (z) {
                    mo5357g(qVar);
                } else {
                    mo5356d(qVar);
                }
                qVar.f22856c.add(this);
                mo5415f(qVar);
                if (z) {
                    m3522c(this.f4948h, view, qVar);
                } else {
                    m3522c(this.f4949i, view, qVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    mo5414e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo5415f(C7441q qVar) {
        if (this.f4960t != null && !qVar.f22854a.isEmpty()) {
            this.f4960t.mo23708n();
            String[] strArr = C7452z.f22874b;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = true;
                    break;
                } else if (!qVar.f22854a.containsKey(strArr[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f4960t.mo23707f(qVar);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo5357g(C7441q qVar);

    /* renamed from: h */
    public final void mo5416h(ViewGroup viewGroup, boolean z) {
        mo5417i(z);
        if (this.f4946f.size() > 0 || this.f4947g.size() > 0) {
            for (int i = 0; i < this.f4946f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f4946f.get(i).intValue());
                if (findViewById != null) {
                    C7441q qVar = new C7441q(findViewById);
                    if (z) {
                        mo5357g(qVar);
                    } else {
                        mo5356d(qVar);
                    }
                    qVar.f22856c.add(this);
                    mo5415f(qVar);
                    if (z) {
                        m3522c(this.f4948h, findViewById, qVar);
                    } else {
                        m3522c(this.f4949i, findViewById, qVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f4947g.size(); i2++) {
                View view = this.f4947g.get(i2);
                C7441q qVar2 = new C7441q(view);
                if (z) {
                    mo5357g(qVar2);
                } else {
                    mo5356d(qVar2);
                }
                qVar2.f22856c.add(this);
                mo5415f(qVar2);
                if (z) {
                    m3522c(this.f4948h, view, qVar2);
                } else {
                    m3522c(this.f4949i, view, qVar2);
                }
            }
            return;
        }
        mo5414e(viewGroup, z);
    }

    /* renamed from: i */
    public final void mo5417i(boolean z) {
        if (z) {
            ((C6302b) this.f4948h.f22858b).clear();
            ((SparseArray) this.f4948h.f22860d).clear();
            ((C6305e) this.f4948h.f22861e).mo22326f();
            return;
        }
        ((C6302b) this.f4949i.f22858b).clear();
        ((SparseArray) this.f4949i.f22860d).clear();
        ((C6305e) this.f4949i.f22861e).mo22326f();
    }

    /* renamed from: j */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f4959s = new ArrayList<>();
            transition.f4948h = new C7442r();
            transition.f4949i = new C7442r();
            transition.f4952l = null;
            transition.f4953m = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public Animator mo5358k(ViewGroup viewGroup, C7441q qVar, C7441q qVar2) {
        return null;
    }

    /* renamed from: l */
    public void mo5419l(ViewGroup viewGroup, C7442r rVar, C7442r rVar2, ArrayList<C7441q> arrayList, ArrayList<C7441q> arrayList2) {
        int i;
        boolean z;
        Animator k;
        View view;
        Animator animator;
        C7441q qVar;
        C7441q qVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C6302b<Animator, C1313b> p = m3523p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C7441q qVar3 = arrayList.get(i2);
            C7441q qVar4 = arrayList2.get(i2);
            if (qVar3 != null && !qVar3.f22856c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f22856c.contains(this)) {
                qVar4 = null;
            }
            if (!(qVar3 == null && qVar4 == null)) {
                if (qVar3 == null || qVar4 == null || mo5423s(qVar3, qVar4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (k = mo5358k(viewGroup2, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        view = qVar4.f22855b;
                        String[] q = mo5359q();
                        if (q != null && q.length > 0) {
                            C7441q qVar5 = new C7441q(view);
                            Animator animator3 = k;
                            i = size;
                            C7441q qVar6 = (C7441q) ((C6302b) rVar2.f22858b).getOrDefault(view, null);
                            if (qVar6 != null) {
                                int i3 = 0;
                                while (i3 < q.length) {
                                    HashMap hashMap = qVar5.f22854a;
                                    String str = q[i3];
                                    hashMap.put(str, qVar6.f22854a.get(str));
                                    i3++;
                                    ArrayList<C7441q> arrayList3 = arrayList2;
                                    q = q;
                                }
                            }
                            int i4 = p.f19969d;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    qVar2 = qVar5;
                                    animator2 = animator3;
                                    break;
                                }
                                C1313b orDefault = p.getOrDefault(p.mo22416h(i5), null);
                                if (orDefault.f4965c != null && orDefault.f4963a == view && orDefault.f4964b.equals(this.f4942b) && orDefault.f4965c.equals(qVar5)) {
                                    qVar2 = qVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = k;
                            qVar2 = null;
                        }
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        i = size;
                        view = qVar3.f22855b;
                        animator = k;
                        qVar = null;
                    }
                    if (animator != null) {
                        C21211f fVar = this.f4960t;
                        if (fVar != null) {
                            long q2 = fVar.mo23645q(viewGroup2, this, qVar3, qVar4);
                            sparseIntArray.put(this.f4959s.size(), (int) q2);
                            j = Math.min(q2, j);
                        }
                        long j2 = j;
                        String str2 = this.f4942b;
                        C7448v vVar = C7444t.f22865a;
                        p.put(animator, new C1313b(view, str2, this, new C7422a0(viewGroup2), qVar));
                        this.f4959s.add(animator);
                        j = j2;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f4959s.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - j));
            }
        }
    }

    /* renamed from: m */
    public final void mo5420m() {
        int i = this.f4955o - 1;
        this.f4955o = i;
        if (i == 0) {
            ArrayList<C1315d> arrayList = this.f4958r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4958r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1315d) arrayList2.get(i2)).mo5377d(this);
                }
            }
            for (int i3 = 0; i3 < ((C6305e) this.f4948h.f22861e).mo22333m(); i3++) {
                View view = (View) ((C6305e) this.f4948h.f22861e).mo22334o(i3);
                if (view != null) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15058r(view, false);
                }
            }
            for (int i4 = 0; i4 < ((C6305e) this.f4949i.f22861e).mo22333m(); i4++) {
                View view2 = (View) ((C6305e) this.f4949i.f22861e).mo22334o(i4);
                if (view2 != null) {
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    C6333d0.C6337d.m15058r(view2, false);
                }
            }
            this.f4957q = true;
        }
    }

    /* renamed from: o */
    public final C7441q mo5421o(View view, boolean z) {
        ArrayList<C7441q> arrayList;
        ArrayList<C7441q> arrayList2;
        TransitionSet transitionSet = this.f4950j;
        if (transitionSet != null) {
            return transitionSet.mo5421o(view, z);
        }
        if (z) {
            arrayList = this.f4952l;
        } else {
            arrayList = this.f4953m;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C7441q qVar = arrayList.get(i2);
            if (qVar == null) {
                return null;
            }
            if (qVar.f22855b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f4953m;
        } else {
            arrayList2 = this.f4952l;
        }
        return arrayList2.get(i);
    }

    /* renamed from: q */
    public String[] mo5359q() {
        return null;
    }

    /* renamed from: r */
    public final C7441q mo5422r(View view, boolean z) {
        C7442r rVar;
        TransitionSet transitionSet = this.f4950j;
        if (transitionSet != null) {
            return transitionSet.mo5422r(view, z);
        }
        if (z) {
            rVar = this.f4948h;
        } else {
            rVar = this.f4949i;
        }
        return (C7441q) ((C6302b) rVar.f22858b).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo5423s(C7441q qVar, C7441q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] q = mo5359q();
        if (q != null) {
            int length = q.length;
            int i = 0;
            while (i < length) {
                if (!m3524u(qVar, qVar2, q[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String u : qVar.f22854a.keySet()) {
            if (m3524u(qVar, qVar2, u)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    public final boolean mo5424t(View view) {
        int id = view.getId();
        if ((this.f4946f.size() != 0 || this.f4947g.size() != 0) && !this.f4946f.contains(Integer.valueOf(id)) && !this.f4947g.contains(view)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return mo5410I("");
    }

    /* renamed from: v */
    public void mo5426v(View view) {
        int i;
        if (!this.f4957q) {
            C6302b<Animator, C1313b> p = m3523p();
            int i2 = p.f19969d;
            C7448v vVar = C7444t.f22865a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C1313b l = p.mo22422l(i3);
                if (l.f4963a != null) {
                    C7424b0 b0Var = l.f4966d;
                    if ((b0Var instanceof C7422a0) && ((C7422a0) b0Var).f22818a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        p.mo22416h(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<C1315d> arrayList = this.f4958r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4958r.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((C1315d) arrayList2.get(i)).mo5374a();
                    i++;
                }
            }
            this.f4956p = true;
        }
    }

    /* renamed from: w */
    public void mo5427w(C1315d dVar) {
        ArrayList<C1315d> arrayList = this.f4958r;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.f4958r.size() == 0) {
                this.f4958r = null;
            }
        }
    }

    /* renamed from: x */
    public void mo5428x(View view) {
        this.f4947g.remove(view);
    }

    /* renamed from: y */
    public void mo5429y(ViewGroup viewGroup) {
        boolean z;
        if (this.f4956p) {
            if (!this.f4957q) {
                C6302b<Animator, C1313b> p = m3523p();
                int i = p.f19969d;
                C7448v vVar = C7444t.f22865a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C1313b l = p.mo22422l(i2);
                    if (l.f4963a != null) {
                        C7424b0 b0Var = l.f4966d;
                        if (!(b0Var instanceof C7422a0) || !((C7422a0) b0Var).f22818a.equals(windowId)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            p.mo22416h(i2).resume();
                        }
                    }
                }
                ArrayList<C1315d> arrayList = this.f4958r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4958r.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C1315d) arrayList2.get(i3)).mo5376c();
                    }
                }
            }
            this.f4956p = false;
        }
    }

    /* renamed from: z */
    public void mo5430z() {
        mo5409H();
        C6302b<Animator, C1313b> p = m3523p();
        Iterator<Animator> it = this.f4959s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p.containsKey(next)) {
                mo5409H();
                if (next != null) {
                    next.addListener(new C7439o(this, p));
                    long j = this.f4944d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f4943c;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f4945e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C7440p(this));
                    next.start();
                }
            }
        }
        this.f4959s.clear();
        mo5420m();
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        int i;
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22842a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long c = (long) C5256j.m13275c(obtainStyledAttributes, xmlResourceParser, InAppMessageBase.DURATION, 1, -1);
        if (c >= 0) {
            mo5403A(c);
        }
        long c2 = (long) C5256j.m13275c(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (c2 > 0) {
            mo5408G(c2);
        }
        if (!C5256j.m13277e(xmlResourceParser, "interpolator")) {
            i = 0;
        } else {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i > 0) {
            mo5405D(AnimationUtils.loadInterpolator(context, i));
        }
        String d = C5256j.m13276d(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (d != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(d, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i2] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i2] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr[i2] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i2] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr2 = new int[(iArr.length - 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    i2--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(C13437d.m33706k("Unknown match type in matchOrder: '", trim, "'"));
                }
                i2++;
            }
            if (iArr.length == 0) {
                this.f4951k = f4939w;
            } else {
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4 = iArr[i3];
                    if (i4 >= 1 && i4 <= 4) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i3) {
                                z = false;
                                break;
                            } else if (iArr[i5] == i4) {
                                z = true;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (!z) {
                            i3++;
                        } else {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.f4951k = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
