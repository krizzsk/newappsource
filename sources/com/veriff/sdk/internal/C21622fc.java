package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/FileAdapter;", "Lcom/squareup/moshi/k;", "Ljava/io/File;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fc */
public final class C21622fc extends C21420av<File> {
    /* renamed from: b */
    public File mo54204a(C21430ba baVar) {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (File) baVar.mo54253l();
        }
        return new File(baVar.mo54251j());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, File file) {
        C24362h.m61211f(bfVar, "writer");
        bfVar.mo54272b(file != null ? file.getAbsolutePath() : null);
    }
}
