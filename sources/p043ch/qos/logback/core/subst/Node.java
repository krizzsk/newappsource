package p043ch.qos.logback.core.subst;

import p001a0.C0016g;

/* renamed from: ch.qos.logback.core.subst.Node */
public final class Node {

    /* renamed from: a */
    public Type f6396a;

    /* renamed from: b */
    public Object f6397b;

    /* renamed from: c */
    public Node f6398c;

    /* renamed from: d */
    public Node f6399d;

    /* renamed from: ch.qos.logback.core.subst.Node$Type */
    public enum Type {
        LITERAL,
        VARIABLE
    }

    /* renamed from: ch.qos.logback.core.subst.Node$a */
    public static /* synthetic */ class C1851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6400a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ch.qos.logback.core.subst.Node$Type[] r0 = p043ch.qos.logback.core.subst.Node.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6400a = r0
                ch.qos.logback.core.subst.Node$Type r1 = p043ch.qos.logback.core.subst.Node.Type.LITERAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6400a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.subst.Node$Type r1 = p043ch.qos.logback.core.subst.Node.Type.VARIABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.subst.Node.C1851a.<clinit>():void");
        }
    }

    public Node(Type type, Object obj) {
        this.f6396a = type;
        this.f6397b = obj;
    }

    /* renamed from: b */
    public static void m5227b(Node node, StringBuilder sb) {
        while (node != null) {
            sb.append(node.toString());
            sb.append(" --> ");
            node = node.f6399d;
        }
        sb.append("null ");
    }

    /* renamed from: a */
    public final void mo6682a(Node node) {
        if (node != null) {
            Node node2 = this;
            while (true) {
                Node node3 = node2.f6399d;
                if (node3 == null) {
                    node2.f6399d = node;
                    return;
                }
                node2 = node3;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Node.class != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.f6396a != node.f6396a) {
            return false;
        }
        Object obj2 = this.f6397b;
        if (obj2 == null ? node.f6397b != null : !obj2.equals(node.f6397b)) {
            return false;
        }
        Node node2 = this.f6398c;
        if (node2 == null ? node.f6398c != null : !node2.equals(node.f6398c)) {
            return false;
        }
        Node node3 = this.f6399d;
        Node node4 = node.f6399d;
        return node3 == null ? node4 == null : node3.equals(node4);
    }

    public final int hashCode() {
        Type type = this.f6396a;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.f6397b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Node node = this.f6398c;
        int hashCode3 = (hashCode2 + (node != null ? node.hashCode() : 0)) * 31;
        Node node2 = this.f6399d;
        if (node2 != null) {
            i = node2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = C1851a.f6400a[this.f6396a.ordinal()];
        if (i == 1) {
            StringBuilder k = C13555b.m33972k("Node{type=");
            k.append(this.f6396a);
            k.append(", payload='");
            return C16530d.m42015h(k, this.f6397b, "'}");
        } else if (i != 2) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Node node = this.f6398c;
            if (node != null) {
                m5227b(node, sb2);
            }
            m5227b((Node) this.f6397b, sb);
            String str = "Node{type=" + this.f6396a + ", payload='" + sb.toString() + "'";
            if (this.f6398c != null) {
                StringBuilder t = C0016g.m36t(str, ", defaultPart=");
                t.append(sb2.toString());
                str = t.toString();
            }
            return C0016g.m28k(str, '}');
        }
    }
}
