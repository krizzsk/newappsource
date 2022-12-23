package androidx.paging;

import androidx.paging.PagedList;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, mo59060d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$b;", "it", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
public final class PagedList$addWeakCallback$1 extends Lambda implements C24236l<WeakReference<PagedList.C1090b>, Boolean> {

    /* renamed from: f */
    public static final PagedList$addWeakCallback$1 f4145f = new PagedList$addWeakCallback$1();

    public PagedList$addWeakCallback$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        WeakReference weakReference = (WeakReference) obj;
        C24362h.m61211f(weakReference, "it");
        if (weakReference.get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
