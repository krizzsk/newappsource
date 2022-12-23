package p977zz;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import c00.C13717b;
import com.moovit.commons.utils.LinkedText;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k00.C17988b;
import p001a0.C0016g;
import p242s1.C6333d0;

/* renamed from: zz.s0 */
public final class C20964s0 {

    /* renamed from: a */
    public static final String f52718a;

    /* renamed from: b */
    public static final Charset f52719b = Charset.forName("UTF-8");

    /* renamed from: zz.s0$a */
    public class C20965a extends ClickableSpan {

        /* renamed from: b */
        public final /* synthetic */ C20935e f52720b;

        /* renamed from: c */
        public final /* synthetic */ C20944i0 f52721c;

        public C20965a(C20935e eVar, C20944i0 i0Var) {
            this.f52720b = eVar;
            this.f52721c = i0Var;
        }

        public final void onClick(View view) {
            this.f52720b.invoke((String) this.f52721c.f52693b);
        }
    }

    static {
        String property = System.getProperty("line.separator");
        if (property == null) {
            property = "\n";
        }
        f52718a = property;
    }

    /* renamed from: A */
    public static String[] m49080A(String str, char c) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        String[] strArr = new String[(i + 1)];
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) == c) {
                strArr[i3] = str.substring(i4 + 1, i5);
                i4 = i5;
                i3++;
            }
        }
        strArr[i3] = str.substring(i4 + 1);
        return strArr;
    }

    /* renamed from: B */
    public static void m49081B(TextView textView, String str, int i, int i2, String str2, int i3, int i4, String str3) {
        StringBuilder k = C13555b.m33972k(str);
        if (str3 == null) {
            str3 = " ";
        }
        String o = C0016g.m31o(k, str3, str2);
        SpannableString spannableString = new SpannableString(o);
        Context context = textView.getContext();
        TextAppearanceSpan b = m49084b(context, i, i2);
        TextAppearanceSpan b2 = m49084b(context, i3, i4);
        spannableString.setSpan(b, 0, o.indexOf(str2) - 1, 33);
        spannableString.setSpan(b2, o.indexOf(str2), o.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: C */
    public static String m49082C(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m49083a(String str) {
        if (str.isEmpty() || Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return new String(charArray);
    }

    /* renamed from: b */
    public static TextAppearanceSpan m49084b(Context context, int i, int i2) {
        int j = C20941h.m49047j(i, context);
        ColorStateList g = C20941h.m49044g(i2, context);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, j);
        if (g != null) {
            return new TextAppearanceSpan(textAppearanceSpan.getFamily(), textAppearanceSpan.getTextStyle(), textAppearanceSpan.getTextSize(), g, textAppearanceSpan.getLinkTextColor());
        }
        return textAppearanceSpan;
    }

    /* renamed from: c */
    public static SpannableString m49085c(Context context, int i) {
        return m49086d(C17988b.m44611b(i, context), 2);
    }

    /* renamed from: d */
    public static SpannableString m49086d(Drawable drawable, int i) {
        C20970v vVar = new C20970v(drawable, i);
        SpannableString spannableString = new SpannableString(Character.toString(65532));
        spannableString.setSpan(vVar, 0, 1, 33);
        return spannableString;
    }

    /* renamed from: e */
    public static boolean m49087e(CharSequence charSequence, Editable editable) {
        if ((!m49090h(charSequence) || !m49090h(editable)) && !C20975x0.m49118e(charSequence, editable)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m49088f(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append('\"');
            }
            if ((charAt == ',' || charAt == 13 || charAt == 10 || charAt == '\"') && !z) {
                sb.insert(0, '\"');
                z = true;
            }
            sb.append(charAt);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m49089g(CharSequence charSequence) {
        return charSequence != null && TextUtils.isDigitsOnly(charSequence);
    }

    /* renamed from: h */
    public static boolean m49090h(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: i */
    public static boolean m49091i(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() > 0) {
            byte directionality = Character.getDirectionality(charSequence.charAt(0));
            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m49092j(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0 || charSequence.toString().trim().isEmpty();
    }

    /* renamed from: k */
    public static boolean m49093k(CharSequence charSequence) {
        return !m49090h(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    /* renamed from: l */
    public static boolean m49094l(Editable editable) {
        return !m49092j(editable);
    }

    /* renamed from: m */
    public static boolean m49095m(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        String trim = charSequence.toString().trim();
        if (m49090h(trim) || trim.length() < 7 || trim.length() > 13 || !Patterns.PHONE.matcher(trim).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static CharSequence m49096n(String str, Collection collection) {
        if (C13717b.m34258e(collection)) {
            return "";
        }
        boolean z = true;
        if (collection.size() == 1) {
            return (CharSequence) C13717b.m34256c(collection);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (z) {
                z = false;
            } else {
                spannableStringBuilder.append(str);
            }
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    /* renamed from: o */
    public static CharSequence m49097o(String str, CharSequence... charSequenceArr) {
        return m49096n(str, Arrays.asList(charSequenceArr));
    }

    /* renamed from: p */
    public static CharSequence m49098p(String str, List list) {
        if (list == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (!m49090h(charSequence)) {
                if (z) {
                    z = false;
                } else {
                    spannableStringBuilder.append(str);
                }
                spannableStringBuilder.append(charSequence);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: q */
    public static CharSequence m49099q(String str, CharSequence... charSequenceArr) {
        return m49098p(str, Arrays.asList(charSequenceArr));
    }

    /* renamed from: r */
    public static String m49100r(String str, Iterable<?> iterable) {
        return m49101s(str, iterable, new StringBuilder());
    }

    /* renamed from: s */
    public static String m49101s(String str, Iterable<?> iterable, StringBuilder sb) {
        if (iterable == null) {
            return "";
        }
        boolean z = true;
        for (Object next : iterable) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(next);
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static String m49102t(String str, Object... objArr) {
        return m49100r(str, Arrays.asList(objArr));
    }

    /* renamed from: u */
    public static void m49103u(TextView textView, LinkedText linkedText, C20935e<String> eVar) {
        int size = linkedText.f41028c.size();
        Object[] objArr = new Object[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = linkedText.f41028c.get(i2).f52692a;
        }
        String format = String.format(C20930c.m49020b(textView.getContext()), linkedText.f41027b, objArr);
        SpannableString spannableString = new SpannableString(format);
        for (C20944i0 next : linkedText.f41028c) {
            String str = (String) next.f52692a;
            int indexOf = format.indexOf(str, i);
            if (indexOf != -1) {
                i = str.length() + indexOf;
                spannableString.setSpan(new C20965a(eVar, next), indexOf, i, 33);
            }
        }
        textView.setMovementMethod(new LinkMovementMethod());
        textView.setText(spannableString);
        C6333d0.m15016d(textView);
    }

    /* renamed from: v */
    public static void m49104v(TextView textView, String str, ClickableSpan clickableSpan, Object... objArr) {
        int indexOf = m49082C(textView.getText()).indexOf(str);
        int length = str.length() + indexOf;
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(clickableSpan, indexOf, length, 33);
        for (Object span : objArr) {
            spannableString.setSpan(span, indexOf, length, 33);
        }
        textView.setMovementMethod(new LinkMovementMethod());
        textView.setText(spannableString);
        C6333d0.m15016d(textView);
    }

    /* renamed from: w */
    public static void m49105w(TextView textView, String str, boolean z, Runnable runnable) {
        m49104v(textView, str, new C20962r0(runnable, z, C20941h.m49043f(16842905, textView.getContext())), new Object[0]);
    }

    /* renamed from: x */
    public static String m49106x(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* renamed from: y */
    public static void m49107y(TextView textView, int i, int i2) {
        ColorStateList g;
        int j;
        if (!(i == 0 || (j = C20941h.m49047j(i, textView.getContext())) == 0)) {
            C0801k.m2424f(textView, j);
        }
        if (i2 != 0 && (g = C20941h.m49044g(i2, textView.getContext())) != null) {
            textView.setTextColor(g);
        }
    }

    /* renamed from: z */
    public static int m49108z(String str, String str2) {
        if (TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2)) {
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length - length2;
            }
            if (length >= 18 || length2 >= 18) {
                return new BigInteger(str).compareTo(new BigInteger(str2));
            }
            try {
                int i = (Long.parseLong(str) > Long.parseLong(str2) ? 1 : (Long.parseLong(str) == Long.parseLong(str2) ? 0 : -1));
                if (i < 0) {
                    return -1;
                }
                if (i > 0) {
                    return 1;
                }
                return 0;
            } catch (NumberFormatException unused) {
            }
        }
        return str.compareTo(str2);
    }
}
