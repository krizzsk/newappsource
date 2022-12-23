package p425cs;

import c70.C13746a;
import c70.C13752e;
import com.tranzmate.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

/* renamed from: cs.e */
public final class C16480e extends C13746a<C16480e, C16481f> {
    public C16480e(C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_editor_mark_user, false, C16481f.class);
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        try {
            httpURLConnection.setRequestMethod("POST");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }
}
