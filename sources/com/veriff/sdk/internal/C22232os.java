package com.veriff.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22023ml;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.camera.C22904r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24467l;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bw\u0012\u0006\u0010\n\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010S\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020Q¢\u0006\u0004\bU\u0010VJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001eH\u0016R\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020$8\u0016X\u0004¢\u0006\f\n\u0004\b@\u0010&\u001a\u0004\bA\u0010B¨\u0006W"}, mo59060d2 = {"Lcom/veriff/sdk/views/barcode/ScanBarcodeScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView$Listener;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$View;", "Lbf0/d;", "create", "resume", "pause", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "handleBarcodeScanFinished", "handleBarcodeScanSkipped", "hideTips", "onBackButtonPressed", "onCloseClicked", "onTryAgainClicked", "resetToScanning", "Lcom/veriff/sdk/internal/data/FlowStep;", "step", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmFlowCancellationDialog", "showError", "showLoading", "showProcessing", "showSuccess", "showTips", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "startAuthenticationFlowStep", "", "getStatusBarColor", "()Ljava/lang/Integer;", "statusBarColor", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "barcodeView", "Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "Landroid/content/Context;", "Landroid/content/Context;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "model", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/barcode/BarcodeMVP$Presenter;", "Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner;", "scanner", "Lcom/veriff/sdk/internal/ui/barcode/BarcodeScanner;", "view", "getView", "()Lcom/veriff/sdk/internal/ui/barcode/view/BarcodeView;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lcom/veriff/sdk/internal/upload/PictureStorage;", "pictureStorage", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/Scheduler;", "computationScheduler", "diskScheduler", "uiScheduler", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lmobi/lab/veriff/util/LanguageUtil;Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/internal/upload/PictureStorage;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;Lcom/veriff/sdk/internal/Scheduler;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.os */
public final class C22232os extends C22822c implements C22023ml.C22024a, oo$c, C22904r {

    /* renamed from: b */
    private final C21783is f56055b;

    /* renamed from: c */
    private final C22023ml f56056c;

    /* renamed from: e */
    private final oo$b f56057e;

    /* renamed from: f */
    private final C22007mf f56058f;

    /* renamed from: g */
    private final Context f56059g;

    /* renamed from: h */
    private final C22934e f56060h;

    /* renamed from: j */
    private final C24457h f56061j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22232os(Context context, C22934e eVar, C24446b bVar, C21645fu fuVar, C21910kf kfVar, C21789ix ixVar, C22661wm wmVar, C24457h hVar, C22696xo xoVar, C22061nh nhVar, C22064nk nkVar, C21636fm fmVar, C21636fm fmVar2, C21636fm fmVar3) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        C22023ml mlVar;
        Context context2 = context;
        C22934e eVar2 = eVar;
        C21789ix ixVar2 = ixVar;
        C24457h hVar2 = hVar;
        C22696xo xoVar2 = xoVar;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar2, "host");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar2, "featureFlags");
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(hVar2, "languageUtil");
        C24362h.m61211f(xoVar2, "branding");
        C24362h.m61211f(nhVar, "pictureStorage");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(fmVar, "computationScheduler");
        C24362h.m61211f(fmVar2, "diskScheduler");
        C24362h.m61211f(fmVar3, "uiScheduler");
        this.f56059g = context2;
        this.f56060h = eVar2;
        this.f56061j = hVar2;
        C24469n.f61931a.mo60714a(xoVar2, hVar.mo60691a(), ixVar2);
        if (ixVar.mo55466r()) {
            mlVar = new C22029mn(context2, new C22700xq(context2, xoVar2), hVar.mo60691a(), this);
        } else {
            mlVar = new C22026mm(context2, hVar.mo60691a(), new C22700xq(context2, xoVar2), this);
        }
        this.f56055b = C21783is.barcode;
        this.f56056c = mlVar;
        C22222oq oqVar = r0;
        C22222oq oqVar2 = new C22222oq(this, new C22216op(mo57591d(), wmVar, nhVar, nkVar, hVar, ixVar, fmVar3), fuVar, kfVar, new C24467l(), mo57591d(), fmVar2, fmVar3);
        this.f56057e = oqVar;
        this.f56058f = new C22007mf(context, C22020mj.f55560b.mo55841a(), getView().getPreviewView(), ixVar.mo55433J(), mo57592k_(), oqVar, bVar, fmVar, fmVar3);
    }

    /* renamed from: a */
    public void mo56009a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        C22904r.C22905a.m56452a(this, list);
    }

    /* renamed from: b */
    public void mo55855b() {
        this.f56057e.mo56126e();
    }

    /* renamed from: b_ */
    public void mo56012b_() {
        C22904r.C22905a.m56451a(this);
    }

    /* renamed from: c_ */
    public void mo56128c_() {
        this.f56060h.mo57609b();
    }

    public void create() {
        this.f56058f.mo55826a();
    }

    /* renamed from: d_ */
    public void mo56129d_() {
        this.f56060h.mo57610c();
    }

    /* renamed from: e_ */
    public void mo56130e_() {
        this.f56058f.mo55827b();
        getView().mo55842a();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return false;
    }

    /* renamed from: g */
    public void mo56131g() {
        getView().mo55843b();
    }

    public C21783is getPage() {
        return this.f56055b;
    }

    public Integer getStatusBarColor() {
        return Integer.valueOf(this.f56059g.getResources().getColor(R$color.vrffBlack));
    }

    /* renamed from: h */
    public void mo56132h() {
        getView().mo55844c();
    }

    /* renamed from: i */
    public void mo56133i() {
        getView().mo55845d();
    }

    /* renamed from: j */
    public void mo56134j() {
        getView().mo55848g();
    }

    /* renamed from: k */
    public void mo56135k() {
        getView().mo55846e();
    }

    /* renamed from: l */
    public void mo56136l() {
        getView().mo55847f();
    }

    /* renamed from: m */
    public C22023ml getView() {
        return this.f56056c;
    }

    public void pause() {
        this.f56057e.mo56124c();
    }

    public void resume() {
        this.f56057e.mo56123b();
    }

    /* renamed from: a */
    public void mo55854a() {
        this.f56057e.mo56125d();
    }

    /* renamed from: a */
    public void mo56010a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        getView().setTitleText(bVar.mo60569a().mo55488g().mo55567a().invoke(this.f56061j.mo60691a()));
        getView().setGuideText(bVar.mo60569a().mo55488g().mo55568b().invoke(this.f56061j.mo60691a()));
        this.f56057e.mo56122a(bVar);
    }

    /* renamed from: a */
    public boolean mo56011a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, AppActionRequest.KEY_CONTEXT);
        return jpVar == C21882jp.DOCUMENT_BACK_BARCODE;
    }

    /* renamed from: a */
    public void mo56127a(C21791iy iyVar, C21719gi giVar) {
        C24362h.m61211f(iyVar, "step");
        C24362h.m61211f(giVar, "source");
        this.f56060h.mo57597a(getPage(), giVar);
    }
}
