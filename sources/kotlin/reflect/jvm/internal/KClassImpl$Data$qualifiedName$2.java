package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import ug0.C25065b;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$qualifiedName$2 extends Lambda implements C24225a<String> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$qualifiedName$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final Object invoke() {
        if (this.this$0.f60209c.isAnonymousClass()) {
            return null;
        }
        C25065b r = this.this$0.mo59310r();
        if (r.f63252c) {
            return null;
        }
        return r.mo61569b().mo61580b();
    }
}
