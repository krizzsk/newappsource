package d20;

import com.google.android.material.textfield.TextInputLayout;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.inputfields.TextInputFieldView;

/* renamed from: d20.a */
public final /* synthetic */ class C16533a implements TextInputLayout.C14163f {

    /* renamed from: a */
    public final /* synthetic */ TextInputFieldView f43159a;

    public /* synthetic */ C16533a(TextInputFieldView textInputFieldView) {
        this.f43159a = textInputFieldView;
    }

    /* renamed from: a */
    public final void mo42588a(TextInputLayout textInputLayout) {
        textInputLayout.f35540p0.remove(this);
        if (textInputLayout.getEditText() != null) {
            textInputLayout.getEditText().addTextChangedListener(this.f43159a.f41840X0);
            return;
        }
        throw new ApplicationBugException("You must set or add an EditText to the TextInputLayout");
    }
}
