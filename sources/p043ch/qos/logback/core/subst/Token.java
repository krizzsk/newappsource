package p043ch.qos.logback.core.subst;

import p001a0.C0016g;
import p001a0.C0017h;

/* renamed from: ch.qos.logback.core.subst.Token */
public final class Token {

    /* renamed from: c */
    public static final Token f6401c = new Token(Type.START, (String) null);

    /* renamed from: d */
    public static final Token f6402d = new Token(Type.CURLY_LEFT, (String) null);

    /* renamed from: e */
    public static final Token f6403e = new Token(Type.CURLY_RIGHT, (String) null);

    /* renamed from: f */
    public static final Token f6404f = new Token(Type.DEFAULT, (String) null);

    /* renamed from: a */
    public Type f6405a;

    /* renamed from: b */
    public String f6406b;

    /* renamed from: ch.qos.logback.core.subst.Token$Type */
    public enum Type {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public Token(Type type, String str) {
        this.f6405a = type;
        this.f6406b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Token.class != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (this.f6405a != token.f6405a) {
            return false;
        }
        String str = this.f6406b;
        String str2 = token.f6406b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        Type type = this.f6405a;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        String str = this.f6406b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Token{type=");
        k.append(this.f6405a);
        String sb = k.toString();
        if (this.f6406b != null) {
            sb = C0017h.m57N(C0016g.m36t(sb, ", payload='"), this.f6406b, '\'');
        }
        return C0016g.m28k(sb, '}');
    }
}
