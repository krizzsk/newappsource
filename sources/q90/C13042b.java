package q90;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.zxing.BarcodeFormat;
import com.moovit.image.model.QrCodeImage;
import kotlin.NoWhenBranchMatchedException;
import m80.C12869e;
import m80.C12870f;
import m90.C12889a;
import m90.C12890b;
import p025b6.C1489d;
import p432cz.C16526a;
import p583jk.C17884p;
import r10.C19220d;

/* renamed from: q90.b */
public class C13042b extends C12889a<C13040a> {
    public C13042b() {
        super(C13040a.class);
    }

    /* renamed from: n2 */
    public final void mo24271n2(View view, C12890b bVar) {
        BarcodeFormat barcodeFormat;
        C13040a aVar = (C13040a) bVar;
        ImageView imageView = (ImageView) view.findViewById(C12869e.qr_view);
        com.moovit.barcode.BarcodeFormat barcodeFormat2 = aVar.f32262d;
        String str = aVar.f32263e;
        if (barcodeFormat2 == null) {
            ((C19220d) C17884p.m44354Y(imageView).mo10871m().mo10858a0(Base64.decode(str, 0))).mo10850T(imageView);
            return;
        }
        QrCodeImage qrCodeImage = new QrCodeImage(str);
        C19220d<Drawable> o0 = C17884p.m44354Y(imageView).mo51642v(qrCodeImage).mo51628o0(qrCodeImage);
        C1489d dVar = QrCodeImage.f41816f;
        switch (C16526a.f43145a[barcodeFormat2.ordinal()]) {
            case 1:
                barcodeFormat = BarcodeFormat.AZTEC;
                break;
            case 2:
                barcodeFormat = BarcodeFormat.CODABAR;
                break;
            case 3:
                barcodeFormat = BarcodeFormat.CODE_39;
                break;
            case 4:
                barcodeFormat = BarcodeFormat.CODE_93;
                break;
            case 5:
                barcodeFormat = BarcodeFormat.CODE_128;
                break;
            case 6:
                barcodeFormat = BarcodeFormat.DATA_MATRIX;
                break;
            case 7:
                barcodeFormat = BarcodeFormat.EAN_8;
                break;
            case 8:
                barcodeFormat = BarcodeFormat.EAN_13;
                break;
            case 9:
                barcodeFormat = BarcodeFormat.ITF;
                break;
            case 10:
                barcodeFormat = BarcodeFormat.PDF_417;
                break;
            case 11:
                barcodeFormat = BarcodeFormat.QR_CODE;
                break;
            case 12:
                barcodeFormat = BarcodeFormat.UPC_A;
                break;
            case 13:
                barcodeFormat = BarcodeFormat.UPC_E;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        o0.mo22712B(dVar, barcodeFormat).mo10850T(imageView);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.ticket_receipt_visual_content, viewGroup, false);
    }
}
