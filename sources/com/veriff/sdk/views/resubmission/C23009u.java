package com.veriff.sdk.views.resubmission;

import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22607uy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import p583jk.C17875h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0015\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"bothSidesPhotosGuideList", "", "Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuide;", "passportGuideList", "selfieAndGuideList", "selfieAndIdentityGuideList", "isValidReason", "", "data", "Lcom/veriff/sdk/internal/data/StartSessionData;", "reasonCode", "", "(Ljava/lang/Integer;)Z", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.u */
public final class C23009u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List<C23004s> f58342a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C23004s> f58343b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final List<C23004s> f58344c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final List<C23004s> f58345d;

    static {
        int i = R$drawable.vrff_id_valid;
        int i2 = R$drawable.vrff_ic_submission_ok;
        int i3 = R$drawable.vrff_photo_back;
        int i4 = R$drawable.vrff_ic_submission_not_ok;
        f58342a = C17875h.m44281E(new C23004s(i, i2, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_id_back, i2, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(i3, i4, (C24236l) null, 4, (DefaultConstructorMarker) null));
        int i5 = i4;
        f58343b = C17875h.m44281E(new C23004s(R$drawable.vrff_selfie_id_not_ok_1, i5, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_selfie_id_not_ok_2, i5, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_selfie_id_ok, i2, (C24236l) null, 4, (DefaultConstructorMarker) null));
        int i6 = i4;
        f58344c = C17875h.m44281E(new C23004s(R$drawable.vrff_photo_dark, i6, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_photo_light, i6, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_photo_ok, i2, (C24236l) null, 4, (DefaultConstructorMarker) null));
        int i7 = i4;
        f58345d = C17875h.m44281E(new C23004s(R$drawable.vrff_passport_not_ok_1, i7, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_passport_not_ok_2, i7, (C24236l) null, 4, (DefaultConstructorMarker) null), new C23004s(R$drawable.vrff_passport_ok, i2, (C24236l) null, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: a */
    public static final boolean m56807a(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "data");
        C22607uy g = jwVar.mo55646g();
        if (g != null) {
            return m56808a(g.mo56891c());
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m56808a(Integer num) {
        for (C22954e a : C22954e.values()) {
            if (num != null && a.mo57877a() == num.intValue()) {
                return true;
            }
        }
        return false;
    }
}
