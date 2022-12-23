package com.tranzmate.moovit.protocol.tod.passenger;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVTodPassengerAction implements TBase<MVTodPassengerAction, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerAction> {

    /* renamed from: b */
    public static final C25113c f29456b = new C25113c("actionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29457c = new C25113c("buttonSpec", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29458d = new C25113c("requiredInfoType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29459e = new C25113c("requiredInfoData", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29460f = new C25113c("instructions", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f29461g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29462h;
    public String actionId;
    public MVTodPassengerButtonSpec buttonSpec;
    public String instructions;
    private _Fields[] optionals = {_Fields.REQUIRED_INFO_DATA, _Fields.INSTRUCTIONS};
    public MVTodPassengerActionRequiredInfoData requiredInfoData;
    public MVTodPassengerActionRequiredInfoType requiredInfoType;

    public enum _Fields implements C25085c {
        ACTION_ID(1, "actionId"),
        BUTTON_SPEC(2, "buttonSpec"),
        REQUIRED_INFO_TYPE(3, "requiredInfoType"),
        REQUIRED_INFO_DATA(4, "requiredInfoData"),
        INSTRUCTIONS(5, "instructions");
        
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
                return ACTION_ID;
            }
            if (i == 2) {
                return BUTTON_SPEC;
            }
            if (i == 3) {
                return REQUIRED_INFO_TYPE;
            }
            if (i == 4) {
                return REQUIRED_INFO_DATA;
            }
            if (i != 5) {
                return null;
            }
            return INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction$a */
    public static class C11253a extends C25239c<MVTodPassengerAction> {
        public C11253a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerAction mVTodPassengerAction = (MVTodPassengerAction) tBase;
            mVTodPassengerAction.getClass();
            C25113c cVar = MVTodPassengerAction.f29456b;
            gVar.mo61687K();
            if (mVTodPassengerAction.actionId != null) {
                gVar.mo61711x(MVTodPassengerAction.f29456b);
                gVar.mo61686J(mVTodPassengerAction.actionId);
                gVar.mo61712y();
            }
            if (mVTodPassengerAction.buttonSpec != null) {
                gVar.mo61711x(MVTodPassengerAction.f29457c);
                mVTodPassengerAction.buttonSpec.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodPassengerAction.requiredInfoType != null) {
                gVar.mo61711x(MVTodPassengerAction.f29458d);
                gVar.mo61678B(mVTodPassengerAction.requiredInfoType.getValue());
                gVar.mo61712y();
            }
            if (mVTodPassengerAction.requiredInfoData != null && mVTodPassengerAction.mo33536i()) {
                gVar.mo61711x(MVTodPassengerAction.f29459e);
                mVTodPassengerAction.requiredInfoData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodPassengerAction.instructions != null && mVTodPassengerAction.mo33534h()) {
                gVar.mo61711x(MVTodPassengerAction.f29460f);
                gVar.mo61686J(mVTodPassengerAction.instructions);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerAction mVTodPassengerAction = (MVTodPassengerAction) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodPassengerAction.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVTodPassengerAction.instructions = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVTodPassengerActionRequiredInfoData mVTodPassengerActionRequiredInfoData = new MVTodPassengerActionRequiredInfoData();
                                mVTodPassengerAction.requiredInfoData = mVTodPassengerActionRequiredInfoData;
                                mVTodPassengerActionRequiredInfoData.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVTodPassengerAction.requiredInfoType = MVTodPassengerActionRequiredInfoType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTodPassengerButtonSpec mVTodPassengerButtonSpec = new MVTodPassengerButtonSpec();
                        mVTodPassengerAction.buttonSpec = mVTodPassengerButtonSpec;
                        mVTodPassengerButtonSpec.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPassengerAction.actionId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction$b */
    public static class C11254b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11253a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction$c */
    public static class C11255c extends C25240d<MVTodPassengerAction> {
        public C11255c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerAction mVTodPassengerAction = (MVTodPassengerAction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerAction.mo33532f()) {
                bitSet.set(0);
            }
            if (mVTodPassengerAction.mo33533g()) {
                bitSet.set(1);
            }
            if (mVTodPassengerAction.mo33537j()) {
                bitSet.set(2);
            }
            if (mVTodPassengerAction.mo33536i()) {
                bitSet.set(3);
            }
            if (mVTodPassengerAction.mo33534h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTodPassengerAction.mo33532f()) {
                jVar.mo61686J(mVTodPassengerAction.actionId);
            }
            if (mVTodPassengerAction.mo33533g()) {
                mVTodPassengerAction.buttonSpec.mo25202X0(jVar);
            }
            if (mVTodPassengerAction.mo33537j()) {
                jVar.mo61678B(mVTodPassengerAction.requiredInfoType.getValue());
            }
            if (mVTodPassengerAction.mo33536i()) {
                mVTodPassengerAction.requiredInfoData.mo25202X0(jVar);
            }
            if (mVTodPassengerAction.mo33534h()) {
                jVar.mo61686J(mVTodPassengerAction.instructions);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerAction mVTodPassengerAction = (MVTodPassengerAction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVTodPassengerAction.actionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTodPassengerButtonSpec mVTodPassengerButtonSpec = new MVTodPassengerButtonSpec();
                mVTodPassengerAction.buttonSpec = mVTodPassengerButtonSpec;
                mVTodPassengerButtonSpec.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodPassengerAction.requiredInfoType = MVTodPassengerActionRequiredInfoType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVTodPassengerActionRequiredInfoData mVTodPassengerActionRequiredInfoData = new MVTodPassengerActionRequiredInfoData();
                mVTodPassengerAction.requiredInfoData = mVTodPassengerActionRequiredInfoData;
                mVTodPassengerActionRequiredInfoData.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTodPassengerAction.instructions = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction$d */
    public static class C11256d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11255c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerAction");
        HashMap hashMap = new HashMap();
        f29461g = hashMap;
        hashMap.put(C25239c.class, new C11254b());
        hashMap.put(C25240d.class, new C11256d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTION_ID, new FieldMetaData("actionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BUTTON_SPEC, new FieldMetaData("buttonSpec", (byte) 3, new StructMetaData(MVTodPassengerButtonSpec.class)));
        enumMap.put(_Fields.REQUIRED_INFO_TYPE, new FieldMetaData("requiredInfoType", (byte) 3, new EnumMetaData(MVTodPassengerActionRequiredInfoType.class)));
        enumMap.put(_Fields.REQUIRED_INFO_DATA, new FieldMetaData("requiredInfoData", (byte) 2, new StructMetaData(MVTodPassengerActionRequiredInfoData.class)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29462h = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerAction.class, unmodifiableMap);
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
        ((C25238b) f29461g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29461g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33529a(com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo33532f()
            boolean r2 = r7.mo33532f()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0021
        L_0x0010:
            if (r1 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x0016
            goto L_0x00a8
        L_0x0016:
            java.lang.String r1 = r6.actionId
            java.lang.String r2 = r7.actionId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0021
            return r0
        L_0x0021:
            boolean r1 = r6.mo33533g()
            boolean r2 = r7.mo33533g()
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x003e
        L_0x002d:
            if (r1 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x0033
            goto L_0x00a8
        L_0x0033:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec r1 = r6.buttonSpec
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec r2 = r7.buttonSpec
            boolean r1 = r1.mo33576a(r2)
            if (r1 != 0) goto L_0x003e
            return r0
        L_0x003e:
            boolean r1 = r6.mo33537j()
            boolean r2 = r7.mo33537j()
            if (r1 != 0) goto L_0x004a
            if (r2 == 0) goto L_0x005a
        L_0x004a:
            if (r1 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x004f
            goto L_0x00a8
        L_0x004f:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType r1 = r6.requiredInfoType
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType r2 = r7.requiredInfoType
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005a
            return r0
        L_0x005a:
            boolean r1 = r6.mo33536i()
            boolean r2 = r7.mo33536i()
            r3 = 1
            if (r1 != 0) goto L_0x0067
            if (r2 == 0) goto L_0x008b
        L_0x0067:
            if (r1 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x006c
            goto L_0x00a8
        L_0x006c:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoData r1 = r6.requiredInfoData
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoData r2 = r7.requiredInfoData
            if (r2 == 0) goto L_0x0084
            F r4 = r1.setField_
            F r5 = r2.setField_
            if (r4 != r5) goto L_0x0087
            java.lang.Object r1 = r1.value_
            java.lang.Object r2 = r2.value_
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0084:
            r1.getClass()
        L_0x0087:
            r1 = 0
        L_0x0088:
            if (r1 != 0) goto L_0x008b
            return r0
        L_0x008b:
            boolean r1 = r6.mo33534h()
            boolean r2 = r7.mo33534h()
            if (r1 != 0) goto L_0x0097
            if (r2 == 0) goto L_0x00a7
        L_0x0097:
            if (r1 == 0) goto L_0x00a8
            if (r2 != 0) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            java.lang.String r1 = r6.instructions
            java.lang.String r7 = r7.instructions
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x00a7
            return r0
        L_0x00a7:
            return r3
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction.mo33529a(com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerAction mVTodPassengerAction = (MVTodPassengerAction) obj;
        if (!getClass().equals(mVTodPassengerAction.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerAction.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33532f()).compareTo(Boolean.valueOf(mVTodPassengerAction.mo33532f()));
        if (compareTo2 != 0 || ((mo33532f() && (compareTo2 = this.actionId.compareTo(mVTodPassengerAction.actionId)) != 0) || (compareTo2 = Boolean.valueOf(mo33533g()).compareTo(Boolean.valueOf(mVTodPassengerAction.mo33533g()))) != 0 || ((mo33533g() && (compareTo2 = this.buttonSpec.compareTo(mVTodPassengerAction.buttonSpec)) != 0) || (compareTo2 = Boolean.valueOf(mo33537j()).compareTo(Boolean.valueOf(mVTodPassengerAction.mo33537j()))) != 0 || ((mo33537j() && (compareTo2 = this.requiredInfoType.compareTo(mVTodPassengerAction.requiredInfoType)) != 0) || (compareTo2 = Boolean.valueOf(mo33536i()).compareTo(Boolean.valueOf(mVTodPassengerAction.mo33536i()))) != 0 || ((mo33536i() && (compareTo2 = this.requiredInfoData.compareTo(mVTodPassengerAction.requiredInfoData)) != 0) || (compareTo2 = Boolean.valueOf(mo33534h()).compareTo(Boolean.valueOf(mVTodPassengerAction.mo33534h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo33534h() || (compareTo = this.instructions.compareTo(mVTodPassengerAction.instructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodPassengerAction)) {
            return mo33529a((MVTodPassengerAction) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33532f() {
        return this.actionId != null;
    }

    /* renamed from: g */
    public final boolean mo33533g() {
        return this.buttonSpec != null;
    }

    /* renamed from: h */
    public final boolean mo33534h() {
        return this.instructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33536i() {
        return this.requiredInfoData != null;
    }

    /* renamed from: j */
    public final boolean mo33537j() {
        return this.requiredInfoType != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerAction(", "actionId:");
        String str = this.actionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("buttonSpec:");
        MVTodPassengerButtonSpec mVTodPassengerButtonSpec = this.buttonSpec;
        if (mVTodPassengerButtonSpec == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodPassengerButtonSpec);
        }
        n.append(", ");
        n.append("requiredInfoType:");
        MVTodPassengerActionRequiredInfoType mVTodPassengerActionRequiredInfoType = this.requiredInfoType;
        if (mVTodPassengerActionRequiredInfoType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodPassengerActionRequiredInfoType);
        }
        if (mo33536i()) {
            n.append(", ");
            n.append("requiredInfoData:");
            MVTodPassengerActionRequiredInfoData mVTodPassengerActionRequiredInfoData = this.requiredInfoData;
            if (mVTodPassengerActionRequiredInfoData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodPassengerActionRequiredInfoData);
            }
        }
        if (mo33534h()) {
            n.append(", ");
            n.append("instructions:");
            String str2 = this.instructions;
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
