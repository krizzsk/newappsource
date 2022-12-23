package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.Constants;
import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTodVehicleRealTimeInfo implements TBase<MVTodVehicleRealTimeInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicleRealTimeInfo> {

    /* renamed from: b */
    public static final C25113c f29680b = new C25113c("vehicleActions", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29681c = new C25113c("colorBar", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29682d = new C25113c(Constants.APPBOY_PUSH_ACCENT_KEY, (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29683e = new C25113c("audio", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29684f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29685g;

    /* renamed from: ac */
    public MVTodVehicleAC f29686ac;
    public MVTodVehicleAudio audio;
    public MVTodVehicleColorBar colorBar;
    private _Fields[] optionals = {_Fields.COLOR_BAR, _Fields.AC, _Fields.AUDIO};
    public List<String> vehicleActions;

    public enum _Fields implements C25085c {
        VEHICLE_ACTIONS(1, "vehicleActions"),
        COLOR_BAR(2, "colorBar"),
        AC(3, Constants.APPBOY_PUSH_ACCENT_KEY),
        AUDIO(4, "audio");
        
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
                return VEHICLE_ACTIONS;
            }
            if (i == 2) {
                return COLOR_BAR;
            }
            if (i == 3) {
                return AC;
            }
            if (i != 4) {
                return null;
            }
            return AUDIO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo$a */
    public static class C11386a extends C25239c<MVTodVehicleRealTimeInfo> {
        public C11386a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = (MVTodVehicleRealTimeInfo) tBase;
            mVTodVehicleRealTimeInfo.mo33913j();
            C25113c cVar = MVTodVehicleRealTimeInfo.f29680b;
            gVar.mo61687K();
            if (mVTodVehicleRealTimeInfo.vehicleActions != null) {
                gVar.mo61711x(MVTodVehicleRealTimeInfo.f29680b);
                gVar.mo61680D(new C25119e((byte) 11, mVTodVehicleRealTimeInfo.vehicleActions.size()));
                for (String J : mVTodVehicleRealTimeInfo.vehicleActions) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodVehicleRealTimeInfo.colorBar != null && mVTodVehicleRealTimeInfo.mo33910h()) {
                gVar.mo61711x(MVTodVehicleRealTimeInfo.f29681c);
                mVTodVehicleRealTimeInfo.colorBar.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodVehicleRealTimeInfo.f29686ac != null && mVTodVehicleRealTimeInfo.mo33908f()) {
                gVar.mo61711x(MVTodVehicleRealTimeInfo.f29682d);
                mVTodVehicleRealTimeInfo.f29686ac.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodVehicleRealTimeInfo.audio != null && mVTodVehicleRealTimeInfo.mo33909g()) {
                gVar.mo61711x(MVTodVehicleRealTimeInfo.f29683e);
                mVTodVehicleRealTimeInfo.audio.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = (MVTodVehicleRealTimeInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodVehicleRealTimeInfo.mo33913j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVTodVehicleAudio mVTodVehicleAudio = new MVTodVehicleAudio();
                                mVTodVehicleRealTimeInfo.audio = mVTodVehicleAudio;
                                mVTodVehicleAudio.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTodVehicleAC mVTodVehicleAC = new MVTodVehicleAC();
                            mVTodVehicleRealTimeInfo.f29686ac = mVTodVehicleAC;
                            mVTodVehicleAC.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTodVehicleColorBar mVTodVehicleColorBar = new MVTodVehicleColorBar();
                        mVTodVehicleRealTimeInfo.colorBar = mVTodVehicleColorBar;
                        mVTodVehicleColorBar.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVTodVehicleRealTimeInfo.vehicleActions = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        mVTodVehicleRealTimeInfo.vehicleActions.add(gVar.mo61704q());
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo$b */
    public static class C11387b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11386a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo$c */
    public static class C11388c extends C25240d<MVTodVehicleRealTimeInfo> {
        public C11388c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = (MVTodVehicleRealTimeInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicleRealTimeInfo.mo33912i()) {
                bitSet.set(0);
            }
            if (mVTodVehicleRealTimeInfo.mo33910h()) {
                bitSet.set(1);
            }
            if (mVTodVehicleRealTimeInfo.mo33908f()) {
                bitSet.set(2);
            }
            if (mVTodVehicleRealTimeInfo.mo33909g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodVehicleRealTimeInfo.mo33912i()) {
                jVar.mo61678B(mVTodVehicleRealTimeInfo.vehicleActions.size());
                for (String J : mVTodVehicleRealTimeInfo.vehicleActions) {
                    jVar.mo61686J(J);
                }
            }
            if (mVTodVehicleRealTimeInfo.mo33910h()) {
                mVTodVehicleRealTimeInfo.colorBar.mo25202X0(jVar);
            }
            if (mVTodVehicleRealTimeInfo.mo33908f()) {
                mVTodVehicleRealTimeInfo.f29686ac.mo25202X0(jVar);
            }
            if (mVTodVehicleRealTimeInfo.mo33909g()) {
                mVTodVehicleRealTimeInfo.audio.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = (MVTodVehicleRealTimeInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTodVehicleRealTimeInfo.vehicleActions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTodVehicleRealTimeInfo.vehicleActions.add(jVar.mo61704q());
                }
            }
            if (T.get(1)) {
                MVTodVehicleColorBar mVTodVehicleColorBar = new MVTodVehicleColorBar();
                mVTodVehicleRealTimeInfo.colorBar = mVTodVehicleColorBar;
                mVTodVehicleColorBar.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTodVehicleAC mVTodVehicleAC = new MVTodVehicleAC();
                mVTodVehicleRealTimeInfo.f29686ac = mVTodVehicleAC;
                mVTodVehicleAC.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVTodVehicleAudio mVTodVehicleAudio = new MVTodVehicleAudio();
                mVTodVehicleRealTimeInfo.audio = mVTodVehicleAudio;
                mVTodVehicleAudio.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo$d */
    public static class C11389d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11388c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicleRealTimeInfo");
        HashMap hashMap = new HashMap();
        f29684f = hashMap;
        hashMap.put(C25239c.class, new C11387b());
        hashMap.put(C25240d.class, new C11389d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.VEHICLE_ACTIONS, new FieldMetaData("vehicleActions", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.COLOR_BAR, new FieldMetaData("colorBar", (byte) 2, new StructMetaData(MVTodVehicleColorBar.class)));
        enumMap.put(_Fields.AC, new FieldMetaData(Constants.APPBOY_PUSH_ACCENT_KEY, (byte) 2, new StructMetaData(MVTodVehicleAC.class)));
        enumMap.put(_Fields.AUDIO, new FieldMetaData("audio", (byte) 2, new StructMetaData(MVTodVehicleAudio.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29685g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleRealTimeInfo.class, unmodifiableMap);
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
        ((C25238b) f29684f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29684f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33905a(com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4.mo33912i()
            boolean r2 = r5.mo33912i()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0021
        L_0x0010:
            if (r1 == 0) goto L_0x008d
            if (r2 != 0) goto L_0x0016
            goto L_0x008d
        L_0x0016:
            java.util.List<java.lang.String> r1 = r4.vehicleActions
            java.util.List<java.lang.String> r2 = r5.vehicleActions
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0021
            return r0
        L_0x0021:
            boolean r1 = r4.mo33910h()
            boolean r2 = r5.mo33910h()
            r3 = 1
            if (r1 != 0) goto L_0x002e
            if (r2 == 0) goto L_0x0049
        L_0x002e:
            if (r1 == 0) goto L_0x008d
            if (r2 != 0) goto L_0x0033
            goto L_0x008d
        L_0x0033:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleColorBar r1 = r4.colorBar
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleColorBar r2 = r5.colorBar
            if (r2 != 0) goto L_0x003e
            r1.getClass()
        L_0x003c:
            r1 = 0
            goto L_0x0046
        L_0x003e:
            int r1 = r1.color
            int r2 = r2.color
            if (r1 == r2) goto L_0x0045
            goto L_0x003c
        L_0x0045:
            r1 = 1
        L_0x0046:
            if (r1 != 0) goto L_0x0049
            return r0
        L_0x0049:
            boolean r1 = r4.mo33908f()
            boolean r2 = r5.mo33908f()
            if (r1 != 0) goto L_0x0055
            if (r2 == 0) goto L_0x0065
        L_0x0055:
            if (r1 == 0) goto L_0x008d
            if (r2 != 0) goto L_0x005a
            goto L_0x008d
        L_0x005a:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC r1 = r4.f29686ac
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC r2 = r5.f29686ac
            boolean r1 = r1.mo33860a(r2)
            if (r1 != 0) goto L_0x0065
            return r0
        L_0x0065:
            boolean r1 = r4.mo33909g()
            boolean r2 = r5.mo33909g()
            if (r1 != 0) goto L_0x0071
            if (r2 == 0) goto L_0x008c
        L_0x0071:
            if (r1 == 0) goto L_0x008d
            if (r2 != 0) goto L_0x0076
            goto L_0x008d
        L_0x0076:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio r1 = r4.audio
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio r5 = r5.audio
            if (r5 != 0) goto L_0x0081
            r1.getClass()
        L_0x007f:
            r5 = 0
            goto L_0x0089
        L_0x0081:
            boolean r1 = r1.playing
            boolean r5 = r5.playing
            if (r1 == r5) goto L_0x0088
            goto L_0x007f
        L_0x0088:
            r5 = 1
        L_0x0089:
            if (r5 != 0) goto L_0x008c
            return r0
        L_0x008c:
            return r3
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo.mo33905a(com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = (MVTodVehicleRealTimeInfo) obj;
        if (!getClass().equals(mVTodVehicleRealTimeInfo.getClass())) {
            return getClass().getName().compareTo(mVTodVehicleRealTimeInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33912i()).compareTo(Boolean.valueOf(mVTodVehicleRealTimeInfo.mo33912i()));
        if (compareTo2 != 0 || ((mo33912i() && (compareTo2 = C25082a.m62844h(this.vehicleActions, mVTodVehicleRealTimeInfo.vehicleActions)) != 0) || (compareTo2 = Boolean.valueOf(mo33910h()).compareTo(Boolean.valueOf(mVTodVehicleRealTimeInfo.mo33910h()))) != 0 || ((mo33910h() && (compareTo2 = this.colorBar.compareTo(mVTodVehicleRealTimeInfo.colorBar)) != 0) || (compareTo2 = Boolean.valueOf(mo33908f()).compareTo(Boolean.valueOf(mVTodVehicleRealTimeInfo.mo33908f()))) != 0 || ((mo33908f() && (compareTo2 = this.f29686ac.compareTo(mVTodVehicleRealTimeInfo.f29686ac)) != 0) || (compareTo2 = Boolean.valueOf(mo33909g()).compareTo(Boolean.valueOf(mVTodVehicleRealTimeInfo.mo33909g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33909g() || (compareTo = this.audio.compareTo(mVTodVehicleRealTimeInfo.audio)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodVehicleRealTimeInfo)) {
            return mo33905a((MVTodVehicleRealTimeInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33908f() {
        return this.f29686ac != null;
    }

    /* renamed from: g */
    public final boolean mo33909g() {
        return this.audio != null;
    }

    /* renamed from: h */
    public final boolean mo33910h() {
        return this.colorBar != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33912i() {
        return this.vehicleActions != null;
    }

    /* renamed from: j */
    public final void mo33913j() throws TException {
        MVTodVehicleColorBar mVTodVehicleColorBar = this.colorBar;
        if (mVTodVehicleColorBar != null) {
            mVTodVehicleColorBar.getClass();
        }
        MVTodVehicleAC mVTodVehicleAC = this.f29686ac;
        if (mVTodVehicleAC != null) {
            mVTodVehicleAC.getClass();
        }
        MVTodVehicleAudio mVTodVehicleAudio = this.audio;
        if (mVTodVehicleAudio != null) {
            mVTodVehicleAudio.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodVehicleRealTimeInfo(", "vehicleActions:");
        List<String> list = this.vehicleActions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo33910h()) {
            n.append(", ");
            n.append("colorBar:");
            MVTodVehicleColorBar mVTodVehicleColorBar = this.colorBar;
            if (mVTodVehicleColorBar == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicleColorBar);
            }
        }
        if (mo33908f()) {
            n.append(", ");
            n.append("ac:");
            MVTodVehicleAC mVTodVehicleAC = this.f29686ac;
            if (mVTodVehicleAC == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicleAC);
            }
        }
        if (mo33909g()) {
            n.append(", ");
            n.append("audio:");
            MVTodVehicleAudio mVTodVehicleAudio = this.audio;
            if (mVTodVehicleAudio == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicleAudio);
            }
        }
        n.append(")");
        return n.toString();
    }
}
