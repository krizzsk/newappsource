package p022b3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p001a0.C0016g;
import p241s0.C6302b;

/* renamed from: b3.c */
public final class C1463c extends C1462b {

    /* renamed from: d */
    public final SparseIntArray f5328d;

    /* renamed from: e */
    public final Parcel f5329e;

    /* renamed from: f */
    public final int f5330f;

    /* renamed from: g */
    public final int f5331g;

    /* renamed from: h */
    public final String f5332h;

    /* renamed from: i */
    public int f5333i;

    /* renamed from: j */
    public int f5334j;

    /* renamed from: k */
    public int f5335k;

    public C1463c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6302b(), new C6302b(), new C6302b());
    }

    /* renamed from: a */
    public final C1463c mo5792a() {
        Parcel parcel = this.f5329e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5334j;
        if (i == this.f5330f) {
            i = this.f5331g;
        }
        return new C1463c(parcel, dataPosition, i, C0016g.m31o(new StringBuilder(), this.f5332h, "  "), this.f5325a, this.f5326b, this.f5327c);
    }

    /* renamed from: e */
    public final boolean mo5796e() {
        return this.f5329e.readInt() != 0;
    }

    /* renamed from: f */
    public final byte[] mo5797f() {
        int readInt = this.f5329e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5329e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: g */
    public final CharSequence mo5798g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5329e);
    }

    /* renamed from: h */
    public final boolean mo5799h(int i) {
        while (this.f5334j < this.f5331g) {
            int i2 = this.f5335k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5329e.setDataPosition(this.f5334j);
            int readInt = this.f5329e.readInt();
            this.f5335k = this.f5329e.readInt();
            this.f5334j += readInt;
        }
        if (this.f5335k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int mo5800i() {
        return this.f5329e.readInt();
    }

    /* renamed from: k */
    public final <T extends Parcelable> T mo5802k() {
        return this.f5329e.readParcelable(C1463c.class.getClassLoader());
    }

    /* renamed from: m */
    public final String mo5804m() {
        return this.f5329e.readString();
    }

    /* renamed from: o */
    public final void mo5806o(int i) {
        mo5815x();
        this.f5333i = i;
        this.f5328d.put(i, this.f5329e.dataPosition());
        mo5810s(0);
        mo5810s(i);
    }

    /* renamed from: p */
    public final void mo5807p(boolean z) {
        this.f5329e.writeInt(z ? 1 : 0);
    }

    /* renamed from: q */
    public final void mo5808q(byte[] bArr) {
        if (bArr != null) {
            this.f5329e.writeInt(bArr.length);
            this.f5329e.writeByteArray(bArr);
            return;
        }
        this.f5329e.writeInt(-1);
    }

    /* renamed from: r */
    public final void mo5809r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5329e, 0);
    }

    /* renamed from: s */
    public final void mo5810s(int i) {
        this.f5329e.writeInt(i);
    }

    /* renamed from: u */
    public final void mo5812u(Parcelable parcelable) {
        this.f5329e.writeParcelable(parcelable, 0);
    }

    /* renamed from: v */
    public final void mo5813v(String str) {
        this.f5329e.writeString(str);
    }

    /* renamed from: x */
    public final void mo5815x() {
        int i = this.f5333i;
        if (i >= 0) {
            int i2 = this.f5328d.get(i);
            int dataPosition = this.f5329e.dataPosition();
            this.f5329e.setDataPosition(i2);
            this.f5329e.writeInt(dataPosition - i2);
            this.f5329e.setDataPosition(dataPosition);
        }
    }

    public C1463c(Parcel parcel, int i, int i2, String str, C6302b<String, Method> bVar, C6302b<String, Method> bVar2, C6302b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f5328d = new SparseIntArray();
        this.f5333i = -1;
        this.f5335k = -1;
        this.f5329e = parcel;
        this.f5330f = i;
        this.f5331g = i2;
        this.f5334j = i;
        this.f5332h = str;
    }
}
