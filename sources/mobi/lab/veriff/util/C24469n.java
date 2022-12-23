package mobi.lab.veriff.util;

import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22696xo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0015"}, mo59060d2 = {"Lmobi/lab/veriff/util/ViewDependencies;", "", "T", "Lkotlin/Function0;", "fn", "use", "(Llf0/a;)Ljava/lang/Object;", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding$1", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/Strings;", "strings$1", "Lcom/veriff/sdk/Strings;", "strings", "<init>", "(Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/internal/data/FeatureFlags;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.n */
public final class C24469n {

    /* renamed from: a */
    public static final C24470a f61931a = new C24470a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final ThreadLocal<C24469n> f61932e = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22696xo f61933b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C21616ex f61934c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21789ix f61935d;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007JA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b20\u0001¨\u0006!"}, mo59060d2 = {"Lmobi/lab/veriff/util/ViewDependencies$Companion;", "", "Lmobi/lab/veriff/util/ViewDependencies;", "deps", "Lbf0/d;", "set", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "flags", "unset", "T", "Lkotlin/Function0;", "fn", "use", "(Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/internal/data/FeatureFlags;Llf0/a;)Ljava/lang/Object;", "getBranding", "()Lmobi/lab/veriff/util/resourcesHelper/Branding;", "getContext", "()Lmobi/lab/veriff/util/ViewDependencies;", "context", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "getStrings", "()Lcom/veriff/sdk/Strings;", "Ljava/lang/ThreadLocal;", "theContext", "Ljava/lang/ThreadLocal;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.n$a */
    public static final class C24470a {
        private C24470a() {
        }

        public /* synthetic */ C24470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        private final C24469n m61564e() {
            C24469n nVar = (C24469n) C24469n.f61932e.get();
            if (nVar != null) {
                return nVar;
            }
            throw new IllegalStateException("No inflation context set, did you forget to wrap using `use {}`?");
        }

        /* renamed from: a */
        public final C22696xo mo60713a() {
            return C24469n.f61931a.m61564e().f61933b;
        }

        /* renamed from: b */
        public final C21616ex mo60716b() {
            return C24469n.f61931a.m61564e().f61934c;
        }

        /* renamed from: c */
        public final C21789ix mo60717c() {
            return C24469n.f61931a.m61564e().f61935d;
        }

        /* renamed from: d */
        public final void mo60718d() {
            C24469n.f61932e.remove();
        }

        /* renamed from: a */
        public final void mo60714a(C22696xo xoVar, C21616ex exVar, C21789ix ixVar) {
            C24362h.m61211f(xoVar, "branding");
            C24362h.m61211f(exVar, "strings");
            mo60715a(new C24469n(xoVar, exVar, ixVar));
        }

        /* renamed from: a */
        public final void mo60715a(C24469n nVar) {
            C24362h.m61211f(nVar, "deps");
            C24469n.f61932e.set(nVar);
        }
    }

    public C24469n(C22696xo xoVar, C21616ex exVar, C21789ix ixVar) {
        C24362h.m61211f(xoVar, "branding");
        C24362h.m61211f(exVar, "strings");
        this.f61933b = xoVar;
        this.f61934c = exVar;
        this.f61935d = ixVar;
    }
}
