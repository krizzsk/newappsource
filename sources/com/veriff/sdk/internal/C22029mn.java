package com.veriff.sdk.internal;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bf0.C21050d;
import com.appboy.models.MessageButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.internal.C22016mi;
import com.veriff.sdk.internal.C22023ml;
import kotlin.Metadata;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.util.C24442a;
import p116i1.C5247f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006/"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/view/MergedUiBarcodeView;", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "Lbf0/d;", "onDetachedFromWindow", "", "text", "setTitleText", "setGuideText", "resetToScanning", "showError", "showProcessing", "showSuccess", "Lcom/veriff/sdk/camera/view/PreviewView;", "previewView", "Lcom/veriff/sdk/camera/view/PreviewView;", "getPreviewView", "()Lcom/veriff/sdk/camera/view/PreviewView;", "Landroid/widget/FrameLayout;", "inflowErrorTips", "Landroid/widget/FrameLayout;", "getInflowErrorTips", "()Landroid/widget/FrameLayout;", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Lmobi/lab/veriff/databinding/VrffViewBarcodeMergedBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewBarcodeMergedBinding;", "Landroid/os/Handler;", "illustrationHideHandler", "Landroid/os/Handler;", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "listener", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "loading", "Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "getLoading", "()Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "Landroid/content/Context;", "context", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lcom/veriff/sdk/Strings;", "strings", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.mn */
public final class C22029mn extends C22023ml {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22639vu f55572a;

    /* renamed from: b */
    private final PreviewView f55573b;

    /* renamed from: c */
    private final FrameLayout f55574c;

    /* renamed from: d */
    private final C22633vo f55575d;

    /* renamed from: e */
    private AnimatorSet f55576e;

    /* renamed from: f */
    private final Handler f55577f = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C22023ml.C22024a f55578g;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/internal/ui/barcode/view/MergedUiBarcodeView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mn$a */
    public static final class C22032a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22029mn f55581a;

        /* renamed from: b */
        public final /* synthetic */ C21616ex f55582b;

        public C22032a(C22029mn mnVar, C21616ex exVar) {
            this.f55581a = mnVar;
            this.f55582b = exVar;
        }

        public final void onClick(View view) {
            this.f55581a.f55578g.mo55854a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22029mn(Context context, C22700xq xqVar, C21616ex exVar, C22023ml.C22024a aVar) {
        super(context);
        Context context2 = context;
        C22700xq xqVar2 = xqVar;
        C21616ex exVar2 = exVar;
        C22023ml.C22024a aVar2 = aVar;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xqVar2, "veriffResourcesProvider");
        C24362h.m61211f(exVar2, "strings");
        C24362h.m61211f(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f55578g = aVar2;
        C22639vu a = C22639vu.m55188a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewBarcodeMergedBin…rom(context), this, true)");
        this.f55572a = a;
        PreviewView previewView = a.f57154e;
        C24362h.m61210e(previewView, "binding.barcodePreview");
        this.f55573b = previewView;
        FrameLayout frameLayout = a.f57158j;
        C24362h.m61210e(frameLayout, "binding.inflowErrorTips");
        this.f55574c = frameLayout;
        C22633vo voVar = a.f57159k;
        C24362h.m61210e(voVar, "binding.loading");
        this.f55575d = voVar;
        C22633vo voVar2 = a.f57159k;
        C24362h.m61210e(voVar2, "binding.loading");
        voVar2.mo56989a().setBackgroundColor(C5247f.m13262a(getResources(), R$color.vrffMergedUiLoadingBack));
        ProgressBar progressBar = a.f57159k.f57105b;
        C24362h.m61210e(progressBar, "binding.loading.progressBar");
        int i = R$drawable.vrff_progress_indefinite;
        Resources resources = getResources();
        int i2 = R$color.vrffWhite;
        progressBar.setIndeterminateDrawable(xqVar2.mo57113a(i, C5247f.m13262a(resources, i2)));
        ProgressBar progressBar2 = a.f57162o;
        C24362h.m61210e(progressBar2, "binding.scanProgress");
        progressBar2.setIndeterminateDrawable(xqVar2.mo57113a(i, C5247f.m13262a(getResources(), i2)));
        TextView textView = a.f57161n;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setText(exVar.mo54756bt());
        TextView textView2 = a.f57164q;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setText(exVar.mo54755bs());
        ImageView imageView = a.f57151a;
        imageView.setContentDescription(exVar.mo54719bI());
        imageView.setOnClickListener(new C22032a(this, exVar2));
        ImageView imageView2 = a.f57153d;
        C24362h.m61210e(imageView2, "binding.barcodeDocIllustration");
        imageView2.setVisibility(0);
        ImageView imageView3 = a.f57153d;
        C24362h.m61210e(imageView3, "binding.barcodeDocIllustration");
        this.f55576e = C24442a.m61487a(xqVar, imageView3, 1500, 2, R$drawable.vrff_document_with_barcode, 0, (ImageView) null, new C24225a<C21050d>(this) {

            /* renamed from: a */
            public final /* synthetic */ C22029mn f55579a;

            {
                this.f55579a = r1;
            }

            /* renamed from: a */
            public final void mo55860a() {
                ImageView imageView = this.f55579a.f55572a.f57153d;
                C24362h.m61210e(imageView, "binding.barcodeDocIllustration");
                imageView.setVisibility(8);
            }

            public /* synthetic */ Object invoke() {
                mo55860a();
                return C21050d.f52856a;
            }
        }, 96, (Object) null);
        a.f57158j.addView(new C22016mi(context2, xqVar.mo57135v(), exVar2, new C22016mi.C22019c(this) {

            /* renamed from: a */
            public final /* synthetic */ C22029mn f55580a;

            {
                this.f55580a = r1;
            }

            /* renamed from: a */
            public void mo55838a() {
                this.f55580a.f55578g.mo55854a();
            }

            /* renamed from: b */
            public void mo55839b() {
                this.f55580a.f55578g.mo55855b();
            }
        }));
    }

