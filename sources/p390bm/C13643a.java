package p390bm;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p364al.C13487h;
import p409ck.C13840a;
import p413co.C13872r;
import p583jk.C17871d;
import p583jk.C17872e;
import p583jk.C17877j;
import p681nn.C18577a;
import p703ol.C18781a;
import p725pj.C18926a;
import p918xn.C20546e;

/* renamed from: bm.a */
public final class C13643a {

    /* renamed from: a */
    public final C17871d f33667a;

    /* renamed from: b */
    public final C18781a f33668b;

    /* renamed from: c */
    public final C17877j f33669c;

    /* renamed from: d */
    public final C20546e f33670d;

    /* renamed from: e */
    public final C17872e f33671e;

    public C13643a(C17871d dVar, C18781a aVar, C17877j jVar, C20546e eVar, C17872e eVar2) {
        this.f33667a = dVar;
        this.f33668b = aVar;
        this.f33669c = jVar;
        this.f33670d = eVar;
        this.f33671e = eVar2;
    }

    /* renamed from: a */
    public final C13487h<C18577a> mo40528a() {
        C13487h<String> a = this.f33668b.mo51264a();
        if (a.mo40399a()) {
            return new C13487h<>(null, new C13840a(a.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS)));
        }
        C17871d dVar = this.f33667a;
        dVar.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar.f45856a.mo49402a());
        C13872r<String> deviceId = this.f33670d.getDeviceId();
        if (deviceId.mo40817a()) {
            return new C13487h<>(null, deviceId.f34120b);
        }
        String a2 = this.f33670d.mo52742a();
        String str = (String) a.f33365a;
        String i = this.f33670d.mo52751i();
        String h = this.f33670d.mo52750h();
        String e = this.f33670d.mo52746e();
        String g = this.f33670d.mo52748g();
        String str2 = (String) deviceId.f34119a;
        String f = this.f33670d.mo52747f();
        this.f33669c.getClass();
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!C21100e.m49352m0(locale.getCountry())) {
            sb.append("_");
            sb.append(locale.getCountry().toUpperCase());
        }
        String sb2 = sb.toString();
        String c = this.f33670d.mo52744c();
        C17872e eVar = this.f33671e;
        eVar.getClass();
        Date date = new Date(eVar.f45857a.mo49402a());
        return new C13487h<>(new C18577a(a2, str, i, h, e, g, str2, f, sb2, c, "9.10.0", date, instance.getTimeZone().getID(), String.format("%s/%s JustRideSDK/%s %s/%s", new Object[]{this.f33670d.mo52748g(), this.f33670d.mo52751i(), "9.10.0", this.f33670d.mo52743b(), this.f33670d.mo52745d()})), (C18926a) null);
    }
}
