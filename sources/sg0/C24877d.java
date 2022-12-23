package sg0;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: sg0.d */
public final class C24877d implements C24876c {

    /* renamed from: a */
    public final ProtoBuf$StringTable f62911a;

    /* renamed from: b */
    public final ProtoBuf$QualifiedNameTable f62912b;

    /* renamed from: sg0.d$a */
    public /* synthetic */ class C24878a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62913a;

        static {
            int[] iArr = new int[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.values().length];
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            f62913a = iArr;
        }
    }

    public C24877d(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f62911a = protoBuf$StringTable;
        this.f62912b = protoBuf$QualifiedNameTable;
    }

    /* renamed from: a */
    public final boolean mo61349a(int i) {
        return mo61352c(i).mo59088f().booleanValue();
    }

    /* renamed from: b */
    public final String mo61350b(int i) {
        Triple<List<String>, List<String>, Boolean> c = mo61352c(i);
        List a = c.mo59082a();
        String q0 = C23825c.m58520q0(c.mo59083b(), ".", (String) null, (String) null, (C24236l) null, 62);
        if (a.isEmpty()) {
            return q0;
        }
        return C23825c.m58520q0(a, "/", (String) null, (String) null, (C24236l) null, 62) + '/' + q0;
    }

    /* renamed from: c */
    public final Triple<List<String>, List<String>, Boolean> mo61352c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName g = this.f62912b.mo59794g(i);
            String g2 = this.f62911a.mo59807g(g.mo59797k());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind i2 = g.mo59795i();
            C24362h.m61208c(i2);
            int i3 = C24878a.f62913a[i2.ordinal()];
            if (i3 == 1) {
                linkedList2.addFirst(g2);
            } else if (i3 == 2) {
                linkedList.addFirst(g2);
            } else if (i3 == 3) {
                linkedList2.addFirst(g2);
                z = true;
            }
            i = g.mo59796j();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public final String getString(int i) {
        String g = this.f62911a.mo59807g(i);
        C24362h.m61210e(g, "strings.getString(index)");
        return g;
    }
}
