package com.moovit.barcode.scan.engines;

import cf0.C21136j;
import com.google.zxing.BarcodeFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p480ez.C16912d;

@Metadata(mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "", "Lcom/google/zxing/BarcodeFormat;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class ZxingBarcodeScannerFragment$supportedFormats$2 extends Lambda implements C24225a<List<? extends BarcodeFormat>> {
    public final /* synthetic */ ZxingBarcodeScannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZxingBarcodeScannerFragment$supportedFormats$2(ZxingBarcodeScannerFragment zxingBarcodeScannerFragment) {
        super(0);
        this.this$0 = zxingBarcodeScannerFragment;
    }

    public final Object invoke() {
        BarcodeFormat barcodeFormat;
        ArrayList<com.moovit.barcode.BarcodeFormat> parcelableArrayList = this.this$0.requireArguments().getParcelableArrayList("formats");
        if (parcelableArrayList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(parcelableArrayList, 10));
        for (com.moovit.barcode.BarcodeFormat ordinal : parcelableArrayList) {
            switch (C16912d.f43928a[ordinal.ordinal()]) {
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
            arrayList.add(barcodeFormat);
        }
        return arrayList;
    }
}
