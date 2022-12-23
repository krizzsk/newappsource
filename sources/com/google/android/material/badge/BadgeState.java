package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14077m;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.p982v1.XmlPullParserException;
import p355ac.C13403d;
import p355ac.C13408i;
import p355ac.C13409j;
import p355ac.C13410k;
import p355ac.C13411l;
import p742qc.C19099c;

public final class BadgeState {

    /* renamed from: a */
    public final State f34240a;

    /* renamed from: b */
    public final State f34241b = new State();

    /* renamed from: c */
    public final float f34242c;

    /* renamed from: d */
    public final float f34243d;

    /* renamed from: e */
    public final float f34244e;

    public BadgeState(Context context, State state) {
        int i;
        AttributeSet attributeSet;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Locale locale;
        int next;
        int i11 = C13897a.f34264p;
        int i12 = C13897a.f34263o;
        state = state == null ? new State() : state;
        int i13 = state.f34245b;
        int i14 = 0;
        if (i13 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i13);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    attributeSet = Xml.asAttributeSet(xml);
                    i = attributeSet.getStyleAttribute();
                } else {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
            } catch (IOException | XmlPullParserException e) {
                StringBuilder k = C13555b.m33972k("Can't load badge resource ID #0x");
                k.append(Integer.toHexString(i13));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(k.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        if (i == 0) {
            i2 = i12;
        } else {
            i2 = i;
        }
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.Badge, i11, i2, new int[0]);
        Resources resources = context.getResources();
        this.f34242c = (float) d.getDimensionPixelSize(C13411l.Badge_badgeRadius, resources.getDimensionPixelSize(C13403d.mtrl_badge_radius));
        this.f34244e = (float) d.getDimensionPixelSize(C13411l.Badge_badgeWidePadding, resources.getDimensionPixelSize(C13403d.mtrl_badge_long_text_horizontal_padding));
        this.f34243d = (float) d.getDimensionPixelSize(C13411l.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(C13403d.mtrl_badge_with_text_radius));
        State state2 = this.f34241b;
        int i15 = state.f34248e;
        state2.f34248e = i15 == -2 ? ValidationUtils.APPBOY_STRING_MAX_LENGTH : i15;
        CharSequence charSequence = state.f34252i;
        state2.f34252i = charSequence == null ? context.getString(C13409j.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f34241b;
        int i16 = state.f34253j;
        state3.f34253j = i16 == 0 ? C13408i.mtrl_badge_content_description : i16;
        int i17 = state.f34254k;
        state3.f34254k = i17 == 0 ? C13409j.mtrl_exceed_max_badge_number_content_description : i17;
        Boolean bool = state.f34256m;
        if (bool == null || bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        state3.f34256m = Boolean.valueOf(z);
        State state4 = this.f34241b;
        int i18 = state.f34250g;
        state4.f34250g = i18 == -2 ? d.getInt(C13411l.Badge_maxCharacterCount, 4) : i18;
        int i19 = state.f34249f;
        if (i19 != -2) {
            this.f34241b.f34249f = i19;
        } else {
            int i21 = C13411l.Badge_number;
            if (d.hasValue(i21)) {
                this.f34241b.f34249f = d.getInt(i21, 0);
            } else {
                this.f34241b.f34249f = -1;
            }
        }
        State state5 = this.f34241b;
        Integer num = state.f34246c;
        if (num == null) {
            i3 = C19099c.m46247a(context, d, C13411l.Badge_backgroundColor).getDefaultColor();
        } else {
            i3 = num.intValue();
        }
        state5.f34246c = Integer.valueOf(i3);
        Integer num2 = state.f34247d;
        if (num2 != null) {
            this.f34241b.f34247d = num2;
        } else {
            int i22 = C13411l.Badge_badgeTextColor;
            if (d.hasValue(i22)) {
                this.f34241b.f34247d = Integer.valueOf(C19099c.m46247a(context, d, i22).getDefaultColor());
            } else {
                int i23 = C13410k.TextAppearance_MaterialComponents_Badge;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i23, C13411l.TextAppearance);
                obtainStyledAttributes.getDimension(C13411l.TextAppearance_android_textSize, BitmapDescriptorFactory.HUE_RED);
                ColorStateList a = C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColor);
                C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColorHint);
                C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColorLink);
                obtainStyledAttributes.getInt(C13411l.TextAppearance_android_textStyle, 0);
                obtainStyledAttributes.getInt(C13411l.TextAppearance_android_typeface, 1);
                int i24 = C13411l.TextAppearance_fontFamily;
                i24 = !obtainStyledAttributes.hasValue(i24) ? C13411l.TextAppearance_android_fontFamily : i24;
                obtainStyledAttributes.getResourceId(i24, 0);
                obtainStyledAttributes.getString(i24);
                obtainStyledAttributes.getBoolean(C13411l.TextAppearance_textAllCaps, false);
                C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_shadowColor);
                obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowDx, BitmapDescriptorFactory.HUE_RED);
                obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowDy, BitmapDescriptorFactory.HUE_RED);
                obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowRadius, BitmapDescriptorFactory.HUE_RED);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i23, C13411l.MaterialTextAppearance);
                int i25 = C13411l.MaterialTextAppearance_android_letterSpacing;
                obtainStyledAttributes2.hasValue(i25);
                obtainStyledAttributes2.getFloat(i25, BitmapDescriptorFactory.HUE_RED);
                obtainStyledAttributes2.recycle();
                this.f34241b.f34247d = Integer.valueOf(a.getDefaultColor());
            }
        }
        State state6 = this.f34241b;
        Integer num3 = state.f34255l;
        if (num3 == null) {
            i4 = d.getInt(C13411l.Badge_badgeGravity, 8388661);
        } else {
            i4 = num3.intValue();
        }
        state6.f34255l = Integer.valueOf(i4);
        State state7 = this.f34241b;
        Integer num4 = state.f34257n;
        if (num4 == null) {
            i5 = d.getDimensionPixelOffset(C13411l.Badge_horizontalOffset, 0);
        } else {
            i5 = num4.intValue();
        }
        state7.f34257n = Integer.valueOf(i5);
        State state8 = this.f34241b;
        if (state.f34257n == null) {
            i6 = d.getDimensionPixelOffset(C13411l.Badge_verticalOffset, 0);
        } else {
            i6 = state.f34258o.intValue();
        }
        state8.f34258o = Integer.valueOf(i6);
        State state9 = this.f34241b;
        Integer num5 = state.f34259p;
        if (num5 == null) {
            i7 = d.getDimensionPixelOffset(C13411l.Badge_horizontalOffsetWithText, state9.f34257n.intValue());
        } else {
            i7 = num5.intValue();
        }
        state9.f34259p = Integer.valueOf(i7);
        State state10 = this.f34241b;
        Integer num6 = state.f34260q;
        if (num6 == null) {
            i8 = d.getDimensionPixelOffset(C13411l.Badge_verticalOffsetWithText, state10.f34258o.intValue());
        } else {
            i8 = num6.intValue();
        }
        state10.f34260q = Integer.valueOf(i8);
        State state11 = this.f34241b;
        Integer num7 = state.f34261r;
        if (num7 == null) {
            i9 = 0;
        } else {
            i9 = num7.intValue();
        }
        state11.f34261r = Integer.valueOf(i9);
        State state12 = this.f34241b;
        Integer num8 = state.f34262s;
        state12.f34262s = Integer.valueOf(num8 != null ? num8.intValue() : i14);
        d.recycle();
        Locale locale2 = state.f34251h;
        if (locale2 == null) {
            State state13 = this.f34241b;
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state13.f34251h = locale;
        } else {
            this.f34241b.f34251h = locale2;
        }
        this.f34240a = state;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C13896a();

        /* renamed from: b */
        public int f34245b;

        /* renamed from: c */
        public Integer f34246c;

        /* renamed from: d */
        public Integer f34247d;

        /* renamed from: e */
        public int f34248e = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

        /* renamed from: f */
        public int f34249f = -2;

        /* renamed from: g */
        public int f34250g = -2;

        /* renamed from: h */
        public Locale f34251h;

        /* renamed from: i */
        public CharSequence f34252i;

        /* renamed from: j */
        public int f34253j;

        /* renamed from: k */
        public int f34254k;

        /* renamed from: l */
        public Integer f34255l;

        /* renamed from: m */
        public Boolean f34256m = Boolean.TRUE;

        /* renamed from: n */
        public Integer f34257n;

        /* renamed from: o */
        public Integer f34258o;

        /* renamed from: p */
        public Integer f34259p;

        /* renamed from: q */
        public Integer f34260q;

        /* renamed from: r */
        public Integer f34261r;

        /* renamed from: s */
        public Integer f34262s;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        public class C13896a implements Parcelable.Creator<State> {
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            public final Object[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.f34245b);
            parcel.writeSerializable(this.f34246c);
            parcel.writeSerializable(this.f34247d);
            parcel.writeInt(this.f34248e);
            parcel.writeInt(this.f34249f);
            parcel.writeInt(this.f34250g);
            CharSequence charSequence = this.f34252i;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f34253j);
            parcel.writeSerializable(this.f34255l);
            parcel.writeSerializable(this.f34257n);
            parcel.writeSerializable(this.f34258o);
            parcel.writeSerializable(this.f34259p);
            parcel.writeSerializable(this.f34260q);
            parcel.writeSerializable(this.f34261r);
            parcel.writeSerializable(this.f34262s);
            parcel.writeSerializable(this.f34256m);
            parcel.writeSerializable(this.f34251h);
        }

        public State(Parcel parcel) {
            this.f34245b = parcel.readInt();
            this.f34246c = (Integer) parcel.readSerializable();
            this.f34247d = (Integer) parcel.readSerializable();
            this.f34248e = parcel.readInt();
            this.f34249f = parcel.readInt();
            this.f34250g = parcel.readInt();
            this.f34252i = parcel.readString();
            this.f34253j = parcel.readInt();
            this.f34255l = (Integer) parcel.readSerializable();
            this.f34257n = (Integer) parcel.readSerializable();
            this.f34258o = (Integer) parcel.readSerializable();
            this.f34259p = (Integer) parcel.readSerializable();
            this.f34260q = (Integer) parcel.readSerializable();
            this.f34261r = (Integer) parcel.readSerializable();
            this.f34262s = (Integer) parcel.readSerializable();
            this.f34256m = (Boolean) parcel.readSerializable();
            this.f34251h = (Locale) parcel.readSerializable();
        }
    }
}
