package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0955p;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import p056d2.C4334a;
import p056d2.C4335b;
import p177n1.C5802d;
import p241s0.C6302b;
import p241s0.C6307g;
import p242s1.C6333d0;
import p242s1.C6369j0;
import p242s1.C6382p0;

/* renamed from: androidx.fragment.app.b */
public final class C0911b extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.b$a */
    public static /* synthetic */ class C0912a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3710a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3710a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3710a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3710a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0911b.C0912a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    public static class C0913b extends C0914c {

        /* renamed from: c */
        public boolean f3711c;

        /* renamed from: d */
        public boolean f3712d = false;

        /* renamed from: e */
        public C0955p.C0956a f3713e;

        public C0913b(SpecialEffectsController.Operation operation, C5802d dVar, boolean z) {
            super(operation, dVar);
            this.f3711c = z;
        }

        /* renamed from: c */
        public final C0955p.C0956a mo4053c(Context context) {
            boolean z;
            int i;
            int i2;
            if (this.f3712d) {
                return this.f3713e;
            }
            SpecialEffectsController.Operation operation = this.f3714a;
            Fragment fragment = operation.f3694c;
            boolean z2 = false;
            if (operation.f3692a == SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = this.f3711c;
            int nextTransition = fragment.getNextTransition();
            if (z3) {
                if (z) {
                    i = fragment.getPopEnterAnim();
                } else {
                    i = fragment.getPopExitAnim();
                }
            } else if (z) {
                i = fragment.getEnterAnim();
            } else {
                i = fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            C0955p.C0956a aVar = null;
            if (viewGroup != null) {
                int i3 = C4335b.visible_removing_fragment_view_tag;
                if (viewGroup.getTag(i3) != null) {
                    fragment.mContainer.setTag(i3, (Object) null);
                }
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, i);
                if (onCreateAnimation != null) {
                    aVar = new C0955p.C0956a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, i);
                    if (onCreateAnimator != null) {
                        aVar = new C0955p.C0956a(onCreateAnimator);
                    } else {
                        if (i == 0 && nextTransition != 0) {
                            if (nextTransition != 4097) {
                                if (nextTransition != 8194) {
                                    if (nextTransition != 8197) {
                                        if (nextTransition != 4099) {
                                            if (nextTransition != 4100) {
                                                i = -1;
                                            } else if (z) {
                                                i2 = C0955p.m2786a(16842936, context);
                                            } else {
                                                i2 = C0955p.m2786a(16842937, context);
                                            }
                                        } else if (z) {
                                            i2 = C4334a.fragment_fade_enter;
                                        } else {
                                            i2 = C4334a.fragment_fade_exit;
                                        }
                                    } else if (z) {
                                        i2 = C0955p.m2786a(16842938, context);
                                    } else {
                                        i2 = C0955p.m2786a(16842939, context);
                                    }
                                } else if (z) {
                                    i2 = C4334a.fragment_close_enter;
                                } else {
                                    i2 = C4334a.fragment_close_exit;
                                }
                            } else if (z) {
                                i2 = C4334a.fragment_open_enter;
                            } else {
                                i2 = C4334a.fragment_open_exit;
                            }
                            i = i2;
                        }
                        if (i != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                                    if (loadAnimation != null) {
                                        aVar = new C0955p.C0956a(loadAnimation);
                                    } else {
                                        z2 = true;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z2) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                                    if (loadAnimator != null) {
                                        aVar = new C0955p.C0956a(loadAnimator);
                                    }
                                } catch (RuntimeException e2) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                                        if (loadAnimation2 != null) {
                                            aVar = new C0955p.C0956a(loadAnimation2);
                                        }
                                    } else {
                                        throw e2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f3713e = aVar;
            this.f3712d = true;
            return aVar;
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    public static class C0914c {

        /* renamed from: a */
        public final SpecialEffectsController.Operation f3714a;

        /* renamed from: b */
        public final C5802d f3715b;

        public C0914c(SpecialEffectsController.Operation operation, C5802d dVar) {
            this.f3714a = operation;
            this.f3715b = dVar;
        }

        /* renamed from: a */
        public final void mo4054a() {
            SpecialEffectsController.Operation operation = this.f3714a;
            if (operation.f3696e.remove(this.f3715b) && operation.f3696e.isEmpty()) {
                operation.mo4032b();
            }
        }

        /* renamed from: b */
        public final boolean mo4055b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.f3714a.f3694c.mView);
            SpecialEffectsController.Operation.State state2 = this.f3714a.f3692a;
            if (from == state2 || (from != (state = SpecialEffectsController.Operation.State.VISIBLE) && state2 != state)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    public static class C0915d extends C0914c {

        /* renamed from: c */
        public final Object f3716c;

        /* renamed from: d */
        public final boolean f3717d;

        /* renamed from: e */
        public final Object f3718e;

        public C0915d(SpecialEffectsController.Operation operation, C5802d dVar, boolean z, boolean z2) {
            super(operation, dVar);
            Object obj;
            Object obj2;
            boolean z3;
            if (operation.f3692a == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    obj2 = operation.f3694c.getReenterTransition();
                } else {
                    obj2 = operation.f3694c.getEnterTransition();
                }
                this.f3716c = obj2;
                if (z) {
                    z3 = operation.f3694c.getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.f3694c.getAllowEnterTransitionOverlap();
                }
                this.f3717d = z3;
            } else {
                if (z) {
                    obj = operation.f3694c.getReturnTransition();
                } else {
                    obj = operation.f3694c.getExitTransition();
                }
                this.f3716c = obj;
                this.f3717d = true;
            }
            if (!z2) {
                this.f3718e = null;
            } else if (z) {
                this.f3718e = operation.f3694c.getSharedElementReturnTransition();
            } else {
                this.f3718e = operation.f3694c.getSharedElementEnterTransition();
            }
        }

        /* renamed from: c */
        public final C0954o0 mo4056c(Object obj) {
            if (obj == null) {
                return null;
            }
            C0939k0 k0Var = C0935i0.f3800a;
            if (k0Var != null && (obj instanceof Transition)) {
                return k0Var;
            }
            C0954o0 o0Var = C0935i0.f3801b;
            if (o0Var != null && o0Var.mo4120e(obj)) {
                return o0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3714a.f3694c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C0911b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: j */
    public static void m2700j(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C6369j0.m15181b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        m2700j(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: k */
    public static void m2701k(View view, C6302b bVar) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        String k = C6333d0.C6342i.m15094k(view);
        if (k != null) {
            bVar.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m2701k(childAt, bVar);
                }
            }
        }
    }

    /* renamed from: l */
    public static void m2702l(C6302b bVar, Collection collection) {
        Iterator it = ((C6307g.C6309b) bVar.entrySet()).iterator();
        while (true) {
            C6307g.C6311d dVar = (C6307g.C6311d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!collection.contains(C6333d0.C6342i.m15094k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:217:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x07b8 A[LOOP:20: B:266:0x07b2->B:268:0x07b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4025b(java.util.ArrayList r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            java.util.Iterator r3 = r34.iterator()
            r4 = 0
            r5 = 0
        L_0x000c:
            boolean r6 = r3.hasNext()
            r7 = 4
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0045
            java.lang.Object r6 = r3.next()
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6
            androidx.fragment.app.Fragment r10 = r6.f3694c
            android.view.View r10 = r10.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r10)
            int[] r11 = androidx.fragment.app.C0911b.C0912a.f3710a
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r6.f3692a
            int r12 = r12.ordinal()
            r11 = r11[r12]
            if (r11 == r9) goto L_0x003d
            if (r11 == r8) goto L_0x003d
            r8 = 3
            if (r11 == r8) goto L_0x003d
            if (r11 == r7) goto L_0x0037
            goto L_0x000c
        L_0x0037:
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r10 == r7) goto L_0x000c
            r5 = r6
            goto L_0x000c
        L_0x003d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r10 != r7) goto L_0x000c
            if (r4 != 0) goto L_0x000c
            r4 = r6
            goto L_0x000c
        L_0x0045:
            boolean r3 = androidx.fragment.app.FragmentManager.m2590J(r8)
            if (r3 == 0) goto L_0x0051
            java.util.Objects.toString(r4)
            java.util.Objects.toString(r5)
        L_0x0051:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            int r8 = r34.size()
            int r8 = r8 + -1
            java.lang.Object r8 = r1.get(r8)
            androidx.fragment.app.SpecialEffectsController$Operation r8 = (androidx.fragment.app.SpecialEffectsController.Operation) r8
            androidx.fragment.app.Fragment r8 = r8.f3694c
            java.util.Iterator r9 = r34.iterator()
        L_0x0072:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r9.next()
            androidx.fragment.app.SpecialEffectsController$Operation r10 = (androidx.fragment.app.SpecialEffectsController.Operation) r10
            androidx.fragment.app.Fragment r10 = r10.f3694c
            androidx.fragment.app.Fragment$j r10 = r10.mAnimationInfo
            androidx.fragment.app.Fragment$j r11 = r8.mAnimationInfo
            int r12 = r11.f3584b
            r10.f3584b = r12
            int r12 = r11.f3585c
            r10.f3585c = r12
            int r12 = r11.f3586d
            r10.f3586d = r12
            int r11 = r11.f3587e
            r10.f3587e = r11
            goto L_0x0072
        L_0x0095:
            java.util.Iterator r1 = r34.iterator()
        L_0x0099:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r1.next()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = (androidx.fragment.app.SpecialEffectsController.Operation) r8
            n1.d r9 = new n1.d
            r9.<init>()
            r8.mo4034d()
            java.util.HashSet<n1.d> r10 = r8.f3696e
            r10.add(r9)
            androidx.fragment.app.b$b r10 = new androidx.fragment.app.b$b
            r10.<init>(r8, r9, r2)
            r3.add(r10)
            n1.d r9 = new n1.d
            r9.<init>()
            r8.mo4034d()
            java.util.HashSet<n1.d> r10 = r8.f3696e
            r10.add(r9)
            androidx.fragment.app.b$d r10 = new androidx.fragment.app.b$d
            if (r2 == 0) goto L_0x00ce
            if (r8 != r4) goto L_0x00d2
            goto L_0x00d0
        L_0x00ce:
            if (r8 != r5) goto L_0x00d2
        L_0x00d0:
            r11 = 1
            goto L_0x00d3
        L_0x00d2:
            r11 = 0
        L_0x00d3:
            r10.<init>(r8, r9, r2, r11)
            r6.add(r10)
            androidx.fragment.app.c r9 = new androidx.fragment.app.c
            r9.<init>(r0, r7, r8)
            java.util.ArrayList r8 = r8.f3695d
            r8.add(r9)
            goto L_0x0099
        L_0x00e4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r8 = r6.iterator()
            r9 = 0
        L_0x00ee:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0168
            java.lang.Object r10 = r8.next()
            androidx.fragment.app.b$d r10 = (androidx.fragment.app.C0911b.C0915d) r10
            boolean r11 = r10.mo4055b()
            if (r11 == 0) goto L_0x0101
            goto L_0x00ee
        L_0x0101:
            java.lang.Object r11 = r10.f3716c
            androidx.fragment.app.o0 r11 = r10.mo4056c(r11)
            java.lang.Object r12 = r10.f3718e
            androidx.fragment.app.o0 r12 = r10.mo4056c(r12)
            java.lang.String r13 = " returned Transition "
            java.lang.String r14 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r11 == 0) goto L_0x013f
            if (r12 == 0) goto L_0x013f
            if (r11 != r12) goto L_0x0118
            goto L_0x013f
        L_0x0118:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r10.f3714a
            androidx.fragment.app.Fragment r3 = r3.f3694c
            r2.append(r3)
            r2.append(r13)
            java.lang.Object r3 = r10.f3716c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r3 = r10.f3718e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x013f:
            if (r11 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r11 = r12
        L_0x0143:
            if (r9 != 0) goto L_0x0147
            r9 = r11
            goto L_0x00ee
        L_0x0147:
            if (r11 == 0) goto L_0x00ee
            if (r9 != r11) goto L_0x014c
            goto L_0x00ee
        L_0x014c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r10.f3714a
            androidx.fragment.app.Fragment r3 = r3.f3694c
            r2.append(r3)
            r2.append(r13)
            java.lang.Object r3 = r10.f3716c
            java.lang.String r4 = " which uses a different Transition  type than other Fragments."
            java.lang.String r2 = p379.C16530d.m42015h(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x0168:
            if (r9 != 0) goto L_0x018e
            java.util.Iterator r2 = r6.iterator()
        L_0x016e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0185
            java.lang.Object r6 = r2.next()
            androidx.fragment.app.b$d r6 = (androidx.fragment.app.C0911b.C0915d) r6
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r6.f3714a
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r1.put(r8, r9)
            r6.mo4054a()
            goto L_0x016e
        L_0x0185:
            r6 = r1
            r22 = r3
            r31 = r4
            r12 = r5
            r11 = r7
            goto L_0x05a3
        L_0x018e:
            android.view.View r8 = new android.view.View
            android.view.ViewGroup r10 = r0.f3687a
            android.content.Context r10 = r10.getContext()
            r8.<init>(r10)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            s0.b r12 = new s0.b
            r12.<init>()
            java.util.Iterator r16 = r6.iterator()
            r10 = 0
            r11 = 0
            r17 = 0
            r22 = r3
            r3 = r4
            r34 = r11
            r11 = r10
            r10 = r5
        L_0x01bc:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x03ab
            java.lang.Object r18 = r16.next()
            r23 = r7
            r7 = r18
            androidx.fragment.app.b$d r7 = (androidx.fragment.app.C0911b.C0915d) r7
            java.lang.Object r7 = r7.f3718e
            if (r7 == 0) goto L_0x01d3
            r18 = 1
            goto L_0x01d5
        L_0x01d3:
            r18 = 0
        L_0x01d5:
            if (r18 == 0) goto L_0x0389
            if (r3 == 0) goto L_0x0389
            if (r10 == 0) goto L_0x0389
            java.lang.Object r7 = r9.mo4121f(r7)
            java.lang.Object r7 = r9.mo4131r(r7)
            androidx.fragment.app.Fragment r11 = r10.f3694c
            java.util.ArrayList r11 = r11.getSharedElementSourceNames()
            r18 = r6
            androidx.fragment.app.Fragment r6 = r3.f3694c
            java.util.ArrayList r6 = r6.getSharedElementSourceNames()
            r24 = r1
            androidx.fragment.app.Fragment r1 = r3.f3694c
            java.util.ArrayList r1 = r1.getSharedElementTargetNames()
            r19 = 0
            r20 = r8
            r19 = r15
            r8 = 0
        L_0x0200:
            int r15 = r1.size()
            if (r8 >= r15) goto L_0x0221
            java.lang.Object r15 = r1.get(r8)
            int r15 = r11.indexOf(r15)
            r21 = r1
            r1 = -1
            if (r15 == r1) goto L_0x021c
            java.lang.Object r1 = r6.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            r11.set(r15, r1)
        L_0x021c:
            int r8 = r8 + 1
            r1 = r21
            goto L_0x0200
        L_0x0221:
            androidx.fragment.app.Fragment r1 = r10.f3694c
            java.util.ArrayList r1 = r1.getSharedElementTargetNames()
            if (r2 != 0) goto L_0x0234
            androidx.fragment.app.Fragment r6 = r3.f3694c
            r6.getExitTransitionCallback()
            androidx.fragment.app.Fragment r6 = r10.f3694c
            r6.getEnterTransitionCallback()
            goto L_0x023e
        L_0x0234:
            androidx.fragment.app.Fragment r6 = r3.f3694c
            r6.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r6 = r10.f3694c
            r6.getExitTransitionCallback()
        L_0x023e:
            int r6 = r11.size()
            r8 = 0
        L_0x0243:
            if (r8 >= r6) goto L_0x025d
            java.lang.Object r15 = r11.get(r8)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r21 = r1.get(r8)
            r25 = r6
            r6 = r21
            java.lang.String r6 = (java.lang.String) r6
            r12.put(r15, r6)
            int r8 = r8 + 1
            r6 = r25
            goto L_0x0243
        L_0x025d:
            r6 = 2
            boolean r6 = androidx.fragment.app.FragmentManager.m2590J(r6)
            if (r6 == 0) goto L_0x0286
            java.util.Iterator r6 = r1.iterator()
        L_0x0268:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0275
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0268
        L_0x0275:
            java.util.Iterator r6 = r11.iterator()
        L_0x0279:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0286
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0279
        L_0x0286:
            s0.b r6 = new s0.b
            r6.<init>()
            androidx.fragment.app.Fragment r8 = r3.f3694c
            android.view.View r8 = r8.mView
            m2701k(r8, r6)
            p241s0.C6307g.m14942k(r6, r11)
            java.util.Set r8 = r6.keySet()
            p241s0.C6307g.m14942k(r12, r8)
            s0.b r8 = new s0.b
            r8.<init>()
            androidx.fragment.app.Fragment r15 = r10.f3694c
            android.view.View r15 = r15.mView
            m2701k(r15, r8)
            p241s0.C6307g.m14942k(r8, r1)
            java.util.Collection r15 = r12.values()
            p241s0.C6307g.m14942k(r8, r15)
            androidx.fragment.app.k0 r15 = androidx.fragment.app.C0935i0.f3800a
            int r15 = r12.f19969d
            int r15 = r15 + -1
        L_0x02b8:
            if (r15 < 0) goto L_0x02d2
            java.lang.Object r21 = r12.mo22422l(r15)
            r25 = r1
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r8.containsKey(r1)
            if (r1 != 0) goto L_0x02cd
            r12.mo22420j(r15)
        L_0x02cd:
            int r15 = r15 + -1
            r1 = r25
            goto L_0x02b8
        L_0x02d2:
            r25 = r1
            java.util.Set r1 = r12.keySet()
            m2702l(r6, r1)
            java.util.Collection r1 = r12.values()
            m2702l(r8, r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x02fe
            r14.clear()
            r13.clear()
            r1 = 0
            r11 = r10
            r2 = r12
            r6 = r13
            r8 = r14
            r7 = r19
            r15 = r24
            r19 = r1
            r10 = r3
            r1 = r20
            goto L_0x0395
        L_0x02fe:
            androidx.fragment.app.Fragment r1 = r10.f3694c
            androidx.fragment.app.Fragment r3 = r3.f3694c
            if (r2 == 0) goto L_0x0308
            r3.getEnterTransitionCallback()
            goto L_0x030b
        L_0x0308:
            r1.getEnterTransitionCallback()
        L_0x030b:
            android.view.ViewGroup r1 = r0.f3687a
            androidx.fragment.app.h r3 = new androidx.fragment.app.h
            r3.<init>(r5, r4, r2, r8)
            p242s1.C6409w.m15313a(r1, r3)
            java.util.Collection r1 = r6.values()
            r14.addAll(r1)
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0334
            r1 = 0
            java.lang.Object r3 = r11.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r10 = 0
            java.lang.Object r3 = r6.getOrDefault(r3, r10)
            android.view.View r3 = (android.view.View) r3
            r9.mo4126m(r3, r7)
            goto L_0x0338
        L_0x0334:
            r1 = 0
            r10 = 0
            r3 = r34
        L_0x0338:
            java.util.Collection r6 = r8.values()
            r13.addAll(r6)
            boolean r6 = r25.isEmpty()
            if (r6 != 0) goto L_0x0364
            r6 = r25
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.getOrDefault(r1, r10)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0364
            android.view.ViewGroup r6 = r0.f3687a
            androidx.fragment.app.i r8 = new androidx.fragment.app.i
            r15 = r19
            r8.<init>(r9, r1, r15)
            p242s1.C6409w.m15313a(r6, r8)
            r17 = 1
            goto L_0x0366
        L_0x0364:
            r15 = r19
        L_0x0366:
            r1 = r20
            r9.mo4129p(r7, r1, r14)
            r6 = 0
            r8 = 0
            r10 = r9
            r11 = r7
            r2 = r12
            r12 = r6
            r6 = r13
            r13 = r8
            r8 = r14
            r14 = r7
            r19 = r7
            r7 = r15
            r15 = r6
            r10.mo4125l(r11, r12, r13, r14, r15)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r15 = r24
            r15.put(r4, r10)
            r15.put(r5, r10)
            r10 = r4
            r11 = r5
            goto L_0x0397
        L_0x0389:
            r18 = r6
            r2 = r12
            r6 = r13
            r7 = r15
            r15 = r1
            r1 = r8
            r8 = r14
            r19 = r11
            r11 = r10
            r10 = r3
        L_0x0395:
            r3 = r34
        L_0x0397:
            r12 = r2
            r34 = r3
            r13 = r6
            r14 = r8
            r3 = r10
            r10 = r11
            r6 = r18
            r11 = r19
            r2 = r35
            r8 = r1
            r1 = r15
            r15 = r7
            r7 = r23
            goto L_0x01bc
        L_0x03ab:
            r18 = r6
            r23 = r7
            r2 = r12
            r6 = r13
            r7 = r15
            r15 = r1
            r1 = r8
            r8 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r16 = r18.iterator()
            r12 = 0
            r13 = 0
            r32 = r13
            r13 = r12
            r12 = r32
        L_0x03c5:
            boolean r19 = r16.hasNext()
            if (r19 == 0) goto L_0x0527
            java.lang.Object r19 = r16.next()
            r35 = r14
            r14 = r19
            androidx.fragment.app.b$d r14 = (androidx.fragment.app.C0911b.C0915d) r14
            boolean r19 = r14.mo4055b()
            if (r19 == 0) goto L_0x0404
            r19 = r12
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r14.f3714a
            r20 = r13
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r15.put(r12, r13)
            r14.mo4054a()
            r31 = r4
            r24 = r5
            r25 = r6
            r27 = r11
            r6 = r15
            r12 = r19
            r13 = r20
            r11 = r23
            r5 = r34
            r19 = r1
            r20 = r2
            r34 = r8
            r2 = r35
            goto L_0x0511
        L_0x0404:
            r19 = r12
            r20 = r13
            java.lang.Object r12 = r14.f3716c
            java.lang.Object r13 = r9.mo4121f(r12)
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r14.f3714a
            if (r11 == 0) goto L_0x0418
            if (r12 == r3) goto L_0x0416
            if (r12 != r10) goto L_0x0418
        L_0x0416:
            r10 = 1
            goto L_0x0419
        L_0x0418:
            r10 = 0
        L_0x0419:
            if (r13 != 0) goto L_0x0440
            if (r10 != 0) goto L_0x0425
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r15.put(r12, r10)
            r14.mo4054a()
        L_0x0425:
            r31 = r4
            r24 = r5
            r25 = r6
            r27 = r11
            r6 = r15
            r12 = r19
            r13 = r20
            r11 = r23
            r5 = r34
            r19 = r1
            r20 = r2
            r34 = r8
            r2 = r35
            goto L_0x050f
        L_0x0440:
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r21 = r11
            androidx.fragment.app.Fragment r11 = r12.f3694c
            android.view.View r11 = r11.mView
            m2700j(r11, r15)
            if (r10 == 0) goto L_0x045b
            if (r12 != r3) goto L_0x0458
            r15.removeAll(r8)
            goto L_0x045b
        L_0x0458:
            r15.removeAll(r6)
        L_0x045b:
            boolean r10 = r15.isEmpty()
            if (r10 == 0) goto L_0x0484
            r9.mo4117a(r1, r13)
            r28 = r34
            r31 = r4
            r25 = r6
            r34 = r8
            r10 = r12
            r4 = r13
            r8 = r14
            r29 = r19
            r27 = r21
            r11 = r23
            r6 = r24
            r19 = r1
            r24 = r5
            r5 = r15
            r1 = r20
            r20 = r2
            r2 = r35
            goto L_0x04e2
        L_0x0484:
            r9.mo4118b(r13, r15)
            r25 = 0
            r26 = 0
            r11 = r34
            r10 = r9
            r28 = r11
            r27 = r21
            r11 = r13
            r30 = r12
            r29 = r19
            r12 = r13
            r19 = r1
            r31 = r4
            r4 = r13
            r1 = r20
            r13 = r15
            r20 = r2
            r34 = r8
            r8 = r14
            r2 = r35
            r14 = r25
            r25 = r6
            r6 = r24
            r24 = r5
            r5 = r15
            r15 = r26
            r10.mo4125l(r11, r12, r13, r14, r15)
            r10 = r30
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r10.f3692a
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r11 != r12) goto L_0x04e0
            r11 = r23
            r11.remove(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r5)
            androidx.fragment.app.Fragment r13 = r10.f3694c
            android.view.View r13 = r13.mView
            r12.remove(r13)
            androidx.fragment.app.Fragment r13 = r10.f3694c
            android.view.View r13 = r13.mView
            r9.mo4124k(r4, r13, r12)
            android.view.ViewGroup r12 = r0.f3687a
            androidx.fragment.app.j r13 = new androidx.fragment.app.j
            r13.<init>(r5)
            p242s1.C6409w.m15313a(r12, r13)
            goto L_0x04e2
        L_0x04e0:
            r11 = r23
        L_0x04e2:
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r10.f3692a
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r12 != r13) goto L_0x04f3
            r2.addAll(r5)
            if (r17 == 0) goto L_0x04f0
            r9.mo4127n(r4, r7)
        L_0x04f0:
            r5 = r28
            goto L_0x04f8
        L_0x04f3:
            r5 = r28
            r9.mo4126m(r5, r4)
        L_0x04f8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r6.put(r10, r12)
            boolean r8 = r8.f3717d
            if (r8 == 0) goto L_0x0508
            java.lang.Object r13 = r9.mo4123j(r1, r4)
            r12 = r29
            goto L_0x050f
        L_0x0508:
            r13 = r29
            java.lang.Object r12 = r9.mo4123j(r13, r4)
            r13 = r1
        L_0x050f:
            r10 = r24
        L_0x0511:
            r8 = r34
            r14 = r2
            r34 = r5
            r15 = r6
            r23 = r11
            r1 = r19
            r2 = r20
            r5 = r24
            r6 = r25
            r11 = r27
            r4 = r31
            goto L_0x03c5
        L_0x0527:
            r20 = r2
            r31 = r4
            r24 = r5
            r25 = r6
            r34 = r8
            r10 = r11
            r1 = r13
            r2 = r14
            r6 = r15
            r11 = r23
            r13 = r12
            java.lang.Object r1 = r9.mo4122i(r1, r13, r10)
            if (r1 != 0) goto L_0x0541
            r12 = r24
            goto L_0x05a3
        L_0x0541:
            java.util.Iterator r4 = r18.iterator()
        L_0x0545:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0597
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.b$d r5 = (androidx.fragment.app.C0911b.C0915d) r5
            boolean r7 = r5.mo4055b()
            if (r7 == 0) goto L_0x0558
            goto L_0x0545
        L_0x0558:
            java.lang.Object r7 = r5.f3716c
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r5.f3714a
            r12 = r24
            if (r10 == 0) goto L_0x0566
            if (r8 == r3) goto L_0x0564
            if (r8 != r12) goto L_0x0566
        L_0x0564:
            r13 = 1
            goto L_0x0567
        L_0x0566:
            r13 = 0
        L_0x0567:
            if (r7 != 0) goto L_0x056b
            if (r13 == 0) goto L_0x0594
        L_0x056b:
            android.view.ViewGroup r7 = r0.f3687a
            java.util.WeakHashMap<android.view.View, s1.p0> r13 = p242s1.C6333d0.f19990a
            boolean r7 = p242s1.C6333d0.C6340g.m15076c(r7)
            if (r7 != 0) goto L_0x0588
            r7 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.m2590J(r7)
            if (r7 == 0) goto L_0x0584
            android.view.ViewGroup r7 = r0.f3687a
            java.util.Objects.toString(r7)
            java.util.Objects.toString(r8)
        L_0x0584:
            r5.mo4054a()
            goto L_0x0594
        L_0x0588:
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.f3714a
            androidx.fragment.app.Fragment r7 = r7.f3694c
            androidx.fragment.app.k r7 = new androidx.fragment.app.k
            r7.<init>(r5, r8)
            r9.mo4128o(r1, r7)
        L_0x0594:
            r24 = r12
            goto L_0x0545
        L_0x0597:
            r12 = r24
            android.view.ViewGroup r3 = r0.f3687a
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            boolean r3 = p242s1.C6333d0.C6340g.m15076c(r3)
            if (r3 != 0) goto L_0x05a9
        L_0x05a3:
            r23 = r11
            r24 = r12
            goto L_0x068b
        L_0x05a9:
            r3 = 4
            androidx.fragment.app.C0935i0.m2746a(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r25.size()
            r5 = 0
        L_0x05b7:
            if (r5 >= r4) goto L_0x05d1
            r7 = r25
            java.lang.Object r8 = r7.get(r5)
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap<android.view.View, s1.p0> r13 = p242s1.C6333d0.f19990a
            java.lang.String r13 = p242s1.C6333d0.C6342i.m15094k(r8)
            r3.add(r13)
            r13 = 0
            p242s1.C6333d0.C6342i.m15105v(r8, r13)
            int r5 = r5 + 1
            goto L_0x05b7
        L_0x05d1:
            r7 = r25
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.m2590J(r4)
            if (r4 == 0) goto L_0x0608
            java.util.Iterator r4 = r34.iterator()
        L_0x05de:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05f1
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Objects.toString(r5)
            p242s1.C6333d0.C6342i.m15094k(r5)
            goto L_0x05de
        L_0x05f1:
            java.util.Iterator r4 = r7.iterator()
        L_0x05f5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0608
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Objects.toString(r5)
            p242s1.C6333d0.C6342i.m15094k(r5)
            goto L_0x05f5
        L_0x0608:
            android.view.ViewGroup r4 = r0.f3687a
            r9.mo4119c(r4, r1)
            android.view.ViewGroup r1 = r0.f3687a
            int r4 = r7.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = 0
        L_0x0619:
            if (r8 >= r4) goto L_0x066a
            r13 = r34
            java.lang.Object r14 = r13.get(r8)
            android.view.View r14 = (android.view.View) r14
            java.util.WeakHashMap<android.view.View, s1.p0> r15 = p242s1.C6333d0.f19990a
            java.lang.String r15 = p242s1.C6333d0.C6342i.m15094k(r14)
            r5.add(r15)
            if (r15 != 0) goto L_0x0633
            r23 = r11
            r24 = r12
            goto L_0x0661
        L_0x0633:
            r24 = r12
            r12 = 0
            p242s1.C6333d0.C6342i.m15105v(r14, r12)
            r14 = r20
            java.lang.Object r12 = r14.getOrDefault(r15, r12)
            java.lang.String r12 = (java.lang.String) r12
            r16 = 0
            r14 = 0
        L_0x0644:
            r23 = r11
            if (r14 >= r4) goto L_0x0661
            java.lang.Object r11 = r3.get(r14)
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x065c
            java.lang.Object r11 = r7.get(r14)
            android.view.View r11 = (android.view.View) r11
            p242s1.C6333d0.C6342i.m15105v(r11, r15)
            goto L_0x0661
        L_0x065c:
            int r14 = r14 + 1
            r11 = r23
            goto L_0x0644
        L_0x0661:
            int r8 = r8 + 1
            r34 = r13
            r11 = r23
            r12 = r24
            goto L_0x0619
        L_0x066a:
            r13 = r34
            r23 = r11
            r24 = r12
            androidx.fragment.app.n0 r8 = new androidx.fragment.app.n0
            r16 = r8
            r17 = r4
            r18 = r7
            r19 = r3
            r20 = r13
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            p242s1.C6409w.m15313a(r1, r8)
            r1 = 0
            androidx.fragment.app.C0935i0.m2746a(r2, r1)
            r9.mo4130q(r10, r13, r7)
        L_0x068b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r6.containsValue(r1)
            android.view.ViewGroup r2 = r0.f3687a
            android.content.Context r3 = r2.getContext()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r22.iterator()
            r7 = 0
        L_0x06a1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0735
            java.lang.Object r8 = r5.next()
            r13 = r8
            androidx.fragment.app.b$b r13 = (androidx.fragment.app.C0911b.C0913b) r13
            boolean r8 = r13.mo4055b()
            if (r8 == 0) goto L_0x06b8
            r13.mo4054a()
            goto L_0x06a1
        L_0x06b8:
            androidx.fragment.app.p$a r8 = r13.mo4053c(r3)
            if (r8 != 0) goto L_0x06c2
            r13.mo4054a()
            goto L_0x06a1
        L_0x06c2:
            android.animation.Animator r14 = r8.f3833b
            if (r14 != 0) goto L_0x06ca
            r4.add(r13)
            goto L_0x06a1
        L_0x06ca:
            androidx.fragment.app.SpecialEffectsController$Operation r15 = r13.f3714a
            androidx.fragment.app.Fragment r8 = r15.f3694c
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r10 = r6.get(r15)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x06e8
            r9 = 2
            boolean r9 = androidx.fragment.app.FragmentManager.m2590J(r9)
            if (r9 == 0) goto L_0x06e4
            java.util.Objects.toString(r8)
        L_0x06e4:
            r13.mo4054a()
            goto L_0x06a1
        L_0x06e8:
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r15.f3692a
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r7 != r9) goto L_0x06f1
            r7 = 1
            r10 = 1
            goto L_0x06f3
        L_0x06f1:
            r7 = 0
            r10 = 0
        L_0x06f3:
            r12 = r23
            if (r10 == 0) goto L_0x06fa
            r12.remove(r15)
        L_0x06fa:
            android.view.View r11 = r8.mView
            r2.startViewTransition(r11)
            androidx.fragment.app.d r9 = new androidx.fragment.app.d
            r7 = r9
            r8 = r2
            r0 = r9
            r9 = r11
            r34 = r5
            r5 = r11
            r11 = r15
            r16 = r12
            r12 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r14.addListener(r0)
            r14.setTarget(r5)
            r14.start()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m2590J(r0)
            if (r0 == 0) goto L_0x0722
            r15.toString()
        L_0x0722:
            n1.d r0 = r13.f3715b
            androidx.fragment.app.e r5 = new androidx.fragment.app.e
            r5.<init>(r14, r15)
            r0.mo21672b(r5)
            r7 = 1
            r0 = r33
            r5 = r34
            r23 = r16
            goto L_0x06a1
        L_0x0735:
            r16 = r23
            java.util.Iterator r0 = r4.iterator()
        L_0x073b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x07ae
            java.lang.Object r4 = r0.next()
            androidx.fragment.app.b$b r4 = (androidx.fragment.app.C0911b.C0913b) r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r4.f3714a
            androidx.fragment.app.Fragment r6 = r5.f3694c
            if (r1 == 0) goto L_0x075b
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.m2590J(r5)
            if (r5 == 0) goto L_0x0757
            java.util.Objects.toString(r6)
        L_0x0757:
            r4.mo4054a()
            goto L_0x073b
        L_0x075b:
            r8 = 2
            if (r7 == 0) goto L_0x076b
            boolean r5 = androidx.fragment.app.FragmentManager.m2590J(r8)
            if (r5 == 0) goto L_0x0767
            java.util.Objects.toString(r6)
        L_0x0767:
            r4.mo4054a()
            goto L_0x073b
        L_0x076b:
            android.view.View r6 = r6.mView
            androidx.fragment.app.p$a r8 = r4.mo4053c(r3)
            r8.getClass()
            android.view.animation.Animation r8 = r8.f3832a
            r8.getClass()
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = r5.f3692a
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r9 == r10) goto L_0x0786
            r6.startAnimation(r8)
            r4.mo4054a()
            goto L_0x07a3
        L_0x0786:
            r2.startViewTransition(r6)
            androidx.fragment.app.p$b r9 = new androidx.fragment.app.p$b
            r9.<init>(r8, r2, r6)
            androidx.fragment.app.f r8 = new androidx.fragment.app.f
            r8.<init>(r6, r2, r4, r5)
            r9.setAnimationListener(r8)
            r6.startAnimation(r9)
            r8 = 2
            boolean r8 = androidx.fragment.app.FragmentManager.m2590J(r8)
            if (r8 == 0) goto L_0x07a3
            r5.toString()
        L_0x07a3:
            n1.d r8 = r4.f3715b
            androidx.fragment.app.g r9 = new androidx.fragment.app.g
            r9.<init>(r6, r2, r4, r5)
            r8.mo21672b(r9)
            goto L_0x073b
        L_0x07ae:
            java.util.Iterator r0 = r16.iterator()
        L_0x07b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x07c8
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.f3694c
            android.view.View r2 = r2.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.f3692a
            r1.applyState(r2)
            goto L_0x07b2
        L_0x07c8:
            r16.clear()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m2590J(r0)
            if (r0 == 0) goto L_0x07d8
            java.util.Objects.toString(r31)
            java.util.Objects.toString(r24)
        L_0x07d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0911b.mo4025b(java.util.ArrayList, boolean):void");
    }
}
