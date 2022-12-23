package com.veriff.sdk.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.camera.view.PreviewView;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lbf0/d;", "setTitleText", "setGuideText", "hideTips", "resetToScanning", "showError", "showLoading", "showProcessing", "showSuccess", "showTips", "Lcom/veriff/sdk/camera/view/PreviewView;", "getPreviewView", "()Lcom/veriff/sdk/camera/view/PreviewView;", "previewView", "Landroid/widget/FrameLayout;", "getInflowErrorTips", "()Landroid/widget/FrameLayout;", "inflowErrorTips", "Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "getLoading", "()Lmobi/lab/veriff/databinding/VrffLoadingBinding;", "loading", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ml */
public abstract class C22023ml extends ConstraintLayout {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "", "Lbf0/d;", "onCloseClicked", "onTryAgainClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ml$a */
    public interface C22024a {
        /* renamed from: a */
        void mo55854a();

        /* renamed from: b */
        void mo55855b();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/internal/ui/barcode/view/BarcodeView$hideTips$1$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lbf0/d;", "onAnimationEnd", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ml$b */
    public static final class C22025b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C22023ml f55563a;

        public C22025b(C22023ml mlVar) {
            this.f55563a = mlVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f55563a.getInflowErrorTips().setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22023ml(Context context) {
        super(context, (AttributeSet) null, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: a */
    public abstract void mo55842a();

    /* renamed from: b */
    public abstract void mo55843b();

    /* renamed from: c */
    public abstract void mo55844c();

    /* renamed from: d */
    public abstract void mo55845d();

    /* renamed from: e */
    public final void mo55846e() {
        getInflowErrorTips().setVisibility(0);
        ObjectAnimator.ofFloat(getInflowErrorTips(), ViewGroup.TRANSLATION_Y, new float[]{(float) getHeight(), 0.0f}).setDuration(500).start();
    }

    /* renamed from: f */
    public final void mo55847f() {
        getInflowErrorTips().setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(getInflowErrorTips(), ViewGroup.TRANSLATION_Y, new float[]{0.0f, (float) getHeight()}).setDuration(500);
        duration.addListener(new C22025b(this));
        duration.start();
    }

    /* renamed from: g */
    public final void mo55848g() {
        FrameLayout a = getLoading().mo56989a();
        C24362h.m61210e(a, "loading.root");
        a.setAlpha(1.0f);
    }

    public abstract FrameLayout getInflowErrorTips();

    public abstract C22633vo getLoading();

    public abstract PreviewView getPreviewView();

    public abstract void setGuideText(CharSequence charSequence);

    public abstract void setTitleText(CharSequence charSequence);
}
