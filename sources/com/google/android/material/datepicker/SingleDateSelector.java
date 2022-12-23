package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.C14000s;
import com.google.android.material.internal.C14081p;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import p355ac.C13401b;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13409j;
import p584jl.C17885a;
import p742qc.C19098b;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C13970a();

    /* renamed from: b */
    public Long f34667b;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    public class C13970a implements Parcelable.Creator<SingleDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f34667b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        public final Object[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: I1 */
    public final boolean mo41499I1() {
        return this.f34667b != null;
    }

    /* renamed from: N1 */
    public final ArrayList mo41500N1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f34667b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: S1 */
    public final Object mo41501S1() {
        return this.f34667b;
    }

    /* renamed from: W0 */
    public final String mo41502W0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f34667b;
        if (l == null) {
            return resources.getString(C13409j.mtrl_picker_date_header_unselected);
        }
        String d = C13982f.m34905d(l.longValue(), Locale.getDefault());
        return resources.getString(C13409j.mtrl_picker_date_header_selected, new Object[]{d});
    }

    /* renamed from: Y1 */
    public final void mo41503Y1(long j) {
        this.f34667b = Long.valueOf(j);
    }

    /* renamed from: a1 */
    public final ArrayList mo41504a1() {
        return new ArrayList();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: k1 */
    public final View mo41505k1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C14000s.C14001a aVar) {
        View inflate = layoutInflater.inflate(C13407h.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C13405f.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C17885a.m44436e0()) {
            editText.setInputType(17);
        }
        SimpleDateFormat f = C13979d0.m34896f();
        String g = C13979d0.m34897g(inflate.getResources(), f);
        textInputLayout.setPlaceholderText(g);
        Long l = this.f34667b;
        if (l != null) {
            editText.setText(f.format(l));
        }
        editText.addTextChangedListener(new C13972a0(this, g, f, textInputLayout, calendarConstraints, aVar));
        editText.requestFocus();
        editText.post(new C14081p(editText));
        return inflate;
    }

    /* renamed from: r0 */
    public final int mo41506r0(Context context) {
        return C19098b.m46246b(context, C13401b.materialCalendarTheme, C13993o.class.getCanonicalName());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f34667b);
    }
}
