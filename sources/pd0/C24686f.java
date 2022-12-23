package pd0;

import p384bg.C13620a;
import p384bg.C13622c;

/* renamed from: pd0.f */
public final class C24686f {
    @C13622c("status")
    @C13620a

    /* renamed from: a */
    private String f62514a;
    @C13622c("source")
    @C13620a

    /* renamed from: b */
    private String f62515b;
    @C13622c("message_version")
    @C13620a

    /* renamed from: c */
    private String f62516c;
    @C13622c("timestamp")
    @C13620a

    /* renamed from: d */
    private Long f62517d;

    public C24686f(String str, String str2, Long l, String str3) {
        this.f62514a = str;
        this.f62515b = str2;
        this.f62516c = str3;
        this.f62517d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24686f.class != obj.getClass()) {
            return false;
        }
        C24686f fVar = (C24686f) obj;
        if (!this.f62514a.equals(fVar.f62514a) || !this.f62515b.equals(fVar.f62515b) || !this.f62516c.equals(fVar.f62516c) || !this.f62517d.equals(fVar.f62517d)) {
            return false;
        }
        return true;
    }
}
