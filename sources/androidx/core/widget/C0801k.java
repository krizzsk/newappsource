package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import mf0.C24361g;
import p216q1.C6135c;

/* renamed from: androidx.core.widget.k */
public final class C0801k {

    /* renamed from: androidx.core.widget.k$a */
    public static class C0802a {
        /* renamed from: a */
        public static boolean m2427a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m2428b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m2429c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    public static class C0803b {
        /* renamed from: a */
        public static Drawable[] m2430a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m2431b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m2432c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m2433d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m2434e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m2435f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m2436g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m2437h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.k$c */
    public static class C0804c {
        /* renamed from: a */
        public static int m2438a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m2439b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m2440c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m2441d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m2442e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        public static void m2443f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m2444g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m2445h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.k$d */
    public static class C0805d {
        /* renamed from: a */
        public static DecimalFormatSymbols m2446a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.k$e */
    public static class C0806e {
        /* renamed from: a */
        public static String[] m2447a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        public static PrecomputedText.Params m2448b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        public static void m2449c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.k$f */
    public static class C0807f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f3426a;

        /* renamed from: b */
        public final TextView f3427b;

        /* renamed from: c */
        public Class<?> f3428c;

        /* renamed from: d */
        public Method f3429d;

        /* renamed from: e */
        public boolean f3430e;

        /* renamed from: f */
        public boolean f3431f = false;

        public C0807f(ActionMode.Callback callback, TextView textView) {
            this.f3426a = callback;
            this.f3427b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3426a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3426a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f3426a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00a0 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f3427b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f3431f
                r3 = 0
                r4 = 1
                java.lang.String r5 = "removeItemAt"
                if (r2 != 0) goto L_0x0032
                r12.f3431f = r4
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3428c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3429d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3430e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f3428c = r2
                r12.f3429d = r2
                r12.f3430e = r3
            L_0x0032:
                boolean r2 = r12.f3430e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f3428c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f3429d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                r6[r3] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
            L_0x004f:
                int r5 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                int r5 = r5 - r4
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r5 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                r6[r3] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012a }
            L_0x007b:
                int r5 = r5 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r5 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r5 != 0) goto L_0x008b
                goto L_0x00d6
            L_0x008b:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                android.content.Intent r5 = r5.setAction(r6)
                android.content.Intent r5 = r5.setType(r7)
                java.util.List r5 = r1.queryIntentActivities(r5, r3)
                java.util.Iterator r5 = r5.iterator()
            L_0x00a0:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x00d6
                java.lang.Object r8 = r5.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00bb
                goto L_0x00cf
            L_0x00bb:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c2
                goto L_0x00cd
            L_0x00c2:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00cf
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cd
                goto L_0x00cf
            L_0x00cd:
                r9 = 0
                goto L_0x00d0
            L_0x00cf:
                r9 = 1
            L_0x00d0:
                if (r9 == 0) goto L_0x00a0
                r2.add(r8)
                goto L_0x00a0
            L_0x00d6:
                r0 = 0
            L_0x00d7:
                int r5 = r2.size()
                if (r0 >= r5) goto L_0x012a
                java.lang.Object r5 = r2.get(r0)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r5.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r3, r3, r8, r9)
                android.widget.TextView r9 = r12.f3427b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010e
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010e
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010e
                r9 = 1
                goto L_0x010f
            L_0x010e:
                r9 = 0
            L_0x010f:
                r9 = r9 ^ r4
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                java.lang.String r10 = r5.packageName
                java.lang.String r5 = r5.name
                android.content.Intent r5 = r9.setClassName(r10, r5)
                android.view.MenuItem r5 = r8.setIntent(r5)
                r5.setShowAsAction(r4)
                int r0 = r0 + 1
                goto L_0x00d7
            L_0x012a:
                android.view.ActionMode$Callback r0 = r12.f3426a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0801k.C0807f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* renamed from: a */
    public static C6135c.C6136a m2419a(TextView textView) {
        int i;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C6135c.C6136a(C0806e.m2448b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i = 1;
        } else {
            i2 = 0;
            i = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i3 >= 23) {
            i2 = C0804c.m2438a(textView);
            i = C0804c.m2441d(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i3 < 28 || (textView.getInputType() & 15) != 3) {
            if (C0803b.m2431b(textView) == 1) {
                z = true;
            }
            switch (C0803b.m2432c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (!z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
            }
        } else {
            byte directionality = Character.getDirectionality(C0806e.m2447a(C0805d.m2446a(C0803b.m2433d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
        }
        return new C6135c.C6136a(textPaint, textDirectionHeuristic, i2, i);
    }

    /* renamed from: b */
    public static void m2420b(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            C0804c.m2443f(textView, colorStateList);
        } else if (textView instanceof C0812p) {
            ((C0812p) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public static void m2421c(TextView textView, int i) {
        int i2;
        C24361g.m61181q(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C0806e.m2449c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C0802a.m2427a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public static void m2422d(TextView textView, int i) {
        int i2;
        C24361g.m61181q(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C0802a.m2427a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: e */
    public static void m2423e(TextView textView, C6135c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            cVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        C6135c.C6136a a = m2419a(textView);
        cVar.getClass();
        if (a.mo22112a((C6135c.C6136a) null)) {
            textView.setText(cVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: f */
    public static void m2424f(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: g */
    public static ActionMode.Callback m2425g(ActionMode.Callback callback) {
        if (!(callback instanceof C0807f) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C0807f) callback).f3426a;
    }

    /* renamed from: h */
    public static ActionMode.Callback m2426h(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C0807f) || callback == null) {
            return callback;
        }
        return new C0807f(callback, textView);
    }
}
