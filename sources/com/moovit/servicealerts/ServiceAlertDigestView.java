package com.moovit.servicealerts;

import a00.C13382a;
import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.design.view.list.ListItemView;
import j80.C12774c;
import java.util.Date;
import java.util.Formatter;
import p824tp.C19728f;
import p824tp.C19735m;
import p824tp.C19746x;
import p977zz.C20941h;

public class ServiceAlertDigestView extends ListItemView {

    /* renamed from: q0 */
    public final MaterialTextView f23207q0;

    /* renamed from: r0 */
    public final MaterialTextView f23208r0;

    /* renamed from: s0 */
    public final MaterialTextView f23209s0;

    /* renamed from: t0 */
    public CharSequence f23210t0;

    public ServiceAlertDigestView() {
        throw null;
    }

    public ServiceAlertDigestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.serviceAlertDigestStyle);
    }

    /* renamed from: f */
    public final void mo23935f(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23208r0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f23209s0.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    /* renamed from: g */
    public final void mo23936g(int i) {
        this.f23207q0.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public int getExtraBottomViewsMeasuredHeight() {
        if (this.f23208r0.getVisibility() == 8) {
            return 0;
        }
        return this.f23208r0.getMeasuredHeight() + this.f23209s0.getMeasuredHeight();
    }

    public int getExtraTopViewsMeasuredHeight() {
        if (this.f23207q0.getVisibility() == 8) {
            return 0;
        }
        return this.f23207q0.getMeasuredHeight();
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f23208r0.getVisibility() != 8) {
            MaterialTextView materialTextView = this.f23208r0;
            materialTextView.layout(i, i2, i3, materialTextView.getMeasuredHeight() + i2);
            this.f23209s0.layout(i, this.f23208r0.getBottom(), i3, i4);
        }
    }

    /* renamed from: i */
    public final void mo23940i(int i, int i2, int i3, int i4) {
        if (this.f23207q0.getVisibility() != 8) {
            this.f23207q0.layout(i, i2, i3, i4);
        }
    }

    public void setServiceAlertDigest(C12774c cVar) {
        mo23942u(cVar.f31576d);
        setText((CharSequence) cVar.f31575c);
        this.f23210t0 = C13382a.m33667c(this.f23210t0, cVar.f31575c);
        mo23943v(cVar.f31574b.f23213b, cVar.f31577e, cVar.f31578f);
        setAccessoryDrawable(cVar.f31574b.f23213b.getIconResId());
        setContentDescription(this.f23210t0);
    }

    /* renamed from: u */
    public final void mo23942u(Date date) {
        if (date == null) {
            this.f23207q0.setVisibility(8);
            return;
        }
        this.f23207q0.setVisibility(0);
        this.f23207q0.setText(DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 86400000, 16));
        this.f23210t0 = this.f23207q0.getText();
    }

    /* renamed from: v */
    public final void mo23943v(ServiceStatusCategory serviceStatusCategory, Date date, Date date2) {
        String str;
        if (date == null && date2 == null) {
            this.f23208r0.setVisibility(8);
            this.f23209s0.setVisibility(8);
            return;
        }
        int colorAttrId = serviceStatusCategory.getColorAttrId();
        if (colorAttrId == 0) {
            colorAttrId = C19735m.colorProblem;
        }
        this.f23208r0.setVisibility(0);
        this.f23208r0.setTextColor(C20941h.m49043f(colorAttrId, getContext()));
        String id = C19728f.m47195a(getContext()).f50165a.f16131f.getID();
        Formatter formatter = new Formatter();
        if (date == null || date2 == null) {
            if (date == null) {
                date = date2;
            }
            long time = date.getTime();
            str = DateUtils.formatDateRange(getContext(), formatter, time, time, 540689, id).toString();
        } else {
            str = DateUtils.formatDateRange(getContext(), formatter, date.getTime(), date2.getTime(), 540689, id).toString();
        }
        this.f23209s0.setVisibility(0);
        this.f23209s0.setText(str);
        this.f23210t0 = C13382a.m33667c(this.f23210t0, this.f23208r0.getText(), str);
    }

    /* renamed from: w */
    public final void mo23944w(ServiceAlert serviceAlert) {
        mo23942u(serviceAlert.f23194f);
        setText((CharSequence) serviceAlert.f23197i);
        this.f23210t0 = C13382a.m33667c(this.f23210t0, serviceAlert.f23197i);
        mo23943v(serviceAlert.f23191c.f23213b, serviceAlert.f23195g, serviceAlert.f23196h);
        setAccessoryDrawable(serviceAlert.f23191c.f23213b.getIconResId());
        setContentDescription(this.f23210t0);
    }

    public ServiceAlertDigestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        MaterialTextView materialTextView = new MaterialTextView(context2, (AttributeSet) null, C19735m.serviceAlertPublicationDateStyle);
        this.f23207q0 = materialTextView;
        MaterialTextView materialTextView2 = new MaterialTextView(context2, (AttributeSet) null, C19735m.serviceAlertTimeRangeHeaderStyle);
        this.f23208r0 = materialTextView2;
        MaterialTextView materialTextView3 = new MaterialTextView(context2, (AttributeSet) null, C19735m.serviceAlertTimeRangeStyle);
        this.f23209s0 = materialTextView3;
        addView(materialTextView);
        addView(materialTextView2);
        addView(materialTextView3);
        materialTextView2.setText(C19746x.service_alert_time_range_header);
        if (isInEditMode()) {
            setText((CharSequence) "Minor delays in Camden Town");
            materialTextView.setText("Yesterday");
            materialTextView3.setText("19/05/15 12:30am - 21/05/15 4:00pm");
        }
    }
}
