package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;
import p698og.C18747a;

@KeepForSdk
@DynamiteApi
public class ThickBarcodeScannerCreator extends zzbn {
    public zzbl newBarcodeScanner(IObjectWrapper iObjectWrapper, zzbc zzbc) {
        return new C18747a((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbc);
    }
}
