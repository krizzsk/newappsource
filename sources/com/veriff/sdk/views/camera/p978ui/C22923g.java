package com.veriff.sdk.views.camera.p978ui;

import com.veriff.sdk.internal.C21791iy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/ui/MergedUiUtils;", "", "()V", "getMergedUiType", "Lcom/veriff/sdk/views/camera/ui/MergedUiType;", "Lcom/veriff/sdk/internal/data/FlowStep;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ui.g */
public final class C22923g {

    /* renamed from: a */
    public static final C22923g f58211a = new C22923g();

    private C22923g() {
    }

    /* renamed from: a */
    public final C22922f mo57808a(C21791iy iyVar) {
        C24362h.m61211f(iyVar, "$this$getMergedUiType");
        switch (C22924h.f58212a[iyVar.mo55486e().ordinal()]) {
            case 1:
                return C22922f.SELFIE;
            case 2:
                return C22922f.DOC;
            case 3:
                return C22922f.DOC_BACK;
            case 4:
                return C22922f.BARCODE;
            case 5:
                return C22922f.SELFIE_WITH_DOC;
            case 6:
                throw new IllegalStateException("Invalid step for merged UI");
            case 7:
                throw new IllegalStateException("Invalid step for merged UI");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
