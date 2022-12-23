package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.usebutton.sdk.internal.api.AppActionRequest;
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

public class MVPTBFinishTrainEstimatedPriceRequest implements TBase<MVPTBFinishTrainEstimatedPriceRequest, _Fields>, Serializable, Cloneable, Comparable<MVPTBFinishTrainEstimatedPriceRequest> {

    /* renamed from: b */
    public static final C25113c f27902b = new C25113c(AppActionRequest.KEY_CONTEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27903c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27904d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27905e;
    public String context;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        CONTEXT(1, AppActionRequest.KEY_CONTEXT),
        USER_LOCATION(2, "userLocation");
        
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
                return CONTEXT;
            }
            if (i != 2) {
                return null;
            }
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceRequest$a */
    public static class C10213a extends C25239c<MVPTBFinishTrainEstimatedPriceRequest> {
        public C10213a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) tBase;
            MVLatLon mVLatLon = mVPTBFinishTrainEstimatedPriceRequest.userLocation;
            C25113c cVar = MVPTBFinishTrainEstimatedPriceRequest.f27902b;
            gVar.mo61687K();
            if (mVPTBFinishTrainEstimatedPriceRequest.context != null) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPriceRequest.f27902b);
                gVar.mo61686J(mVPTBFinishTrainEstimatedPriceRequest.context);
                gVar.mo61712y();
            }
            if (mVPTBFinishTrainEstimatedPriceRequest.userLocation != null) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPriceRequest.f27903c);
                mVPTBFinishTrainEstimatedPriceRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPTBFinishTrainEstimatedPriceRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVPTBFinishTrainEstimatedPriceRequest.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPTBFinishTrainEstimatedPriceRequest.context = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceRequest$b */
    public static class C10214b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10213a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceRequest$c */
    public static class C10215c extends C25240d<MVPTBFinishTrainEstimatedPriceRequest> {
        public C10215c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBFinishTrainEstimatedPriceRequest.mo30965f()) {
                bitSet.set(0);
            }
            if (mVPTBFinishTrainEstimatedPriceRequest.mo30966g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBFinishTrainEstimatedPriceRequest.mo30965f()) {
                jVar.mo61686J(mVPTBFinishTrainEstimatedPriceRequest.context);
            }
            if (mVPTBFinishTrainEstimatedPriceRequest.mo30966g()) {
                mVPTBFinishTrainEstimatedPriceRequest.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBFinishTrainEstimatedPriceRequest.context = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBFinishTrainEstimatedPriceRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPriceRequest$d */
    public static class C10216d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10215c(0);
        }
    }

    static {
        new C17394d0("MVPTBFinishTrainEstimatedPriceRequest");
        HashMap hashMap = new HashMap();
        f27904d = hashMap;
        hashMap.put(C25239c.class, new C10214b());
        hashMap.put(C25240d.class, new C10216d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT, new FieldMetaData(AppActionRequest.KEY_CONTEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27905e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBFinishTrainEstimatedPriceRequest.class, unmodifiableMap);
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
        ((C25238b) f27904d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27904d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) obj;
        if (!getClass().equals(mVPTBFinishTrainEstimatedPriceRequest.getClass())) {
            return getClass().getName().compareTo(mVPTBFinishTrainEstimatedPriceRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30965f()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPriceRequest.mo30965f()));
        if (compareTo2 != 0 || ((mo30965f() && (compareTo2 = this.context.compareTo(mVPTBFinishTrainEstimatedPriceRequest.context)) != 0) || (compareTo2 = Boolean.valueOf(mo30966g()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPriceRequest.mo30966g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30966g() || (compareTo = this.userLocation.compareTo(mVPTBFinishTrainEstimatedPriceRequest.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBFinishTrainEstimatedPriceRequest)) {
            return false;
        }
        MVPTBFinishTrainEstimatedPriceRequest mVPTBFinishTrainEstimatedPriceRequest = (MVPTBFinishTrainEstimatedPriceRequest) obj;
        boolean f = mo30965f();
        boolean f2 = mVPTBFinishTrainEstimatedPriceRequest.mo30965f();
        if ((f || f2) && (!f || !f2 || !this.context.equals(mVPTBFinishTrainEstimatedPriceRequest.context))) {
            return false;
        }
        boolean g = mo30966g();
        boolean g2 = mVPTBFinishTrainEstimatedPriceRequest.mo30966g();
        if ((g || g2) && (!g || !g2 || !this.userLocation.mo26290a(mVPTBFinishTrainEstimatedPriceRequest.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30965f() {
        return this.context != null;
    }

    /* renamed from: g */
    public final boolean mo30966g() {
        return this.userLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBFinishTrainEstimatedPriceRequest(", "context:");
        String str = this.context;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("userLocation:");
        MVLatLon mVLatLon = this.userLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }
}
