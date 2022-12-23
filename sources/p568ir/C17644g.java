package p568ir;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import java.util.Calendar;
import p977zz.C20949l;

/* renamed from: ir.g */
public class C17644g extends C15676b<MoovitActivity> implements DatePickerDialog.OnDateSetListener {

    /* renamed from: h */
    public static final /* synthetic */ int f45362h = 0;

    /* renamed from: ir.g$a */
    public class C17645a implements C20949l<DatePickerDialog.OnDateSetListener> {

        /* renamed from: b */
        public final /* synthetic */ DatePicker f45363b;

        /* renamed from: c */
        public final /* synthetic */ int f45364c;

        /* renamed from: d */
        public final /* synthetic */ int f45365d;

        /* renamed from: e */
        public final /* synthetic */ int f45366e;

        public C17645a(DatePicker datePicker, int i, int i2, int i3) {
            this.f45363b = datePicker;
            this.f45364c = i;
            this.f45365d = i2;
            this.f45366e = i3;
        }

        public final boolean invoke(Object obj) {
            ((DatePickerDialog.OnDateSetListener) obj).onDateSet(this.f45363b, this.f45364c, this.f45365d, this.f45366e);
            return false;
        }
    }

    public C17644g() {
        super(MoovitActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt("year", 0);
        int i2 = arguments.getInt("month", 0);
        int i3 = arguments.getInt("dayOfMonth", 0);
        boolean z = arguments.getBoolean("allowHistory", true);
        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), this, i, i2, i3);
        if (!z) {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            datePickerDialog.getDatePicker().setMinDate(instance.getTimeInMillis());
        }
        return datePickerDialog;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        mo46753L1(DatePickerDialog.OnDateSetListener.class, new C17645a(datePicker, i, i2, i3));
    }
}
