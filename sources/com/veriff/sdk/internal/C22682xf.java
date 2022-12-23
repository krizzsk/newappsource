package com.veriff.sdk.internal;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'¨\u0006\f"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileResolver;", "", "getType", "", "uri", "Landroid/net/Uri;", "saveAsFile", "Ljava/io/File;", "fileName", "maxFileSizeMB", "", "FileSizeExceededException", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xf */
public interface C22682xf {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileResolver$FileSizeExceededException;", "Ljava/io/IOException;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xf$a */
    public static final class C22683a extends IOException {

        /* renamed from: a */
        private final String f57336a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22683a(String str) {
            super(str);
            C24362h.m61211f(str, "msg");
            this.f57336a = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C22683a) && C24362h.m61206a(this.f57336a, ((C22683a) obj).f57336a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f57336a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0016g.m31o(C13555b.m33972k("FileSizeExceededException(msg="), this.f57336a, ")");
        }
    }

    /* renamed from: a */
    File mo57066a(Uri uri, String str, int i) throws IOException;

    /* renamed from: a */
    String mo57067a(Uri uri);
}
