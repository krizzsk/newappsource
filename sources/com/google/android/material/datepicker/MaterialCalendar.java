package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.recyclerview.widget.C1165b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C13993o;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p242s1.C6315a;
import p242s1.C6333d0;
import p255t1.C6531g;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13406g;
import p355ac.C13407h;

public final class MaterialCalendar<S> extends C14007x<S> {

    /* renamed from: m */
    public static final /* synthetic */ int f34639m = 0;

    /* renamed from: c */
    public int f34640c;

    /* renamed from: d */
    public DateSelector<S> f34641d;

    /* renamed from: e */
    public CalendarConstraints f34642e;

    /* renamed from: f */
    public Month f34643f;

    /* renamed from: g */
    public CalendarSelector f34644g;

    /* renamed from: h */
    public C13973b f34645h;

    /* renamed from: i */
    public RecyclerView f34646i;

    /* renamed from: j */
    public RecyclerView f34647j;

    /* renamed from: k */
    public View f34648k;

    /* renamed from: l */
    public View f34649l;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class C13963a extends C6315a {
        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            gVar.f20334a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class C13964b extends C13974b0 {

        /* renamed from: b */
        public final /* synthetic */ int f34650b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13964b(Context context, int i, int i2) {
            super(context, i);
            this.f34650b = i2;
        }

        public final void calculateExtraLayoutSpace(RecyclerView.C1152x xVar, int[] iArr) {
            if (this.f34650b == 0) {
                iArr[0] = MaterialCalendar.this.f34647j.getWidth();
                iArr[1] = MaterialCalendar.this.f34647j.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f34647j.getHeight();
            iArr[1] = MaterialCalendar.this.f34647j.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C13965c implements C13966d {
        public C13965c() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public interface C13966d {
    }

    /* renamed from: H1 */
    public final boolean mo41519H1(C13993o.C13996c cVar) {
        return super.mo41519H1(cVar);
    }

    /* renamed from: I1 */
    public final void mo41520I1(Month month) {
        boolean z;
        Month month2 = ((C14004v) this.f34647j.getAdapter()).f34762g.f34621b;
        Calendar calendar = month2.f34655b;
        if (calendar instanceof GregorianCalendar) {
            int i = month.f34657d;
            int i2 = month2.f34657d;
            int i3 = month.f34656c;
            int i4 = month2.f34656c;
            int i5 = (i3 - i4) + ((i - i2) * 12);
            Month month3 = this.f34643f;
            if (calendar instanceof GregorianCalendar) {
                int i6 = i5 - ((month3.f34656c - i4) + ((month3.f34657d - i2) * 12));
                boolean z2 = false;
                if (Math.abs(i6) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i6 > 0) {
                    z2 = true;
                }
                this.f34643f = month;
                if (z && z2) {
                    this.f34647j.mo4589e0(i5 - 3);
                    this.f34647j.post(new C13986h(this, i5));
                } else if (z) {
                    this.f34647j.mo4589e0(i5 + 3);
                    this.f34647j.post(new C13986h(this, i5));
                } else {
                    this.f34647j.post(new C13986h(this, i5));
                }
            } else {
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    /* renamed from: J1 */
    public final void mo41521J1(CalendarSelector calendarSelector) {
        this.f34644g = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f34646i.getLayoutManager().scrollToPosition(this.f34643f.f34657d - ((C13983f0) this.f34646i.getAdapter()).f34700g.f34642e.f34621b.f34657d);
            this.f34648k.setVisibility(0);
            this.f34649l.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f34648k.setVisibility(8);
            this.f34649l.setVisibility(0);
            mo41520I1(this.f34643f);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34640c = bundle.getInt("THEME_RES_ID_KEY");
        this.f34641d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f34642e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f34643f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f34640c);
        this.f34645h = new C13973b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f34642e.f34621b;
        if (C13993o.m34910J1(contextThemeWrapper)) {
            i2 = C13407h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C13407h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C13403d.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C13403d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C13403d.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C13403d.mtrl_calendar_days_of_week_height);
        int i3 = C14002t.f34754g;
        int i4 = dimensionPixelOffset + dimensionPixelSize;
        inflate.setMinimumHeight(i4 + (resources.getDimensionPixelOffset(C13403d.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(C13403d.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(C13403d.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(C13405f.mtrl_calendar_days_of_week);
        C6333d0.m15029q(gridView, new C13963a());
        gridView.setAdapter(new C13985g());
        gridView.setNumColumns(month.f34658e);
        gridView.setEnabled(false);
        this.f34647j = (RecyclerView) inflate.findViewById(C13405f.mtrl_calendar_months);
        this.f34647j.setLayoutManager(new C13964b(getContext(), i, i));
        this.f34647j.setTag("MONTHS_VIEW_GROUP_TAG");
        C14004v vVar = new C14004v(contextThemeWrapper, this.f34641d, this.f34642e, new C13965c());
        this.f34647j.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(C13406g.mtrl_calendar_year_selector_span);
        int i5 = C13405f.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i5);
        this.f34646i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f34646i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f34646i.setAdapter(new C13983f0(this));
            this.f34646i.mo4593g(new C13987i(this), -1);
        }
        int i6 = C13405f.month_navigation_fragment_toggle;
        if (inflate.findViewById(i6) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i6);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C6333d0.m15029q(materialButton, new C13988j(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C13405f.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C13405f.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f34648k = inflate.findViewById(i5);
            this.f34649l = inflate.findViewById(C13405f.mtrl_calendar_day_selector_frame);
            mo41521J1(CalendarSelector.DAY);
            materialButton.setText(this.f34643f.mo41539j());
            this.f34647j.mo4615h(new C13989k(this, vVar, materialButton));
            materialButton.setOnClickListener(new C13990l(this));
            materialButton3.setOnClickListener(new C13991m(this, vVar));
            materialButton2.setOnClickListener(new C13992n(this, vVar));
        }
        if (!C13993o.m34910J1(contextThemeWrapper)) {
            new C1165b0().mo5072a(this.f34647j);
        }
        RecyclerView recyclerView2 = this.f34647j;
        Month month2 = this.f34643f;
        Month month3 = vVar.f34762g.f34621b;
        if (month3.f34655b instanceof GregorianCalendar) {
            recyclerView2.mo4589e0((month2.f34656c - month3.f34656c) + ((month2.f34657d - month3.f34657d) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f34640c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f34641d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f34642e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f34643f);
    }
}
