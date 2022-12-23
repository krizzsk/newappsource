package p178n2;

import androidx.paging.DataSource;
import androidx.paging.LegacyPagingSource;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mf0.C24359e;
import mf0.C24362h;

/* renamed from: n2.f */
public final /* synthetic */ class C5822f implements DataSource.C1085b, C24359e {

    /* renamed from: a */
    public final /* synthetic */ LegacyPagingSource<Object, Object> f18786a;

    public C5822f(LegacyPagingSource<Object, Object> legacyPagingSource) {
        this.f18786a = legacyPagingSource;
    }

    /* renamed from: a */
    public final FunctionReferenceImpl mo21692a() {
        return new FunctionReferenceImpl(0, this.f18786a, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
    }

    /* renamed from: b */
    public final void mo4401b() {
        this.f18786a.f4148a.mo21690a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataSource.C1085b) || !(obj instanceof C24359e)) {
            return false;
        }
        return C24362h.m61206a(mo21692a(), ((C24359e) obj).mo21692a());
    }

    public final int hashCode() {
        return mo21692a().hashCode();
    }
}
