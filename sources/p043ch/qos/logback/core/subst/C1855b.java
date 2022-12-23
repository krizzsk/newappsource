package p043ch.qos.logback.core.subst;

import java.util.ArrayList;
import java.util.List;
import p043ch.qos.logback.core.spi.ScanException;
import p043ch.qos.logback.core.subst.Node;
import p043ch.qos.logback.core.subst.Token;
import p070e4.C4550e;

/* renamed from: ch.qos.logback.core.subst.b */
public final class C1855b {

    /* renamed from: a */
    public final List<Token> f6411a;

    /* renamed from: b */
    public int f6412b = 0;

    /* renamed from: ch.qos.logback.core.subst.b$a */
    public static /* synthetic */ class C1856a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6413a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ch.qos.logback.core.subst.Token$Type[] r0 = p043ch.qos.logback.core.subst.Token.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6413a = r0
                ch.qos.logback.core.subst.Token$Type r1 = p043ch.qos.logback.core.subst.Token.Type.LITERAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6413a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.subst.Token$Type r1 = p043ch.qos.logback.core.subst.Token.Type.CURLY_LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6413a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.subst.Token$Type r1 = p043ch.qos.logback.core.subst.Token.Type.START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.subst.C1855b.C1856a.<clinit>():void");
        }
    }

    public C1855b(ArrayList arrayList) {
        this.f6411a = arrayList;
    }

    /* renamed from: a */
    public final Node mo6690a() throws ScanException {
        Node node;
        Token c = mo6692c();
        int i = C1856a.f6413a[c.f6405a.ordinal()];
        boolean z = true;
        Node node2 = null;
        if (i == 1) {
            mo6691b();
            node = new Node(Node.Type.LITERAL, c.f6406b);
        } else if (i == 2) {
            mo6691b();
            Node a = mo6690a();
            Token c2 = mo6692c();
            if (c2 == null || c2.f6405a != Token.Type.DEFAULT) {
                z = false;
            }
            if (z) {
                mo6691b();
                a.mo6682a(new Node(Node.Type.LITERAL, ":-"));
                a.mo6682a(mo6690a());
            }
            Token c3 = mo6692c();
            if (c3 == null) {
                throw new IllegalArgumentException("All tokens consumed but was expecting \"}\"");
            } else if (c3.f6405a == Token.Type.CURLY_RIGHT) {
                mo6691b();
                String str = C4550e.f15685b;
                Node.Type type = Node.Type.LITERAL;
                Node node3 = new Node(type, str);
                node3.mo6682a(a);
                node3.mo6682a(new Node(type, C4550e.f15686c));
                node = node3;
            } else {
                throw new ScanException("Expecting }");
            }
        } else if (i != 3) {
            node = null;
        } else {
            mo6691b();
            node = new Node(Node.Type.VARIABLE, mo6690a());
            Token c4 = mo6692c();
            if (c4 == null || c4.f6405a != Token.Type.DEFAULT) {
                z = false;
            }
            if (z) {
                mo6691b();
                node.f6398c = mo6690a();
            }
            Token c5 = mo6692c();
            if (c5 == null) {
                throw new IllegalArgumentException("All tokens consumed but was expecting \"}\"");
            } else if (c5.f6405a == Token.Type.CURLY_RIGHT) {
                mo6691b();
            } else {
                throw new ScanException("Expecting }");
            }
        }
        if (node == null) {
            return null;
        }
        if (mo6692c() != null) {
            node2 = mo6690a();
        }
        if (node2 != null) {
            node.mo6682a(node2);
        }
        return node;
    }

    /* renamed from: b */
    public final void mo6691b() {
        this.f6412b++;
    }

    /* renamed from: c */
    public final Token mo6692c() {
        if (this.f6412b < this.f6411a.size()) {
            return this.f6411a.get(this.f6412b);
        }
        return null;
    }
}
