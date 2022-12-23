package c70;

import android.content.Context;
import android.net.Uri;
import c70.C13773n;
import com.moovit.auth.FirebaseAuthUtils;
import g30.C4776h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import p824tp.C19721a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p906wz.C20431c;
import p906wz.C20432d;
import p977zz.C20930c;
import p977zz.C20964s0;
import p977zz.C20975x0;
import y90.C13272f;

/* renamed from: c70.m */
public class C13772m<RS extends C13773n<RS>> extends C20431c<C13772m<RS>, RS> {

    /* renamed from: q */
    public final C13752e f33910q;

    /* renamed from: r */
    public final boolean f33911r;

    public C13772m() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13772m(C13752e eVar, Uri uri, Class<RS> cls) {
        super(eVar.f33852a, uri, false, cls);
        Uri z = C20431c.m48016z(C19746x.server_path_app_server_secured_url, eVar.f33852a);
        boolean z2 = C20975x0.m49118e(z.getScheme(), uri.getScheme()) && C20975x0.m49118e(z.getHost(), uri.getHost());
        this.f33910q = eVar;
        this.f33911r = z2;
    }

    /* renamed from: L */
    public static Uri m34411L(Context context, int i, int i2, String str, C19722a0 a0Var, C19728f fVar) {
        int i3;
        String str2;
        String str3;
        String str4;
        Context context2 = context;
        C19722a0 a0Var2 = a0Var;
        C19728f fVar2 = fVar;
        Uri.Builder buildUpon = C20431c.m48016z(i, context2).buildUpon();
        C19721a aVar = C19731i.m47197a(context).f50171a;
        int value = C13749c.m34339y(context).getValue();
        Locale b = C20930c.m49020b(context);
        String language = b.getLanguage();
        String country = b.getCountry();
        String str5 = "";
        if (a0Var2 != null) {
            C13272f fVar3 = a0Var2.f50160a;
            str2 = fVar3.f32925a;
            str3 = fVar3.f32927c.mo19751c();
            C13272f fVar4 = a0Var2.f50160a;
            i3 = fVar4.f32926b;
            str4 = fVar4.f32928d;
        } else {
            str4 = str5;
            str3 = str4;
            str2 = str3;
            i3 = 0;
        }
        long j = 0;
        if (fVar2 != null) {
            C4776h hVar = fVar2.f50165a;
            j = hVar.f16127b;
            String str6 = hVar.f16128c;
            String str7 = C20964s0.f52718a;
            if (str6 != null) {
                str5 = str6;
            }
        }
        Uri parse = Uri.parse(context2.getString(i2, new Object[]{str, String.valueOf(value), str3, Long.valueOf(j), language, country, str2, aVar.f50152c, String.valueOf(i3), String.valueOf(aVar.f50159j), String.valueOf(aVar.f50157h), aVar.f50155f, str4, str5, aVar.f50156g}));
        for (String next : parse.getPathSegments()) {
            if (!C20964s0.m49090h(next)) {
                buildUpon.appendEncodedPath(next);
            }
        }
        for (String next2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(next2);
            if (!C20964s0.m49090h(queryParameter)) {
                buildUpon.appendQueryParameter(next2, queryParameter);
            }
        }
        return buildUpon.build();
    }

    /* renamed from: M */
    public static Uri m34412M(Context context, int i, String str, C19722a0 a0Var, C19728f fVar) {
        return m34411L(context, C19746x.server_path_cdn_resources_base_path, i, str, a0Var, fVar);
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        if (this.f33911r) {
            FirebaseAuthUtils.m40011a(httpURLConnection);
        }
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        C19721a aVar = C19731i.m47197a(this.f51759b).f50171a;
        dVar.mo52633b("CLIENT_VERSION", aVar.f50152c);
        dVar.mo52632a("PHONE_TYPE", aVar.f50159j);
        C19722a0 a0Var = this.f33910q.f33853b;
        if (a0Var != null) {
            dVar.mo52633b("USER_KEY", a0Var.f50160a.f32925a);
        }
    }
}
