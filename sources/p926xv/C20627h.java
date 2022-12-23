package p926xv;

import c00.C13733n;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import java.util.Map;

/* renamed from: xv.h */
public final /* synthetic */ class C20627h implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ Map f52149b;

    public /* synthetic */ C20627h(Map map) {
        this.f52149b = map;
    }

    public final Object convert(Object obj) {
        return (SearchLineItem) this.f52149b.get((ServerId) obj);
    }
}
