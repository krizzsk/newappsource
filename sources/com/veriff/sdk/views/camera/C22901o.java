package com.veriff.sdk.views.camera;

import com.veriff.sdk.internal.C21882jp;
import com.veriff.sdk.views.camera.g$c;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.o */
public final /* synthetic */ class C22901o {

    /* renamed from: a */
    public static final /* synthetic */ int[] f58159a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f58160b;

    static {
        int[] iArr = new int[C21882jp.values().length];
        f58159a = iArr;
        iArr[C21882jp.FACE.ordinal()] = 1;
        iArr[C21882jp.DOCUMENT_FRONT.ordinal()] = 2;
        iArr[C21882jp.DOCUMENT_BACK.ordinal()] = 3;
        iArr[C21882jp.DOCUMENT_AND_FACE.ordinal()] = 4;
        iArr[C21882jp.DOCUMENT_BACK_BARCODE.ordinal()] = 5;
        iArr[C21882jp.DOCUMENT_NFC.ordinal()] = 6;
        iArr[C21882jp.ADDRESS.ordinal()] = 7;
        int[] iArr2 = new int[g$c.C22870a.values().length];
        f58160b = iArr2;
        iArr2[g$c.C22870a.DISABLED.ordinal()] = 1;
        iArr2[g$c.C22870a.SHOOTING_DISABLED.ordinal()] = 2;
        iArr2[g$c.C22870a.ENABLED.ordinal()] = 3;
    }
}
