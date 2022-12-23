package org.apache.thrift;

import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.thrift.TUnion;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25113c;
import vi0.C25121g;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;

public abstract class TUnion<T extends TUnion<?, ?>, F extends C25085c> implements TBase<T, F> {

    /* renamed from: b */
    public static final HashMap f62335b;
    public F setField_ = null;
    public Object value_ = null;

    /* renamed from: org.apache.thrift.TUnion$a */
    public static class C24634a extends C25239c<TUnion> {
        public C24634a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            TUnion tUnion = (TUnion) tBase;
            if (tUnion.setField_ == null || tUnion.value_ == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            tUnion.mo25508f();
            gVar.mo61687K();
            gVar.mo61711x(tUnion.mo25505b(tUnion.setField_));
            tUnion.mo25510h(gVar);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            TUnion tUnion = (TUnion) tBase;
            tUnion.setField_ = null;
            tUnion.value_ = null;
            gVar.mo61705r();
            C25113c f = gVar.mo61693f();
            Object g = tUnion.mo25509g(gVar, f);
            tUnion.value_ = g;
            if (g != null) {
                tUnion.setField_ = tUnion.mo25504a(f.f63357c);
            }
            gVar.mo61694g();
            gVar.mo61693f();
            gVar.mo61706s();
        }
    }

    /* renamed from: org.apache.thrift.TUnion$b */
    public static class C24635b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C24634a(0);
        }
    }

    /* renamed from: org.apache.thrift.TUnion$c */
    public static class C24636c extends C25240d<TUnion> {
        public C24636c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            TUnion tUnion = (TUnion) tBase;
            F f = tUnion.setField_;
            if (f == null || tUnion.value_ == null) {
                throw new TProtocolException("Cannot write a TUnion with no set value!");
            }
            gVar.mo61677A(f.getThriftFieldId());
            tUnion.mo25513j(gVar);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            TUnion tUnion = (TUnion) tBase;
            tUnion.setField_ = null;
            tUnion.value_ = null;
            short h = gVar.mo61695h();
            Object i = tUnion.mo25512i(gVar, h);
            tUnion.value_ = i;
            if (i != null) {
                tUnion.setField_ = tUnion.mo25504a(h);
            }
        }
    }

    /* renamed from: org.apache.thrift.TUnion$d */
    public static class C24637d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C24636c(0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f62335b = hashMap;
        hashMap.put(C25239c.class, new C24635b());
        hashMap.put(C25240d.class, new C24637d());
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f62335b.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f62335b.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public abstract F mo25504a(short s);

    /* renamed from: b */
    public abstract C25113c mo25505b(F f);

    /* renamed from: f */
    public abstract C17394d0 mo25508f();

    /* renamed from: g */
    public abstract Object mo25509g(C25121g gVar, C25113c cVar) throws TException;

    /* renamed from: h */
    public abstract void mo25510h(C25121g gVar) throws TException;

    /* renamed from: i */
    public abstract Object mo25512i(C25121g gVar, short s) throws TException;

    /* renamed from: j */
    public abstract void mo25513j(C25121g gVar) throws TException;

    public final String toString() {
        StringBuilder k = C13555b.m33972k("<");
        k.append(getClass().getSimpleName());
        k.append(" ");
        F f = this.setField_;
        if (f != null) {
            Object obj = this.value_;
            k.append(mo25505b(f).f63355a);
            k.append(":");
            if (obj instanceof ByteBuffer) {
                C25082a.m62851o((ByteBuffer) obj, k);
            } else {
                k.append(obj.toString());
            }
        }
        k.append(">");
        return k.toString();
    }
}
