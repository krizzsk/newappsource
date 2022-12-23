package p221q6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2126g;
import com.bumptech.glide.C2131j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mf0.C24368m;
import p146k6.C5510o;
import p241s0.C6302b;
import p311x6.C7176l;
import p370ar.C13506a;

/* renamed from: q6.m */
public final class C6194m implements Handler.Callback {

    /* renamed from: k */
    public static final C6195a f19585k = new C6195a();

    /* renamed from: b */
    public volatile C2131j f19586b;

    /* renamed from: c */
    public final HashMap f19587c = new HashMap();

    /* renamed from: d */
    public final HashMap f19588d = new HashMap();

    /* renamed from: e */
    public final Handler f19589e;

    /* renamed from: f */
    public final C6196b f19590f;

    /* renamed from: g */
    public final C6302b<View, Fragment> f19591g = new C6302b<>();

    /* renamed from: h */
    public final C6302b<View, android.app.Fragment> f19592h = new C6302b<>();

    /* renamed from: i */
    public final Bundle f19593i = new Bundle();

    /* renamed from: j */
    public final C6188h f19594j;

    /* renamed from: q6.m$a */
    public class C6195a implements C6196b {
        /* renamed from: a */
        public final C2131j mo10837a(C2116c cVar, C6189i iVar, C6197n nVar, Context context) {
            return new C2131j(cVar, iVar, nVar, context);
        }
    }

    /* renamed from: q6.m$b */
    public interface C6196b {
        /* renamed from: a */
        C2131j mo10837a(C2116c cVar, C6189i iVar, C6197n nVar, Context context);
    }

    public C6194m(C6196b bVar, C2126g gVar) {
        C6187g gVar2;
        this.f19590f = bVar == null ? f19585k : bVar;
        this.f19589e = new Handler(Looper.getMainLooper(), this);
        if (!C5510o.f18054h || !C5510o.f18053g) {
            new C24368m
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: CONSTRUCTOR  (r2v5 ? I:mf0.m) =  call: mf0.m.<init>():void type: CONSTRUCTOR in method: q6.m.<init>(q6.m$b, com.bumptech.glide.g):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v5 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f19587c = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f19588d = r0
                s0.b r0 = new s0.b
                r0.<init>()
                r1.f19591g = r0
                s0.b r0 = new s0.b
                r0.<init>()
                r1.f19592h = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.f19593i = r0
                if (r2 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                q6.m$a r2 = f19585k
            L_0x002b:
                r1.f19590f = r2
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0, r1)
                r1.f19589e = r2
                boolean r2 = p146k6.C5510o.f18054h
                if (r2 == 0) goto L_0x0057
                boolean r2 = p146k6.C5510o.f18053g
                if (r2 != 0) goto L_0x0041
                goto L_0x0057
            L_0x0041:
                java.lang.Class<com.bumptech.glide.d$e> r2 = com.bumptech.glide.C2118d.C2123e.class
                java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r3.f6918a
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L_0x0051
                q6.g r2 = new q6.g
                r2.<init>()
                goto L_0x005c
            L_0x0051:
                t4.c r2 = new t4.c
                r2.<init>()
                goto L_0x005c
            L_0x0057:
                mf0.m r2 = new mf0.m
                r2.<init>()
            L_0x005c:
                r1.f19594j = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p221q6.C6194m.<init>(q6.m$b, com.bumptech.glide.g):void");
        }

        /* renamed from: a */
        public static Activity m14758a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return m14758a(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        /* renamed from: c */
        public static void m14759c(C6302b bVar, List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    if (!(fragment == null || fragment.getView() == null)) {
                        bVar.put(fragment.getView(), fragment);
                        m14759c(bVar, fragment.getChildFragmentManager().mo3930H());
                    }
                }
            }
        }

