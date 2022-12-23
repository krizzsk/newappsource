package v70;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.sdk.protocol.ProtocolEnums$MVPhoneOsTypes;
import com.moovit.sdk.protocol.ProtocolEnums$MVUserType;
import e70.C4591d;
import f00.C16919g;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Locale;
import p906wz.C20431c;
import p906wz.C20432d;
import p906wz.C20436g;
import p977zz.C20930c;
import v70.C13180p;

/* renamed from: v70.o */
public class C13179o<RS extends C13180p<RS>> extends C20431c<C13179o<RS>, RS> {

    /* renamed from: q */
    public final C13177m f32721q;

    /* renamed from: r */
    public C16919g.C16925f f32722r = null;

    public C13179o(C13177m mVar, Uri uri, Class<RS> cls) {
        super(mVar.f32719a, uri, false, cls);
        this.f32721q = mVar;
    }

    /* renamed from: L */
    public static Uri m33225L(Context context, C4591d dVar, int i, int i2, String str) {
        String str2;
        String num = Integer.toString(C21100e.m49343h0(context).getValue());
        dVar.getClass();
        String str3 = C4591d.f15777f.f15781d;
        Locale b = C20930c.m49020b(context);
        String language = b.getLanguage();
        String country = b.getCountry();
        String str4 = C4591d.f15777f.f15778a;
        if (str4.length() > 2) {
            str2 = str4.substring(str4.length() - 2);
        } else {
            str2 = str4;
        }
        String valueOf = String.valueOf((Integer.valueOf(Integer.parseInt(str2.trim(), 16)).intValue() * 100) / 256);
        String valueOf2 = String.valueOf(ProtocolEnums$MVPhoneOsTypes.Android.getValue());
        String valueOf3 = String.valueOf(ProtocolEnums$MVUserType.Sdk.getValue());
        return Uri.parse(context.getString(i)).buildUpon().appendEncodedPath(context.getString(i2, new Object[]{str, num, str3, 0L, language, country, str4, "5.37.2.429", valueOf, valueOf2, valueOf3})).build();
    }

    /* renamed from: C */
    public final C20436g mo40056C() {
        C13180p pVar = (C13180p) super.mo40056C();
        SharedPreferences sharedPreferences = this.f51759b.getSharedPreferences("moovit_sdk_resource_request", 0);
        C16919g.C16925f fVar = this.f32722r;
        pVar.f32723f = sharedPreferences;
        pVar.f32724g = fVar;
        return pVar;
    }

    /* renamed from: M */
    public final void mo40057M() {
        try {
            this.f32722r = new C16919g.C16925f(mo49828s(this.f51760c).toString(), 0);
        } catch (MalformedURLException unused) {
            this.f32722r = null;
        }
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        boolean z;
        super.mo20116t(httpURLConnection);
        httpURLConnection.setUseCaches(false);
        C16919g.C16925f fVar = this.f32722r;
        if (fVar != null) {
            if (fVar.mo19759a(this.f51759b.getSharedPreferences("moovit_sdk_resource_request", 0)).longValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                httpURLConnection.setIfModifiedSince(this.f32722r.mo19759a(this.f51759b.getSharedPreferences("moovit_sdk_resource_request", 0)).longValue());
            }
        }
    }

    /* renamed from: u */
    public void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        this.f32721q.f32720b.getClass();
        if (C4591d.f15777f.f15778a != null) {
            dVar.mo52633b("x-user-key", C4591d.f15777f.f15778a);
        }
        if (C4591d.f15777f.f15780c != null) {
            dVar.mo52633b("x-ext-user-key", C4591d.f15777f.f15780c);
        }
        if (C4591d.f15777f.f15779b != null) {
            dVar.mo52633b("x-api-key", C4591d.f15777f.f15779b);
        }
        dVar.mo52633b("x-client-version", "5.37.2.429");
    }
}
