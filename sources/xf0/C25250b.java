package xf0;

import ag0.C20989e;
import bf0.C21050d;
import cf0.C21136j;
import cg0.C21154b;
import cg0.C21180k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kh0.C23792h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24255b;
import lh0.C24274i0;
import lh0.C24285n0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import p583jk.C17875h;
import rf0.C24805g;
import rf0.C24806h;
import ug0.C25065b;
import ug0.C25069e;
import wf0.C25137a;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25443g0;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25481p;
import zf0.C25485t;
import zf0.C25486u;

/* renamed from: xf0.b */
public final class C25250b extends C21154b {

    /* renamed from: m */
    public static final C25065b f63524m = new C25065b(C23872e.f60330i, C25069e.m62820i("Function"));

    /* renamed from: n */
    public static final C25065b f63525n = new C25065b(C23872e.f60327f, C25069e.m62820i("KFunction"));

    /* renamed from: f */
    public final C23792h f63526f;

    /* renamed from: g */
    public final C25486u f63527g;

    /* renamed from: h */
    public final FunctionClassKind f63528h;

    /* renamed from: i */
    public final int f63529i;

    /* renamed from: j */
    public final C25251a f63530j = new C25251a(this);

    /* renamed from: k */
    public final C25253c f63531k;

    /* renamed from: l */
    public final List<C25448i0> f63532l;

    /* renamed from: xf0.b$a */
    public final class C25251a extends C24255b {

        /* renamed from: c */
        public final /* synthetic */ C25250b f63533c;

        /* renamed from: xf0.b$a$a */
        public /* synthetic */ class C25252a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63534a;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                iArr[FunctionClassKind.Function.ordinal()] = 1;
                iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                f63534a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25251a(C25250b bVar) {
            super(bVar.f63526f);
            C24362h.m61211f(bVar, "this$0");
            this.f63533c = bVar;
        }

        /* renamed from: c */
        public final Collection<C24307v> mo53486c() {
            List<C25065b> list;
            boolean z;
            List<T> list2;
            int i = C25252a.f63534a[this.f63533c.f63528h.ordinal()];
            if (i == 1) {
                list = C17875h.m44280D(C25250b.f63524m);
            } else if (i == 2) {
                list = C17875h.m44281E(C25250b.f63525n, new C25065b(C23872e.f60330i, FunctionClassKind.Function.numberedClassName(this.f63533c.f63529i)));
            } else if (i == 3) {
                list = C17875h.m44280D(C25250b.f63524m);
            } else if (i == 4) {
                list = C17875h.m44281E(C25250b.f63525n, new C25065b(C23872e.f60324c, FunctionClassKind.SuspendFunction.numberedClassName(this.f63533c.f63529i)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C25485t b = this.f63533c.f63527g.mo53399b();
            ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
            for (C25065b bVar : list) {
                C25432c a = FindClassInModuleKt.m58735a(b, bVar);
                if (a != null) {
                    List<C25448i0> list3 = this.f63533c.f63532l;
                    int size = a.mo53481j().getParameters().size();
                    C24362h.m61211f(list3, "<this>");
                    if (size >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (size == 0) {
                            list2 = EmptyList.f60173b;
                        } else {
                            int size2 = list3.size();
                            if (size >= size2) {
                                list2 = C23825c.m58499K0(list3);
                            } else if (size == 1) {
                                list2 = C17875h.m44280D(C23825c.m58522s0(list3));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list3 instanceof RandomAccess) {
                                    for (int i2 = size2 - size; i2 < size2; i2++) {
                                        arrayList2.add(list3.get(i2));
                                    }
                                } else {
                                    ListIterator<C25448i0> listIterator = list3.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                list2 = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C21136j.m49436X(list2, 10));
                        for (T q : list2) {
                            arrayList3.add(new C24285n0(q.mo53412q()));
                        }
                        arrayList.add(KotlinTypeFactory.m60476e(C20989e.C20990a.f52739a, a, arrayList3));
                    } else {
                        throw new IllegalArgumentException(C25541a.m63878h("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return C23825c.m58499K0(arrayList);
        }

        /* renamed from: f */
        public final C25443g0 mo53488f() {
            return C25443g0.C25444a.f63738a;
        }

        public final List<C25448i0> getParameters() {
            return this.f63533c.f63532l;
        }

        /* renamed from: k */
        public final C25432c mo59523k() {
            return this.f63533c;
        }

        /* renamed from: o */
        public final C25437e mo53460o() {
            return this.f63533c;
        }

        /* renamed from: p */
        public final boolean mo53461p() {
            return true;
        }

        public final String toString() {
            return this.f63533c.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25250b(C23792h hVar, C25137a aVar, FunctionClassKind functionClassKind, int i) {
        super(hVar, functionClassKind.numberedClassName(i));
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(aVar, "containingDeclaration");
        C24362h.m61211f(functionClassKind, "functionKind");
        this.f63526f = hVar;
        this.f63527g = aVar;
        this.f63528h = functionClassKind;
        this.f63529i = i;
        this.f63531k = new C25253c(hVar, this);
        ArrayList arrayList = new ArrayList();
        C24806h hVar2 = new C24806h(1, i);
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(hVar2, 10));
        C24805g p = hVar2.iterator();
        while (p.f62733d) {
            arrayList.add(C21180k0.m49655R0(this, Variance.IN_VARIANCE, C25069e.m62820i(C24362h.m61216k(Integer.valueOf(p.nextInt()), "P")), arrayList.size(), this.f63526f));
            arrayList2.add(C21050d.f52856a);
        }
        arrayList.add(C21180k0.m49655R0(this, Variance.OUT_VARIANCE, C25069e.m62820i("R"), arrayList.size(), this.f63526f));
        this.f63532l = C23825c.m58499K0(arrayList);
    }

    /* renamed from: B */
    public final Collection mo53504B() {
        return EmptyList.f60173b;
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this.f63531k;
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return false;
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ C25430b mo53507H() {
        return null;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        return this.f63527g;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return false;
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return C25435d0.f63736a;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25455m.C25463h hVar = C25455m.f63744e;
        C24362h.m61210e(hVar, "PUBLIC");
        return hVar;
    }

    public final C20989e getAnnotations() {
        return C20989e.C20990a.f52739a;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        return false;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        return this.f63530j;
    }

    /* renamed from: k */
    public final Collection mo53511k() {
        return EmptyList.f60173b;
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return false;
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        return ClassKind.INTERFACE;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        return this.f63532l;
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        return MemberScope.C24119a.f61217b;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        return Modality.ABSTRACT;
    }

    /* renamed from: s0 */
    public final /* bridge */ /* synthetic */ C25432c mo53516s0() {
        return null;
    }

    public final String toString() {
        String f = getName().mo61604f();
        C24362h.m61210e(f, "name.asString()");
        return f;
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        return null;
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        return false;
    }
}
