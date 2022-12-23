package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.theartofdev.edmodo.cropper.CropImageView;

public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C8038a();

    /* renamed from: A */
    public int f24317A;

    /* renamed from: B */
    public int f24318B;

    /* renamed from: C */
    public int f24319C;

    /* renamed from: D */
    public int f24320D;

    /* renamed from: E */
    public CharSequence f24321E;

    /* renamed from: F */
    public int f24322F;

    /* renamed from: G */
    public Uri f24323G;

    /* renamed from: H */
    public Bitmap.CompressFormat f24324H;

    /* renamed from: I */
    public int f24325I;

    /* renamed from: J */
    public int f24326J;

    /* renamed from: K */
    public int f24327K;

    /* renamed from: L */
    public CropImageView.RequestSizeOptions f24328L;

    /* renamed from: M */
    public boolean f24329M;

    /* renamed from: N */
    public Rect f24330N;

    /* renamed from: O */
    public int f24331O;

    /* renamed from: P */
    public boolean f24332P;

    /* renamed from: Q */
    public boolean f24333Q;

    /* renamed from: R */
    public boolean f24334R;

    /* renamed from: S */
    public int f24335S;

    /* renamed from: T */
    public boolean f24336T;

    /* renamed from: U */
    public boolean f24337U;

    /* renamed from: X */
    public CharSequence f24338X;

    /* renamed from: Y */
    public int f24339Y;

    /* renamed from: b */
    public CropImageView.CropShape f24340b;

    /* renamed from: c */
    public float f24341c;

    /* renamed from: d */
    public float f24342d;

    /* renamed from: e */
    public CropImageView.Guidelines f24343e;

    /* renamed from: f */
    public CropImageView.ScaleType f24344f;

    /* renamed from: g */
    public boolean f24345g;

    /* renamed from: h */
    public boolean f24346h;

    /* renamed from: i */
    public boolean f24347i;

    /* renamed from: j */
    public boolean f24348j;

    /* renamed from: k */
    public int f24349k;

    /* renamed from: l */
    public float f24350l;

    /* renamed from: m */
    public boolean f24351m;

    /* renamed from: n */
    public int f24352n;

    /* renamed from: o */
    public int f24353o;

    /* renamed from: p */
    public float f24354p;

    /* renamed from: q */
    public int f24355q;

    /* renamed from: r */
    public float f24356r;

    /* renamed from: s */
    public float f24357s;

    /* renamed from: t */
    public float f24358t;

    /* renamed from: u */
    public int f24359u;

    /* renamed from: v */
    public float f24360v;

    /* renamed from: w */
    public int f24361w;

    /* renamed from: x */
    public int f24362x;

    /* renamed from: y */
    public int f24363y;

    /* renamed from: z */
    public int f24364z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$a */
    public static class C8038a implements Parcelable.Creator<CropImageOptions> {
        public final Object createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        public final Object[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f24340b = CropImageView.CropShape.RECTANGLE;
        this.f24341c = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f24342d = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f24343e = CropImageView.Guidelines.ON_TOUCH;
        this.f24344f = CropImageView.ScaleType.FIT_CENTER;
        this.f24345g = true;
        this.f24346h = true;
        this.f24347i = true;
        this.f24348j = false;
        this.f24349k = 4;
        this.f24350l = 0.1f;
        this.f24351m = false;
        this.f24352n = 1;
        this.f24353o = 1;
        this.f24354p = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f24355q = Color.argb(170, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        this.f24356r = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f24357s = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f24358t = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f24359u = -1;
        this.f24360v = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f24361w = Color.argb(170, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        this.f24362x = Color.argb(119, 0, 0, 0);
        this.f24363y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f24364z = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f24317A = 40;
        this.f24318B = 40;
        this.f24319C = 99999;
        this.f24320D = 99999;
        this.f24321E = "";
        this.f24322F = 0;
        this.f24323G = Uri.EMPTY;
        this.f24324H = Bitmap.CompressFormat.JPEG;
        this.f24325I = 90;
        this.f24326J = 0;
        this.f24327K = 0;
        this.f24328L = CropImageView.RequestSizeOptions.NONE;
        this.f24329M = false;
        this.f24330N = null;
        this.f24331O = -1;
        this.f24332P = true;
        this.f24333Q = true;
        this.f24334R = false;
        this.f24335S = 90;
        this.f24336T = false;
        this.f24337U = false;
        this.f24338X = null;
        this.f24339Y = 0;
    }

    /* renamed from: b */
    public final void mo25106b() {
        if (this.f24349k < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f24342d >= BitmapDescriptorFactory.HUE_RED) {
            float f = this.f24350l;
            if (f < BitmapDescriptorFactory.HUE_RED || ((double) f) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            } else if (this.f24352n <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f24353o <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f24354p < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.f24356r < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.f24360v < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.f24364z >= 0) {
                int i = this.f24317A;
                if (i >= 0) {
                    int i2 = this.f24318B;
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.f24319C < i) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.f24320D < i2) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f24326J < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f24327K >= 0) {
                        int i3 = this.f24335S;
                        if (i3 < 0 || i3 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24340b.ordinal());
        parcel.writeFloat(this.f24341c);
        parcel.writeFloat(this.f24342d);
        parcel.writeInt(this.f24343e.ordinal());
        parcel.writeInt(this.f24344f.ordinal());
        parcel.writeByte(this.f24345g ? (byte) 1 : 0);
        parcel.writeByte(this.f24346h ? (byte) 1 : 0);
        parcel.writeByte(this.f24347i ? (byte) 1 : 0);
        parcel.writeByte(this.f24348j ? (byte) 1 : 0);
        parcel.writeInt(this.f24349k);
        parcel.writeFloat(this.f24350l);
        parcel.writeByte(this.f24351m ? (byte) 1 : 0);
        parcel.writeInt(this.f24352n);
        parcel.writeInt(this.f24353o);
        parcel.writeFloat(this.f24354p);
        parcel.writeInt(this.f24355q);
        parcel.writeFloat(this.f24356r);
        parcel.writeFloat(this.f24357s);
        parcel.writeFloat(this.f24358t);
        parcel.writeInt(this.f24359u);
        parcel.writeFloat(this.f24360v);
        parcel.writeInt(this.f24361w);
        parcel.writeInt(this.f24362x);
        parcel.writeInt(this.f24363y);
        parcel.writeInt(this.f24364z);
        parcel.writeInt(this.f24317A);
        parcel.writeInt(this.f24318B);
        parcel.writeInt(this.f24319C);
        parcel.writeInt(this.f24320D);
        TextUtils.writeToParcel(this.f24321E, parcel, i);
        parcel.writeInt(this.f24322F);
        parcel.writeParcelable(this.f24323G, i);
        parcel.writeString(this.f24324H.name());
        parcel.writeInt(this.f24325I);
        parcel.writeInt(this.f24326J);
        parcel.writeInt(this.f24327K);
        parcel.writeInt(this.f24328L.ordinal());
        parcel.writeInt(this.f24329M ? 1 : 0);
        parcel.writeParcelable(this.f24330N, i);
        parcel.writeInt(this.f24331O);
        parcel.writeByte(this.f24332P ? (byte) 1 : 0);
        parcel.writeByte(this.f24333Q ? (byte) 1 : 0);
        parcel.writeByte(this.f24334R ? (byte) 1 : 0);
        parcel.writeInt(this.f24335S);
        parcel.writeByte(this.f24336T ? (byte) 1 : 0);
        parcel.writeByte(this.f24337U ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f24338X, parcel, i);
        parcel.writeInt(this.f24339Y);
    }

    public CropImageOptions(Parcel parcel) {
        this.f24340b = CropImageView.CropShape.values()[parcel.readInt()];
        this.f24341c = parcel.readFloat();
        this.f24342d = parcel.readFloat();
        this.f24343e = CropImageView.Guidelines.values()[parcel.readInt()];
        this.f24344f = CropImageView.ScaleType.values()[parcel.readInt()];
        boolean z = true;
        this.f24345g = parcel.readByte() != 0;
        this.f24346h = parcel.readByte() != 0;
        this.f24347i = parcel.readByte() != 0;
        this.f24348j = parcel.readByte() != 0;
        this.f24349k = parcel.readInt();
        this.f24350l = parcel.readFloat();
        this.f24351m = parcel.readByte() != 0;
        this.f24352n = parcel.readInt();
        this.f24353o = parcel.readInt();
        this.f24354p = parcel.readFloat();
        this.f24355q = parcel.readInt();
        this.f24356r = parcel.readFloat();
        this.f24357s = parcel.readFloat();
        this.f24358t = parcel.readFloat();
        this.f24359u = parcel.readInt();
        this.f24360v = parcel.readFloat();
        this.f24361w = parcel.readInt();
        this.f24362x = parcel.readInt();
        this.f24363y = parcel.readInt();
        this.f24364z = parcel.readInt();
        this.f24317A = parcel.readInt();
        this.f24318B = parcel.readInt();
        this.f24319C = parcel.readInt();
        this.f24320D = parcel.readInt();
        this.f24321E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f24322F = parcel.readInt();
        this.f24323G = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f24324H = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f24325I = parcel.readInt();
        this.f24326J = parcel.readInt();
        this.f24327K = parcel.readInt();
        this.f24328L = CropImageView.RequestSizeOptions.values()[parcel.readInt()];
        this.f24329M = parcel.readByte() != 0;
        this.f24330N = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f24331O = parcel.readInt();
        this.f24332P = parcel.readByte() != 0;
        this.f24333Q = parcel.readByte() != 0;
        this.f24334R = parcel.readByte() != 0;
        this.f24335S = parcel.readInt();
        this.f24336T = parcel.readByte() != 0;
        this.f24337U = parcel.readByte() == 0 ? false : z;
        this.f24338X = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f24339Y = parcel.readInt();
    }
}
