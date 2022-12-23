package com.tranzmate.moovit.protocol.metrics;

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

public class MVAppMetrics implements TBase<MVAppMetrics, _Fields>, Serializable, Cloneable, Comparable<MVAppMetrics> {

    /* renamed from: b */
    public static final C25113c f26344b = new C25113c("clientVersion", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26345c = new C25113c("clientFlavour", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26346d = new C25113c("appDataDirSize", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f26347e = new C25113c("appFilesDirSize", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f26348f = new C25113c("appCacheDirSize", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f26349g = new C25113c("appDatabasesDirSize", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f26350h = new C25113c("moovitDatabaseSize", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f26351i = new C25113c("userMetroId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f26352j = new C25113c("userMetroRevision", (byte) 10, 9);

    /* renamed from: k */
    public static final C25113c f26353k = new C25113c("hasFineLocationPermission", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f26354l = new C25113c("hasCoarseLocationPermission", (byte) 2, 11);

    /* renamed from: m */
    public static final C25113c f26355m = new C25113c("appDataSend", (byte) 10, 12);

    /* renamed from: n */
    public static final C25113c f26356n = new C25113c("appDataReceived", (byte) 10, 13);

    /* renamed from: o */
    public static final C25113c f26357o = new C25113c("restrictBackgroundStatus", (byte) 11, 14);

    /* renamed from: p */
    public static final C25113c f26358p = new C25113c("areNotificationsEnabled", (byte) 2, 15);

    /* renamed from: q */
    public static final C25113c f26359q = new C25113c("notificationsImportance", (byte) 8, 16);

    /* renamed from: r */
    public static final C25113c f26360r = new C25113c("appDirSizeInstall", (byte) 10, 17);

    /* renamed from: s */
    public static final C25113c f26361s = new C25113c("hasCalendarPermission", (byte) 2, 18);

    /* renamed from: t */
    public static final C25113c f26362t = new C25113c("hasATTPermission", (byte) 2, 19);

    /* renamed from: u */
    public static final HashMap f26363u;

    /* renamed from: v */
    public static final Map<_Fields, FieldMetaData> f26364v;
    private short __isset_bitfield = 0;
    public long appCacheDirSize;
    public long appDataDirSize;
    public long appDataReceived;
    public long appDataSend;
    public long appDatabasesDirSize;
    public long appDirSizeInstall;
    public long appFilesDirSize;
    public boolean areNotificationsEnabled;
    public String clientFlavour;
    public String clientVersion;
    public boolean hasATTPermission;
    public boolean hasCalendarPermission = false;
    public boolean hasCoarseLocationPermission;
    public boolean hasFineLocationPermission;
    public long moovitDatabaseSize;
    public int notificationsImportance;
    private _Fields[] optionals = {_Fields.APP_DATA_DIR_SIZE};
    public String restrictBackgroundStatus;
    public int userMetroId;
    public long userMetroRevision;

    public enum _Fields implements C25085c {
        CLIENT_VERSION(1, "clientVersion"),
        CLIENT_FLAVOUR(2, "clientFlavour"),
        APP_DATA_DIR_SIZE(3, "appDataDirSize"),
        APP_FILES_DIR_SIZE(4, "appFilesDirSize"),
        APP_CACHE_DIR_SIZE(5, "appCacheDirSize"),
        APP_DATABASES_DIR_SIZE(6, "appDatabasesDirSize"),
        MOOVIT_DATABASE_SIZE(7, "moovitDatabaseSize"),
        USER_METRO_ID(8, "userMetroId"),
        USER_METRO_REVISION(9, "userMetroRevision"),
        HAS_FINE_LOCATION_PERMISSION(10, "hasFineLocationPermission"),
        HAS_COARSE_LOCATION_PERMISSION(11, "hasCoarseLocationPermission"),
        APP_DATA_SEND(12, "appDataSend"),
        APP_DATA_RECEIVED(13, "appDataReceived"),
        RESTRICT_BACKGROUND_STATUS(14, "restrictBackgroundStatus"),
        ARE_NOTIFICATIONS_ENABLED(15, "areNotificationsEnabled"),
        NOTIFICATIONS_IMPORTANCE(16, "notificationsImportance"),
        APP_DIR_SIZE_INSTALL(17, "appDirSizeInstall"),
        HAS_CALENDAR_PERMISSION(18, "hasCalendarPermission"),
        HAS_ATTPERMISSION(19, "hasATTPermission");
        
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
                    return CLIENT_VERSION;
                case 2:
                    return CLIENT_FLAVOUR;
                case 3:
                    return APP_DATA_DIR_SIZE;
                case 4:
                    return APP_FILES_DIR_SIZE;
                case 5:
                    return APP_CACHE_DIR_SIZE;
                case 6:
                    return APP_DATABASES_DIR_SIZE;
                case 7:
                    return MOOVIT_DATABASE_SIZE;
                case 8:
                    return USER_METRO_ID;
                case 9:
                    return USER_METRO_REVISION;
                case 10:
                    return HAS_FINE_LOCATION_PERMISSION;
                case 11:
                    return HAS_COARSE_LOCATION_PERMISSION;
                case 12:
                    return APP_DATA_SEND;
                case 13:
                    return APP_DATA_RECEIVED;
                case 14:
                    return RESTRICT_BACKGROUND_STATUS;
                case 15:
                    return ARE_NOTIFICATIONS_ENABLED;
                case 16:
                    return NOTIFICATIONS_IMPORTANCE;
                case 17:
                    return APP_DIR_SIZE_INSTALL;
                case 18:
                    return HAS_CALENDAR_PERMISSION;
                case 19:
                    return HAS_ATTPERMISSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVAppMetrics$a */
    public static class C9122a extends C25239c<MVAppMetrics> {
        public C9122a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAppMetrics mVAppMetrics = (MVAppMetrics) tBase;
            mVAppMetrics.getClass();
            C25113c cVar = MVAppMetrics.f26344b;
            gVar.mo61687K();
            if (mVAppMetrics.clientVersion != null) {
                gVar.mo61711x(MVAppMetrics.f26344b);
                gVar.mo61686J(mVAppMetrics.clientVersion);
                gVar.mo61712y();
            }
            if (mVAppMetrics.clientFlavour != null) {
                gVar.mo61711x(MVAppMetrics.f26345c);
                gVar.mo61686J(mVAppMetrics.clientFlavour);
                gVar.mo61712y();
            }
            if (mVAppMetrics.mo28387g()) {
                gVar.mo61711x(MVAppMetrics.f26346d);
                gVar.mo61679C(mVAppMetrics.appDataDirSize);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAppMetrics.f26347e);
            gVar.mo61679C(mVAppMetrics.appFilesDirSize);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26348f);
            gVar.mo61679C(mVAppMetrics.appCacheDirSize);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26349g);
            gVar.mo61679C(mVAppMetrics.appDatabasesDirSize);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26350h);
            gVar.mo61679C(mVAppMetrics.moovitDatabaseSize);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26351i);
            gVar.mo61678B(mVAppMetrics.userMetroId);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26352j);
            gVar.mo61679C(mVAppMetrics.userMetroRevision);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26353k);
            gVar.mo61708u(mVAppMetrics.hasFineLocationPermission);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26354l);
            gVar.mo61708u(mVAppMetrics.hasCoarseLocationPermission);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26355m);
            gVar.mo61679C(mVAppMetrics.appDataSend);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26356n);
            gVar.mo61679C(mVAppMetrics.appDataReceived);
            gVar.mo61712y();
            if (mVAppMetrics.restrictBackgroundStatus != null) {
                gVar.mo61711x(MVAppMetrics.f26357o);
                gVar.mo61686J(mVAppMetrics.restrictBackgroundStatus);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAppMetrics.f26358p);
            gVar.mo61708u(mVAppMetrics.areNotificationsEnabled);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26359q);
            gVar.mo61678B(mVAppMetrics.notificationsImportance);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26360r);
            gVar.mo61679C(mVAppMetrics.appDirSizeInstall);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26361s);
            gVar.mo61708u(mVAppMetrics.hasCalendarPermission);
            gVar.mo61712y();
            gVar.mo61711x(MVAppMetrics.f26362t);
            C0017h.m62S(gVar, mVAppMetrics.hasATTPermission);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAppMetrics mVAppMetrics = (MVAppMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAppMetrics.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.clientVersion = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.clientFlavour = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appDataDirSize = gVar.mo61697j();
                            mVAppMetrics.mo28368E();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appFilesDirSize = gVar.mo61697j();
                            mVAppMetrics.mo28373J();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appCacheDirSize = gVar.mo61697j();
                            mVAppMetrics.mo28367D();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appDatabasesDirSize = gVar.mo61697j();
                            mVAppMetrics.mo28371H();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.moovitDatabaseSize = gVar.mo61697j();
                            mVAppMetrics.mo28379Q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.userMetroId = gVar.mo61696i();
                            mVAppMetrics.mo28381S();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.userMetroRevision = gVar.mo61697j();
                            mVAppMetrics.mo28382U();
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.hasFineLocationPermission = gVar.mo61690c();
                            mVAppMetrics.mo28378P();
                            break;
                        }
                    case 11:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.hasCoarseLocationPermission = gVar.mo61690c();
                            mVAppMetrics.mo28377O();
                            break;
                        }
                    case 12:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appDataSend = gVar.mo61697j();
                            mVAppMetrics.mo28370G();
                            break;
                        }
                    case 13:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appDataReceived = gVar.mo61697j();
                            mVAppMetrics.mo28369F();
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.restrictBackgroundStatus = gVar.mo61704q();
                            break;
                        }
                    case 15:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.areNotificationsEnabled = gVar.mo61690c();
                            mVAppMetrics.mo28374L();
                            break;
                        }
                    case 16:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.notificationsImportance = gVar.mo61696i();
                            mVAppMetrics.mo28380R();
                            break;
                        }
                    case 17:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.appDirSizeInstall = gVar.mo61697j();
                            mVAppMetrics.mo28372I();
                            break;
                        }
                    case 18:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.hasCalendarPermission = gVar.mo61690c();
                            mVAppMetrics.mo28376N();
                            break;
                        }
                    case 19:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAppMetrics.hasATTPermission = gVar.mo61690c();
                            mVAppMetrics.mo28375M();
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVAppMetrics$b */
    public static class C9123b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9122a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVAppMetrics$c */
    public static class C9124c extends C25240d<MVAppMetrics> {
        public C9124c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAppMetrics mVAppMetrics = (MVAppMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAppMetrics.mo28396p()) {
                bitSet.set(0);
            }
            if (mVAppMetrics.mo28395o()) {
                bitSet.set(1);
            }
            if (mVAppMetrics.mo28387g()) {
                bitSet.set(2);
            }
            if (mVAppMetrics.mo28393l()) {
                bitSet.set(3);
            }
            if (mVAppMetrics.mo28386f()) {
                bitSet.set(4);
            }
            if (mVAppMetrics.mo28391j()) {
                bitSet.set(5);
            }
            if (mVAppMetrics.mo28402u()) {
                bitSet.set(6);
            }
            if (mVAppMetrics.mo28405y()) {
                bitSet.set(7);
            }
            if (mVAppMetrics.mo28366A()) {
                bitSet.set(8);
            }
            if (mVAppMetrics.mo28400t()) {
                bitSet.set(9);
            }
            if (mVAppMetrics.mo28399s()) {
                bitSet.set(10);
            }
            if (mVAppMetrics.mo28390i()) {
                bitSet.set(11);
            }
            if (mVAppMetrics.mo28388h()) {
                bitSet.set(12);
            }
            if (mVAppMetrics.mo28404w()) {
                bitSet.set(13);
            }
            if (mVAppMetrics.mo28394m()) {
                bitSet.set(14);
            }
            if (mVAppMetrics.mo28403v()) {
                bitSet.set(15);
            }
            if (mVAppMetrics.mo28392k()) {
                bitSet.set(16);
            }
            if (mVAppMetrics.mo28398r()) {
                bitSet.set(17);
            }
            if (mVAppMetrics.mo28397q()) {
                bitSet.set(18);
            }
            jVar.mo61738U(bitSet, 19);
            if (mVAppMetrics.mo28396p()) {
                jVar.mo61686J(mVAppMetrics.clientVersion);
            }
            if (mVAppMetrics.mo28395o()) {
                jVar.mo61686J(mVAppMetrics.clientFlavour);
            }
            if (mVAppMetrics.mo28387g()) {
                jVar.mo61679C(mVAppMetrics.appDataDirSize);
            }
            if (mVAppMetrics.mo28393l()) {
                jVar.mo61679C(mVAppMetrics.appFilesDirSize);
            }
            if (mVAppMetrics.mo28386f()) {
                jVar.mo61679C(mVAppMetrics.appCacheDirSize);
            }
            if (mVAppMetrics.mo28391j()) {
                jVar.mo61679C(mVAppMetrics.appDatabasesDirSize);
            }
            if (mVAppMetrics.mo28402u()) {
                jVar.mo61679C(mVAppMetrics.moovitDatabaseSize);
            }
            if (mVAppMetrics.mo28405y()) {
                jVar.mo61678B(mVAppMetrics.userMetroId);
            }
            if (mVAppMetrics.mo28366A()) {
                jVar.mo61679C(mVAppMetrics.userMetroRevision);
            }
            if (mVAppMetrics.mo28400t()) {
                jVar.mo61708u(mVAppMetrics.hasFineLocationPermission);
            }
            if (mVAppMetrics.mo28399s()) {
                jVar.mo61708u(mVAppMetrics.hasCoarseLocationPermission);
            }
            if (mVAppMetrics.mo28390i()) {
                jVar.mo61679C(mVAppMetrics.appDataSend);
            }
            if (mVAppMetrics.mo28388h()) {
                jVar.mo61679C(mVAppMetrics.appDataReceived);
            }
            if (mVAppMetrics.mo28404w()) {
                jVar.mo61686J(mVAppMetrics.restrictBackgroundStatus);
            }
            if (mVAppMetrics.mo28394m()) {
                jVar.mo61708u(mVAppMetrics.areNotificationsEnabled);
            }
            if (mVAppMetrics.mo28403v()) {
                jVar.mo61678B(mVAppMetrics.notificationsImportance);
            }
            if (mVAppMetrics.mo28392k()) {
                jVar.mo61679C(mVAppMetrics.appDirSizeInstall);
            }
            if (mVAppMetrics.mo28398r()) {
                jVar.mo61708u(mVAppMetrics.hasCalendarPermission);
            }
            if (mVAppMetrics.mo28397q()) {
                jVar.mo61708u(mVAppMetrics.hasATTPermission);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAppMetrics mVAppMetrics = (MVAppMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(19);
            if (T.get(0)) {
                mVAppMetrics.clientVersion = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAppMetrics.clientFlavour = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAppMetrics.appDataDirSize = jVar.mo61697j();
                mVAppMetrics.mo28368E();
            }
            if (T.get(3)) {
                mVAppMetrics.appFilesDirSize = jVar.mo61697j();
                mVAppMetrics.mo28373J();
            }
            if (T.get(4)) {
                mVAppMetrics.appCacheDirSize = jVar.mo61697j();
                mVAppMetrics.mo28367D();
            }
            if (T.get(5)) {
                mVAppMetrics.appDatabasesDirSize = jVar.mo61697j();
                mVAppMetrics.mo28371H();
            }
            if (T.get(6)) {
                mVAppMetrics.moovitDatabaseSize = jVar.mo61697j();
                mVAppMetrics.mo28379Q();
            }
            if (T.get(7)) {
                mVAppMetrics.userMetroId = jVar.mo61696i();
                mVAppMetrics.mo28381S();
            }
            if (T.get(8)) {
                mVAppMetrics.userMetroRevision = jVar.mo61697j();
                mVAppMetrics.mo28382U();
            }
            if (T.get(9)) {
                mVAppMetrics.hasFineLocationPermission = jVar.mo61690c();
                mVAppMetrics.mo28378P();
            }
            if (T.get(10)) {
                mVAppMetrics.hasCoarseLocationPermission = jVar.mo61690c();
                mVAppMetrics.mo28377O();
            }
            if (T.get(11)) {
                mVAppMetrics.appDataSend = jVar.mo61697j();
                mVAppMetrics.mo28370G();
            }
            if (T.get(12)) {
                mVAppMetrics.appDataReceived = jVar.mo61697j();
                mVAppMetrics.mo28369F();
            }
            if (T.get(13)) {
                mVAppMetrics.restrictBackgroundStatus = jVar.mo61704q();
            }
            if (T.get(14)) {
                mVAppMetrics.areNotificationsEnabled = jVar.mo61690c();
                mVAppMetrics.mo28374L();
            }
            if (T.get(15)) {
                mVAppMetrics.notificationsImportance = jVar.mo61696i();
                mVAppMetrics.mo28380R();
            }
            if (T.get(16)) {
                mVAppMetrics.appDirSizeInstall = jVar.mo61697j();
                mVAppMetrics.mo28372I();
            }
            if (T.get(17)) {
                mVAppMetrics.hasCalendarPermission = jVar.mo61690c();
                mVAppMetrics.mo28376N();
            }
            if (T.get(18)) {
                mVAppMetrics.hasATTPermission = jVar.mo61690c();
                mVAppMetrics.mo28375M();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVAppMetrics$d */
    public static class C9125d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9124c(0);
        }
    }

    static {
        new C17394d0("MVAppMetrics");
        HashMap hashMap = new HashMap();
        f26363u = hashMap;
        hashMap.put(C25239c.class, new C9123b());
        hashMap.put(C25240d.class, new C9125d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLIENT_VERSION, new FieldMetaData("clientVersion", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CLIENT_FLAVOUR, new FieldMetaData("clientFlavour", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.APP_DATA_DIR_SIZE, new FieldMetaData("appDataDirSize", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.APP_FILES_DIR_SIZE, new FieldMetaData("appFilesDirSize", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.APP_CACHE_DIR_SIZE, new FieldMetaData("appCacheDirSize", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.APP_DATABASES_DIR_SIZE, new FieldMetaData("appDatabasesDirSize", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.MOOVIT_DATABASE_SIZE, new FieldMetaData("moovitDatabaseSize", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.USER_METRO_ID, new FieldMetaData("userMetroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_METRO_REVISION, new FieldMetaData("userMetroRevision", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.HAS_FINE_LOCATION_PERMISSION, new FieldMetaData("hasFineLocationPermission", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.HAS_COARSE_LOCATION_PERMISSION, new FieldMetaData("hasCoarseLocationPermission", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.APP_DATA_SEND, new FieldMetaData("appDataSend", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.APP_DATA_RECEIVED, new FieldMetaData("appDataReceived", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.RESTRICT_BACKGROUND_STATUS, new FieldMetaData("restrictBackgroundStatus", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ARE_NOTIFICATIONS_ENABLED, new FieldMetaData("areNotificationsEnabled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.NOTIFICATIONS_IMPORTANCE, new FieldMetaData("notificationsImportance", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.APP_DIR_SIZE_INSTALL, new FieldMetaData("appDirSizeInstall", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.HAS_CALENDAR_PERMISSION, new FieldMetaData("hasCalendarPermission", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.HAS_ATTPERMISSION, new FieldMetaData("hasATTPermission", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26364v = unmodifiableMap;
        FieldMetaData.m61947a(MVAppMetrics.class, unmodifiableMap);
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

    /* renamed from: A */
    public final boolean mo28366A() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f26363u.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo28367D() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: E */
    public final void mo28368E() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: F */
    public final void mo28369F() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 10, true);
    }

    /* renamed from: G */
    public final void mo28370G() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: H */
    public final void mo28371H() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: I */
    public final void mo28372I() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 13, true);
    }

    /* renamed from: J */
    public final void mo28373J() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: L */
    public final void mo28374L() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 11, true);
    }

    /* renamed from: M */
    public final void mo28375M() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 15, true);
    }

    /* renamed from: N */
    public final void mo28376N() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 14, true);
    }

    /* renamed from: O */
    public final void mo28377O() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: P */
    public final void mo28378P() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: Q */
    public final void mo28379Q() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: R */
    public final void mo28380R() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 12, true);
    }

    /* renamed from: S */
    public final void mo28381S() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: U */
    public final void mo28382U() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26363u.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28383a(MVAppMetrics mVAppMetrics) {
        if (mVAppMetrics == null) {
            return false;
        }
        boolean p = mo28396p();
        boolean p2 = mVAppMetrics.mo28396p();
        if ((p || p2) && (!p || !p2 || !this.clientVersion.equals(mVAppMetrics.clientVersion))) {
            return false;
        }
        boolean o = mo28395o();
        boolean o2 = mVAppMetrics.mo28395o();
        if ((o || o2) && (!o || !o2 || !this.clientFlavour.equals(mVAppMetrics.clientFlavour))) {
            return false;
        }
        boolean g = mo28387g();
        boolean g2 = mVAppMetrics.mo28387g();
        if (((g || g2) && (!g || !g2 || this.appDataDirSize != mVAppMetrics.appDataDirSize)) || this.appFilesDirSize != mVAppMetrics.appFilesDirSize || this.appCacheDirSize != mVAppMetrics.appCacheDirSize || this.appDatabasesDirSize != mVAppMetrics.appDatabasesDirSize || this.moovitDatabaseSize != mVAppMetrics.moovitDatabaseSize || this.userMetroId != mVAppMetrics.userMetroId || this.userMetroRevision != mVAppMetrics.userMetroRevision || this.hasFineLocationPermission != mVAppMetrics.hasFineLocationPermission || this.hasCoarseLocationPermission != mVAppMetrics.hasCoarseLocationPermission || this.appDataSend != mVAppMetrics.appDataSend || this.appDataReceived != mVAppMetrics.appDataReceived) {
            return false;
        }
        boolean w = mo28404w();
        boolean w2 = mVAppMetrics.mo28404w();
        if (((!w && !w2) || (w && w2 && this.restrictBackgroundStatus.equals(mVAppMetrics.restrictBackgroundStatus))) && this.areNotificationsEnabled == mVAppMetrics.areNotificationsEnabled && this.notificationsImportance == mVAppMetrics.notificationsImportance && this.appDirSizeInstall == mVAppMetrics.appDirSizeInstall && this.hasCalendarPermission == mVAppMetrics.hasCalendarPermission && this.hasATTPermission == mVAppMetrics.hasATTPermission) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVAppMetrics mVAppMetrics = (MVAppMetrics) obj;
        if (!getClass().equals(mVAppMetrics.getClass())) {
            return getClass().getName().compareTo(mVAppMetrics.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28396p()).compareTo(Boolean.valueOf(mVAppMetrics.mo28396p()));
        if (compareTo != 0 || ((mo28396p() && (compareTo = this.clientVersion.compareTo(mVAppMetrics.clientVersion)) != 0) || (compareTo = Boolean.valueOf(mo28395o()).compareTo(Boolean.valueOf(mVAppMetrics.mo28395o()))) != 0 || ((mo28395o() && (compareTo = this.clientFlavour.compareTo(mVAppMetrics.clientFlavour)) != 0) || (compareTo = Boolean.valueOf(mo28387g()).compareTo(Boolean.valueOf(mVAppMetrics.mo28387g()))) != 0 || ((mo28387g() && (compareTo = C25082a.m62840d(this.appDataDirSize, mVAppMetrics.appDataDirSize)) != 0) || (compareTo = Boolean.valueOf(mo28393l()).compareTo(Boolean.valueOf(mVAppMetrics.mo28393l()))) != 0 || ((mo28393l() && (compareTo = C25082a.m62840d(this.appFilesDirSize, mVAppMetrics.appFilesDirSize)) != 0) || (compareTo = Boolean.valueOf(mo28386f()).compareTo(Boolean.valueOf(mVAppMetrics.mo28386f()))) != 0 || ((mo28386f() && (compareTo = C25082a.m62840d(this.appCacheDirSize, mVAppMetrics.appCacheDirSize)) != 0) || (compareTo = Boolean.valueOf(mo28391j()).compareTo(Boolean.valueOf(mVAppMetrics.mo28391j()))) != 0 || ((mo28391j() && (compareTo = C25082a.m62840d(this.appDatabasesDirSize, mVAppMetrics.appDatabasesDirSize)) != 0) || (compareTo = Boolean.valueOf(mo28402u()).compareTo(Boolean.valueOf(mVAppMetrics.mo28402u()))) != 0 || ((mo28402u() && (compareTo = C25082a.m62840d(this.moovitDatabaseSize, mVAppMetrics.moovitDatabaseSize)) != 0) || (compareTo = Boolean.valueOf(mo28405y()).compareTo(Boolean.valueOf(mVAppMetrics.mo28405y()))) != 0 || ((mo28405y() && (compareTo = C25082a.m62839c(this.userMetroId, mVAppMetrics.userMetroId)) != 0) || (compareTo = Boolean.valueOf(mo28366A()).compareTo(Boolean.valueOf(mVAppMetrics.mo28366A()))) != 0 || ((mo28366A() && (compareTo = C25082a.m62840d(this.userMetroRevision, mVAppMetrics.userMetroRevision)) != 0) || (compareTo = Boolean.valueOf(mo28400t()).compareTo(Boolean.valueOf(mVAppMetrics.mo28400t()))) != 0 || ((mo28400t() && (compareTo = C25082a.m62848l(this.hasFineLocationPermission, mVAppMetrics.hasFineLocationPermission)) != 0) || (compareTo = Boolean.valueOf(mo28399s()).compareTo(Boolean.valueOf(mVAppMetrics.mo28399s()))) != 0 || ((mo28399s() && (compareTo = C25082a.m62848l(this.hasCoarseLocationPermission, mVAppMetrics.hasCoarseLocationPermission)) != 0) || (compareTo = Boolean.valueOf(mo28390i()).compareTo(Boolean.valueOf(mVAppMetrics.mo28390i()))) != 0 || ((mo28390i() && (compareTo = C25082a.m62840d(this.appDataSend, mVAppMetrics.appDataSend)) != 0) || (compareTo = Boolean.valueOf(mo28388h()).compareTo(Boolean.valueOf(mVAppMetrics.mo28388h()))) != 0 || ((mo28388h() && (compareTo = C25082a.m62840d(this.appDataReceived, mVAppMetrics.appDataReceived)) != 0) || (compareTo = Boolean.valueOf(mo28404w()).compareTo(Boolean.valueOf(mVAppMetrics.mo28404w()))) != 0 || ((mo28404w() && (compareTo = this.restrictBackgroundStatus.compareTo(mVAppMetrics.restrictBackgroundStatus)) != 0) || (compareTo = Boolean.valueOf(mo28394m()).compareTo(Boolean.valueOf(mVAppMetrics.mo28394m()))) != 0 || ((mo28394m() && (compareTo = C25082a.m62848l(this.areNotificationsEnabled, mVAppMetrics.areNotificationsEnabled)) != 0) || (compareTo = Boolean.valueOf(mo28403v()).compareTo(Boolean.valueOf(mVAppMetrics.mo28403v()))) != 0 || ((mo28403v() && (compareTo = C25082a.m62839c(this.notificationsImportance, mVAppMetrics.notificationsImportance)) != 0) || (compareTo = Boolean.valueOf(mo28392k()).compareTo(Boolean.valueOf(mVAppMetrics.mo28392k()))) != 0 || ((mo28392k() && (compareTo = C25082a.m62840d(this.appDirSizeInstall, mVAppMetrics.appDirSizeInstall)) != 0) || (compareTo = Boolean.valueOf(mo28398r()).compareTo(Boolean.valueOf(mVAppMetrics.mo28398r()))) != 0 || ((mo28398r() && (compareTo = C25082a.m62848l(this.hasCalendarPermission, mVAppMetrics.hasCalendarPermission)) != 0) || (compareTo = Boolean.valueOf(mo28397q()).compareTo(Boolean.valueOf(mVAppMetrics.mo28397q()))) != 0))))))))))))))))))) {
            return compareTo;
        }
        if (!mo28397q() || (l = C25082a.m62848l(this.hasATTPermission, mVAppMetrics.hasATTPermission)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAppMetrics)) {
            return mo28383a((MVAppMetrics) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28386f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo28387g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28388h() {
        return C13637c.m34053H(this.__isset_bitfield, 10);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28390i() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: j */
    public final boolean mo28391j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo28392k() {
        return C13637c.m34053H(this.__isset_bitfield, 13);
    }

    /* renamed from: l */
    public final boolean mo28393l() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: m */
    public final boolean mo28394m() {
        return C13637c.m34053H(this.__isset_bitfield, 11);
    }

    /* renamed from: o */
    public final boolean mo28395o() {
        return this.clientFlavour != null;
    }

    /* renamed from: p */
    public final boolean mo28396p() {
        return this.clientVersion != null;
    }

    /* renamed from: q */
    public final boolean mo28397q() {
        return C13637c.m34053H(this.__isset_bitfield, 15);
    }

    /* renamed from: r */
    public final boolean mo28398r() {
        return C13637c.m34053H(this.__isset_bitfield, 14);
    }

    /* renamed from: s */
    public final boolean mo28399s() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    /* renamed from: t */
    public final boolean mo28400t() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAppMetrics(", "clientVersion:");
        String str = this.clientVersion;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("clientFlavour:");
        String str2 = this.clientFlavour;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo28387g()) {
            n.append(", ");
            n.append("appDataDirSize:");
            n.append(this.appDataDirSize);
        }
        n.append(", ");
        n.append("appFilesDirSize:");
        C25541a.m63889t(n, this.appFilesDirSize, ", ", "appCacheDirSize:");
        C25541a.m63889t(n, this.appCacheDirSize, ", ", "appDatabasesDirSize:");
        C25541a.m63889t(n, this.appDatabasesDirSize, ", ", "moovitDatabaseSize:");
        C25541a.m63889t(n, this.moovitDatabaseSize, ", ", "userMetroId:");
        C0016g.m42z(n, this.userMetroId, ", ", "userMetroRevision:");
        C25541a.m63889t(n, this.userMetroRevision, ", ", "hasFineLocationPermission:");
        C13555b.m33977q(n, this.hasFineLocationPermission, ", ", "hasCoarseLocationPermission:");
        C13555b.m33977q(n, this.hasCoarseLocationPermission, ", ", "appDataSend:");
        C25541a.m63889t(n, this.appDataSend, ", ", "appDataReceived:");
        C25541a.m63889t(n, this.appDataReceived, ", ", "restrictBackgroundStatus:");
        String str3 = this.restrictBackgroundStatus;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("areNotificationsEnabled:");
        C13555b.m33977q(n, this.areNotificationsEnabled, ", ", "notificationsImportance:");
        C0016g.m42z(n, this.notificationsImportance, ", ", "appDirSizeInstall:");
        C25541a.m63889t(n, this.appDirSizeInstall, ", ", "hasCalendarPermission:");
        C13555b.m33977q(n, this.hasCalendarPermission, ", ", "hasATTPermission:");
        return C25541a.m63885p(n, this.hasATTPermission, ")");
    }

    /* renamed from: u */
    public final boolean mo28402u() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: v */
    public final boolean mo28403v() {
        return C13637c.m34053H(this.__isset_bitfield, 12);
    }

    /* renamed from: w */
    public final boolean mo28404w() {
        return this.restrictBackgroundStatus != null;
    }

    /* renamed from: y */
    public final boolean mo28405y() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }
}
