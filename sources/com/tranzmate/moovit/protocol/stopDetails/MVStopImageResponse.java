package com.tranzmate.moovit.protocol.stopDetails;

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

public class MVStopImageResponse implements TBase<MVStopImageResponse, _Fields>, Serializable, Cloneable, Comparable<MVStopImageResponse> {

    /* renamed from: b */
    public static final C25113c f28343b = new C25113c("images", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28344c = new C25113c("thumbnailUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28345d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28346e;
    public List<MVStopImage> images;
    public String thumbnailUrl;

    public enum _Fields implements C25085c {
        IMAGES(1, "images"),
        THUMBNAIL_URL(2, "thumbnailUrl");
        
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
                return IMAGES;
            }
            if (i != 2) {
                return null;
            }
            return THUMBNAIL_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageResponse$a */
    public static class C10547a extends C25239c<MVStopImageResponse> {
        public C10547a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) tBase;
            mVStopImageResponse.getClass();
            C25113c cVar = MVStopImageResponse.f28343b;
            gVar.mo61687K();
            if (mVStopImageResponse.images != null) {
                gVar.mo61711x(MVStopImageResponse.f28343b);
                gVar.mo61680D(new C25119e((byte) 12, mVStopImageResponse.images.size()));
                for (MVStopImage X0 : mVStopImageResponse.images) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopImageResponse.thumbnailUrl != null) {
                gVar.mo61711x(MVStopImageResponse.f28344c);
                gVar.mo61686J(mVStopImageResponse.thumbnailUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopImageResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVStopImageResponse.thumbnailUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVStopImageResponse.images = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVStopImage mVStopImage = new MVStopImage();
                        mVStopImage.mo25201C1(gVar);
                        mVStopImageResponse.images.add(mVStopImage);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageResponse$b */
    public static class C10548b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10547a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageResponse$c */
    public static class C10549c extends C25240d<MVStopImageResponse> {
        public C10549c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopImageResponse.mo31772f()) {
                bitSet.set(0);
            }
            if (mVStopImageResponse.mo31773g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVStopImageResponse.mo31772f()) {
                jVar.mo61678B(mVStopImageResponse.images.size());
                for (MVStopImage X0 : mVStopImageResponse.images) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVStopImageResponse.mo31773g()) {
                jVar.mo61686J(mVStopImageResponse.thumbnailUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVStopImageResponse.images = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVStopImage mVStopImage = new MVStopImage();
                    mVStopImage.mo25201C1(jVar);
                    mVStopImageResponse.images.add(mVStopImage);
                }
            }
            if (T.get(1)) {
                mVStopImageResponse.thumbnailUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageResponse$d */
    public static class C10550d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10549c(0);
        }
    }

    static {
        new C17394d0("MVStopImageResponse");
        HashMap hashMap = new HashMap();
        f28345d = hashMap;
        hashMap.put(C25239c.class, new C10548b());
        hashMap.put(C25240d.class, new C10550d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGES, new FieldMetaData("images", (byte) 3, new ListMetaData(new StructMetaData(MVStopImage.class))));
        enumMap.put(_Fields.THUMBNAIL_URL, new FieldMetaData("thumbnailUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28346e = unmodifiableMap;
        FieldMetaData.m61947a(MVStopImageResponse.class, unmodifiableMap);
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
        ((C25238b) f28345d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28345d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) obj;
        if (!getClass().equals(mVStopImageResponse.getClass())) {
            return getClass().getName().compareTo(mVStopImageResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31772f()).compareTo(Boolean.valueOf(mVStopImageResponse.mo31772f()));
        if (compareTo2 != 0 || ((mo31772f() && (compareTo2 = C25082a.m62844h(this.images, mVStopImageResponse.images)) != 0) || (compareTo2 = Boolean.valueOf(mo31773g()).compareTo(Boolean.valueOf(mVStopImageResponse.mo31773g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31773g() || (compareTo = this.thumbnailUrl.compareTo(mVStopImageResponse.thumbnailUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopImageResponse)) {
            return false;
        }
        MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) obj;
        boolean f = mo31772f();
        boolean f2 = mVStopImageResponse.mo31772f();
        if ((f || f2) && (!f || !f2 || !this.images.equals(mVStopImageResponse.images))) {
            return false;
        }
        boolean g = mo31773g();
        boolean g2 = mVStopImageResponse.mo31773g();
        if ((g || g2) && (!g || !g2 || !this.thumbnailUrl.equals(mVStopImageResponse.thumbnailUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31772f() {
        return this.images != null;
    }

    /* renamed from: g */
    public final boolean mo31773g() {
        return this.thumbnailUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopImageResponse(", "images:");
        List<MVStopImage> list = this.images;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("thumbnailUrl:");
        String str = this.thumbnailUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
