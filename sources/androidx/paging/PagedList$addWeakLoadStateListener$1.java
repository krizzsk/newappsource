package androidx.paging;

import bf0.C21050d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5824h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n"}, mo59060d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Ln2/h;", "Lbf0/d;", "it", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
public final class PagedList$addWeakLoadStateListener$1 extends Lambda implements C24236l<WeakReference<C24240p<? super LoadType, ? super C5824h, ? extends C21050d>>, Boolean> {

    /* renamed from: f */
    public static final PagedList$addWeakLoadStateListener$1 f4146f = new PagedList$addWeakLoadStateListener$1();

    public PagedList$addWeakLoadStateListener$1() {
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
