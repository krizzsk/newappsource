package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.MessageButton;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\b./012345B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\tB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fBC\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0014HÆ\u0003JU\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u00066"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event;", "", "name", "", "type", "feature", "additional", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Event$Additional;)V", "(Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Event$Additional;)V", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "app", "origin", "additional_data", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Event$Additional;Ljava/lang/String;J)V", "getAdditional_data", "()Lcom/veriff/sdk/internal/analytics/Event$Additional;", "getApp", "()Ljava/lang/String;", "getFeature", "getName", "getOrigin", "getTimestamp", "()J", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Additional", "AutoCaptureDisabledReason", "ErrorReportSeverity", "Experiment", "ImplementationType", "NfcDisabledReason", "PreselectedType", "Reason", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gf */
public final class C21667gf {

    /* renamed from: a */
    private final String f54733a;

    /* renamed from: b */
    private final String f54734b;

    /* renamed from: c */
    private final String f54735c;

    /* renamed from: d */
    private final String f54736d;

    /* renamed from: e */
    private final C21668a f54737e;

    /* renamed from: f */
    private final String f54738f;

    /* renamed from: g */
    private final long f54739g;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;", "", "(Ljava/lang/String;I)V", "probe_incomplete", "flag_disabled", "app_unsupported", "probe_failed", "model_unavailable", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$b */
    public enum C21709b {
        probe_incomplete,
        flag_disabled,
        app_unsupported,
        probe_failed,
        model_unavailable
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;", "", "(Ljava/lang/String;I)V", "crash", "error", "notice", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$c */
    public enum C21710c {
        f54902a,
        error,
        notice
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "", "feature_flag_key", "", "feature_flag_variation", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFeature_flag_key", "()Ljava/lang/String;", "getFeature_flag_variation", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$d */
    public static final class C21711d {

        /* renamed from: a */
        private final String f54906a;

        /* renamed from: b */
        private final Object f54907b;

        public C21711d(String str, Object obj) {
            this.f54906a = str;
            this.f54907b = obj;
        }

        /* renamed from: a */
        public final String mo55294a() {
            return this.f54906a;
        }

        /* renamed from: b */
        public final Object mo55295b() {
            return this.f54907b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21711d)) {
                return false;
            }
            C21711d dVar = (C21711d) obj;
            return C24362h.m61206a(this.f54906a, dVar.f54906a) && C24362h.m61206a(this.f54907b, dVar.f54907b);
        }

