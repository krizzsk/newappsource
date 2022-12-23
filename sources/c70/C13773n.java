package c70;

import c70.C13773n;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20436g;

/* renamed from: c70.n */
public abstract class C13773n<RS extends C13773n<RS>> extends C20436g<C13772m<RS>, RS> {
    /* renamed from: d */
    public void mo40052c(C13772m<RS> mVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        String headerField = httpURLConnection.getHeaderField("x-amz-meta-max_revision");
        if (headerField != null) {
            Long.parseLong(headerField);
        }
        super.mo40052c(mVar, httpURLConnection, bufferedInputStream);
    }
}
