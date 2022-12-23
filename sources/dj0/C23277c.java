package dj0;

import bj0.C21085b;
import java.util.ArrayList;

/* renamed from: dj0.c */
public final class C23277c {

    /* renamed from: a */
    public C21085b f59034a;

    /* renamed from: b */
    public C21085b f59035b;

    public C23277c(C21085b bVar, C21085b bVar2) {
        this.f59034a = bVar;
        this.f59035b = bVar2;
        if (bVar.mo53240b() > bVar2.mo53240b()) {
            this.f59035b = bVar;
            this.f59034a = bVar2;
        } else if (bVar.mo53240b() == bVar2.mo53240b()) {
            if (bVar.mo53239a() > bVar2.mo53239a()) {
                this.f59035b = bVar;
                this.f59034a = bVar2;
            } else {
                bVar.mo53239a();
                bVar2.mo53239a();
            }
        }
        C21085b bVar3 = this.f59035b;
        if (bVar3.f52906a == null) {
            bVar3.f52906a = new ArrayList<>();
        }
        bVar3.f52906a.add(this);
    }
}
