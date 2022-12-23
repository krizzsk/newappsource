package com.moovit.barcode.scan.engines;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.C0509c;
import androidx.camera.core.C0556i;
import androidx.camera.core.CameraX;
import androidx.camera.lifecycle.C0647b;
import androidx.camera.lifecycle.C0650e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentActivity;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14737e;
import com.moovit.barcode.scan.BarcodeOverlayView;
import com.moovit.commons.utils.UiUtils;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p054d0.C4279f;
import p054d0.C4310t0;
import p054d0.C4319x0;
import p102h0.C5016b;
import p102h0.C5023g;
import p172m9.C5720b;
import p432cz.C16527b;
import p432cz.C16528c;
import p480ez.C16909a;
import p480ez.C16910b;
import p674ng.C18548a;
import p791sg.C19459a;
import p944yq.C20750a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/barcode/scan/engines/MLKitBarcodeScannerFragment;", "Lcom/moovit/c;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MLKitBarcodeScannerFragment extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f40812q = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f40813n = C5720b.m14033A(1, "analyzer");

    /* renamed from: o */
    public C4279f f40814o;

    /* renamed from: p */
    public final C21049c f40815p = C23812a.m58432b(new MLKitBarcodeScannerFragment$scanner$2(this));

    public MLKitBarcodeScannerFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m40040m2(MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment, C0556i iVar, C4310t0 t0Var) {
        Image image;
        C24362h.m61211f(mLKitBarcodeScannerFragment, "this$0");
        C24362h.m61211f(iVar, "$this_apply");
        FragmentActivity activity = mLKitBarcodeScannerFragment.getActivity();
        if (activity != null && (image = t0Var.getImage()) != null) {
            ((C18548a) mLKitBarcodeScannerFragment.f40815p.getValue()).mo43886b(C19459a.m46857a(image, t0Var.f15259d.mo19790b())).addOnSuccessListener((Activity) activity, new C20750a(new MLKitBarcodeScannerFragment$analyze$1(iVar, mLKitBarcodeScannerFragment), 3)).addOnCompleteListener(new C14737e(t0Var, 2));
        }
    }

    public final void onCreate(Bundle bundle) {
        CallbackToFutureAdapter.C0675c cVar;
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C0650e eVar = C0650e.f2228f;
        requireContext.getClass();
        C0650e eVar2 = C0650e.f2228f;
        synchronized (eVar2.f2229a) {
            cVar = eVar2.f2230b;
            if (cVar == null) {
                cVar = CallbackToFutureAdapter.m1884a(new C4319x0(1, eVar2, new CameraX(requireContext)));
                eVar2.f2230b = cVar;
            }
        }
        C5016b h = C5023g.m12860h(cVar, new C0647b(requireContext), C14226d.m35352s0());
        h.addListener(new C0509c(14, this, h), MoovitExecutors.MAIN_THREAD);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C16528c.mlkit_barcode_scanner_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        BarcodeOverlayView barcodeOverlayView = (BarcodeOverlayView) view.findViewById(C16527b.qrOverlay);
        UiUtils.m40259r(barcodeOverlayView, new C16909a(barcodeOverlayView, view));
        view.findViewById(C16527b.torch_view).setOnClickListener(new C16910b(this, 0));
    }
}
