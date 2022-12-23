package com.tranzmate.moovit.protocol.common;

import com.appboy.models.MessageButton;
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

public class MVTextOrImage implements TBase<MVTextOrImage, _Fields>, Serializable, Cloneable, Comparable<MVTextOrImage> {

    /* renamed from: b */
    public static final C25113c f25151b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25152c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25153d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25154e;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.TEXT, _Fields.IMAGE};
    public String text;

    public enum _Fields implements C25085c {
        TEXT(1, MessageButton.TEXT),
        IMAGE(2, "image");
        
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
                return TEXT;
            }
            if (i != 2) {
                return null;
            }
            return IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVTextOrImage$a */
    public static class C8500a extends C25239c<MVTextOrImage> {
        public C8500a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTextOrImage mVTextOrImage = (MVTextOrImage) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTextOrImage.image;
            C25113c cVar = MVTextOrImage.f25151b;
            gVar.mo61687K();
            if (mVTextOrImage.text != null && mVTextOrImage.mo26416g()) {
                gVar.mo61711x(MVTextOrImage.f25151b);
                gVar.mo61686J(mVTextOrImage.text);
                gVar.mo61712y();
            }
            if (mVTextOrImage.image != null && mVTextOrImage.mo26415f()) {
                gVar.mo61711x(MVTextOrImage.f25152c);
                mVTextOrImage.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTextOrImage mVTextOrImage = (MVTextOrImage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTextOrImage.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVTextOrImage.image = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTextOrImage.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVTextOrImage$b */
    public static class C8501b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8500a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVTextOrImage$c */
    public static class C8502c extends C25240d<MVTextOrImage> {
        public C8502c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTextOrImage mVTextOrImage = (MVTextOrImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTextOrImage.mo26416g()) {
                bitSet.set(0);
            }
            if (mVTextOrImage.mo26415f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTextOrImage.mo26416g()) {
                jVar.mo61686J(mVTextOrImage.text);
            }
            if (mVTextOrImage.mo26415f()) {
                mVTextOrImage.image.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTextOrImage mVTextOrImage = (MVTextOrImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTextOrImage.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTextOrImage.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVTextOrImage$d */
    public static class C8503d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8502c(0);
        }
    }

    static {
        new C17394d0("MVTextOrImage");
        HashMap hashMap = new HashMap();
        f25153d = hashMap;
        hashMap.put(C25239c.class, new C8501b());
        hashMap.put(C25240d.class, new C8503d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25154e = unmodifiableMap;
        FieldMetaData.m61947a(MVTextOrImage.class, unmodifiableMap);
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
        ((C25238b) f25153d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25153d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26412a(MVTextOrImage mVTextOrImage) {
        if (mVTextOrImage == null) {
            return false;
        }
        boolean g = mo26416g();
        boolean g2 = mVTextOrImage.mo26416g();
        if ((g || g2) && (!g || !g2 || !this.text.equals(mVTextOrImage.text))) {
            return false;
        }
        boolean f = mo26415f();
        boolean f2 = mVTextOrImage.mo26415f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.image.mo26245a(mVTextOrImage.image)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTextOrImage mVTextOrImage = (MVTextOrImage) obj;
        if (!getClass().equals(mVTextOrImage.getClass())) {
            return getClass().getName().compareTo(mVTextOrImage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26416g()).compareTo(Boolean.valueOf(mVTextOrImage.mo26416g()));
        if (compareTo2 != 0 || ((mo26416g() && (compareTo2 = this.text.compareTo(mVTextOrImage.text)) != 0) || (compareTo2 = Boolean.valueOf(mo26415f()).compareTo(Boolean.valueOf(mVTextOrImage.mo26415f()))) != 0)) {
            return compareTo2;
        }
        if (!mo26415f() || (compareTo = this.image.compareTo(mVTextOrImage.image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTextOrImage)) {
            return mo26412a((MVTextOrImage) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26415f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo26416g() {
        return this.text != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVTextOrImage(");
        if (mo26416g()) {
            sb.append("text:");
            String str = this.text;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo26415f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
