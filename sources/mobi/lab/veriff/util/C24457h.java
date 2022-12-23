package mobi.lab.veriff.util;

import bf0.C21050d;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.burly.Burly;
import com.veriff.sdk.internal.C21615ew;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21617ey;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21899jy;
import ff0.C23349c;
import gf0.C23413c;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24240p;
import mf0.C24362h;
import p583jk.C17875h;
import p584jl.C17885a;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u000bJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J5\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageUtil;", "", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "newLocaleLanguage", "Lbf0/d;", "changeLanguage", "(Lmobi/lab/veriff/util/LanguageCountryLocale;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "preselectedType", "", "reportChange", "(Lmobi/lab/veriff/util/LanguageCountryLocale;Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;ZLff0/c;)Ljava/lang/Object;", "Ljava/util/Locale;", "getCurrentLocale", "", "getLayoutDirection", "", "getServerCodeForCurrentLanguage", "serverLanguageCode", "overrideLanguage", "isRelaunch", "initLanguage", "(Ljava/lang/String;Ljava/lang/String;ZLff0/c;)Ljava/lang/Object;", "language", "loadTranslations", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "<set-?>", "currLanguage", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "getCurrLanguage", "()Lmobi/lab/veriff/util/LanguageCountryLocale;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "getStrings", "()Lcom/veriff/sdk/Strings;", "setStrings", "(Lcom/veriff/sdk/Strings;)V", "Lcom/veriff/sdk/internal/data/TranslationsLoader;", "translationsLoader", "Lcom/veriff/sdk/internal/data/TranslationsLoader;", "<init>", "(Lcom/veriff/sdk/internal/data/TranslationsLoader;Lcom/veriff/sdk/internal/analytics/Analytics;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.h */
public final class C24457h {

    /* renamed from: a */
    public static final C24459b f61897a = new C24459b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C24465j f61898f = C24465j.m61536a(C24457h.class);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List<C24454g> f61899h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C24454g f61900i;

    /* renamed from: b */
    private C21616ex f61901b = new C21615ew();

    /* renamed from: c */
    private C24454g f61902c = f61900i;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21899jy f61903d;

    /* renamed from: e */
    private final C21645fu f61904e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$a */
    public static final class C24458a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C21100e.m49298B(((C24454g) t).mo60677b(), ((C24454g) t2).mo60677b());
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageUtil$Companion;", "", "()V", "LANGUAGE_ENGLISH", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "currentSystemLanguageAsSupportedLanguage", "getCurrentSystemLanguageAsSupportedLanguage$annotations", "getCurrentSystemLanguageAsSupportedLanguage", "()Lmobi/lab/veriff/util/LanguageCountryLocale;", "defaultLanguage", "getDefaultLanguage", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "supportedLanguagesList", "", "getSupportedLanguagesList", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$b */
    public static final class C24459b {
        private C24459b() {
        }

        public /* synthetic */ C24459b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24454g mo60701a() {
            return C24457h.f61900i;
        }

        /* renamed from: b */
        public final List<C24454g> mo60702b() {
            return C24457h.f61899h;
        }

        /* renamed from: c */
        public final C24454g mo60703c() {
            Locale locale = Locale.getDefault();
            C24465j h = C24457h.f61898f;
            StringBuilder sb = new StringBuilder();
            sb.append("Looking a match for system locale  ");
            sb.append(locale);
            sb.append(" language=");
            C24362h.m61210e(locale, "systemLocale");
            sb.append(locale.getLanguage());
            sb.append(' ');
            sb.append("country=");
            sb.append(locale.getCountry());
            sb.append(" script=");
            sb.append(locale.getScript());
            h.mo60705d(sb.toString());
            return C24454g.f61890a.mo60686a(locale);
        }
    }

    @C23413c(mo58554c = "mobi.lab.veriff.util.LanguageUtil", mo58555f = "LanguageUtil.kt", mo58556l = {57}, mo58557m = "changeLanguage")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageCountryLocale;", "newLocaleLanguage", "Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "preselectedType", "", "reportChange", "Lff0/c;", "Lbf0/d;", "continuation", "", "changeLanguage"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$c */
    public static final class C24460c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f61905a;

        /* renamed from: b */
        public int f61906b;

        /* renamed from: c */
        public final /* synthetic */ C24457h f61907c;

        /* renamed from: d */
        public Object f61908d;

        /* renamed from: e */
        public Object f61909e;

        /* renamed from: f */
        public Object f61910f;

        /* renamed from: g */
        public boolean f61911g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24460c(C24457h hVar, C23349c cVar) {
            super(cVar);
            this.f61907c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61905a = obj;
            this.f61906b |= Integer.MIN_VALUE;
            return this.f61907c.mo60693a((C24454g) null, (C21667gf.C21714g) null, false, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "mobi.lab.veriff.util.LanguageUtil", mo58555f = "LanguageUtil.kt", mo58556l = {44}, mo58557m = "initLanguage")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo59060d2 = {"", "serverLanguageCode", "overrideLanguage", "", "isRelaunch", "Lff0/c;", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "continuation", "", "initLanguage"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$d */
    public static final class C24461d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f61912a;

        /* renamed from: b */
        public int f61913b;

        /* renamed from: c */
        public final /* synthetic */ C24457h f61914c;

        /* renamed from: d */
        public Object f61915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24461d(C24457h hVar, C23349c cVar) {
            super(cVar);
            this.f61914c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61912a = obj;
            this.f61913b |= Integer.MIN_VALUE;
            return this.f61914c.mo60692a((String) null, (String) null, false, (C23349c<? super C24454g>) this);
        }
    }

    @C23413c(mo58554c = "mobi.lab.veriff.util.LanguageUtil", mo58555f = "LanguageUtil.kt", mo58556l = {75}, mo58557m = "loadTranslations")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageCountryLocale;", "language", "Lff0/c;", "Lbf0/d;", "continuation", "", "loadTranslations"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$e */
    public static final class C24462e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f61916a;

        /* renamed from: b */
        public int f61917b;

        /* renamed from: c */
        public final /* synthetic */ C24457h f61918c;

        /* renamed from: d */
        public Object f61919d;

        /* renamed from: e */
        public Object f61920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24462e(C24457h hVar, C23349c cVar) {
            super(cVar);
            this.f61918c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61916a = obj;
            this.f61917b |= Integer.MIN_VALUE;
            return this.f61918c.mo60695b((C24454g) null, this);
        }
    }

    @C23413c(mo58554c = "mobi.lab.veriff.util.LanguageUtil$loadTranslations$translated$1", mo58555f = "LanguageUtil.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lcom/veriff/sdk/TranslatedStrings;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.h$f */
    public static final class C24463f extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21617ey>, Object> {

        /* renamed from: a */
        public int f61921a;

        /* renamed from: b */
        public final /* synthetic */ C24457h f61922b;

        /* renamed from: c */
        public final /* synthetic */ C24454g f61923c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24463f(C24457h hVar, C24454g gVar, C23349c cVar) {
            super(2, cVar);
            this.f61922b = hVar;
            this.f61923c = gVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C24463f(this.f61922b, this.f61923c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C24463f) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f61921a == 0) {
                C17885a.m44475z0(obj);
                return this.f61922b.f61903d.mo55409a(this.f61923c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        C24454g gVar = new C24454g("en", (String) null, (String) null, (String) null, 0, "English", 30, (DefaultConstructorMarker) null);
        f61899h = C23825c.m58496H0(C17875h.m44281E(gVar, new C24454g("cs", (String) null, (String) null, (String) null, 0, "Česky", 30, (DefaultConstructorMarker) null), new C24454g("de", (String) null, (String) null, (String) null, 0, "Deutsch", 30, (DefaultConstructorMarker) null), new C24454g("et", (String) null, (String) null, (String) null, 0, "Eesti", 30, (DefaultConstructorMarker) null), new C24454g("fr", (String) null, (String) null, (String) null, 0, "Français", 30, (DefaultConstructorMarker) null), new C24454g("it", (String) null, (String) null, (String) null, 0, "Italiano", 30, (DefaultConstructorMarker) null), new C24454g("lv", (String) null, (String) null, (String) null, 0, "Latviešu", 30, (DefaultConstructorMarker) null), new C24454g(Burly.KEY_LT, (String) null, (String) null, (String) null, 0, "Lietuvių", 30, (DefaultConstructorMarker) null), new C24454g("nl", (String) null, (String) null, (String) null, 0, "Nederlands", 30, (DefaultConstructorMarker) null), new C24454g("pt", (String) null, (String) null, (String) null, 0, "Português (Brasil)", 30, (DefaultConstructorMarker) null), new C24454g("ru", (String) null, (String) null, (String) null, 0, "Русский", 30, (DefaultConstructorMarker) null), new C24454g("pl", (String) null, (String) null, (String) null, 0, "Polski", 30, (DefaultConstructorMarker) null), new C24454g("vi", (String) null, (String) null, (String) null, 0, "Tiếng Việt", 30, (DefaultConstructorMarker) null), new C24454g("zh", (String) null, (String) null, (String) null, 0, "中文（简体)", 30, (DefaultConstructorMarker) null), new C24454g("hi", (String) null, (String) null, (String) null, 0, "हिंदी", 30, (DefaultConstructorMarker) null), new C24454g("ka", (String) null, (String) null, (String) null, 0, "ქართული", 30, (DefaultConstructorMarker) null), new C24454g("ms", (String) null, (String) null, (String) null, 0, "Bahasa Melayu", 30, (DefaultConstructorMarker) null), new C24454g("uk", (String) null, (String) null, (String) null, 0, "Українська", 30, (DefaultConstructorMarker) null), new C24454g("ar", (String) null, (String) null, (String) null, 1, "العربية", 14, (DefaultConstructorMarker) null), new C24454g("tr", (String) null, (String) null, (String) null, 0, "Türkçe", 30, (DefaultConstructorMarker) null), new C24454g("ja", (String) null, (String) null, (String) null, 0, "日本語", 30, (DefaultConstructorMarker) null), new C24454g("es", (String) null, (String) null, (String) null, 0, "Español (España)", 30, (DefaultConstructorMarker) null), new C24454g("es", "es-MX", "MX", (String) null, 0, "Español (México)", 24, (DefaultConstructorMarker) null), new C24454g("es", "es-latam", "419", (String) null, 0, "Español (Latinoamérica)", 24, (DefaultConstructorMarker) null), new C24454g("hu", (String) null, (String) null, (String) null, 0, "magyar", 30, (DefaultConstructorMarker) null), new C24454g("ro", (String) null, (String) null, (String) null, 0, "română", 30, (DefaultConstructorMarker) null), new C24454g("bg", (String) null, (String) null, (String) null, 0, "Български", 30, (DefaultConstructorMarker) null), new C24454g("sr", "sr-Latn", (String) null, "Latn", 0, "srpski", 20, (DefaultConstructorMarker) null), new C24454g("sl", (String) null, (String) null, (String) null, 0, "slovenski", 30, (DefaultConstructorMarker) null), new C24454g("sk", (String) null, (String) null, (String) null, 0, "slovenčina", 30, (DefaultConstructorMarker) null), new C24454g("mk", (String) null, (String) null, (String) null, 0, "македонски јазик", 30, (DefaultConstructorMarker) null), new C24454g("hr", (String) null, (String) null, (String) null, 0, "hrvatski", 30, (DefaultConstructorMarker) null), new C24454g("nb", (String) null, (String) null, (String) null, 0, "norsk (bokmål)", 30, (DefaultConstructorMarker) null), new C24454g("fi", (String) null, (String) null, (String) null, 0, "suomi", 30, (DefaultConstructorMarker) null), new C24454g("sv", (String) null, (String) null, (String) null, 0, "svenska", 30, (DefaultConstructorMarker) null), new C24454g("ca", (String) null, (String) null, (String) null, 0, "català", 30, (DefaultConstructorMarker) null), new C24454g("da", (String) null, (String) null, (String) null, 0, "dansk", 30, (DefaultConstructorMarker) null), new C24454g("el", (String) null, (String) null, (String) null, 0, "Ελληνικά", 30, (DefaultConstructorMarker) null), new C24454g("id", (String) null, (String) null, (String) null, 0, "bahasa Indonesia", 30, (DefaultConstructorMarker) null)), new C24458a());
        f61900i = gVar;
    }

    public C24457h(C21899jy jyVar, C21645fu fuVar) {
        C24362h.m61211f(jyVar, "translationsLoader");
        C24362h.m61211f(fuVar, "analytics");
        this.f61903d = jyVar;
        this.f61904e = fuVar;
    }

    /* renamed from: b */
    public final C24454g mo60696b() {
        return this.f61902c;
    }

    /* renamed from: c */
    public final String mo60697c() {
        return this.f61902c.mo60678c();
    }

    /* renamed from: d */
    public final int mo60698d() {
        return this.f61902c.mo60679d();
    }

    /* renamed from: e */
    public final Locale mo60699e() {
        return this.f61902c.mo60675a();
    }

    /* renamed from: a */
    public final C21616ex mo60691a() {
        return this.f61901b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60695b(mobi.lab.veriff.util.C24454g r8, ff0.C23349c<? super bf0.C21050d> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof mobi.lab.veriff.util.C24457h.C24462e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            mobi.lab.veriff.util.h$e r0 = (mobi.lab.veriff.util.C24457h.C24462e) r0
            int r1 = r0.f61917b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61917b = r1
            goto L_0x0018
        L_0x0013:
            mobi.lab.veriff.util.h$e r0 = new mobi.lab.veriff.util.h$e
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f61916a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f61917b
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r8 = r0.f61920e
            com.veriff.sdk.internal.ff$a r8 = (com.veriff.sdk.internal.C21625ff.C21626a) r8
            java.lang.Object r0 = r0.f61919d
            mobi.lab.veriff.util.h r0 = (mobi.lab.veriff.util.C24457h) r0
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            p584jl.C17885a.m44475z0(r9)
            com.veriff.sdk.internal.ff r9 = com.veriff.sdk.internal.C21625ff.f54627a
            r2 = 0
            com.veriff.sdk.internal.ff$a r9 = com.veriff.sdk.internal.C21625ff.m52501a(r9, r2, r3, r2)
            ci0.a r4 = wh0.C25184i0.f63460b
            mobi.lab.veriff.util.h$f r5 = new mobi.lab.veriff.util.h$f
            r5.<init>(r7, r8, r2)
            r0.f61919d = r7
            r0.f61920e = r9
            r0.f61917b = r3
            java.lang.Object r8 = wh0.C25177g.m63221e(r4, r5, r0)
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0059:
            com.veriff.sdk.internal.ey r9 = (com.veriff.sdk.internal.C21617ey) r9
            r8.mo54900a()
            if (r9 == 0) goto L_0x0062
            r0.f61901b = r9
        L_0x0062:
            bf0.d r8 = bf0.C21050d.f52856a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.util.C24457h.mo60695b(mobi.lab.veriff.util.g, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo60694a(C24454g gVar, C23349c<? super C21050d> cVar) {
        Object a = mo60693a(gVar, (C21667gf.C21714g) null, true, cVar);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return C21050d.f52856a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60692a(java.lang.String r17, java.lang.String r18, boolean r19, ff0.C23349c<? super mobi.lab.veriff.util.C24454g> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            boolean r4 = r3 instanceof mobi.lab.veriff.util.C24457h.C24461d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            mobi.lab.veriff.util.h$d r4 = (mobi.lab.veriff.util.C24457h.C24461d) r4
            int r5 = r4.f61913b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f61913b = r5
            goto L_0x0020
        L_0x001b:
            mobi.lab.veriff.util.h$d r4 = new mobi.lab.veriff.util.h$d
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f61912a
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r4.f61913b
            r7 = 1
            if (r6 == 0) goto L_0x003c
            if (r6 != r7) goto L_0x0034
            java.lang.Object r1 = r4.f61915d
            mobi.lab.veriff.util.g r1 = (mobi.lab.veriff.util.C24454g) r1
            p584jl.C17885a.m44475z0(r3)
            goto L_0x0141
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            p584jl.C17885a.m44475z0(r3)
            r3 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            com.veriff.sdk.internal.gf$g r6 = com.veriff.sdk.internal.C21667gf.C21714g.f54918b
            java.util.List<mobi.lab.veriff.util.g> r8 = f61899h
            java.util.Iterator r8 = r8.iterator()
        L_0x004a:
            boolean r9 = r8.hasNext()
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            r11 = 0
            java.lang.String r12 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r13 = "Locale.US"
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r8.next()
            r14 = r9
            mobi.lab.veriff.util.g r14 = (mobi.lab.veriff.util.C24454g) r14
            java.lang.String r14 = r14.mo60678c()
            java.util.Locale r15 = java.util.Locale.US
            mf0.C24362h.m61210e(r15, r13)
            if (r14 == 0) goto L_0x008e
            java.lang.String r14 = r14.toLowerCase(r15)
            mf0.C24362h.m61210e(r14, r12)
            if (r2 == 0) goto L_0x007d
            mf0.C24362h.m61210e(r15, r13)
            java.lang.String r15 = r2.toLowerCase(r15)
            mf0.C24362h.m61210e(r15, r12)
            goto L_0x007f
        L_0x007d:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
        L_0x007f:
            boolean r14 = mf0.C24362h.m61206a(r14, r15)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x004a
            goto L_0x0095
        L_0x008e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x0094:
            r9 = r11
        L_0x0095:
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r9)
            r6 = 0
            r3[r6] = r2
            com.veriff.sdk.internal.gf$g r2 = com.veriff.sdk.internal.C21667gf.C21714g.integration
            java.util.List<mobi.lab.veriff.util.g> r8 = f61899h
            java.util.Iterator r8 = r8.iterator()
        L_0x00a5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e9
            java.lang.Object r9 = r8.next()
            r14 = r9
            mobi.lab.veriff.util.g r14 = (mobi.lab.veriff.util.C24454g) r14
            java.lang.String r14 = r14.mo60678c()
            java.util.Locale r15 = java.util.Locale.US
            mf0.C24362h.m61210e(r15, r13)
            if (r14 == 0) goto L_0x00e3
            java.lang.String r14 = r14.toLowerCase(r15)
            mf0.C24362h.m61210e(r14, r12)
            if (r1 == 0) goto L_0x00d1
            mf0.C24362h.m61210e(r15, r13)
            java.lang.String r15 = r1.toLowerCase(r15)
            mf0.C24362h.m61210e(r15, r12)
            goto L_0x00d3
        L_0x00d1:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
        L_0x00d3:
            boolean r14 = mf0.C24362h.m61206a(r14, r15)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00a5
            r11 = r9
            goto L_0x00e9
        L_0x00e3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r10)
            throw r1
        L_0x00e9:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r2, r11)
            r3[r7] = r1
            r1 = 2
            com.veriff.sdk.internal.gf$g r2 = com.veriff.sdk.internal.C21667gf.C21714g.f54919c
            mobi.lab.veriff.util.h$b r8 = f61897a
            mobi.lab.veriff.util.g r8 = r8.mo60703c()
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r2, r8)
            r3[r1] = r9
            r1 = 3
            com.veriff.sdk.internal.gf$g r2 = com.veriff.sdk.internal.C21667gf.C21714g.DEFAULT
            mobi.lab.veriff.util.g r8 = f61900i
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r2, r8)
            r3[r1] = r9
            java.util.List r1 = p583jk.C17875h.m44281E(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0114:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0142
            java.lang.Object r2 = r1.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.mo59066a()
            com.veriff.sdk.internal.gf$g r3 = (com.veriff.sdk.internal.C21667gf.C21714g) r3
            java.lang.Object r2 = r2.mo59067b()
            mobi.lab.veriff.util.g r2 = (mobi.lab.veriff.util.C24454g) r2
            if (r2 == 0) goto L_0x0114
            com.veriff.sdk.internal.gf$g r1 = com.veriff.sdk.internal.C21667gf.C21714g.f54918b
            if (r3 != r1) goto L_0x0134
            if (r19 != 0) goto L_0x0135
        L_0x0134:
            r6 = 1
        L_0x0135:
            r4.f61915d = r2
            r4.f61913b = r7
            java.lang.Object r1 = r0.mo60693a((mobi.lab.veriff.util.C24454g) r2, (com.veriff.sdk.internal.C21667gf.C21714g) r3, (boolean) r6, (ff0.C23349c<? super bf0.C21050d>) r4)
            if (r1 != r5) goto L_0x0140
            return r5
        L_0x0140:
            r1 = r2
        L_0x0141:
            return r1
        L_0x0142:
            mobi.lab.veriff.util.g r1 = f61900i
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.util.C24457h.mo60692a(java.lang.String, java.lang.String, boolean, ff0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.veriff.sdk.internal.gf$g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60693a(mobi.lab.veriff.util.C24454g r5, com.veriff.sdk.internal.C21667gf.C21714g r6, boolean r7, ff0.C23349c<? super bf0.C21050d> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof mobi.lab.veriff.util.C24457h.C24460c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            mobi.lab.veriff.util.h$c r0 = (mobi.lab.veriff.util.C24457h.C24460c) r0
            int r1 = r0.f61906b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61906b = r1
            goto L_0x0018
        L_0x0013:
            mobi.lab.veriff.util.h$c r0 = new mobi.lab.veriff.util.h$c
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f61905a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f61906b
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r7 = r0.f61911g
            java.lang.Object r5 = r0.f61910f
            r6 = r5
            com.veriff.sdk.internal.gf$g r6 = (com.veriff.sdk.internal.C21667gf.C21714g) r6
            java.lang.Object r5 = r0.f61909e
            mobi.lab.veriff.util.g r5 = (mobi.lab.veriff.util.C24454g) r5
            java.lang.Object r0 = r0.f61908d
            mobi.lab.veriff.util.h r0 = (mobi.lab.veriff.util.C24457h) r0
            p584jl.C17885a.m44475z0(r8)
            goto L_0x0053
        L_0x0036:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003e:
            p584jl.C17885a.m44475z0(r8)
            r0.f61908d = r4
            r0.f61909e = r5
            r0.f61910f = r6
            r0.f61911g = r7
            r0.f61906b = r3
            java.lang.Object r8 = r4.mo60695b(r5, r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r4
        L_0x0053:
            mobi.lab.veriff.util.j r8 = f61898f
            java.lang.String r1 = "Language changed from "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            mobi.lab.veriff.util.g r2 = r0.f61902c
            java.lang.String r2 = r2.mo60677b()
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r8.mo60705d(r1)
            r0.f61902c = r5
            if (r7 == 0) goto L_0x0089
            com.veriff.sdk.internal.fu r7 = r0.f61904e
            java.lang.String r5 = r5.mo60678c()
            com.veriff.sdk.internal.gf r5 = com.veriff.sdk.internal.C21716gg.m52902a((java.lang.String) r5, (com.veriff.sdk.internal.C21667gf.C21714g) r6)
            java.lang.String r6 = "EventFactory.languageAss…ageCode, preselectedType)"
            mf0.C24362h.m61210e(r5, r6)
            r7.mo54921a((com.veriff.sdk.internal.C21667gf) r5)
        L_0x0089:
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.util.C24457h.mo60693a(mobi.lab.veriff.util.g, com.veriff.sdk.internal.gf$g, boolean, ff0.c):java.lang.Object");
    }
}
