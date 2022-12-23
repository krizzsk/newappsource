package com.veriff.sdk.internal;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.views.VeriffTextView;
import kotlin.Metadata;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.util.C24472p;
import p116i1.C5247f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/views/instruction/InstructionView;", "Landroid/widget/LinearLayout;", "Lbf0/d;", "onAttachedToWindow", "onDetachedFromWindow", "setGuideAssets", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Lmobi/lab/veriff/databinding/VrffViewInstructionBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewInstructionBinding;", "Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "guideAssets", "Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/internal/data/FlowStep;", "step", "Lcom/veriff/sdk/views/instruction/InstructionView$Listener;", "listener", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/data/FlowStep;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/instruction/InstructionView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.qs */
public final class C22349qs extends LinearLayout {

    /* renamed from: a */
    private AnimatorSet f56377a;

    /* renamed from: b */
    private C21869jc f56378b;

    /* renamed from: c */
    private final C22650we f56379c;

    /* renamed from: d */
    private final C21616ex f56380d;

    /* renamed from: e */
    private final C22700xq f56381e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/views/instruction/InstructionView$Listener;", "", "Lbf0/d;", "onClosePressed", "onOkPressed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qs$a */
    public interface C22352a {
        /* renamed from: a */
        void mo56359a();

        /* renamed from: b */
        void mo56360b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22349qs(Context context, C21791iy iyVar, C21616ex exVar, C22700xq xqVar, final C22352a aVar) {
        super(context, (AttributeSet) null, -1);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(iyVar, "step");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56380d = exVar;
        this.f56381e = xqVar;
        setOrientation(1);
        C22650we a = C22650we.m55212a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewInstructionBindi…ater.from(context), this)");
        this.f56379c = a;
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        ImageView imageView = a.f57237b;
        C24362h.m61210e(imageView, "binding.instructionClose");
        imageView.setContentDescription(exVar.mo54719bI());
        VeriffTextView veriffTextView = a.f57239d;
        C24362h.m61210e(veriffTextView, "binding.instructionText");
        veriffTextView.setText(exVar.mo54670aN());
        a.f57241f.setText(exVar.mo54762bz());
        a.f57241f.setOnClick(new C22353qt(new C24225a<C21050d>(aVar) {
            /* renamed from: a */
            public final void mo56363a() {
                ((C22352a) this.receiver).mo56359a();
            }

            public /* synthetic */ Object invoke() {
                mo56363a();
                return C21050d.f52856a;
            }
        }));
        a.f57237b.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                aVar.mo56360b();
            }
        });
        this.f56378b = iyVar.mo55488g();
        m54437a();
    }

    /* renamed from: a */
    private final void m54437a() {
        VeriffTextView veriffTextView = this.f56379c.f57240e;
        C24362h.m61210e(veriffTextView, "binding.instructionTitle");
        veriffTextView.setText(this.f56378b.mo55567a().invoke(this.f56380d));
        VeriffTextView veriffTextView2 = this.f56379c.f57239d;
        C24362h.m61210e(veriffTextView2, "binding.instructionText");
        veriffTextView2.setText(this.f56378b.mo55568b().invoke(this.f56380d));
        this.f56379c.f57238c.setImageResource(this.f56378b.mo55569c());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f56378b.mo55571e()) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.vrff_size_32);
            this.f56379c.f57238c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ImageView imageView = this.f56379c.f57238c;
            C24362h.m61210e(imageView, "binding.instructionImage");
            C22700xq xqVar = this.f56381e;
            Resources resources = getResources();
            int c = this.f56378b.mo55569c();
            ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
            this.f56377a = C24472p.m61575a(imageView, xqVar, 1500, C5247f.C5248a.m13264a(resources, c, (Resources.Theme) null), C5247f.C5248a.m13264a(getResources(), this.f56378b.mo55570d(), (Resources.Theme) null), (Integer) null, 16, (Object) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f56377a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
