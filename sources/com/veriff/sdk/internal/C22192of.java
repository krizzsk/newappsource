package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import kotlin.text.C24179b;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.R$drawable;
import p116i1.C5247f;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006&"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getSpannableTextForFallback", "Landroid/view/View;", "view", "Lbf0/d;", "addOverlay", "enableManualCapture", "setAsNormal", "setAsSuccess", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView$AutoCaptureState;", "state", "setState", "showManualFallback", "showTitleAndDesc", "Landroid/widget/FrameLayout;", "previewContainer", "Landroid/widget/FrameLayout;", "getPreviewContainer", "()Landroid/widget/FrameLayout;", "overlayArea", "getOverlayArea", "Lmobi/lab/veriff/databinding/VrffViewAutocaptureBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewAutocaptureBinding;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView$Listener;", "listener", "Lcom/veriff/sdk/views/autocapture/AutoCaptureView$Listener;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/views/autocapture/AutoCaptureView$Listener;)V", "AutoCaptureState", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.of */
public final class C22192of extends ConstraintLayout {

    /* renamed from: a */
    private final C22637vs f55952a;

    /* renamed from: b */
    private final FrameLayout f55953b;

    /* renamed from: c */
    private final FrameLayout f55954c;

    /* renamed from: d */
    private final C21616ex f55955d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22197b f55956e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureView$AutoCaptureState;", "", "(Ljava/lang/String;I)V", "NORMAL", "SUCCESS", "FALLBACK_VISIBLE", "MANUAL_CAPTURE_ENABLED", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.of$a */
    public enum C22196a {
        NORMAL,
        SUCCESS,
        FALLBACK_VISIBLE,
        MANUAL_CAPTURE_ENABLED
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureView$Listener;", "", "Lbf0/d;", "onCapturePressed", "onClosePressed", "onFallbackToManual", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.of$b */
    public interface C22197b {
        /* renamed from: a */
        void mo56098a();

        /* renamed from: b */
        void mo56099b();

        /* renamed from: c */
        void mo56100c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22192of(Context context, C21616ex exVar, C22197b bVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f55955d = exVar;
        this.f55956e = bVar;
        C22637vs a = C22637vs.m55184a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewAutocaptureBindi…rom(context), this, true)");
        this.f55952a = a;
        FrameLayout frameLayout = a.f57132h;
        C24362h.m61210e(frameLayout, "binding.autoCapturePreviewContainer");
        this.f55953b = frameLayout;
        FrameLayout frameLayout2 = a.f57135k;
        C24362h.m61210e(frameLayout2, "binding.clearArea");
        this.f55954c = frameLayout2;
        TextView textView = a.f57133i;
        C24362h.m61210e(textView, "binding.autoCaptureTitle");
        textView.setText(exVar.mo54826dH());
        TextView textView2 = a.f57128d;
        C24362h.m61210e(textView2, "binding.autoCaptureDescription");
        textView2.setText(exVar.mo54827dI());
        TextView textView3 = a.f57130f;
        textView3.setText(getSpannableTextForFallback());
        textView3.setVisibility(8);
        ImageView imageView = a.f57127c;
        C24362h.m61210e(imageView, "binding.autoCaptureClose");
        imageView.setContentDescription(exVar.mo54719bI());
        a.f57127c.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a */
            public final /* synthetic */ C22192of f55957a;

            {
                this.f55957a = r1;
            }

            public final void onClick(View view) {
                this.f55957a.f55956e.mo56098a();
            }
        });
        ImageView imageView2 = a.f57129e;
        C24362h.m61210e(imageView2, "binding.autoCaptureDoManual");
        imageView2.setContentDescription(exVar.mo54720bJ());
        a.f57129e.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a */
            public final /* synthetic */ C22192of f55958a;

            {
                this.f55958a = r1;
            }

