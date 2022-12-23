package com.veriff.sdk.internal;

import com.appboy.support.AppboyFileUtils;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/FileWithType;", "", "file", "Ljava/io/File;", "type", "", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ny */
public final class C22150ny {

    /* renamed from: a */
    private final File f55843a;

    /* renamed from: b */
    private final String f55844b;

    public C22150ny(File file, String str) {
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C24362h.m61211f(str, "type");
        this.f55843a = file;
        this.f55844b = str;
    }

    /* renamed from: a */
    public final File mo56066a() {
        return this.f55843a;
    }

    /* renamed from: b */
    public final String mo56067b() {
        return this.f55844b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22150ny)) {
            return false;
        }
        C22150ny nyVar = (C22150ny) obj;
        return C24362h.m61206a(this.f55843a, nyVar.f55843a) && C24362h.m61206a(this.f55844b, nyVar.f55844b);
    }

    public int hashCode() {
        File file = this.f55843a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f55844b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("FileWithType(file=");
        k.append(this.f55843a);
        k.append(", type=");
        return C0016g.m31o(k, this.f55844b, ")");
    }
}
