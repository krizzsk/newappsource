package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVPTBGetActivationPriceRequest implements TBase<MVPTBGetActivationPriceRequest, _Fields>, Serializable, Cloneable, Comparable<MVPTBGetActivationPriceRequest> {

    /* renamed from: b */
    public static final C25113c f27914b = new C25113c("qrCode", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27915c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27916d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27917e;
    public MVLatLon location;
    public String qrCode;

    public enum _Fields implements C25085c {
        QR_CODE(1, "qrCode"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
                return QR_CODE;
            }
            if (i != 2) {
                return null;
            }
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceRequest$a */
    public static class C10222a extends C25239c<MVPTBGetActivationPriceRequest> {
        public C10222a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) tBase;
            MVLatLon mVLatLon = mVPTBGetActivationPriceRequest.location;
            C25113c cVar = MVPTBGetActivationPriceRequest.f27914b;
            gVar.mo61687K();
            if (mVPTBGetActivationPriceRequest.qrCode != null) {
                gVar.mo61711x(MVPTBGetActivationPriceRequest.f27914b);
                gVar.mo61686J(mVPTBGetActivationPriceRequest.qrCode);
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceRequest.location != null) {
                gVar.mo61711x(MVPTBGetActivationPriceRequest.f27915c);
                mVPTBGetActivationPriceRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPTBGetActivationPriceRequest.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVPTBGetActivationPriceRequest.location = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPTBGetActivationPriceRequest.qrCode = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceRequest$b */
    public static class C10223b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10222a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceRequest$c */
    public static class C10224c extends C25240d<MVPTBGetActivationPriceRequest> {
        public C10224c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBGetActivationPriceRequest.mo30989g()) {
                bitSet.set(0);
            }
            if (mVPTBGetActivationPriceRequest.mo30988f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBGetActivationPriceRequest.mo30989g()) {
                jVar.mo61686J(mVPTBGetActivationPriceRequest.qrCode);
            }
            if (mVPTBGetActivationPriceRequest.mo30988f()) {
                mVPTBGetActivationPriceRequest.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBGetActivationPriceRequest.qrCode = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBGetActivationPriceRequest.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceRequest$d */
    public static class C10225d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10224c(0);
        }
    }

    static {
        new C17394d0("MVPTBGetActivationPriceRequest");
        HashMap hashMap = new HashMap();
        f27916d = hashMap;
        hashMap.put(C25239c.class, new C10223b());
        hashMap.put(C25240d.class, new C10225d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.QR_CODE, new FieldMetaData("qrCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27917e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBGetActivationPriceRequest.class, unmodifiableMap);
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
        ((C25238b) f27916d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27916d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) obj;
        if (!getClass().equals(mVPTBGetActivationPriceRequest.getClass())) {
            return getClass().getName().compareTo(mVPTBGetActivationPriceRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30989g()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceRequest.mo30989g()));
        if (compareTo2 != 0 || ((mo30989g() && (compareTo2 = this.qrCode.compareTo(mVPTBGetActivationPriceRequest.qrCode)) != 0) || (compareTo2 = Boolean.valueOf(mo30988f()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceRequest.mo30988f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30988f() || (compareTo = this.location.compareTo(mVPTBGetActivationPriceRequest.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBGetActivationPriceRequest)) {
            return false;
        }
        MVPTBGetActivationPriceRequest mVPTBGetActivationPriceRequest = (MVPTBGetActivationPriceRequest) obj;
        boolean g = mo30989g();
        boolean g2 = mVPTBGetActivationPriceRequest.mo30989g();
        if ((g || g2) && (!g || !g2 || !this.qrCode.equals(mVPTBGetActivationPriceRequest.qrCode))) {
            return false;
        }
        boolean f = mo30988f();
        boolean f2 = mVPTBGetActivationPriceRequest.mo30988f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26290a(mVPTBGetActivationPriceRequest.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30988f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo30989g() {
        return this.qrCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBGetActivationPriceRequest(", "qrCode:");
        String str = this.qrCode;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }
}
