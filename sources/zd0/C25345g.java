package zd0;

import com.vungle.warren.p979ui.PresenterAdOpenCallback;

/* renamed from: zd0.g */
public final class C25345g implements PresenterAdOpenCallback {

    /* renamed from: a */
    public final /* synthetic */ C25337d f63706a;

    public C25345g(C25337d dVar) {
        this.f63706a = dVar;
    }

    /* renamed from: a */
    public final void mo58331a(PresenterAdOpenCallback.AdOpenType adOpenType) {
        if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
            this.f63706a.mo61927r("deeplinkSuccess", (String) null);
        }
    }
}
