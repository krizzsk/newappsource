package com.moovit.barcode.scan.engines;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bf0.C21049c;
import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.zxing.DecodeHintType;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.barcode.scan.BarcodeOverlayView;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.commons.utils.UiUtils;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.Pair;
import mf0.C24362h;
import p304x.C7038d0;
import p360ah.C13460a;
import p360ah.C13464c;
import p389bl.C13637c;
import p432cz.C16527b;
import p432cz.C16528c;
import p453dw.C16740o;
import p808sx.C19571g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/barcode/scan/engines/ZxingBarcodeScannerFragment;", "Lcom/moovit/c;", "Lcom/moovit/MoovitActivity;", "Lcom/dlazaro66/qrcodereaderview/QRCodeReaderView$b;", "<init>", "()V", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class ZxingBarcodeScannerFragment extends C15682c<MoovitActivity> implements QRCodeReaderView.C2263b {

    /* renamed from: p */
    public static final /* synthetic */ int f40818p = 0;

    /* renamed from: n */
    public QRCodeReaderView f40819n;

    /* renamed from: o */
    public final C21049c f40820o = C23812a.m58432b(new ZxingBarcodeScannerFragment$supportedFormats$2(this));

    public ZxingBarcodeScannerFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: M0 */
    public final void mo11839M0(String str) {
        if (str != null) {
            mo46786U1(BarcodeScannerFragment.class, new C7038d0(str, 15));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C16528c.zxing_barcode_scanner_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        QRCodeReaderView qRCodeReaderView = this.f40819n;
        if (qRCodeReaderView != null) {
            qRCodeReaderView.f8341f.mo40373e();
        } else {
            C24362h.m61217l("qrCodeReaderView");
            throw null;
        }
    }

    public final void onResume() {
        super.onResume();
        QRCodeReaderView qRCodeReaderView = this.f40819n;
        if (qRCodeReaderView != null) {
            qRCodeReaderView.f8341f.mo40372d();
        } else {
            C24362h.m61217l("qrCodeReaderView");
            throw null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13460a aVar;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        BarcodeOverlayView barcodeOverlayView = (BarcodeOverlayView) view.findViewById(C16527b.qrOverlay);
        UiUtils.m40259r(barcodeOverlayView, new C19571g(barcodeOverlayView, view, 1));
        view.findViewById(C16527b.torch_view).setOnClickListener(new C16740o(this, 7));
        View findViewById = requireView().findViewById(C16527b.previewView);
        C24362h.m61210e(findViewById, "requireView().findViewById(R.id.previewView)");
        QRCodeReaderView qRCodeReaderView = (QRCodeReaderView) findViewById;
        this.f40819n = qRCodeReaderView;
        qRCodeReaderView.setOnQRCodeReadListener(this);
        QRCodeReaderView qRCodeReaderView2 = this.f40819n;
        if (qRCodeReaderView2 != null) {
            qRCodeReaderView2.setQRDecodingEnabled(true);
            QRCodeReaderView qRCodeReaderView3 = this.f40819n;
            if (qRCodeReaderView3 != null) {
                C13464c cVar = qRCodeReaderView3.f8341f;
                if (!(cVar == null || (aVar = cVar.f33325c) == null)) {
                    aVar.mo40362b();
                }
                QRCodeReaderView qRCodeReaderView4 = this.f40819n;
                if (qRCodeReaderView4 != null) {
                    qRCodeReaderView4.setPreviewCameraId(0);
                    QRCodeReaderView qRCodeReaderView5 = this.f40819n;
                    if (qRCodeReaderView5 != null) {
                        qRCodeReaderView5.setDecodeHints(C13637c.m34046A(new Pair(DecodeHintType.POSSIBLE_FORMATS, (List) this.f40820o.getValue())));
                    } else {
                        C24362h.m61217l("qrCodeReaderView");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("qrCodeReaderView");
                    throw null;
                }
            } else {
                C24362h.m61217l("qrCodeReaderView");
                throw null;
            }
        } else {
            C24362h.m61217l("qrCodeReaderView");
            throw null;
        }
    }
}
