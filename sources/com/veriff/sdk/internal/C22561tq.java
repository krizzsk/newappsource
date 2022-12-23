package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;
import uh0.C25081h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "", "success", "", "failed", "", "", "feedback", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "mrz", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "(ZLjava/util/List;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;)V", "getFailed", "()Ljava/util/List;", "getFeedback", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "getMrz", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hasFeedback", "hashCode", "", "toString", "Companion", "Feedback", "Mrz", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tq */
public final class C22561tq {

    /* renamed from: b */
    private final boolean f56927b;

    /* renamed from: c */
    private final List<String> f56928c;

    /* renamed from: d */
    private final C22563b f56929d;

    /* renamed from: e */
    private final C22566c f56930e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Companion;", "", "()V", "inflowHasFeedback", "", "response", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.tq$a */
    public static final class C22562a {
        private C22562a() {
        }

        public /* synthetic */ C22562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "", "title", "", "question", "sentence", "images", "", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getQuestion", "()Ljava/lang/String;", "getSentence", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Image", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.tq$b */
    public static final class C22563b {

        /* renamed from: a */
        private final String f56931a;

        /* renamed from: b */
        private final String f56932b;

        /* renamed from: c */
        private final String f56933c;

        /* renamed from: d */
        private final List<C22564a> f56934d;

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image;", "", "path", "", "meaning", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;", "(Ljava/lang/String;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;)V", "getMeaning", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Meaning", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.tq$b$a */
        public static final class C22564a {

            /* renamed from: a */
            private final String f56935a;

            /* renamed from: b */
            private final C22565a f56936b;

            @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image$Meaning;", "", "(Ljava/lang/String;I)V", "OK", "NOK", "UNKNOWN", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.tq$b$a$a */
            public enum C22565a {
                f56937a,
                NOK,
                UNKNOWN
            }

            public C22564a(String str, C22565a aVar) {
                this.f56935a = str;
                this.f56936b = aVar;
            }

            /* renamed from: a */
            public final String mo56778a() {
                return this.f56935a;
            }

            /* renamed from: b */
            public final C22565a mo56779b() {
                return this.f56936b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C22564a)) {
                    return false;
                }
                C22564a aVar = (C22564a) obj;
                return C24362h.m61206a(this.f56935a, aVar.f56935a) && C24362h.m61206a(this.f56936b, aVar.f56936b);
            }

            public int hashCode() {
                String str = this.f56935a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                C22565a aVar = this.f56936b;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Image(path=");
                k.append(this.f56935a);
                k.append(", meaning=");
                k.append(this.f56936b);
                k.append(")");
                return k.toString();
            }
        }

        public C22563b() {
            this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        public C22563b(String str, String str2, String str3, List<C22564a> list) {
            this.f56931a = str;
            this.f56932b = str2;
            this.f56933c = str3;
            this.f56934d = list;
        }

        /* renamed from: a */
        public final C22563b mo56770a(String str, String str2, String str3, List<C22564a> list) {
            return new C22563b(str, str2, str3, list);
        }

        /* renamed from: a */
        public final String mo56771a() {
            return this.f56931a;
        }

        /* renamed from: b */
        public final String mo56772b() {
            return this.f56932b;
        }

        /* renamed from: c */
        public final String mo56773c() {
            return this.f56933c;
        }

        /* renamed from: d */
        public final List<C22564a> mo56774d() {
            return this.f56934d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22563b)) {
                return false;
            }
            C22563b bVar = (C22563b) obj;
            return C24362h.m61206a(this.f56931a, bVar.f56931a) && C24362h.m61206a(this.f56932b, bVar.f56932b) && C24362h.m61206a(this.f56933c, bVar.f56933c) && C24362h.m61206a(this.f56934d, bVar.f56934d);
        }

