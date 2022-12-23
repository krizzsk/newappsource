package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.C14000s;
import com.google.android.material.internal.C14081p;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import p229r1.C6233c;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13409j;
import p584jl.C17885a;
import p742qc.C19098b;

public class RangeDateSelector implements DateSelector<C6233c<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C13969a();

    /* renamed from: b */
    public String f34662b;

    /* renamed from: c */
    public Long f34663c = null;

    /* renamed from: d */
    public Long f34664d = null;

    /* renamed from: e */
    public Long f34665e = null;

    /* renamed from: f */
    public Long f34666f = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    public class C13969a implements Parcelable.Creator<RangeDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f34663c = (Long) parcel.readValue(cls.getClassLoader());
            rangeDateSelector.f34664d = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        public final Object[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: b */
    public static void m34869b(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C14006w wVar) {
        boolean z;
        Long l = rangeDateSelector.f34665e;
        if (l == null || rangeDateSelector.f34666f == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f34662b.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError((CharSequence) null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError((CharSequence) null);
            }
            wVar.mo41572a();
            return;
        }
        if (l.longValue() <= rangeDateSelector.f34666f.longValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Long l2 = rangeDateSelector.f34665e;
            rangeDateSelector.f34663c = l2;
            Long l3 = rangeDateSelector.f34666f;
            rangeDateSelector.f34664d = l3;
            wVar.mo41573b(new C6233c(l2, l3));
            return;
        }
        textInputLayout.setError(rangeDateSelector.f34662b);
        textInputLayout2.setError(" ");
        wVar.mo41572a();
    }

    /* renamed from: I1 */
    public final boolean mo41499I1() {
        boolean z;
        Long l = this.f34663c;
        if (!(l == null || this.f34664d == null)) {
            if (l.longValue() <= this.f34664d.longValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N1 */
    public final ArrayList mo41500N1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f34663c;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f34664d;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    /* renamed from: S1 */
    public final Object mo41501S1() {
        return new C6233c(this.f34663c, this.f34664d);
    }

    /* renamed from: W0 */
    public final String mo41502W0(Context context) {
        C6233c cVar;
        Resources resources = context.getResources();
        Long l = this.f34663c;
        if (l == null && this.f34664d == null) {
            return resources.getString(C13409j.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f34664d;
        if (l2 == null) {
            return resources.getString(C13409j.mtrl_picker_range_header_only_start_selected, new Object[]{C13982f.m34902a(l.longValue())});
        } else if (l == null) {
            return resources.getString(C13409j.mtrl_picker_range_header_only_end_selected, new Object[]{C13982f.m34902a(l2.longValue())});
        } else {
            Calendar h = C13979d0.m34898h();
            Calendar i = C13979d0.m34899i((Calendar) null);
            i.setTimeInMillis(l.longValue());
            Calendar i2 = C13979d0.m34899i((Calendar) null);
            i2.setTimeInMillis(l2.longValue());
            if (i.get(1) != i2.get(1)) {
                cVar = new C6233c(C13982f.m34905d(l.longValue(), Locale.getDefault()), C13982f.m34905d(l2.longValue(), Locale.getDefault()));
            } else if (i.get(1) == h.get(1)) {
                cVar = new C6233c(C13982f.m34903b(l.longValue(), Locale.getDefault()), C13982f.m34903b(l2.longValue(), Locale.getDefault()));
            } else {
                cVar = new C6233c(C13982f.m34903b(l.longValue(), Locale.getDefault()), C13982f.m34905d(l2.longValue(), Locale.getDefault()));
            }
            return resources.getString(C13409j.mtrl_picker_range_header_selected, new Object[]{cVar.f19679a, cVar.f19680b});
        }
    }

    /* renamed from: Y1 */
    public final void mo41503Y1(long j) {
        boolean z;
        Long l = this.f34663c;
        if (l == null) {
            this.f34663c = Long.valueOf(j);
            return;
        }
        if (this.f34664d == null) {
            if (l.longValue() <= j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f34664d = Long.valueOf(j);
                return;
            }
        }
        this.f34664d = null;
        this.f34663c = Long.valueOf(j);
    }

    /* renamed from: a1 */
    public final ArrayList mo41504a1() {
        if (this.f34663c == null || this.f34664d == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6233c(this.f34663c, this.f34664d));
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: k1 */
    public final View mo41505k1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C14000s.C14001a aVar) {
        View inflate = layoutInflater.inflate(C13407h.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C13405f.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C13405f.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C17885a.m44436e0()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f34662b = inflate.getResources().getString(C13409j.mtrl_picker_invalid_range);
        SimpleDateFormat f = C13979d0.m34896f();
        Long l = this.f34663c;
        if (l != null) {
            editText.setText(f.format(l));
            this.f34665e = this.f34663c;
        }
        Long l2 = this.f34664d;
        if (l2 != null) {
            editText2.setText(f.format(l2));
            this.f34666f = this.f34664d;
        }
        String g = C13979d0.m34897g(inflate.getResources(), f);
        textInputLayout.setPlaceholderText(g);
        textInputLayout2.setPlaceholderText(g);
        SimpleDateFormat simpleDateFormat = f;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        C14008y yVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = g;
        C14000s.C14001a aVar2 = aVar;
        C14008y yVar2 = new C14008y(this, g, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, aVar2);
        editText.addTextChangedListener(yVar);
        editText2.addTextChangedListener(new C14009z(this, str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, aVar2));
        editText.requestFocus();
        editText.post(new C14081p(editText));
        return inflate;
    }

    /* renamed from: r0 */
    public final int mo41506r0(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C13403d.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = C13401b.materialCalendarTheme;
        } else {
            i = C13401b.materialCalendarFullscreenTheme;
        }
        return C19098b.m46246b(context, i, C13993o.class.getCanonicalName());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f34663c);
        parcel.writeValue(this.f34664d);
    }
}
