package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.s */
public final class C14000s<S> extends C14007x<S> {

    /* renamed from: c */
    public int f34750c;

    /* renamed from: d */
    public DateSelector<S> f34751d;

    /* renamed from: e */
    public CalendarConstraints f34752e;

    /* renamed from: com.google.android.material.datepicker.s$a */
    public class C14001a extends C14006w<S> {
        public C14001a() {
        }

        /* renamed from: a */
        public final void mo41572a() {
            Iterator<C14006w<S>> it = C14000s.this.f34768b.iterator();
            while (it.hasNext()) {
                it.next().mo41572a();
            }
        }

        /* renamed from: b */
        public final void mo41573b(S s) {
            Iterator<C14006w<S>> it = C14000s.this.f34768b.iterator();
            while (it.hasNext()) {
                it.next().mo41573b(s);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34750c = bundle.getInt("THEME_RES_ID_KEY");
        this.f34751d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f34752e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f34751d.mo41505k1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f34750c)), viewGroup, this.f34752e, new C14001a());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f34750c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f34751d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f34752e);
    }
}