        public int hashCode() {
            String str = this.f56931a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f56932b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f56933c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<C22564a> list = this.f56934d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Feedback(title=");
            k.append(this.f56931a);
            k.append(", question=");
            k.append(this.f56932b);
            k.append(", sentence=");
            k.append(this.f56933c);
            k.append(", images=");
            k.append(this.f56934d);
            k.append(")");
            return k.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22563b(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "", "values", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values;", "confidence", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence;", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence;)V", "getConfidence", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence;", "documenExpiresAtConfidence", "", "getDocumenExpiresAtConfidence", "()Ljava/lang/Double;", "documentNumberConfidence", "getDocumentNumberConfidence", "personDateOfBirthConfidence", "getPersonDateOfBirthConfidence", "getValues", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Confidence", "Values", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.tq$c */
    public static final class C22566c {

        /* renamed from: a */
        private final C22570b f56941a;

        /* renamed from: b */
        private final C22567a f56942b;

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence;", "", "person", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;", "document", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;)V", "getDocument", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;", "getPerson", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Document", "Person", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.tq$c$a */
        public static final class C22567a {

            /* renamed from: a */
            private final C22569b f56943a;

            /* renamed from: b */
            private final C22568a f56944b;

            @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;", "", "number", "", "expiresAt", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getExpiresAt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNumber", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Document;", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.tq$c$a$a */
            public static final class C22568a {

                /* renamed from: a */
                private final Double f56945a;

                /* renamed from: b */
                private final Double f56946b;

                public C22568a(Double d, Double d2) {
                    this.f56945a = d;
                    this.f56946b = d2;
                }

                /* renamed from: a */
                public final Double mo56796a() {
                    return this.f56945a;
                }

                /* renamed from: b */
                public final Double mo56797b() {
                    return this.f56946b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C22568a)) {
                        return false;
                    }
                    C22568a aVar = (C22568a) obj;
                    return C24362h.m61206a(this.f56945a, aVar.f56945a) && C24362h.m61206a(this.f56946b, aVar.f56946b);
                }

                public int hashCode() {
                    Double d = this.f56945a;
                    int i = 0;
                    int hashCode = (d != null ? d.hashCode() : 0) * 31;
                    Double d2 = this.f56946b;
                    if (d2 != null) {
                        i = d2.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    StringBuilder k = C13555b.m33972k("Document(number=");
                    k.append(this.f56945a);
                    k.append(", expiresAt=");
                    k.append(this.f56946b);
                    k.append(")");
                    return k.toString();
                }
            }

            @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;", "", "dateOfBirth", "", "(Ljava/lang/Double;)V", "getDateOfBirth", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "copy", "(Ljava/lang/Double;)Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Confidence$Person;", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.tq$c$a$b */
            public static final class C22569b {

                /* renamed from: a */
                private final Double f56947a;

                public C22569b(Double d) {
                    this.f56947a = d;
                }

                /* renamed from: a */
                public final Double mo56801a() {
                    return this.f56947a;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof C22569b) && C24362h.m61206a(this.f56947a, ((C22569b) obj).f56947a);
                    }
                    return true;
                }

                public int hashCode() {
                    Double d = this.f56947a;
                    if (d != null) {
                        return d.hashCode();
                    }
                    return 0;
                }

                public String toString() {
                    StringBuilder k = C13555b.m33972k("Person(dateOfBirth=");
                    k.append(this.f56947a);
                    k.append(")");
                    return k.toString();
                }
            }

            public C22567a(C22569b bVar, C22568a aVar) {
                this.f56943a = bVar;
                this.f56944b = aVar;
            }

            /* renamed from: a */
            public final C22569b mo56791a() {
                return this.f56943a;
            }

