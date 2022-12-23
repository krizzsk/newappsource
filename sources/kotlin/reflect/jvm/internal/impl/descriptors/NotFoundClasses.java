package kotlin.reflect.jvm.internal.impl.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cg0.C21179k;
import cg0.C21180k0;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kh0.C23787c;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24264f;
import lh0.C24274i0;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import p583jk.C17884p;
import p584jl.C17885a;
import rf0.C24805g;
import rf0.C24806h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25434d;
import zf0.C25435d0;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25481p;
import zf0.C25485t;
import zf0.C25486u;

public final class NotFoundClasses {

    /* renamed from: a */
    public final C23792h f60419a;

    /* renamed from: b */
    public final C25485t f60420b;

    /* renamed from: c */
    public final C23787c<C25066c, C25486u> f60421c;

    /* renamed from: d */
    public final C23787c<C23888a, C25432c> f60422d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$a */
    public static final class C23888a {

        /* renamed from: a */
        public final C25065b f60423a;

        /* renamed from: b */
        public final List<Integer> f60424b;

        public C23888a(C25065b bVar, List<Integer> list) {
            C24362h.m61211f(bVar, "classId");
            C24362h.m61211f(list, "typeParametersCount");
            this.f60423a = bVar;
            this.f60424b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23888a)) {
                return false;
            }
            C23888a aVar = (C23888a) obj;
            return C24362h.m61206a(this.f60423a, aVar.f60423a) && C24362h.m61206a(this.f60424b, aVar.f60424b);
        }

        public final int hashCode() {
            return this.f60424b.hashCode() + (this.f60423a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ClassRequest(classId=");
            k.append(this.f60423a);
            k.append(", typeParametersCount=");
            return C13555b.m33970i(k, this.f60424b, ')');
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$b */
    public static final class C23889b extends C21179k {

        /* renamed from: i */
        public final boolean f60425i;

        /* renamed from: j */
        public final ArrayList f60426j;

        /* renamed from: k */
        public final C24264f f60427k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23889b(C23792h hVar, C25434d dVar, C25069e eVar, boolean z, int i) {
            super(hVar, dVar, eVar, C25435d0.f63736a);
            C24362h.m61211f(hVar, "storageManager");
            C24362h.m61211f(dVar, "container");
            this.f60425i = z;
            C24806h C0 = C17885a.m44393C0(0, i);
            ArrayList arrayList = new ArrayList(C21136j.m49436X(C0, 10));
            C24805g p = C0.iterator();
            while (p.f62733d) {
                int nextInt = p.nextInt();
                arrayList.add(C21180k0.m49655R0(this, Variance.INVARIANT, C25069e.m62820i(C24362h.m61216k(Integer.valueOf(nextInt), RequestConfiguration.MAX_AD_CONTENT_RATING_T)), nextInt, hVar));
            }
            this.f60426j = arrayList;
            this.f60427k = new C24264f(this, TypeParameterUtilsKt.m58768b(this), C17884p.m44348S(DescriptorUtilsKt.m60289j(this).mo59460m().mo59383f()), hVar);
        }

        /* renamed from: B */
        public final Collection<C25432c> mo53504B() {
            return EmptyList.f60173b;
        }

        /* renamed from: C */
        public final MemberScope mo53505C(C24378d dVar) {
            C24362h.m61211f(dVar, "kotlinTypeRefiner");
            return MemberScope.C24119a.f61217b;
        }

        /* renamed from: E */
        public final boolean mo53506E() {
            return this.f60425i;
        }

        /* renamed from: H */
        public final C25430b mo53507H() {
            return null;
        }

        /* renamed from: a0 */
        public final boolean mo53427a0() {
            return false;
        }

        /* renamed from: c0 */
        public final boolean mo53428c0() {
            return false;
        }

        /* renamed from: d0 */
        public final boolean mo53509d0() {
            return false;
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
            return this.f60427k;
        }

        /* renamed from: k */
        public final Collection<C25430b> mo53511k() {
            return EmptySet.f60175b;
        }

        /* renamed from: o0 */
        public final boolean mo53512o0() {
            return false;
        }

        /* renamed from: p */
        public final ClassKind mo53513p() {
            return ClassKind.CLASS;
        }

        /* renamed from: p0 */
        public final boolean mo53434p0() {
            return false;
        }

        /* renamed from: r */
        public final List<C25448i0> mo53514r() {
            return this.f60426j;
        }

        /* renamed from: r0 */
        public final MemberScope mo53515r0() {
            return MemberScope.C24119a.f61217b;
        }

        /* renamed from: s */
        public final Modality mo53436s() {
            return Modality.FINAL;
        }

        /* renamed from: s0 */
        public final C25432c mo53516s0() {
            return null;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("class ");
            k.append(getName());
            k.append(" (not found)");
            return k.toString();
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

    public NotFoundClasses(C23792h hVar, C25485t tVar) {
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(tVar, "module");
        this.f60419a = hVar;
        this.f60420b = tVar;
        this.f60421c = hVar.mo59020e(new NotFoundClasses$packageFragments$1(this));
        this.f60422d = hVar.mo59020e(new NotFoundClasses$classes$1(this));
    }

    /* renamed from: a */
    public final C25432c mo59412a(C25065b bVar, List<Integer> list) {
        C24362h.m61211f(bVar, "classId");
        C24362h.m61211f(list, "typeParametersCount");
        return (C25432c) ((LockBasedStorageManager.C24148k) this.f60422d).invoke(new C23888a(bVar, list));
    }
}
