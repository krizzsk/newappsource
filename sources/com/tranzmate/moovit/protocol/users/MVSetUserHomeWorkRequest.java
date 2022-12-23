package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDayTime;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSetUserHomeWorkRequest implements TBase<MVSetUserHomeWorkRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetUserHomeWorkRequest> {

    /* renamed from: b */
    public static final C25113c f30541b = new C25113c("homeLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30542c = new C25113c("workLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30543d = new C25113c("homeToWorkTime", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30544e = new C25113c("workToHomeTime", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30545f = new C25113c("requestType", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30546g = new C25113c("metroAreaId", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f30547h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30548i;
    private byte __isset_bitfield = 0;
    public MVLocationDescriptor homeLocation;
    public MVDayTime homeToWorkTime;
    public int metroAreaId;
    private _Fields[] optionals = {_Fields.HOME_LOCATION, _Fields.WORK_LOCATION, _Fields.HOME_TO_WORK_TIME, _Fields.WORK_TO_HOME_TIME};
    public MVHomeWorkRequestType requestType;
    public MVLocationDescriptor workLocation;
    public MVDayTime workToHomeTime;

    public enum _Fields implements C25085c {
        HOME_LOCATION(1, "homeLocation"),
        WORK_LOCATION(2, "workLocation"),
        HOME_TO_WORK_TIME(3, "homeToWorkTime"),
        WORK_TO_HOME_TIME(4, "workToHomeTime"),
        REQUEST_TYPE(5, "requestType"),
        METRO_AREA_ID(6, "metroAreaId");
        
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
            switch (i) {
                case 1:
                    return HOME_LOCATION;
                case 2:
                    return WORK_LOCATION;
                case 3:
                    return HOME_TO_WORK_TIME;
                case 4:
                    return WORK_TO_HOME_TIME;
                case 5:
                    return REQUEST_TYPE;
                case 6:
                    return METRO_AREA_ID;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserHomeWorkRequest$a */
    public static class C11901a extends C25239c<MVSetUserHomeWorkRequest> {
        public C11901a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) tBase;
            mVSetUserHomeWorkRequest.mo35360m();
            C25113c cVar = MVSetUserHomeWorkRequest.f30541b;
            gVar.mo61687K();
            if (mVSetUserHomeWorkRequest.homeLocation != null && mVSetUserHomeWorkRequest.mo35352f()) {
                gVar.mo61711x(MVSetUserHomeWorkRequest.f30541b);
                mVSetUserHomeWorkRequest.homeLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetUserHomeWorkRequest.workLocation != null && mVSetUserHomeWorkRequest.mo35357j()) {
                gVar.mo61711x(MVSetUserHomeWorkRequest.f30542c);
                mVSetUserHomeWorkRequest.workLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetUserHomeWorkRequest.homeToWorkTime != null && mVSetUserHomeWorkRequest.mo35353g()) {
                gVar.mo61711x(MVSetUserHomeWorkRequest.f30543d);
                mVSetUserHomeWorkRequest.homeToWorkTime.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetUserHomeWorkRequest.workToHomeTime != null && mVSetUserHomeWorkRequest.mo35358k()) {
                gVar.mo61711x(MVSetUserHomeWorkRequest.f30544e);
                mVSetUserHomeWorkRequest.workToHomeTime.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetUserHomeWorkRequest.requestType != null) {
                gVar.mo61711x(MVSetUserHomeWorkRequest.f30545f);
                gVar.mo61678B(mVSetUserHomeWorkRequest.requestType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSetUserHomeWorkRequest.f30546g);
            C16530d.m42020n(gVar, mVSetUserHomeWorkRequest.metroAreaId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetUserHomeWorkRequest.mo35360m();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVSetUserHomeWorkRequest.homeLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVSetUserHomeWorkRequest.workLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDayTime mVDayTime = new MVDayTime();
                            mVSetUserHomeWorkRequest.homeToWorkTime = mVDayTime;
                            mVDayTime.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDayTime mVDayTime2 = new MVDayTime();
                            mVSetUserHomeWorkRequest.workToHomeTime = mVDayTime2;
                            mVDayTime2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserHomeWorkRequest.requestType = MVHomeWorkRequestType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserHomeWorkRequest.metroAreaId = gVar.mo61696i();
                            mVSetUserHomeWorkRequest.mo35359l();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserHomeWorkRequest$b */
    public static class C11902b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11901a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserHomeWorkRequest$c */
    public static class C11903c extends C25240d<MVSetUserHomeWorkRequest> {
        public C11903c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetUserHomeWorkRequest.mo35352f()) {
                bitSet.set(0);
            }
            if (mVSetUserHomeWorkRequest.mo35357j()) {
                bitSet.set(1);
            }
            if (mVSetUserHomeWorkRequest.mo35353g()) {
                bitSet.set(2);
            }
            if (mVSetUserHomeWorkRequest.mo35358k()) {
                bitSet.set(3);
            }
            if (mVSetUserHomeWorkRequest.mo35356i()) {
                bitSet.set(4);
            }
            if (mVSetUserHomeWorkRequest.mo35354h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVSetUserHomeWorkRequest.mo35352f()) {
                mVSetUserHomeWorkRequest.homeLocation.mo25202X0(jVar);
            }
            if (mVSetUserHomeWorkRequest.mo35357j()) {
                mVSetUserHomeWorkRequest.workLocation.mo25202X0(jVar);
            }
            if (mVSetUserHomeWorkRequest.mo35353g()) {
                mVSetUserHomeWorkRequest.homeToWorkTime.mo25202X0(jVar);
            }
            if (mVSetUserHomeWorkRequest.mo35358k()) {
                mVSetUserHomeWorkRequest.workToHomeTime.mo25202X0(jVar);
            }
            if (mVSetUserHomeWorkRequest.mo35356i()) {
                jVar.mo61678B(mVSetUserHomeWorkRequest.requestType.getValue());
            }
            if (mVSetUserHomeWorkRequest.mo35354h()) {
                jVar.mo61678B(mVSetUserHomeWorkRequest.metroAreaId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVSetUserHomeWorkRequest.homeLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVSetUserHomeWorkRequest.workLocation = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVDayTime mVDayTime = new MVDayTime();
                mVSetUserHomeWorkRequest.homeToWorkTime = mVDayTime;
                mVDayTime.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVDayTime mVDayTime2 = new MVDayTime();
                mVSetUserHomeWorkRequest.workToHomeTime = mVDayTime2;
                mVDayTime2.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVSetUserHomeWorkRequest.requestType = MVHomeWorkRequestType.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVSetUserHomeWorkRequest.metroAreaId = jVar.mo61696i();
                mVSetUserHomeWorkRequest.mo35359l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserHomeWorkRequest$d */
    public static class C11904d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11903c(0);
        }
    }

    static {
        new C17394d0("MVSetUserHomeWorkRequest");
        HashMap hashMap = new HashMap();
        f30547h = hashMap;
        hashMap.put(C25239c.class, new C11902b());
        hashMap.put(C25240d.class, new C11904d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HOME_LOCATION, new FieldMetaData("homeLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.WORK_LOCATION, new FieldMetaData("workLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.HOME_TO_WORK_TIME, new FieldMetaData("homeToWorkTime", (byte) 2, new StructMetaData(MVDayTime.class)));
        enumMap.put(_Fields.WORK_TO_HOME_TIME, new FieldMetaData("workToHomeTime", (byte) 2, new StructMetaData(MVDayTime.class)));
        enumMap.put(_Fields.REQUEST_TYPE, new FieldMetaData("requestType", (byte) 3, new EnumMetaData(MVHomeWorkRequestType.class)));
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30548i = unmodifiableMap;
        FieldMetaData.m61947a(MVSetUserHomeWorkRequest.class, unmodifiableMap);
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
        ((C25238b) f30547h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30547h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) obj;
        if (!getClass().equals(mVSetUserHomeWorkRequest.getClass())) {
            return getClass().getName().compareTo(mVSetUserHomeWorkRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35352f()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35352f()));
        if (compareTo != 0 || ((mo35352f() && (compareTo = this.homeLocation.compareTo(mVSetUserHomeWorkRequest.homeLocation)) != 0) || (compareTo = Boolean.valueOf(mo35357j()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35357j()))) != 0 || ((mo35357j() && (compareTo = this.workLocation.compareTo(mVSetUserHomeWorkRequest.workLocation)) != 0) || (compareTo = Boolean.valueOf(mo35353g()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35353g()))) != 0 || ((mo35353g() && (compareTo = this.homeToWorkTime.compareTo(mVSetUserHomeWorkRequest.homeToWorkTime)) != 0) || (compareTo = Boolean.valueOf(mo35358k()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35358k()))) != 0 || ((mo35358k() && (compareTo = this.workToHomeTime.compareTo(mVSetUserHomeWorkRequest.workToHomeTime)) != 0) || (compareTo = Boolean.valueOf(mo35356i()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35356i()))) != 0 || ((mo35356i() && (compareTo = this.requestType.compareTo(mVSetUserHomeWorkRequest.requestType)) != 0) || (compareTo = Boolean.valueOf(mo35354h()).compareTo(Boolean.valueOf(mVSetUserHomeWorkRequest.mo35354h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo35354h() || (c = C25082a.m62839c(this.metroAreaId, mVSetUserHomeWorkRequest.metroAreaId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetUserHomeWorkRequest)) {
            return false;
        }
        MVSetUserHomeWorkRequest mVSetUserHomeWorkRequest = (MVSetUserHomeWorkRequest) obj;
        boolean f = mo35352f();
        boolean f2 = mVSetUserHomeWorkRequest.mo35352f();
        if ((f || f2) && (!f || !f2 || !this.homeLocation.mo26317a(mVSetUserHomeWorkRequest.homeLocation))) {
            return false;
        }
        boolean j = mo35357j();
        boolean j2 = mVSetUserHomeWorkRequest.mo35357j();
        if ((j || j2) && (!j || !j2 || !this.workLocation.mo26317a(mVSetUserHomeWorkRequest.workLocation))) {
            return false;
        }
        boolean g = mo35353g();
        boolean g2 = mVSetUserHomeWorkRequest.mo35353g();
        if ((g || g2) && (!g || !g2 || !this.homeToWorkTime.mo26115a(mVSetUserHomeWorkRequest.homeToWorkTime))) {
            return false;
        }
        boolean k = mo35358k();
        boolean k2 = mVSetUserHomeWorkRequest.mo35358k();
        if ((k || k2) && (!k || !k2 || !this.workToHomeTime.mo26115a(mVSetUserHomeWorkRequest.workToHomeTime))) {
            return false;
        }
        boolean i = mo35356i();
        boolean i2 = mVSetUserHomeWorkRequest.mo35356i();
        if (((i || i2) && (!i || !i2 || !this.requestType.equals(mVSetUserHomeWorkRequest.requestType))) || this.metroAreaId != mVSetUserHomeWorkRequest.metroAreaId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35352f() {
        return this.homeLocation != null;
    }

    /* renamed from: g */
    public final boolean mo35353g() {
        return this.homeToWorkTime != null;
    }

    /* renamed from: h */
    public final boolean mo35354h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35356i() {
        return this.requestType != null;
    }

    /* renamed from: j */
    public final boolean mo35357j() {
        return this.workLocation != null;
    }

    /* renamed from: k */
    public final boolean mo35358k() {
        return this.workToHomeTime != null;
    }

    /* renamed from: l */
    public final void mo35359l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo35360m() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.homeLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.workLocation;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
        MVDayTime mVDayTime = this.homeToWorkTime;
        if (mVDayTime != null) {
            mVDayTime.getClass();
        }
        MVDayTime mVDayTime2 = this.workToHomeTime;
        if (mVDayTime2 != null) {
            mVDayTime2.getClass();
        }
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVSetUserHomeWorkRequest(");
        boolean z2 = false;
        if (mo35352f()) {
            sb.append("homeLocation:");
            MVLocationDescriptor mVLocationDescriptor = this.homeLocation;
            if (mVLocationDescriptor == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLocationDescriptor);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo35357j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("workLocation:");
            MVLocationDescriptor mVLocationDescriptor2 = this.workLocation;
            if (mVLocationDescriptor2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLocationDescriptor2);
            }
            z = false;
        }
        if (mo35353g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("homeToWorkTime:");
            MVDayTime mVDayTime = this.homeToWorkTime;
            if (mVDayTime == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVDayTime);
            }
            z = false;
        }
        if (mo35358k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("workToHomeTime:");
            MVDayTime mVDayTime2 = this.workToHomeTime;
            if (mVDayTime2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVDayTime2);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("requestType:");
        MVHomeWorkRequestType mVHomeWorkRequestType = this.requestType;
        if (mVHomeWorkRequestType == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVHomeWorkRequestType);
        }
        sb.append(", ");
        sb.append("metroAreaId:");
        return C13437d.m33707l(sb, this.metroAreaId, ")");
    }
}
