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
import p001a0.C0016g;
import p001a0.C0017h;
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

public class MVPTBFinishTrainActivationRequest implements TBase<MVPTBFinishTrainActivationRequest, _Fields>, Serializable, Cloneable, Comparable<MVPTBFinishTrainActivationRequest> {

    /* renamed from: b */
    public static final C25113c f27885b = new C25113c(AppActionRequest.KEY_CONTEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27886c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27887d = new C25113c("fromStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27888e = new C25113c("priceReference", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27889f = new C25113c("manualClosing", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f27890g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27891h;
    private byte __isset_bitfield = 0;
    public String context;
    public int fromStopId;
    public boolean manualClosing;
    public String priceReference;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        CONTEXT(1, AppActionRequest.KEY_CONTEXT),
        USER_LOCATION(2, "userLocation"),
        FROM_STOP_ID(3, "fromStopId"),
        PRICE_REFERENCE(4, "priceReference"),
        MANUAL_CLOSING(5, "manualClosing");
        
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
            if (i == 2) {
                return USER_LOCATION;
            }
            if (i == 3) {
                return FROM_STOP_ID;
            }
            if (i == 4) {
                return PRICE_REFERENCE;
            }
            if (i != 5) {
                return null;
            }
            return MANUAL_CLOSING;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationRequest$a */
    public static class C10201a extends C25239c<MVPTBFinishTrainActivationRequest> {
        public C10201a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) tBase;
            MVLatLon mVLatLon = mVPTBFinishTrainActivationRequest.userLocation;
            C25113c cVar = MVPTBFinishTrainActivationRequest.f27885b;
            gVar.mo61687K();
            if (mVPTBFinishTrainActivationRequest.context != null) {
                gVar.mo61711x(MVPTBFinishTrainActivationRequest.f27885b);
                gVar.mo61686J(mVPTBFinishTrainActivationRequest.context);
                gVar.mo61712y();
            }
            if (mVPTBFinishTrainActivationRequest.userLocation != null) {
                gVar.mo61711x(MVPTBFinishTrainActivationRequest.f27886c);
                mVPTBFinishTrainActivationRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBFinishTrainActivationRequest.f27887d);
            gVar.mo61678B(mVPTBFinishTrainActivationRequest.fromStopId);
            gVar.mo61712y();
            if (mVPTBFinishTrainActivationRequest.priceReference != null) {
                gVar.mo61711x(MVPTBFinishTrainActivationRequest.f27888e);
                gVar.mo61686J(mVPTBFinishTrainActivationRequest.priceReference);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBFinishTrainActivationRequest.f27889f);
            C0017h.m62S(gVar, mVPTBFinishTrainActivationRequest.manualClosing);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPTBFinishTrainActivationRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVPTBFinishTrainActivationRequest.manualClosing = gVar.mo61690c();
                                    mVPTBFinishTrainActivationRequest.mo30943l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPTBFinishTrainActivationRequest.priceReference = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPTBFinishTrainActivationRequest.fromStopId = gVar.mo61696i();
                            mVPTBFinishTrainActivationRequest.mo30942k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVPTBFinishTrainActivationRequest.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPTBFinishTrainActivationRequest.context = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationRequest$b */
    public static class C10202b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10201a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationRequest$c */
    public static class C10203c extends C25240d<MVPTBFinishTrainActivationRequest> {
        public C10203c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBFinishTrainActivationRequest.mo30936f()) {
                bitSet.set(0);
            }
            if (mVPTBFinishTrainActivationRequest.mo30941j()) {
                bitSet.set(1);
            }
            if (mVPTBFinishTrainActivationRequest.mo30937g()) {
                bitSet.set(2);
            }
            if (mVPTBFinishTrainActivationRequest.mo30940i()) {
                bitSet.set(3);
            }
            if (mVPTBFinishTrainActivationRequest.mo30938h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPTBFinishTrainActivationRequest.mo30936f()) {
                jVar.mo61686J(mVPTBFinishTrainActivationRequest.context);
            }
            if (mVPTBFinishTrainActivationRequest.mo30941j()) {
                mVPTBFinishTrainActivationRequest.userLocation.mo25202X0(jVar);
            }
            if (mVPTBFinishTrainActivationRequest.mo30937g()) {
                jVar.mo61678B(mVPTBFinishTrainActivationRequest.fromStopId);
            }
            if (mVPTBFinishTrainActivationRequest.mo30940i()) {
                jVar.mo61686J(mVPTBFinishTrainActivationRequest.priceReference);
            }
            if (mVPTBFinishTrainActivationRequest.mo30938h()) {
                jVar.mo61708u(mVPTBFinishTrainActivationRequest.manualClosing);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPTBFinishTrainActivationRequest.context = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBFinishTrainActivationRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPTBFinishTrainActivationRequest.fromStopId = jVar.mo61696i();
                mVPTBFinishTrainActivationRequest.mo30942k();
            }
            if (T.get(3)) {
                mVPTBFinishTrainActivationRequest.priceReference = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPTBFinishTrainActivationRequest.manualClosing = jVar.mo61690c();
                mVPTBFinishTrainActivationRequest.mo30943l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationRequest$d */
    public static class C10204d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10203c(0);
        }
    }

    static {
        new C17394d0("MVPTBFinishTrainActivationRequest");
        HashMap hashMap = new HashMap();
        f27890g = hashMap;
        hashMap.put(C25239c.class, new C10202b());
        hashMap.put(C25240d.class, new C10204d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT, new FieldMetaData(AppActionRequest.KEY_CONTEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.FROM_STOP_ID, new FieldMetaData("fromStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRICE_REFERENCE, new FieldMetaData("priceReference", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MANUAL_CLOSING, new FieldMetaData("manualClosing", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27891h = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBFinishTrainActivationRequest.class, unmodifiableMap);
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
        ((C25238b) f27890g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27890g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) obj;
        if (!getClass().equals(mVPTBFinishTrainActivationRequest.getClass())) {
            return getClass().getName().compareTo(mVPTBFinishTrainActivationRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30936f()).compareTo(Boolean.valueOf(mVPTBFinishTrainActivationRequest.mo30936f()));
        if (compareTo != 0 || ((mo30936f() && (compareTo = this.context.compareTo(mVPTBFinishTrainActivationRequest.context)) != 0) || (compareTo = Boolean.valueOf(mo30941j()).compareTo(Boolean.valueOf(mVPTBFinishTrainActivationRequest.mo30941j()))) != 0 || ((mo30941j() && (compareTo = this.userLocation.compareTo(mVPTBFinishTrainActivationRequest.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo30937g()).compareTo(Boolean.valueOf(mVPTBFinishTrainActivationRequest.mo30937g()))) != 0 || ((mo30937g() && (compareTo = C25082a.m62839c(this.fromStopId, mVPTBFinishTrainActivationRequest.fromStopId)) != 0) || (compareTo = Boolean.valueOf(mo30940i()).compareTo(Boolean.valueOf(mVPTBFinishTrainActivationRequest.mo30940i()))) != 0 || ((mo30940i() && (compareTo = this.priceReference.compareTo(mVPTBFinishTrainActivationRequest.priceReference)) != 0) || (compareTo = Boolean.valueOf(mo30938h()).compareTo(Boolean.valueOf(mVPTBFinishTrainActivationRequest.mo30938h()))) != 0))))) {
            return compareTo;
        }
        if (!mo30938h() || (l = C25082a.m62848l(this.manualClosing, mVPTBFinishTrainActivationRequest.manualClosing)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBFinishTrainActivationRequest)) {
            return false;
        }
        MVPTBFinishTrainActivationRequest mVPTBFinishTrainActivationRequest = (MVPTBFinishTrainActivationRequest) obj;
        boolean f = mo30936f();
        boolean f2 = mVPTBFinishTrainActivationRequest.mo30936f();
        if ((f || f2) && (!f || !f2 || !this.context.equals(mVPTBFinishTrainActivationRequest.context))) {
            return false;
        }
        boolean j = mo30941j();
        boolean j2 = mVPTBFinishTrainActivationRequest.mo30941j();
        if (((j || j2) && (!j || !j2 || !this.userLocation.mo26290a(mVPTBFinishTrainActivationRequest.userLocation))) || this.fromStopId != mVPTBFinishTrainActivationRequest.fromStopId) {
            return false;
        }
        boolean i = mo30940i();
        boolean i2 = mVPTBFinishTrainActivationRequest.mo30940i();
        if (((i || i2) && (!i || !i2 || !this.priceReference.equals(mVPTBFinishTrainActivationRequest.priceReference))) || this.manualClosing != mVPTBFinishTrainActivationRequest.manualClosing) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30936f() {
        return this.context != null;
    }

    /* renamed from: g */
    public final boolean mo30937g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30938h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30940i() {
        return this.priceReference != null;
    }

    /* renamed from: j */
    public final boolean mo30941j() {
        return this.userLocation != null;
    }

    /* renamed from: k */
    public final void mo30942k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo30943l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBFinishTrainActivationRequest(", "context:");
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
        n.append(", ");
        n.append("fromStopId:");
        C0016g.m42z(n, this.fromStopId, ", ", "priceReference:");
        String str2 = this.priceReference;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("manualClosing:");
        return C25541a.m63885p(n, this.manualClosing, ")");
    }
}
