package com.tranzmate.moovit.protocol.payments;

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

public class MVPhoneAlternateAuthInstructions implements TBase<MVPhoneAlternateAuthInstructions, _Fields>, Serializable, Cloneable, Comparable<MVPhoneAlternateAuthInstructions> {

    /* renamed from: b */
    public static final C25113c f27623b = new C25113c("actionText", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27624c = new C25113c("alternateAuthProvider", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27625d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27626e;
    public String actionText;
    public MVAlternateAuthProvider alternateAuthProvider;

    public enum _Fields implements C25085c {
        ACTION_TEXT(1, "actionText"),
        ALTERNATE_AUTH_PROVIDER(2, "alternateAuthProvider");
        
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
                return ACTION_TEXT;
            }
            if (i != 2) {
                return null;
            }
            return ALTERNATE_AUTH_PROVIDER;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions$a */
    public static class C10015a extends C25239c<MVPhoneAlternateAuthInstructions> {
        public C10015a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = (MVPhoneAlternateAuthInstructions) tBase;
            mVPhoneAlternateAuthInstructions.getClass();
            C25113c cVar = MVPhoneAlternateAuthInstructions.f27623b;
            gVar.mo61687K();
            if (mVPhoneAlternateAuthInstructions.actionText != null) {
                gVar.mo61711x(MVPhoneAlternateAuthInstructions.f27623b);
                gVar.mo61686J(mVPhoneAlternateAuthInstructions.actionText);
                gVar.mo61712y();
            }
            if (mVPhoneAlternateAuthInstructions.alternateAuthProvider != null) {
                gVar.mo61711x(MVPhoneAlternateAuthInstructions.f27624c);
                mVPhoneAlternateAuthInstructions.alternateAuthProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = (MVPhoneAlternateAuthInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPhoneAlternateAuthInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVAlternateAuthProvider mVAlternateAuthProvider = new MVAlternateAuthProvider();
                        mVPhoneAlternateAuthInstructions.alternateAuthProvider = mVAlternateAuthProvider;
                        mVAlternateAuthProvider.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPhoneAlternateAuthInstructions.actionText = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions$b */
    public static class C10016b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10015a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions$c */
    public static class C10017c extends C25240d<MVPhoneAlternateAuthInstructions> {
        public C10017c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = (MVPhoneAlternateAuthInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPhoneAlternateAuthInstructions.mo30466f()) {
                bitSet.set(0);
            }
            if (mVPhoneAlternateAuthInstructions.mo30467g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPhoneAlternateAuthInstructions.mo30466f()) {
                jVar.mo61686J(mVPhoneAlternateAuthInstructions.actionText);
            }
            if (mVPhoneAlternateAuthInstructions.mo30467g()) {
                mVPhoneAlternateAuthInstructions.alternateAuthProvider.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = (MVPhoneAlternateAuthInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPhoneAlternateAuthInstructions.actionText = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAlternateAuthProvider mVAlternateAuthProvider = new MVAlternateAuthProvider();
                mVPhoneAlternateAuthInstructions.alternateAuthProvider = mVAlternateAuthProvider;
                mVAlternateAuthProvider.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions$d */
    public static class C10018d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10017c(0);
        }
    }

    static {
        new C17394d0("MVPhoneAlternateAuthInstructions");
        HashMap hashMap = new HashMap();
        f27625d = hashMap;
        hashMap.put(C25239c.class, new C10016b());
        hashMap.put(C25240d.class, new C10018d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALTERNATE_AUTH_PROVIDER, new FieldMetaData("alternateAuthProvider", (byte) 3, new StructMetaData(MVAlternateAuthProvider.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27626e = unmodifiableMap;
        FieldMetaData.m61947a(MVPhoneAlternateAuthInstructions.class, unmodifiableMap);
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
        ((C25238b) f27625d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27625d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30463a(com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5.mo30466f()
            boolean r2 = r6.mo30466f()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x0015
            goto L_0x0052
        L_0x0015:
            java.lang.String r1 = r5.actionText
            java.lang.String r2 = r6.actionText
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r5.mo30467g()
            boolean r2 = r6.mo30467g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0051
        L_0x002d:
            if (r1 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            com.tranzmate.moovit.protocol.payments.MVAlternateAuthProvider r1 = r5.alternateAuthProvider
            com.tranzmate.moovit.protocol.payments.MVAlternateAuthProvider r6 = r6.alternateAuthProvider
            if (r6 == 0) goto L_0x004a
            F r2 = r1.setField_
            F r4 = r6.setField_
            if (r2 != r4) goto L_0x004d
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004a:
            r1.getClass()
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 != 0) goto L_0x0051
            return r0
        L_0x0051:
            return r3
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions.mo30463a(com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = (MVPhoneAlternateAuthInstructions) obj;
        if (!getClass().equals(mVPhoneAlternateAuthInstructions.getClass())) {
            return getClass().getName().compareTo(mVPhoneAlternateAuthInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30466f()).compareTo(Boolean.valueOf(mVPhoneAlternateAuthInstructions.mo30466f()));
        if (compareTo2 != 0 || ((mo30466f() && (compareTo2 = this.actionText.compareTo(mVPhoneAlternateAuthInstructions.actionText)) != 0) || (compareTo2 = Boolean.valueOf(mo30467g()).compareTo(Boolean.valueOf(mVPhoneAlternateAuthInstructions.mo30467g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30467g() || (compareTo = this.alternateAuthProvider.compareTo(mVPhoneAlternateAuthInstructions.alternateAuthProvider)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPhoneAlternateAuthInstructions)) {
            return mo30463a((MVPhoneAlternateAuthInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30466f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo30467g() {
        return this.alternateAuthProvider != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPhoneAlternateAuthInstructions(", "actionText:");
        String str = this.actionText;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("alternateAuthProvider:");
        MVAlternateAuthProvider mVAlternateAuthProvider = this.alternateAuthProvider;
        if (mVAlternateAuthProvider == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAlternateAuthProvider);
        }
        n.append(")");
        return n.toString();
    }
}
