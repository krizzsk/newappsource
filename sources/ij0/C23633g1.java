package ij0;

import com.cubic.umo.p045ad.types.AKVASTResponse;
import ij0.C23657o1;
import java.io.StringReader;
import java.util.HashMap;
import jj0.C23753d;
import kj0.C23808c;
import lj0.C24330g;
import lj0.C24331h;
import lj0.C24333j;
import org.simpleframework.xml.convert.C24638a;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.stream.C24675b;
import org.simpleframework.xml.stream.C24676c;
import org.simpleframework.xml.stream.NodeException;

/* renamed from: ij0.g1 */
public final class C23633g1 {

    /* renamed from: a */
    public final C23657o1 f59756a = new C23657o1();

    /* renamed from: b */
    public final C23808c f59757b;

    /* renamed from: c */
    public final C24664u f59758c = new C24664u(new C23753d(new HashMap()), new C23644k0(), new C24330g());

    public C23633g1(C24638a aVar) {
        this.f59757b = aVar;
    }

    /* renamed from: a */
    public final Object mo58810a(String str) throws Exception {
        C23654n1 n1Var;
        Class<AKVASTResponse> cls = AKVASTResponse.class;
        C24676c cVar = new C24676c(C24333j.f61634a.mo60474a(new StringReader(str)));
        C24675b bVar = null;
        if (!cVar.f62475c.isEmpty() || (bVar = cVar.mo61117a((C24331h) null)) != null) {
            C23657o1 o1Var = this.f59756a;
            C23657o1.C23658a aVar = o1Var.f59816a.get();
            if (aVar != null) {
                int i = aVar.f59818b;
                if (i >= 0) {
                    aVar.f59818b = i + 1;
                }
                n1Var = aVar.f59817a;
            } else {
                C23657o1.C23658a aVar2 = new C23657o1.C23658a();
                o1Var.f59816a.set(aVar2);
                int i2 = aVar2.f59818b;
                if (i2 >= 0) {
                    aVar2.f59818b = i2 + 1;
                }
                n1Var = aVar2.f59817a;
            }
            try {
                return new C23681v1(new C23639i1(this.f59757b, this.f59758c, n1Var)).mo58874a(bVar, cls);
            } finally {
                this.f59756a.mo58845a();
            }
        } else {
            throw new NodeException();
        }
    }
}
