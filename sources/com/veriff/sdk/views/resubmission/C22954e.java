package com.veriff.sdk.views.resubmission;

import com.veriff.sdk.internal.C21616ex;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import p583jk.C17875h;
import sf0.C24864i;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionReasonCode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "toReason", "Lcom/veriff/sdk/views/resubmission/ResubmissionReason;", "documentType", "", "VIDEO_OR_PHOTOS_MISSING", "FACE_NOT_VISIBLE", "DOCUMENT_NOT_VISIBLE", "POOR_IMAGE_QUALITY", "DOCUMENT_DAMAGED", "DOCUMENT_NOT_SUPPORTED", "DOCUMENT_EXPIRED", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.e */
public enum C22954e {
    VIDEO_OR_PHOTOS_MISSING(201),
    FACE_NOT_VISIBLE(202),
    DOCUMENT_NOT_VISIBLE(203),
    POOR_IMAGE_QUALITY(204),
    DOCUMENT_DAMAGED(205),
    DOCUMENT_NOT_SUPPORTED(206),
    DOCUMENT_EXPIRED(207);
    

    /* renamed from: h */
    public static final C22955a f58279h = null;

    /* renamed from: k */
    private static final C22953d f58281k = null;

    /* renamed from: l */
    private static final C22953d f58282l = null;

    /* renamed from: m */
    private static final C22953d f58283m = null;

    /* renamed from: j */
    private final int f58284j;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionReasonCode$Companion;", "", "()V", "documentNotSupported", "Lcom/veriff/sdk/views/resubmission/ResubmissionReason;", "faceNotVisible", "poorImageQuality", "documentDamaged", "documentType", "", "documentExpired", "documentNotVisible", "fromInt", "Lcom/veriff/sdk/views/resubmission/ResubmissionReasonCode;", "code", "", "(Ljava/lang/Integer;)Lcom/veriff/sdk/views/resubmission/ResubmissionReasonCode;", "videoOrPhotosMissing", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$a */
    public static final class C22955a {

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$a */
        public static final class C22956a extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22956a f58285a = null;

            static {
                f58285a = new C22956a();
            }

            public C22956a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54793cc();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$b */
        public static final class C22957b extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22957b f58286a = null;

            static {
                f58286a = new C22957b();
            }

            public C22957b() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54794cd();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$c */
        public static final class C22958c extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22958c f58287a = null;

            static {
                f58287a = new C22958c();
            }

            public C22958c() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54795ce();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$d */
        public static final class C22959d extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22959d f58288a = null;

            static {
                f58288a = new C22959d();
            }

            public C22959d() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54732bV();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$e */
        public static final class C22960e extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22960e f58289a = null;

            static {
                f58289a = new C22960e();
            }

            public C22960e() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54733bW();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$f */
        public static final class C22961f extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22961f f58290a = null;

            static {
                f58290a = new C22961f();
            }

            public C22961f() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54734bX();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$g */
        public static final class C22962g extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22962g f58291a = null;

            static {
                f58291a = new C22962g();
            }

            public C22962g() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54800cj();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$h */
        public static final class C22963h extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22963h f58292a = null;

            static {
                f58292a = new C22963h();
            }

            public C22963h() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54802cl();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$i */
        public static final class C22964i extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22964i f58293a = null;

            static {
                f58293a = new C22964i();
            }

            public C22964i() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54801ck();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$j */
        public static final class C22965j extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22965j f58294a = null;

            static {
                f58294a = new C22965j();
            }

            public C22965j() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54803cm();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$k */
        public static final class C22966k extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22966k f58295a = null;

            static {
                f58295a = new C22966k();
            }

            public C22966k() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54813cw();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$l */
        public static final class C22967l extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22967l f58296a = null;

            static {
                f58296a = new C22967l();
            }

            public C22967l() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54814cx();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$m */
        public static final class C22968m extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22968m f58297a = null;

            static {
                f58297a = new C22968m();
            }

            public C22968m() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54815cy();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$n */
        public static final class C22969n extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22969n f58298a = null;

            static {
                f58298a = new C22969n();
            }

            public C22969n() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54816cz();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$o */
        public static final class C22970o extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22970o f58299a = null;

            static {
                f58299a = new C22970o();
            }

            public C22970o() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54811cu();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$p */
        public static final class C22971p extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22971p f58300a = null;

            static {
                f58300a = new C22971p();
            }

            public C22971p() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54812cv();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$q */
        public static final class C22972q extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22972q f58301a = null;

            static {
                f58301a = new C22972q();
            }

            public C22972q() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54765cA();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$r */
        public static final class C22973r extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22973r f58302a = null;

            static {
                f58302a = new C22973r();
            }

            public C22973r() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54766cB();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$s */
        public static final class C22974s extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22974s f58303a = null;

            static {
                f58303a = new C22974s();
            }

