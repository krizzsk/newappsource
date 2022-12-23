package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import mf0.C24362h;

/* renamed from: com.facebook.login.n */
public final class C2486n {

    /* renamed from: a */
    public final AccessToken f8886a;

    /* renamed from: b */
    public final AuthenticationToken f8887b;

    /* renamed from: c */
    public final Set<String> f8888c;

    /* renamed from: d */
    public final Set<String> f8889d;

    public C2486n(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        this.f8886a = accessToken;
        this.f8887b = authenticationToken;
        this.f8888c = set;
        this.f8889d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2486n)) {
            return false;
        }
        C2486n nVar = (C2486n) obj;
        return C24362h.m61206a(this.f8886a, nVar.f8886a) && C24362h.m61206a(this.f8887b, nVar.f8887b) && C24362h.m61206a(this.f8888c, nVar.f8888c) && C24362h.m61206a(this.f8889d, nVar.f8889d);
    }

    public final int hashCode() {
        int hashCode = this.f8886a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f8887b;
        int hashCode2 = authenticationToken == null ? 0 : authenticationToken.hashCode();
        return this.f8889d.hashCode() + ((this.f8888c.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LoginResult(accessToken=");
        k.append(this.f8886a);
        k.append(", authenticationToken=");
        k.append(this.f8887b);
        k.append(", recentlyGrantedPermissions=");
        k.append(this.f8888c);
        k.append(", recentlyDeniedPermissions=");
        k.append(this.f8889d);
        k.append(')');
        return k.toString();
    }
}
