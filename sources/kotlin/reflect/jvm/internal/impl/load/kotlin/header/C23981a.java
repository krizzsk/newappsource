package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.metadata.MediationMetaData;
import eg0.C23291b;
import hg0.C23480p;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import qg0.C24757k;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import zg0.C25497f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a */
public final class C23981a implements C24757k.C24760c {

    /* renamed from: i */
    public static final boolean f60772i = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: j */
    public static final HashMap f60773j;

    /* renamed from: a */
    public int[] f60774a = null;

    /* renamed from: b */
    public String f60775b = null;

    /* renamed from: c */
    public int f60776c = 0;

    /* renamed from: d */
    public String[] f60777d = null;

    /* renamed from: e */
    public String[] f60778e = null;

    /* renamed from: f */
    public String[] f60779f = null;

    /* renamed from: g */
    public KotlinClassHeader.Kind f60780g = null;

    /* renamed from: h */
    public String[] f60781h = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a */
    public static abstract class C23982a implements C24757k.C24759b {

        /* renamed from: a */
        public final ArrayList f60782a = new ArrayList();

        /* renamed from: a */
        public final void mo59593a() {
            mo59598f((String[]) this.f60782a.toArray(new String[0]));
        }

        /* renamed from: b */
        public final void mo59594b(C25065b bVar, C25069e eVar) {
        }

        /* renamed from: c */
        public final void mo59595c(Object obj) {
            if (obj instanceof String) {
                this.f60782a.add((String) obj);
            }
        }

        /* renamed from: d */
        public final void mo59596d(C25497f fVar) {
        }

        /* renamed from: e */
        public final C24757k.C24758a mo59597e(C25065b bVar) {
            return null;
        }

        /* renamed from: f */
        public abstract void mo59598f(String[] strArr);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$b */
    public class C23983b implements C24757k.C24758a {
        public C23983b() {
        }

        /* renamed from: a */
        public final void mo59599a() {
        }

        /* renamed from: b */
        public final C24757k.C24758a mo59600b(C25065b bVar, C25069e eVar) {
            return null;
        }

        /* renamed from: c */
        public final C24757k.C24759b mo59601c(C25069e eVar) {
            String f = eVar.mo61604f();
            if ("d1".equals(f)) {
                return new C23985b(this);
            }
            if ("d2".equals(f)) {
                return new C23986c(this);
            }
            if ("si".equals(f)) {
                return new C23987d(this);
            }
            return null;
        }

        /* renamed from: d */
        public final void mo59602d(C25069e eVar, C25497f fVar) {
        }

        /* renamed from: e */
        public final void mo59603e(C25069e eVar, C25065b bVar, C25069e eVar2) {
        }

        /* renamed from: f */
        public final void mo59604f(Object obj, C25069e eVar) {
            String f = eVar.mo61604f();
            if ("k".equals(f)) {
                if (obj instanceof Integer) {
                    C23981a.this.f60780g = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                }
            } else if ("mv".equals(f)) {
                if (obj instanceof int[]) {
                    C23981a.this.f60774a = (int[]) obj;
                }
            } else if ("xs".equals(f)) {
                if (obj instanceof String) {
                    C23981a.this.f60775b = (String) obj;
                }
            } else if ("xi".equals(f)) {
                if (obj instanceof Integer) {
                    C23981a.this.f60776c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(f) && (obj instanceof String)) {
                String str = (String) obj;
                C23981a.this.getClass();
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c */
    public class C23984c implements C24757k.C24758a {
        public C23984c() {
        }

        /* renamed from: a */
        public final void mo59599a() {
        }

        /* renamed from: b */
        public final C24757k.C24758a mo59600b(C25065b bVar, C25069e eVar) {
            return null;
        }

        /* renamed from: c */
        public final C24757k.C24759b mo59601c(C25069e eVar) {
            String f = eVar.mo61604f();
            if ("data".equals(f) || "filePartClassNames".equals(f)) {
                return new C23988e(this);
            }
            if ("strings".equals(f)) {
                return new C23989f(this);
            }
            return null;
        }

        /* renamed from: d */
        public final void mo59602d(C25069e eVar, C25497f fVar) {
        }

        /* renamed from: e */
        public final void mo59603e(C25069e eVar, C25065b bVar, C25069e eVar2) {
        }

        /* renamed from: f */
        public final void mo59604f(Object obj, C25069e eVar) {
            String str;
            String f = eVar.mo61604f();
            if (MediationMetaData.KEY_VERSION.equals(f)) {
                if (obj instanceof int[]) {
                    C23981a.this.f60774a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(f)) {
                C23981a aVar = C23981a.this;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                aVar.f60775b = str;
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f60773j = hashMap;
        hashMap.put(C25065b.m62790l(new C25066c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(C25065b.m62790l(new C25066c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(C25065b.m62790l(new C25066c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(C25065b.m62790l(new C25066c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(C25065b.m62790l(new C25066c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* renamed from: a */
    public final void mo59591a() {
    }

    /* renamed from: b */
    public final C24757k.C24758a mo59592b(C25065b bVar, C23291b bVar2) {
        KotlinClassHeader.Kind kind;
        if (bVar.mo61569b().equals(C23480p.f59268a)) {
            return new C23983b();
        }
        if (f60772i || this.f60780g != null || (kind = (KotlinClassHeader.Kind) f60773j.get(bVar)) == null) {
            return null;
        }
        this.f60780g = kind;
        return new C23984c();
    }
}
