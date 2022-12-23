package p586jn;

import com.masabi.justride.sdk.models.account.LoginResult;

/* renamed from: jn.c */
public final class C17897c {

    /* renamed from: a */
    public final C17895a f45927a;

    /* renamed from: b */
    public final LoginResult f45928b;

    /* renamed from: c */
    public final C17900f f45929c;

    public C17897c(C17895a aVar, LoginResult loginResult, C17900f fVar) {
        this.f45927a = aVar;
        this.f45928b = loginResult;
        this.f45929c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17897c.class != obj.getClass()) {
            return false;
        }
        C17897c cVar = (C17897c) obj;
        C17895a aVar = this.f45927a;
        if (aVar == null ? cVar.f45927a != null : !aVar.equals(cVar.f45927a)) {
            return false;
        }
        if (this.f45928b != cVar.f45928b) {
            return false;
        }
        C17900f fVar = this.f45929c;
        C17900f fVar2 = cVar.f45929c;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        C17895a aVar = this.f45927a;
        int i2 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.f45928b.hashCode() + (i * 31)) * 31;
        C17900f fVar = this.f45929c;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }
}
