package p911xg;

import com.google.protobuf.ByteString;
import com.google.protobuf.C14597c0;
import com.google.protobuf.C14599d0;
import com.google.protobuf.C14602f;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Writer$FieldOrder;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: xg.v */
public final class C20514v extends C14597c0<C14599d0, C14599d0> {
    /* renamed from: a */
    public final C14599d0 mo44037a(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: b */
    public final int mo44038b(Object obj) {
        return ((C14599d0) obj).mo44045a();
    }

    /* renamed from: c */
    public final int mo44039c(Object obj) {
        C14599d0 d0Var = (C14599d0) obj;
        int i = d0Var.f36844d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < d0Var.f36841a; i3++) {
            int u = CodedOutputStream.m36449u(2, d0Var.f36842b[i3] >>> 3);
            i2 += CodedOutputStream.m36431c(3, (ByteString) d0Var.f36843c[i3]) + u + (CodedOutputStream.m36448t(1) * 2);
        }
        d0Var.f36844d = i2;
        return i2;
    }

    /* renamed from: d */
    public final void mo44040d(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.getClass();
    }

    /* renamed from: e */
    public final C14599d0 mo44041e(Object obj, Object obj2) {
        C14599d0 d0Var = (C14599d0) obj;
        C14599d0 d0Var2 = (C14599d0) obj2;
        if (d0Var2.equals(C14599d0.f36840e)) {
            return d0Var;
        }
        int i = d0Var.f36841a + d0Var2.f36841a;
        int[] copyOf = Arrays.copyOf(d0Var.f36842b, i);
        System.arraycopy(d0Var2.f36842b, 0, copyOf, d0Var.f36841a, d0Var2.f36841a);
        Object[] copyOf2 = Arrays.copyOf(d0Var.f36843c, i);
        System.arraycopy(d0Var2.f36843c, 0, copyOf2, d0Var.f36841a, d0Var2.f36841a);
        return new C14599d0(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public final void mo44042f(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C14599d0) obj2;
    }

    /* renamed from: g */
    public final void mo44043g(Object obj, C14602f fVar) throws IOException {
        C14599d0 d0Var = (C14599d0) obj;
        d0Var.getClass();
        fVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            int i = d0Var.f36841a;
            while (true) {
                i--;
                if (i >= 0) {
                    fVar.mo44061l(d0Var.f36842b[i] >>> 3, d0Var.f36843c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < d0Var.f36841a; i2++) {
                fVar.mo44061l(d0Var.f36842b[i2] >>> 3, d0Var.f36843c[i2]);
            }
        }
    }

    /* renamed from: h */
    public final void mo44044h(Object obj, C14602f fVar) throws IOException {
        ((C14599d0) obj).mo44046b(fVar);
    }
}
