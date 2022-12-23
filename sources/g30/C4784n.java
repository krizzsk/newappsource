package g30;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p786rz.C19387a;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: g30.n */
public final class C4784n extends C20436g<C4783m, C4784n> {

    /* renamed from: f */
    public C4786b f16156f = null;

    /* renamed from: g30.n$a */
    public static class C4785a {

        /* renamed from: a */
        public final String f16157a;

        /* renamed from: b */
        public final String[] f16158b;

        /* renamed from: c */
        public final boolean f16159c;

        public C4785a(String str, String[] strArr, boolean z) {
            this.f16157a = str;
            this.f16158b = strArr;
            this.f16159c = z;
        }
    }

    /* renamed from: g30.n$b */
    public static class C4786b {

        /* renamed from: a */
        public final ServerId f16160a;

        /* renamed from: b */
        public final long f16161b;

        /* renamed from: c */
        public final long f16162c;

        /* renamed from: d */
        public final C4785a f16163d;

        /* renamed from: e */
        public final C4785a f16164e;

        /* renamed from: f */
        public final C4785a f16165f;

        public C4786b(ServerId serverId, long j, long j2, C4785a aVar, C4785a aVar2, C4785a aVar3) {
            this.f16160a = serverId;
            this.f16161b = j;
            this.f16162c = j2;
            this.f16163d = aVar;
            this.f16164e = aVar2;
            this.f16165f = aVar3;
        }
    }

    /* renamed from: d */
    public static C4785a m12117d(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        String[] strArr;
        int i = jSONObject.getInt(str2);
        JSONArray jSONArray = jSONObject.getJSONArray(str3);
        int length = jSONArray.length();
        boolean z = false;
        if (length == 0) {
            strArr = new String[0];
        } else {
            String[] strArr2 = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr2[i2] = String.valueOf(jSONArray.getInt(i2));
            }
            strArr = strArr2;
        }
        double length2 = (double) strArr.length;
        double d = (double) i;
        if (d > 0.0d && length2 / d <= 0.05d) {
            z = true;
        }
        return new C4785a(str, strArr, z);
    }

    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C4783m mVar = (C4783m) cVar;
        try {
            JSONObject jSONObject = new JSONObject(new String(C19387a.m46672d(new GZIPInputStream(bufferedInputStream))));
            this.f16156f = new C4786b(new ServerId(jSONObject.getInt("metro_id")), jSONObject.getLong("from_revision"), jSONObject.getLong("to_revision"), m12117d("stops", "to_revision_stops_size", "stop_ids", jSONObject), m12117d("line_groups", "to_revision_line_groups_size", "line_group_ids", jSONObject), m12117d("patterns", "to_revision_patterns_size", "pattern_ids", jSONObject));
        } catch (Exception e) {
            throw new BadResponseException(e);
        }
    }
}
