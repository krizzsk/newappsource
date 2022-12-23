package p656mm;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p364al.C13487h;
import p388bk.C13634a;
import p634ln.C18247a;
import p725pj.C18926a;
import p843uk.C19918a0;
import p843uk.C19945o;

/* renamed from: mm.c */
public final class C18403c {

    /* renamed from: a */
    public final C19945o f46923a;

    /* renamed from: b */
    public final C19918a0 f46924b;

    /* renamed from: c */
    public final Integer f46925c;

    /* renamed from: mm.c$a */
    public static class C18404a {
    }

    public C18403c(C19945o oVar, C19918a0 a0Var, Integer num) {
        this.f46923a = oVar;
        this.f46924b = a0Var;
        this.f46925c = num;
    }

    /* renamed from: a */
    public final C13487h<C19945o> mo50857a() {
        int i;
        boolean z;
        C19918a0 a0Var = this.f46924b;
        Integer num = a0Var.f50574f;
        Integer num2 = a0Var.f50576h;
        Map<Integer, Integer> map = this.f46923a.f50670e;
        if (map.containsKey(num)) {
            i = map.get(num).intValue();
        } else {
            i = 0;
        }
        if (num2.intValue() < this.f46925c.intValue() + i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33614h, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        }
        Integer num3 = this.f46924b.f50574f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f46923a.f50670e);
        if (linkedHashMap.containsKey(num3)) {
            Integer valueOf = Integer.valueOf(Math.max(this.f46925c.intValue() + ((Integer) linkedHashMap.get(num3)).intValue(), 0));
            if (valueOf.intValue() > 0) {
                linkedHashMap.put(num3, valueOf);
            } else {
                linkedHashMap.remove(num3);
            }
        } else if (this.f46925c.intValue() > 0) {
            linkedHashMap.put(num3, this.f46925c);
        }
        C19945o oVar = this.f46923a;
        Map<Integer, C19918a0> map2 = oVar.f50668c;
        String str = oVar.f50666a;
        List<String> list = oVar.f50669d;
        Long l = oVar.f50667b;
        C18247a aVar = oVar.f50671f;
        C18247a aVar2 = oVar.f50672g;
        if (str == null) {
            throw new IllegalArgumentException("OrderId is null");
        } else if (l == null) {
            throw new IllegalArgumentException("startTimeStamp is null");
        } else if (list == null) {
            throw new IllegalArgumentException("selectionKeys is null");
        } else if (map2 != null) {
            return new C13487h<>(new C19945o(str, l, map2, list, linkedHashMap, 0, aVar, aVar2), (C18926a) null);
        } else {
            throw new IllegalArgumentException("availableProducts is null");
        }
    }
}
