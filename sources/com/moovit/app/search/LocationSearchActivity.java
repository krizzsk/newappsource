package com.moovit.app.search;

import android.content.Intent;
import com.moovit.app.search.AbstractSearchActivity;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.transit.LocationDescriptor;
import f00.C16919g;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p399bw.C13699c;
import p399bw.C13700d;
import p583jk.C17875h;

public class LocationSearchActivity extends AbstractSearchActivity implements C13699c {

    /* renamed from: com.moovit.app.search.LocationSearchActivity$a */
    public class C15274a extends C17875h {
        /* renamed from: K */
        public final SearchAction mo45816K(SearchLocationItem searchLocationItem) {
            if (searchLocationItem.mo45821f()) {
                return null;
            }
            return SearchAction.COPY;
        }
    }

    /* renamed from: com.moovit.app.search.LocationSearchActivity$b */
    public static /* synthetic */ class C15275b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39450a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.search.SearchAction[] r0 = com.moovit.app.search.SearchAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39450a = r0
                com.moovit.app.search.SearchAction r1 = com.moovit.app.search.SearchAction.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39450a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.search.SearchAction r1 = com.moovit.app.search.SearchAction.COPY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39450a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.search.SearchAction r1 = com.moovit.app.search.SearchAction.SHOW_DETAILS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.LocationSearchActivity.C15275b.<clinit>():void");
        }
    }

    /* renamed from: A2 */
    public final List<AbstractSearchActivity.C15270e> mo45801A2() {
        Intent intent = getIntent();
        return Collections.singletonList(AbstractSearchActivity.C15270e.m39072b(this, intent.getStringExtra("emptyStateExtra"), intent.getBooleanExtra("extra_enable_current_location", false), intent.getBooleanExtra("extra_enable_favorite_locations", false)));
    }

    /* renamed from: C2 */
    public final void mo45803C2(LocationDescriptor locationDescriptor) {
        mo45808H2(locationDescriptor);
    }

    /* renamed from: D2 */
    public final void mo45804D2(LocationDescriptor locationDescriptor) {
        mo45808H2(locationDescriptor);
    }

    /* renamed from: E2 */
    public final boolean mo45805E2(SearchLocationItem searchLocationItem, SearchAction searchAction) {
        int i = C15275b.f39450a[searchAction.ordinal()];
        if (i == 1) {
            boolean f = searchLocationItem.mo45821f();
            if (!getIntent().getBooleanExtra("extra_enable_smart_feature", true) || f || !C13700d.f33766e.mo40567a(this, searchLocationItem)) {
                mo45808H2(SearchLocationItem.m39103g(searchLocationItem));
            }
            return !f;
        } else if (i == 2) {
            this.f39423U.mo1788r(searchLocationItem.f39460e, true);
            return false;
        } else if (i == 3) {
            return true;
        } else {
            super.mo45805E2(searchLocationItem, searchAction);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo40566b(SearchLocationItem searchLocationItem) {
        mo45808H2(SearchLocationItem.m39103g(searchLocationItem));
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        C16919g.C16924e eVar = C13700d.f33765d;
        HashSet hashSet = new HashSet();
        hashSet.add("USER_CONTEXT");
        hashSet.add("USER_ACCOUNT");
        s1.addAll(hashSet);
        return s1;
    }

    /* renamed from: z2 */
    public final C17875h mo45809z2() {
        return new C15274a();
    }
}
