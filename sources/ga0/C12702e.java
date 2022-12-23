package ga0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.moovit.C15676b;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p734ps.C18973b;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p824tp.C19747y;

@Deprecated
/* renamed from: ga0.e */
public class C12702e extends C15676b<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f31362s = 0;

    /* renamed from: h */
    public String f31363h;

    /* renamed from: i */
    public CharSequence f31364i;

    /* renamed from: j */
    public CharSequence f31365j;

    /* renamed from: k */
    public boolean f31366k = false;

    /* renamed from: l */
    public CharSequence f31367l = null;

    /* renamed from: m */
    public boolean f31368m = false;

    /* renamed from: n */
    public CharSequence f31369n = null;

    /* renamed from: o */
    public boolean f31370o = false;

    /* renamed from: p */
    public CharSequence f31371p = null;

    /* renamed from: q */
    public boolean f31372q;

    /* renamed from: r */
    public boolean f31373r;

    /* renamed from: ga0.e$a */
    public static class C12703a<B extends C12703a<B>> {

        /* renamed from: a */
        public final Resources f31374a;

        /* renamed from: b */
        public final Bundle f31375b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C12703a(Context context) {
            this(context.getResources());
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        }

        /* renamed from: a */
        public final void mo39491a(String str) {
            this.f31375b.remove(str);
        }

        /* renamed from: b */
        public final void mo39492b(int i) {
            CharSequence charSequence;
            boolean z;
            if (i == 0) {
                charSequence = null;
            } else {
                charSequence = this.f31374a.getText(i);
            }
            if (charSequence != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31375b.putCharSequence("negativeButton", charSequence);
            } else {
                mo39491a("negativeButton");
            }
            this.f31375b.putBoolean("showNegativeButton", z);
        }

        /* renamed from: c */
        public final void mo39493c(int i) {
            CharSequence charSequence;
            boolean z;
            if (i == 0) {
                charSequence = null;
            } else {
                charSequence = this.f31374a.getText(i);
            }
            if (charSequence != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31375b.putCharSequence("positiveButton", charSequence);
            } else {
                mo39491a("positiveButton");
            }
            this.f31375b.putBoolean("showPositiveButton", z);
        }

        /* renamed from: d */
        public final void mo39494d(String str) {
            this.f31375b.putString("tag", str);
        }

        public C12703a(Resources resources) {
            C21100e.m49373x(resources, "resources");
            this.f31374a = resources;
            this.f31375b = new Bundle();
        }
    }

    public C12702e() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public C12709i mo39490S1(MoovitActivity moovitActivity, int i, int i2) {
        return new C12709i(moovitActivity, i, i2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39476T1(int r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.getTargetFragment()
            boolean r1 = r0 instanceof com.moovit.C15682c
            r2 = 0
            if (r1 == 0) goto L_0x000c
            com.moovit.c r0 = (com.moovit.C15682c) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            androidx.fragment.app.Fragment r1 = r4.getParentFragment()
            boolean r3 = r1 instanceof com.moovit.C15682c
            if (r3 == 0) goto L_0x0018
            r2 = r1
            com.moovit.c r2 = (com.moovit.C15682c) r2
        L_0x0018:
            A r1 = r4.f40792c
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r4.f31363h
            r0.mo40440Z1(r5, r1)
            goto L_0x0031
        L_0x0022:
            if (r2 == 0) goto L_0x002a
            java.lang.String r0 = r4.f31363h
            r2.mo40440Z1(r5, r0)
            goto L_0x0031
        L_0x002a:
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = r4.f31363h
            r1.mo19483S1(r5, r0)
        L_0x0031:
            r4.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.C12702e.mo39476T1(int):void");
    }

    /* renamed from: U1 */
    public void mo39472U1(C12709i iVar, Bundle bundle) {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C15682c) {
            C15682c cVar = (C15682c) parentFragment;
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C15682c) {
            C15682c cVar2 = (C15682c) targetFragment;
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f31363h = K1.getString("tag");
        this.f31364i = K1.getCharSequence("title");
        this.f31365j = K1.getCharSequence(InAppMessageBase.MESSAGE);
        this.f31366k = K1.getBoolean("showPositiveButton", false);
        this.f31367l = K1.getCharSequence("positiveButton");
        this.f31368m = K1.getBoolean("showNegativeButton", false);
        this.f31369n = K1.getCharSequence("negativeButton");
        this.f31370o = K1.getBoolean("showNeutralButton", false);
        this.f31371p = K1.getCharSequence("neutralButton");
        this.f31372q = K1.getBoolean("cancelable", true);
        this.f31373r = K1.getBoolean("cancelableOnTouchOutside", true);
        setCancelable(this.f31372q);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        Bundle K1 = mo46752K1();
        C12709i S1 = mo39490S1(this.f40792c, K1.getInt("theme", C19747y.ThemeOverlay_Moovit_Dialog), K1.getInt("layout", C19742t.std_dialog));
        S1.setTitle(this.f31364i);
        S1.mo39502c(this.f31365j);
        S1.setCancelable(this.f31372q);
        S1.setCanceledOnTouchOutside(this.f31373r);
        boolean z2 = true;
        C18973b bVar = new C18973b(this, 1);
        if (this.f31366k) {
            C12709i iVar = S1;
            iVar.mo39500a(C19740r.positive_button, -1, this.f31367l, C19746x.std_positive_button, bVar);
            z = true;
        } else {
            z = false;
        }
        if (this.f31368m) {
            C12709i iVar2 = S1;
            iVar2.mo39500a(C19740r.negative_button, -2, this.f31369n, C19746x.std_negative_button, bVar);
            z = true;
        }
        if (this.f31370o) {
            C12709i iVar3 = S1;
            iVar3.mo39500a(C19740r.neutral_button, -3, this.f31371p, C19746x.std_neutral_button, bVar);
        } else {
            z2 = z;
        }
        if (!z2) {
            C12709i iVar4 = S1;
            iVar4.mo39500a(C19740r.neutral_button, -3, (CharSequence) null, C19746x.std_neutral_button, C12709i.f31386b);
        }
        mo39472U1(S1, bundle);
        return S1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C15682c) {
            C15682c cVar = (C15682c) targetFragment;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C15682c) {
            C15682c cVar2 = (C15682c) parentFragment;
        }
        super.onDismiss(dialogInterface);
    }
}
