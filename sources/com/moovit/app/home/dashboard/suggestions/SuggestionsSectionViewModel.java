package com.moovit.app.home.dashboard.suggestions;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1043v;
import bf0.C21049c;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import ff0.C23349c;
import kotlin.C23812a;
import mf0.C24362h;
import p172m9.C5720b;
import p396bt.C13682b;
import p583jk.C17875h;
import p977zz.C20932c0;
import wh0.C25177g;
import wh0.C25208q0;

public final class SuggestionsSectionViewModel extends C0989a {

    /* renamed from: c */
    public final C25208q0 f38298c = new C25208q0(C5720b.m14034B(1, new C20932c0((String) null, 10)));

    /* renamed from: d */
    public final C21049c f38299d;

    /* renamed from: e */
    public final C1043v f38300e;

    /* renamed from: f */
    public final C21049c f38301f;

    /* renamed from: g */
    public final C1043v f38302g;

    /* renamed from: h */
    public long f38303h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsSectionViewModel(Application application) {
        super(application);
        C24362h.m61211f(application, "application");
        C21049c b = C23812a.m58432b(SuggestionsSectionViewModel$cardsMutableLiveData$2.f38304f);
        this.f38299d = b;
        this.f38300e = (C1043v) b.getValue();
        C21049c b2 = C23812a.m58432b(SuggestionsSectionViewModel$dataResultMutableLiveData$2.f38305f);
        this.f38301f = b2;
        this.f38302g = (C1043v) b2.getValue();
        this.f38303h = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37811a(com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r4, ff0.C23349c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$createProvidersList$1
            if (r0 == 0) goto L_0x0016
            r0 = r5
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$createProvidersList$1 r0 = (com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$createProvidersList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$createProvidersList$1 r0 = new com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$createProvidersList$1
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p584jl.C17885a.m44475z0(r5)
            goto L_0x004b
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r5)
            android.app.Application r4 = r4.f3907b
            java.lang.String r5 = "getApplication()"
            mf0.C24362h.m61210e(r4, r5)
            lz.a r4 = ce0.C21100e.m49329X(r4)
            r0.label = r3
            java.lang.String r5 = "CONFIGURATION"
            java.lang.Object r5 = com.moovit.commons.appdata.AppDataManagerExtKt.m40161a(r4, r5, r0)
            if (r5 != r1) goto L_0x004b
            goto L_0x006f
        L_0x004b:
            q00.a r5 = (q00.C19047a) r5
            ft.a$a r4 = p498ft.C17070a.f44253a
            java.lang.Object r4 = r5.mo51505b(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x0061
            java.util.List<et.e> r1 = p474et.C16880l.f43902a
            goto L_0x006f
        L_0x0061:
            java.util.List<et.e> r4 = p474et.C16880l.f43902a
            java.lang.String r5 = "<this>"
            mf0.C24362h.m61211f(r4, r5)
            java.util.List r1 = kotlin.collections.C23825c.m58501M0(r4)
            java.util.Collections.shuffle(r1)
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel.m37811a(com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37812b(com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel r4, p474et.C16873e r5, p474et.C16876h r6, ff0.C23349c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadProviderCards$1
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadProviderCards$1 r0 = (com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadProviderCards$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadProviderCards$1 r0 = new com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel$loadProviderCards$1
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p584jl.C17885a.m44475z0(r7)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r7)
            android.app.Application r4 = r4.f3907b     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = "getApplication()"
            mf0.C24362h.m61210e(r4, r7)     // Catch:{ all -> 0x0049 }
            r0.label = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r7 = r5.mo45182b(r4, r6, r0)     // Catch:{ all -> 0x0049 }
            if (r7 != r1) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            r1 = r7
            et.f r1 = (p474et.C16874f) r1     // Catch:{ all -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            r4 = move-exception
            kotlin.Result$Failure r1 = p584jl.C17885a.m44400G(r4)
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel.m37812b(com.moovit.app.home.dashboard.suggestions.SuggestionsSectionViewModel, et.e, et.h, ff0.c):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo45164c(boolean z) {
        long j;
        ItineraryHistoryItem itineraryHistoryItem;
        if (z) {
            C25177g.m63218b(C17875h.m44315z(this), this.f38298c, new SuggestionsSectionViewModel$loadAllCards$1(this, (C23349c<? super SuggestionsSectionViewModel$loadAllCards$1>) null), 2);
            return;
        }
        Application application = this.f3907b;
        C24362h.m61210e(application, "getApplication()");
        C13682b bVar = (C13682b) application.getSystemService("latest_itinerary_controller_service");
        long j2 = this.f38303h;
        if (bVar == null || (itineraryHistoryItem = bVar.f33720d) == null) {
            j = 0;
        } else {
            j = itineraryHistoryItem.f38131d;
        }
        if (j2 < j) {
            C25177g.m63218b(C17875h.m44315z(this), this.f38298c, new SuggestionsSectionViewModel$loadAllCards$1(this, (C23349c<? super SuggestionsSectionViewModel$loadAllCards$1>) null), 2);
        }
    }
}
