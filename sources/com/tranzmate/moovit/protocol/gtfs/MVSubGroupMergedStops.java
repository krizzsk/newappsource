package com.tranzmate.moovit.protocol.gtfs;

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

public class MVSubGroupMergedStops implements TBase<MVSubGroupMergedStops, _Fields>, Serializable, Cloneable, Comparable<MVSubGroupMergedStops> {

    /* renamed from: b */
    public static final C25113c f25814b = new C25113c("subGroup", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25815c = new C25113c("stopIdsSequence", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25816d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25817e;
    public List<Integer> stopIdsSequence;
    public MVSubGroup subGroup;

    public enum _Fields implements C25085c {
        SUB_GROUP(1, "subGroup"),
        STOP_IDS_SEQUENCE(2, "stopIdsSequence");
        
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
                return SUB_GROUP;
            }
            if (i != 2) {
                return null;
            }
            return STOP_IDS_SEQUENCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroupMergedStops$a */
    public static class C8839a extends C25239c<MVSubGroupMergedStops> {
        public C8839a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) tBase;
            MVSubGroup mVSubGroup = mVSubGroupMergedStops.subGroup;
            C25113c cVar = MVSubGroupMergedStops.f25814b;
            gVar.mo61687K();
            if (mVSubGroupMergedStops.subGroup != null) {
                gVar.mo61711x(MVSubGroupMergedStops.f25814b);
                mVSubGroupMergedStops.subGroup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSubGroupMergedStops.stopIdsSequence != null) {
                gVar.mo61711x(MVSubGroupMergedStops.f25815c);
                gVar.mo61680D(new C25119e((byte) 8, mVSubGroupMergedStops.stopIdsSequence.size()));
                for (Integer intValue : mVSubGroupMergedStops.stopIdsSequence) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVSubGroup mVSubGroup = mVSubGroupMergedStops.subGroup;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSubGroupMergedStops.stopIdsSequence = new ArrayList(k.f63395b);
                        int i = 0;
                        while (i < k.f63395b) {
                            i = C13437d.m33701f(gVar.mo61696i(), mVSubGroupMergedStops.stopIdsSequence, i, 1);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVSubGroup mVSubGroup2 = new MVSubGroup();
                    mVSubGroupMergedStops.subGroup = mVSubGroup2;
                    mVSubGroup2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroupMergedStops$b */
    public static class C8840b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8839a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroupMergedStops$c */
    public static class C8841c extends C25240d<MVSubGroupMergedStops> {
        public C8841c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSubGroupMergedStops.mo27538g()) {
                bitSet.set(0);
            }
            if (mVSubGroupMergedStops.mo27537f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSubGroupMergedStops.mo27538g()) {
                mVSubGroupMergedStops.subGroup.mo25202X0(jVar);
            }
            if (mVSubGroupMergedStops.mo27537f()) {
                jVar.mo61678B(mVSubGroupMergedStops.stopIdsSequence.size());
                for (Integer intValue : mVSubGroupMergedStops.stopIdsSequence) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVSubGroup mVSubGroup = new MVSubGroup();
                mVSubGroupMergedStops.subGroup = mVSubGroup;
                mVSubGroup.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSubGroupMergedStops.stopIdsSequence = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVSubGroupMergedStops.stopIdsSequence, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroupMergedStops$d */
    public static class C8842d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8841c(0);
        }
    }

    static {
        new C17394d0("MVSubGroupMergedStops");
        HashMap hashMap = new HashMap();
        f25816d = hashMap;
        hashMap.put(C25239c.class, new C8840b());
        hashMap.put(C25240d.class, new C8842d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUB_GROUP, new FieldMetaData("subGroup", (byte) 3, new StructMetaData(MVSubGroup.class)));
        enumMap.put(_Fields.STOP_IDS_SEQUENCE, new FieldMetaData("stopIdsSequence", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25817e = unmodifiableMap;
        FieldMetaData.m61947a(MVSubGroupMergedStops.class, unmodifiableMap);
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
        ((C25238b) f25816d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25816d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) obj;
        if (!getClass().equals(mVSubGroupMergedStops.getClass())) {
            return getClass().getName().compareTo(mVSubGroupMergedStops.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27538g()).compareTo(Boolean.valueOf(mVSubGroupMergedStops.mo27538g()));
        if (compareTo != 0 || ((mo27538g() && (compareTo = this.subGroup.compareTo(mVSubGroupMergedStops.subGroup)) != 0) || (compareTo = Boolean.valueOf(mo27537f()).compareTo(Boolean.valueOf(mVSubGroupMergedStops.mo27537f()))) != 0)) {
            return compareTo;
        }
        if (!mo27537f() || (h = C25082a.m62844h(this.stopIdsSequence, mVSubGroupMergedStops.stopIdsSequence)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSubGroupMergedStops)) {
            return false;
        }
        MVSubGroupMergedStops mVSubGroupMergedStops = (MVSubGroupMergedStops) obj;
        boolean g = mo27538g();
        boolean g2 = mVSubGroupMergedStops.mo27538g();
        if ((g || g2) && (!g || !g2 || !this.subGroup.mo27526a(mVSubGroupMergedStops.subGroup))) {
            return false;
        }
        boolean f = mo27537f();
        boolean f2 = mVSubGroupMergedStops.mo27537f();
        if ((f || f2) && (!f || !f2 || !this.stopIdsSequence.equals(mVSubGroupMergedStops.stopIdsSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27537f() {
        return this.stopIdsSequence != null;
    }

    /* renamed from: g */
    public final boolean mo27538g() {
        return this.subGroup != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSubGroupMergedStops(", "subGroup:");
        MVSubGroup mVSubGroup = this.subGroup;
        if (mVSubGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSubGroup);
        }
        n.append(", ");
        n.append("stopIdsSequence:");
        List<Integer> list = this.stopIdsSequence;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
