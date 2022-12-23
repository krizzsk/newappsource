package com.moovit.design.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import cf0.C21136j;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.sequences.C24176a;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import p242s1.C6371k0;
import p389bl.C13637c;
import p583jk.C17875h;
import p583jk.C17884p;
import p977zz.C20930c;
import p988j$.time.DayOfWeek;
import p988j$.time.format.TextStyle;
import p988j$.time.temporal.WeekFields;
import th0.C24997e;
import w00.C20264e;
import y00.C20682a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0012"}, mo59060d2 = {"Lcom/moovit/design/view/DaysOfWeekPickerView;", "Lcom/google/android/material/chip/ChipGroup;", "", "j$/time/DayOfWeek", "validDaysOfWeek", "Lbf0/d;", "setValidDaysOfWeek", "selectedDays", "setSelectedDays", "getSelectedDays", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Design_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class DaysOfWeekPickerView extends ChipGroup {

    /* renamed from: m */
    public final LinkedHashMap f41350m;

    /* renamed from: n */
    public final LinkedHashSet f41351n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    public final Set<DayOfWeek> getSelectedDays() {
        List<Integer> checkedChipIds = getCheckedChipIds();
        C24362h.m61210e(checkedChipIds, "checkedChipIds");
        C24997e k0 = C24177b.m60550k0(C23825c.m58506c0(checkedChipIds), new DaysOfWeekPickerView$getSelectedDays$1(this));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C24177b.m60552m0(k0, linkedHashSet);
        return C17884p.m44343N(linkedHashSet);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        int[] intArray = bundle.getIntArray("validDaysOfWeek");
        if (intArray != null) {
            DayOfWeek[] values = DayOfWeek.values();
            ArrayList arrayList = new ArrayList(intArray.length);
            for (int i : intArray) {
                arrayList.add(values[i]);
            }
            setValidDaysOfWeek(C23825c.m58503O0(arrayList));
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("super", super.onSaveInstanceState());
        LinkedHashSet<DayOfWeek> linkedHashSet = this.f41351n;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(linkedHashSet, 10));
        for (DayOfWeek ordinal : linkedHashSet) {
            arrayList.add(Integer.valueOf(ordinal.ordinal()));
        }
        bundle.putIntArray("validDaysOfWeek", C23825c.m58498J0(arrayList));
        return bundle;
    }

    public final void setSelectedDays(Set<? extends DayOfWeek> set) {
        C24362h.m61211f(set, "selectedDays");
        C24997e.C24998a aVar = new C24997e.C24998a(C24177b.m60543d0(C24176a.m60542c0(new C6371k0(this), Chip.class), DaysOfWeekPickerView$setSelectedDays$1.f41352f));
        while (aVar.hasNext()) {
            Chip chip = (Chip) aVar.next();
            chip.setChecked(C23825c.m58507d0(set, this.f41350m.get(Integer.valueOf(chip.getId()))));
        }
    }

    public final void setValidDaysOfWeek(Set<? extends DayOfWeek> set) {
        C24362h.m61211f(set, "validDaysOfWeek");
        this.f41351n.clear();
        this.f41351n.addAll(set);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C24362h.m61210e(childAt, "getChildAt(index)");
            childAt.setEnabled(C23825c.m58507d0(this.f41351n, this.f41350m.get(Integer.valueOf(childAt.getId()))));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f41350m = new LinkedHashMap();
        DayOfWeek[] values = DayOfWeek.values();
        C24362h.m61211f(values, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(values.length));
        C23816b.m58450f1(linkedHashSet, values);
        this.f41351n = linkedHashSet;
        LayoutInflater.from(context).inflate(C20264e.days_of_week_picker_view, this, true);
        Locale b = C20930c.m49020b(getContext());
        C24362h.m61210e(b, "getLocale(context)");
        DayOfWeek firstDayOfWeek = WeekFields.m64567of(b).getFirstDayOfWeek();
        List<DayOfWeek> list = C20682a.f52251a;
        int indexOf = list.indexOf(firstDayOfWeek);
        List<DayOfWeek> subList = list.subList(indexOf, indexOf + 7);
        int i2 = 0;
        C24997e.C24998a aVar = new C24997e.C24998a(C24176a.m60542c0(new C6371k0(this), Chip.class));
        while (aVar.hasNext()) {
            Object next = aVar.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Chip chip = (Chip) next;
                DayOfWeek dayOfWeek = subList.get(i2);
                chip.setText(dayOfWeek.getDisplayName(TextStyle.SHORT, b));
                chip.setContentDescription(dayOfWeek.getDisplayName(TextStyle.FULL, b));
                this.f41350m.put(Integer.valueOf(chip.getId()), dayOfWeek);
                i2 = i3;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
    }
}
