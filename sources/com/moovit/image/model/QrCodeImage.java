package com.moovit.image.model;

import com.google.zxing.BarcodeFormat;
import p009a8.C0112l;
import p025b6.C1489d;

public class QrCodeImage extends Image {

    /* renamed from: f */
    public static C1489d<BarcodeFormat> f41816f = new C1489d<>("com.moovit.image.model.QrCodeImage.Format", BarcodeFormat.QR_CODE, new C0112l(1));

    public QrCodeImage(String str) {
        super("QrCodeImage", str, (String[]) null, false);
    }
}
