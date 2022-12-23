package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityAction implements TBase<MVMicroMobilityAction, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityAction> {

    /* renamed from: b */
    public static final C25113c f26467b = new C25113c("actionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26468c = new C25113c("actionCtaText", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26469d = new C25113c("requiredInfoType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26470e = new C25113c("confirmationDialog", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f26471f = new C25113c("requiredInfoData", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f26472g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26473h;
    public String actionCtaText;
    public String actionId;
    public MVMicroMobilityConfirmation confirmationDialog;
    private _Fields[] optionals = {_Fields.CONFIRMATION_DIALOG, _Fields.REQUIRED_INFO_DATA};
    public MVMicroMobilityActionRequiredInfoData requiredInfoData;
    public MVMicroMobilityActionRequiredInfoType requiredInfoType;

    public enum _Fields implements C25085c {
        ACTION_ID(1, "actionId"),
        ACTION_CTA_TEXT(2, "actionCtaText"),
        REQUIRED_INFO_TYPE(3, "requiredInfoType"),
        CONFIRMATION_DIALOG(4, "confirmationDialog"),
        REQUIRED_INFO_DATA(5, "requiredInfoData");
        
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
                return ACTION_CTA_TEXT;
            }
            if (i == 3) {
                return REQUIRED_INFO_TYPE;
            }
            if (i == 4) {
                return CONFIRMATION_DIALOG;
            }
            if (i != 5) {
                return null;
            }
            return REQUIRED_INFO_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction$a */
    public static class C9172a extends C25239c<MVMicroMobilityAction> {
        public C9172a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityAction mVMicroMobilityAction = (MVMicroMobilityAction) tBase;
            mVMicroMobilityAction.getClass();
            C25113c cVar = MVMicroMobilityAction.f26467b;
            gVar.mo61687K();
            if (mVMicroMobilityAction.actionId != null) {
                gVar.mo61711x(MVMicroMobilityAction.f26467b);
                gVar.mo61686J(mVMicroMobilityAction.actionId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityAction.actionCtaText != null) {
                gVar.mo61711x(MVMicroMobilityAction.f26468c);
                gVar.mo61686J(mVMicroMobilityAction.actionCtaText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityAction.requiredInfoType != null) {
                gVar.mo61711x(MVMicroMobilityAction.f26469d);
                gVar.mo61678B(mVMicroMobilityAction.requiredInfoType.getValue());
                gVar.mo61712y();
            }
            if (mVMicroMobilityAction.confirmationDialog != null && mVMicroMobilityAction.mo28591h()) {
                gVar.mo61711x(MVMicroMobilityAction.f26470e);
                mVMicroMobilityAction.confirmationDialog.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityAction.requiredInfoData != null && mVMicroMobilityAction.mo28593i()) {
                gVar.mo61711x(MVMicroMobilityAction.f26471f);
                mVMicroMobilityAction.requiredInfoData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityAction mVMicroMobilityAction = (MVMicroMobilityAction) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityAction.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVMicroMobilityActionRequiredInfoData mVMicroMobilityActionRequiredInfoData = new MVMicroMobilityActionRequiredInfoData();
                                    mVMicroMobilityAction.requiredInfoData = mVMicroMobilityActionRequiredInfoData;
                                    mVMicroMobilityActionRequiredInfoData.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVMicroMobilityConfirmation mVMicroMobilityConfirmation = new MVMicroMobilityConfirmation();
                                mVMicroMobilityAction.confirmationDialog = mVMicroMobilityConfirmation;
                                mVMicroMobilityConfirmation.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMicroMobilityAction.requiredInfoType = MVMicroMobilityActionRequiredInfoType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityAction.actionCtaText = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityAction.actionId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction$b */
    public static class C9173b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9172a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction$c */
    public static class C9174c extends C25240d<MVMicroMobilityAction> {
        public C9174c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityAction mVMicroMobilityAction = (MVMicroMobilityAction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityAction.mo28590g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityAction.mo28589f()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityAction.mo28594j()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityAction.mo28591h()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityAction.mo28593i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityAction.mo28590g()) {
                jVar.mo61686J(mVMicroMobilityAction.actionId);
            }
            if (mVMicroMobilityAction.mo28589f()) {
                jVar.mo61686J(mVMicroMobilityAction.actionCtaText);
            }
            if (mVMicroMobilityAction.mo28594j()) {
                jVar.mo61678B(mVMicroMobilityAction.requiredInfoType.getValue());
            }
            if (mVMicroMobilityAction.mo28591h()) {
                mVMicroMobilityAction.confirmationDialog.mo25202X0(jVar);
            }
            if (mVMicroMobilityAction.mo28593i()) {
                mVMicroMobilityAction.requiredInfoData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityAction mVMicroMobilityAction = (MVMicroMobilityAction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMicroMobilityAction.actionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityAction.actionCtaText = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityAction.requiredInfoType = MVMicroMobilityActionRequiredInfoType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVMicroMobilityConfirmation mVMicroMobilityConfirmation = new MVMicroMobilityConfirmation();
                mVMicroMobilityAction.confirmationDialog = mVMicroMobilityConfirmation;
                mVMicroMobilityConfirmation.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVMicroMobilityActionRequiredInfoData mVMicroMobilityActionRequiredInfoData = new MVMicroMobilityActionRequiredInfoData();
                mVMicroMobilityAction.requiredInfoData = mVMicroMobilityActionRequiredInfoData;
                mVMicroMobilityActionRequiredInfoData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction$d */
    public static class C9175d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9174c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityAction");
        HashMap hashMap = new HashMap();
        f26472g = hashMap;
        hashMap.put(C25239c.class, new C9173b());
        hashMap.put(C25240d.class, new C9175d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTION_ID, new FieldMetaData("actionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_CTA_TEXT, new FieldMetaData("actionCtaText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REQUIRED_INFO_TYPE, new FieldMetaData("requiredInfoType", (byte) 3, new EnumMetaData(MVMicroMobilityActionRequiredInfoType.class)));
        enumMap.put(_Fields.CONFIRMATION_DIALOG, new FieldMetaData("confirmationDialog", (byte) 2, new StructMetaData(MVMicroMobilityConfirmation.class)));
        enumMap.put(_Fields.REQUIRED_INFO_DATA, new FieldMetaData("requiredInfoData", (byte) 2, new StructMetaData(MVMicroMobilityActionRequiredInfoData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26473h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityAction.class, unmodifiableMap);
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
        ((C25238b) f26472g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26472g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityAction mVMicroMobilityAction = (MVMicroMobilityAction) obj;
        if (!getClass().equals(mVMicroMobilityAction.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityAction.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28590g()).compareTo(Boolean.valueOf(mVMicroMobilityAction.mo28590g()));
        if (compareTo2 != 0 || ((mo28590g() && (compareTo2 = this.actionId.compareTo(mVMicroMobilityAction.actionId)) != 0) || (compareTo2 = Boolean.valueOf(mo28589f()).compareTo(Boolean.valueOf(mVMicroMobilityAction.mo28589f()))) != 0 || ((mo28589f() && (compareTo2 = this.actionCtaText.compareTo(mVMicroMobilityAction.actionCtaText)) != 0) || (compareTo2 = Boolean.valueOf(mo28594j()).compareTo(Boolean.valueOf(mVMicroMobilityAction.mo28594j()))) != 0 || ((mo28594j() && (compareTo2 = this.requiredInfoType.compareTo(mVMicroMobilityAction.requiredInfoType)) != 0) || (compareTo2 = Boolean.valueOf(mo28591h()).compareTo(Boolean.valueOf(mVMicroMobilityAction.mo28591h()))) != 0 || ((mo28591h() && (compareTo2 = this.confirmationDialog.compareTo(mVMicroMobilityAction.confirmationDialog)) != 0) || (compareTo2 = Boolean.valueOf(mo28593i()).compareTo(Boolean.valueOf(mVMicroMobilityAction.mo28593i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28593i() || (compareTo = this.requiredInfoData.compareTo(mVMicroMobilityAction.requiredInfoData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction
            r2 = 1
            if (r1 == 0) goto L_0x00b0
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction r6 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction) r6
            boolean r1 = r5.mo28590g()
            boolean r3 = r6.mo28590g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x001d
            goto L_0x00b0
        L_0x001d:
            java.lang.String r1 = r5.actionId
            java.lang.String r3 = r6.actionId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x00b0
        L_0x0029:
            boolean r1 = r5.mo28589f()
            boolean r3 = r6.mo28589f()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0047
        L_0x0035:
            if (r1 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x003b
            goto L_0x00b0
        L_0x003b:
            java.lang.String r1 = r5.actionCtaText
            java.lang.String r3 = r6.actionCtaText
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0047
            goto L_0x00b0
        L_0x0047:
            boolean r1 = r5.mo28594j()
            boolean r3 = r6.mo28594j()
            if (r1 != 0) goto L_0x0053
            if (r3 == 0) goto L_0x0063
        L_0x0053:
            if (r1 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x0058
            goto L_0x00b0
        L_0x0058:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r1 = r5.requiredInfoType
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r3 = r6.requiredInfoType
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0063
            goto L_0x00b0
        L_0x0063:
            boolean r1 = r5.mo28591h()
            boolean r3 = r6.mo28591h()
            if (r1 != 0) goto L_0x006f
            if (r3 == 0) goto L_0x007f
        L_0x006f:
            if (r1 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x0074
            goto L_0x00b0
        L_0x0074:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation r1 = r5.confirmationDialog
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation r3 = r6.confirmationDialog
            boolean r1 = r1.mo28661a(r3)
            if (r1 != 0) goto L_0x007f
            goto L_0x00b0
        L_0x007f:
            boolean r1 = r5.mo28593i()
            boolean r3 = r6.mo28593i()
            if (r1 != 0) goto L_0x008b
            if (r3 == 0) goto L_0x00af
        L_0x008b:
            if (r1 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x0090
            goto L_0x00b0
        L_0x0090:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData r1 = r5.requiredInfoData
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData r6 = r6.requiredInfoData
            if (r6 == 0) goto L_0x00a8
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x00ab
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00a8:
            r1.getClass()
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            if (r6 != 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r0 = 1
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28589f() {
        return this.actionCtaText != null;
    }

    /* renamed from: g */
    public final boolean mo28590g() {
        return this.actionId != null;
    }

    /* renamed from: h */
    public final boolean mo28591h() {
        return this.confirmationDialog != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28593i() {
        return this.requiredInfoData != null;
    }

    /* renamed from: j */
    public final boolean mo28594j() {
        return this.requiredInfoType != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityAction(", "actionId:");
        String str = this.actionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("actionCtaText:");
        String str2 = this.actionCtaText;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("requiredInfoType:");
        MVMicroMobilityActionRequiredInfoType mVMicroMobilityActionRequiredInfoType = this.requiredInfoType;
        if (mVMicroMobilityActionRequiredInfoType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityActionRequiredInfoType);
        }
        if (mo28591h()) {
            n.append(", ");
            n.append("confirmationDialog:");
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = this.confirmationDialog;
            if (mVMicroMobilityConfirmation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityConfirmation);
            }
        }
        if (mo28593i()) {
            n.append(", ");
            n.append("requiredInfoData:");
            MVMicroMobilityActionRequiredInfoData mVMicroMobilityActionRequiredInfoData = this.requiredInfoData;
            if (mVMicroMobilityActionRequiredInfoData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityActionRequiredInfoData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
