package k40;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import k40.C5477a;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: k40.a */
public abstract class C5477a<RQ extends C5477a<RQ, RS>, RS extends C20436g<RQ, RS>> extends C20431c<RQ, RS> {

    /* renamed from: r */
    public static final Charset f17994r = Charset.forName("UTF-8");

    /* renamed from: q */
    public JSONObject f17995q;

    public C5477a(Context context, int i, int i2, Class cls) {
        super(context, i, i2, true, cls);
    }

    /* renamed from: K */
    public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
        JSONObject jSONObject;
        try {
            synchronized (this) {
                if (this.f17995q == null) {
                    this.f17995q = mo21361L();
                }
                jSONObject = this.f17995q;
            }
            this.f17995q = jSONObject;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, f17994r);
            outputStreamWriter.write(this.f17995q.toString());
            outputStreamWriter.flush();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: L */
    public JSONObject mo21361L() throws JSONException {
        return null;
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity;q=1");
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, "application/json");
        if (this.f51761d) {
            httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, "application/json");
        }
    }

    public final String toString() {
        JSONObject jSONObject = this.f17995q;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "";
    }

    public C5477a(Context context, Uri uri, boolean z, Class<RS> cls) {
        super(context, uri, z, cls);
    }
}