            /* renamed from: b */
            public final C22568a mo56792b() {
                return this.f56944b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C22567a)) {
                    return false;
                }
                C22567a aVar = (C22567a) obj;
                return C24362h.m61206a(this.f56943a, aVar.f56943a) && C24362h.m61206a(this.f56944b, aVar.f56944b);
            }

            public int hashCode() {
                C22569b bVar = this.f56943a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                C22568a aVar = this.f56944b;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Confidence(person=");
                k.append(this.f56943a);
                k.append(", document=");
                k.append(this.f56944b);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values;", "", "person", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Person;", "document", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Document;", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Person;Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Document;)V", "getDocument", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Document;", "getPerson", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Person;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Document", "Person", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.tq$c$b */
        public static final class C22570b {

            /* renamed from: a */
            private final C22572b f56948a;

            /* renamed from: b */
            private final C22571a f56949b;

            @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Document;", "", "number", "", "expiresAt", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpiresAt", "()Ljava/lang/String;", "getNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.tq$c$b$a */
            public static final class C22571a {

                /* renamed from: a */
                private final String f56950a;

                /* renamed from: b */
                private final String f56951b;

                public C22571a(String str, String str2) {
                    this.f56950a = str;
                    this.f56951b = str2;
                }

                /* renamed from: a */
                public final String mo56810a() {
                    return this.f56950a;
                }

                /* renamed from: b */
                public final String mo56811b() {
                    return this.f56951b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C22571a)) {
                        return false;
                    }
                    C22571a aVar = (C22571a) obj;
                    return C24362h.m61206a(this.f56950a, aVar.f56950a) && C24362h.m61206a(this.f56951b, aVar.f56951b);
                }

                public int hashCode() {
                    String str = this.f56950a;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.f56951b;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    StringBuilder k = C13555b.m33972k("Document(number=");
                    k.append(this.f56950a);
                    k.append(", expiresAt=");
                    return C0016g.m31o(k, this.f56951b, ")");
                }
            }

            @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz$Values$Person;", "", "dateOfBirth", "", "(Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
            /* renamed from: com.veriff.sdk.internal.tq$c$b$b */
            public static final class C22572b {

                /* renamed from: a */
                private final String f56952a;

                public C22572b(String str) {
                    this.f56952a = str;
                }

                /* renamed from: a */
                public final String mo56815a() {
                    return this.f56952a;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof C22572b) && C24362h.m61206a(this.f56952a, ((C22572b) obj).f56952a);
                    }
                    return true;
                }

                public int hashCode() {
                    String str = this.f56952a;
                    if (str != null) {
                        return str.hashCode();
                    }
                    return 0;
                }

                public String toString() {
                    return C0016g.m31o(C13555b.m33972k("Person(dateOfBirth="), this.f56952a, ")");
                }
            }

            public C22570b(C22572b bVar, C22571a aVar) {
                this.f56948a = bVar;
                this.f56949b = aVar;
            }

            /* renamed from: a */
            public final C22572b mo56805a() {
                return this.f56948a;
            }

            /* renamed from: b */
            public final C22571a mo56806b() {
                return this.f56949b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C22570b)) {
                    return false;
                }
                C22570b bVar = (C22570b) obj;
                return C24362h.m61206a(this.f56948a, bVar.f56948a) && C24362h.m61206a(this.f56949b, bVar.f56949b);
            }

            public int hashCode() {
                C22572b bVar = this.f56948a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                C22571a aVar = this.f56949b;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Values(person=");
                k.append(this.f56948a);
                k.append(", document=");
                k.append(this.f56949b);
                k.append(")");
                return k.toString();
            }
        }

        public C22566c(C22570b bVar, C22567a aVar) {
            this.f56941a = bVar;
            this.f56942b = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            r2 = r2.mo56805a();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Double mo56783a() {
            /*
                r3 = this;
                com.veriff.sdk.internal.tq$c$a r0 = r3.f56942b
                r1 = 0
                if (r0 == 0) goto L_0x0033
                com.veriff.sdk.internal.tq$c$a$b r0 = r0.mo56791a()
                if (r0 == 0) goto L_0x0033
                java.lang.Double r0 = r0.mo56801a()
                if (r0 == 0) goto L_0x0033
                r0.doubleValue()
                com.veriff.sdk.internal.tq$c$b r2 = r3.f56941a
                if (r2 == 0) goto L_0x0023
                com.veriff.sdk.internal.tq$c$b$b r2 = r2.mo56805a()
                if (r2 == 0) goto L_0x0023
                java.lang.String r2 = r2.mo56815a()
                goto L_0x0024
            L_0x0023:
                r2 = r1
            L_0x0024:
                if (r2 == 0) goto L_0x002f
                boolean r2 = uh0.C25081h.m62831B(r2)
                if (r2 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r2 = 0
                goto L_0x0030
            L_0x002f:
                r2 = 1
            L_0x0030:
                if (r2 != 0) goto L_0x0033
                r1 = r0
            L_0x0033:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22561tq.C22566c.mo56783a():java.lang.Double");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            r2 = r2.mo56806b();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Double mo56784b() {
            /*
                r3 = this;
                com.veriff.sdk.internal.tq$c$a r0 = r3.f56942b
                r1 = 0
                if (r0 == 0) goto L_0x0033
                com.veriff.sdk.internal.tq$c$a$a r0 = r0.mo56792b()
                if (r0 == 0) goto L_0x0033
                java.lang.Double r0 = r0.mo56796a()
                if (r0 == 0) goto L_0x0033
                r0.doubleValue()
                com.veriff.sdk.internal.tq$c$b r2 = r3.f56941a
                if (r2 == 0) goto L_0x0023
                com.veriff.sdk.internal.tq$c$b$a r2 = r2.mo56806b()
                if (r2 == 0) goto L_0x0023
                java.lang.String r2 = r2.mo56810a()
                goto L_0x0024
            L_0x0023:
                r2 = r1
            L_0x0024:
                if (r2 == 0) goto L_0x002f
                boolean r2 = uh0.C25081h.m62831B(r2)
                if (r2 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r2 = 0
                goto L_0x0030
            L_0x002f:
                r2 = 1
            L_0x0030:
                if (r2 != 0) goto L_0x0033
                r1 = r0
            L_0x0033:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22561tq.C22566c.mo56784b():java.lang.Double");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            r2 = r2.mo56805a();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Double mo56785c() {
            /*
                r3 = this;
                com.veriff.sdk.internal.tq$c$a r0 = r3.f56942b
                r1 = 0
                if (r0 == 0) goto L_0x0033
                com.veriff.sdk.internal.tq$c$a$a r0 = r0.mo56792b()
                if (r0 == 0) goto L_0x0033
                java.lang.Double r0 = r0.mo56797b()
                if (r0 == 0) goto L_0x0033
                r0.doubleValue()
                com.veriff.sdk.internal.tq$c$b r2 = r3.f56941a
                if (r2 == 0) goto L_0x0023
                com.veriff.sdk.internal.tq$c$b$b r2 = r2.mo56805a()
                if (r2 == 0) goto L_0x0023
                java.lang.String r2 = r2.mo56815a()
                goto L_0x0024
            L_0x0023:
                r2 = r1
            L_0x0024:
                if (r2 == 0) goto L_0x002f
                boolean r2 = uh0.C25081h.m62831B(r2)
                if (r2 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r2 = 0
                goto L_0x0030
            L_0x002f:
                r2 = 1
            L_0x0030:
                if (r2 != 0) goto L_0x0033
                r1 = r0
            L_0x0033:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22561tq.C22566c.mo56785c():java.lang.Double");
        }

        /* renamed from: d */
        public final C22570b mo56786d() {
            return this.f56941a;
        }

        /* renamed from: e */
        public final C22567a mo56787e() {
            return this.f56942b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22566c)) {
                return false;
            }
            C22566c cVar = (C22566c) obj;
            return C24362h.m61206a(this.f56941a, cVar.f56941a) && C24362h.m61206a(this.f56942b, cVar.f56942b);
        }

        public int hashCode() {
            C22570b bVar = this.f56941a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C22567a aVar = this.f56942b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Mrz(values=");
            k.append(this.f56941a);
            k.append(", confidence=");
            k.append(this.f56942b);
            k.append(")");
            return k.toString();
        }
    }

    static {
        new C22562a((DefaultConstructorMarker) null);
    }

    public C22561tq() {
        this(false, (List) null, (C22563b) null, (C22566c) null, 15, (DefaultConstructorMarker) null);
    }

    public C22561tq(boolean z, List<String> list, C22563b bVar, C22566c cVar) {
        this.f56927b = z;
        this.f56928c = list;
        this.f56929d = bVar;
        this.f56930e = cVar;
    }

    /* renamed from: a */
    public final C22561tq mo56761a(boolean z, List<String> list, C22563b bVar, C22566c cVar) {
        return new C22561tq(z, list, bVar, cVar);
    }

    /* renamed from: a */
    public final boolean mo56762a() {
        C22563b bVar = this.f56929d;
        String str = null;
        String b = bVar != null ? bVar.mo56772b() : null;
        if (b == null || C25081h.m62831B(b)) {
            return false;
        }
        C22563b bVar2 = this.f56929d;
        if (bVar2 != null) {
            str = bVar2.mo56773c();
        }
        return !(str == null || C25081h.m62831B(str));
    }

    /* renamed from: b */
    public final boolean mo56763b() {
        return this.f56927b;
    }

    /* renamed from: c */
    public final List<String> mo56764c() {
        return this.f56928c;
    }

    /* renamed from: d */
    public final C22563b mo56765d() {
        return this.f56929d;
    }

    /* renamed from: e */
    public final C22566c mo56766e() {
        return this.f56930e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22561tq)) {
            return false;
        }
        C22561tq tqVar = (C22561tq) obj;
        return this.f56927b == tqVar.f56927b && C24362h.m61206a(this.f56928c, tqVar.f56928c) && C24362h.m61206a(this.f56929d, tqVar.f56929d) && C24362h.m61206a(this.f56930e, tqVar.f56930e);
    }

    public int hashCode() {
        boolean z = this.f56927b;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<String> list = this.f56928c;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        C22563b bVar = this.f56929d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C22566c cVar = this.f56930e;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("InflowResponse(success=");
        k.append(this.f56927b);
        k.append(", failed=");
        k.append(this.f56928c);
        k.append(", feedback=");
        k.append(this.f56929d);
        k.append(", mrz=");
        k.append(this.f56930e);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22561tq(boolean z, List list, C22563b bVar, C22566c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : cVar);
    }
}
