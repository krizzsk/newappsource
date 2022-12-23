package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import p178n2.C5820d;

public abstract class DataSource<Key, Value> {

    /* renamed from: a */
    public final C5820d<C1085b> f4103a = new C5820d<>(new DataSource$invalidateCallbackTracker$2(this), DataSource$invalidateCallbackTracker$1.f4114f);

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroidx/paging/DataSource$KeyType;", "", "(Ljava/lang/String;I)V", "POSITIONAL", "PAGE_KEYED", "ITEM_KEYED", "paging-common"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    /* renamed from: androidx.paging.DataSource$a */
    public static final class C1084a<Value> {

        /* renamed from: a */
        public final List<Value> f4104a;

        /* renamed from: b */
        public final Object f4105b;

        /* renamed from: c */
        public final Object f4106c;

        /* renamed from: d */
        public final int f4107d;

        /* renamed from: e */
        public final int f4108e;

        public C1084a(List list, Integer num, Integer num2, int i, int i2) {
            C24362h.m61211f(list, "data");
            this.f4104a = list;
            this.f4105b = num;
            this.f4106c = num2;
            this.f4107d = i;
            this.f4108e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            } else if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1084a)) {
                return false;
            }
            C1084a aVar = (C1084a) obj;
            if (!C24362h.m61206a(this.f4104a, aVar.f4104a) || !C24362h.m61206a(this.f4105b, aVar.f4105b) || !C24362h.m61206a(this.f4106c, aVar.f4106c) || this.f4107d != aVar.f4107d || this.f4108e != aVar.f4108e) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.paging.DataSource$b */
    public interface C1085b {
        /* renamed from: b */
        void mo4401b();
    }

    /* renamed from: androidx.paging.DataSource$c */
    public static final class C1086c<K> {

        /* renamed from: a */
        public final LoadType f4109a;

        /* renamed from: b */
        public final K f4110b;

        /* renamed from: c */
        public final int f4111c;

        /* renamed from: d */
        public final boolean f4112d;

        /* renamed from: e */
        public final int f4113e;

        public C1086c(LoadType loadType, K k, int i, boolean z, int i2) {
            C24362h.m61211f(loadType, "type");
            this.f4109a = loadType;
            this.f4110b = k;
            this.f4111c = i;
            this.f4112d = z;
            this.f4113e = i2;
            if (loadType != LoadType.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    public DataSource(KeyType keyType) {
        C24362h.m61211f(keyType, "type");
    }
}
