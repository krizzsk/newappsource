package com.veriff.sdk.views.camera;

import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21882jp;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.v */
public final /* synthetic */ class C22925v {

    /* renamed from: a */
    public static final /* synthetic */ int[] f58213a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f58214b;

    static {
        int[] iArr = new int[C21882jp.values().length];
        f58213a = iArr;
        iArr[C21882jp.FACE.ordinal()] = 1;
        iArr[C21882jp.DOCUMENT_FRONT.ordinal()] = 2;
        iArr[C21882jp.DOCUMENT_BACK.ordinal()] = 3;
        iArr[C21882jp.DOCUMENT_AND_FACE.ordinal()] = 4;
        int[] iArr2 = new int[C21791iy.values().length];
        f58214b = iArr2;
        iArr2[C21791iy.TAKE_PORTRAIT.ordinal()] = 1;
        iArr2[C21791iy.TAKE_PHOTO_OF_PASSPORT.ordinal()] = 2;
        iArr2[C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT.ordinal()] = 3;
        iArr2[C21791iy.TAKE_PHOTO_OF_ID_CARD_FRONT.ordinal()] = 4;
        iArr2[C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT.ordinal()] = 5;
        iArr2[C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK.ordinal()] = 6;
        iArr2[C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE.ordinal()] = 7;
        iArr2[C21791iy.TAKE_PHOTO_OF_ID_CARD_BACK.ordinal()] = 8;
        iArr2[C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK.ordinal()] = 9;
        iArr2[C21791iy.TAKE_PORTRAIT_WITH_PASSPORT.ordinal()] = 10;
        iArr2[C21791iy.TAKE_PORTRAIT_WITH_DRIVERS_LICENSE.ordinal()] = 11;
        iArr2[C21791iy.TAKE_PORTRAIT_WITH_ID_CARD.ordinal()] = 12;
        iArr2[C21791iy.TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT.ordinal()] = 13;
        iArr2[C21791iy.SCAN_BARCODE_OF_DRIVERS_LICENSE_BACK.ordinal()] = 14;
        iArr2[C21791iy.SCAN_NFC_OF_MRTD_PASSPORT.ordinal()] = 15;
        iArr2[C21791iy.TAKE_PROOF_OF_ADDRESS.ordinal()] = 16;
    }
}
