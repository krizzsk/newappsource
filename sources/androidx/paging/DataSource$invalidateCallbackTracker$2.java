package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n"}, mo59060d2 = {"", "Key", "Value", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
public final class DataSource$invalidateCallbackTracker$2 extends Lambda implements C24225a<Boolean> {
    public final /* synthetic */ DataSource<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataSource$invalidateCallbackTracker$2(DataSource<Key, Value> dataSource) {
        super(0);
        this.this$0 = dataSource;
    }

    public final Object invoke() {
        return Boolean.valueOf(this.this$0.f4103a.f18784e);
    }
}
