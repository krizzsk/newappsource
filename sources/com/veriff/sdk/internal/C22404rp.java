package com.veriff.sdk.internal;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import bf0.C21050d;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.widgets.DropdownButton;
import java.text.DateFormat;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0003\u001a\u00020 \u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R.\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/DatePicker;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "Landroid/widget/DatePicker;", "view", "", "year", "month", "dayOfMonth", "Lbf0/d;", "onDateSet", "Ljava/util/Calendar;", "value", "date", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "setDate", "(Ljava/util/Calendar;)V", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "dateFormat", "Ljava/text/DateFormat;", "Lkotlin/Function0;", "onDateChangedListener", "Llf0/a;", "getOnDateChangedListener", "()Llf0/a;", "setOnDateChangedListener", "(Llf0/a;)V", "", "title", "Ljava/lang/CharSequence;", "Lcom/veriff/sdk/internal/widgets/DropdownButton;", "Lcom/veriff/sdk/internal/widgets/DropdownButton;", "Landroid/content/Context;", "windowContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/internal/widgets/DropdownButton;Ljava/lang/CharSequence;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rp */
public final class C22404rp implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    private Calendar f56560a;

    /* renamed from: b */
    private C24225a<C21050d> f56561b = C22406a.f56567a;

    /* renamed from: c */
    private final DateFormat f56562c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f56563d;

    /* renamed from: e */
    private final DropdownButton f56564e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CharSequence f56565f;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rp$a */
    public static final class C22406a extends Lambda implements C24225a<C21050d> {

        /* renamed from: a */
        public static final C22406a f56567a = new C22406a();

        public C22406a() {
            super(0);
        }

        /* renamed from: a */
        public final void mo56481a() {
        }

        public /* synthetic */ Object invoke() {
            mo56481a();
            return C21050d.f52856a;
        }
    }

    public C22404rp(Context context, DropdownButton dropdownButton, CharSequence charSequence) {
        C24362h.m61211f(context, "windowContext");
        C24362h.m61211f(dropdownButton, Promotion.ACTION_VIEW);
        C24362h.m61211f(charSequence, "title");
        this.f56563d = context;
        this.f56564e = dropdownButton;
        this.f56565f = charSequence;
        this.f56562c = android.text.format.DateFormat.getDateFormat(context);
        dropdownButton.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a */
            public final /* synthetic */ C22404rp f56566a;

            {
                this.f56566a = r1;
            }

            public final void onClick(View view) {
                Calendar a = this.f56566a.mo56476a();
                if (a == null) {
                    a = Calendar.getInstance();
                }
                DatePickerDialog datePickerDialog = new DatePickerDialog(this.f56566a.f56563d, 3, this.f56566a, a.get(1), a.get(2), a.get(5));
                datePickerDialog.setTitle(this.f56566a.f56565f);
                datePickerDialog.show();
            }
        });
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C24362h.m61211f(datePicker, Promotion.ACTION_VIEW);
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        C21050d dVar = C21050d.f52856a;
        mo56477a(instance);
        this.f56561b.invoke();
    }

    /* renamed from: a */
    public final Calendar mo56476a() {
        return this.f56560a;
    }

    /* renamed from: a */
    public final void mo56477a(Calendar calendar) {
        String str;
        DropdownButton dropdownButton = this.f56564e;
        if (calendar == null || (str = this.f56562c.format(calendar.getTime())) == null) {
            str = "";
        }
        dropdownButton.setText(str);
        this.f56560a = calendar;
    }

    /* renamed from: a */
    public final void mo56478a(C24225a<C21050d> aVar) {
        C24362h.m61211f(aVar, "<set-?>");
        this.f56561b = aVar;
    }
}
