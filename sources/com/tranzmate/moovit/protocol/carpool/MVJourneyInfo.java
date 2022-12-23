package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVJourneyInfo implements TBase<MVJourneyInfo, _Fields>, Serializable, Cloneable, Comparable<MVJourneyInfo> {

    /* renamed from: b */
    public static final C25113c f24724b = new C25113c("pickup", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24725c = new C25113c("dropoff", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24726d = new C25113c("pickupComment", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24727e = new C25113c("dropOffComment", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f24728f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24729g;
    public String dropOffComment;
    public MVRideLocationDescriptor dropoff;
    private _Fields[] optionals = {_Fields.PICKUP_COMMENT, _Fields.DROP_OFF_COMMENT};
    public MVRideLocationDescriptor pickup;
    public String pickupComment;

    public enum _Fields implements C25085c {
        PICKUP(1, "pickup"),
        DROPOFF(2, "dropoff"),
        PICKUP_COMMENT(3, "pickupComment"),
        DROP_OFF_COMMENT(4, "dropOffComment");
        
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
                return PICKUP;
            }
            if (i == 2) {
                return DROPOFF;
            }
            if (i == 3) {
                return PICKUP_COMMENT;
            }
            if (i != 4) {
                return null;
            }
            return DROP_OFF_COMMENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVJourneyInfo$a */
    public static class C8222a extends C25239c<MVJourneyInfo> {
        public C8222a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVJourneyInfo mVJourneyInfo = (MVJourneyInfo) tBase;
            MVRideLocationDescriptor mVRideLocationDescriptor = mVJourneyInfo.pickup;
            if (mVRideLocationDescriptor != null) {
                mVRideLocationDescriptor.mo25878j();
            }
            MVRideLocationDescriptor mVRideLocationDescriptor2 = mVJourneyInfo.dropoff;
            if (mVRideLocationDescriptor2 != null) {
                mVRideLocationDescriptor2.mo25878j();
            }
            C25113c cVar = MVJourneyInfo.f24724b;
            gVar.mo61687K();
            if (mVJourneyInfo.pickup != null) {
                gVar.mo61711x(MVJourneyInfo.f24724b);
                mVJourneyInfo.pickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVJourneyInfo.dropoff != null) {
                gVar.mo61711x(MVJourneyInfo.f24725c);
                mVJourneyInfo.dropoff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVJourneyInfo.pickupComment != null && mVJourneyInfo.mo25641i()) {
                gVar.mo61711x(MVJourneyInfo.f24726d);
                gVar.mo61686J(mVJourneyInfo.pickupComment);
                gVar.mo61712y();
            }
            if (mVJourneyInfo.dropOffComment != null && mVJourneyInfo.mo25637f()) {
                gVar.mo61711x(MVJourneyInfo.f24727e);
                gVar.mo61686J(mVJourneyInfo.dropOffComment);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVJourneyInfo mVJourneyInfo = (MVJourneyInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVJourneyInfo.dropOffComment = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVJourneyInfo.pickupComment = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVRideLocationDescriptor mVRideLocationDescriptor = new MVRideLocationDescriptor();
                        mVJourneyInfo.dropoff = mVRideLocationDescriptor;
                        mVRideLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVRideLocationDescriptor mVRideLocationDescriptor2 = new MVRideLocationDescriptor();
                    mVJourneyInfo.pickup = mVRideLocationDescriptor2;
                    mVRideLocationDescriptor2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRideLocationDescriptor mVRideLocationDescriptor3 = mVJourneyInfo.pickup;
            if (mVRideLocationDescriptor3 != null) {
                mVRideLocationDescriptor3.mo25878j();
            }
            MVRideLocationDescriptor mVRideLocationDescriptor4 = mVJourneyInfo.dropoff;
            if (mVRideLocationDescriptor4 != null) {
                mVRideLocationDescriptor4.mo25878j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVJourneyInfo$b */
    public static class C8223b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8222a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVJourneyInfo$c */
    public static class C8224c extends C25240d<MVJourneyInfo> {
        public C8224c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVJourneyInfo mVJourneyInfo = (MVJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVJourneyInfo.mo25639h()) {
                bitSet.set(0);
            }
            if (mVJourneyInfo.mo25638g()) {
                bitSet.set(1);
            }
            if (mVJourneyInfo.mo25641i()) {
                bitSet.set(2);
            }
            if (mVJourneyInfo.mo25637f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVJourneyInfo.mo25639h()) {
                mVJourneyInfo.pickup.mo25202X0(jVar);
            }
            if (mVJourneyInfo.mo25638g()) {
                mVJourneyInfo.dropoff.mo25202X0(jVar);
            }
            if (mVJourneyInfo.mo25641i()) {
                jVar.mo61686J(mVJourneyInfo.pickupComment);
            }
            if (mVJourneyInfo.mo25637f()) {
                jVar.mo61686J(mVJourneyInfo.dropOffComment);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVJourneyInfo mVJourneyInfo = (MVJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVRideLocationDescriptor mVRideLocationDescriptor = new MVRideLocationDescriptor();
                mVJourneyInfo.pickup = mVRideLocationDescriptor;
                mVRideLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVRideLocationDescriptor mVRideLocationDescriptor2 = new MVRideLocationDescriptor();
                mVJourneyInfo.dropoff = mVRideLocationDescriptor2;
                mVRideLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVJourneyInfo.pickupComment = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVJourneyInfo.dropOffComment = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVJourneyInfo$d */
    public static class C8225d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8224c(0);
        }
    }

    static {
        new C17394d0("MVJourneyInfo");
        HashMap hashMap = new HashMap();
        f24728f = hashMap;
        hashMap.put(C25239c.class, new C8223b());
        hashMap.put(C25240d.class, new C8225d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICKUP, new FieldMetaData("pickup", (byte) 3, new StructMetaData(MVRideLocationDescriptor.class)));
        enumMap.put(_Fields.DROPOFF, new FieldMetaData("dropoff", (byte) 3, new StructMetaData(MVRideLocationDescriptor.class)));
        enumMap.put(_Fields.PICKUP_COMMENT, new FieldMetaData("pickupComment", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DROP_OFF_COMMENT, new FieldMetaData("dropOffComment", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24729g = unmodifiableMap;
        FieldMetaData.m61947a(MVJourneyInfo.class, unmodifiableMap);
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
        ((C25238b) f24728f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24728f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25634a(MVJourneyInfo mVJourneyInfo) {
        if (mVJourneyInfo == null) {
            return false;
        }
        boolean h = mo25639h();
        boolean h2 = mVJourneyInfo.mo25639h();
        if ((h || h2) && (!h || !h2 || !this.pickup.mo25870a(mVJourneyInfo.pickup))) {
            return false;
        }
        boolean g = mo25638g();
        boolean g2 = mVJourneyInfo.mo25638g();
        if ((g || g2) && (!g || !g2 || !this.dropoff.mo25870a(mVJourneyInfo.dropoff))) {
            return false;
        }
        boolean i = mo25641i();
        boolean i2 = mVJourneyInfo.mo25641i();
        if ((i || i2) && (!i || !i2 || !this.pickupComment.equals(mVJourneyInfo.pickupComment))) {
            return false;
        }
        boolean f = mo25637f();
        boolean f2 = mVJourneyInfo.mo25637f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.dropOffComment.equals(mVJourneyInfo.dropOffComment)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVJourneyInfo mVJourneyInfo = (MVJourneyInfo) obj;
        if (!getClass().equals(mVJourneyInfo.getClass())) {
            return getClass().getName().compareTo(mVJourneyInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25639h()).compareTo(Boolean.valueOf(mVJourneyInfo.mo25639h()));
        if (compareTo2 != 0 || ((mo25639h() && (compareTo2 = this.pickup.compareTo(mVJourneyInfo.pickup)) != 0) || (compareTo2 = Boolean.valueOf(mo25638g()).compareTo(Boolean.valueOf(mVJourneyInfo.mo25638g()))) != 0 || ((mo25638g() && (compareTo2 = this.dropoff.compareTo(mVJourneyInfo.dropoff)) != 0) || (compareTo2 = Boolean.valueOf(mo25641i()).compareTo(Boolean.valueOf(mVJourneyInfo.mo25641i()))) != 0 || ((mo25641i() && (compareTo2 = this.pickupComment.compareTo(mVJourneyInfo.pickupComment)) != 0) || (compareTo2 = Boolean.valueOf(mo25637f()).compareTo(Boolean.valueOf(mVJourneyInfo.mo25637f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25637f() || (compareTo = this.dropOffComment.compareTo(mVJourneyInfo.dropOffComment)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVJourneyInfo)) {
            return mo25634a((MVJourneyInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25637f() {
        return this.dropOffComment != null;
    }

    /* renamed from: g */
    public final boolean mo25638g() {
        return this.dropoff != null;
    }

    /* renamed from: h */
    public final boolean mo25639h() {
        return this.pickup != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25641i() {
        return this.pickupComment != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVJourneyInfo(", "pickup:");
        MVRideLocationDescriptor mVRideLocationDescriptor = this.pickup;
        if (mVRideLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideLocationDescriptor);
        }
        n.append(", ");
        n.append("dropoff:");
        MVRideLocationDescriptor mVRideLocationDescriptor2 = this.dropoff;
        if (mVRideLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideLocationDescriptor2);
        }
        if (mo25641i()) {
            n.append(", ");
            n.append("pickupComment:");
            String str = this.pickupComment;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo25637f()) {
            n.append(", ");
            n.append("dropOffComment:");
            String str2 = this.dropOffComment;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
