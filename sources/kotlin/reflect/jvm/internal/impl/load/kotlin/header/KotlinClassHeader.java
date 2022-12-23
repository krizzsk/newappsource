package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.Map;
import mf0.C24362h;
import p389bl.C13637c;
import tg0.C24988e;

public final class KotlinClassHeader {

    /* renamed from: a */
    public final Kind f60764a;

    /* renamed from: b */
    public final C24988e f60765b;

    /* renamed from: c */
    public final String[] f60766c;

    /* renamed from: d */
    public final String[] f60767d;

    /* renamed from: e */
    public final String[] f60768e;

    /* renamed from: f */
    public final String f60769f;

    /* renamed from: g */
    public final int f60770g;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C23980a Companion = null;
        /* access modifiers changed from: private */
        public static final Map<Integer, Kind> entryById = null;

        /* renamed from: id */
        private final int f60771id;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a */
        public static final class C23980a {
        }

        /* access modifiers changed from: public */
        static {
            int i;
            Companion = new C23980a();
            Kind[] values = values();
            int z = C13637c.m34083z(values.length);
            if (z < 16) {
                z = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(z);
            int length = values.length;
            while (i < length) {
                Kind kind = values[i];
                i++;
                linkedHashMap.put(Integer.valueOf(kind.getId()), kind);
            }
            entryById = linkedHashMap;
        }

        private Kind(int i) {
            this.f60771id = i;
        }

        public static final Kind getById(int i) {
            Companion.getClass();
            Kind kind = (Kind) entryById.get(Integer.valueOf(i));
            return kind == null ? UNKNOWN : kind;
        }

        public final int getId() {
            return this.f60771id;
        }
    }

    public KotlinClassHeader(Kind kind, C24988e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        C24362h.m61211f(kind, "kind");
        this.f60764a = kind;
        this.f60765b = eVar;
        this.f60766c = strArr;
        this.f60767d = strArr2;
        this.f60768e = strArr3;
        this.f60769f = str;
        this.f60770g = i;
    }

    public final String toString() {
        return this.f60764a + " version=" + this.f60765b;
    }
}
