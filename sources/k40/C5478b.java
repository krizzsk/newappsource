package k40;

import com.moovit.commons.request.BadResponseException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.text.ParseException;
import k40.C5478b;
import org.json.JSONException;
import org.json.JSONObject;
import p786rz.C19387a;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20951m;

/* renamed from: k40.b */
public abstract class C5478b<RQ extends C20431c<RQ, RS>, RS extends C5478b<RQ, RS>> extends C20436g<RQ, RS> {
    /* renamed from: b */
    public final void mo5817b(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException {
        C20951m mVar;
        String str;
        try {
            String contentType = httpURLConnection.getContentType();
            if (contentType != null) {
                mVar = C20951m.m49061c(contentType);
            } else {
                mVar = null;
            }
            if (mVar != null) {
                str = mVar.mo53024a();
            } else {
                str = "utf-8";
            }
            mo21363d(rq, new JSONObject(new String(C19387a.m46673e(new InputStreamReader(bufferedInputStream, str)))));
        } catch (UnsupportedEncodingException | ParseException | JSONException e) {
            throw new BadResponseException(e);
        }
    }

    /* renamed from: d */
    public abstract void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException;

    public final String toString() {
        return "";
    }
}
