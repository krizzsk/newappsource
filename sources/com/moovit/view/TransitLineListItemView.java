package com.moovit.view;

import a00.C13382a;
import aa0.C7554s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.CongestionSource;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleAttributes;
import com.moovit.view.ScheduleView;
import da0.C12610a;
import g20.C17161i;
import i00.C17522a;
import java.util.List;
import java.util.WeakHashMap;
import p054d0.C4291k0;
import p054d0.C4314v;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19735m;
import p824tp.C19740r;
import p977zz.C20941h;
import p977zz.C20964s0;
import p977zz.C20975x0;

public class TransitLineListItemView extends ListItemView {

    /* renamed from: q0 */
    public final int f24009q0;

    /* renamed from: r0 */
    public final C12610a f24010r0;

    /* renamed from: s0 */
    public final AppCompatTextView f24011s0;

    /* renamed from: com.moovit.view.TransitLineListItemView$a */
    public class C7930a extends C17522a {

        /* renamed from: b */
        public final /* synthetic */ TextView f24012b;

        public C7930a(TextView textView) {
            this.f24012b = textView;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f24012b.setTag(C19740r.transit_line_list_item_view_tag, (Object) null);
            this.f24012b.removeTextChangedListener(this);
        }
    }

    /* renamed from: com.moovit.view.TransitLineListItemView$b */
    public static class C7931b {

        /* renamed from: a */
        public final CharSequence f24013a;

        /* renamed from: b */
        public final CharSequence f24014b;

        /* renamed from: c */
        public final CharSequence f24015c;

        public C7931b(CharSequence charSequence, CharSequence charSequence2) {
            this.f24013a = charSequence;
            this.f24014b = charSequence2;
            CharSequence q = C20964s0.m49099q(" ", charSequence, charSequence2);
            this.f24015c = C20964s0.m49090h(q) ? null : q;
        }
    }

