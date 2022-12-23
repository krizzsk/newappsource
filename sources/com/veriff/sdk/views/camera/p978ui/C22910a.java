package com.veriff.sdk.views.camera.p978ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.views.camera.C22832ag;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/ui/CameraView;", "Landroid/widget/RelativeLayout;", "", "isVisible", "Lbf0/d;", "setOverlayVisibility", "Landroid/view/ViewGroup;", "getPreviewContainer", "collapseInfoSheet", "disableCameraButton", "disableCameraControls", "enableCameraButton", "enableCameraControls", "hideBlockCondition", "openInfoSheet", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "setTutorialText", "Lcom/veriff/sdk/views/camera/ShutterBlockCondition;", "condition", "showBlockCondition", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ui.a */
public abstract class C22910a extends RelativeLayout {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/ui/CameraView$Listener;", "", "Lbf0/d;", "clickedAwayFromSheet", "", "x", "y", "frameClicked", "onClosePressed", "onInfoPressed", "onSheetCollapsed", "onTakePicturePressed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.ui.a$a */
    public interface C22911a {
        /* renamed from: a */
        void mo57757a();

        /* renamed from: a */
        void mo57758a(float f, float f2);

        /* renamed from: b */
        void mo57759b();

        /* renamed from: c */
        void mo57760c();

        /* renamed from: d */
        void mo57761d();

        /* renamed from: e */
        void mo57762e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22910a(Context context) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: a */
    public abstract void mo57792a();

    /* renamed from: a */
    public abstract void mo57793a(C22832ag agVar);

    /* renamed from: b */
    public abstract void mo57794b();

    /* renamed from: c */
    public abstract void mo57795c();

    /* renamed from: d */
    public abstract void mo57796d();

    /* renamed from: e */
    public abstract void mo57797e();

    /* renamed from: f */
    public abstract void mo57798f();

    /* renamed from: g */
    public abstract void mo57799g();

    public abstract ViewGroup getPreviewContainer();

    public abstract void setOverlayVisibility(boolean z);

    public abstract void setTutorialText(C24422b bVar);
}
