package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0954o0;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.d */
public class C1323d extends C0954o0 {

    /* renamed from: androidx.transition.d$a */
    public class C1324a implements Transition.C1315d {

        /* renamed from: a */
        public final /* synthetic */ View f4999a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5000b;

        public C1324a(View view, ArrayList arrayList) {
            this.f4999a = view;
            this.f5000b = arrayList;
        }

        /* renamed from: a */
        public final void mo5374a() {
        }

        /* renamed from: b */
        public final void mo5375b() {
        }

        /* renamed from: c */
        public final void mo5376c() {
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            transition.mo5427w(this);
            this.f4999a.setVisibility(8);
            int size = this.f5000b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5000b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: e */
        public final void mo5432e() {
        }
    }

    /* renamed from: androidx.transition.d$b */
    public class C1325b extends Transition.C1314c {

        /* renamed from: a */
        public final /* synthetic */ Rect f5001a;

        public C1325b(Rect rect) {
            this.f5001a = rect;
        }

        /* renamed from: a */
        public final Rect mo5431a() {
            Rect rect = this.f5001a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5001a;
        }
    }

    /* renamed from: s */
    public static boolean m3605s(Transition transition) {
        if (!C0954o0.m2770h(transition.f4946f) || !C0954o0.m2770h((List) null) || !C0954o0.m2770h((List) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4117a(View view, Object obj) {
        ((Transition) obj).mo5412b(view);
    }

    /* renamed from: b */
    public final void mo4118b(Object obj, ArrayList<View> arrayList) {
        Transition transition;
        Transition transition2 = (Transition) obj;
        if (transition2 != null) {
            int i = 0;
            if (transition2 instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition2;
                int size = transitionSet.f4972z.size();
                while (i < size) {
                    if (i < 0 || i >= transitionSet.f4972z.size()) {
                        transition = null;
                    } else {
                        transition = transitionSet.f4972z.get(i);
                    }
                    mo4118b(transition, arrayList);
                    i++;
                }
            } else if (!m3605s(transition2) && C0954o0.m2770h(transition2.f4947g)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    transition2.mo5412b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo4119c(ViewGroup viewGroup, Object obj) {
        C1328g.m3633a(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public final boolean mo4120e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public final Object mo4121f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: i */
    public final Object mo4122i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.mo5433J(transition);
            transitionSet.mo5433J(transition2);
            transitionSet.mo5436M(1);
            transition = transitionSet;
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.mo5433J(transition);
        }
        transitionSet2.mo5433J(transition3);
        return transitionSet2;
    }

    /* renamed from: j */
    public final Object mo4123j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo5433J((Transition) obj);
        }
        transitionSet.mo5433J((Transition) obj2);
        return transitionSet;
    }

    /* renamed from: k */
    public final void mo4124k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo5411a(new C1324a(view, arrayList));
    }

    /* renamed from: l */
    public final void mo4125l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).mo5411a(new C1326e(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: m */
    public final void mo4126m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            C0954o0.m2769g(view, rect);
            ((Transition) obj).mo5404B(new C1322c(rect));
        }
    }

    /* renamed from: n */
    public final void mo4127n(Object obj, Rect rect) {
        ((Transition) obj).mo5404B(new C1325b(rect));
    }

    /* renamed from: p */
    public final void mo4129p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f4947g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0954o0.m2768d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo4118b(transitionSet, arrayList);
    }

    /* renamed from: q */
    public final void mo4130q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f4947g.clear();
            transitionSet.f4947g.addAll(arrayList2);
            mo5449t(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: r */
    public final Object mo4131r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo5433J((Transition) obj);
        return transitionSet;
    }

    /* renamed from: t */
    public final void mo5449t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition;
        Transition transition2 = (Transition) obj;
        int i2 = 0;
        if (transition2 instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition2;
            int size = transitionSet.f4972z.size();
            while (i2 < size) {
                if (i2 < 0 || i2 >= transitionSet.f4972z.size()) {
                    transition = null;
                } else {
                    transition = transitionSet.f4972z.get(i2);
                }
                mo5449t(transition, arrayList, arrayList2);
                i2++;
            }
        } else if (!m3605s(transition2)) {
            ArrayList<View> arrayList3 = transition2.f4947g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition2.mo5412b(arrayList2.get(i2));
                    i2++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        transition2.mo5428x(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
