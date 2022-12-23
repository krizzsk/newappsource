package com.veriff.sdk.internal;

import com.veriff.sdk.internal.widgets.ProgressItem;
import com.veriff.sdk.views.upload.C23029b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, mo59060d2 = {"toProgressState", "Lcom/veriff/sdk/internal/widgets/ProgressItem$State;", "Lcom/veriff/sdk/views/upload/DecisionStatus;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.si */
public final class C22515si {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final ProgressItem.C22655a m54846b(C23029b bVar) {
        int i = C22516sj.f56816a[bVar.ordinal()];
        if (i == 1) {
            return ProgressItem.C22655a.NOT_STARTED;
        }
        if (i == 2) {
            return ProgressItem.C22655a.IN_PROGRESS;
        }
        if (i == 3) {
            return ProgressItem.C22655a.DONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
