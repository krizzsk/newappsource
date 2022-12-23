package p524gv;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.tranzmate.R;
import i00.C17522a;

/* renamed from: gv.k */
public class C17244k extends C17237d {

    /* renamed from: s */
    public EditText f44571s;

    /* renamed from: gv.k$a */
    public class C17245a extends C17522a {
        public C17245a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C17244k kVar = C17244k.this;
            Button button = kVar.f44562q;
            boolean z2 = true;
            if (kVar.f44559n.getText().toString().trim().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !C17244k.this.mo49798o2()) {
                z2 = false;
            }
            button.setEnabled(z2);
        }
    }

    /* renamed from: m2 */
    public final String mo49796m2() {
        return this.f44571s.getText().toString();
    }

    /* renamed from: o2 */
    public final boolean mo49798o2() {
        return this.f44571s.getText().toString().trim().length() > 0;
    }

    /* renamed from: p2 */
    public final void mo49799p2(View view) {
        view.findViewById(R.id.missingLineContainer).setVisibility(0);
        EditText editText = (EditText) view.findViewById(R.id.missingLine);
        this.f44571s = editText;
        editText.setHint(R.string.line_not_found_additional_info);
        this.f44571s.setText(getArguments().getString("lineNameExtra"));
        this.f44571s.addTextChangedListener(new C17245a());
    }
}
