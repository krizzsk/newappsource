package da0;

import a00.C13382a;
import android.content.Context;
import android.text.SpannableStringBuilder;
import ce0.C21100e;
import com.moovit.util.time.TimeVehicleAttributes;
import k00.C17988b;
import mf0.C24361g;
import p583jk.C17884p;
import p693nz.C18659h;
import p824tp.C19739q;
import p824tp.C19746x;
import p977zz.C20964s0;
import p977zz.C20970v;

/* renamed from: da0.a */
public final class C12610a {

    /* renamed from: a */
    public final C18659h<Integer, CharSequence> f31166a = new C18659h<>(10);

    /* renamed from: b */
    public final C18659h<Integer, CharSequence> f31167b = new C18659h<>(10);

    /* renamed from: c */
    public final C20970v f31168c;

    /* renamed from: d */
    public final String f31169d;

    /* renamed from: e */
    public final C20970v f31170e;

    /* renamed from: f */
    public final String f31171f;

    /* renamed from: g */
    public final C20970v f31172g;

    /* renamed from: h */
    public final String f31173h;

    public C12610a(Context context) {
        this.f31168c = new C20970v(C17988b.m44611b(C19739q.ic_wheelchair_16_on_surface_emphasis_medium, context), 2);
        this.f31169d = context.getString(C19746x.voiceover_next_line_wheelchair_accessible);
        this.f31170e = new C20970v(C17988b.m44611b(C19739q.ic_no_wheelchair_16_on_surface_emphasis_medium, context), 2);
        this.f31171f = context.getString(C19746x.voiceover_next_line_wheelchair_inaccessible);
        this.f31172g = new C20970v(C17988b.m44611b(C19739q.ic_contactless_nfc_12_on_surface_emphasis_high, context), 2);
        this.f31173h = context.getString(C19746x.voiceover_next_line_nfc_supported);
    }

    /* renamed from: a */
    public final CharSequence mo39409a(TimeVehicleAttributes timeVehicleAttributes) {
        String str;
        C21100e.m49369v(1);
        String str2 = null;
        if (timeVehicleAttributes == null) {
            return null;
        }
        Boolean bool = timeVehicleAttributes.f23921e;
        Boolean bool2 = timeVehicleAttributes.f23922f;
        int D = C17884p.m44333D(C17884p.m44335F(bool), C17884p.m44335F(bool2));
        CharSequence[] charSequenceArr = new CharSequence[2];
        if (bool == null) {
            str = null;
        } else if (Boolean.TRUE.equals(bool)) {
            str = this.f31169d;
        } else {
            str = this.f31171f;
        }
        charSequenceArr[0] = str;
        if (Boolean.TRUE.equals(bool2)) {
            str2 = this.f31173h;
        }
        charSequenceArr[1] = str2;
        if (C24361g.m61154X(charSequenceArr)) {
            return "";
        }
        CharSequence charSequence = this.f31167b.get(Integer.valueOf(D));
        if (charSequence != null) {
            return charSequence;
        }
        String c = C13382a.m33667c(charSequenceArr);
        this.f31167b.put(Integer.valueOf(D), c);
        return c;
    }

    /* renamed from: b */
    public final CharSequence mo39410b(TimeVehicleAttributes timeVehicleAttributes) {
        C20970v vVar;
        C20970v vVar2;
        C21100e.m49369v(1);
        if (timeVehicleAttributes == null) {
            return null;
        }
        Boolean bool = timeVehicleAttributes.f23921e;
        Boolean bool2 = timeVehicleAttributes.f23922f;
        int D = C17884p.m44333D(C17884p.m44335F(bool), C17884p.m44335F(bool2));
        Object[] objArr = new Object[2];
        if (bool == null) {
            vVar = null;
        } else if (Boolean.TRUE.equals(bool)) {
            vVar = this.f31168c;
        } else {
            vVar = this.f31170e;
        }
        objArr[0] = vVar;
        if (Boolean.TRUE.equals(bool2)) {
            vVar2 = this.f31172g;
        } else {
            vVar2 = null;
        }
        objArr[1] = vVar2;
        if (C24361g.m61154X(objArr)) {
            return null;
        }
        CharSequence charSequence = this.f31166a.get(Integer.valueOf(D));
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (charSequence == null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i = 0; i < 2; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (spannableStringBuilder2.length() > 0) {
                        spannableStringBuilder2.append(" ");
                    }
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append(65532);
                    spannableStringBuilder2.setSpan(obj, length, length + 1, 33);
                }
            }
            this.f31166a.put(Integer.valueOf(D), spannableStringBuilder2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        if (C20964s0.m49090h(spannableStringBuilder)) {
            return null;
        }
        return spannableStringBuilder;
    }
}
