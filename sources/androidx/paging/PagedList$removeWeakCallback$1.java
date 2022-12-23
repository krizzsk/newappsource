package androidx.paging;

import androidx.paging.PagedList;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p178n2.C5817b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, mo59060d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$b;", "it", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
final class PagedList$removeWeakCallback$1 extends Lambda implements C24236l<WeakReference<PagedList.C1090b>, Boolean> {
    public final /* synthetic */ PagedList.C1090b $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedList$removeWeakCallback$1(C5817b bVar) {
        super(1);
        this.$callback = bVar;
    }

    public final Object invoke(Object obj) {
        boolean z;
        WeakReference weakReference = (WeakReference) obj;
        C24362h.m61211f(weakReference, "it");
        if (weakReference.get() == null || weakReference.get() == this.$callback) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
