package p193o4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import p019b0.C1426c;
import p043ch.qos.logback.core.spi.ScanException;
import p043ch.qos.logback.core.subst.C1853a;
import p043ch.qos.logback.core.subst.Node;
import p070e4.C4549d;
import p180n4.C5854c;
import p180n4.C5855d;
import p271u4.C6693d;
import p271u4.C6696g;
import p358af.C13437d;

/* renamed from: o4.h */
public final class C5982h extends C6693d implements C6696g {

    /* renamed from: e */
    public Stack<Object> f19130e;

    /* renamed from: f */
    public HashMap f19131f;

    /* renamed from: g */
    public Map<String, String> f19132g;

    /* renamed from: h */
    public C5983i f19133h;

    /* renamed from: i */
    public final ArrayList f19134i = new ArrayList();

    /* renamed from: j */
    public C1426c f19135j = new C1426c(1);

    public C5982h(C4549d dVar, C5983i iVar) {
        this.f20771c = dVar;
        this.f19133h = iVar;
        this.f19130e = new Stack<>();
        this.f19131f = new HashMap(5);
        this.f19132g = new HashMap(5);
    }

    public final String getProperty(String str) {
        String str2 = this.f19132g.get(str);
        return str2 != null ? str2 : this.f20771c.getProperty(str);
    }

    /* renamed from: m */
    public final void mo21973m(C5855d dVar) {
        Iterator it = this.f19134i.iterator();
        while (it.hasNext()) {
            ((C5854c) it.next()).mo169e(dVar);
        }
    }

    /* renamed from: n */
    public final Object mo21974n() {
        return this.f19130e.peek();
    }

    /* renamed from: o */
    public final Object mo21975o() {
        return this.f19130e.pop();
    }

    /* renamed from: p */
    public final void mo21976p(Object obj) {
        this.f19130e.push(obj);
    }

    /* renamed from: q */
    public final String mo21977q(String str) {
        if (str == null) {
            return null;
        }
        C4549d dVar = this.f20771c;
        try {
            Node b = C1853a.m5230b(str);
            C1853a aVar = new C1853a(b, this, dVar);
            StringBuilder sb = new StringBuilder();
            aVar.mo6689a(b, sb, new Stack());
            return sb.toString();
        } catch (ScanException e) {
            throw new IllegalArgumentException(C13437d.m33706k("Failed to parse input [", str, "]"), e);
        }
    }
}
