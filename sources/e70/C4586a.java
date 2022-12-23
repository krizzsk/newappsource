package e70;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.moovit.commons.request.ServerException;
import com.moovit.sdk.requests.UploadDataType;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import p786rz.C19387a;
import p906wz.C20431c;
import p906wz.C20436g;
import v70.C13177m;
import v70.C13181q;
import v70.C13182r;

/* renamed from: e70.a */
public final class C4586a {

    /* renamed from: e70.a$a */
    public static class C4587a extends C20431c<C4587a, C4588b> {

        /* renamed from: q */
        public final File f15769q;

        public C4587a(Context context, File file, String str) {
            super(context, Uri.parse(str), true, C4588b.class);
            this.f15769q = file;
        }

        /* renamed from: K */
        public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
            C19387a.m46671c(new FileInputStream(this.f15769q), bufferedOutputStream);
        }

        /* renamed from: t */
        public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
            super.mo20116t(httpURLConnection);
            httpURLConnection.setRequestMethod("PUT");
            httpURLConnection.addRequestProperty(HttpHeader.CONTENT_LENGTH, String.valueOf(this.f15769q.length()));
            httpURLConnection.setRequestProperty("x-amz-acl", "bucket-owner-full-control");
        }
    }

    /* renamed from: e70.a$b */
    public static class C4588b extends C20436g<C4587a, C4588b> {
    }

    /* renamed from: a */
    public static void m11899a(File file, C13177m mVar, UploadDataType uploadDataType) throws IOException, ServerException {
        new C4587a(mVar.f32719a, file, ((C13182r) new C13181q(mVar, uploadDataType).mo52626J()).f32726f).mo52626J();
    }

    /* renamed from: b */
    public static void m11900b(File file, C13177m mVar, UploadDataType uploadDataType, long j, long j2, long j3, List list) throws IOException, ServerException {
        File file2 = file;
        new C4587a(mVar.f32719a, file, ((C13182r) new C13181q(mVar, uploadDataType, j, j2, j3, list).mo52626J()).f32726f).mo52626J();
    }
}
