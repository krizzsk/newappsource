package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVSuggestedTicketFareSelectionStep implements TBase<MVSuggestedTicketFareSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVSuggestedTicketFareSelectionStep> {

    /* renamed from: b */
    public static final C25113c f29124b = new C25113c("suggestedFares", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29125c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29126d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29127e;
    private _Fields[] optionals = {_Fields.TITLE};
    public List<MVSuggestedTicketFareRef> suggestedFares;
    public String title;

    public enum _Fields implements C25085c {
        SUGGESTED_FARES(1, "suggestedFares"),
        TITLE(2, "title");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return SUGGESTED_FARES;
            }
            if (i != 2) {
                return null;
            }
            return TITLE;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep$a */
    public static class C11046a extends C25239c<MVSuggestedTicketFareSelectionStep> {
        public C11046a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) tBase;
            mVSuggestedTicketFareSelectionStep.getClass();
            C25113c cVar = MVSuggestedTicketFareSelectionStep.f29124b;
            gVar.mo61687K();
            if (mVSuggestedTicketFareSelectionStep.suggestedFares != null) {
                gVar.mo61711x(MVSuggestedTicketFareSelectionStep.f29124b);
                gVar.mo61680D(new C25119e((byte) 12, mVSuggestedTicketFareSelectionStep.suggestedFares.size()));
                for (MVSuggestedTicketFareRef X0 : mVSuggestedTicketFareSelectionStep.suggestedFares) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareSelectionStep.title != null && mVSuggestedTicketFareSelectionStep.mo32991g()) {
                gVar.mo61711x(MVSuggestedTicketFareSelectionStep.f29125c);
                gVar.mo61686J(mVSuggestedTicketFareSelectionStep.title);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSuggestedTicketFareSelectionStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVSuggestedTicketFareSelectionStep.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVSuggestedTicketFareSelectionStep.suggestedFares = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVSuggestedTicketFareRef mVSuggestedTicketFareRef = new MVSuggestedTicketFareRef();
                        mVSuggestedTicketFareRef.mo25201C1(gVar);
                        mVSuggestedTicketFareSelectionStep.suggestedFares.add(mVSuggestedTicketFareRef);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep$b */
    public static class C11047b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11046a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep$c */
    public static class C11048c extends C25240d<MVSuggestedTicketFareSelectionStep> {
        public C11048c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestedTicketFareSelectionStep.mo32990f()) {
                bitSet.set(0);
            }
            if (mVSuggestedTicketFareSelectionStep.mo32991g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSuggestedTicketFareSelectionStep.mo32990f()) {
                jVar.mo61678B(mVSuggestedTicketFareSelectionStep.suggestedFares.size());
                for (MVSuggestedTicketFareRef X0 : mVSuggestedTicketFareSelectionStep.suggestedFares) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSuggestedTicketFareSelectionStep.mo32991g()) {
                jVar.mo61686J(mVSuggestedTicketFareSelectionStep.title);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVSuggestedTicketFareSelectionStep.suggestedFares = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSuggestedTicketFareRef mVSuggestedTicketFareRef = new MVSuggestedTicketFareRef();
                    mVSuggestedTicketFareRef.mo25201C1(jVar);
                    mVSuggestedTicketFareSelectionStep.suggestedFares.add(mVSuggestedTicketFareRef);
                }
            }
            if (T.get(1)) {
                mVSuggestedTicketFareSelectionStep.title = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep$d */
    public static class C11049d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11048c(0);
        }
    }

    static {
        new C17394d0("MVSuggestedTicketFareSelectionStep");
        HashMap hashMap = new HashMap();
        f29126d = hashMap;
        hashMap.put(C25239c.class, new C11047b());
        hashMap.put(C25240d.class, new C11049d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUGGESTED_FARES, new FieldMetaData("suggestedFares", (byte) 3, new ListMetaData(new StructMetaData(MVSuggestedTicketFareRef.class))));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29127e = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestedTicketFareSelectionStep.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29126d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29126d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) obj;
        if (!getClass().equals(mVSuggestedTicketFareSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVSuggestedTicketFareSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32990f()).compareTo(Boolean.valueOf(mVSuggestedTicketFareSelectionStep.mo32990f()));
        if (compareTo2 != 0 || ((mo32990f() && (compareTo2 = C25082a.m62844h(this.suggestedFares, mVSuggestedTicketFareSelectionStep.suggestedFares)) != 0) || (compareTo2 = Boolean.valueOf(mo32991g()).compareTo(Boolean.valueOf(mVSuggestedTicketFareSelectionStep.mo32991g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32991g() || (compareTo = this.title.compareTo(mVSuggestedTicketFareSelectionStep.title)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestedTicketFareSelectionStep)) {
            return false;
        }
        MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = (MVSuggestedTicketFareSelectionStep) obj;
        boolean f = mo32990f();
        boolean f2 = mVSuggestedTicketFareSelectionStep.mo32990f();
        if ((f || f2) && (!f || !f2 || !this.suggestedFares.equals(mVSuggestedTicketFareSelectionStep.suggestedFares))) {
            return false;
        }
        boolean g = mo32991g();
        boolean g2 = mVSuggestedTicketFareSelectionStep.mo32991g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVSuggestedTicketFareSelectionStep.title))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32990f() {
        return this.suggestedFares != null;
    }

    /* renamed from: g */
    public final boolean mo32991g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSuggestedTicketFareSelectionStep(", "suggestedFares:");
        List<MVSuggestedTicketFareRef> list = this.suggestedFares;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo32991g()) {
            n.append(", ");
            n.append("title:");
            String str = this.title;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
