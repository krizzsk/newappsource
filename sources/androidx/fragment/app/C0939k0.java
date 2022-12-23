package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.k0 */
public final class C0939k0 extends C0954o0 {

    /* renamed from: androidx.fragment.app.k0$a */
    public class C0940a implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f3806a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3807b;

        public C0940a(View view, ArrayList arrayList) {
            this.f3806a = view;
            this.f3807b = arrayList;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3806a.setVisibility(8);
            int size = this.f3807b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3807b.get(i)).setVisibility(0);
            }
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.k0$b */
    public class C0941b extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f3808a;

        public C0941b(Rect rect) {
            this.f3808a = rect;
        }

        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3808a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3808a;
        }
    }

    /* renamed from: s */
    public static boolean m2747s(Transition transition) {
        if (!C0954o0.m2770h(transition.getTargetIds()) || !C0954o0.m2770h(transition.getTargetNames()) || !C0954o0.m2770h(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4117a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    /* renamed from: b */
    public final void mo4118b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4118b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2747s(transition) && C0954o0.m2770h(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo4119c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
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
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: j */
    public final Object mo4123j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    /* renamed from: k */
    public final void mo4124k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0940a(view, arrayList));
    }

    /* renamed from: l */
    public final void mo4125l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0948l0(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: m */
    public final void mo4126m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            C0954o0.m2769g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0937j0(rect));
        }
    }

    /* renamed from: n */
    public final void mo4127n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C0941b(rect));
    }

    /* renamed from: o */
    public final void mo4128o(Object obj, C0938k kVar) {
        ((Transition) obj).addListener(new C0950m0(kVar));
    }

    /* renamed from: p */
    public final void mo4129p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0954o0.m2768d(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo4118b(transitionSet, arrayList);
    }

    /* renamed from: q */
    public final void mo4130q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4132t(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: r */
    public final Object mo4131r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: t */
    public final void mo4132t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo4132t(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m2747s(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    transition.removeTarget(arrayList.get(size));
                } else {
                    return;
                }
            }
        }
    }
}
