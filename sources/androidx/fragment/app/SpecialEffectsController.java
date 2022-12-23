package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p001a0.C0016g;
import p056d2.C4335b;
import p177n1.C5802d;
import p242s1.C6333d0;
import p242s1.C6382p0;

public abstract class SpecialEffectsController {

    /* renamed from: a */
    public final ViewGroup f3687a;

    /* renamed from: b */
    public final ArrayList<Operation> f3688b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<Operation> f3689c = new ArrayList<>();

    /* renamed from: d */
    public boolean f3690d = false;

    /* renamed from: e */
    public boolean f3691e = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class C0905a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C0908d f3700b;

        public C0905a(C0908d dVar) {
            this.f3700b = dVar;
        }

        public final void run() {
            if (SpecialEffectsController.this.f3688b.contains(this.f3700b)) {
                C0908d dVar = this.f3700b;
                dVar.f3692a.applyState(dVar.f3694c.mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class C0906b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C0908d f3702b;

        public C0906b(C0908d dVar) {
            this.f3702b = dVar;
        }

        public final void run() {
            SpecialEffectsController.this.f3688b.remove(this.f3702b);
            SpecialEffectsController.this.f3689c.remove(this.f3702b);
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C0907c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3704a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3705b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3705b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3705b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3705b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3704a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3704a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3704a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3704a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C0907c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C0908d extends Operation {

        /* renamed from: h */
        public final C0923e0 f3706h;

        public C0908d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0923e0 e0Var, C5802d dVar) {
            super(state, lifecycleImpact, e0Var.f3743c, dVar);
            this.f3706h = e0Var;
        }

        /* renamed from: b */
        public final void mo4032b() {
            super.mo4032b();
            this.f3706h.mo4086j();
        }

        /* renamed from: d */
        public final void mo4034d() {
            Operation.LifecycleImpact lifecycleImpact = this.f3693b;
            if (lifecycleImpact == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.f3706h.f3743c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.m2590J(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View requireView = this.f3694c.requireView();
                if (requireView.getParent() == null) {
                    this.f3706h.mo4077a();
                    requireView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
                if (requireView.getAlpha() == BitmapDescriptorFactory.HUE_RED && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            } else if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.f3706h.f3743c;
                View requireView2 = fragment2.requireView();
                if (FragmentManager.m2590J(2)) {
                    Objects.toString(requireView2.findFocus());
                    requireView2.toString();
                    fragment2.toString();
                }
                requireView2.clearFocus();
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f3687a = viewGroup;
    }

    /* renamed from: f */
    public static SpecialEffectsController m2672f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m2673g(viewGroup, fragmentManager.mo3931I());
    }

    /* renamed from: g */
    public static SpecialEffectsController m2673g(ViewGroup viewGroup, C0966s0 s0Var) {
        int i = C4335b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        ((FragmentManager.C0889e) s0Var).getClass();
        C0911b bVar = new C0911b(viewGroup);
        viewGroup.setTag(i, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final void mo4024a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0923e0 e0Var) {
        synchronized (this.f3688b) {
            C5802d dVar = new C5802d();
            Operation d = mo4027d(e0Var.f3743c);
            if (d != null) {
                d.mo4033c(state, lifecycleImpact);
                return;
            }
            C0908d dVar2 = new C0908d(state, lifecycleImpact, e0Var, dVar);
            this.f3688b.add(dVar2);
            dVar2.f3695d.add(new C0905a(dVar2));
            dVar2.f3695d.add(new C0906b(dVar2));
        }
    }

    /* renamed from: b */
    public abstract void mo4025b(ArrayList arrayList, boolean z);

    /* renamed from: c */
    public final void mo4026c() {
        if (!this.f3691e) {
            ViewGroup viewGroup = this.f3687a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!C6333d0.C6340g.m15075b(viewGroup)) {
                mo4028e();
                this.f3690d = false;
                return;
            }
            synchronized (this.f3688b) {
                if (!this.f3688b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3689c);
                    this.f3689c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.m2590J(2)) {
                            Objects.toString(operation);
                        }
                        operation.mo4031a();
                        if (!operation.f3698g) {
                            this.f3689c.add(operation);
                        }
                    }
                    mo4030i();
                    ArrayList arrayList2 = new ArrayList(this.f3688b);
                    this.f3688b.clear();
                    this.f3689c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).mo4034d();
                    }
                    mo4025b(arrayList2, this.f3690d);
                    this.f3690d = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final Operation mo4027d(Fragment fragment) {
        Iterator<Operation> it = this.f3688b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f3694c.equals(fragment) && !next.f3697f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo4028e() {
        ViewGroup viewGroup = this.f3687a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean b = C6333d0.C6340g.m15075b(viewGroup);
        synchronized (this.f3688b) {
            mo4030i();
            Iterator<Operation> it = this.f3688b.iterator();
            while (it.hasNext()) {
                it.next().mo4034d();
            }
            Iterator it2 = new ArrayList(this.f3689c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.m2590J(2)) {
                    if (!b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f3687a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(operation);
                }
                operation.mo4031a();
            }
            Iterator it3 = new ArrayList(this.f3688b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.m2590J(2)) {
                    if (!b) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f3687a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(operation2);
                }
                operation2.mo4031a();
            }
        }
    }

    /* renamed from: h */
    public final void mo4029h() {
        synchronized (this.f3688b) {
            mo4030i();
            this.f3691e = false;
            int size = this.f3688b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f3688b.get(size);
                Operation.State from = Operation.State.from(operation.f3694c.mView);
                Operation.State state = operation.f3692a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && from != state2) {
                    this.f3691e = operation.f3694c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void mo4030i() {
        Iterator<Operation> it = this.f3688b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f3693b == Operation.LifecycleImpact.ADDING) {
                next.mo4033c(Operation.State.from(next.f3694c.requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public static class Operation {

        /* renamed from: a */
        public State f3692a;

        /* renamed from: b */
        public LifecycleImpact f3693b;

        /* renamed from: c */
        public final Fragment f3694c;

        /* renamed from: d */
        public final ArrayList f3695d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C5802d> f3696e = new HashSet<>();

        /* renamed from: f */
        public boolean f3697f = false;

        /* renamed from: g */
        public boolean f3698g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C0904a implements C5802d.C5803a {
            public C0904a() {
            }

            public final void onCancel() {
                Operation.this.mo4031a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, C5802d dVar) {
            this.f3692a = state;
            this.f3693b = lifecycleImpact;
            this.f3694c = fragment;
            dVar.mo21672b(new C0904a());
        }

        /* renamed from: a */
        public final void mo4031a() {
            if (!this.f3697f) {
                this.f3697f = true;
                if (this.f3696e.isEmpty()) {
                    mo4032b();
                    return;
                }
                Iterator it = new ArrayList(this.f3696e).iterator();
                while (it.hasNext()) {
                    ((C5802d) it.next()).mo21671a();
                }
            }
        }

        /* renamed from: b */
        public void mo4032b() {
            if (!this.f3698g) {
                if (FragmentManager.m2590J(2)) {
                    toString();
                }
                this.f3698g = true;
                Iterator it = this.f3695d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        /* renamed from: c */
        public final void mo4033c(State state, LifecycleImpact lifecycleImpact) {
            int i = C0907c.f3705b[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(this.f3694c);
                        Objects.toString(this.f3692a);
                        Objects.toString(this.f3693b);
                    }
                    this.f3692a = State.REMOVED;
                    this.f3693b = LifecycleImpact.REMOVING;
                } else if (i == 3 && this.f3692a != State.REMOVED) {
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(this.f3694c);
                        Objects.toString(this.f3692a);
                        Objects.toString(state);
                    }
                    this.f3692a = state;
                }
            } else if (this.f3692a == State.REMOVED) {
                if (FragmentManager.m2590J(2)) {
                    Objects.toString(this.f3694c);
                    Objects.toString(this.f3693b);
                }
                this.f3692a = State.VISIBLE;
                this.f3693b = LifecycleImpact.ADDING;
            }
        }

        /* renamed from: d */
        public void mo4034d() {
        }

        public final String toString() {
            StringBuilder t = C0016g.m36t("Operation ", "{");
            t.append(Integer.toHexString(System.identityHashCode(this)));
            t.append("} ");
            t.append("{");
            t.append("mFinalState = ");
            t.append(this.f3692a);
            t.append("} ");
            t.append("{");
            t.append("mLifecycleImpact = ");
            t.append(this.f3693b);
            t.append("} ");
            t.append("{");
            t.append("mFragment = ");
            t.append(this.f3694c);
            t.append("}");
            return t.toString();
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State from(View view) {
                if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            public void applyState(View view) {
                int i = C0907c.f3704a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2590J(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }

            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(C16759e.m42349e("Unknown visibility ", i));
            }
        }
    }
}