            public final void onClick(View view) {
                this.f55958a.f55956e.mo56099b();
            }
        });
        a.f57130f.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a */
            public final /* synthetic */ C22192of f55959a;

            {
                this.f55959a = r1;
            }

            public final void onClick(View view) {
                this.f55959a.f55956e.mo56100c();
            }
        });
    }

    /* renamed from: b */
    private final void m54009b() {
        ImageView imageView = this.f55952a.f57126a;
        imageView.setVisibility(0);
        imageView.setImageResource(R$drawable.vrff_auto_capture_border_active);
        TextView textView = this.f55952a.f57130f;
        C24362h.m61210e(textView, "binding.autoCaptureFallback");
        textView.setVisibility(8);
        ImageView imageView2 = this.f55952a.f57129e;
        C24362h.m61210e(imageView2, "binding.autoCaptureDoManual");
        imageView2.setVisibility(4);
        TextView textView2 = this.f55952a.f57128d;
        C24362h.m61210e(textView2, "binding.autoCaptureDescription");
        textView2.setVisibility(4);
        TextView textView3 = this.f55952a.f57133i;
        textView3.setVisibility(0);
        textView3.setText(this.f55955d.mo54828dJ());
    }

    /* renamed from: c */
    private final void m54010c() {
        ImageView imageView = this.f55952a.f57126a;
        C24362h.m61210e(imageView, "binding.autoCaptureBorder");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f55952a.f57129e;
        C24362h.m61210e(imageView2, "binding.autoCaptureDoManual");
        imageView2.setVisibility(4);
        TextView textView = this.f55952a.f57130f;
        C24362h.m61210e(textView, "binding.autoCaptureFallback");
        textView.setVisibility(0);
        m54012e();
    }

    /* renamed from: d */
    private final void m54011d() {
        ImageView imageView = this.f55952a.f57126a;
        C24362h.m61210e(imageView, "binding.autoCaptureBorder");
        imageView.setVisibility(8);
        TextView textView = this.f55952a.f57130f;
        C24362h.m61210e(textView, "binding.autoCaptureFallback");
        textView.setVisibility(8);
        ImageView imageView2 = this.f55952a.f57129e;
        C24362h.m61210e(imageView2, "binding.autoCaptureDoManual");
        imageView2.setVisibility(0);
        m54012e();
    }

    /* renamed from: e */
    private final void m54012e() {
        TextView textView = this.f55952a.f57133i;
        textView.setVisibility(0);
        textView.setText(this.f55955d.mo54826dH());
        TextView textView2 = this.f55952a.f57128d;
        textView2.setVisibility(0);
        textView2.setText(this.f55955d.mo54827dI());
    }

    private final CharSequence getSpannableTextForFallback() {
        SpannableString spannableString = new SpannableString(C25081h.m62833D(C25081h.m62833D(this.f55955d.mo54829dK().toString(), "<a>", "", false), "</a>", "", false));
        spannableString.setSpan(new ForegroundColorSpan(C5247f.m13262a(getResources(), R$color.vrffAutoCaptureActive)), C24179b.m60565M(this.f55955d.mo54829dK(), "<a>", 0, false, 6), C24179b.m60565M(this.f55955d.mo54829dK(), "</a>", 0, false, 6) - 3, 34);
        return spannableString;
    }

    public final FrameLayout getOverlayArea() {
        return this.f55954c;
    }

    public final FrameLayout getPreviewContainer() {
        return this.f55953b;
    }

    public final void setState(C22196a aVar) {
        C24362h.m61211f(aVar, "state");
        int i = C22198og.f55965a[aVar.ordinal()];
        if (i == 1) {
            m54008a();
        } else if (i == 2) {
            m54009b();
        } else if (i == 3) {
            m54010c();
        } else if (i == 4) {
            m54011d();
        }
    }

    /* renamed from: a */
    public final void mo56101a(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        this.f55952a.f57131g.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private final void m54008a() {
        ImageView imageView = this.f55952a.f57126a;
        imageView.setVisibility(0);
        imageView.setImageResource(R$drawable.vrff_auto_capture_border_normal);
        TextView textView = this.f55952a.f57130f;
        C24362h.m61210e(textView, "binding.autoCaptureFallback");
        textView.setVisibility(8);
        ImageView imageView2 = this.f55952a.f57129e;
        C24362h.m61210e(imageView2, "binding.autoCaptureDoManual");
        imageView2.setVisibility(4);
        m54012e();
    }
}