    /* renamed from: c */
    public void mo55844c() {
        ProgressBar progressBar = this.f55572a.f57162o;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55572a.f57163p;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(0);
        ImageView imageView2 = this.f55572a.f57160m;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55572a.f57161n;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55572a.f57164q;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(0);
        ImageView imageView3 = this.f55572a.f57153d;
        C24362h.m61210e(imageView3, "binding.barcodeDocIllustration");
        imageView3.setVisibility(8);
        this.f55572a.f57157i.setColorFilter(C5247f.m13262a(getResources(), R$color.vrffBarcodeGreen));
    }

    /* renamed from: d */
    public void mo55845d() {
        ProgressBar progressBar = this.f55572a.f57162o;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55572a.f57163p;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55572a.f57160m;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(0);
        TextView textView = this.f55572a.f57161n;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(0);
        TextView textView2 = this.f55572a.f57164q;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        ImageView imageView3 = this.f55572a.f57153d;
        C24362h.m61210e(imageView3, "binding.barcodeDocIllustration");
        imageView3.setVisibility(8);
        this.f55572a.f57157i.clearColorFilter();
    }

    public FrameLayout getInflowErrorTips() {
        return this.f55574c;
    }

    public C22633vo getLoading() {
        return this.f55575d;
    }

    public PreviewView getPreviewView() {
        return this.f55573b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55577f.removeCallbacksAndMessages((Object) null);
        AnimatorSet animatorSet = this.f55576e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void setGuideText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, MessageButton.TEXT);
        TextView textView = this.f55572a.f57152b;
        C24362h.m61210e(textView, "binding.barcodeDescription");
        textView.setText(charSequence);
    }

    public void setTitleText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, MessageButton.TEXT);
        TextView textView = this.f55572a.f57155f;
        C24362h.m61210e(textView, "binding.barcodeTitle");
        textView.setText(charSequence);
    }

    /* renamed from: a */
    public void mo55842a() {
        ProgressBar progressBar = this.f55572a.f57162o;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(8);
        ImageView imageView = this.f55572a.f57163p;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55572a.f57160m;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55572a.f57161n;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55572a.f57164q;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        this.f55572a.f57157i.clearColorFilter();
    }

    /* renamed from: b */
    public void mo55843b() {
        ProgressBar progressBar = this.f55572a.f57162o;
        C24362h.m61210e(progressBar, "binding.scanProgress");
        progressBar.setVisibility(0);
        ImageView imageView = this.f55572a.f57163p;
        C24362h.m61210e(imageView, "binding.scanSuccess");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55572a.f57160m;
        C24362h.m61210e(imageView2, "binding.scanFailed");
        imageView2.setVisibility(8);
        TextView textView = this.f55572a.f57161n;
        C24362h.m61210e(textView, "binding.scanFailedText");
        textView.setVisibility(8);
        TextView textView2 = this.f55572a.f57164q;
        C24362h.m61210e(textView2, "binding.scanSuccessText");
        textView2.setVisibility(8);
        ImageView imageView3 = this.f55572a.f57153d;
        C24362h.m61210e(imageView3, "binding.barcodeDocIllustration");
        imageView3.setVisibility(8);
        this.f55572a.f57157i.setColorFilter(C5247f.m13262a(getResources(), R$color.vrffBarcodeGreen));
    }
}
