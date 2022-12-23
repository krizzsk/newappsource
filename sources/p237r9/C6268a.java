package p237r9;

import com.google.android.datatransport.Priority;

/* renamed from: r9.a */
public final class C6268a<T> extends C6270c<T> {

    /* renamed from: a */
    public final Integer f19739a = null;

    /* renamed from: b */
    public final T f19740b;

    /* renamed from: c */
    public final Priority f19741c;

    public C6268a(Object obj, Priority priority) {
        if (obj != null) {
            this.f19740b = obj;
            if (priority != null) {
                this.f19741c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public final Integer mo22250a() {
        return this.f19739a;
    }

    /* renamed from: b */
    public final T mo22251b() {
        return this.f19740b;
    }

    /* renamed from: c */
    public final Priority mo22252c() {
        return this.f19741c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6270c)) {
            return false;
        }
        C6270c cVar = (C6270c) obj;
        Integer num = this.f19739a;
        if (num != null ? num.equals(cVar.mo22250a()) : cVar.mo22250a() == null) {
            if (!this.f19740b.equals(cVar.mo22251b()) || !this.f19741c.equals(cVar.mo22252c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.f19739a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f19740b.hashCode()) * 1000003) ^ this.f19741c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Event{code=");
        k.append(this.f19739a);
        k.append(", payload=");
        k.append(this.f19740b);
        k.append(", priority=");
        k.append(this.f19741c);
        k.append("}");
        return k.toString();
    }
}
