package org.simpleframework.xml.core;

import ij0.C23619c1;
import ij0.C23675u;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.simpleframework.xml.core.SignatureBuilder;

/* renamed from: org.simpleframework.xml.core.b */
public final class C24644b {

    /* renamed from: a */
    public ArrayList f62371a = new ArrayList();

    /* renamed from: b */
    public ParameterMap f62372b = new ParameterMap();

    /* renamed from: c */
    public C24661r f62373c;

    /* renamed from: d */
    public C24664u f62374d;

    public C24644b(C23675u uVar, C24664u uVar2) throws Exception {
        boolean z;
        ArrayList<C24661r> arrayList;
        int i;
        boolean z2;
        this.f62374d = uVar2;
        Constructor[] k = uVar.mo58858k();
        int i2 = 0;
        if (uVar.mo58865r()) {
            int length = k.length;
            int i3 = 0;
            while (i3 < length) {
                Constructor constructor = k[i3];
                if (!uVar.mo58851b()) {
                    C24655m mVar = new C24655m(constructor, this.f62372b, this.f62374d);
                    SignatureBuilder signatureBuilder = (SignatureBuilder) mVar.f62410b;
                    Class[] parameterTypes = signatureBuilder.f62348b.getParameterTypes();
                    SignatureBuilder.ParameterTable parameterTable = signatureBuilder.f62347a;
                    int i4 = SignatureBuilder.ParameterTable.f62349b;
                    if (parameterTypes.length == parameterTable.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SignatureBuilder signatureBuilder2 = (SignatureBuilder) mVar.f62410b;
                        signatureBuilder2.getClass();
                        SignatureBuilder.ParameterTable parameterTable2 = new SignatureBuilder.ParameterTable();
                        if (signatureBuilder2.f62347a.isEmpty()) {
                            arrayList = new ArrayList<>();
                            C24661r rVar = new C24661r(signatureBuilder2.f62348b);
                            Class[] parameterTypes2 = signatureBuilder2.f62348b.getParameterTypes();
                            if (parameterTypes2.length == signatureBuilder2.f62347a.size()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(rVar);
                            }
                        } else {
                            signatureBuilder2.mo61009a(parameterTable2, new SignatureBuilder.ParameterList(), i2);
                            ArrayList arrayList2 = new ArrayList();
                            if (parameterTable2.size() > 0) {
                                i = parameterTable2.get(i2).size();
                            } else {
                                i = 0;
                            }
                            int size = parameterTable2.size();
                            for (int i5 = 0; i5 < i; i5++) {
                                C24661r rVar2 = new C24661r(signatureBuilder2.f62348b);
                                int i6 = 0;
                                while (i6 < size) {
                                    C23619c1 c1Var = (C23619c1) parameterTable2.get(i6).get(i5);
                                    String q = c1Var.mo58747q();
                                    if (!rVar2.f62424b.containsKey(c1Var.getKey())) {
                                        Object key = c1Var.getKey();
                                        if (key != null) {
                                            rVar2.f62424b.put(key, c1Var);
                                        }
                                        i6++;
                                    } else {
                                        throw new ConstructorException("Parameter '%s' is a duplicate in %s", q, signatureBuilder2.f62348b);
                                    }
                                }
                                arrayList2.add(rVar2);
                            }
                            arrayList = arrayList2;
                        }
                        for (C24661r rVar3 : arrayList) {
                            if (rVar3.f62424b.size() == 0) {
                                this.f62373c = rVar3;
                            }
                            this.f62371a.add(rVar3);
                        }
                    } else {
                        continue;
                    }
                }
                i3++;
                i2 = 0;
            }
            return;
        }
        throw new ConstructorException("Can not construct inner %s", uVar);
    }
}
