package androidx.paging;

import bf0.C21050d;
import ff0.C23349c;
import java.util.List;
import kotlin.collections.EmptyList;
import lf0.C24225a;
import mf0.C24362h;
import p178n2.C5820d;

public abstract class PagingSource<Key, Value> {

    /* renamed from: a */
    public final C5820d<C24225a<C21050d>> f4148a = new C5820d<>((C24225a) null, PagingSource$invalidateCallbackTracker$1.f4160f);

    /* renamed from: androidx.paging.PagingSource$a */
    public static abstract class C1096a<Key> {

        /* renamed from: a */
        public final int f4149a;

        /* renamed from: b */
        public final boolean f4150b;

        /* renamed from: androidx.paging.PagingSource$a$a */
        public static final class C1097a<Key> extends C1096a<Key> {

            /* renamed from: c */
            public final Key f4151c;

            public C1097a(int i, Object obj, boolean z) {
                super(z, i);
                this.f4151c = obj;
            }

            /* renamed from: a */
            public final Key mo4420a() {
                return this.f4151c;
            }
        }

        /* renamed from: androidx.paging.PagingSource$a$b */
        public static final class C1098b<Key> extends C1096a<Key> {

            /* renamed from: c */
            public final Key f4152c;

            public C1098b(int i, Object obj, boolean z) {
                super(z, i);
                this.f4152c = obj;
            }

            /* renamed from: a */
            public final Key mo4420a() {
                return this.f4152c;
            }
        }

        /* renamed from: androidx.paging.PagingSource$a$c */
        public static final class C1099c<Key> extends C1096a<Key> {

            /* renamed from: c */
            public final Key f4153c;

            public C1099c(int i, Object obj, boolean z) {
                super(z, i);
                this.f4153c = obj;
            }

            /* renamed from: a */
            public final Key mo4420a() {
                return this.f4153c;
            }
        }

        public C1096a(boolean z, int i) {
            this.f4149a = i;
            this.f4150b = z;
        }

        /* renamed from: a */
        public abstract Key mo4420a();
    }

    /* renamed from: androidx.paging.PagingSource$b */
    public static abstract class C1100b<Key, Value> {

        /* renamed from: androidx.paging.PagingSource$b$a */
        public static final class C1101a<Key, Value> extends C1100b<Key, Value> {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1101a)) {
                    return false;
                }
                ((C1101a) obj).getClass();
                return C24362h.m61206a((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Error(throwable=null)";
            }
        }

        /* renamed from: androidx.paging.PagingSource$b$b */
        public static final class C1102b<Key, Value> extends C1100b<Key, Value> {

            /* renamed from: f */
            public static final C1102b f4154f = new C1102b(EmptyList.f60173b, (Object) null, (Object) null, 0, 0);

            /* renamed from: a */
            public final List<Value> f4155a;

            /* renamed from: b */
            public final Key f4156b;

            /* renamed from: c */
            public final Key f4157c;

            /* renamed from: d */
            public final int f4158d;

            /* renamed from: e */
            public final int f4159e;

            public C1102b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                boolean z;
                C24362h.m61211f(list, "data");
                this.f4155a = list;
                this.f4156b = key;
                this.f4157c = key2;
                this.f4158d = i;
                this.f4159e = i2;
                boolean z2 = false;
                if (i == Integer.MIN_VALUE || i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!((i2 == Integer.MIN_VALUE || i2 >= 0) ? true : z2)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1102b)) {
                    return false;
                }
                C1102b bVar = (C1102b) obj;
                return C24362h.m61206a(this.f4155a, bVar.f4155a) && C24362h.m61206a(this.f4156b, bVar.f4156b) && C24362h.m61206a(this.f4157c, bVar.f4157c) && this.f4158d == bVar.f4158d && this.f4159e == bVar.f4159e;
            }

            public final int hashCode() {
                int hashCode = this.f4155a.hashCode() * 31;
                Key key = this.f4156b;
                int i = 0;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f4157c;
                if (key2 != null) {
                    i = key2.hashCode();
                }
                return ((((hashCode2 + i) * 31) + this.f4158d) * 31) + this.f4159e;
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("Page(data=");
                k.append(this.f4155a);
                k.append(", prevKey=");
                k.append(this.f4156b);
                k.append(", nextKey=");
                k.append(this.f4157c);
                k.append(", itemsBefore=");
                k.append(this.f4158d);
                k.append(", itemsAfter=");
                return C16530d.m42014g(k, this.f4159e, ')');
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo4402a(C1096a<Key> aVar, C23349c<? super C1100b<Key, Value>> cVar);
}
