package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
public class OnedRecognitionOptions {
    @UsedByNative("jni_common.cc")
    private int codabarMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private int codabarMinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int code128MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code128MinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int code39MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code39MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private boolean code39UseCheckDigit = false;
    @UsedByNative("jni_common.cc")
    private boolean code39UseExtendedMode = false;
    @UsedByNative("jni_common.cc")
    private int code93MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code93MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int ean13UpcaMinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int ean8MinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int itfMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private int itfMinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int upceMinConsistentLines = 3;
}
