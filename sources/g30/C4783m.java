package g30;

import android.content.Context;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import k40.C5477a;
import p824tp.C19746x;
import p906wz.C20431c;

/* renamed from: g30.m */
public final class C4783m extends C5477a<C4783m, C4784n> {
    public C4783m(Context context, String str, ServerId serverId, long j, long j2) {
        super(context, C20431c.m48016z(C19746x.server_path_cdn_offline_base_path, context).buildUpon().appendEncodedPath("V1").appendEncodedPath(serverId.mo19751c()).appendEncodedPath(Long.toString(j2)).appendEncodedPath("GZIP").appendEncodedPath("S").appendEncodedPath(String.format(Locale.ENGLISH, "dirty_ids_from_%s.gzip", new Object[]{Long.valueOf(j)})).build(), false, C4784n.class);
        this.f51770m = new C14291m0(serverId, "metro_revision_dirty_ids", str);
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setConnectTimeout(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        httpURLConnection.setReadTimeout(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
    }
}
