package v70;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import p786rz.C19387a;
import p906wz.C20431c;
import p977zz.C20951m;
import v70.C13163a;
import v70.C13176l;

/* renamed from: v70.l */
public abstract class C13176l<RQ extends C13163a<RQ, RS>, RS extends C13176l<RQ, RS>> extends C13164b<RQ, RS> {
    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C20951m mVar;
        String str;
        C13163a aVar = (C13163a) cVar;
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
            mo40053d(aVar, new JSONObject(new String(C19387a.m46673e(new InputStreamReader(bufferedInputStream, str)))));
        } catch (UnsupportedEncodingException | ParseException | JSONException e) {
            throw new BadResponseException(e);
        }
    }

    /* renamed from: d */
    public void mo40053d(C13163a aVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
    }
}