        public int hashCode() {
            String str = this.f54906a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f54907b;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Experiment(feature_flag_key=");
            k.append(this.f54906a);
            k.append(", feature_flag_variation=");
            return C16530d.m42015h(k, this.f54907b, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "", "(Ljava/lang/String;I)V", "reactnative", "sdk", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$e */
    public enum C21712e {
        reactnative,
        f54909b
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;", "", "(Ljava/lang/String;I)V", "flag_disabled", "country_unsupported", "document_unsupported", "device_unsupported", "app_unsupported", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$f */
    public enum C21713f {
        flag_disabled,
        country_unsupported,
        document_unsupported,
        device_unsupported,
        app_unsupported
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "", "(Ljava/lang/String;I)V", "integration", "sdk", "browser", "user", "DEFAULT", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$g */
    public enum C21714g {
        integration,
        f54918b,
        f54919c,
        user,
        DEFAULT
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Reason;", "", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "TIMEOUT", "ERROR", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$h */
    public enum C21715h {
        f54923a("timeout"),
        ERROR("error");
        

        /* renamed from: d */
        private final String f54926d;

        private C21715h(String str) {
            this.f54926d = str;
        }

        /* renamed from: a */
        public final String mo55299a() {
            return this.f54926d;
        }
    }

    public C21667gf(String str, String str2, String str3) {
        this(str, str2, str3, (C21668a) null, 8, (DefaultConstructorMarker) null);
    }

    public C21667gf(String str, String str2, String str3, String str4, C21668a aVar, String str5, long j) {
        C13437d.m33711q(str, "app", str2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str3, "name");
        this.f54733a = str;
        this.f54734b = str2;
        this.f54735c = str3;
        this.f54736d = str4;
        this.f54737e = aVar;
        this.f54738f = str5;
        this.f54739g = j;
    }

    /* renamed from: a */
    public final String mo54968a() {
        return this.f54733a;
    }

    /* renamed from: b */
    public final String mo54969b() {
        return this.f54734b;
    }

    /* renamed from: c */
    public final String mo54970c() {
        return this.f54735c;
    }

    /* renamed from: d */
    public final String mo54971d() {
        return this.f54736d;
    }

    /* renamed from: e */
    public final C21668a mo54972e() {
        return this.f54737e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21667gf)) {
            return false;
        }
        C21667gf gfVar = (C21667gf) obj;
        return C24362h.m61206a(this.f54733a, gfVar.f54733a) && C24362h.m61206a(this.f54734b, gfVar.f54734b) && C24362h.m61206a(this.f54735c, gfVar.f54735c) && C24362h.m61206a(this.f54736d, gfVar.f54736d) && C24362h.m61206a(this.f54737e, gfVar.f54737e) && C24362h.m61206a(this.f54738f, gfVar.f54738f) && this.f54739g == gfVar.f54739g;
    }

    /* renamed from: f */
    public final String mo54974f() {
        return this.f54738f;
    }

    /* renamed from: g */
    public final long mo54975g() {
        return this.f54739g;
    }

    public int hashCode() {
        String str = this.f54733a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f54734b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54735c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f54736d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C21668a aVar = this.f54737e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str5 = this.f54738f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        long j = this.f54739g;
        return ((hashCode5 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Event(app=");
        k.append(this.f54733a);
        k.append(", origin=");
        k.append(this.f54734b);
        k.append(", name=");
        k.append(this.f54735c);
        k.append(", feature=");
        k.append(this.f54736d);
        k.append(", additional_data=");
        k.append(this.f54737e);
        k.append(", type=");
        k.append(this.f54738f);
        k.append(", timestamp=");
        return C25541a.m63884o(k, this.f54739g, ")");
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:(\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0001(456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[¨\u0006\\"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional;", "", "()V", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "getExperiments", "()Ljava/util/List;", "veriff_sdk_version", "", "getVeriff_sdk_version", "()Ljava/lang/String;", "AddressFileSelected", "AddressFileUploaded", "AddressScreenShown", "AddressTakePictureClicked", "AddressUploadFileClicked", "AutoCaptureTakingPicture", "BarcodeAccepted", "BarcodeScanStart", "BarcodeScanned", "ClientData", "ConsentApproved", "ConsentRejected", "ConsentScreenShown", "CountrySelection", "DecisionContinue", "DecisionReceived", "DeviceInfo", "DocumentSelection", "DocumentsSelection", "Empty", "ErrorReport", "ErrorScreen", "FailedList", "FeedbackDetails", "InflowReport", "LanguageAssigned", "Message", "MrzConfidence", "NfcEnabled", "NfcTimings", "QuitSession", "Reason", "ResubmissionReason", "Screen", "SelfieAutoCaptureEnabled", "TakePictureClicked", "Timeout", "VideoFileInfo", "VideoFrameInfo", "VideoPlaybackStarted", "Lcom/veriff/sdk/internal/analytics/Event$Additional$Empty;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$Message;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DeviceInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ErrorScreen;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$Reason;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ResubmissionReason;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$InflowReport;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$CountrySelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentSelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentsSelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ErrorReport;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$QuitSession;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DecisionContinue;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$DecisionReceived;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$LanguageAssigned;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$Screen;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$MrzConfidence;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$NfcTimings;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoFrameInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoFileInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$FeedbackDetails;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$Timeout;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$FailedList;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ClientData;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeScanStart;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeScanned;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeAccepted;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$NfcEnabled;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$SelfieAutoCaptureEnabled;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoPlaybackStarted;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AutoCaptureTakingPicture;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$TakePictureClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentScreenShown;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentApproved;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentRejected;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressScreenShown;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressTakePictureClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressUploadFileClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressFileSelected;", "Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressFileUploaded;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gf$a */
    public static abstract class C21668a {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$Message;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "message", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$aa */
        public static final class C21670aa extends C21668a {

            /* renamed from: a */
            private final String f54744a;

            /* renamed from: b */
            private final List<C21711d> f54745b;

            /* renamed from: c */
            private final String f54746c;

            public C21670aa(String str, List<C21711d> list) {
                this(str, list, (String) null, 4, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21670aa(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21670aa m52624a(C21670aa aaVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aaVar.f54744a;
                }
                if ((i & 2) != 0) {
                    list = aaVar.mo54988b();
                }
                if ((i & 4) != 0) {
                    str2 = aaVar.mo54989c();
                }
                return aaVar.mo54986a(str, list, str2);
            }

            /* renamed from: a */
            public final C21670aa mo54986a(String str, List<C21711d> list, String str2) {
                C24362h.m61211f(str, InAppMessageBase.MESSAGE);
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21670aa(str, list, str2);
            }

            /* renamed from: a */
            public final String mo54987a() {
                return this.f54744a;
            }

            /* renamed from: b */
            public List<C21711d> mo54988b() {
                return this.f54745b;
            }

            /* renamed from: c */
            public String mo54989c() {
                return this.f54746c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21670aa)) {
                    return false;
                }
                C21670aa aaVar = (C21670aa) obj;
                return C24362h.m61206a(this.f54744a, aaVar.f54744a) && C24362h.m61206a(mo54988b(), aaVar.mo54988b()) && C24362h.m61206a(mo54989c(), aaVar.mo54989c());
            }

            public int hashCode() {
                String str = this.f54744a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                List<C21711d> b = mo54988b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo54989c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Message(message=");
                k.append(this.f54744a);
                k.append(", experiments=");
                k.append(mo54988b());
                k.append(", veriff_sdk_version=");
                k.append(mo54989c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21670aa(String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, InAppMessageBase.MESSAGE);
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54744a = str;
                this.f54745b = list;
                this.f54746c = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JN\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$MrzConfidence;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "document_nr_confidence", "", "date_of_birth_confidence", "date_of_expiry_confidence", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getDate_of_birth_confidence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDate_of_expiry_confidence", "getDocument_nr_confidence", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$MrzConfidence;", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ab */
        public static final class C21671ab extends C21668a {

            /* renamed from: a */
            private final Double f54747a;

            /* renamed from: b */
            private final Double f54748b;

            /* renamed from: c */
            private final Double f54749c;

            /* renamed from: d */
            private final List<C21711d> f54750d;

            /* renamed from: e */
            private final String f54751e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21671ab(Double d, Double d2, Double d3, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(d, d2, d3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21671ab m52629a(C21671ab abVar, Double d, Double d2, Double d3, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = abVar.f54747a;
                }
                if ((i & 2) != 0) {
                    d2 = abVar.f54748b;
                }
                Double d4 = d2;
                if ((i & 4) != 0) {
                    d3 = abVar.f54749c;
                }
                Double d5 = d3;
                if ((i & 8) != 0) {
                    list = abVar.mo54997d();
                }
                List<C21711d> list2 = list;
                if ((i & 16) != 0) {
                    str = abVar.mo54998e();
                }
                return abVar.mo54993a(d, d4, d5, list2, str);
            }

            /* renamed from: a */
            public final C21671ab mo54993a(Double d, Double d2, Double d3, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21671ab(d, d2, d3, list, str);
            }

            /* renamed from: a */
            public final Double mo54994a() {
                return this.f54747a;
            }

            /* renamed from: b */
            public final Double mo54995b() {
                return this.f54748b;
            }

            /* renamed from: c */
            public final Double mo54996c() {
                return this.f54749c;
            }

            /* renamed from: d */
            public List<C21711d> mo54997d() {
                return this.f54750d;
            }

            /* renamed from: e */
            public String mo54998e() {
                return this.f54751e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21671ab)) {
                    return false;
                }
                C21671ab abVar = (C21671ab) obj;
                return C24362h.m61206a(this.f54747a, abVar.f54747a) && C24362h.m61206a(this.f54748b, abVar.f54748b) && C24362h.m61206a(this.f54749c, abVar.f54749c) && C24362h.m61206a(mo54997d(), abVar.mo54997d()) && C24362h.m61206a(mo54998e(), abVar.mo54998e());
            }

            public int hashCode() {
                Double d = this.f54747a;
                int i = 0;
                int hashCode = (d != null ? d.hashCode() : 0) * 31;
                Double d2 = this.f54748b;
                int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
                Double d3 = this.f54749c;
                int hashCode3 = (hashCode2 + (d3 != null ? d3.hashCode() : 0)) * 31;
                List<C21711d> d4 = mo54997d();
                int hashCode4 = (hashCode3 + (d4 != null ? d4.hashCode() : 0)) * 31;
                String e = mo54998e();
                if (e != null) {
                    i = e.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("MrzConfidence(document_nr_confidence=");
                k.append(this.f54747a);
                k.append(", date_of_birth_confidence=");
                k.append(this.f54748b);
                k.append(", date_of_expiry_confidence=");
                k.append(this.f54749c);
                k.append(", experiments=");
                k.append(mo54997d());
                k.append(", veriff_sdk_version=");
                k.append(mo54998e());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21671ab(Double d, Double d2, Double d3, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54747a = d;
                this.f54748b = d2;
                this.f54749c = d3;
                this.f54750d = list;
                this.f54751e = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$NfcEnabled;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "enabled", "", "reason", "Lcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(ZLcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;Ljava/util/List;Ljava/lang/String;)V", "getEnabled", "()Z", "getExperiments", "()Ljava/util/List;", "getReason", "()Lcom/veriff/sdk/internal/analytics/Event$NfcDisabledReason;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ac */
        public static final class C21672ac extends C21668a {

            /* renamed from: a */
            private final boolean f54752a;

            /* renamed from: b */
            private final C21713f f54753b;

            /* renamed from: c */
            private final List<C21711d> f54754c;

            /* renamed from: d */
            private final String f54755d;

            public C21672ac(boolean z, C21713f fVar, List<C21711d> list) {
                this(z, fVar, list, (String) null, 8, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21672ac(boolean z, C21713f fVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, fVar, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21672ac m52636a(C21672ac acVar, boolean z, C21713f fVar, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = acVar.f54752a;
                }
                if ((i & 2) != 0) {
                    fVar = acVar.f54753b;
                }
                if ((i & 4) != 0) {
                    list = acVar.mo55005c();
                }
                if ((i & 8) != 0) {
                    str = acVar.mo55006d();
                }
                return acVar.mo55002a(z, fVar, list, str);
            }

            /* renamed from: a */
            public final C21672ac mo55002a(boolean z, C21713f fVar, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21672ac(z, fVar, list, str);
            }

            /* renamed from: a */
            public final boolean mo55003a() {
                return this.f54752a;
            }

            /* renamed from: b */
            public final C21713f mo55004b() {
                return this.f54753b;
            }

            /* renamed from: c */
            public List<C21711d> mo55005c() {
                return this.f54754c;
            }

            /* renamed from: d */
            public String mo55006d() {
                return this.f54755d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21672ac)) {
                    return false;
                }
                C21672ac acVar = (C21672ac) obj;
                return this.f54752a == acVar.f54752a && C24362h.m61206a(this.f54753b, acVar.f54753b) && C24362h.m61206a(mo55005c(), acVar.mo55005c()) && C24362h.m61206a(mo55006d(), acVar.mo55006d());
            }

            public int hashCode() {
                boolean z = this.f54752a;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                C21713f fVar = this.f54753b;
                int i2 = 0;
                int hashCode = (i + (fVar != null ? fVar.hashCode() : 0)) * 31;
                List<C21711d> c = mo55005c();
                int hashCode2 = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55006d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode2 + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("NfcEnabled(enabled=");
                k.append(this.f54752a);
                k.append(", reason=");
                k.append(this.f54753b);
                k.append(", experiments=");
                k.append(mo55005c());
                k.append(", veriff_sdk_version=");
                k.append(mo55006d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21672ac(boolean z, C21713f fVar, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54752a = z;
                this.f54753b = fVar;
                this.f54754c = list;
                this.f54755d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$NfcTimings;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "time_elapsed", "", "time_since_step_start", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(DDLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getTime_elapsed", "()D", "getTime_since_step_start", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ad */
        public static final class C21673ad extends C21668a {

            /* renamed from: a */
            private final double f54756a;

            /* renamed from: b */
            private final double f54757b;

            /* renamed from: c */
            private final List<C21711d> f54758c;

            /* renamed from: d */
            private final String f54759d;

            public C21673ad(double d, double d2) {
                this(d, d2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21673ad(double d, double d2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(d, d2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21673ad m52642a(C21673ad adVar, double d, double d2, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = adVar.f54756a;
                }
                double d3 = d;
                if ((i & 2) != 0) {
                    d2 = adVar.f54757b;
                }
                double d4 = d2;
                if ((i & 4) != 0) {
                    list = adVar.mo55013c();
                }
                List<C21711d> list2 = list;
                if ((i & 8) != 0) {
                    str = adVar.mo55014d();
                }
                return adVar.mo55011a(d3, d4, list2, str);
            }

            /* renamed from: a */
            public final double mo55010a() {
                return this.f54756a;
            }

            /* renamed from: a */
            public final C21673ad mo55011a(double d, double d2, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21673ad(d, d2, list, str);
            }

            /* renamed from: b */
            public final double mo55012b() {
                return this.f54757b;
            }

            /* renamed from: c */
            public List<C21711d> mo55013c() {
                return this.f54758c;
            }

            /* renamed from: d */
            public String mo55014d() {
                return this.f54759d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21673ad)) {
                    return false;
                }
                C21673ad adVar = (C21673ad) obj;
                return Double.compare(this.f54756a, adVar.f54756a) == 0 && Double.compare(this.f54757b, adVar.f54757b) == 0 && C24362h.m61206a(mo55013c(), adVar.mo55013c()) && C24362h.m61206a(mo55014d(), adVar.mo55014d());
            }

            public int hashCode() {
                long doubleToLongBits = Double.doubleToLongBits(this.f54756a);
                long doubleToLongBits2 = Double.doubleToLongBits(this.f54757b);
                int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
                List<C21711d> c = mo55013c();
                int i2 = 0;
                int hashCode = (i + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55014d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("NfcTimings(time_elapsed=");
                k.append(this.f54756a);
                k.append(", time_since_step_start=");
                k.append(this.f54757b);
                k.append(", experiments=");
                k.append(mo55013c());
                k.append(", veriff_sdk_version=");
                k.append(mo55014d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21673ad(double d, double d2, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54756a = d;
                this.f54757b = d2;
                this.f54758c = list;
                this.f54759d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$QuitSession;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "screen", "Lcom/veriff/sdk/internal/analytics/Page;", "source", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Lcom/veriff/sdk/internal/analytics/Page;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getScreen", "()Lcom/veriff/sdk/internal/analytics/Page;", "getSource", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ae */
        public static final class C21674ae extends C21668a {

            /* renamed from: a */
            private final C21783is f54760a;

            /* renamed from: b */
            private final String f54761b;

            /* renamed from: c */
            private final List<C21711d> f54762c;

            /* renamed from: d */
            private final String f54763d;

            public C21674ae(C21783is isVar, String str) {
                this(isVar, str, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21674ae(C21783is isVar, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(isVar, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21674ae m52648a(C21674ae aeVar, C21783is isVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    isVar = aeVar.f54760a;
                }
                if ((i & 2) != 0) {
                    str = aeVar.f54761b;
                }
                if ((i & 4) != 0) {
                    list = aeVar.mo55021c();
                }
                if ((i & 8) != 0) {
                    str2 = aeVar.mo55022d();
                }
                return aeVar.mo55018a(isVar, str, list, str2);
            }

            /* renamed from: a */
            public final C21674ae mo55018a(C21783is isVar, String str, List<C21711d> list, String str2) {
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "source");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21674ae(isVar, str, list, str2);
            }

            /* renamed from: a */
            public final C21783is mo55019a() {
                return this.f54760a;
            }

            /* renamed from: b */
            public final String mo55020b() {
                return this.f54761b;
            }

            /* renamed from: c */
            public List<C21711d> mo55021c() {
                return this.f54762c;
            }

            /* renamed from: d */
            public String mo55022d() {
                return this.f54763d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21674ae)) {
                    return false;
                }
                C21674ae aeVar = (C21674ae) obj;
                return C24362h.m61206a(this.f54760a, aeVar.f54760a) && C24362h.m61206a(this.f54761b, aeVar.f54761b) && C24362h.m61206a(mo55021c(), aeVar.mo55021c()) && C24362h.m61206a(mo55022d(), aeVar.mo55022d());
            }

            public int hashCode() {
                C21783is isVar = this.f54760a;
                int i = 0;
                int hashCode = (isVar != null ? isVar.hashCode() : 0) * 31;
                String str = this.f54761b;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                List<C21711d> c = mo55021c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55022d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("QuitSession(screen=");
                k.append(this.f54760a);
                k.append(", source=");
                k.append(this.f54761b);
                k.append(", experiments=");
                k.append(mo55021c());
                k.append(", veriff_sdk_version=");
                k.append(mo55022d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21674ae(C21783is isVar, String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "source");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54760a = isVar;
                this.f54761b = str;
                this.f54762c = list;
                this.f54763d = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$Reason;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "reason", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getReason", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$af */
        public static final class C21675af extends C21668a {

            /* renamed from: a */
            private final String f54764a;

            /* renamed from: b */
            private final List<C21711d> f54765b;

            /* renamed from: c */
            private final String f54766c;

            public C21675af(String str) {
                this(str, (List) null, (String) null, 6, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21675af(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21675af m52654a(C21675af afVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = afVar.f54764a;
                }
                if ((i & 2) != 0) {
                    list = afVar.mo55028b();
                }
                if ((i & 4) != 0) {
                    str2 = afVar.mo55029c();
                }
                return afVar.mo55026a(str, list, str2);
            }

            /* renamed from: a */
            public final C21675af mo55026a(String str, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "reason");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21675af(str, list, str2);
            }

            /* renamed from: a */
            public final String mo55027a() {
                return this.f54764a;
            }

            /* renamed from: b */
            public List<C21711d> mo55028b() {
                return this.f54765b;
            }

            /* renamed from: c */
            public String mo55029c() {
                return this.f54766c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21675af)) {
                    return false;
                }
                C21675af afVar = (C21675af) obj;
                return C24362h.m61206a(this.f54764a, afVar.f54764a) && C24362h.m61206a(mo55028b(), afVar.mo55028b()) && C24362h.m61206a(mo55029c(), afVar.mo55029c());
            }

            public int hashCode() {
                String str = this.f54764a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                List<C21711d> b = mo55028b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55029c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Reason(reason=");
                k.append(this.f54764a);
                k.append(", experiments=");
                k.append(mo55028b());
                k.append(", veriff_sdk_version=");
                k.append(mo55029c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21675af(String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "reason");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54764a = str;
                this.f54765b = list;
                this.f54766c = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ResubmissionReason;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "reason", "", "user_waited_for_feedback", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getReason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUser_waited_for_feedback", "()Z", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$ResubmissionReason;", "equals", "other", "", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ag */
        public static final class C21676ag extends C21668a {

            /* renamed from: a */
            private final Integer f54767a;

            /* renamed from: b */
            private final boolean f54768b;

            /* renamed from: c */
            private final List<C21711d> f54769c;

            /* renamed from: d */
            private final String f54770d;

            public C21676ag(Integer num, boolean z, List<C21711d> list) {
                this(num, z, list, (String) null, 8, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21676ag(Integer num, boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(num, z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21676ag m52659a(C21676ag agVar, Integer num, boolean z, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = agVar.f54767a;
                }
                if ((i & 2) != 0) {
                    z = agVar.f54768b;
                }
                if ((i & 4) != 0) {
                    list = agVar.mo55036c();
                }
                if ((i & 8) != 0) {
                    str = agVar.mo55037d();
                }
                return agVar.mo55033a(num, z, list, str);
            }

            /* renamed from: a */
            public final C21676ag mo55033a(Integer num, boolean z, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21676ag(num, z, list, str);
            }

            /* renamed from: a */
            public final Integer mo55034a() {
                return this.f54767a;
            }

            /* renamed from: b */
            public final boolean mo55035b() {
                return this.f54768b;
            }

            /* renamed from: c */
            public List<C21711d> mo55036c() {
                return this.f54769c;
            }

            /* renamed from: d */
            public String mo55037d() {
                return this.f54770d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21676ag)) {
                    return false;
                }
                C21676ag agVar = (C21676ag) obj;
                return C24362h.m61206a(this.f54767a, agVar.f54767a) && this.f54768b == agVar.f54768b && C24362h.m61206a(mo55036c(), agVar.mo55036c()) && C24362h.m61206a(mo55037d(), agVar.mo55037d());
            }

            public int hashCode() {
                Integer num = this.f54767a;
                int i = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                boolean z = this.f54768b;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode + (z ? 1 : 0)) * 31;
                List<C21711d> c = mo55036c();
                int hashCode2 = (i2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55037d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ResubmissionReason(reason=");
                k.append(this.f54767a);
                k.append(", user_waited_for_feedback=");
                k.append(this.f54768b);
                k.append(", experiments=");
                k.append(mo55036c());
                k.append(", veriff_sdk_version=");
                k.append(mo55037d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21676ag(Integer num, boolean z, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54767a = num;
                this.f54768b = z;
                this.f54769c = list;
                this.f54770d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$Screen;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "screen", "Lcom/veriff/sdk/internal/analytics/Page;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Lcom/veriff/sdk/internal/analytics/Page;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getScreen", "()Lcom/veriff/sdk/internal/analytics/Page;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ah */
        public static final class C21677ah extends C21668a {

            /* renamed from: a */
            private final C21783is f54771a;

            /* renamed from: b */
            private final List<C21711d> f54772b;

            /* renamed from: c */
            private final String f54773c;

            public C21677ah(C21783is isVar) {
                this(isVar, (List) null, (String) null, 6, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21677ah(C21783is isVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(isVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21677ah m52665a(C21677ah ahVar, C21783is isVar, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    isVar = ahVar.f54771a;
                }
                if ((i & 2) != 0) {
                    list = ahVar.mo55043b();
                }
                if ((i & 4) != 0) {
                    str = ahVar.mo55044c();
                }
                return ahVar.mo55041a(isVar, list, str);
            }

            /* renamed from: a */
            public final C21677ah mo55041a(C21783is isVar, List<C21711d> list, String str) {
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21677ah(isVar, list, str);
            }

            /* renamed from: a */
            public final C21783is mo55042a() {
                return this.f54771a;
            }

            /* renamed from: b */
            public List<C21711d> mo55043b() {
                return this.f54772b;
            }

            /* renamed from: c */
            public String mo55044c() {
                return this.f54773c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21677ah)) {
                    return false;
                }
                C21677ah ahVar = (C21677ah) obj;
                return C24362h.m61206a(this.f54771a, ahVar.f54771a) && C24362h.m61206a(mo55043b(), ahVar.mo55043b()) && C24362h.m61206a(mo55044c(), ahVar.mo55044c());
            }

            public int hashCode() {
                C21783is isVar = this.f54771a;
                int i = 0;
                int hashCode = (isVar != null ? isVar.hashCode() : 0) * 31;
                List<C21711d> b = mo55043b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55044c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Screen(screen=");
                k.append(this.f54771a);
                k.append(", experiments=");
                k.append(mo55043b());
                k.append(", veriff_sdk_version=");
                k.append(mo55044c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21677ah(C21783is isVar, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54771a = isVar;
                this.f54772b = list;
                this.f54773c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$SelfieAutoCaptureEnabled;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "enabled", "", "reason", "Lcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(ZLcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;Ljava/util/List;Ljava/lang/String;)V", "getEnabled", "()Z", "getExperiments", "()Ljava/util/List;", "getReason", "()Lcom/veriff/sdk/internal/analytics/Event$AutoCaptureDisabledReason;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ai */
        public static final class C21678ai extends C21668a {

            /* renamed from: a */
            private final boolean f54774a;

            /* renamed from: b */
            private final C21709b f54775b;

            /* renamed from: c */
            private final List<C21711d> f54776c;

            /* renamed from: d */
            private final String f54777d;

            public C21678ai(boolean z, C21709b bVar, List<C21711d> list) {
                this(z, bVar, list, (String) null, 8, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21678ai(boolean z, C21709b bVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, bVar, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21678ai m52670a(C21678ai aiVar, boolean z, C21709b bVar, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aiVar.f54774a;
                }
                if ((i & 2) != 0) {
                    bVar = aiVar.f54775b;
                }
                if ((i & 4) != 0) {
                    list = aiVar.mo55051c();
                }
                if ((i & 8) != 0) {
                    str = aiVar.mo55052d();
                }
                return aiVar.mo55048a(z, bVar, list, str);
            }

            /* renamed from: a */
            public final C21678ai mo55048a(boolean z, C21709b bVar, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21678ai(z, bVar, list, str);
            }

            /* renamed from: a */
            public final boolean mo55049a() {
                return this.f54774a;
            }

            /* renamed from: b */
            public final C21709b mo55050b() {
                return this.f54775b;
            }

            /* renamed from: c */
            public List<C21711d> mo55051c() {
                return this.f54776c;
            }

            /* renamed from: d */
            public String mo55052d() {
                return this.f54777d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21678ai)) {
                    return false;
                }
                C21678ai aiVar = (C21678ai) obj;
                return this.f54774a == aiVar.f54774a && C24362h.m61206a(this.f54775b, aiVar.f54775b) && C24362h.m61206a(mo55051c(), aiVar.mo55051c()) && C24362h.m61206a(mo55052d(), aiVar.mo55052d());
            }

            public int hashCode() {
                boolean z = this.f54774a;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                C21709b bVar = this.f54775b;
                int i2 = 0;
                int hashCode = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
                List<C21711d> c = mo55051c();
                int hashCode2 = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55052d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode2 + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("SelfieAutoCaptureEnabled(enabled=");
                k.append(this.f54774a);
                k.append(", reason=");
                k.append(this.f54775b);
                k.append(", experiments=");
                k.append(mo55051c());
                k.append(", veriff_sdk_version=");
                k.append(mo55052d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21678ai(boolean z, C21709b bVar, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54774a = z;
                this.f54775b = bVar;
                this.f54776c = list;
                this.f54777d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$TakePictureClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "delay", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(JLjava/util/List;Ljava/lang/String;)V", "getDelay", "()J", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$aj */
        public static final class C21679aj extends C21668a {

            /* renamed from: a */
            private final long f54778a;

            /* renamed from: b */
            private final List<C21711d> f54779b;

            /* renamed from: c */
            private final String f54780c;

            public C21679aj(long j, List<C21711d> list) {
                this(j, list, (String) null, 4, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21679aj(long j, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21679aj m52676a(C21679aj ajVar, long j, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = ajVar.f54778a;
                }
                if ((i & 2) != 0) {
                    list = ajVar.mo55058b();
                }
                if ((i & 4) != 0) {
                    str = ajVar.mo55059c();
                }
                return ajVar.mo55057a(j, list, str);
            }

            /* renamed from: a */
            public final long mo55056a() {
                return this.f54778a;
            }

            /* renamed from: a */
            public final C21679aj mo55057a(long j, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21679aj(j, list, str);
            }

            /* renamed from: b */
            public List<C21711d> mo55058b() {
                return this.f54779b;
            }

            /* renamed from: c */
            public String mo55059c() {
                return this.f54780c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21679aj)) {
                    return false;
                }
                C21679aj ajVar = (C21679aj) obj;
                return this.f54778a == ajVar.f54778a && C24362h.m61206a(mo55058b(), ajVar.mo55058b()) && C24362h.m61206a(mo55059c(), ajVar.mo55059c());
            }

            public int hashCode() {
                long j = this.f54778a;
                int i = ((int) (j ^ (j >>> 32))) * 31;
                List<C21711d> b = mo55058b();
                int i2 = 0;
                int hashCode = (i + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55059c();
                if (c != null) {
                    i2 = c.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("TakePictureClicked(delay=");
                k.append(this.f54778a);
                k.append(", experiments=");
                k.append(mo55058b());
                k.append(", veriff_sdk_version=");
                k.append(mo55059c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21679aj(long j, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54778a = j;
                this.f54779b = list;
                this.f54780c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$Timeout;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "delay", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(DLjava/util/List;Ljava/lang/String;)V", "getDelay", "()D", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$ak */
        public static final class C21680ak extends C21668a {

            /* renamed from: a */
            private final double f54781a;

            /* renamed from: b */
            private final List<C21711d> f54782b;

            /* renamed from: c */
            private final String f54783c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21680ak(double d, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(d, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21680ak m52681a(C21680ak akVar, double d, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = akVar.f54781a;
                }
                if ((i & 2) != 0) {
                    list = akVar.mo55065b();
                }
                if ((i & 4) != 0) {
                    str = akVar.mo55066c();
                }
                return akVar.mo55064a(d, list, str);
            }

            /* renamed from: a */
            public final double mo55063a() {
                return this.f54781a;
            }

            /* renamed from: a */
            public final C21680ak mo55064a(double d, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21680ak(d, list, str);
            }

            /* renamed from: b */
            public List<C21711d> mo55065b() {
                return this.f54782b;
            }

            /* renamed from: c */
            public String mo55066c() {
                return this.f54783c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21680ak)) {
                    return false;
                }
                C21680ak akVar = (C21680ak) obj;
                return Double.compare(this.f54781a, akVar.f54781a) == 0 && C24362h.m61206a(mo55065b(), akVar.mo55065b()) && C24362h.m61206a(mo55066c(), akVar.mo55066c());
            }

            public int hashCode() {
                long doubleToLongBits = Double.doubleToLongBits(this.f54781a);
                int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
                List<C21711d> b = mo55065b();
                int i2 = 0;
                int hashCode = (i + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55066c();
                if (c != null) {
                    i2 = c.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Timeout(delay=");
                k.append(this.f54781a);
                k.append(", experiments=");
                k.append(mo55065b());
                k.append(", veriff_sdk_version=");
                k.append(mo55066c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21680ak(double d, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54781a = d;
                this.f54782b = list;
                this.f54783c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoFileInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "file_length", "", "duration", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(JJLjava/util/List;Ljava/lang/String;)V", "getDuration", "()J", "getExperiments", "()Ljava/util/List;", "getFile_length", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$al */
        public static final class C21681al extends C21668a {

            /* renamed from: a */
            private final long f54784a;

            /* renamed from: b */
            private final long f54785b;

            /* renamed from: c */
            private final List<C21711d> f54786c;

            /* renamed from: d */
            private final String f54787d;

            public C21681al(long j, long j2) {
                this(j, j2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21681al(long j, long j2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21681al m52686a(C21681al alVar, long j, long j2, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = alVar.f54784a;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    j2 = alVar.f54785b;
                }
                long j4 = j2;
                if ((i & 4) != 0) {
                    list = alVar.mo55073c();
                }
                List<C21711d> list2 = list;
                if ((i & 8) != 0) {
                    str = alVar.mo55074d();
                }
                return alVar.mo55071a(j3, j4, list2, str);
            }

            /* renamed from: a */
            public final long mo55070a() {
                return this.f54784a;
            }

            /* renamed from: a */
            public final C21681al mo55071a(long j, long j2, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21681al(j, j2, list, str);
            }

            /* renamed from: b */
            public final long mo55072b() {
                return this.f54785b;
            }

            /* renamed from: c */
            public List<C21711d> mo55073c() {
                return this.f54786c;
            }

            /* renamed from: d */
            public String mo55074d() {
                return this.f54787d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21681al)) {
                    return false;
                }
                C21681al alVar = (C21681al) obj;
                return this.f54784a == alVar.f54784a && this.f54785b == alVar.f54785b && C24362h.m61206a(mo55073c(), alVar.mo55073c()) && C24362h.m61206a(mo55074d(), alVar.mo55074d());
            }

            public int hashCode() {
                long j = this.f54784a;
                long j2 = this.f54785b;
                int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                List<C21711d> c = mo55073c();
                int i2 = 0;
                int hashCode = (i + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55074d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("VideoFileInfo(file_length=");
                k.append(this.f54784a);
                k.append(", duration=");
                k.append(this.f54785b);
                k.append(", experiments=");
                k.append(mo55073c());
                k.append(", veriff_sdk_version=");
                k.append(mo55074d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21681al(long j, long j2, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54784a = j;
                this.f54785b = j2;
                this.f54786c = list;
                this.f54787d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoFrameInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "codec", "", "width", "", "height", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;)V", "getCodec", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getHeight", "()I", "getVeriff_sdk_version", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$am */
        public static final class C21682am extends C21668a {

            /* renamed from: a */
            private final String f54788a;

            /* renamed from: b */
            private final int f54789b;

            /* renamed from: c */
            private final int f54790c;

            /* renamed from: d */
            private final List<C21711d> f54791d;

            /* renamed from: e */
            private final String f54792e;

            public C21682am(String str, int i, int i2) {
                this(str, i, i2, (List) null, (String) null, 24, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21682am(String str, int i, int i2, List list, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21682am m52692a(C21682am amVar, String str, int i, int i2, List<C21711d> list, String str2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = amVar.f54788a;
                }
                if ((i3 & 2) != 0) {
                    i = amVar.f54789b;
                }
                int i4 = i;
                if ((i3 & 4) != 0) {
                    i2 = amVar.f54790c;
                }
                int i5 = i2;
                if ((i3 & 8) != 0) {
                    list = amVar.mo55082d();
                }
                List<C21711d> list2 = list;
                if ((i3 & 16) != 0) {
                    str2 = amVar.mo55083e();
                }
                return amVar.mo55078a(str, i4, i5, list2, str2);
            }

            /* renamed from: a */
            public final C21682am mo55078a(String str, int i, int i2, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "codec");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21682am(str, i, i2, list, str2);
            }

            /* renamed from: a */
            public final String mo55079a() {
                return this.f54788a;
            }

            /* renamed from: b */
            public final int mo55080b() {
                return this.f54789b;
            }

            /* renamed from: c */
            public final int mo55081c() {
                return this.f54790c;
            }

            /* renamed from: d */
            public List<C21711d> mo55082d() {
                return this.f54791d;
            }

            /* renamed from: e */
            public String mo55083e() {
                return this.f54792e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21682am)) {
                    return false;
                }
                C21682am amVar = (C21682am) obj;
                return C24362h.m61206a(this.f54788a, amVar.f54788a) && this.f54789b == amVar.f54789b && this.f54790c == amVar.f54790c && C24362h.m61206a(mo55082d(), amVar.mo55082d()) && C24362h.m61206a(mo55083e(), amVar.mo55083e());
            }

            public int hashCode() {
                String str = this.f54788a;
                int i = 0;
                int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f54789b) * 31) + this.f54790c) * 31;
                List<C21711d> d = mo55082d();
                int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
                String e = mo55083e();
                if (e != null) {
                    i = e.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("VideoFrameInfo(codec=");
                k.append(this.f54788a);
                k.append(", width=");
                k.append(this.f54789b);
                k.append(", height=");
                k.append(this.f54790c);
                k.append(", experiments=");
                k.append(mo55082d());
                k.append(", veriff_sdk_version=");
                k.append(mo55083e());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21682am(String str, int i, int i2, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "codec");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54788a = str;
                this.f54789b = i;
                this.f54790c = i2;
                this.f54791d = list;
                this.f54792e = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$VideoPlaybackStarted;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "screen", "Lcom/veriff/sdk/internal/analytics/Page;", "time", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Lcom/veriff/sdk/internal/analytics/Page;JLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getScreen", "()Lcom/veriff/sdk/internal/analytics/Page;", "getTime", "()J", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$an */
        public static final class C21683an extends C21668a {

            /* renamed from: a */
            private final C21783is f54793a;

            /* renamed from: b */
            private final long f54794b;

            /* renamed from: c */
            private final List<C21711d> f54795c;

            /* renamed from: d */
            private final String f54796d;

            public C21683an(C21783is isVar, long j) {
                this(isVar, j, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21683an(C21783is isVar, long j, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(isVar, j, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21683an m52699a(C21683an anVar, C21783is isVar, long j, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    isVar = anVar.f54793a;
                }
                if ((i & 2) != 0) {
                    j = anVar.f54794b;
                }
                long j2 = j;
                if ((i & 4) != 0) {
                    list = anVar.mo55090c();
                }
                List<C21711d> list2 = list;
                if ((i & 8) != 0) {
                    str = anVar.mo55091d();
                }
                return anVar.mo55087a(isVar, j2, list2, str);
            }

            /* renamed from: a */
            public final C21683an mo55087a(C21783is isVar, long j, List<C21711d> list, String str) {
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21683an(isVar, j, list, str);
            }

            /* renamed from: a */
            public final C21783is mo55088a() {
                return this.f54793a;
            }

            /* renamed from: b */
            public final long mo55089b() {
                return this.f54794b;
            }

            /* renamed from: c */
            public List<C21711d> mo55090c() {
                return this.f54795c;
            }

            /* renamed from: d */
            public String mo55091d() {
                return this.f54796d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21683an)) {
                    return false;
                }
                C21683an anVar = (C21683an) obj;
                return C24362h.m61206a(this.f54793a, anVar.f54793a) && this.f54794b == anVar.f54794b && C24362h.m61206a(mo55090c(), anVar.mo55090c()) && C24362h.m61206a(mo55091d(), anVar.mo55091d());
            }

            public int hashCode() {
                C21783is isVar = this.f54793a;
                int i = 0;
                int hashCode = isVar != null ? isVar.hashCode() : 0;
                long j = this.f54794b;
                int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                List<C21711d> c = mo55090c();
                int hashCode2 = (i2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55091d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("VideoPlaybackStarted(screen=");
                k.append(this.f54793a);
                k.append(", time=");
                k.append(this.f54794b);
                k.append(", experiments=");
                k.append(mo55090c());
                k.append(", veriff_sdk_version=");
                k.append(mo55091d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21683an(C21783is isVar, long j, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(isVar, "screen");
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54793a = isVar;
                this.f54794b = j;
                this.f54795c = list;
                this.f54796d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressScreenShown;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "flow_type", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFlow_type", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$c */
        public static final class C21685c extends C21668a {

            /* renamed from: a */
            private final String f54802a;

            /* renamed from: b */
            private final List<C21711d> f54803b;

            /* renamed from: c */
            private final String f54804c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21685c(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21685c m52712a(C21685c cVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f54802a;
                }
                if ((i & 2) != 0) {
                    list = cVar.mo55106b();
                }
                if ((i & 4) != 0) {
                    str2 = cVar.mo55107c();
                }
                return cVar.mo55104a(str, list, str2);
            }

            /* renamed from: a */
            public final C21685c mo55104a(String str, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21685c(str, list, str2);
            }

            /* renamed from: a */
            public final String mo55105a() {
                return this.f54802a;
            }

            /* renamed from: b */
            public List<C21711d> mo55106b() {
                return this.f54803b;
            }

            /* renamed from: c */
            public String mo55107c() {
                return this.f54804c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21685c)) {
                    return false;
                }
                C21685c cVar = (C21685c) obj;
                return C24362h.m61206a(this.f54802a, cVar.f54802a) && C24362h.m61206a(mo55106b(), cVar.mo55106b()) && C24362h.m61206a(mo55107c(), cVar.mo55107c());
            }

            public int hashCode() {
                String str = this.f54802a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                List<C21711d> b = mo55106b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55107c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AddressScreenShown(flow_type=");
                k.append(this.f54802a);
                k.append(", experiments=");
                k.append(mo55106b());
                k.append(", veriff_sdk_version=");
                k.append(mo55107c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21685c(String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54802a = str;
                this.f54803b = list;
                this.f54804c = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressTakePictureClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "flow_type", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFlow_type", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$d */
        public static final class C21686d extends C21668a {

            /* renamed from: a */
            private final String f54805a;

            /* renamed from: b */
            private final List<C21711d> f54806b;

            /* renamed from: c */
            private final String f54807c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21686d(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21686d m52717a(C21686d dVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f54805a;
                }
                if ((i & 2) != 0) {
                    list = dVar.mo55113b();
                }
                if ((i & 4) != 0) {
                    str2 = dVar.mo55114c();
                }
                return dVar.mo55111a(str, list, str2);
            }

            /* renamed from: a */
            public final C21686d mo55111a(String str, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21686d(str, list, str2);
            }

            /* renamed from: a */
            public final String mo55112a() {
                return this.f54805a;
            }

            /* renamed from: b */
            public List<C21711d> mo55113b() {
                return this.f54806b;
            }

            /* renamed from: c */
            public String mo55114c() {
                return this.f54807c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21686d)) {
                    return false;
                }
                C21686d dVar = (C21686d) obj;
                return C24362h.m61206a(this.f54805a, dVar.f54805a) && C24362h.m61206a(mo55113b(), dVar.mo55113b()) && C24362h.m61206a(mo55114c(), dVar.mo55114c());
            }

            public int hashCode() {
                String str = this.f54805a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                List<C21711d> b = mo55113b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55114c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AddressTakePictureClicked(flow_type=");
                k.append(this.f54805a);
                k.append(", experiments=");
                k.append(mo55113b());
                k.append(", veriff_sdk_version=");
                k.append(mo55114c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21686d(String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54805a = str;
                this.f54806b = list;
                this.f54807c = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressUploadFileClicked;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "flow_type", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFlow_type", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$e */
        public static final class C21687e extends C21668a {

            /* renamed from: a */
            private final String f54808a;

            /* renamed from: b */
            private final List<C21711d> f54809b;

            /* renamed from: c */
            private final String f54810c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21687e(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21687e m52722a(C21687e eVar, String str, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eVar.f54808a;
                }
                if ((i & 2) != 0) {
                    list = eVar.mo55120b();
                }
                if ((i & 4) != 0) {
                    str2 = eVar.mo55121c();
                }
                return eVar.mo55118a(str, list, str2);
            }

            /* renamed from: a */
            public final C21687e mo55118a(String str, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21687e(str, list, str2);
            }

            /* renamed from: a */
            public final String mo55119a() {
                return this.f54808a;
            }

            /* renamed from: b */
            public List<C21711d> mo55120b() {
                return this.f54809b;
            }

            /* renamed from: c */
            public String mo55121c() {
                return this.f54810c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21687e)) {
                    return false;
                }
                C21687e eVar = (C21687e) obj;
                return C24362h.m61206a(this.f54808a, eVar.f54808a) && C24362h.m61206a(mo55120b(), eVar.mo55120b()) && C24362h.m61206a(mo55121c(), eVar.mo55121c());
            }

            public int hashCode() {
                String str = this.f54808a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                List<C21711d> b = mo55120b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55121c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AddressUploadFileClicked(flow_type=");
                k.append(this.f54808a);
                k.append(", experiments=");
                k.append(mo55120b());
                k.append(", veriff_sdk_version=");
                k.append(mo55121c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21687e(String str, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54808a = str;
                this.f54809b = list;
                this.f54810c = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AutoCaptureTakingPicture;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "delay", "", "isManual", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(JZLjava/util/List;Ljava/lang/String;)V", "getDelay", "()J", "getExperiments", "()Ljava/util/List;", "()Z", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$f */
        public static final class C21688f extends C21668a {

            /* renamed from: a */
            private final long f54811a;

            /* renamed from: b */
            private final boolean f54812b;

            /* renamed from: c */
            private final List<C21711d> f54813c;

            /* renamed from: d */
            private final String f54814d;

            public C21688f(long j, boolean z, List<C21711d> list) {
                this(j, z, list, (String) null, 8, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21688f(long j, boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21688f m52727a(C21688f fVar, long j, boolean z, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.f54811a;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    z = fVar.f54812b;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    list = fVar.mo55128c();
                }
                List<C21711d> list2 = list;
                if ((i & 8) != 0) {
                    str = fVar.mo55129d();
                }
                return fVar.mo55126a(j2, z2, list2, str);
            }

            /* renamed from: a */
            public final long mo55125a() {
                return this.f54811a;
            }

            /* renamed from: a */
            public final C21688f mo55126a(long j, boolean z, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21688f(j, z, list, str);
            }

            /* renamed from: b */
            public final boolean mo55127b() {
                return this.f54812b;
            }

            /* renamed from: c */
            public List<C21711d> mo55128c() {
                return this.f54813c;
            }

            /* renamed from: d */
            public String mo55129d() {
                return this.f54814d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21688f)) {
                    return false;
                }
                C21688f fVar = (C21688f) obj;
                return this.f54811a == fVar.f54811a && this.f54812b == fVar.f54812b && C24362h.m61206a(mo55128c(), fVar.mo55128c()) && C24362h.m61206a(mo55129d(), fVar.mo55129d());
            }

            public int hashCode() {
                long j = this.f54811a;
                int i = ((int) (j ^ (j >>> 32))) * 31;
                boolean z = this.f54812b;
                if (z) {
                    z = true;
                }
                int i2 = (i + (z ? 1 : 0)) * 31;
                List<C21711d> c = mo55128c();
                int i3 = 0;
                int hashCode = (i2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55129d();
                if (d != null) {
                    i3 = d.hashCode();
                }
                return hashCode + i3;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AutoCaptureTakingPicture(delay=");
                k.append(this.f54811a);
                k.append(", isManual=");
                k.append(this.f54812b);
                k.append(", experiments=");
                k.append(mo55128c());
                k.append(", veriff_sdk_version=");
                k.append(mo55129d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21688f(long j, boolean z, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54811a = j;
                this.f54812b = z;
                this.f54813c = list;
                this.f54814d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeAccepted;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "attempts", "", "time", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(IJLjava/util/List;Ljava/lang/String;)V", "getAttempts", "()I", "getExperiments", "()Ljava/util/List;", "getTime", "()J", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$g */
        public static final class C21689g extends C21668a {

            /* renamed from: a */
            private final int f54815a;

            /* renamed from: b */
            private final long f54816b;

            /* renamed from: c */
            private final List<C21711d> f54817c;

            /* renamed from: d */
            private final String f54818d;

            public C21689g(int i, long j) {
                this(i, j, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21689g(int i, long j, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, j, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21689g m52733a(C21689g gVar, int i, long j, List<C21711d> list, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = gVar.f54815a;
                }
                if ((i2 & 2) != 0) {
                    j = gVar.f54816b;
                }
                long j2 = j;
                if ((i2 & 4) != 0) {
                    list = gVar.mo55136c();
                }
                List<C21711d> list2 = list;
                if ((i2 & 8) != 0) {
                    str = gVar.mo55137d();
                }
                return gVar.mo55134a(i, j2, list2, str);
            }

            /* renamed from: a */
            public final int mo55133a() {
                return this.f54815a;
            }

            /* renamed from: a */
            public final C21689g mo55134a(int i, long j, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21689g(i, j, list, str);
            }

            /* renamed from: b */
            public final long mo55135b() {
                return this.f54816b;
            }

            /* renamed from: c */
            public List<C21711d> mo55136c() {
                return this.f54817c;
            }

            /* renamed from: d */
            public String mo55137d() {
                return this.f54818d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21689g)) {
                    return false;
                }
                C21689g gVar = (C21689g) obj;
                return this.f54815a == gVar.f54815a && this.f54816b == gVar.f54816b && C24362h.m61206a(mo55136c(), gVar.mo55136c()) && C24362h.m61206a(mo55137d(), gVar.mo55137d());
            }

            public int hashCode() {
                long j = this.f54816b;
                int i = ((this.f54815a * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                List<C21711d> c = mo55136c();
                int i2 = 0;
                int hashCode = (i + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55137d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("BarcodeAccepted(attempts=");
                k.append(this.f54815a);
                k.append(", time=");
                k.append(this.f54816b);
                k.append(", experiments=");
                k.append(mo55136c());
                k.append(", veriff_sdk_version=");
                k.append(mo55137d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21689g(int i, long j, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54815a = i;
                this.f54816b = j;
                this.f54817c = list;
                this.f54818d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeScanStart;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "time", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(JLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getTime", "()J", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$h */
        public static final class C21690h extends C21668a {

            /* renamed from: a */
            private final long f54819a;

            /* renamed from: b */
            private final List<C21711d> f54820b;

            /* renamed from: c */
            private final String f54821c;

            public C21690h(long j) {
                this(j, (List) null, (String) null, 6, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21690h(long j, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21690h m52739a(C21690h hVar, long j, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = hVar.f54819a;
                }
                if ((i & 2) != 0) {
                    list = hVar.mo55143b();
                }
                if ((i & 4) != 0) {
                    str = hVar.mo55144c();
                }
                return hVar.mo55142a(j, list, str);
            }

            /* renamed from: a */
            public final long mo55141a() {
                return this.f54819a;
            }

            /* renamed from: a */
            public final C21690h mo55142a(long j, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21690h(j, list, str);
            }

            /* renamed from: b */
            public List<C21711d> mo55143b() {
                return this.f54820b;
            }

            /* renamed from: c */
            public String mo55144c() {
                return this.f54821c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21690h)) {
                    return false;
                }
                C21690h hVar = (C21690h) obj;
                return this.f54819a == hVar.f54819a && C24362h.m61206a(mo55143b(), hVar.mo55143b()) && C24362h.m61206a(mo55144c(), hVar.mo55144c());
            }

            public int hashCode() {
                long j = this.f54819a;
                int i = ((int) (j ^ (j >>> 32))) * 31;
                List<C21711d> b = mo55143b();
                int i2 = 0;
                int hashCode = (i + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55144c();
                if (c != null) {
                    i2 = c.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("BarcodeScanStart(time=");
                k.append(this.f54819a);
                k.append(", experiments=");
                k.append(mo55143b());
                k.append(", veriff_sdk_version=");
                k.append(mo55144c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21690h(long j, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54819a = j;
                this.f54820b = list;
                this.f54821c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$BarcodeScanned;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "time", "", "processing_time", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(JJLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getProcessing_time", "()J", "getTime", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$i */
        public static final class C21691i extends C21668a {

            /* renamed from: a */
            private final long f54822a;

            /* renamed from: b */
            private final long f54823b;

            /* renamed from: c */
            private final List<C21711d> f54824c;

            /* renamed from: d */
            private final String f54825d;

            public C21691i(long j, long j2) {
                this(j, j2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21691i(long j, long j2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21691i m52744a(C21691i iVar, long j, long j2, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = iVar.f54822a;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    j2 = iVar.f54823b;
                }
                long j4 = j2;
                if ((i & 4) != 0) {
                    list = iVar.mo55151c();
                }
                List<C21711d> list2 = list;
                if ((i & 8) != 0) {
                    str = iVar.mo55152d();
                }
                return iVar.mo55149a(j3, j4, list2, str);
            }

            /* renamed from: a */
            public final long mo55148a() {
                return this.f54822a;
            }

            /* renamed from: a */
            public final C21691i mo55149a(long j, long j2, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21691i(j, j2, list, str);
            }

            /* renamed from: b */
            public final long mo55150b() {
                return this.f54823b;
            }

            /* renamed from: c */
            public List<C21711d> mo55151c() {
                return this.f54824c;
            }

            /* renamed from: d */
            public String mo55152d() {
                return this.f54825d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21691i)) {
                    return false;
                }
                C21691i iVar = (C21691i) obj;
                return this.f54822a == iVar.f54822a && this.f54823b == iVar.f54823b && C24362h.m61206a(mo55151c(), iVar.mo55151c()) && C24362h.m61206a(mo55152d(), iVar.mo55152d());
            }

            public int hashCode() {
                long j = this.f54822a;
                long j2 = this.f54823b;
                int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                List<C21711d> c = mo55151c();
                int i2 = 0;
                int hashCode = (i + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55152d();
                if (d != null) {
                    i2 = d.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("BarcodeScanned(time=");
                k.append(this.f54822a);
                k.append(", processing_time=");
                k.append(this.f54823b);
                k.append(", experiments=");
                k.append(mo55151c());
                k.append(", veriff_sdk_version=");
                k.append(mo55152d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21691i(long j, long j2, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54822a = j;
                this.f54823b = j2;
                this.f54824c = list;
                this.f54825d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ClientData;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "implementationType", "Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "sdkApiVersion", "", "appPackageName", "appVersionCode", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)V", "getAppPackageName", "()Ljava/lang/String;", "getAppVersionCode", "()J", "getExperiments", "()Ljava/util/List;", "getImplementationType", "()Lcom/veriff/sdk/internal/analytics/Event$ImplementationType;", "getSdkApiVersion", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$j */
        public static final class C21692j extends C21668a {

            /* renamed from: a */
            private final C21712e f54826a;

            /* renamed from: b */
            private final String f54827b;

            /* renamed from: c */
            private final String f54828c;

            /* renamed from: d */
            private final long f54829d;

            /* renamed from: e */
            private final List<C21711d> f54830e;

            /* renamed from: f */
            private final String f54831f;

            public C21692j(C21712e eVar, String str, String str2, long j) {
                this(eVar, str, str2, j, (List) null, (String) null, 48, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21692j(C21712e eVar, String str, String str2, long j, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(eVar, str, str2, j, (i & 16) != 0 ? null : list, (i & 32) != 0 ? "3.17.0" : str3);
            }

            /* renamed from: a */
            public static /* synthetic */ C21692j m52750a(C21692j jVar, C21712e eVar, String str, String str2, long j, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    eVar = jVar.f54826a;
                }
                if ((i & 2) != 0) {
                    str = jVar.f54827b;
                }
                String str4 = str;
                if ((i & 4) != 0) {
                    str2 = jVar.f54828c;
                }
                String str5 = str2;
                if ((i & 8) != 0) {
                    j = jVar.f54829d;
                }
                long j2 = j;
                if ((i & 16) != 0) {
                    list = jVar.mo55161e();
                }
                List<C21711d> list2 = list;
                if ((i & 32) != 0) {
                    str3 = jVar.mo55163f();
                }
                return jVar.mo55156a(eVar, str4, str5, j2, list2, str3);
            }

            /* renamed from: a */
            public final C21692j mo55156a(C21712e eVar, String str, String str2, long j, List<C21711d> list, String str3) {
                C24362h.m61211f(eVar, "implementationType");
                C24362h.m61211f(str, "sdkApiVersion");
                C24362h.m61211f(str2, "appPackageName");
                String str4 = str3;
                C24362h.m61211f(str4, "veriff_sdk_version");
                return new C21692j(eVar, str, str2, j, list, str4);
            }

            /* renamed from: a */
            public final C21712e mo55157a() {
                return this.f54826a;
            }

            /* renamed from: b */
            public final String mo55158b() {
                return this.f54827b;
            }

            /* renamed from: c */
            public final String mo55159c() {
                return this.f54828c;
            }

            /* renamed from: d */
            public final long mo55160d() {
                return this.f54829d;
            }

            /* renamed from: e */
            public List<C21711d> mo55161e() {
                return this.f54830e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21692j)) {
                    return false;
                }
                C21692j jVar = (C21692j) obj;
                return C24362h.m61206a(this.f54826a, jVar.f54826a) && C24362h.m61206a(this.f54827b, jVar.f54827b) && C24362h.m61206a(this.f54828c, jVar.f54828c) && this.f54829d == jVar.f54829d && C24362h.m61206a(mo55161e(), jVar.mo55161e()) && C24362h.m61206a(mo55163f(), jVar.mo55163f());
            }

            /* renamed from: f */
            public String mo55163f() {
                return this.f54831f;
            }

            public int hashCode() {
                C21712e eVar = this.f54826a;
                int i = 0;
                int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
                String str = this.f54827b;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f54828c;
                int hashCode3 = str2 != null ? str2.hashCode() : 0;
                long j = this.f54829d;
                int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                List<C21711d> e = mo55161e();
                int hashCode4 = (i2 + (e != null ? e.hashCode() : 0)) * 31;
                String f = mo55163f();
                if (f != null) {
                    i = f.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ClientData(implementationType=");
                k.append(this.f54826a);
                k.append(", sdkApiVersion=");
                k.append(this.f54827b);
                k.append(", appPackageName=");
                k.append(this.f54828c);
                k.append(", appVersionCode=");
                k.append(this.f54829d);
                k.append(", experiments=");
                k.append(mo55161e());
                k.append(", veriff_sdk_version=");
                k.append(mo55163f());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21692j(C21712e eVar, String str, String str2, long j, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(eVar, "implementationType");
                C24362h.m61211f(str, "sdkApiVersion");
                C24362h.m61211f(str2, "appPackageName");
                C24362h.m61211f(str3, "veriff_sdk_version");
                this.f54826a = eVar;
                this.f54827b = str;
                this.f54828c = str2;
                this.f54829d = j;
                this.f54830e = list;
                this.f54831f = str3;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentApproved;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "country", "", "state", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getState", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$k */
        public static final class C21693k extends C21668a {

            /* renamed from: a */
            private final String f54832a;

            /* renamed from: b */
            private final String f54833b;

            /* renamed from: c */
            private final List<C21711d> f54834c;

            /* renamed from: d */
            private final String f54835d;

            public C21693k(String str, String str2) {
                this(str, str2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21693k(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str3);
            }

            /* renamed from: a */
            public static /* synthetic */ C21693k m52758a(C21693k kVar, String str, String str2, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = kVar.f54832a;
                }
                if ((i & 2) != 0) {
                    str2 = kVar.f54833b;
                }
                if ((i & 4) != 0) {
                    list = kVar.mo55169c();
                }
                if ((i & 8) != 0) {
                    str3 = kVar.mo55170d();
                }
                return kVar.mo55166a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final C21693k mo55166a(String str, String str2, List<C21711d> list, String str3) {
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21693k(str, str2, list, str3);
            }

            /* renamed from: a */
            public final String mo55167a() {
                return this.f54832a;
            }

            /* renamed from: b */
            public final String mo55168b() {
                return this.f54833b;
            }

            /* renamed from: c */
            public List<C21711d> mo55169c() {
                return this.f54834c;
            }

            /* renamed from: d */
            public String mo55170d() {
                return this.f54835d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21693k)) {
                    return false;
                }
                C21693k kVar = (C21693k) obj;
                return C24362h.m61206a(this.f54832a, kVar.f54832a) && C24362h.m61206a(this.f54833b, kVar.f54833b) && C24362h.m61206a(mo55169c(), kVar.mo55169c()) && C24362h.m61206a(mo55170d(), kVar.mo55170d());
            }

            public int hashCode() {
                String str = this.f54832a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54833b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List<C21711d> c = mo55169c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55170d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ConsentApproved(country=");
                k.append(this.f54832a);
                k.append(", state=");
                k.append(this.f54833b);
                k.append(", experiments=");
                k.append(mo55169c());
                k.append(", veriff_sdk_version=");
                k.append(mo55170d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21693k(String str, String str2, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str3, "veriff_sdk_version");
                this.f54832a = str;
                this.f54833b = str2;
                this.f54834c = list;
                this.f54835d = str3;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentRejected;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "country", "", "state", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getState", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$l */
        public static final class C21694l extends C21668a {

            /* renamed from: a */
            private final String f54836a;

            /* renamed from: b */
            private final String f54837b;

            /* renamed from: c */
            private final List<C21711d> f54838c;

            /* renamed from: d */
            private final String f54839d;

            public C21694l(String str, String str2) {
                this(str, str2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21694l(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str3);
            }

            /* renamed from: a */
            public static /* synthetic */ C21694l m52764a(C21694l lVar, String str, String str2, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = lVar.f54836a;
                }
                if ((i & 2) != 0) {
                    str2 = lVar.f54837b;
                }
                if ((i & 4) != 0) {
                    list = lVar.mo55177c();
                }
                if ((i & 8) != 0) {
                    str3 = lVar.mo55178d();
                }
                return lVar.mo55174a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final C21694l mo55174a(String str, String str2, List<C21711d> list, String str3) {
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21694l(str, str2, list, str3);
            }

            /* renamed from: a */
            public final String mo55175a() {
                return this.f54836a;
            }

            /* renamed from: b */
            public final String mo55176b() {
                return this.f54837b;
            }

            /* renamed from: c */
            public List<C21711d> mo55177c() {
                return this.f54838c;
            }

            /* renamed from: d */
            public String mo55178d() {
                return this.f54839d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21694l)) {
                    return false;
                }
                C21694l lVar = (C21694l) obj;
                return C24362h.m61206a(this.f54836a, lVar.f54836a) && C24362h.m61206a(this.f54837b, lVar.f54837b) && C24362h.m61206a(mo55177c(), lVar.mo55177c()) && C24362h.m61206a(mo55178d(), lVar.mo55178d());
            }

            public int hashCode() {
                String str = this.f54836a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54837b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List<C21711d> c = mo55177c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55178d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ConsentRejected(country=");
                k.append(this.f54836a);
                k.append(", state=");
                k.append(this.f54837b);
                k.append(", experiments=");
                k.append(mo55177c());
                k.append(", veriff_sdk_version=");
                k.append(mo55178d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21694l(String str, String str2, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str3, "veriff_sdk_version");
                this.f54836a = str;
                this.f54837b = str2;
                this.f54838c = list;
                this.f54839d = str3;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ConsentScreenShown;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "country", "", "state", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getState", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$m */
        public static final class C21695m extends C21668a {

            /* renamed from: a */
            private final String f54840a;

            /* renamed from: b */
            private final String f54841b;

            /* renamed from: c */
            private final List<C21711d> f54842c;

            /* renamed from: d */
            private final String f54843d;

            public C21695m(String str, String str2) {
                this(str, str2, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21695m(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str3);
            }

            /* renamed from: a */
            public static /* synthetic */ C21695m m52770a(C21695m mVar, String str, String str2, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = mVar.f54840a;
                }
                if ((i & 2) != 0) {
                    str2 = mVar.f54841b;
                }
                if ((i & 4) != 0) {
                    list = mVar.mo55185c();
                }
                if ((i & 8) != 0) {
                    str3 = mVar.mo55186d();
                }
                return mVar.mo55182a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final C21695m mo55182a(String str, String str2, List<C21711d> list, String str3) {
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21695m(str, str2, list, str3);
            }

            /* renamed from: a */
            public final String mo55183a() {
                return this.f54840a;
            }

            /* renamed from: b */
            public final String mo55184b() {
                return this.f54841b;
            }

            /* renamed from: c */
            public List<C21711d> mo55185c() {
                return this.f54842c;
            }

            /* renamed from: d */
            public String mo55186d() {
                return this.f54843d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21695m)) {
                    return false;
                }
                C21695m mVar = (C21695m) obj;
                return C24362h.m61206a(this.f54840a, mVar.f54840a) && C24362h.m61206a(this.f54841b, mVar.f54841b) && C24362h.m61206a(mo55185c(), mVar.mo55185c()) && C24362h.m61206a(mo55186d(), mVar.mo55186d());
            }

            public int hashCode() {
                String str = this.f54840a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54841b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List<C21711d> c = mo55185c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55186d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ConsentScreenShown(country=");
                k.append(this.f54840a);
                k.append(", state=");
                k.append(this.f54841b);
                k.append(", experiments=");
                k.append(mo55185c());
                k.append(", veriff_sdk_version=");
                k.append(mo55186d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21695m(String str, String str2, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str3, "veriff_sdk_version");
                this.f54840a = str;
                this.f54841b = str2;
                this.f54842c = list;
                this.f54843d = str3;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JZ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$CountrySelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "preselected_country", "", "geoip_country", "country", "preselected", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getGeoip_country", "getPreselected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPreselected_country", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$CountrySelection;", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$n */
        public static final class C21696n extends C21668a {

            /* renamed from: a */
            private final String f54844a;

            /* renamed from: b */
            private final String f54845b;

            /* renamed from: c */
            private final String f54846c;

            /* renamed from: d */
            private final Boolean f54847d;

            /* renamed from: e */
            private final List<C21711d> f54848e;

            /* renamed from: f */
            private final String f54849f;

            public C21696n() {
                this((String) null, (String) null, (String) null, (Boolean) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            public C21696n(String str, String str2, String str3, Boolean bool) {
                this(str, str2, str3, bool, (List) null, (String) null, 48, (DefaultConstructorMarker) null);
            }

            public C21696n(String str, String str2, String str3, Boolean bool, List<C21711d> list) {
                this(str, str2, str3, bool, list, (String) null, 32, (DefaultConstructorMarker) null);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C21696n(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8, java.util.List r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
                /*
                    r4 = this;
                    r12 = r11 & 1
                    r0 = 0
                    if (r12 == 0) goto L_0x0007
                    r12 = r0
                    goto L_0x0008
                L_0x0007:
                    r12 = r5
                L_0x0008:
                    r5 = r11 & 2
                    if (r5 == 0) goto L_0x000e
                    r1 = r0
                    goto L_0x000f
                L_0x000e:
                    r1 = r6
                L_0x000f:
                    r5 = r11 & 4
                    if (r5 == 0) goto L_0x0015
                    r2 = r0
                    goto L_0x0016
                L_0x0015:
                    r2 = r7
                L_0x0016:
                    r5 = r11 & 8
                    if (r5 == 0) goto L_0x001c
                    r3 = r0
                    goto L_0x001d
                L_0x001c:
                    r3 = r8
                L_0x001d:
                    r5 = r11 & 16
                    if (r5 == 0) goto L_0x0022
                    goto L_0x0023
                L_0x0022:
                    r0 = r9
                L_0x0023:
                    r5 = r11 & 32
                    if (r5 == 0) goto L_0x0029
                    java.lang.String r10 = "3.17.0"
                L_0x0029:
                    r11 = r10
                    r5 = r4
                    r6 = r12
                    r7 = r1
                    r8 = r2
                    r9 = r3
                    r10 = r0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21667gf.C21668a.C21696n.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: a */
            public final C21696n mo55190a(String str, String str2, String str3, Boolean bool, List<C21711d> list, String str4) {
                C24362h.m61211f(str4, "veriff_sdk_version");
                return new C21696n(str, str2, str3, bool, list, str4);
            }

            /* renamed from: a */
            public final String mo55191a() {
                return this.f54844a;
            }

            /* renamed from: b */
            public final String mo55192b() {
                return this.f54845b;
            }

            /* renamed from: c */
            public final String mo55193c() {
                return this.f54846c;
            }

            /* renamed from: d */
            public final Boolean mo55194d() {
                return this.f54847d;
            }

            /* renamed from: e */
            public List<C21711d> mo55195e() {
                return this.f54848e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21696n)) {
                    return false;
                }
                C21696n nVar = (C21696n) obj;
                return C24362h.m61206a(this.f54844a, nVar.f54844a) && C24362h.m61206a(this.f54845b, nVar.f54845b) && C24362h.m61206a(this.f54846c, nVar.f54846c) && C24362h.m61206a(this.f54847d, nVar.f54847d) && C24362h.m61206a(mo55195e(), nVar.mo55195e()) && C24362h.m61206a(mo55197f(), nVar.mo55197f());
            }

            /* renamed from: f */
            public String mo55197f() {
                return this.f54849f;
            }

            public int hashCode() {
                String str = this.f54844a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54845b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f54846c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Boolean bool = this.f54847d;
                int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
                List<C21711d> e = mo55195e();
                int hashCode5 = (hashCode4 + (e != null ? e.hashCode() : 0)) * 31;
                String f = mo55197f();
                if (f != null) {
                    i = f.hashCode();
                }
                return hashCode5 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("CountrySelection(preselected_country=");
                k.append(this.f54844a);
                k.append(", geoip_country=");
                k.append(this.f54845b);
                k.append(", country=");
                k.append(this.f54846c);
                k.append(", preselected=");
                k.append(this.f54847d);
                k.append(", experiments=");
                k.append(mo55195e());
                k.append(", veriff_sdk_version=");
                k.append(mo55197f());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21696n(String str, String str2, String str3, Boolean bool, List<C21711d> list, String str4) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str4, "veriff_sdk_version");
                this.f54844a = str;
                this.f54845b = str2;
                this.f54846c = str3;
                this.f54847d = bool;
                this.f54848e = list;
                this.f54849f = str4;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$DecisionContinue;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "delay", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(ILjava/util/List;Ljava/lang/String;)V", "getDelay", "()I", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$o */
        public static final class C21697o extends C21668a {

            /* renamed from: a */
            private final int f54850a;

            /* renamed from: b */
            private final List<C21711d> f54851b;

            /* renamed from: c */
            private final String f54852c;

            public C21697o(int i) {
                this(i, (List) null, (String) null, 6, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21697o(int i, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21697o m52783a(C21697o oVar, int i, List<C21711d> list, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = oVar.f54850a;
                }
                if ((i2 & 2) != 0) {
                    list = oVar.mo55202b();
                }
                if ((i2 & 4) != 0) {
                    str = oVar.mo55203c();
                }
                return oVar.mo55201a(i, list, str);
            }

            /* renamed from: a */
            public final int mo55200a() {
                return this.f54850a;
            }

            /* renamed from: a */
            public final C21697o mo55201a(int i, List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21697o(i, list, str);
            }

            /* renamed from: b */
            public List<C21711d> mo55202b() {
                return this.f54851b;
            }

            /* renamed from: c */
            public String mo55203c() {
                return this.f54852c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21697o)) {
                    return false;
                }
                C21697o oVar = (C21697o) obj;
                return this.f54850a == oVar.f54850a && C24362h.m61206a(mo55202b(), oVar.mo55202b()) && C24362h.m61206a(mo55203c(), oVar.mo55203c());
            }

            public int hashCode() {
                int i = this.f54850a * 31;
                List<C21711d> b = mo55202b();
                int i2 = 0;
                int hashCode = (i + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55203c();
                if (c != null) {
                    i2 = c.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("DecisionContinue(delay=");
                k.append(this.f54850a);
                k.append(", experiments=");
                k.append(mo55202b());
                k.append(", veriff_sdk_version=");
                k.append(mo55203c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21697o(int i, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54850a = i;
                this.f54851b = list;
                this.f54852c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$DecisionReceived;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "decision", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Lmobi/lab/veriff/data/api/request/response/VerificationStatus;Ljava/util/List;Ljava/lang/String;)V", "getDecision", "()Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$p */
        public static final class C21698p extends C21668a {

            /* renamed from: a */
            private final C22621vh f54853a;

            /* renamed from: b */
            private final List<C21711d> f54854b;

            /* renamed from: c */
            private final String f54855c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21698p(C22621vh vhVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(vhVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21698p m52788a(C21698p pVar, C22621vh vhVar, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    vhVar = pVar.f54853a;
                }
                if ((i & 2) != 0) {
                    list = pVar.mo55209b();
                }
                if ((i & 4) != 0) {
                    str = pVar.mo55210c();
                }
                return pVar.mo55207a(vhVar, list, str);
            }

            /* renamed from: a */
            public final C21698p mo55207a(C22621vh vhVar, List<C21711d> list, String str) {
                C24362h.m61211f(vhVar, "decision");
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21698p(vhVar, list, str);
            }

            /* renamed from: a */
            public final C22621vh mo55208a() {
                return this.f54853a;
            }

            /* renamed from: b */
            public List<C21711d> mo55209b() {
                return this.f54854b;
            }

            /* renamed from: c */
            public String mo55210c() {
                return this.f54855c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21698p)) {
                    return false;
                }
                C21698p pVar = (C21698p) obj;
                return C24362h.m61206a(this.f54853a, pVar.f54853a) && C24362h.m61206a(mo55209b(), pVar.mo55209b()) && C24362h.m61206a(mo55210c(), pVar.mo55210c());
            }

            public int hashCode() {
                C22621vh vhVar = this.f54853a;
                int i = 0;
                int hashCode = (vhVar != null ? vhVar.hashCode() : 0) * 31;
                List<C21711d> b = mo55209b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55210c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("DecisionReceived(decision=");
                k.append(this.f54853a);
                k.append(", experiments=");
                k.append(mo55209b());
                k.append(", veriff_sdk_version=");
                k.append(mo55210c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21698p(C22621vh vhVar, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(vhVar, "decision");
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54853a = vhVar;
                this.f54854b = list;
                this.f54855c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$DeviceInfo;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "device_info", "Lcom/veriff/sdk/internal/analytics/DeviceInfo;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Lcom/veriff/sdk/internal/analytics/DeviceInfo;Ljava/util/List;Ljava/lang/String;)V", "getDevice_info", "()Lcom/veriff/sdk/internal/analytics/DeviceInfo;", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$q */
        public static final class C21699q extends C21668a {

            /* renamed from: a */
            private final C21664gd f54856a;

            /* renamed from: b */
            private final List<C21711d> f54857b;

            /* renamed from: c */
            private final String f54858c;

            public C21699q(C21664gd gdVar, List<C21711d> list) {
                this(gdVar, list, (String) null, 4, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21699q(C21664gd gdVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(gdVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21699q m52793a(C21699q qVar, C21664gd gdVar, List<C21711d> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    gdVar = qVar.f54856a;
                }
                if ((i & 2) != 0) {
                    list = qVar.mo55216b();
                }
                if ((i & 4) != 0) {
                    str = qVar.mo55217c();
                }
                return qVar.mo55215a(gdVar, list, str);
            }

            /* renamed from: a */
            public final C21664gd mo55214a() {
                return this.f54856a;
            }

            /* renamed from: a */
            public final C21699q mo55215a(C21664gd gdVar, List<C21711d> list, String str) {
                C24362h.m61211f(gdVar, "device_info");
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21699q(gdVar, list, str);
            }

            /* renamed from: b */
            public List<C21711d> mo55216b() {
                return this.f54857b;
            }

            /* renamed from: c */
            public String mo55217c() {
                return this.f54858c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21699q)) {
                    return false;
                }
                C21699q qVar = (C21699q) obj;
                return C24362h.m61206a(this.f54856a, qVar.f54856a) && C24362h.m61206a(mo55216b(), qVar.mo55216b()) && C24362h.m61206a(mo55217c(), qVar.mo55217c());
            }

            public int hashCode() {
                C21664gd gdVar = this.f54856a;
                int i = 0;
                int hashCode = (gdVar != null ? gdVar.hashCode() : 0) * 31;
                List<C21711d> b = mo55216b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55217c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("DeviceInfo(device_info=");
                k.append(this.f54856a);
                k.append(", experiments=");
                k.append(mo55216b());
                k.append(", veriff_sdk_version=");
                k.append(mo55217c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21699q(C21664gd gdVar, List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(gdVar, "device_info");
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54856a = gdVar;
                this.f54857b = list;
                this.f54858c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JB\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentSelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "document", "", "preselected", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getDocument", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getPreselected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentSelection;", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$r */
        public static final class C21700r extends C21668a {

            /* renamed from: a */
            private final String f54859a;

            /* renamed from: b */
            private final Boolean f54860b;

            /* renamed from: c */
            private final List<C21711d> f54861c;

            /* renamed from: d */
            private final String f54862d;

            public C21700r() {
                this((String) null, (Boolean) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            public C21700r(String str, Boolean bool) {
                this(str, bool, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21700r(String str, Boolean bool, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public final C21700r mo55221a(String str, Boolean bool, List<C21711d> list, String str2) {
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21700r(str, bool, list, str2);
            }

            /* renamed from: a */
            public final String mo55222a() {
                return this.f54859a;
            }

            /* renamed from: b */
            public final Boolean mo55223b() {
                return this.f54860b;
            }

            /* renamed from: c */
            public List<C21711d> mo55224c() {
                return this.f54861c;
            }

            /* renamed from: d */
            public String mo55225d() {
                return this.f54862d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21700r)) {
                    return false;
                }
                C21700r rVar = (C21700r) obj;
                return C24362h.m61206a(this.f54859a, rVar.f54859a) && C24362h.m61206a(this.f54860b, rVar.f54860b) && C24362h.m61206a(mo55224c(), rVar.mo55224c()) && C24362h.m61206a(mo55225d(), rVar.mo55225d());
            }

            public int hashCode() {
                String str = this.f54859a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Boolean bool = this.f54860b;
                int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
                List<C21711d> c = mo55224c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55225d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("DocumentSelection(document=");
                k.append(this.f54859a);
                k.append(", preselected=");
                k.append(this.f54860b);
                k.append(", experiments=");
                k.append(mo55224c());
                k.append(", veriff_sdk_version=");
                k.append(mo55225d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21700r(String str, Boolean bool, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54859a = str;
                this.f54860b = bool;
                this.f54861c = list;
                this.f54862d = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentsSelection;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "possible_documents", "", "", "preselected", "", "experiments", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getPossible_documents", "getPreselected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$DocumentsSelection;", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$s */
        public static final class C21701s extends C21668a {

            /* renamed from: a */
            private final List<String> f54863a;

            /* renamed from: b */
            private final Boolean f54864b;

            /* renamed from: c */
            private final List<C21711d> f54865c;

            /* renamed from: d */
            private final String f54866d;

            public C21701s() {
                this((List) null, (Boolean) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            public C21701s(List<String> list, Boolean bool, List<C21711d> list2) {
                this(list, bool, list2, (String) null, 8, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21701s(List list, Boolean bool, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public final C21701s mo55229a(List<String> list, Boolean bool, List<C21711d> list2, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21701s(list, bool, list2, str);
            }

            /* renamed from: a */
            public final List<String> mo55230a() {
                return this.f54863a;
            }

            /* renamed from: b */
            public final Boolean mo55231b() {
                return this.f54864b;
            }

            /* renamed from: c */
            public List<C21711d> mo55232c() {
                return this.f54865c;
            }

            /* renamed from: d */
            public String mo55233d() {
                return this.f54866d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21701s)) {
                    return false;
                }
                C21701s sVar = (C21701s) obj;
                return C24362h.m61206a(this.f54863a, sVar.f54863a) && C24362h.m61206a(this.f54864b, sVar.f54864b) && C24362h.m61206a(mo55232c(), sVar.mo55232c()) && C24362h.m61206a(mo55233d(), sVar.mo55233d());
            }

            public int hashCode() {
                List<String> list = this.f54863a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                Boolean bool = this.f54864b;
                int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
                List<C21711d> c = mo55232c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55233d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("DocumentsSelection(possible_documents=");
                k.append(this.f54863a);
                k.append(", preselected=");
                k.append(this.f54864b);
                k.append(", experiments=");
                k.append(mo55232c());
                k.append(", veriff_sdk_version=");
                k.append(mo55233d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21701s(List<String> list, Boolean bool, List<C21711d> list2, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54863a = list;
                this.f54864b = bool;
                this.f54865c = list2;
                this.f54866d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$Empty;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "", "(Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$t */
        public static final class C21702t extends C21668a {

            /* renamed from: a */
            private final List<C21711d> f54867a;

            /* renamed from: b */
            private final String f54868b;

            public C21702t() {
                this((List) null, (String) null, 3, (DefaultConstructorMarker) null);
            }

            public C21702t(List<C21711d> list) {
                this(list, (String) null, 2, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21702t(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public final C21702t mo55237a(List<C21711d> list, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21702t(list, str);
            }

            /* renamed from: a */
            public List<C21711d> mo55238a() {
                return this.f54867a;
            }

            /* renamed from: b */
            public String mo55239b() {
                return this.f54868b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21702t)) {
                    return false;
                }
                C21702t tVar = (C21702t) obj;
                return C24362h.m61206a(mo55238a(), tVar.mo55238a()) && C24362h.m61206a(mo55239b(), tVar.mo55239b());
            }

            public int hashCode() {
                List<C21711d> a = mo55238a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                String b = mo55239b();
                if (b != null) {
                    i = b.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Empty(experiments=");
                k.append(mo55238a());
                k.append(", veriff_sdk_version=");
                k.append(mo55239b());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21702t(List<C21711d> list, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54867a = list;
                this.f54868b = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ErrorReport;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "message", "", "severity", "Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;", "feature", "Lcom/veriff/sdk/internal/analytics/FeatureArea;", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;Lcom/veriff/sdk/internal/analytics/FeatureArea;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFeature", "()Lcom/veriff/sdk/internal/analytics/FeatureArea;", "getMessage", "()Ljava/lang/String;", "getSeverity", "()Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$u */
        public static final class C21703u extends C21668a {

            /* renamed from: a */
            private final String f54869a;

            /* renamed from: b */
            private final C21710c f54870b;

            /* renamed from: c */
            private final C21720gj f54871c;

            /* renamed from: d */
            private final List<C21711d> f54872d;

            /* renamed from: e */
            private final String f54873e;

            public C21703u(String str, C21710c cVar, C21720gj gjVar) {
                this(str, cVar, gjVar, (List) null, (String) null, 24, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21703u(String str, C21710c cVar, C21720gj gjVar, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, cVar, gjVar, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21703u m52811a(C21703u uVar, String str, C21710c cVar, C21720gj gjVar, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = uVar.f54869a;
                }
                if ((i & 2) != 0) {
                    cVar = uVar.f54870b;
                }
                C21710c cVar2 = cVar;
                if ((i & 4) != 0) {
                    gjVar = uVar.f54871c;
                }
                C21720gj gjVar2 = gjVar;
                if ((i & 8) != 0) {
                    list = uVar.mo55247d();
                }
                List<C21711d> list2 = list;
                if ((i & 16) != 0) {
                    str2 = uVar.mo55248e();
                }
                return uVar.mo55243a(str, cVar2, gjVar2, list2, str2);
            }

            /* renamed from: a */
            public final C21703u mo55243a(String str, C21710c cVar, C21720gj gjVar, List<C21711d> list, String str2) {
                C24362h.m61211f(str, InAppMessageBase.MESSAGE);
                C24362h.m61211f(cVar, "severity");
                C24362h.m61211f(gjVar, "feature");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21703u(str, cVar, gjVar, list, str2);
            }

            /* renamed from: a */
            public final String mo55244a() {
                return this.f54869a;
            }

            /* renamed from: b */
            public final C21710c mo55245b() {
                return this.f54870b;
            }

            /* renamed from: c */
            public final C21720gj mo55246c() {
                return this.f54871c;
            }

            /* renamed from: d */
            public List<C21711d> mo55247d() {
                return this.f54872d;
            }

            /* renamed from: e */
            public String mo55248e() {
                return this.f54873e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21703u)) {
                    return false;
                }
                C21703u uVar = (C21703u) obj;
                return C24362h.m61206a(this.f54869a, uVar.f54869a) && C24362h.m61206a(this.f54870b, uVar.f54870b) && C24362h.m61206a(this.f54871c, uVar.f54871c) && C24362h.m61206a(mo55247d(), uVar.mo55247d()) && C24362h.m61206a(mo55248e(), uVar.mo55248e());
            }

            public int hashCode() {
                String str = this.f54869a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                C21710c cVar = this.f54870b;
                int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
                C21720gj gjVar = this.f54871c;
                int hashCode3 = (hashCode2 + (gjVar != null ? gjVar.hashCode() : 0)) * 31;
                List<C21711d> d = mo55247d();
                int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
                String e = mo55248e();
                if (e != null) {
                    i = e.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ErrorReport(message=");
                k.append(this.f54869a);
                k.append(", severity=");
                k.append(this.f54870b);
                k.append(", feature=");
                k.append(this.f54871c);
                k.append(", experiments=");
                k.append(mo55247d());
                k.append(", veriff_sdk_version=");
                k.append(mo55248e());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21703u(String str, C21710c cVar, C21720gj gjVar, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, InAppMessageBase.MESSAGE);
                C24362h.m61211f(cVar, "severity");
                C24362h.m61211f(gjVar, "feature");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54869a = str;
                this.f54870b = cVar;
                this.f54871c = gjVar;
                this.f54872d = list;
                this.f54873e = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$FailedList;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "failed", "", "", "experiments", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFailed", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$w */
        public static final class C21705w extends C21668a {

            /* renamed from: a */
            private final List<String> f54878a;

            /* renamed from: b */
            private final List<C21711d> f54879b;

            /* renamed from: c */
            private final String f54880c;

            public C21705w(List<String> list, List<C21711d> list2) {
                this(list, list2, (String) null, 4, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21705w(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21705w m52824a(C21705w wVar, List<String> list, List<C21711d> list2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = wVar.f54878a;
                }
                if ((i & 2) != 0) {
                    list2 = wVar.mo55262b();
                }
                if ((i & 4) != 0) {
                    str = wVar.mo55263c();
                }
                return wVar.mo55260a(list, list2, str);
            }

            /* renamed from: a */
            public final C21705w mo55260a(List<String> list, List<C21711d> list2, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21705w(list, list2, str);
            }

            /* renamed from: a */
            public final List<String> mo55261a() {
                return this.f54878a;
            }

            /* renamed from: b */
            public List<C21711d> mo55262b() {
                return this.f54879b;
            }

            /* renamed from: c */
            public String mo55263c() {
                return this.f54880c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21705w)) {
                    return false;
                }
                C21705w wVar = (C21705w) obj;
                return C24362h.m61206a(this.f54878a, wVar.f54878a) && C24362h.m61206a(mo55262b(), wVar.mo55262b()) && C24362h.m61206a(mo55263c(), wVar.mo55263c());
            }

            public int hashCode() {
                List<String> list = this.f54878a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<C21711d> b = mo55262b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                String c = mo55263c();
                if (c != null) {
                    i = c.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("FailedList(failed=");
                k.append(this.f54878a);
                k.append(", experiments=");
                k.append(mo55262b());
                k.append(", veriff_sdk_version=");
                k.append(mo55263c());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21705w(List<String> list, List<C21711d> list2, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54878a = list;
                this.f54879b = list2;
                this.f54880c = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006'"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$FeedbackDetails;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "text", "", "canContinue", "", "failed", "", "delay", "", "experiments", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getCanContinue", "()Z", "getDelay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExperiments", "()Ljava/util/List;", "getFailed", "getText", "()Ljava/lang/String;", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$FeedbackDetails;", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$x */
        public static final class C21706x extends C21668a {

            /* renamed from: a */
            private final String f54881a;

            /* renamed from: b */
            private final boolean f54882b;

            /* renamed from: c */
            private final List<String> f54883c;

            /* renamed from: d */
            private final Double f54884d;

            /* renamed from: e */
            private final List<C21711d> f54885e;

            /* renamed from: f */
            private final String f54886f;

            public C21706x(String str, boolean z, List<String> list, Double d, List<C21711d> list2) {
                this(str, z, list, d, list2, (String) null, 32, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21706x(String str, boolean z, List list, Double d, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, z, list, d, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21706x m52829a(C21706x xVar, String str, boolean z, List<String> list, Double d, List<C21711d> list2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = xVar.f54881a;
                }
                if ((i & 2) != 0) {
                    z = xVar.f54882b;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    list = xVar.f54883c;
                }
                List<String> list3 = list;
                if ((i & 8) != 0) {
                    d = xVar.f54884d;
                }
                Double d2 = d;
                if ((i & 16) != 0) {
                    list2 = xVar.mo55272e();
                }
                List<C21711d> list4 = list2;
                if ((i & 32) != 0) {
                    str2 = xVar.mo55274f();
                }
                return xVar.mo55267a(str, z2, list3, d2, list4, str2);
            }

            /* renamed from: a */
            public final C21706x mo55267a(String str, boolean z, List<String> list, Double d, List<C21711d> list2, String str2) {
                C24362h.m61211f(str, MessageButton.TEXT);
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21706x(str, z, list, d, list2, str2);
            }

            /* renamed from: a */
            public final String mo55268a() {
                return this.f54881a;
            }

            /* renamed from: b */
            public final boolean mo55269b() {
                return this.f54882b;
            }

            /* renamed from: c */
            public final List<String> mo55270c() {
                return this.f54883c;
            }

            /* renamed from: d */
            public final Double mo55271d() {
                return this.f54884d;
            }

            /* renamed from: e */
            public List<C21711d> mo55272e() {
                return this.f54885e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21706x)) {
                    return false;
                }
                C21706x xVar = (C21706x) obj;
                return C24362h.m61206a(this.f54881a, xVar.f54881a) && this.f54882b == xVar.f54882b && C24362h.m61206a(this.f54883c, xVar.f54883c) && C24362h.m61206a(this.f54884d, xVar.f54884d) && C24362h.m61206a(mo55272e(), xVar.mo55272e()) && C24362h.m61206a(mo55274f(), xVar.mo55274f());
            }

            /* renamed from: f */
            public String mo55274f() {
                return this.f54886f;
            }

            public int hashCode() {
                String str = this.f54881a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.f54882b;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode + (z ? 1 : 0)) * 31;
                List<String> list = this.f54883c;
                int hashCode2 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
                Double d = this.f54884d;
                int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
                List<C21711d> e = mo55272e();
                int hashCode4 = (hashCode3 + (e != null ? e.hashCode() : 0)) * 31;
                String f = mo55274f();
                if (f != null) {
                    i = f.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("FeedbackDetails(text=");
                k.append(this.f54881a);
                k.append(", canContinue=");
                k.append(this.f54882b);
                k.append(", failed=");
                k.append(this.f54883c);
                k.append(", delay=");
                k.append(this.f54884d);
                k.append(", experiments=");
                k.append(mo55272e());
                k.append(", veriff_sdk_version=");
                k.append(mo55274f());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21706x(String str, boolean z, List<String> list, Double d, List<C21711d> list2, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, MessageButton.TEXT);
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54881a = str;
                this.f54882b = z;
                this.f54883c = list;
                this.f54884d = d;
                this.f54885e = list2;
                this.f54886f = str2;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$InflowReport;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "timeElapsed", "", "reasons", "", "", "experiments", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getReasons", "getTimeElapsed", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVeriff_sdk_version", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/veriff/sdk/internal/analytics/Event$Additional$InflowReport;", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$y */
        public static final class C21707y extends C21668a {

            /* renamed from: a */
            private final Double f54887a;

            /* renamed from: b */
            private final List<String> f54888b;

            /* renamed from: c */
            private final List<C21711d> f54889c;

            /* renamed from: d */
            private final String f54890d;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21707y(Double d, List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(d, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? "3.17.0" : str);
            }

            /* renamed from: a */
            public static /* synthetic */ C21707y m52837a(C21707y yVar, Double d, List<String> list, List<C21711d> list2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = yVar.f54887a;
                }
                if ((i & 2) != 0) {
                    list = yVar.f54888b;
                }
                if ((i & 4) != 0) {
                    list2 = yVar.mo55280c();
                }
                if ((i & 8) != 0) {
                    str = yVar.mo55281d();
                }
                return yVar.mo55277a(d, list, list2, str);
            }

            /* renamed from: a */
            public final C21707y mo55277a(Double d, List<String> list, List<C21711d> list2, String str) {
                C24362h.m61211f(str, "veriff_sdk_version");
                return new C21707y(d, list, list2, str);
            }

            /* renamed from: a */
            public final Double mo55278a() {
                return this.f54887a;
            }

            /* renamed from: b */
            public final List<String> mo55279b() {
                return this.f54888b;
            }

            /* renamed from: c */
            public List<C21711d> mo55280c() {
                return this.f54889c;
            }

            /* renamed from: d */
            public String mo55281d() {
                return this.f54890d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21707y)) {
                    return false;
                }
                C21707y yVar = (C21707y) obj;
                return C24362h.m61206a(this.f54887a, yVar.f54887a) && C24362h.m61206a(this.f54888b, yVar.f54888b) && C24362h.m61206a(mo55280c(), yVar.mo55280c()) && C24362h.m61206a(mo55281d(), yVar.mo55281d());
            }

            public int hashCode() {
                Double d = this.f54887a;
                int i = 0;
                int hashCode = (d != null ? d.hashCode() : 0) * 31;
                List<String> list = this.f54888b;
                int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                List<C21711d> c = mo55280c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d2 = mo55281d();
                if (d2 != null) {
                    i = d2.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("InflowReport(timeElapsed=");
                k.append(this.f54887a);
                k.append(", reasons=");
                k.append(this.f54888b);
                k.append(", experiments=");
                k.append(mo55280c());
                k.append(", veriff_sdk_version=");
                k.append(mo55281d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21707y(Double d, List<String> list, List<C21711d> list2, String str) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "veriff_sdk_version");
                this.f54887a = d;
                this.f54888b = list;
                this.f54889c = list2;
                this.f54890d = str;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006$"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$LanguageAssigned;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "language", "", "preselectedType", "Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "(Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;)V", "preselected", "", "preselected_type", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;ZLcom/veriff/sdk/internal/analytics/Event$PreselectedType;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getLanguage", "()Ljava/lang/String;", "getPreselected", "()Z", "getPreselected_type", "()Lcom/veriff/sdk/internal/analytics/Event$PreselectedType;", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$z */
        public static final class C21708z extends C21668a {

            /* renamed from: a */
            private final String f54891a;

            /* renamed from: b */
            private final boolean f54892b;

            /* renamed from: c */
            private final C21714g f54893c;

            /* renamed from: d */
            private final List<C21711d> f54894d;

            /* renamed from: e */
            private final String f54895e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21708z(String str, boolean z, C21714g gVar, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, z, gVar, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "3.17.0" : str2);
            }

            /* renamed from: a */
            public static /* synthetic */ C21708z m52843a(C21708z zVar, String str, boolean z, C21714g gVar, List<C21711d> list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = zVar.f54891a;
                }
                if ((i & 2) != 0) {
                    z = zVar.f54892b;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    gVar = zVar.f54893c;
                }
                C21714g gVar2 = gVar;
                if ((i & 8) != 0) {
                    list = zVar.mo55289d();
                }
                List<C21711d> list2 = list;
                if ((i & 16) != 0) {
                    str2 = zVar.mo55290e();
                }
                return zVar.mo55285a(str, z2, gVar2, list2, str2);
            }

            /* renamed from: a */
            public final C21708z mo55285a(String str, boolean z, C21714g gVar, List<C21711d> list, String str2) {
                C24362h.m61211f(str, "language");
                C24362h.m61211f(str2, "veriff_sdk_version");
                return new C21708z(str, z, gVar, list, str2);
            }

            /* renamed from: a */
            public final String mo55286a() {
                return this.f54891a;
            }

            /* renamed from: b */
            public final boolean mo55287b() {
                return this.f54892b;
            }

            /* renamed from: c */
            public final C21714g mo55288c() {
                return this.f54893c;
            }

            /* renamed from: d */
            public List<C21711d> mo55289d() {
                return this.f54894d;
            }

            /* renamed from: e */
            public String mo55290e() {
                return this.f54895e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21708z)) {
                    return false;
                }
                C21708z zVar = (C21708z) obj;
                return C24362h.m61206a(this.f54891a, zVar.f54891a) && this.f54892b == zVar.f54892b && C24362h.m61206a(this.f54893c, zVar.f54893c) && C24362h.m61206a(mo55289d(), zVar.mo55289d()) && C24362h.m61206a(mo55290e(), zVar.mo55290e());
            }

            public int hashCode() {
                String str = this.f54891a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.f54892b;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode + (z ? 1 : 0)) * 31;
                C21714g gVar = this.f54893c;
                int hashCode2 = (i2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
                List<C21711d> d = mo55289d();
                int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
                String e = mo55290e();
                if (e != null) {
                    i = e.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("LanguageAssigned(language=");
                k.append(this.f54891a);
                k.append(", preselected=");
                k.append(this.f54892b);
                k.append(", preselected_type=");
                k.append(this.f54893c);
                k.append(", experiments=");
                k.append(mo55289d());
                k.append(", veriff_sdk_version=");
                k.append(mo55290e());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21708z(String str, boolean z, C21714g gVar, List<C21711d> list, String str2) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(str, "language");
                C24362h.m61211f(str2, "veriff_sdk_version");
                this.f54891a = str;
                this.f54892b = z;
                this.f54893c = gVar;
                this.f54894d = list;
                this.f54895e = str2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C21708z(String str, C21714g gVar) {
                this(str, gVar != null, gVar, (List) null, (String) null, 24, (DefaultConstructorMarker) null);
                C24362h.m61211f(str, "language");
            }
        }

        private C21668a() {
        }

        public /* synthetic */ C21668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressFileSelected;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "flow_type", "", "file_type", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFile_type", "()Ljava/lang/String;", "getFlow_type", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$a */
        public static final class C21669a extends C21668a {

            /* renamed from: a */
            private final String f54740a;

            /* renamed from: b */
            private final String f54741b;

            /* renamed from: c */
            private final List<C21711d> f54742c;

            /* renamed from: d */
            private final String f54743d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21669a(String str, String str2, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C13437d.m33711q(str, "flow_type", str2, "file_type", str3, "veriff_sdk_version");
                this.f54740a = str;
                this.f54741b = str2;
                this.f54742c = list;
                this.f54743d = str3;
            }

            /* renamed from: a */
            public static /* synthetic */ C21669a m52618a(C21669a aVar, String str, String str2, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f54740a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f54741b;
                }
                if ((i & 4) != 0) {
                    list = aVar.mo54981c();
                }
                if ((i & 8) != 0) {
                    str3 = aVar.mo54982d();
                }
                return aVar.mo54978a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final C21669a mo54978a(String str, String str2, List<C21711d> list, String str3) {
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "file_type");
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21669a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final String mo54979a() {
                return this.f54740a;
            }

            /* renamed from: b */
            public final String mo54980b() {
                return this.f54741b;
            }

            /* renamed from: c */
            public List<C21711d> mo54981c() {
                return this.f54742c;
            }

            /* renamed from: d */
            public String mo54982d() {
                return this.f54743d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21669a)) {
                    return false;
                }
                C21669a aVar = (C21669a) obj;
                return C24362h.m61206a(this.f54740a, aVar.f54740a) && C24362h.m61206a(this.f54741b, aVar.f54741b) && C24362h.m61206a(mo54981c(), aVar.mo54981c()) && C24362h.m61206a(mo54982d(), aVar.mo54982d());
            }

            public int hashCode() {
                String str = this.f54740a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54741b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List<C21711d> c = mo54981c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo54982d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AddressFileSelected(flow_type=");
                k.append(this.f54740a);
                k.append(", file_type=");
                k.append(this.f54741b);
                k.append(", experiments=");
                k.append(mo54981c());
                k.append(", veriff_sdk_version=");
                k.append(mo54982d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21669a(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str3);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$AddressFileUploaded;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "flow_type", "", "file_type", "upload_time", "", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)V", "getExperiments", "()Ljava/util/List;", "getFile_type", "()Ljava/lang/String;", "getFlow_type", "getUpload_time", "()J", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$b */
        public static final class C21684b extends C21668a {

            /* renamed from: a */
            private final String f54797a;

            /* renamed from: b */
            private final String f54798b;

            /* renamed from: c */
            private final long f54799c;

            /* renamed from: d */
            private final List<C21711d> f54800d;

            /* renamed from: e */
            private final String f54801e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21684b(String str, String str2, long j, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C13437d.m33711q(str, "flow_type", str2, "file_type", str3, "veriff_sdk_version");
                this.f54797a = str;
                this.f54798b = str2;
                this.f54799c = j;
                this.f54800d = list;
                this.f54801e = str3;
            }

            /* renamed from: a */
            public static /* synthetic */ C21684b m52705a(C21684b bVar, String str, String str2, long j, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f54797a;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f54798b;
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    j = bVar.f54799c;
                }
                long j2 = j;
                if ((i & 8) != 0) {
                    list = bVar.mo55099d();
                }
                List<C21711d> list2 = list;
                if ((i & 16) != 0) {
                    str3 = bVar.mo55100e();
                }
                return bVar.mo55095a(str, str4, j2, list2, str3);
            }

            /* renamed from: a */
            public final C21684b mo55095a(String str, String str2, long j, List<C21711d> list, String str3) {
                C24362h.m61211f(str, "flow_type");
                C24362h.m61211f(str2, "file_type");
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21684b(str, str2, j, list, str3);
            }

            /* renamed from: a */
            public final String mo55096a() {
                return this.f54797a;
            }

            /* renamed from: b */
            public final String mo55097b() {
                return this.f54798b;
            }

            /* renamed from: c */
            public final long mo55098c() {
                return this.f54799c;
            }

            /* renamed from: d */
            public List<C21711d> mo55099d() {
                return this.f54800d;
            }

            /* renamed from: e */
            public String mo55100e() {
                return this.f54801e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21684b)) {
                    return false;
                }
                C21684b bVar = (C21684b) obj;
                return C24362h.m61206a(this.f54797a, bVar.f54797a) && C24362h.m61206a(this.f54798b, bVar.f54798b) && this.f54799c == bVar.f54799c && C24362h.m61206a(mo55099d(), bVar.mo55099d()) && C24362h.m61206a(mo55100e(), bVar.mo55100e());
            }

            public int hashCode() {
                String str = this.f54797a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54798b;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                long j = this.f54799c;
                int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                List<C21711d> d = mo55099d();
                int hashCode3 = (i2 + (d != null ? d.hashCode() : 0)) * 31;
                String e = mo55100e();
                if (e != null) {
                    i = e.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AddressFileUploaded(flow_type=");
                k.append(this.f54797a);
                k.append(", file_type=");
                k.append(this.f54798b);
                k.append(", upload_time=");
                k.append(this.f54799c);
                k.append(", experiments=");
                k.append(mo55099d());
                k.append(", veriff_sdk_version=");
                k.append(mo55100e());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21684b(String str, String str2, long j, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, j, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "3.17.0" : str3);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bB3\b\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\nHÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\f\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/Event$Additional$ErrorScreen;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "data", "Lcom/veriff/sdk/internal/analytics/AnalyticsConstants$ErrorData;", "(Lcom/veriff/sdk/internal/analytics/AnalyticsConstants$ErrorData;)V", "experiments", "", "Lcom/veriff/sdk/internal/analytics/Event$Experiment;", "(Lcom/veriff/sdk/internal/analytics/AnalyticsConstants$ErrorData;Ljava/util/List;)V", "severity", "", "error", "veriff_sdk_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "getSeverity", "getVeriff_sdk_version", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.gf$a$v */
        public static final class C21704v extends C21668a {

            /* renamed from: a */
            private final String f54874a;

            /* renamed from: b */
            private final String f54875b;

            /* renamed from: c */
            private final List<C21711d> f54876c;

            /* renamed from: d */
            private final String f54877d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21704v(String str, String str2, List<C21711d> list, String str3) {
                super((DefaultConstructorMarker) null);
                C13437d.m33711q(str, "severity", str2, "error", str3, "veriff_sdk_version");
                this.f54874a = str;
                this.f54875b = str2;
                this.f54876c = list;
                this.f54877d = str3;
            }

            /* renamed from: a */
            public static /* synthetic */ C21704v m52818a(C21704v vVar, String str, String str2, List<C21711d> list, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = vVar.f54874a;
                }
                if ((i & 2) != 0) {
                    str2 = vVar.f54875b;
                }
                if ((i & 4) != 0) {
                    list = vVar.mo55255c();
                }
                if ((i & 8) != 0) {
                    str3 = vVar.mo55256d();
                }
                return vVar.mo55252a(str, str2, list, str3);
            }

            /* renamed from: a */
            public final C21704v mo55252a(String str, String str2, List<C21711d> list, String str3) {
                C24362h.m61211f(str, "severity");
                C24362h.m61211f(str2, "error");
                C24362h.m61211f(str3, "veriff_sdk_version");
                return new C21704v(str, str2, list, str3);
            }

            /* renamed from: a */
            public final String mo55253a() {
                return this.f54874a;
            }

            /* renamed from: b */
            public final String mo55254b() {
                return this.f54875b;
            }

            /* renamed from: c */
            public List<C21711d> mo55255c() {
                return this.f54876c;
            }

            /* renamed from: d */
            public String mo55256d() {
                return this.f54877d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21704v)) {
                    return false;
                }
                C21704v vVar = (C21704v) obj;
                return C24362h.m61206a(this.f54874a, vVar.f54874a) && C24362h.m61206a(this.f54875b, vVar.f54875b) && C24362h.m61206a(mo55255c(), vVar.mo55255c()) && C24362h.m61206a(mo55256d(), vVar.mo55256d());
            }

            public int hashCode() {
                String str = this.f54874a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f54875b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                List<C21711d> c = mo55255c();
                int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
                String d = mo55256d();
                if (d != null) {
                    i = d.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ErrorScreen(severity=");
                k.append(this.f54874a);
                k.append(", error=");
                k.append(this.f54875b);
                k.append(", experiments=");
                k.append(mo55255c());
                k.append(", veriff_sdk_version=");
                k.append(mo55256d());
                k.append(")");
                return k.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21704v(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "3.17.0" : str3);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C21704v(com.veriff.sdk.internal.C21647fv.C21648a r9) {
                /*
                    r8 = this;
                    java.lang.String r0 = "data"
                    mf0.C24362h.m61211f(r9, r0)
                    com.veriff.sdk.internal.fv$b r0 = r9.f54682m
                    java.lang.String r2 = r0.f54687d
                    java.lang.String r0 = "data.severity.type"
                    mf0.C24362h.m61210e(r2, r0)
                    java.lang.String r3 = r9.f54681l
                    java.lang.String r9 = "data.errorName"
                    mf0.C24362h.m61210e(r3, r9)
                    r4 = 0
                    r5 = 0
                    r6 = 12
                    r7 = 0
                    r1 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21667gf.C21668a.C21704v.<init>(com.veriff.sdk.internal.fv$a):void");
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C21704v(com.veriff.sdk.internal.C21647fv.C21648a r9, java.util.List<com.veriff.sdk.internal.C21667gf.C21711d> r10) {
                /*
                    r8 = this;
                    java.lang.String r0 = "data"
                    mf0.C24362h.m61211f(r9, r0)
                    com.veriff.sdk.internal.fv$b r0 = r9.f54682m
                    java.lang.String r2 = r0.f54687d
                    java.lang.String r0 = "data.severity.type"
                    mf0.C24362h.m61210e(r2, r0)
                    java.lang.String r3 = r9.f54681l
                    java.lang.String r9 = "data.errorName"
                    mf0.C24362h.m61210e(r3, r9)
                    r5 = 0
                    r6 = 8
                    r7 = 0
                    r1 = r8
                    r4 = r10
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21667gf.C21668a.C21704v.<init>(com.veriff.sdk.internal.fv$a, java.util.List):void");
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21667gf(String str, String str2, String str3, C21668a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? new C21668a.C21702t((List) null, (String) null, 3, (DefaultConstructorMarker) null) : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21667gf(String str, String str2, String str3, C21668a aVar) {
        this("mobile", "isSDKAndroid", str, str3, aVar, str2, C21718gh.m52972b());
        C24362h.m61211f(str, "name");
        C24362h.m61211f(aVar, "additional");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21667gf(String str, C21668a aVar) {
        this(str, (String) null, (String) null, aVar);
        C24362h.m61211f(str, "name");
        C24362h.m61211f(aVar, "additional");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21667gf(String str, String str2, String str3, String str4) {
        this(str, str2, str3, (C21668a) new C21668a.C21670aa(str4, (List) null, (String) null, 6, (DefaultConstructorMarker) null));
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "type");
        C24362h.m61211f(str3, "feature");
        C24362h.m61211f(str4, InAppMessageBase.MESSAGE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21667gf(String str, String str2, String str3, List<C21711d> list) {
        this(str, str2, str3, (C21668a) new C21668a.C21702t(list, (String) null, 2, (DefaultConstructorMarker) null));
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "type");
        C24362h.m61211f(str3, "feature");
        C24362h.m61211f(list, "experiments");
    }
}