            public C22974s() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54767cC();
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.views.resubmission.e$a$t */
        public static final class C22975t extends Lambda implements C24236l<C21616ex, CharSequence> {

            /* renamed from: a */
            public static final C22975t f58304a = null;

            static {
                f58304a = new C22975t();
            }

            public C22975t() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C21616ex exVar) {
                C24362h.m61211f(exVar, "$receiver");
                return exVar.mo54768cD();
            }
        }

        private C22955a() {
        }

        public /* synthetic */ C22955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C22953d m56756b(String str) {
            C24864i iVar;
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1895130188:
                    if (str.equals("ID_CARD")) {
                        iVar = C22999n.f58328a;
                        break;
                    } else {
                        return null;
                    }
                case 84104461:
                    if (str.equals("DRIVERS_LICENSE")) {
                        iVar = C23000o.f58329a;
                        break;
                    } else {
                        return null;
                    }
                case 1305942932:
                    if (str.equals("RESIDENCE_PERMIT")) {
                        iVar = C23002q.f58331a;
                        break;
                    } else {
                        return null;
                    }
                case 1999404050:
                    if (str.equals("PASSPORT")) {
                        iVar = C23001p.f58330a;
                        break;
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
            C22962g gVar = C22962g.f58291a;
            int i = R$drawable.vrff_id_covered;
            int i2 = R$drawable.vrff_ic_submission_not_ok;
            return new C22953d(iVar, gVar, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, C17875h.m44281E(new C23004s(i, i2, C22963h.f58292a), new C23004s(R$drawable.vrff_id_cropped, i2, C22964i.f58293a), new C23004s(R$drawable.vrff_id_valid, R$drawable.vrff_ic_submission_ok, C22965j.f58294a)), 3, (DefaultConstructorMarker) null)));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C22953d m56758c(String str) {
            C24864i iVar;
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1895130188:
                    if (str.equals("ID_CARD")) {
                        iVar = C22991f.f58320a;
                        break;
                    } else {
                        return null;
                    }
                case 84104461:
                    if (str.equals("DRIVERS_LICENSE")) {
                        iVar = C22992g.f58321a;
                        break;
                    } else {
                        return null;
                    }
                case 1305942932:
                    if (str.equals("RESIDENCE_PERMIT")) {
                        iVar = C22994i.f58323a;
                        break;
                    } else {
                        return null;
                    }
                case 1999404050:
                    if (str.equals("PASSPORT")) {
                        iVar = C22993h.f58322a;
                        break;
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
            return new C22953d(iVar, C22956a.f58285a, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, C17875h.m44281E(new C23004s(R$drawable.vrff_id_damaged, R$drawable.vrff_ic_submission_not_ok, C22957b.f58286a), new C23004s(R$drawable.vrff_id_valid, R$drawable.vrff_ic_submission_ok, C22958c.f58287a)), 3, (DefaultConstructorMarker) null)));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final C22953d m56760d(String str) {
            C24864i iVar;
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1895130188:
                    if (str.equals("ID_CARD")) {
                        iVar = C22995j.f58324a;
                        break;
                    } else {
                        return null;
                    }
                case 84104461:
                    if (str.equals("DRIVERS_LICENSE")) {
                        iVar = C22996k.f58325a;
                        break;
                    } else {
                        return null;
                    }
                case 1305942932:
                    if (str.equals("RESIDENCE_PERMIT")) {
                        iVar = C22998m.f58327a;
                        break;
                    } else {
                        return null;
                    }
                case 1999404050:
                    if (str.equals("PASSPORT")) {
                        iVar = C22997l.f58326a;
                        break;
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
            return new C22953d(iVar, C22959d.f58288a, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, C17875h.m44281E(new C23004s(R$drawable.vrff_id_expired, R$drawable.vrff_ic_submission_not_ok, C22960e.f58289a), new C23004s(R$drawable.vrff_id_valid, R$drawable.vrff_ic_submission_ok, C22961f.f58290a)), 3, (DefaultConstructorMarker) null)));
        }

        /* renamed from: a */
        public final C22954e mo57879a(Integer num) {
            for (C22954e eVar : C22954e.values()) {
                if (num != null && eVar.mo57877a() == num.intValue()) {
                    return eVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C22953d m56754a(String str) {
            C23006t tVar;
            C23006t[] tVarArr = new C23006t[3];
            if (C24362h.m61206a(str, "PASSPORT")) {
                tVar = new C23006t(C22968m.f58297a, C22969n.f58298a, C23009u.f58345d);
            } else {
                tVar = new C23006t(C22970o.f58299a, C22971p.f58300a, C23009u.f58342a);
            }
            tVarArr[0] = tVar;
            tVarArr[1] = new C23006t(C22972q.f58301a, C22973r.f58302a, C23009u.f58343b);
            tVarArr[2] = new C23006t(C22974s.f58303a, C22975t.f58304a, C23009u.f58344c);
            return new C22953d(C22966k.f58295a, C22967l.f58296a, C17875h.m44281E(tVarArr));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$b */
    public static final class C22976b extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22976b f58305a = null;

        static {
            f58305a = new C22976b();
        }

        public C22976b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54809cs();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$c */
    public static final class C22977c extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22977c f58306a = null;

        static {
            f58306a = new C22977c();
        }

        public C22977c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54810ct();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$d */
    public static final class C22978d extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22978d f58307a = null;

        static {
            f58307a = new C22978d();
        }

        public C22978d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54804cn();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$e */
    public static final class C22979e extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22979e f58308a = null;

        static {
            f58308a = new C22979e();
        }

        public C22979e() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54805co();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$f */
    public static final class C22980f extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22980f f58309a = null;

        static {
            f58309a = new C22980f();
        }

        public C22980f() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54806cp();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$g */
    public static final class C22981g extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22981g f58310a = null;

        static {
            f58310a = new C22981g();
        }

        public C22981g() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54807cq();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$h */
    public static final class C22982h extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22982h f58311a = null;

        static {
            f58311a = new C22982h();
        }

        public C22982h() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54808cr();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$i */
    public static final class C22983i extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22983i f58312a = null;

        static {
            f58312a = new C22983i();
        }

        public C22983i() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54769cE();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$j */
    public static final class C22984j extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22984j f58313a = null;

        static {
            f58313a = new C22984j();
        }

        public C22984j() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54770cF();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$k */
    public static final class C22985k extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22985k f58314a = null;

        static {
            f58314a = new C22985k();
        }

        public C22985k() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54771cG();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$l */
    public static final class C22986l extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22986l f58315a = null;

        static {
            f58315a = new C22986l();
        }

        public C22986l() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54772cH();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$m */
    public static final class C22987m extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22987m f58316a = null;

        static {
            f58316a = new C22987m();
        }

        public C22987m() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54773cI();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$n */
    public static final class C22988n extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22988n f58317a = null;

        static {
            f58317a = new C22988n();
        }

        public C22988n() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54774cJ();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$o */
    public static final class C22989o extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22989o f58318a = null;

        static {
            f58318a = new C22989o();
        }

        public C22989o() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54771cG();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/Strings;", "", "invoke", "(Lcom/veriff/sdk/Strings;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.resubmission.e$p */
    public static final class C22990p extends Lambda implements C24236l<C21616ex, CharSequence> {

        /* renamed from: a */
        public static final C22990p f58319a = null;

        static {
            f58319a = new C22990p();
        }

        public C22990p() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C21616ex exVar) {
            C24362h.m61211f(exVar, "$receiver");
            return exVar.mo54775cK();
        }
    }

    /* access modifiers changed from: public */
    static {
        f58279h = new C22955a((DefaultConstructorMarker) null);
        C22978d dVar = C22978d.f58307a;
        C22979e eVar = C22979e.f58308a;
        int i = R$drawable.vrff_photo_dark;
        int i2 = R$drawable.vrff_ic_submission_not_ok;
        int i3 = R$drawable.vrff_photo_light;
        int i4 = R$drawable.vrff_photo_ok;
        int i5 = R$drawable.vrff_ic_submission_ok;
        int i6 = i3;
        int i7 = i2;
        f58281k = new C22953d(dVar, eVar, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, C17875h.m44281E(new C23004s(i, i2, C22980f.f58309a), new C23004s(i3, i2, C22981g.f58310a), new C23004s(i4, i5, C22982h.f58311a)), 3, (DefaultConstructorMarker) null)));
        f58282l = new C22953d(C22983i.f58312a, C22984j.f58313a, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, C17875h.m44281E(new C23004s(i, i7, C22985k.f58314a), new C23004s(i6, i7, C22986l.f58315a), new C23004s(i4, i5, C22987m.f58316a), new C23004s(R$drawable.vrff_passport_blurry, i7, C22988n.f58317a), new C23004s(R$drawable.vrff_passport_dark, i7, C22989o.f58318a), new C23004s(R$drawable.vrff_passport_ok, i5, C22990p.f58319a)), 3, (DefaultConstructorMarker) null)));
        f58283m = new C22953d(C22976b.f58305a, C22977c.f58306a, C17875h.m44280D(new C23006t((C24236l) null, (C24236l) null, EmptyList.f60173b, 3, (DefaultConstructorMarker) null)));
    }

    private C22954e(int i) {
        this.f58284j = i;
    }

    /* renamed from: a */
    public final int mo57877a() {
        return this.f58284j;
    }

    /* renamed from: a */
    public final C22953d mo57878a(String str) {
        switch (C23003r.f58332a[ordinal()]) {
            case 1:
                return f58279h.m56754a(str);
            case 2:
                return f58281k;
            case 3:
                return f58279h.m56756b(str);
            case 4:
                return f58282l;
            case 5:
                return f58279h.m56758c(str);
            case 6:
                return f58283m;
            case 7:
                return f58279h.m56760d(str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
