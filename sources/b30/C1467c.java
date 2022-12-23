package b30;

import c70.C13772m;
import c70.C13773n;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p786rz.C19387a;
import p906wz.C20431c;

/* renamed from: b30.c */
public final class C1467c extends C13773n<C1467c> {

    /* renamed from: f */
    public byte[] f5337f;

    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C13772m mVar = (C13772m) cVar;
        this.f5337f = C19387a.m46672d(bufferedInputStream);
    }
}
