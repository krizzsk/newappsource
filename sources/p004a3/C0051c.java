package p004a3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p141k1.C5450a;
import p241s0.C6302b;

/* renamed from: a3.c */
public final class C0051c extends C0058f implements Animatable {

    /* renamed from: c */
    public C0053b f65c;

    /* renamed from: d */
    public Context f66d;

    /* renamed from: e */
    public final C0052a f67e;

    /* renamed from: a3.c$a */
    public class C0052a implements Drawable.Callback {
        public C0052a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            C0051c.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0051c.this.scheduleSelf(runnable, j);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0051c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a3.c$b */
    public static class C0053b extends Drawable.ConstantState {

        /* renamed from: a */
        public C0059g f69a;

        /* renamed from: b */
        public AnimatorSet f70b;

        /* renamed from: c */
        public ArrayList<Animator> f71c;

        /* renamed from: d */
        public C6302b<Animator, String> f72d;

        public C0053b(C0052a aVar) {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0051c() {
        this((Context) null);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.C5452b.m13610a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5452b.m13611b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f65c.f69a.draw(canvas);
        if (this.f65c.f70b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5451a.m13605a(drawable);
        }
        return this.f65c.f69a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f65c.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5452b.m13612c(drawable);
        }
        return this.f65c.f69a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f76b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0054c(this.f76b.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f65c.f69a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f65c.f69a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f65c.f69a.getOpacity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException | XmlPullParserException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.p982v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            r3 = r24
            android.graphics.drawable.Drawable r4 = r1.f76b
            if (r4 == 0) goto L_0x0012
            r5 = r22
            p141k1.C5450a.C5452b.m13613d(r4, r0, r5, r2, r3)
            return
        L_0x0012:
            r5 = r22
            int r4 = r22.getEventType()
            int r6 = r22.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r4 == r7) goto L_0x017f
            int r8 = r22.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r4 == r8) goto L_0x017f
        L_0x0029:
            r8 = 2
            if (r4 != r8) goto L_0x0179
            java.lang.String r4 = r22.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r4)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto L_0x00a6
            int[] r4 = p004a3.C0049a.f58e
            android.content.res.TypedArray r4 = p116i1.C5256j.m13278f(r0, r3, r2, r4)
            int r9 = r4.getResourceId(r11, r11)
            if (r9 == 0) goto L_0x00a1
            android.graphics.PorterDuff$Mode r13 = p004a3.C0059g.f77k
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x0067
            a3.g r8 = new a3.g
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = p116i1.C5247f.f17365a
            android.graphics.drawable.Drawable r9 = p116i1.C5247f.C5248a.m13264a(r0, r9, r3)
            r8.f76b = r9
            a3.g$h r9 = new a3.g$h
            android.graphics.drawable.Drawable r10 = r8.f76b
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r9.<init>(r10)
            goto L_0x008d
        L_0x0067:
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x006f:
            int r13 = r9.next()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            if (r13 == r8) goto L_0x0078
            if (r13 == r7) goto L_0x0078
            goto L_0x006f
        L_0x0078:
            if (r13 != r8) goto L_0x0083
            a3.g r8 = new a3.g     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.inflate(r0, r9, r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            goto L_0x008d
        L_0x0083:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            java.lang.String r9 = "No start tag found"
            r8.<init>(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            throw r8     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x008b:
            r8 = r12
        L_0x008d:
            r8.f82g = r11
            a3.c$a r9 = r1.f67e
            r8.setCallback(r9)
            a3.c$b r9 = r1.f65c
            a3.g r9 = r9.f69a
            if (r9 == 0) goto L_0x009d
            r9.setCallback(r12)
        L_0x009d:
            a3.c$b r9 = r1.f65c
            r9.f69a = r8
        L_0x00a1:
            r4.recycle()
            goto L_0x0179
        L_0x00a6:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0179
            int[] r4 = p004a3.C0049a.f59f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r11)
            int r9 = r4.getResourceId(r7, r11)
            if (r9 == 0) goto L_0x0176
            android.content.Context r13 = r1.f66d
            if (r13 == 0) goto L_0x016b
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x00cb
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r13, r9)
            goto L_0x00ea
        L_0x00cb:
            android.content.res.Resources r14 = r13.getResources()
            android.content.res.Resources$Theme r15 = r13.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r11 = r14.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x012b }
            android.util.AttributeSet r17 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0126, IOException -> 0x0123, all -> 0x0120 }
            r18 = 0
            r19 = 0
            r16 = r11
            android.animation.Animator r9 = p004a3.C0055d.m106a(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ XmlPullParserException -> 0x0126, IOException -> 0x0123, all -> 0x0120 }
            r11.close()
        L_0x00ea:
            a3.c$b r10 = r1.f65c
            a3.g r10 = r10.f69a
            a3.g$g r10 = r10.f78c
            a3.g$f r10 = r10.f130b
            s0.b<java.lang.String, java.lang.Object> r10 = r10.f128o
            java.lang.Object r10 = r10.getOrDefault(r8, r12)
            r9.setTarget(r10)
            a3.c$b r10 = r1.f65c
            java.util.ArrayList<android.animation.Animator> r11 = r10.f71c
            if (r11 != 0) goto L_0x0111
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f71c = r11
            a3.c$b r10 = r1.f65c
            s0.b r11 = new s0.b
            r11.<init>()
            r10.f72d = r11
        L_0x0111:
            a3.c$b r10 = r1.f65c
            java.util.ArrayList<android.animation.Animator> r10 = r10.f71c
            r10.add(r9)
            a3.c$b r10 = r1.f65c
            s0.b<android.animation.Animator, java.lang.String> r10 = r10.f72d
            r10.put(r9, r8)
            goto L_0x0176
        L_0x0120:
            r0 = move-exception
            r12 = r11
            goto L_0x0165
        L_0x0123:
            r0 = move-exception
            r12 = r11
            goto L_0x012c
        L_0x0126:
            r0 = move-exception
            r12 = r11
            goto L_0x0149
        L_0x0129:
            r0 = move-exception
            goto L_0x0165
        L_0x012b:
            r0 = move-exception
        L_0x012c:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>()     // Catch:{ all -> 0x0129 }
            r3.append(r10)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0129 }
            r3.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0129 }
            r2.<init>(r3)     // Catch:{ all -> 0x0129 }
            r2.initCause(r0)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0148:
            r0 = move-exception
        L_0x0149:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>()     // Catch:{ all -> 0x0129 }
            r3.append(r10)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0129 }
            r3.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0129 }
            r2.<init>(r3)     // Catch:{ all -> 0x0129 }
            r2.initCause(r0)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0165:
            if (r12 == 0) goto L_0x016a
            r12.close()
        L_0x016a:
            throw r0
        L_0x016b:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0176:
            r4.recycle()
        L_0x0179:
            int r4 = r22.next()
            goto L_0x001e
        L_0x017f:
            a3.c$b r0 = r1.f65c
            android.animation.AnimatorSet r2 = r0.f70b
            if (r2 != 0) goto L_0x018c
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f70b = r2
        L_0x018c:
            android.animation.AnimatorSet r2 = r0.f70b
            java.util.ArrayList<android.animation.Animator> r0 = r0.f71c
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0051c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5451a.m13608d(drawable);
        }
        return this.f65c.f69a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f65c.f70b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f65c.f69a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f65c.f69a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f65c.f69a.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f65c.f69a.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f65c.f69a.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.C5451a.m13609e(drawable, z);
        } else {
            this.f65c.f69a.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f65c.f69a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.m13601d(drawable, i);
        } else {
            this.f65c.f69a.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.m13602e(drawable, colorStateList);
        } else {
            this.f65c.f69a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.m13603f(drawable, mode);
        } else {
            this.f65c.f69a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f65c.f69a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f65c.f70b.isStarted()) {
            this.f65c.f70b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f65c.f70b.end();
        }
    }

    public C0051c(Context context) {
        C0052a aVar = new C0052a();
        this.f67e = aVar;
        this.f66d = context;
        this.f65c = new C0053b(aVar);
    }

    /* renamed from: a3.c$c */
    public static class C0054c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f73a;

        public C0054c(Drawable.ConstantState constantState) {
            this.f73a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f73a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f73a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0051c cVar = new C0051c();
            Drawable newDrawable = this.f73a.newDrawable();
            cVar.f76b = newDrawable;
            newDrawable.setCallback(cVar.f67e);
            return cVar;
        }

        public final Drawable newDrawable(Resources resources) {
            C0051c cVar = new C0051c();
            Drawable newDrawable = this.f73a.newDrawable(resources);
            cVar.f76b = newDrawable;
            newDrawable.setCallback(cVar.f67e);
            return cVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0051c cVar = new C0051c();
            Drawable newDrawable = this.f73a.newDrawable(resources, theme);
            cVar.f76b = newDrawable;
            newDrawable.setCallback(cVar.f67e);
            return cVar;
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
