package com.veriff.sdk.internal;

import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;", "Lmobi/lab/veriff/data/api/request/payload/UploadMetadata;", "timestamp", "Ljava/util/Date;", "duration", "", "context", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "(Ljava/util/Date;JLmobi/lab/veriff/data/api/request/payload/VideoContext;)V", "getContext", "()Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "getDuration", "()J", "getTimestamp", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ti */
public final class C22551ti implements C22548tf {

    /* renamed from: a */
    private final Date f56906a;

    /* renamed from: b */
    private final long f56907b;

    /* renamed from: c */
    private final C22549tg f56908c;

    public C22551ti(Date date, long j, C22549tg tgVar) {
        C24362h.m61211f(date, "timestamp");
        C24362h.m61211f(tgVar, AppActionRequest.KEY_CONTEXT);
        this.f56906a = date;
        this.f56907b = j;
        this.f56908c = tgVar;
    }

    /* renamed from: a */
    public final Date mo56708a() {
        return this.f56906a;
    }

    /* renamed from: b */
    public final long mo56709b() {
        return this.f56907b;
    }

    /* renamed from: c */
    public final C22549tg mo56710c() {
        return this.f56908c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22551ti)) {
            return false;
        }
        C22551ti tiVar = (C22551ti) obj;
        return C24362h.m61206a(this.f56906a, tiVar.f56906a) && this.f56907b == tiVar.f56907b && C24362h.m61206a(this.f56908c, tiVar.f56908c);
    }

    public int hashCode() {
        Date date = this.f56906a;
        int i = 0;
        int hashCode = date != null ? date.hashCode() : 0;
        long j = this.f56907b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C22549tg tgVar = this.f56908c;
        if (tgVar != null) {
            i = tgVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VideoMetadata(timestamp=");
        k.append(this.f56906a);
        k.append(", duration=");
        k.append(this.f56907b);
        k.append(", context=");
        k.append(this.f56908c);
        k.append(")");
        return k.toString();
    }
}
