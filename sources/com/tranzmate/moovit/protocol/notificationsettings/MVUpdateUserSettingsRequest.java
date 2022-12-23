package com.tranzmate.moovit.protocol.notificationsettings;

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

public class MVUpdateUserSettingsRequest implements TBase<MVUpdateUserSettingsRequest, _Fields>, Serializable, Cloneable, Comparable<MVUpdateUserSettingsRequest> {

    /* renamed from: b */
    public static final C25113c f26865b = new C25113c("settingsUpdate", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f26866c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26867d;
    public List<MVUserNotificationSettingUpdate> settingsUpdate;

    public enum _Fields implements C25085c {
        SETTINGS_UPDATE(1, "settingsUpdate");
        
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
            if (i != 1) {
                return null;
            }
            return SETTINGS_UPDATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest$a */
    public static class C9437a extends C25239c<MVUpdateUserSettingsRequest> {
        public C9437a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) tBase;
            mVUpdateUserSettingsRequest.getClass();
            C25113c cVar = MVUpdateUserSettingsRequest.f26865b;
            gVar.mo61687K();
            if (mVUpdateUserSettingsRequest.settingsUpdate != null) {
                gVar.mo61711x(MVUpdateUserSettingsRequest.f26865b);
                gVar.mo61680D(new C25119e((byte) 12, mVUpdateUserSettingsRequest.settingsUpdate.size()));
                for (MVUserNotificationSettingUpdate X0 : mVUpdateUserSettingsRequest.settingsUpdate) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdateUserSettingsRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVUpdateUserSettingsRequest.settingsUpdate = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = new MVUserNotificationSettingUpdate();
                        mVUserNotificationSettingUpdate.mo25201C1(gVar);
                        mVUpdateUserSettingsRequest.settingsUpdate.add(mVUserNotificationSettingUpdate);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest$b */
    public static class C9438b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9437a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest$c */
    public static class C9439c extends C25240d<MVUpdateUserSettingsRequest> {
        public C9439c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdateUserSettingsRequest.mo29214f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVUpdateUserSettingsRequest.mo29214f()) {
                jVar.mo61678B(mVUpdateUserSettingsRequest.settingsUpdate.size());
                for (MVUserNotificationSettingUpdate X0 : mVUpdateUserSettingsRequest.settingsUpdate) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVUpdateUserSettingsRequest.settingsUpdate = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = new MVUserNotificationSettingUpdate();
                    mVUserNotificationSettingUpdate.mo25201C1(jVar);
                    mVUpdateUserSettingsRequest.settingsUpdate.add(mVUserNotificationSettingUpdate);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest$d */
    public static class C9440d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9439c(0);
        }
    }

    static {
        new C17394d0("MVUpdateUserSettingsRequest");
        HashMap hashMap = new HashMap();
        f26866c = hashMap;
        hashMap.put(C25239c.class, new C9438b());
        hashMap.put(C25240d.class, new C9440d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SETTINGS_UPDATE, new FieldMetaData("settingsUpdate", (byte) 3, new ListMetaData(new StructMetaData(MVUserNotificationSettingUpdate.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26867d = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdateUserSettingsRequest.class, unmodifiableMap);
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
        ((C25238b) f26866c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26866c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) obj;
        if (!getClass().equals(mVUpdateUserSettingsRequest.getClass())) {
            return getClass().getName().compareTo(mVUpdateUserSettingsRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29214f()).compareTo(Boolean.valueOf(mVUpdateUserSettingsRequest.mo29214f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29214f() || (h = C25082a.m62844h(this.settingsUpdate, mVUpdateUserSettingsRequest.settingsUpdate)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpdateUserSettingsRequest)) {
            return false;
        }
        MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = (MVUpdateUserSettingsRequest) obj;
        boolean f = mo29214f();
        boolean f2 = mVUpdateUserSettingsRequest.mo29214f();
        if ((f || f2) && (!f || !f2 || !this.settingsUpdate.equals(mVUpdateUserSettingsRequest.settingsUpdate))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29214f() {
        return this.settingsUpdate != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdateUserSettingsRequest(", "settingsUpdate:");
        List<MVUserNotificationSettingUpdate> list = this.settingsUpdate;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
