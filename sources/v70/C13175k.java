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
import p977zz.C20951m;
import v70.C13175k;

/* renamed from: v70.k */
public abstract class C13175k<RS extends C13175k<RS, RO>, RO> extends C13180p<RS> {

    /* renamed from: i */
    public RO f32718i;

    /* renamed from: d */
    public final void mo40055d(HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
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
            this.f32718i = mo40054e(new JSONObject(new String(C19387a.m46673e(new InputStreamReader(bufferedInputStream, str)))));
        } catch (UnsupportedEncodingException | ParseException | JSONException e) {
            throw new BadResponseException(e);
        }
    }

    /* renamed from: e */
    public abstract RO mo40054e(JSONObject jSONObject) throws BadResponseException;
}
