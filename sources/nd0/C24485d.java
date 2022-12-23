package nd0;

import com.usebutton.sdk.internal.api.AppActionRequest;
import p359ag.C13452i;

/* renamed from: nd0.d */
public final class C24485d {

    /* renamed from: a */
    public String f61962a;

    /* renamed from: b */
    public String f61963b;

    /* renamed from: c */
    public String f61964c;

    /* renamed from: d */
    public String f61965d = "";

    /* renamed from: e */
    public String f61966e;

    /* renamed from: f */
    public String f61967f;

    /* renamed from: g */
    public String f61968g;

    /* renamed from: h */
    public String f61969h;

    /* renamed from: i */
    public String f61970i;

    /* renamed from: j */
    public String f61971j;

    /* renamed from: k */
    public String f61972k;

    public C24485d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f61962a = str2;
        this.f61963b = str;
        this.f61964c = str3;
        this.f61966e = str4;
        this.f61967f = str5;
        this.f61968g = str6;
        this.f61969h = str7;
        this.f61970i = str8;
        this.f61971j = str9;
        this.f61972k = str10;
    }

    /* renamed from: a */
    public static void m61587a(String str, String str2, C13452i iVar) {
        if (str2 != null) {
            iVar.mo40349F(str, str2);
        }
    }

    /* renamed from: b */
    public final String mo60736b() {
        C13452i iVar = new C13452i();
        iVar.mo40349F("raw_log", this.f61963b);
        C13452i iVar2 = new C13452i();
        iVar.mo40346C(iVar2, "metadata");
        m61587a("log_level", this.f61962a, iVar2);
        m61587a(AppActionRequest.KEY_CONTEXT, this.f61964c, iVar2);
        m61587a("event_id", this.f61965d, iVar2);
        m61587a("sdk_user_agent", this.f61966e, iVar2);
        m61587a("bundle_id", this.f61967f, iVar2);
        m61587a("time_zone", this.f61968g, iVar2);
        m61587a("device_timestamp", this.f61969h, iVar2);
        m61587a("custom_data", this.f61970i, iVar2);
        m61587a("exception_class", this.f61971j, iVar2);
        m61587a("thread_id", this.f61972k, iVar2);
        return iVar.toString();
    }
}
