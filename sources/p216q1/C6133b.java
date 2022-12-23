package p216q1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: q1.b */
public final class C6133b {

    /* renamed from: q1.b$a */
    public static class C6134a {
        /* renamed from: a */
        public static Spanned m14695a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        public static Spanned m14696b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        public static String m14697c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    /* renamed from: a */
    public static Spanned m14694a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C6134a.m14695a(str, 63);
        }
        return Html.fromHtml(str);
    }
}
