package n10;

import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.servicealerts.LineServiceAlertDigest;
import p977zz.C20949l;

/* renamed from: n10.d */
public final /* synthetic */ class C18507d implements C20949l {

    /* renamed from: b */
    public final /* synthetic */ SearchLineFragment f47128b;

    /* renamed from: c */
    public final /* synthetic */ SearchLineItem f47129c;

    /* renamed from: d */
    public final /* synthetic */ LineServiceAlertDigest f47130d;

    /* renamed from: e */
    public final /* synthetic */ boolean f47131e;

    public /* synthetic */ C18507d(SearchLineFragment searchLineFragment, SearchLineItem searchLineItem, LineServiceAlertDigest lineServiceAlertDigest, boolean z) {
        this.f47128b = searchLineFragment;
        this.f47129c = searchLineItem;
        this.f47130d = lineServiceAlertDigest;
        this.f47131e = z;
    }

    public final boolean invoke(Object obj) {
        SearchLineFragment searchLineFragment = this.f47128b;
        ((C18504a) obj).mo48148q0(this.f47129c, this.f47130d, searchLineFragment.f41628r, searchLineFragment.f41629s, this.f47131e);
        return true;
    }
}
