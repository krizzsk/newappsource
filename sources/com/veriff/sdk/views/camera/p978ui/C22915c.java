package com.veriff.sdk.views.camera.p978ui;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21843ja;
import com.veriff.sdk.internal.C21869jc;
import com.veriff.sdk.internal.C22641vw;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.camera.C22832ag;
import com.veriff.sdk.views.camera.p978ui.C22910a;
import kotlin.Metadata;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24442a;
import mobi.lab.veriff.util.C24472p;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006/"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/ui/MergedCameraView;", "Lcom/veriff/sdk/views/camera/ui/CameraView;", "Landroid/view/ViewGroup;", "getPreviewContainer", "Lbf0/d;", "onDetachedFromWindow", "", "isVisible", "setOverlayVisibility", "collapseInfoSheet", "disableCameraButton", "disableCameraControls", "enableCameraButton", "enableCameraControls", "hideBlockCondition", "openInfoSheet", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "setTutorialText", "Lcom/veriff/sdk/views/camera/ShutterBlockCondition;", "condition", "showBlockCondition", "showDocClearArea", "Lcom/veriff/sdk/views/camera/ui/MergedUiType;", "mergedUiType", "showPortraitClearArea", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Lmobi/lab/veriff/databinding/VrffViewCameraMergedBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewCameraMergedBinding;", "Landroid/os/Handler;", "illustrationHideHandler", "Landroid/os/Handler;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "resourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/views/camera/ui/CameraView$Listener;", "listener", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/camera/ui/CameraView$Listener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.views.camera.ui.c */
public final class C22915c extends C22910a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22641vw f58192a;

    /* renamed from: b */
    private AnimatorSet f58193b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f58194c = new Handler();

    /* renamed from: d */
    private final C21616ex f58195d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22700xq f58196e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ui.c$a */
    public static final class C22919a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22915c f58202a;

        public C22919a(C22915c cVar) {
            this.f58202a = cVar;
        }

        public final void run() {
            ImageView imageView = this.f58202a.f58192a.f57187m;
            C24362h.m61210e(imageView, "binding.illustrationImage");
            C24472p.m61579a(imageView, this.f58202a.f58196e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22915c(Context context, C21616ex exVar, C22700xq xqVar, final C22910a.C22911a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "resourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f58195d = exVar;
        this.f58196e = xqVar;
        C22641vw a = C22641vw.m55192a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewCameraMergedBind…rom(context), this, true)");
        this.f58192a = a;
        a.f57177c.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                aVar.mo57757a();
            }
        });
        ImageView imageView = a.f57177c;
        C24362h.m61210e(imageView, "binding.cameraClose");
        imageView.setContentDescription(exVar.mo54719bI());
        a.f57175a.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a */
            public final /* synthetic */ C22915c f58198a;

            {
                this.f58198a = r1;
            }

            public final void onClick(View view) {
                this.f58198a.f58194c.removeCallbacksAndMessages((Object) null);
                aVar.mo57759b();
            }
        });
        ImageView imageView2 = a.f57175a;
        C24362h.m61210e(imageView2, "binding.cameraCapture");
        imageView2.setContentDescription(exVar.mo54720bJ());
        MergedUiOverlay mergedUiOverlay = a.f57179e;
        C24362h.m61210e(mergedUiOverlay, "binding.cameraOverlayDoc");
        mergedUiOverlay.setContentDescription(exVar.mo54759bw());
        MergedUiOverlay mergedUiOverlay2 = a.f57180f;
        C24362h.m61210e(mergedUiOverlay2, "binding.cameraOverlayPortrait");
        mergedUiOverlay2.setContentDescription(exVar.mo54759bw());
        FrameLayout frameLayout = a.f57181g;
        C24362h.m61210e(frameLayout, "binding.cameraPreviewContainer");
        C24472p.m61578a((View) frameLayout, (C24236l<? super PointF, C21050d>) new C24236l<PointF, C21050d>(this) {

            /* renamed from: a */
            public final /* synthetic */ C22915c f58200a;

            {
                this.f58200a = r1;
            }

            /* renamed from: a */
            public final void mo57806a(PointF pointF) {
                if (pointF != null) {
                    aVar.mo57758a(pointF.x, pointF.y);
                    return;
                }
                C22910a.C22911a aVar = aVar;
                FrameLayout frameLayout = this.f58200a.f58192a.f57181g;
                C24362h.m61210e(frameLayout, "binding.cameraPreviewContainer");
                FrameLayout frameLayout2 = this.f58200a.f58192a.f57181g;
                C24362h.m61210e(frameLayout2, "binding.cameraPreviewContainer");
                aVar.mo57758a(((float) frameLayout.getWidth()) * 0.5f, ((float) frameLayout2.getHeight()) * 0.5f);
            }

            public /* synthetic */ Object invoke(Object obj) {
                mo57806a((PointF) obj);
                return C21050d.f52856a;
            }
        });
        TextView textView = a.f57182h;
        C24362h.m61210e(textView, "binding.cameraShutterBlocked");
        textView.setText(exVar.mo54725bO());
    }

    /* renamed from: h */
    private final void m56564h() {
        FrameLayout frameLayout = this.f58192a.f57185k;
        C24362h.m61210e(frameLayout, "binding.clearAreaPortrait");
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = this.f58192a.f57184j;
        C24362h.m61210e(frameLayout2, "binding.clearAreaDoc");
        frameLayout2.setVisibility(0);
        View view = this.f58192a.f57188o;
        C24362h.m61210e(view, "binding.portraitDocFrame");
        view.setVisibility(8);
        MergedUiOverlay mergedUiOverlay = this.f58192a.f57179e;
        C24362h.m61210e(mergedUiOverlay, "binding.cameraOverlayDoc");
        mergedUiOverlay.setVisibility(0);
        MergedUiOverlay mergedUiOverlay2 = this.f58192a.f57180f;
        C24362h.m61210e(mergedUiOverlay2, "binding.cameraOverlayPortrait");
        mergedUiOverlay2.setVisibility(8);
    }

    /* renamed from: a */
    public void mo57792a() {
    }

    /* renamed from: b */
    public void mo57794b() {
    }

    /* renamed from: d */
    public void mo57796d() {
    }

    /* renamed from: e */
    public void mo57797e() {
    }

    /* renamed from: f */
    public void mo57798f() {
        ImageView imageView = this.f58192a.f57175a;
        C24362h.m61210e(imageView, "binding.cameraCapture");
        imageView.setEnabled(true);
        ImageView imageView2 = this.f58192a.f57175a;
        C24362h.m61210e(imageView2, "binding.cameraCapture");
        imageView2.setAlpha(1.0f);
    }

    /* renamed from: g */
    public void mo57799g() {
        TextView textView = this.f58192a.f57182h;
        C24362h.m61210e(textView, "binding.cameraShutterBlocked");
        textView.setVisibility(8);
    }

    public ViewGroup getPreviewContainer() {
        FrameLayout frameLayout = this.f58192a.f57181g;
        C24362h.m61210e(frameLayout, "binding.cameraPreviewContainer");
        return frameLayout;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58194c.removeCallbacksAndMessages((Object) null);
        AnimatorSet animatorSet = this.f58193b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void setOverlayVisibility(boolean z) {
    }

    public void setTutorialText(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        C21791iy a = bVar.mo60569a();
        C24362h.m61210e(a, "step.flowStep");
        C21869jc a2 = C21843ja.m53316a(a);
        TextView textView = this.f58192a.f57183i;
        C24362h.m61210e(textView, "binding.cameraTitle");
        textView.setText(a2.mo55567a().invoke(this.f58195d));
        TextView textView2 = this.f58192a.f57178d;
        C24362h.m61210e(textView2, "binding.cameraDescription");
        textView2.setText(a2.mo55568b().invoke(this.f58195d));
        ImageView imageView = this.f58192a.f57187m;
        C24362h.m61210e(imageView, "binding.illustrationImage");
        imageView.setVisibility(8);
        ImageView imageView2 = this.f58192a.f57186l;
        C24362h.m61210e(imageView2, "binding.illustrationFlip");
        imageView2.setVisibility(8);
        C22923g gVar = C22923g.f58211a;
        C21791iy a3 = bVar.mo60569a();
        C24362h.m61210e(a3, "step.flowStep");
        C22922f a4 = gVar.mo57808a(a3);
        int i = C22920d.f58203a[a4.ordinal()];
        if (i == 1) {
            ImageView imageView3 = this.f58192a.f57187m;
            imageView3.setPadding(0, 0, (int) imageView3.getResources().getDimension(R$dimen.vrff_size_56), 0);
            imageView3.setImageResource(a2.mo55569c());
            imageView3.setVisibility(0);
            imageView3.setAlpha(1.0f);
            m56564h();
        } else if (i == 2) {
            ImageView imageView4 = this.f58192a.f57187m;
            imageView4.setPadding(0, 0, 0, 0);
            imageView4.setImageResource(a2.mo55569c());
            imageView4.setVisibility(0);
            imageView4.setAlpha(1.0f);
            if (a2.mo55571e()) {
                ImageView imageView5 = this.f58192a.f57186l;
                C24362h.m61210e(imageView5, "binding.illustrationFlip");
                imageView5.setVisibility(0);
                C22700xq xqVar = this.f58196e;
                ImageView imageView6 = this.f58192a.f57187m;
                C24362h.m61210e(imageView6, "binding.illustrationImage");
                this.f58193b = C24442a.m61487a(xqVar, imageView6, 1500, 2, a2.mo55569c(), a2.mo55570d(), this.f58192a.f57186l, (C24225a) null, RecyclerView.C1119a0.FLAG_IGNORE, (Object) null);
            } else {
                this.f58194c.postDelayed(new C22919a(this), 4000);
            }
            m56564h();
        } else if (i == 3 || i == 4) {
            m56561a(a4);
        }
    }

    /* renamed from: a */
    public void mo57793a(C22832ag agVar) {
        C24362h.m61211f(agVar, "condition");
        TextView textView = this.f58192a.f57182h;
        C24362h.m61210e(textView, "binding.cameraShutterBlocked");
        textView.setVisibility(0);
        int i = C22920d.f58204b[agVar.ordinal()];
        if (i == 1) {
            TextView textView2 = this.f58192a.f57182h;
            C24362h.m61210e(textView2, "binding.cameraShutterBlocked");
            textView2.setText(this.f58195d.mo54727bQ());
        } else if (i == 2) {
            TextView textView3 = this.f58192a.f57182h;
            C24362h.m61210e(textView3, "binding.cameraShutterBlocked");
            textView3.setText(this.f58195d.mo54726bP());
        } else if (i == 3) {
            TextView textView4 = this.f58192a.f57182h;
            C24362h.m61210e(textView4, "binding.cameraShutterBlocked");
            textView4.setText(this.f58195d.mo54725bO());
        }
    }

    /* renamed from: c */
    public void mo57795c() {
        ImageView imageView = this.f58192a.f57175a;
        C24362h.m61210e(imageView, "binding.cameraCapture");
        imageView.setEnabled(false);
        ImageView imageView2 = this.f58192a.f57175a;
        C24362h.m61210e(imageView2, "binding.cameraCapture");
        imageView2.setAlpha(0.5f);
    }

    /* renamed from: a */
    private final void m56561a(C22922f fVar) {
        FrameLayout frameLayout = this.f58192a.f57185k;
        C24362h.m61210e(frameLayout, "binding.clearAreaPortrait");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f58192a.f57184j;
        C24362h.m61210e(frameLayout2, "binding.clearAreaDoc");
        frameLayout2.setVisibility(8);
        View view = this.f58192a.f57188o;
        C24362h.m61210e(view, "binding.portraitDocFrame");
        view.setVisibility(8);
        MergedUiOverlay mergedUiOverlay = this.f58192a.f57179e;
        C24362h.m61210e(mergedUiOverlay, "binding.cameraOverlayDoc");
        mergedUiOverlay.setVisibility(8);
        MergedUiOverlay mergedUiOverlay2 = this.f58192a.f57180f;
        C24362h.m61210e(mergedUiOverlay2, "binding.cameraOverlayPortrait");
        mergedUiOverlay2.setVisibility(0);
        if (fVar == C22922f.SELFIE_WITH_DOC) {
            View view2 = this.f58192a.f57188o;
            C24362h.m61210e(view2, "binding.portraitDocFrame");
            view2.setVisibility(0);
            return;
        }
        MergedUiOverlay mergedUiOverlay3 = this.f58192a.f57180f;
        C24362h.m61210e(mergedUiOverlay3, "binding.cameraOverlayPortrait");
        mergedUiOverlay3.setVisibility(0);
    }
}
