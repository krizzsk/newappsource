package p778rr;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import i00.C17522a;
import p471eq.C16850a;
import p977zz.C20964s0;

/* renamed from: rr.a */
public class C19316a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public EditText f49160h;

    /* renamed from: rr.a$a */
    public class C19317a extends C17522a {

        /* renamed from: b */
        public final /* synthetic */ View f49161b;

        public C19317a(View view) {
            this.f49161b = view;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f49161b.setEnabled(!C20964s0.m49090h(charSequence));
        }
    }

    public C19316a() {
        super(MoovitActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().setSoftInputMode(36);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_booking_free_text_survey_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.submit);
        findViewById.setOnClickListener(new C16850a(this, 4));
        EditText editText = (EditText) view.findViewById(R.id.carpoolSurvey);
        this.f49160h = editText;
        editText.addTextChangedListener(new C19317a(findViewById));
    }
}
