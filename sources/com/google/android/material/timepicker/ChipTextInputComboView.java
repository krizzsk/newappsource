package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C14076l;
import com.google.android.material.internal.C14081p;
import com.google.android.material.textfield.TextInputLayout;
import p355ac.C13405f;
import p355ac.C13407h;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public final Chip f35669b;

    /* renamed from: c */
    public final EditText f35670c;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    public class C14206a extends C14076l {
        public C14206a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f35669b.setText(ChipTextInputComboView.m35304a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f35669b.setText(ChipTextInputComboView.m35304a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static String m35304a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final boolean isChecked() {
        return this.f35669b.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f35670c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final void setChecked(boolean z) {
        int i;
        this.f35669b.setChecked(z);
        EditText editText = this.f35670c;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f35669b;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            EditText editText2 = this.f35670c;
            editText2.requestFocus();
            editText2.post(new C14081p(editText2));
            if (!TextUtils.isEmpty(this.f35670c.getText())) {
                EditText editText3 = this.f35670c;
                editText3.setSelection(editText3.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f35669b.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f35669b.setTag(i, obj);
    }

    public final void toggle() {
        this.f35669b.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C13407h.material_time_chip, this, false);
        this.f35669b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C13407h.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f35670c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C14206a());
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(C13405f.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
