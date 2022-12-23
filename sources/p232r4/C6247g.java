package p232r4;

import ce0.C21100e;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;
import p043ch.qos.logback.core.spi.ScanException;
import p070e4.C4549d;
import p070e4.C4551f;
import p245s4.C6455a;
import p245s4.C6458d;
import p245s4.C6459e;
import p257t3.C6558b;
import p271u4.C6692c;
import p283v4.C6856a;
import p406cg.C13815e;

/* renamed from: r4.g */
public abstract class C6247g<E> extends C4551f<E> {

    /* renamed from: f */
    public C6242b f19703f;

    /* renamed from: g */
    public String f19704g;

    /* renamed from: h */
    public C13815e f19705h;

    /* renamed from: i */
    public HashMap f19706i = new HashMap();

    public final void start() {
        Map map;
        String str = this.f19704g;
        if (str == null || str.length() == 0) {
            mo21722a("Empty or null pattern.");
            return;
        }
        try {
            C6459e eVar = new C6459e(this.f19704g);
            C4549d dVar = this.f20771c;
            if (dVar != null) {
                eVar.mo20064b(dVar);
            }
            C6458d n = eVar.mo22578n();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = C6558b.f20373j;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            C4549d dVar2 = this.f20771c;
            if (!(dVar2 == null || (map = (Map) dVar2.mo20059b("PATTERN_RULE_REGISTRY")) == null)) {
                hashMap.putAll(map);
            }
            hashMap.putAll(this.f19706i);
            C6455a aVar = new C6455a(n, hashMap);
            aVar.mo20064b(eVar.f20771c);
            C6242b n2 = aVar.mo22572n();
            this.f19703f = n2;
            if (this.f19705h != null) {
                C13815e.m34482a(this.f20771c, n2);
            }
            C4549d dVar3 = this.f20771c;
            for (C6242b bVar = this.f19703f; bVar != null; bVar = (C6242b) bVar.f19694c) {
                if (bVar instanceof C6692c) {
                    ((C6692c) bVar).mo20064b(dVar3);
                }
            }
            C21100e.m49303D0(this.f19703f);
            this.f15687e = true;
        } catch (ScanException e) {
            this.f20771c.f15676d.mo20056a(new C6856a(this, C0016g.m31o(C13555b.m33972k("Failed to parse pattern \""), this.f19704g, "\"."), e));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("(\"");
        return C0016g.m31o(sb, this.f19704g, "\")");
    }
}
