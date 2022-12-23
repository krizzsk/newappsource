package p891wk;

import java.util.Objects;
import org.json.JSONObject;

/* renamed from: wk.g */
public final class C20352g {

    /* renamed from: a */
    public final String f51532a;

    /* renamed from: b */
    public final C20344a f51533b;

    /* renamed from: c */
    public final JSONObject f51534c;

    public C20352g(String str, C20344a aVar, JSONObject jSONObject) {
        this.f51532a = str;
        this.f51533b = aVar;
        this.f51534c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20352g.class != obj.getClass()) {
            return false;
        }
        C20352g gVar = (C20352g) obj;
        if (!Objects.equals(this.f51532a, gVar.f51532a) || !Objects.equals(this.f51533b, gVar.f51533b) || !Objects.equals(this.f51534c, gVar.f51534c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51532a, this.f51533b, this.f51534c});
    }
}
