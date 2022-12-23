package com.tranzmate.moovit.protocol.notificationsettings;

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

public class MVUserNotificationSettingUpdate implements TBase<MVUserNotificationSettingUpdate, _Fields>, Serializable, Cloneable, Comparable<MVUserNotificationSettingUpdate> {

    /* renamed from: b */
    public static final C25113c f26868b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26869c = new C25113c("chosen", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26870d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26871e;
    public MVNotificationSelection chosen;
    public MVUserNotificationSetting type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        CHOSEN(2, "chosen");
        
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
                return TYPE;
            }
            if (i != 2) {
                return null;
            }
            return CHOSEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate$a */
    public static class C9441a extends C25239c<MVUserNotificationSettingUpdate> {
        public C9441a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = (MVUserNotificationSettingUpdate) tBase;
            mVUserNotificationSettingUpdate.getClass();
            C25113c cVar = MVUserNotificationSettingUpdate.f26868b;
            gVar.mo61687K();
            if (mVUserNotificationSettingUpdate.type != null) {
                gVar.mo61711x(MVUserNotificationSettingUpdate.f26868b);
                gVar.mo61678B(mVUserNotificationSettingUpdate.type.getValue());
                gVar.mo61712y();
            }
            if (mVUserNotificationSettingUpdate.chosen != null) {
                gVar.mo61711x(MVUserNotificationSettingUpdate.f26869c);
                mVUserNotificationSettingUpdate.chosen.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = (MVUserNotificationSettingUpdate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserNotificationSettingUpdate.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVNotificationSelection mVNotificationSelection = new MVNotificationSelection();
                        mVUserNotificationSettingUpdate.chosen = mVNotificationSelection;
                        mVNotificationSelection.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVUserNotificationSettingUpdate.type = MVUserNotificationSetting.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate$b */
    public static class C9442b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9441a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate$c */
    public static class C9443c extends C25240d<MVUserNotificationSettingUpdate> {
        public C9443c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = (MVUserNotificationSettingUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserNotificationSettingUpdate.mo29223g()) {
                bitSet.set(0);
            }
            if (mVUserNotificationSettingUpdate.mo29222f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserNotificationSettingUpdate.mo29223g()) {
                jVar.mo61678B(mVUserNotificationSettingUpdate.type.getValue());
            }
            if (mVUserNotificationSettingUpdate.mo29222f()) {
                mVUserNotificationSettingUpdate.chosen.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = (MVUserNotificationSettingUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUserNotificationSettingUpdate.type = MVUserNotificationSetting.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVNotificationSelection mVNotificationSelection = new MVNotificationSelection();
                mVUserNotificationSettingUpdate.chosen = mVNotificationSelection;
                mVNotificationSelection.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate$d */
    public static class C9444d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9443c(0);
        }
    }

    static {
        new C17394d0("MVUserNotificationSettingUpdate");
        HashMap hashMap = new HashMap();
        f26870d = hashMap;
        hashMap.put(C25239c.class, new C9442b());
        hashMap.put(C25240d.class, new C9444d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVUserNotificationSetting.class)));
        enumMap.put(_Fields.CHOSEN, new FieldMetaData("chosen", (byte) 3, new StructMetaData(MVNotificationSelection.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26871e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserNotificationSettingUpdate.class, unmodifiableMap);
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
        ((C25238b) f26870d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26870d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = (MVUserNotificationSettingUpdate) obj;
        if (!getClass().equals(mVUserNotificationSettingUpdate.getClass())) {
            return getClass().getName().compareTo(mVUserNotificationSettingUpdate.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29223g()).compareTo(Boolean.valueOf(mVUserNotificationSettingUpdate.mo29223g()));
        if (compareTo2 != 0 || ((mo29223g() && (compareTo2 = this.type.compareTo(mVUserNotificationSettingUpdate.type)) != 0) || (compareTo2 = Boolean.valueOf(mo29222f()).compareTo(Boolean.valueOf(mVUserNotificationSettingUpdate.mo29222f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29222f() || (compareTo = this.chosen.compareTo(mVUserNotificationSettingUpdate.chosen)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate r6 = (com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate) r6
            boolean r1 = r5.mo29223g()
            boolean r3 = r6.mo29223g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSetting r1 = r5.type
            com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSetting r3 = r6.type
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo29222f()
            boolean r3 = r6.mo29222f()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.notificationsettings.MVNotificationSelection r1 = r5.chosen
            com.tranzmate.moovit.protocol.notificationsettings.MVNotificationSelection r6 = r6.chosen
            if (r6 == 0) goto L_0x0050
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0053
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0050:
            r1.getClass()
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo29222f() {
        return this.chosen != null;
    }

    /* renamed from: g */
    public final boolean mo29223g() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserNotificationSettingUpdate(", "type:");
        MVUserNotificationSetting mVUserNotificationSetting = this.type;
        if (mVUserNotificationSetting == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserNotificationSetting);
        }
        n.append(", ");
        n.append("chosen:");
        MVNotificationSelection mVNotificationSelection = this.chosen;
        if (mVNotificationSelection == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVNotificationSelection);
        }
        n.append(")");
        return n.toString();
    }
}
