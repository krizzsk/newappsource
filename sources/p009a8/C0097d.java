package p009a8;

import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p009a8.C0100e;
import p009a8.C0121t;

/* renamed from: a8.d */
public final /* synthetic */ class C0097d implements C0121t.C0122a {

    /* renamed from: a */
    public final /* synthetic */ C0100e.C0104d f284a;

    /* renamed from: b */
    public final /* synthetic */ AccessToken f285b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f286c;

    /* renamed from: d */
    public final /* synthetic */ Set f287d;

    /* renamed from: e */
    public final /* synthetic */ Set f288e;

    /* renamed from: f */
    public final /* synthetic */ Set f289f;

    /* renamed from: g */
    public final /* synthetic */ C0100e f290g;

    public /* synthetic */ C0097d(C0100e.C0104d dVar, AccessToken accessToken, AccessToken.C2264a aVar, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, C0100e eVar) {
        this.f284a = dVar;
        this.f285b = accessToken;
        this.f286c = atomicBoolean;
        this.f287d = hashSet;
        this.f288e = hashSet2;
        this.f289f = hashSet3;
        this.f290g = eVar;
    }

    /* renamed from: a */
    public final void mo203a(C0121t tVar) {
        String str;
        Date date;
        C0100e.C0104d dVar = this.f284a;
        AccessToken accessToken = this.f285b;
        AtomicBoolean atomicBoolean = this.f286c;
        Set<String> set = this.f287d;
        Set<String> set2 = this.f288e;
        Set<String> set3 = this.f289f;
        C0100e eVar = this.f290g;
        C24362h.m61211f(dVar, "$refreshResult");
        C24362h.m61211f(atomicBoolean, "$permissionsCallSucceeded");
        C24362h.m61211f(set, "$permissions");
        C24362h.m61211f(set2, "$declinedPermissions");
        C24362h.m61211f(set3, "$expiredPermissions");
        C24362h.m61211f(eVar, "this$0");
        String str2 = dVar.f311a;
        int i = dVar.f312b;
        Long l = dVar.f314d;
        String str3 = dVar.f315e;
        try {
            C0100e.C0101a aVar = C0100e.f304f;
            if (aVar.mo216a().f308c != null) {
                AccessToken accessToken2 = aVar.mo216a().f308c;
                if (accessToken2 == null) {
                    str = null;
                } else {
                    str = accessToken2.f8359j;
                }
                if (str == accessToken.f8359j) {
                    if (!atomicBoolean.get() && str2 == null && i == 0) {
                        eVar.f309d.set(false);
                        return;
                    }
                    Date date2 = accessToken.f8351b;
                    if (dVar.f312b != 0) {
                        date2 = new Date(((long) dVar.f312b) * 1000);
                    } else if (dVar.f313c != 0) {
                        date2 = new Date((((long) dVar.f313c) * 1000) + new Date().getTime());
                    }
                    Date date3 = date2;
                    if (str2 == null) {
                        str2 = accessToken.f8355f;
                    }
                    String str4 = str2;
                    String str5 = accessToken.f8358i;
                    String str6 = accessToken.f8359j;
                    if (!atomicBoolean.get()) {
                        set = accessToken.f8352c;
                    }
                    Set<String> set4 = set;
                    if (!atomicBoolean.get()) {
                        set2 = accessToken.f8353d;
                    }
                    Set<String> set5 = set2;
                    if (!atomicBoolean.get()) {
                        set3 = accessToken.f8354e;
                    }
                    Set<String> set6 = set3;
                    AccessTokenSource accessTokenSource = accessToken.f8356g;
                    Date date4 = new Date();
                    if (l != null) {
                        date = new Date(l.longValue() * 1000);
                    } else {
                        date = accessToken.f8360k;
                    }
                    Date date5 = date;
                    if (str3 == null) {
                        str3 = accessToken.f8361l;
                    }
                    aVar.mo216a().mo215c(new AccessToken(str4, str5, str6, set4, set5, set6, accessTokenSource, date3, date4, date5, str3), true);
                }
            }
        } finally {
            eVar.f309d.set(false);
        }
    }
}
