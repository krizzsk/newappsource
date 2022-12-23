package com.veriff.sdk.internal;

import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.internal.C22561tq;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "", "()V", "Close", "Done", "Loading", "Retry", "Summary", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Done;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Loading;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Retry;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Close;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Summary;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public abstract class qn$b {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Close;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qn$b$a */
    public static final class C22331a extends qn$b {

        /* renamed from: a */
        public static final C22331a f56336a = new C22331a();

        private C22331a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Done;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qn$b$b */
    public static final class C22332b extends qn$b {

        /* renamed from: a */
        public static final C22332b f56337a = new C22332b();

        private C22332b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Loading;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qn$b$c */
    public static final class C22333c extends qn$b {

        /* renamed from: a */
        public static final C22333c f56338a = new C22333c();

        private C22333c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Retry;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "step", "Lcom/veriff/sdk/internal/data/FlowStep;", "confirmedInflowSteps", "", "(Lcom/veriff/sdk/internal/data/FlowStep;Ljava/util/List;)V", "getConfirmedInflowSteps", "()Ljava/util/List;", "getStep", "()Lcom/veriff/sdk/internal/data/FlowStep;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qn$b$d */
    public static final class C22334d extends qn$b {

        /* renamed from: a */
        private final C21791iy f56339a;

        /* renamed from: b */
        private final List<C21791iy> f56340b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22334d(C21791iy iyVar, List<? extends C21791iy> list) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(iyVar, "step");
            C24362h.m61211f(list, "confirmedInflowSteps");
            this.f56339a = iyVar;
            this.f56340b = list;
        }

        /* renamed from: a */
        public final C21791iy mo56340a() {
            return this.f56339a;
        }

        /* renamed from: b */
        public final List<C21791iy> mo56341b() {
            return this.f56340b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22334d)) {
                return false;
            }
            C22334d dVar = (C22334d) obj;
            return C24362h.m61206a(this.f56339a, dVar.f56339a) && C24362h.m61206a(this.f56340b, dVar.f56340b);
        }

        public int hashCode() {
            C21791iy iyVar = this.f56339a;
            int i = 0;
            int hashCode = (iyVar != null ? iyVar.hashCode() : 0) * 31;
            List<C21791iy> list = this.f56340b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Retry(step=");
            k.append(this.f56339a);
            k.append(", confirmedInflowSteps=");
            k.append(this.f56340b);
            k.append(")");
            return k.toString();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\fHÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState$Summary;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "file", "Ljava/io/File;", "step", "Lcom/veriff/sdk/internal/data/FlowStep;", "isFirstTry", "", "feedback", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "failed", "", "", "(Ljava/io/File;Lcom/veriff/sdk/internal/data/FlowStep;ZLmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;Ljava/util/List;)V", "getFailed", "()Ljava/util/List;", "getFeedback", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "getFile", "()Ljava/io/File;", "()Z", "getStep", "()Lcom/veriff/sdk/internal/data/FlowStep;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qn$b$e */
    public static final class C22335e extends qn$b {

        /* renamed from: a */
        private final File f56341a;

        /* renamed from: b */
        private final C21791iy f56342b;

        /* renamed from: c */
        private final boolean f56343c;

        /* renamed from: d */
        private final C22561tq.C22563b f56344d;

        /* renamed from: e */
        private final List<String> f56345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22335e(File file, C21791iy iyVar, boolean z, C22561tq.C22563b bVar, List<String> list) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
            C24362h.m61211f(iyVar, "step");
            C24362h.m61211f(bVar, "feedback");
            this.f56341a = file;
            this.f56342b = iyVar;
            this.f56343c = z;
            this.f56344d = bVar;
            this.f56345e = list;
        }

        /* renamed from: a */
        public final File mo56345a() {
            return this.f56341a;
        }

        /* renamed from: b */
        public final C21791iy mo56346b() {
            return this.f56342b;
        }

        /* renamed from: c */
        public final boolean mo56347c() {
            return this.f56343c;
        }

        /* renamed from: d */
        public final C22561tq.C22563b mo56348d() {
            return this.f56344d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22335e)) {
                return false;
            }
            C22335e eVar = (C22335e) obj;
            return C24362h.m61206a(this.f56341a, eVar.f56341a) && C24362h.m61206a(this.f56342b, eVar.f56342b) && this.f56343c == eVar.f56343c && C24362h.m61206a(this.f56344d, eVar.f56344d) && C24362h.m61206a(this.f56345e, eVar.f56345e);
        }

        public int hashCode() {
            File file = this.f56341a;
            int i = 0;
            int hashCode = (file != null ? file.hashCode() : 0) * 31;
            C21791iy iyVar = this.f56342b;
            int hashCode2 = (hashCode + (iyVar != null ? iyVar.hashCode() : 0)) * 31;
            boolean z = this.f56343c;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            C22561tq.C22563b bVar = this.f56344d;
            int hashCode3 = (i2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            List<String> list = this.f56345e;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Summary(file=");
            k.append(this.f56341a);
            k.append(", step=");
            k.append(this.f56342b);
            k.append(", isFirstTry=");
            k.append(this.f56343c);
            k.append(", feedback=");
            k.append(this.f56344d);
            k.append(", failed=");
            k.append(this.f56345e);
            k.append(")");
            return k.toString();
        }
    }

    private qn$b() {
    }

    public /* synthetic */ qn$b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
