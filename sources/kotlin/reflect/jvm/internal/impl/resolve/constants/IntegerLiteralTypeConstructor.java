package kotlin.reflect.jvm.internal.impl.resolve.constants;

import bf0.C21049c;
import cf0.C21140n;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C23812a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import lh0.C24274i0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mf0.C24369n;
import nf0.C24497a;
import nf0.C24498b;
import zf0.C25437e;
import zf0.C25448i0;
import zf0.C25485t;

public final class IntegerLiteralTypeConstructor implements C24274i0 {

    /* renamed from: a */
    public final long f61199a;

    /* renamed from: b */
    public final C25485t f61200b;

    /* renamed from: c */
    public final Set<C24307v> f61201c;

    /* renamed from: d */
    public final C24312z f61202d = KotlinTypeFactory.m60475d(this);

    /* renamed from: e */
    public final C21049c f61203e = C23812a.m58432b(new IntegerLiteralTypeConstructor$supertypes$2(this));

    public static final class Companion {

        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$Companion$a */
        public /* synthetic */ class C24117a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61204a;

            static {
                int[] iArr = new int[Mode.values().length];
                iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                f61204a = iArr;
            }
        }

        /* renamed from: a */
        public static C24312z m60279a(ArrayList arrayList) {
            C24312z zVar;
            Set<T> set;
            Mode mode = Mode.INTERSECTION_TYPE;
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                C24312z zVar2 = it.next();
                while (it.hasNext()) {
                    C24312z zVar3 = (C24312z) it.next();
                    C24312z zVar4 = (C24312z) zVar2;
                    if (!(zVar4 == null || zVar3 == null)) {
                        C24274i0 O0 = zVar4.mo60411O0();
                        C24274i0 O02 = zVar3.mo60411O0();
                        boolean z = O0 instanceof IntegerLiteralTypeConstructor;
                        if (z && (O02 instanceof IntegerLiteralTypeConstructor)) {
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) O0;
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (IntegerLiteralTypeConstructor) O02;
                            int i = C24117a.f61204a[mode.ordinal()];
                            if (i == 1) {
                                Set<C24307v> set2 = integerLiteralTypeConstructor.f61201c;
                                Set<C24307v> set3 = integerLiteralTypeConstructor2.f61201c;
                                C24362h.m61211f(set2, "<this>");
                                C24362h.m61211f(set3, InneractiveMediationNameConsts.OTHER);
                                set = C23825c.m58502N0(set2);
                                if (!(set instanceof C24497a) || (set instanceof C24498b)) {
                                    set.retainAll(set3);
                                } else {
                                    C24369n.m61247c(set, "kotlin.collections.MutableCollection");
                                    throw null;
                                }
                            } else if (i == 2) {
                                Set<C24307v> set4 = integerLiteralTypeConstructor.f61201c;
                                Set<C24307v> set5 = integerLiteralTypeConstructor2.f61201c;
                                C24362h.m61211f(set4, "<this>");
                                C24362h.m61211f(set5, InneractiveMediationNameConsts.OTHER);
                                set = C23825c.m58502N0(set4);
                                C21140n.m49439a0(set5, set);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            zVar = KotlinTypeFactory.m60475d(new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f61199a, integerLiteralTypeConstructor.f61200b, set));
                            zVar2 = zVar;
                        } else if (z) {
                            if (((IntegerLiteralTypeConstructor) O0).f61201c.contains(zVar3)) {
                                zVar = zVar3;
                                zVar2 = zVar;
                            }
                        } else if ((O02 instanceof IntegerLiteralTypeConstructor) && ((IntegerLiteralTypeConstructor) O02).f61201c.contains(zVar4)) {
                            zVar = zVar4;
                            zVar2 = zVar;
                        }
                    }
                    zVar = null;
                    zVar2 = zVar;
                }
                return (C24312z) zVar2;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    public IntegerLiteralTypeConstructor(long j, C25485t tVar, Set<? extends C24307v> set) {
        this.f61199a = j;
        this.f61200b = tVar;
        this.f61201c = set;
    }

    public final List<C25448i0> getParameters() {
        return EmptyList.f60173b;
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        return this.f61200b.mo59460m();
    }

    /* renamed from: n */
    public final Collection<C24307v> mo53459n() {
        return (List) this.f61203e.getValue();
    }

    /* renamed from: o */
    public final C25437e mo53460o() {
        return null;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return false;
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q('[');
        q.append(C23825c.m58520q0(this.f61201c, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, (String) null, (String) null, IntegerLiteralTypeConstructor$valueToString$1.f61205f, 30));
        q.append(']');
        return C24362h.m61216k(q.toString(), "IntegerLiteralType");
    }
}
