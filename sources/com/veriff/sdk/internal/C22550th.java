package com.veriff.sdk.internal;

import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\nHÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/VideoData;", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "timestamp", "Ljava/util/Date;", "duration", "", "context", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "(Ljava/util/Date;JLmobi/lab/veriff/data/api/request/payload/VideoContext;)V", "metadata", "Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;", "(Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;)V", "kind", "", "getKind", "()Ljava/lang/String;", "getMetadata", "()Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.th */
public final class C22550th extends C22547te {

    /* renamed from: a */
    private final String f56904a;

    /* renamed from: b */
    private final C22551ti f56905b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22550th(C22551ti tiVar) {
        super((DefaultConstructorMarker) null);
        C24362h.m61211f(tiVar, "metadata");
        this.f56905b = tiVar;
        this.f56904a = "videos";
    }

    /* renamed from: a */
    public String mo56687a() {
        return this.f56904a;
    }

    /* renamed from: b */
    public C22551ti mo56689c() {
        return this.f56905b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22550th) && C24362h.m61206a(mo56689c(), ((C22550th) obj).mo56689c());
        }
        return true;
    }

    public int hashCode() {
        C22551ti b = mo56689c();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VideoData(metadata=");
        k.append(mo56689c());
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22550th(Date date, long j, C22549tg tgVar) {
        this(new C22551ti(date, j, tgVar));
        C24362h.m61211f(date, "timestamp");
        C24362h.m61211f(tgVar, AppActionRequest.KEY_CONTEXT);
    }
}
