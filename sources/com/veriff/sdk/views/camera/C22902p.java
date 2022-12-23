package com.veriff.sdk.views.camera;

import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21882jp;
import com.veriff.sdk.views.camera.C22863d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001e\u0010\n\u001a\u00020\u000b*\u00020\f8@X\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, mo59060d2 = {"log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/internal/data/FlowStep;", "getPage$annotations", "(Lcom/veriff/sdk/internal/data/FlowStep;)V", "getPage", "(Lcom/veriff/sdk/internal/data/FlowStep;)Lcom/veriff/sdk/internal/analytics/Page;", "preferredCamera", "Lcom/veriff/sdk/views/camera/Camera$Type;", "Lcom/veriff/sdk/internal/data/PhotoContext;", "getPreferredCamera$annotations", "(Lcom/veriff/sdk/internal/data/PhotoContext;)V", "getPreferredCamera", "(Lcom/veriff/sdk/internal/data/PhotoContext;)Lcom/veriff/sdk/views/camera/Camera$Type;", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "(Lmobi/lab/veriff/data/AuthenticationFlowStep;)Lcom/veriff/sdk/views/camera/Camera$Type;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.p */
public final class C22902p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f58161a = C24465j.m61536a(C22896n.class);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C22863d.C22866c m56446b(C24422b bVar) {
        return m56443a(bVar.mo60569a().mo55486e());
    }

    /* renamed from: a */
    public static final C21783is m56442a(C21791iy iyVar) {
        C24362h.m61211f(iyVar, "$this$page");
        switch (C22903q.f58162a[iyVar.ordinal()]) {
            case 1:
                return C21783is.portrait;
            case 2:
                return C21783is.passport;
            case 3:
            case 4:
            case 5:
                return C21783is.document_front;
            case 6:
            case 7:
            case 8:
            case 9:
                return C21783is.document_back;
            case 10:
            case 11:
            case 12:
            case 13:
                return C21783is.document_and_face;
            case 14:
                return C21783is.barcode;
            case 15:
                return C21783is.nfc;
            case 16:
                return C21783is.proof_of_address;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final C22863d.C22866c m56443a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, "$this$preferredCamera");
        switch (C22903q.f58163b[jpVar.ordinal()]) {
            case 1:
            case 2:
                return C22863d.C22866c.FRONT;
            case 3:
            case 4:
                return C22863d.C22866c.BACK;
            case 5:
                throw new IllegalStateException("capture photo can't handle barcode");
            case 6:
                throw new IllegalStateException("capture photo can't handle nfc");
            case 7:
                throw new IllegalStateException("capture photo can't handle address capture");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
