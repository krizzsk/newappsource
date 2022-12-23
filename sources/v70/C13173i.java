package v70;

import com.amazonaws.http.HttpHeader;
import com.moovit.commons.utils.ApplicationBugException;
import e70.C4590c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import v70.C13164b;
import v70.C13173i;

/* renamed from: v70.i */
public abstract class C13173i<RQ extends C13173i<RQ, RS>, RS extends C13164b<RQ, RS>> extends C13163a<RQ, RS> {

    /* renamed from: s */
    public static final Charset f32716s = Charset.forName("UTF-8");

    /* renamed from: r */
    public JSONObject f32717r;

    public C13173i(C13177m mVar, int i, int i2) {
        super(mVar, i, i2, C13182r.class);
    }

    /* renamed from: K */
    public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, f32716s);
            outputStreamWriter.write(this.f32717r.toString());
            outputStreamWriter.flush();
            this.f32717r.toString();
        } catch (JSONException e) {
            throw new ApplicationBugException((Exception) e);
        }
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity;q=1");
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, "application/jsonx");
        if (this.f51761d) {
            httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, "application/jsonx");
            httpURLConnection.setRequestProperty("Content-Encoding", f32716s.displayName());
        }
    }

    public C13173i(C13177m mVar, int i, Class<RS> cls) {
        super(mVar, C4590c.server_path_sdk_server_url, i, cls);
    }
}
