package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
public class RecognitionOptions {
    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;
    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    /* renamed from: a */
    public final void mo19355a(int i) {
        this.barcodeFormats = i;
    }
}
