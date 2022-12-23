package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.views.VeriffTextView;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.layouts.VeriffButton;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/views/finished/ui/FinishedView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "strings", "Lcom/veriff/sdk/Strings;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "listener", "Lcom/veriff/sdk/views/finished/ui/FinishedView$Listener;", "(Landroid/content/Context;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/finished/ui/FinishedView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.qi */
public final class C22323qi extends FrameLayout {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo59060d2 = {"Lcom/veriff/sdk/views/finished/ui/FinishedView$Listener;", "", "Lbf0/d;", "onDoneClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qi$a */
    public interface C22325a {
        /* renamed from: a */
        void mo56333a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22323qi(Context context, C21789ix ixVar, C21616ex exVar, C22700xq xqVar, final C22325a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C22647wb a = C22647wb.m55206a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewFinishedBinding.…rom(context), this, true)");
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        a.f57218c.setOnClick(new VeriffButton.C24432a() {
            public final void onClick() {
                aVar.mo56333a();
            }
        });
        VeriffTextView veriffTextView = a.f57217b;
        C24362h.m61210e(veriffTextView, "binding.completeTitle");
        veriffTextView.setText(exVar.mo54700ar());
        a.f57216a.setImageDrawable(xqVar.mo57112a(R$drawable.vrff_ic_check));
        a.f57218c.setText(exVar.mo54704av());
        if (ixVar.mo55459k()) {
            VeriffTextView veriffTextView2 = a.f57220f;
            C24362h.m61210e(veriffTextView2, "binding.uploadFinishedTitle");
            veriffTextView2.setText(exVar.mo54843dd());
            VeriffTextView veriffTextView3 = a.f57219e;
            C24362h.m61210e(veriffTextView3, "binding.uploadFinishedDescription");
            veriffTextView3.setText(exVar.mo54844de());
            return;
        }
        VeriffTextView veriffTextView4 = a.f57220f;
        C24362h.m61210e(veriffTextView4, "binding.uploadFinishedTitle");
        veriffTextView4.setText(exVar.mo54701as());
        VeriffTextView veriffTextView5 = a.f57219e;
        C24362h.m61210e(veriffTextView5, "binding.uploadFinishedDescription");
        veriffTextView5.setText(exVar.mo54702at());
    }
}
