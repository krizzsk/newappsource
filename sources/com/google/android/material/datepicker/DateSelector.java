package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.C14000s;
import java.util.ArrayList;

public interface DateSelector<S> extends Parcelable {
    /* renamed from: I1 */
    boolean mo41499I1();

    /* renamed from: N1 */
    ArrayList mo41500N1();

    /* renamed from: S1 */
    S mo41501S1();

    /* renamed from: W0 */
    String mo41502W0(Context context);

    /* renamed from: Y1 */
    void mo41503Y1(long j);

    /* renamed from: a1 */
    ArrayList mo41504a1();

    /* renamed from: k1 */
    View mo41505k1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C14000s.C14001a aVar);

    /* renamed from: r0 */
    int mo41506r0(Context context);
}
