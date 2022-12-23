package com.veriff.sdk.views.camera;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C22512sg;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.C22932d;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/LoadingScreen;", "Lcom/veriff/sdk/views/Screen;", "context", "Landroid/content/Context;", "res", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;)V", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "view", "Lcom/veriff/sdk/views/sessionstart/ui/LoadingView;", "getView", "()Lcom/veriff/sdk/views/sessionstart/ui/LoadingView;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.y */
public final class C22930y implements C22932d {

    /* renamed from: a */
    private final C22512sg f58225a;

    /* renamed from: b */
    private final C21783is f58226b = C21783is.unknown;

    public C22930y(Context context, C22700xq xqVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xqVar, "res");
        this.f58225a = new C22512sg(context, xqVar);
    }

    /* renamed from: a */
    public C22512sg getView() {
        return this.f58225a;
    }

    public void create() {
        C22932d.C22933a.m56592b(this);
    }

    public void destroy() {
        C22932d.C22933a.m56597g(this);
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return C22932d.C22933a.m56598h(this);
    }

    public C21783is getPage() {
        return this.f58226b;
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public void pause() {
        C22932d.C22933a.m56595e(this);
    }

    public void resume() {
        C22932d.C22933a.m56594d(this);
    }

    public void start() {
        C22932d.C22933a.m56593c(this);
    }

    public void stop() {
        C22932d.C22933a.m56596f(this);
    }
}