    public TransitLineListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.transitLineListItemStyle);
    }

    private void setTripAttributes(TimeVehicleAttributes timeVehicleAttributes) {
        TextView textView;
        if (getTitle() != null) {
            textView = getTitleView();
        } else if (getSubtitle() != null) {
            textView = getSubtitleView();
        } else {
            textView = getTextView();
        }
        int i = C19740r.transit_line_list_item_view_tag;
        C7931b bVar = (C7931b) textView.getTag(i);
        CharSequence b = this.f24010r0.mo39410b(timeVehicleAttributes);
        if (b == null) {
            if (bVar != null) {
                textView.setText(bVar.f24013a);
            }
        } else if (bVar == null || !C20975x0.m49118e(bVar.f24014b, b)) {
            C7931b bVar2 = new C7931b(textView.getText(), b);
            textView.setText(bVar2.f24015c);
            textView.setTag(i, bVar2);
            textView.addTextChangedListener(new C7930a(textView));
        }
    }

    /* renamed from: u */
    public static void m18058u(TransitLineListItemView transitLineListItemView, List list) {
        Time time;
        TimeVehicleAttributes timeVehicleAttributes;
        CongestionLevel congestionLevel;
        CongestionSource congestionSource;
        transitLineListItemView.getClass();
        if (!list.isEmpty()) {
            time = (Time) list.get(0);
        } else {
            time = null;
        }
        if (time != null) {
            timeVehicleAttributes = time.f23913n;
        } else {
            timeVehicleAttributes = null;
        }
        transitLineListItemView.setTripAttributes(timeVehicleAttributes);
        if (timeVehicleAttributes != null) {
            congestionLevel = timeVehicleAttributes.f23919c;
        } else {
            congestionLevel = null;
        }
        if (timeVehicleAttributes != null) {
            congestionSource = timeVehicleAttributes.f23920d;
        } else {
            congestionSource = null;
        }
        AppCompatTextView appCompatTextView = transitLineListItemView.f24011s0;
        int i = C19740r.transit_line_list_item_view_tag;
        if (((CongestionLevel) appCompatTextView.getTag(i)) != congestionLevel) {
            if (congestionLevel == null) {
                transitLineListItemView.f24011s0.setTag(i, (Object) null);
                transitLineListItemView.f24011s0.setVisibility(8);
            } else {
                transitLineListItemView.f24011s0.setTag(i, congestionLevel);
                C7554s.m17296a(transitLineListItemView.f24011s0, congestionLevel, congestionSource);
                transitLineListItemView.f24011s0.setVisibility(0);
            }
        }
        C13382a.m33674j(transitLineListItemView, (CharSequence) transitLineListItemView.getTag(i), transitLineListItemView.getScheduleView().getContentDescription(), transitLineListItemView.f24010r0.mo39409a(timeVehicleAttributes), transitLineListItemView.f24011s0.getContentDescription());
    }

    /* renamed from: e */
    public final boolean mo24760e() {
        return true;
    }

    /* renamed from: f */
    public final void mo23935f(int i, int i2) {
        this.f24011s0.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public int getExtraBottomViewsMeasuredHeight() {
        if (this.f24011s0.getVisibility() == 8) {
            return 0;
        }
        return this.f24011s0.getMeasuredHeight() + this.f24009q0;
    }

    public ScheduleView getScheduleView() {
        return (ScheduleView) getAccessoryView();
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f24011s0.getVisibility() != 8) {
            int measuredWidth = this.f24011s0.getMeasuredWidth();
            int measuredHeight = this.f24011s0.getMeasuredHeight();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            int f = C6333d0.C6338e.m15065f(this);
            int measuredHeight2 = (getMeasuredHeight() - getPaddingBottom()) - measuredHeight;
            int measuredWidth2 = getMeasuredWidth();
            AppCompatTextView appCompatTextView = this.f24011s0;
            C15780a.m40270c(this, measuredWidth2, appCompatTextView, f, measuredHeight2, f + measuredWidth, measuredHeight2 + measuredHeight);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        View accessoryView = getAccessoryView();
        if (accessoryView instanceof ScheduleView) {
            ((ScheduleView) accessoryView).setListener(new C4291k0(this, 20));
        } else {
            setAccessoryView(new ScheduleView(getContext(), (AttributeSet) null, C19735m.listItemAccessoryTextStyle));
        }
    }

    public void setAccessoryView(View view) {
        if (view instanceof ScheduleView) {
            ScheduleView scheduleView = getScheduleView();
            if (scheduleView != null) {
                scheduleView.setListener((ScheduleView.C7929c) null);
            }
            super.setAccessoryView(view);
            ScheduleView scheduleView2 = getScheduleView();
            if (scheduleView2 != null) {
                scheduleView2.setListener(new C4314v(this, 21));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("TransitLineListItemView does not supper accessory view!");
    }

    public void setSchedule(Schedule schedule) {
        getScheduleView().setSchedule(schedule);
    }

    /* renamed from: v */
    public final void mo24765v(C17161i<C16181a.C16184c, TransitLine> iVar, TransitLine transitLine) {
        C16181a.m41233b(iVar, this, transitLine);
        int i = C19740r.transit_line_list_item_view_tag;
        setTag(i, getContentDescription());
        this.f24011s0.setTag(i, (Object) null);
        this.f24011s0.setVisibility(8);
    }

    public TransitLineListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        this.f24009q0 = UiUtils.m40248g(context2, 12.0f);
        this.f24010r0 = new C12610a(context2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setCompoundDrawablePadding(UiUtils.m40249h(context2.getResources(), 4.0f));
        appCompatTextView.setVisibility(8);
        int i2 = C19735m.textAppearanceCaption;
        String str = C20964s0.f52718a;
        int j = C20941h.m49047j(i2, appCompatTextView.getContext());
        if (j != 0) {
            C0801k.m2424f(appCompatTextView, j);
        }
        this.f24011s0 = appCompatTextView;
        addView(appCompatTextView);
    }
}
