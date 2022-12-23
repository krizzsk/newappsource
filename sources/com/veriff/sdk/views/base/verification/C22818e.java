package com.veriff.sdk.views.base.verification;

import android.content.Intent;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22661wm;
import java.util.List;
import kotlin.Metadata;
import mobi.lab.veriff.data.C24424c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J&\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\u0013\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&J\"\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u001e\u001a\u00020\u0002H&¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/verification/Navigator;", "", "Lbf0/d;", "openCountrySelect", "", "errorCode", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Landroid/content/Intent;", "returnIntent", "openError", "", "documentType", "Lmobi/lab/veriff/data/Country;", "selectedCountry", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "steps", "openFlow", "openNonDocumentFlow", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "resubmittedSession", "", "isFromDecision", "openResubmissionFeedback", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "showConfirmExitDialog", "showLanguagePicker", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.base.verification.e */
public interface C22818e {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.base.verification.e$a */
    public static final class C22819a {
        /* renamed from: a */
        public static /* synthetic */ void m56103a(C22818e eVar, int i, C22661wm wmVar, Intent intent, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    wmVar = null;
                }
                if ((i2 & 4) != 0) {
                    intent = null;
                }
                eVar.mo57578a(i, wmVar, intent);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openError");
        }
    }

    /* renamed from: a */
    void mo57578a(int i, C22661wm wmVar, Intent intent);

    /* renamed from: a */
    void mo57588a(C21783is isVar, C21719gi giVar, C22661wm wmVar);

    /* renamed from: a */
    void mo57580a(C22607uy uyVar, boolean z);

    /* renamed from: a */
    void mo57583a(String str, C24424c cVar, List<? extends C21791iy> list);

    /* renamed from: a */
    void mo57584a(List<? extends C21791iy> list);

    /* renamed from: c */
    void mo57586c();
}
