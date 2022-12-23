package com.moovit.view.p340cc;

import android.text.Editable;
import com.moovit.view.p340cc.MaskFormatterWatcher;
import h00.C17291a;
import java.util.Iterator;
import java.util.Map;
import p241s0.C6302b;
import p241s0.C6307g;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: com.moovit.view.cc.d */
public final class C7962d extends MaskFormatterWatcher {
    public C7962d(CreditCardInputView creditCardInputView) {
        super(creditCardInputView, MaskFormatterWatcher.AllowanceLevel.ALLOW_ALL);
    }

    /* renamed from: a */
    public final void mo24834a(Editable editable, int i) {
        editable.setSpan(new C17291a(), i - 1, i, 33);
    }

    /* renamed from: b */
    public final int mo24836b() {
        return this.f24086b.getCreditCardConfig().maxCardLength;
    }

    /* renamed from: c */
    public final boolean mo24838c(Editable editable) {
        return false;
    }

    /* renamed from: d */
    public final void mo24839d(String str) {
        CreditCardConfig creditCardConfig = this.f24086b.getCreditCardConfig();
        int length = str.length();
        if (creditCardConfig.minCardLength <= length && length <= creditCardConfig.maxCardLength) {
            this.f24086b.mo24814s(str, true);
        } else if (length < 8) {
            this.f24086b.mo24814s((String) null, false);
        } else {
            this.f24086b.mo24814s(str, false);
        }
    }

    /* renamed from: e */
    public final void mo24840e(Editable editable) {
        for (C17291a removeSpan : (C17291a[]) editable.getSpans(0, editable.length(), C17291a.class)) {
            editable.removeSpan(removeSpan);
        }
    }

    /* renamed from: f */
    public final boolean mo24841f(int i) {
        return this.f24086b.getCreditCardConfig().cardNumberSpacingPattern.contains(Integer.valueOf(i));
    }

    /* renamed from: g */
    public final boolean mo24842g(CharSequence charSequence) {
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CreditCardConfig creditCardConfig;
        super.onTextChanged(charSequence, i, i2, i3);
        int i4 = i + i3;
        if (i4 < 2) {
            this.f24086b.setCreditCardConfig(CreditCardConfig.UNKNOWN);
        } else if (i4 <= 9 || (i < 2 && i3 > 7)) {
            CreditCardInputView creditCardInputView = this.f24086b;
            String charSequence2 = charSequence.toString();
            C6302b bVar = C7963e.f24109a;
            if (C20964s0.m49090h(charSequence2)) {
                creditCardConfig = CreditCardConfig.UNKNOWN;
            } else {
                CreditCardConfig creditCardConfig2 = null;
                Iterator it = ((C6307g.C6309b) C7963e.f24109a.entrySet()).iterator();
                while (true) {
                    C6307g.C6311d dVar = (C6307g.C6311d) it;
                    if (dVar.hasNext()) {
                        dVar.next();
                        Map.Entry entry = dVar;
                        C20944i0 i0Var = (C20944i0) entry.getKey();
                        String str = (String) i0Var.f52692a;
                        String str2 = (String) i0Var.f52693b;
                        int min = Math.min(charSequence2.length(), str.length());
                        int min2 = Math.min(charSequence2.length(), str2.length());
                        boolean z = false;
                        int parseInt = Integer.parseInt(charSequence2.substring(0, min));
                        int parseInt2 = Integer.parseInt(charSequence2.substring(0, min2));
                        int parseInt3 = Integer.parseInt(str.substring(0, min));
                        int parseInt4 = Integer.parseInt(str2.substring(0, min2));
                        if (parseInt >= parseInt3 && parseInt2 <= parseInt4) {
                            z = true;
                        }
                        if (z) {
                            if (creditCardConfig2 != null && !creditCardConfig2.equals(entry.getValue())) {
                                creditCardConfig = CreditCardConfig.UNKNOWN;
                                break;
                            }
                            creditCardConfig2 = (CreditCardConfig) entry.getValue();
                        }
                    } else if (creditCardConfig2 != null) {
                        creditCardConfig = creditCardConfig2;
                    } else {
                        creditCardConfig = CreditCardConfig.UNKNOWN;
                    }
                }
            }
            creditCardInputView.setCreditCardConfig(creditCardConfig);
        }
        this.f24086b.mo24820v();
    }
}
