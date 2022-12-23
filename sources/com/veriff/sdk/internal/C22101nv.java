package com.veriff.sdk.internal;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C1020l;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22128nx;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.camera.C22863d;
import com.veriff.sdk.views.camera.C22875j;
import com.veriff.sdk.views.camera.C22904r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import wh0.C25184i0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020 \u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "", "Landroid/net/Uri;", "selectedUris", "Lbf0/d;", "filesSelected", "resetPhotoCapturing", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "startAuthenticationFlowStep", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "com/veriff/sdk/views/address/AddressScreen$listener$1", "listener", "Lcom/veriff/sdk/views/address/AddressScreen$listener$1;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/views/address/AddressView;", "view", "Lcom/veriff/sdk/views/address/AddressView;", "getView", "()Lcom/veriff/sdk/views/address/AddressView;", "Landroid/content/Context;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/views/camera/CameraProvider;", "cameraProvider", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lcom/veriff/sdk/internal/upload/FileStorage;", "fileStorage", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/Scheduler;", "uiScheduler", "Lcom/veriff/sdk/internal/SessionServices;", "sessionServices", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/views/camera/Camera$VideoListener;", "videoListener", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/views/camera/CameraProvider;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/upload/FileStorage;Lcom/veriff/sdk/internal/upload/PictureStorage;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/SessionServices;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/views/camera/Camera$VideoListener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nv */
public final class C22101nv extends C22822c implements C22904r {

    /* renamed from: a */
    private final C21783is f55768a = C21783is.proof_of_address;

    /* renamed from: c */
    private final C22128nx f55769c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C22934e f55770d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22101nv(Context context, C22934e eVar, C22700xq xqVar, C21616ex exVar, C22875j jVar, C22661wm wmVar, C22036mr mrVar, C22061nh nhVar, C21636fm fmVar, C21639fp fpVar, C21789ix ixVar, C22863d.C22867d dVar) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        C22128nx nxVar;
        Context context2 = context;
        C22934e eVar2 = eVar;
        C22036mr mrVar2 = mrVar;
        C21639fp fpVar2 = fpVar;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar2, "host");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(exVar, "strings");
        C22875j jVar2 = jVar;
        C24362h.m61211f(jVar2, "cameraProvider");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(mrVar2, "fileStorage");
        C24362h.m61211f(nhVar, "pictureStorage");
        C24362h.m61211f(fmVar, "uiScheduler");
        C24362h.m61211f(fpVar2, "sessionServices");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(dVar, "videoListener");
        this.f55770d = eVar2;
        C22102a aVar = new C22102a(this, fpVar2);
        C1020l d = mo57591d();
        C1020l d2 = mo57591d();
        C21645fu b = fpVar.mo54908b();
        C21910kf d3 = fpVar.mo54910d();
        C22064nk c = fpVar.mo54909c();
        String b2 = wmVar.mo57016b();
        C24362h.m61210e(b2, "session.poaVerificationId");
        new C22128nx(context2, xqVar, d, exVar, new C22089nt(d2, b, d3, ixVar, c, b2, fpVar.mo54912f().mo60696b().mo60677b(), wmVar, C25184i0.f63460b, new C22681xe(context2, mrVar2), fmVar), nhVar, jVar2, mo57592k_(), dVar, aVar);
        this.f55769c = nxVar;
        fpVar.mo54908b().mo54923b();
    }

    /* renamed from: b_ */
    public void mo56012b_() {
        C22904r.C22905a.m56451a(this);
        getView().mo56063d();
    }

    public C21783is getPage() {
        return this.f55768a;
    }

    /* renamed from: a */
    public C22128nx getView() {
        return this.f55769c;
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0010"}, mo59060d2 = {"com/veriff/sdk/views/address/AddressScreen$listener$1", "Lcom/veriff/sdk/views/address/AddressView$Listener;", "Lbf0/d;", "noCameraDeviceFound", "onAddressFileSelectionDone", "onAddressPhotoCaptureDone", "onCameraError", "", "source", "onClose", "", "supportedFileTypes", "onShowFileSelection", "Lmobi/lab/veriff/fragment/PhotoConf;", "photoConf", "onSystemError", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nv$a */
    public static final class C22102a implements C22128nx.C22130a {

        /* renamed from: a */
        public final /* synthetic */ C22101nv f55771a;

        /* renamed from: b */
        public final /* synthetic */ C21639fp f55772b;

        public C22102a(C22101nv nvVar, C21639fp fpVar) {
            this.f55771a = nvVar;
            this.f55772b = fpVar;
        }

        /* renamed from: a */
        public void mo56018a(List<String> list) {
            String[] strArr;
            C22934e a = this.f55771a.f55770d;
            if (list != null) {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    strArr = (String[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                strArr = null;
            }
            a.mo57608a(strArr);
        }

        /* renamed from: b */
        public void mo56019b() {
            this.f55771a.f55770d.mo57615h();
            this.f55772b.mo54908b().mo54924c();
        }

        /* renamed from: c */
        public void mo56020c() {
            this.f55771a.f55770d.mo57607a(false, 50);
        }

        /* renamed from: a */
        public void mo56017a(String str) {
            C24362h.m61211f(str, "source");
            this.f55771a.f55770d.mo57597a(this.f55771a.getPage(), C21719gi.CLOSE_BUTTON);
            this.f55772b.mo54908b().mo54924c();
        }

        /* renamed from: a */
        public void mo56015a() {
            this.f55771a.f55770d.mo57614g();
            this.f55772b.mo54908b().mo54924c();
        }

        /* renamed from: a */
        public void mo56016a(C22660wl wlVar) {
            this.f55771a.f55770d.mo57596a(22);
        }
    }

    /* renamed from: a */
    public void mo56010a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        getView().mo56059a(bVar);
    }

    /* renamed from: a */
    public boolean mo56011a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, AppActionRequest.KEY_CONTEXT);
        return jpVar == C21882jp.ADDRESS;
    }

    /* renamed from: a */
    public void mo56009a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        getView().mo56058a(list);
    }
}
