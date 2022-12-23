package com.veriff.sdk.views.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.widgets.InertFrameLayout;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "flowContainer", "Lcom/veriff/sdk/internal/widgets/InertFrameLayout;", "getFlowContainer", "()Lcom/veriff/sdk/internal/widgets/InertFrameLayout;", "overlayContainer", "Landroid/view/ViewGroup;", "getOverlayContainer", "()Landroid/view/ViewGroup;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.x */
public final class C22929x extends FrameLayout {

    /* renamed from: a */
    private final InertFrameLayout f58223a;

    /* renamed from: b */
    private final ViewGroup f58224b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22929x(Context context) {
        super(context, (AttributeSet) null, -1);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        View.inflate(context, R$layout.vrff_view_flow, this);
        View findViewById = findViewById(R$id.flow_container);
        C24362h.m61210e(findViewById, "findViewById(R.id.flow_container)");
        this.f58223a = (InertFrameLayout) findViewById;
        View findViewById2 = findViewById(R$id.flow_overlay_container);
        C24362h.m61210e(findViewById2, "findViewById(R.id.flow_overlay_container)");
        this.f58224b = (ViewGroup) findViewById2;
    }

    public final InertFrameLayout getFlowContainer() {
        return this.f58223a;
    }

    public final ViewGroup getOverlayContainer() {
        return this.f58224b;
    }
}
