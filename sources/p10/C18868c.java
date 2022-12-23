package p10;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p786rz.C19387a;
import p906wz.C20431c;

/* renamed from: p10.c */
public final class C18868c extends C20431c<C18868c, C18869d> {

    /* renamed from: q */
    public final File f48039q;

    public C18868c(Context context, File file, String str) {
        super(context, Uri.parse(str), true, C18869d.class);
        this.f48039q = file;
    }

    /* renamed from: K */
    public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
        C19387a.m46671c(new FileInputStream(this.f48039q), bufferedOutputStream);
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestMethod("PUT");
        httpURLConnection.addRequestProperty(HttpHeader.CONTENT_LENGTH, String.valueOf(this.f48039q.length()));
        httpURLConnection.setRequestProperty("x-amz-acl", "bucket-owner-full-control");
    }
}
