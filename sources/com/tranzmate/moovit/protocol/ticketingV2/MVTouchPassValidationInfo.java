package com.tranzmate.moovit.protocol.ticketingV2;

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
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVTouchPassValidationInfo implements TBase<MVTouchPassValidationInfo, _Fields>, Serializable, Cloneable, Comparable<MVTouchPassValidationInfo> {

    /* renamed from: b */
    public static final C25113c f29267b = new C25113c(LinksConfiguration.KEY_KEY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29268c = new C25113c("mediaId", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29269d = new C25113c("cardNumber", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29270e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29271f;
    private byte __isset_bitfield = 0;
    public String cardNumber;
    public String key;
    public long mediaId;

    public enum _Fields implements C25085c {
        KEY(1, LinksConfiguration.KEY_KEY),
        MEDIA_ID(2, "mediaId"),
        CARD_NUMBER(3, "cardNumber");
        
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
                return KEY;
            }
            if (i == 2) {
                return MEDIA_ID;
            }
            if (i != 3) {
                return null;
            }
            return CARD_NUMBER;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTouchPassValidationInfo$a */
    public static class C11119a extends C25239c<MVTouchPassValidationInfo> {
        public C11119a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) tBase;
            mVTouchPassValidationInfo.getClass();
            C25113c cVar = MVTouchPassValidationInfo.f29267b;
            gVar.mo61687K();
            if (mVTouchPassValidationInfo.key != null) {
                gVar.mo61711x(MVTouchPassValidationInfo.f29267b);
                gVar.mo61686J(mVTouchPassValidationInfo.key);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTouchPassValidationInfo.f29268c);
            gVar.mo61679C(mVTouchPassValidationInfo.mediaId);
            gVar.mo61712y();
            if (mVTouchPassValidationInfo.cardNumber != null) {
                gVar.mo61711x(MVTouchPassValidationInfo.f29269d);
                gVar.mo61686J(mVTouchPassValidationInfo.cardNumber);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTouchPassValidationInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVTouchPassValidationInfo.cardNumber = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVTouchPassValidationInfo.mediaId = gVar.mo61697j();
                        mVTouchPassValidationInfo.mo33208i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTouchPassValidationInfo.key = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTouchPassValidationInfo$b */
    public static class C11120b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11119a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTouchPassValidationInfo$c */
    public static class C11121c extends C25240d<MVTouchPassValidationInfo> {
        public C11121c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTouchPassValidationInfo.mo33205g()) {
                bitSet.set(0);
            }
            if (mVTouchPassValidationInfo.mo33206h()) {
                bitSet.set(1);
            }
            if (mVTouchPassValidationInfo.mo33204f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTouchPassValidationInfo.mo33205g()) {
                jVar.mo61686J(mVTouchPassValidationInfo.key);
            }
            if (mVTouchPassValidationInfo.mo33206h()) {
                jVar.mo61679C(mVTouchPassValidationInfo.mediaId);
            }
            if (mVTouchPassValidationInfo.mo33204f()) {
                jVar.mo61686J(mVTouchPassValidationInfo.cardNumber);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTouchPassValidationInfo.key = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTouchPassValidationInfo.mediaId = jVar.mo61697j();
                mVTouchPassValidationInfo.mo33208i();
            }
            if (T.get(2)) {
                mVTouchPassValidationInfo.cardNumber = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTouchPassValidationInfo$d */
    public static class C11122d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11121c(0);
        }
    }

    static {
        new C17394d0("MVTouchPassValidationInfo");
        HashMap hashMap = new HashMap();
        f29270e = hashMap;
        hashMap.put(C25239c.class, new C11120b());
        hashMap.put(C25240d.class, new C11122d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.KEY, new FieldMetaData(LinksConfiguration.KEY_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MEDIA_ID, new FieldMetaData("mediaId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.CARD_NUMBER, new FieldMetaData("cardNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29271f = unmodifiableMap;
        FieldMetaData.m61947a(MVTouchPassValidationInfo.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f29270e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29270e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) obj;
        if (!getClass().equals(mVTouchPassValidationInfo.getClass())) {
            return getClass().getName().compareTo(mVTouchPassValidationInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33205g()).compareTo(Boolean.valueOf(mVTouchPassValidationInfo.mo33205g()));
        if (compareTo2 != 0 || ((mo33205g() && (compareTo2 = this.key.compareTo(mVTouchPassValidationInfo.key)) != 0) || (compareTo2 = Boolean.valueOf(mo33206h()).compareTo(Boolean.valueOf(mVTouchPassValidationInfo.mo33206h()))) != 0 || ((mo33206h() && (compareTo2 = C25082a.m62840d(this.mediaId, mVTouchPassValidationInfo.mediaId)) != 0) || (compareTo2 = Boolean.valueOf(mo33204f()).compareTo(Boolean.valueOf(mVTouchPassValidationInfo.mo33204f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33204f() || (compareTo = this.cardNumber.compareTo(mVTouchPassValidationInfo.cardNumber)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTouchPassValidationInfo)) {
            return false;
        }
        MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) obj;
        boolean g = mo33205g();
        boolean g2 = mVTouchPassValidationInfo.mo33205g();
        if (((g || g2) && (!g || !g2 || !this.key.equals(mVTouchPassValidationInfo.key))) || this.mediaId != mVTouchPassValidationInfo.mediaId) {
            return false;
        }
        boolean f = mo33204f();
        boolean f2 = mVTouchPassValidationInfo.mo33204f();
        if ((f || f2) && (!f || !f2 || !this.cardNumber.equals(mVTouchPassValidationInfo.cardNumber))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33204f() {
        return this.cardNumber != null;
    }

    /* renamed from: g */
    public final boolean mo33205g() {
        return this.key != null;
    }

    /* renamed from: h */
    public final boolean mo33206h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33208i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTouchPassValidationInfo(", "key:");
        String str = this.key;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("mediaId:");
        C25541a.m63889t(n, this.mediaId, ", ", "cardNumber:");
        String str2 = this.cardNumber;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
