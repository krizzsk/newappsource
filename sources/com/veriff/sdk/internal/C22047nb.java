package com.veriff.sdk.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaStorage;", "", "createFile", "Ljava/io/File;", "fileName", "", "saveFile", "bytes", "", "saveFileStream", "inputStream", "Ljava/io/InputStream;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nb */
public interface C22047nb {
    /* renamed from: a */
    File mo55862a(InputStream inputStream, String str) throws IOException;

    /* renamed from: a */
    File mo55863a(String str);

    /* renamed from: a */
    File mo55864a(byte[] bArr, String str) throws IOException;
}
