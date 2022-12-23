package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1033p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.video.C22623a;
import com.veriff.sdk.views.C22932d;
import com.veriff.views.VeriffTextView;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.util.C24446b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B?\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcInstructionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/veriff/sdk/views/Screen;", "Lbf0/d;", "onAttachedToWindow", "onDetachedFromWindow", "Lmobi/lab/veriff/databinding/VrffViewNfcIntroBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewNfcIntroBinding;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/internal/video/VideoPlayer;", "tutorialPlayer", "Lcom/veriff/sdk/internal/video/VideoPlayer;", "view", "Lcom/veriff/sdk/views/nfc/NfcInstructionsView;", "getView", "()Lcom/veriff/sdk/views/nfc/NfcInstructionsView;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/p;", "owner", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lcom/veriff/sdk/Strings;", "strings", "", "showOpenPassportInstruction", "Lcom/veriff/sdk/views/nfc/NfcInstructionsView$Listener;", "listener", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/p;Lmobi/lab/veriff/util/Clock;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/Strings;ZLcom/veriff/sdk/views/nfc/NfcInstructionsView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.rs */
public final class C22424rs extends ConstraintLayout implements C22932d {

    /* renamed from: a */
    private final C22424rs f56598a = this;

    /* renamed from: b */
    private final C21783is f56599b = C21783is.nfc_instructions;

    /* renamed from: d */
    private final C22623a f56600d;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/NfcInstructionsView$Listener;", "Lcom/veriff/sdk/internal/video/VideoPlayer$Listener;", "Lbf0/d;", "onCloseClicked", "onContinueClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rs$a */
    public interface C22427a extends C22623a.C22627c {
        /* renamed from: a */
        void mo56504a();

        /* renamed from: b */
        void mo56505b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22424rs(Context context, C1033p pVar, C24446b bVar, C22700xq xqVar, C21616ex exVar, boolean z, final C22427a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(pVar, "owner");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C22652wg a = C22652wg.m55216a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewNfcIntroBinding.…ater.from(context), this)");
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        ImageView imageView = a.f57255a;
        C24362h.m61210e(imageView, "binding.instructionClose");
        imageView.setContentDescription(exVar.mo54719bI());
        a.f57255a.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                aVar.mo56504a();
            }
        });
        a.f57256b.setText(exVar.mo54762bz());
        a.f57256b.setOnClick(new VeriffButton.C24432a() {
            public final void onClick() {
                aVar.mo56505b();
            }
        });
        VeriffTextView veriffTextView = a.f57257c;
        C24362h.m61210e(veriffTextView, "binding.instructionTitle");
        veriffTextView.setText(exVar.mo54845df());
        VeriffTextView veriffTextView2 = a.f57260f;
        C24362h.m61210e(veriffTextView2, "binding.nfcInstructionsP1");
        veriffTextView2.setText(exVar.mo54846dg());
        if (z) {
            VeriffTextView veriffTextView3 = a.f57261g;
            C24362h.m61210e(veriffTextView3, "binding.nfcInstructionsP2");
            veriffTextView3.setText(exVar.mo54848di());
        } else {
            VeriffTextView veriffTextView4 = a.f57261g;
            C24362h.m61210e(veriffTextView4, "binding.nfcInstructionsP2");
            veriffTextView4.setText(exVar.mo54847dh());
        }
        a.f57258d.setColor(xqVar.mo57135v().mo57096k());
        Uri parse = Uri.parse("https://static.veriff.com/r/end-user-backend/assets/videos/nfc/instructions.mp4");
        C24362h.m61210e(parse, "Uri.parse(NFC_VIDEO_URI)");
        SurfaceView surfaceView = a.f57259e;
        C24362h.m61210e(surfaceView, "binding.nfcInstructionsAnimation");
        this.f56600d = new C22623a(context, parse, bVar, surfaceView, pVar, aVar);
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
        return this.f56599b;
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56600d.mo56977a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56600d.mo56978b();
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

    public C22424rs getView() {
        return this.f56598a;
    }
}
