package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.appboy.models.MessageButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.internal.C22016mi;
import com.veriff.sdk.internal.C22023ml;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.R$drawable;
import p090g1.C4732a;
import p116i1.C5247f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/view/LegacyBarcodeView;", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "", "text", "Lbf0/d;", "setTitleText", "setGuideText", "resetToScanning", "showError", "showProcessing", "showSuccess", "Lcom/veriff/sdk/camera/view/PreviewView;", "previewView", "Lcom/veriff/sdk/camera/view/PreviewView;", "getPreviewView", "()Lcom/veriff/sdk/camera/view/PreviewView;", "Landroid/widget/FrameLayout;", "inflowErrorTips", "Landroid/widget/FrameLayout;", "getInflowErrorTips", "()Landroid/widget/FrameLayout;", "Lmobi/lab/veriff/databinding/VrffViewBarcodeBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewBarcodeBinding;", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "listener", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "loading", "Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "getLoading", "()Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/Strings;", "strings", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.mm */
public final class C22026mm extends C22023ml {

    /* renamed from: a */
    private final C22638vt f55564a;

    /* renamed from: b */
    private final PreviewView f55565b;

    /* renamed from: c */
    private final FrameLayout f55566c;

    /* renamed from: d */
    private final C22633vo f55567d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22023ml.C22024a f55568e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/internal/ui/barcode/view/LegacyBarcodeView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mm$a */
    public static final class C22028a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22026mm f55570a;

        /* renamed from: b */
        public final /* synthetic */ C21616ex f55571b;

        public C22028a(C22026mm mmVar, C21616ex exVar) {
            this.f55570a = mmVar;
            this.f55571b = exVar;
        }

        public final void onClick(View view) {
            this.f55570a.f55568e.mo55854a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22026mm(Context context, C21616ex exVar, C22700xq xqVar, C22023ml.C22024a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f55568e = aVar;
        C22638vt a = C22638vt.m55186a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewBarcodeBinding.i…ater.from(context), this)");
        this.f55564a = a;
        PreviewView previewView = a.f57138c;
        C24362h.m61210e(previewView, "binding.barcodePreview");
        this.f55565b = previewView;
        FrameLayout frameLayout = a.f57143j;
        C24362h.m61210e(frameLayout, "binding.inflowErrorTips");
        this.f55566c = frameLayout;
        C22633vo voVar = a.f57144k;
        C24362h.m61210e(voVar, "binding.loading");
        this.f55567d = voVar;
        C22633vo voVar2 = a.f57144k;
        C24362h.m61210e(voVar2, "binding.loading");
        voVar2.mo56989a().setBackgroundColor(xqVar.mo57135v().mo57096k());
        ProgressBar progressBar = a.f57144k.f57105b;
        C24362h.m61210e(progressBar, "binding.loading.progressBar");
        progressBar.setIndeterminateDrawable(xqVar.mo57124k());
        TextView textView = a.f57146m;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setText(exVar.mo54756bt());
        TextView textView2 = a.f57149p;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setText(exVar.mo54755bs());
        ImageView imageView = a.f57136a;
        imageView.setContentDescription(exVar.mo54719bI());
        imageView.setOnClickListener(new C22028a(this, exVar));
        if (xqVar.mo57114a()) {
            ProgressBar progressBar2 = a.f57147n;
            C24362h.m61210e(progressBar2, "binding.scanProgress");
            progressBar2.setIndeterminateDrawable(C4732a.getDrawable(getContext(), R$drawable.vrff_ic_progress_indefinite_small));
        }
        a.f57143j.addView(new C22016mi(context, xqVar.mo57135v(), exVar, new C22016mi.C22019c(this) {

            /* renamed from: a */
            public final /* synthetic */ C22026mm f55569a;

            {
                this.f55569a = r1;
            }

            /* renamed from: a */
            public void mo55838a() {
                this.f55569a.f55568e.mo55854a();
            }

            /* renamed from: b */
            public void mo55839b() {
                this.f55569a.f55568e.mo55855b();
            }
        }));
    }

    /* renamed from: b */
    public void mo55843b() {
        ProgressBar progressBar = this.f55564a.f57147n;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(0);
        ImageView imageView = this.f55564a.f57148o;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55564a.f57145l;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55564a.f57146m;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55564a.f57149p;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        ImageView imageView3 = this.f55564a.f57140f;
        Resources resources = getResources();
        int i = R$color.vrffBarcodeGreen;
        imageView3.setColorFilter(C5247f.m13262a(resources, i));
        this.f55564a.f57142h.setColorFilter(C5247f.m13262a(getResources(), i));
    }

    /* renamed from: c */
    public void mo55844c() {
        ProgressBar progressBar = this.f55564a.f57147n;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55564a.f57148o;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(0);
        ImageView imageView2 = this.f55564a.f57145l;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55564a.f57146m;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55564a.f57149p;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(0);
        ImageView imageView3 = this.f55564a.f57140f;
        Resources resources = getResources();
        int i = R$color.vrffBarcodeGreen;
        imageView3.setColorFilter(C5247f.m13262a(resources, i));
        this.f55564a.f57142h.setColorFilter(C5247f.m13262a(getResources(), i));
    }

    /* renamed from: d */
    public void mo55845d() {
        ProgressBar progressBar = this.f55564a.f57147n;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55564a.f57148o;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55564a.f57145l;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(0);
        TextView textView = this.f55564a.f57146m;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(0);
        TextView textView2 = this.f55564a.f57149p;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        this.f55564a.f57140f.clearColorFilter();
        this.f55564a.f57142h.clearColorFilter();
    }

    public FrameLayout getInflowErrorTips() {
        return this.f55566c;
    }

    public C22633vo getLoading() {
        return this.f55567d;
    }

    public PreviewView getPreviewView() {
        return this.f55565b;
    }

    public void setGuideText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, MessageButton.TEXT);
        TextView textView = this.f55564a.f57137b;
        C24362h.m61210e(textView, "binding.barcodeDescription");
        textView.setText(charSequence);
    }

    public void setTitleText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, MessageButton.TEXT);
        TextView textView = this.f55564a.f57139d;
        C24362h.m61210e(textView, "binding.barcodeTitle");
        textView.setText(charSequence);
    }

    /* renamed from: a */
    public void mo55842a() {
        ProgressBar progressBar = this.f55564a.f57147n;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55564a.f57148o;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55564a.f57145l;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55564a.f57146m;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55564a.f57149p;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        this.f55564a.f57140f.clearColorFilter();
        this.f55564a.f57142h.clearColorFilter();
    }
}
