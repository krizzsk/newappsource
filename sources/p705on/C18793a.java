package p705on;

import java.util.Objects;

/* renamed from: on.a */
public final class C18793a {

    /* renamed from: a */
    public final String f47835a;

    /* renamed from: b */
    public final String f47836b;

    /* renamed from: c */
    public final String f47837c;

    /* renamed from: d */
    public final String f47838d;

    /* renamed from: e */
    public final String f47839e;

    public C18793a(String str, String str2, String str3, String str4, String str5) {
        this.f47835a = str;
        this.f47836b = str2;
        this.f47837c = str3;
        this.f47838d = str4;
        this.f47839e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18793a.class != obj.getClass()) {
            return false;
        }
        C18793a aVar = (C18793a) obj;
        if (!Objects.equals(this.f47835a, aVar.f47835a) || !Objects.equals(this.f47836b, aVar.f47836b) || !Objects.equals(this.f47837c, aVar.f47837c) || !Objects.equals(this.f47838d, aVar.f47838d) || !Objects.equals(this.f47839e, aVar.f47839e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47835a, this.f47836b, this.f47837c, this.f47838d, this.f47839e});
    }
}