        @TargetApi(26)
        @Deprecated
        /* renamed from: b */
        public final void mo22190b(FragmentManager fragmentManager, C6302b<View, android.app.Fragment> bVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                    if (fragment.getView() != null) {
                        bVar.put(fragment.getView(), fragment);
                        mo22190b(fragment.getChildFragmentManager(), bVar);
                    }
                }
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.f19593i.putInt(LinksConfiguration.KEY_KEY, i);
                android.app.Fragment fragment2 = null;
                try {
                    fragment2 = fragmentManager.getFragment(this.f19593i, LinksConfiguration.KEY_KEY);
                } catch (Exception unused) {
                }
                if (fragment2 != null) {
                    if (fragment2.getView() != null) {
                        bVar.put(fragment2.getView(), fragment2);
                        mo22190b(fragment2.getChildFragmentManager(), bVar);
                    }
                    i = i2;
                } else {
                    return;
                }
            }
        }

        @Deprecated
        /* renamed from: d */
        public final C2131j mo22191d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
            C6192l i = mo22197i(fragmentManager, fragment);
            C2131j jVar = i.f19581e;
            if (jVar == null) {
                jVar = this.f19590f.mo10837a(C2116c.m5520b(context), i.f19578b, i.f19579c, context);
                if (z) {
                    jVar.onStart();
                }
                i.f19581e = jVar;
            }
            return jVar;
        }

        /* renamed from: e */
        public final C2131j mo22192e(Activity activity) {
            boolean z;
            if (C7176l.m16788h()) {
                return mo22193f(activity.getApplicationContext());
            }
            if (activity instanceof FragmentActivity) {
                return mo22195h((FragmentActivity) activity);
            }
            if (!activity.isDestroyed()) {
                this.f19594j.mo22178a();
                FragmentManager fragmentManager = activity.getFragmentManager();
                Activity a = m14758a(activity);
                if (a == null || !a.isFinishing()) {
                    z = true;
                } else {
                    z = false;
                }
                return mo22191d(activity, fragmentManager, (android.app.Fragment) null, z);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        /* renamed from: f */
        public final C2131j mo22193f(Context context) {
            boolean z;
            if (context != null) {
                char[] cArr = C7176l.f22265a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !(context instanceof Application)) {
                    if (context instanceof FragmentActivity) {
                        return mo22195h((FragmentActivity) context);
                    }
                    if (context instanceof Activity) {
                        return mo22192e((Activity) context);
                    }
                    if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return mo22193f(contextWrapper.getBaseContext());
                        }
                    }
                }
                if (this.f19586b == null) {
                    synchronized (this) {
                        if (this.f19586b == null) {
                            this.f19586b = this.f19590f.mo10837a(C2116c.m5520b(context.getApplicationContext()), new C6181b(), new C13506a(0), context.getApplicationContext());
                        }
                    }
                }
                return this.f19586b;
            }
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }

        /* renamed from: g */
        public final C2131j mo22194g(Fragment fragment) {
            if (fragment.getContext() == null) {
                throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
            } else if (C7176l.m16788h()) {
                return mo22193f(fragment.getContext().getApplicationContext());
            } else {
                if (fragment.getActivity() != null) {
                    C6188h hVar = this.f19594j;
                    fragment.getActivity();
                    hVar.mo22178a();
                }
                return mo22199k(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
        }

        /* renamed from: h */
        public final C2131j mo22195h(FragmentActivity fragmentActivity) {
            boolean z;
            if (C7176l.m16788h()) {
                return mo22193f(fragmentActivity.getApplicationContext());
            }
            if (!fragmentActivity.isDestroyed()) {
                this.f19594j.mo22178a();
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Activity a = m14758a(fragmentActivity);
                if (a == null || !a.isFinishing()) {
                    z = true;
                } else {
                    z = false;
                }
                return mo22199k(fragmentActivity, supportFragmentManager, (Fragment) null, z);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: androidx.fragment.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: android.app.FragmentManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                int r0 = r14.arg1
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                int r3 = r14.what
                java.lang.String r4 = " New: "
                java.lang.String r5 = "We've added two fragments with requests! Old: "
                java.lang.String r6 = "RMRetriever"
                r7 = 5
                java.lang.String r8 = "com.bumptech.glide.manager"
                r9 = 0
                if (r3 == r1) goto L_0x0087
                r10 = 2
                if (r3 == r10) goto L_0x001e
                r14 = r9
                r1 = 0
                goto L_0x00fe
            L_0x001e:
                java.lang.Object r14 = r14.obj
                androidx.fragment.app.FragmentManager r14 = (androidx.fragment.app.FragmentManager) r14
                java.util.HashMap r3 = r13.f19588d
                java.lang.Object r3 = r3.get(r14)
                q6.r r3 = (p221q6.C6208r) r3
                androidx.fragment.app.Fragment r11 = r14.mo3923A(r8)
                q6.r r11 = (p221q6.C6208r) r11
                if (r11 != r3) goto L_0x0033
                goto L_0x007c
            L_0x0033:
                if (r11 == 0) goto L_0x0055
                com.bumptech.glide.j r12 = r11.f19622f
                if (r12 != 0) goto L_0x003a
                goto L_0x0055
            L_0x003a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                r0.append(r11)
                r0.append(r4)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r14.<init>(r0)
                throw r14
            L_0x0055:
                if (r0 != 0) goto L_0x0077
                boolean r0 = r14.f3615I
                if (r0 == 0) goto L_0x005c
                goto L_0x0077
            L_0x005c:
                androidx.fragment.app.a r0 = new androidx.fragment.app.a
                r0.<init>(r14)
                r0.mo4041e(r2, r3, r8, r1)
                if (r11 == 0) goto L_0x0069
                r0.mo4050p(r11)
            L_0x0069:
                r0.mo4046l()
                android.os.Handler r0 = r13.f19589e
                android.os.Message r0 = r0.obtainMessage(r10, r1, r2, r14)
                r0.sendToTarget()
                r0 = 0
                goto L_0x007d
            L_0x0077:
                q6.a r0 = r3.f19618b
                r0.mo22163a()
            L_0x007c:
                r0 = 1
            L_0x007d:
                if (r0 == 0) goto L_0x00fb
                java.util.HashMap r0 = r13.f19588d
                java.lang.Object r0 = r0.remove(r14)
                goto L_0x00f9
            L_0x0087:
                java.lang.Object r14 = r14.obj
                android.app.FragmentManager r14 = (android.app.FragmentManager) r14
                java.util.HashMap r3 = r13.f19587c
                java.lang.Object r3 = r3.get(r14)
                q6.l r3 = (p221q6.C6192l) r3
                android.app.Fragment r10 = r14.findFragmentByTag(r8)
                q6.l r10 = (p221q6.C6192l) r10
                if (r10 != r3) goto L_0x009c
                goto L_0x00f0
            L_0x009c:
                if (r10 == 0) goto L_0x00be
                com.bumptech.glide.j r11 = r10.f19581e
                if (r11 != 0) goto L_0x00a3
                goto L_0x00be
            L_0x00a3:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                r0.append(r10)
                r0.append(r4)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r14.<init>(r0)
                throw r14
            L_0x00be:
                if (r0 != 0) goto L_0x00e2
                boolean r0 = r14.isDestroyed()
                if (r0 == 0) goto L_0x00c7
                goto L_0x00e2
            L_0x00c7:
                android.app.FragmentTransaction r0 = r14.beginTransaction()
                android.app.FragmentTransaction r0 = r0.add(r3, r8)
                if (r10 == 0) goto L_0x00d4
                r0.remove(r10)
            L_0x00d4:
                r0.commitAllowingStateLoss()
                android.os.Handler r0 = r13.f19589e
                android.os.Message r0 = r0.obtainMessage(r1, r1, r2, r14)
                r0.sendToTarget()
                r0 = 0
                goto L_0x00f1
            L_0x00e2:
                boolean r0 = android.util.Log.isLoggable(r6, r7)
                if (r0 == 0) goto L_0x00eb
                r14.isDestroyed()
            L_0x00eb:
                q6.a r0 = r3.f19578b
                r0.mo22163a()
            L_0x00f0:
                r0 = 1
            L_0x00f1:
                if (r0 == 0) goto L_0x00fb
                java.util.HashMap r0 = r13.f19587c
                java.lang.Object r0 = r0.remove(r14)
            L_0x00f9:
                r9 = r0
                goto L_0x00fd
            L_0x00fb:
                r14 = r9
                r1 = 0
            L_0x00fd:
                r2 = 1
            L_0x00fe:
                boolean r0 = android.util.Log.isLoggable(r6, r7)
                if (r0 == 0) goto L_0x010b
                if (r1 == 0) goto L_0x010b
                if (r9 != 0) goto L_0x010b
                java.util.Objects.toString(r14)
            L_0x010b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p221q6.C6194m.handleMessage(android.os.Message):boolean");
        }

        /* renamed from: i */
        public final C6192l mo22197i(FragmentManager fragmentManager, android.app.Fragment fragment) {
            C6192l lVar = (C6192l) this.f19587c.get(fragmentManager);
            if (lVar != null) {
                return lVar;
            }
            C6192l lVar2 = (C6192l) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (lVar2 == null) {
                lVar2 = new C6192l();
                lVar2.f19583g = fragment;
                if (!(fragment == null || fragment.getActivity() == null)) {
                    lVar2.mo22182a(fragment.getActivity());
                }
                this.f19587c.put(fragmentManager, lVar2);
                fragmentManager.beginTransaction().add(lVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f19589e.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return lVar2;
        }

        /* renamed from: j */
        public final C6208r mo22198j(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
            C6208r rVar = (C6208r) this.f19588d.get(fragmentManager);
            if (rVar != null) {
                return rVar;
            }
            C6208r rVar2 = (C6208r) fragmentManager.mo3923A("com.bumptech.glide.manager");
            if (rVar2 == null) {
                rVar2 = new C6208r();
                rVar2.f19623g = fragment;
                if (!(fragment == null || fragment.getContext() == null)) {
                    Fragment fragment2 = fragment;
                    while (fragment2.getParentFragment() != null) {
                        fragment2 = fragment2.getParentFragment();
                    }
                    androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                    if (fragmentManager2 != null) {
                        rVar2.mo22211H1(fragment.getContext(), fragmentManager2);
                    }
                }
                this.f19588d.put(fragmentManager, rVar2);
                C0909a aVar = new C0909a(fragmentManager);
                aVar.mo4041e(0, rVar2, "com.bumptech.glide.manager", 1);
                aVar.mo4043i();
                this.f19589e.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return rVar2;
        }

        /* renamed from: k */
        public final C2131j mo22199k(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
            C6208r j = mo22198j(fragmentManager, fragment);
            C2131j jVar = j.f19622f;
            if (jVar == null) {
                jVar = this.f19590f.mo10837a(C2116c.m5520b(context), j.f19618b, j.f19619c, context);
                if (z) {
                    jVar.onStart();
                }
                j.f19622f = jVar;
            }
            return jVar;
        }
    }
