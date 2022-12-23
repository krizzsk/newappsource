package p654mk;

/* renamed from: mk.n */
public final class C18392n {

    /* renamed from: a */
    public Integer f46886a;

    /* renamed from: b */
    public Integer f46887b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18392n.class != obj.getClass()) {
            return false;
        }
        C18392n nVar = (C18392n) obj;
        Integer num = this.f46886a;
        if (num == null ? nVar.f46886a != null : !num.equals(nVar.f46886a)) {
            return false;
        }
        Integer num2 = this.f46887b;
        Integer num3 = nVar.f46887b;
        if (num2 != null) {
            return num2.equals(num3);
        }
        if (num3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.f46886a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num2 = this.f46887b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }
}
