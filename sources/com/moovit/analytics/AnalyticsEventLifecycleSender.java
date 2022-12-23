package com.moovit.analytics;

import androidx.camera.camera2.internal.C0509c;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import ce0.C21100e;
import com.moovit.C15676b;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;
import java.util.IdentityHashMap;
import p543hq.C17474b;

public class AnalyticsEventLifecycleSender implements C1025n {

    /* renamed from: f */
    public static final IdentityHashMap f37408f = new IdentityHashMap();

    /* renamed from: b */
    public final C14713b f37409b;

    /* renamed from: c */
    public final Lifecycle.State f37410c;

    /* renamed from: d */
    public final C17474b f37411d;

    /* renamed from: e */
    public final boolean f37412e;

    /* renamed from: com.moovit.analytics.AnalyticsEventLifecycleSender$a */
    public static /* synthetic */ class C14712a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37413a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37413a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37413a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37413a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37413a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37413a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.analytics.AnalyticsEventLifecycleSender.C14712a.<clinit>():void");
        }
    }

    public AnalyticsEventLifecycleSender(C14713b bVar, Lifecycle.State state, C17474b bVar2, boolean z) {
        this.f37409b = bVar;
        C21100e.m49373x(state, "lifecycleState");
        this.f37410c = state;
        this.f37411d = bVar2;
        this.f37412e = z;
    }

    /* renamed from: a */
    public static void m37028a(C1033p pVar, C14713b bVar, Lifecycle.State state, C17474b bVar2) {
        IdentityHashMap identityHashMap = f37408f;
        AnalyticsEventLifecycleSender analyticsEventLifecycleSender = (AnalyticsEventLifecycleSender) identityHashMap.get(pVar);
        Lifecycle lifecycle = pVar.getLifecycle();
        if (analyticsEventLifecycleSender != null) {
            if (!analyticsEventLifecycleSender.f37411d.equals(bVar2)) {
                lifecycle.mo4226c(analyticsEventLifecycleSender);
            } else {
                return;
            }
        }
        AnalyticsEventLifecycleSender analyticsEventLifecycleSender2 = new AnalyticsEventLifecycleSender(bVar, state, bVar2, false);
        identityHashMap.put(pVar, analyticsEventLifecycleSender2);
        lifecycle.mo4224a(analyticsEventLifecycleSender2);
    }

    /* renamed from: c */
    public static void m37029c(SuggestionsSectionFragment suggestionsSectionFragment, Lifecycle.State state, C17474b bVar) {
        suggestionsSectionFragment.getLifecycle().mo4224a(new AnalyticsEventLifecycleSender(new C14713b(suggestionsSectionFragment), state, bVar, true));
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        Lifecycle.Event event2;
        int i = C14712a.f37413a[this.f37410c.ordinal()];
        if (i == 1) {
            event2 = Lifecycle.Event.ON_CREATE;
        } else if (i == 2) {
            event2 = Lifecycle.Event.ON_START;
        } else if (i == 3) {
            event2 = Lifecycle.Event.ON_RESUME;
        } else if (i != 4) {
            event2 = null;
        } else {
            event2 = Lifecycle.Event.ON_DESTROY;
        }
        if (event == event2) {
            MoovitExecutors.MAIN_THREAD.execute(new C0509c(12, this, pVar));
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            f37408f.remove(pVar);
        }
    }

    /* renamed from: com.moovit.analytics.AnalyticsEventLifecycleSender$b */
    public static final class C14713b {

        /* renamed from: a */
        public final C15682c<?> f37414a;

        /* renamed from: b */
        public final C15676b<?> f37415b;

        public C14713b(SuggestionsSectionFragment suggestionsSectionFragment) {
            this.f37414a = suggestionsSectionFragment;
            this.f37415b = null;
        }

        public C14713b(C15676b<?> bVar) {
            this.f37414a = null;
            C21100e.m49373x(bVar, "dialogFragment");
            this.f37415b = bVar;
        }
    }
}
