package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.moovit.app.editing.EditStopOverviewActivity;

public class FloatingActionMenu extends ViewGroup {

    /* renamed from: A */
    public boolean f13149A;

    /* renamed from: B */
    public int f13150B;

    /* renamed from: C */
    public float f13151C;

    /* renamed from: D */
    public float f13152D;

    /* renamed from: E */
    public float f13153E;

    /* renamed from: F */
    public int f13154F;

    /* renamed from: G */
    public int f13155G;

    /* renamed from: H */
    public int f13156H;

    /* renamed from: I */
    public Drawable f13157I;

    /* renamed from: J */
    public int f13158J;

    /* renamed from: K */
    public OvershootInterpolator f13159K;

    /* renamed from: L */
    public AnticipateInterpolator f13160L;

    /* renamed from: M */
    public boolean f13161M;

    /* renamed from: N */
    public boolean f13162N;

    /* renamed from: O */
    public int f13163O;

    /* renamed from: P */
    public int f13164P;

    /* renamed from: Q */
    public int f13165Q;

    /* renamed from: R */
    public int f13166R;

    /* renamed from: S */
    public Typeface f13167S;

    /* renamed from: T */
    public boolean f13168T;

    /* renamed from: U */
    public ImageView f13169U;

    /* renamed from: b */
    public AnimatorSet f13170b;

    /* renamed from: c */
    public AnimatorSet f13171c;

    /* renamed from: d */
    public AnimatorSet f13172d;

    /* renamed from: e */
    public int f13173e;

    /* renamed from: f */
    public FloatingActionButton f13174f;

    /* renamed from: g */
    public int f13175g;

    /* renamed from: h */
    public int f13176h;

    /* renamed from: i */
    public int f13177i;

    /* renamed from: j */
    public int f13178j;

    /* renamed from: k */
    public boolean f13179k;

    /* renamed from: l */
    public boolean f13180l;

    /* renamed from: l0 */
    public boolean f13181l0;

    /* renamed from: m */
    public Handler f13182m;

    /* renamed from: m0 */
    public int f13183m0;

    /* renamed from: n */
    public int f13184n;

    /* renamed from: n0 */
    public C3801c f13185n0;

    /* renamed from: o */
    public int f13186o;

    /* renamed from: o0 */
    public ValueAnimator f13187o0;

    /* renamed from: p */
    public int f13188p;

    /* renamed from: p0 */
    public ValueAnimator f13189p0;

    /* renamed from: q */
    public int f13190q;

    /* renamed from: q0 */
    public int f13191q0;

    /* renamed from: r */
    public int f13192r;

    /* renamed from: r0 */
    public int f13193r0;

    /* renamed from: s */
    public int f13194s;

    /* renamed from: s0 */
    public ContextThemeWrapper f13195s0;

    /* renamed from: t */
    public ColorStateList f13196t;

    /* renamed from: t0 */
    public String f13197t0;

    /* renamed from: u */
    public float f13198u;

    /* renamed from: u0 */
    public boolean f13199u0;

    /* renamed from: v */
    public int f13200v;

    /* renamed from: w */
    public boolean f13201w;

    /* renamed from: x */
    public int f13202x;

    /* renamed from: y */
    public int f13203y;

    /* renamed from: z */
    public int f13204z;

    /* renamed from: com.github.clans.fab.FloatingActionMenu$a */
    public class C3799a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ FloatingActionButton f13205b;

        /* renamed from: c */
        public final /* synthetic */ boolean f13206c;

        public C3799a(FloatingActionButton floatingActionButton, boolean z) {
            this.f13205b = floatingActionButton;
            this.f13206c = z;
        }

        public final void run() {
            FloatingActionMenu floatingActionMenu = FloatingActionMenu.this;
            if (floatingActionMenu.f13179k) {
                FloatingActionButton floatingActionButton = this.f13205b;
                if (floatingActionButton != floatingActionMenu.f13174f) {
                    floatingActionButton.mo15536g(this.f13206c);
                }
                Label label = (Label) this.f13205b.getTag(C3814k.fab_label);
                if (label != null && label.f13226r) {
                    if (this.f13206c && label.f13224p != null) {
                        label.f13223o.cancel();
                        label.startAnimation(label.f13224p);
                    }
                    label.setVisibility(4);
                }
            }
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionMenu$b */
    public class C3800b implements Runnable {
        public C3800b() {
        }

        public final void run() {
            FloatingActionMenu floatingActionMenu = FloatingActionMenu.this;
            floatingActionMenu.f13179k = false;
            C3801c cVar = floatingActionMenu.f13185n0;
            if (cVar != null) {
                ((EditStopOverviewActivity.C14851e) cVar).mo44937a(false);
            }
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionMenu$c */
    public interface C3801c {
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setLabelEllipsize(Label label) {
        int i = this.f13163O;
        if (i == 1) {
            label.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 2) {
            label.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            label.setEllipsize(TextUtils.TruncateAt.END);
        } else if (i == 4) {
            label.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
    }

    /* renamed from: a */
    public final void mo15614a(boolean z) {
        boolean z2;
        if (this.f13179k) {
            if (this.f13191q0 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f13189p0.start();
            }
            if (this.f13168T) {
                AnimatorSet animatorSet = this.f13172d;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f13171c.start();
                    this.f13170b.cancel();
                }
            }
            this.f13180l = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                    i++;
                    this.f13182m.postDelayed(new C3799a((FloatingActionButton) childAt, z), (long) i2);
                    i2 += this.f13158J;
                }
            }
            this.f13182m.postDelayed(new C3800b(), (long) ((i + 1) * this.f13158J));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimationDelayPerItem() {
        return this.f13158J;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.f13172d;
    }

    public int getMenuButtonColorNormal() {
        return this.f13154F;
    }

    public int getMenuButtonColorPressed() {
        return this.f13155G;
    }

    public int getMenuButtonColorRipple() {
        return this.f13156H;
    }

    public String getMenuButtonLabelText() {
        return this.f13197t0;
    }

    public ImageView getMenuIconView() {
        return this.f13169U;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f13174f);
        bringChildToFront(this.f13169U);
        this.f13178j = getChildCount();
        for (int i = 0; i < this.f13178j; i++) {
            if (getChildAt(i) != this.f13169U) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i);
                int i2 = C3814k.fab_label;
                if (floatingActionButton.getTag(i2) == null) {
                    String labelText = floatingActionButton.getLabelText();
                    if (!TextUtils.isEmpty(labelText)) {
                        Label label = new Label(this.f13195s0);
                        label.setClickable(true);
                        label.setFab(floatingActionButton);
                        label.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f13184n));
                        label.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f13186o));
                        if (this.f13166R > 0) {
                            label.setTextAppearance(getContext(), this.f13166R);
                            label.setShowShadow(false);
                            label.setUsingStyle(true);
                        } else {
                            int i3 = this.f13202x;
                            int i4 = this.f13203y;
                            int i5 = this.f13204z;
                            label.f13218j = i3;
                            label.f13219k = i4;
                            label.f13220l = i5;
                            label.setShowShadow(this.f13201w);
                            label.setCornerRadius(this.f13200v);
                            if (this.f13163O > 0) {
                                setLabelEllipsize(label);
                            }
                            label.setMaxLines(this.f13164P);
                            label.mo15656e();
                            label.setTextSize(0, this.f13198u);
                            label.setTextColor(this.f13196t);
                            int i6 = this.f13194s;
                            int i7 = this.f13188p;
                            if (this.f13201w) {
                                i6 += Math.abs(floatingActionButton.getShadowXOffset()) + floatingActionButton.getShadowRadius();
                                i7 += Math.abs(floatingActionButton.getShadowYOffset()) + floatingActionButton.getShadowRadius();
                            }
                            label.setPadding(i6, i7, this.f13194s, this.f13188p);
                            if (this.f13164P < 0 || this.f13162N) {
                                label.setSingleLine(this.f13162N);
                            }
                        }
                        Typeface typeface = this.f13167S;
                        if (typeface != null) {
                            label.setTypeface(typeface);
                        }
                        label.setText(labelText);
                        label.setOnClickListener(floatingActionButton.getOnClickListener());
                        addView(label);
                        floatingActionButton.setTag(i2, label);
                    }
                    FloatingActionButton floatingActionButton2 = this.f13174f;
                    if (floatingActionButton == floatingActionButton2) {
                        floatingActionButton2.setOnClickListener(new C3807d(this));
                    }
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        if (this.f13193r0 == 0) {
            i5 = ((i3 - i) - (this.f13175g / 2)) - getPaddingRight();
        } else {
            i5 = getPaddingLeft() + (this.f13175g / 2);
        }
        if (this.f13183m0 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i6 = ((i4 - i2) - this.f13174f.getMeasuredHeight()) - getPaddingBottom();
        } else {
            i6 = getPaddingTop();
        }
        int measuredWidth = i5 - (this.f13174f.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f13174f;
        floatingActionButton.layout(measuredWidth, i6, floatingActionButton.getMeasuredWidth() + measuredWidth, this.f13174f.getMeasuredHeight() + i6);
        int measuredWidth2 = i5 - (this.f13169U.getMeasuredWidth() / 2);
        int measuredHeight = ((this.f13174f.getMeasuredHeight() / 2) + i6) - (this.f13169U.getMeasuredHeight() / 2);
        ImageView imageView = this.f13169U;
        imageView.layout(measuredWidth2, measuredHeight, imageView.getMeasuredWidth() + measuredWidth2, this.f13169U.getMeasuredHeight() + measuredHeight);
        if (z2) {
            i6 = this.f13173e + this.f13174f.getMeasuredHeight() + i6;
        }
        for (int i12 = this.f13178j - 1; i12 >= 0; i12--) {
            View childAt = getChildAt(i12);
            if (childAt != this.f13169U) {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) childAt;
                if (floatingActionButton2.getVisibility() != 8) {
                    int measuredWidth3 = i5 - (floatingActionButton2.getMeasuredWidth() / 2);
                    if (z2) {
                        i6 = (i6 - floatingActionButton2.getMeasuredHeight()) - this.f13173e;
                    }
                    if (floatingActionButton2 != this.f13174f) {
                        floatingActionButton2.layout(measuredWidth3, i6, floatingActionButton2.getMeasuredWidth() + measuredWidth3, floatingActionButton2.getMeasuredHeight() + i6);
                        if (!this.f13180l) {
                            floatingActionButton2.mo15536g(false);
                        }
                    }
                    View view = (View) floatingActionButton2.getTag(C3814k.fab_label);
                    if (view != null) {
                        if (this.f13199u0) {
                            i7 = this.f13175g;
                        } else {
                            i7 = floatingActionButton2.getMeasuredWidth();
                        }
                        int i13 = (i7 / 2) + this.f13176h;
                        int i14 = this.f13193r0;
                        if (i14 == 0) {
                            i8 = i5 - i13;
                        } else {
                            i8 = i13 + i5;
                        }
                        if (i14 == 0) {
                            i9 = i8 - view.getMeasuredWidth();
                        } else {
                            i9 = view.getMeasuredWidth() + i8;
                        }
                        int i15 = this.f13193r0;
                        if (i15 == 0) {
                            i11 = i9;
                        } else {
                            i11 = i8;
                        }
                        if (i15 != 0) {
                            i8 = i9;
                        }
                        int measuredHeight2 = ((floatingActionButton2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (i6 - this.f13177i);
                        view.layout(i11, measuredHeight2, i8, view.getMeasuredHeight() + measuredHeight2);
                        if (!this.f13180l) {
                            view.setVisibility(4);
                        }
                    }
                    if (z2) {
                        i6 -= this.f13173e;
                    } else {
                        i6 = this.f13173e + childAt.getMeasuredHeight() + i6;
                    }
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        this.f13175g = 0;
        measureChildWithMargins(this.f13169U, i, 0, i2, 0);
        for (int i4 = 0; i4 < this.f13178j; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || childAt == this.f13169U)) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                this.f13175g = Math.max(this.f13175g, childAt.getMeasuredWidth());
            }
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (i6 >= this.f13178j) {
                break;
            }
            View childAt2 = getChildAt(i6);
            if (!(childAt2.getVisibility() == 8 || childAt2 == this.f13169U)) {
                int measuredWidth = childAt2.getMeasuredWidth() + 0;
                int measuredHeight = childAt2.getMeasuredHeight() + i5;
                Label label = (Label) childAt2.getTag(C3814k.fab_label);
                if (label != null) {
                    int measuredWidth2 = this.f13175g - childAt2.getMeasuredWidth();
                    if (!this.f13199u0) {
                        i8 = 2;
                    }
                    int i9 = measuredWidth2 / i8;
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    if (label.f13215g) {
                        i3 = Math.abs(label.f13211c) + label.f13210b;
                    } else {
                        i3 = 0;
                    }
                    measureChildWithMargins(label, i, i3 + measuredWidth3 + this.f13176h + i9, i2, 0);
                    i7 = Math.max(i7, label.getMeasuredWidth() + measuredWidth + i9);
                }
                i5 = measuredHeight;
            }
            i6++;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.f13175g, i7 + this.f13176h);
        int i11 = this.f13173e;
        int paddingTop = getPaddingTop();
        double paddingBottom = (double) (getPaddingBottom() + paddingTop + ((this.f13178j - 1) * i11) + i5);
        int i12 = (int) ((0.03d * paddingBottom) + paddingBottom);
        if (getLayoutParams().width == -1) {
            paddingRight = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        }
        if (getLayoutParams().height == -1) {
            i12 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(paddingRight, i12);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f13181l0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return this.f13179k;
        }
        if (action != 1) {
            return false;
        }
        mo15614a(this.f13161M);
        return true;
    }

    public void setAnimated(boolean z) {
        long j;
        this.f13161M = z;
        AnimatorSet animatorSet = this.f13170b;
        long j2 = 300;
        if (z) {
            j = 300;
        } else {
            j = 0;
        }
        animatorSet.setDuration(j);
        AnimatorSet animatorSet2 = this.f13171c;
        if (!z) {
            j2 = 0;
        }
        animatorSet2.setDuration(j2);
    }

    public void setAnimationDelayPerItem(int i) {
        this.f13158J = i;
    }

    public void setClosedOnTouchOutside(boolean z) {
        this.f13181l0 = z;
    }

    public void setIconAnimated(boolean z) {
        this.f13168T = z;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.f13171c.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f13170b.setInterpolator(interpolator);
        this.f13171c.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.f13170b.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.f13172d = animatorSet;
    }

    public void setMenuButtonColorNormal(int i) {
        this.f13154F = i;
        this.f13174f.setColorNormal(i);
    }

    public void setMenuButtonColorNormalResId(int i) {
        this.f13154F = getResources().getColor(i);
        this.f13174f.setColorNormalResId(i);
    }

    public void setMenuButtonColorPressed(int i) {
        this.f13155G = i;
        this.f13174f.setColorPressed(i);
    }

    public void setMenuButtonColorPressedResId(int i) {
        this.f13155G = getResources().getColor(i);
        this.f13174f.setColorPressedResId(i);
    }

    public void setMenuButtonColorRipple(int i) {
        this.f13156H = i;
        this.f13174f.setColorRipple(i);
    }

    public void setMenuButtonColorRippleResId(int i) {
        this.f13156H = getResources().getColor(i);
        this.f13174f.setColorRippleResId(i);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.f13174f.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.f13174f.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.f13174f.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.f13174f.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13174f.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(C3801c cVar) {
        this.f13185n0 = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0313, code lost:
        if (r12 == 0) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x031f, code lost:
        if (r12 == 0) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionMenu(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            r10.f13170b = r13
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            r10.f13171c = r13
            android.content.Context r13 = r10.getContext()
            r0 = 0
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r0)
            r10.f13173e = r13
            android.content.Context r13 = r10.getContext()
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r0)
            r10.f13176h = r13
            android.content.Context r13 = r10.getContext()
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r0)
            r10.f13177i = r13
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
            r10.f13182m = r13
            android.content.Context r13 = r10.getContext()
            r1 = 1082130432(0x40800000, float:4.0)
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r1)
            r10.f13188p = r13
            android.content.Context r13 = r10.getContext()
            r2 = 1090519040(0x41000000, float:8.0)
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r2)
            r10.f13190q = r13
            android.content.Context r13 = r10.getContext()
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r1)
            r10.f13192r = r13
            android.content.Context r13 = r10.getContext()
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r2)
            r10.f13194s = r13
            android.content.Context r13 = r10.getContext()
            r2 = 1077936128(0x40400000, float:3.0)
            int r13 = com.github.clans.fab.C3816m.m10117a(r13, r2)
            r10.f13200v = r13
            r10.f13151C = r1
            r13 = 1065353216(0x3f800000, float:1.0)
            r10.f13152D = r13
            r10.f13153E = r2
            r13 = 1
            r10.f13161M = r13
            r10.f13168T = r13
            int[] r1 = com.github.clans.fab.C3815l.FloatingActionMenu
            r2 = 0
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1, r2, r2)
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_buttonSpacing
            int r1 = r10.f13173e
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13173e = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_margin
            int r1 = r10.f13176h
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13176h = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_position
            int r12 = r11.getInt(r12, r2)
            r10.f13193r0 = r12
            int r1 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_showAnimation
            if (r12 != 0) goto L_0x00a6
            int r12 = com.github.clans.fab.C3811h.fab_slide_in_from_right
            goto L_0x00a8
        L_0x00a6:
            int r12 = com.github.clans.fab.C3811h.fab_slide_in_from_left
        L_0x00a8:
            int r12 = r11.getResourceId(r1, r12)
            r10.f13184n = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_hideAnimation
            int r1 = r10.f13193r0
            if (r1 != 0) goto L_0x00b7
            int r1 = com.github.clans.fab.C3811h.fab_slide_out_to_right
            goto L_0x00b9
        L_0x00b7:
            int r1 = com.github.clans.fab.C3811h.fab_slide_out_to_left
        L_0x00b9:
            int r12 = r11.getResourceId(r12, r1)
            r10.f13186o = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_paddingTop
            int r1 = r10.f13188p
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13188p = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_paddingRight
            int r1 = r10.f13190q
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13190q = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_paddingBottom
            int r1 = r10.f13192r
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13192r = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_paddingLeft
            int r1 = r10.f13194s
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.f13194s = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_textColor
            android.content.res.ColorStateList r12 = r11.getColorStateList(r12)
            r10.f13196t = r12
            r1 = -1
            if (r12 != 0) goto L_0x00f8
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r1)
            r10.f13196t = r12
        L_0x00f8:
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_textSize
            android.content.res.Resources r3 = r10.getResources()
            int r4 = com.github.clans.fab.C3812i.labels_text_size
            float r3 = r3.getDimension(r4)
            float r12 = r11.getDimension(r12, r3)
            r10.f13198u = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_cornerRadius
            int r3 = r10.f13200v
            int r12 = r11.getDimensionPixelSize(r12, r3)
            r10.f13200v = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_showShadow
            boolean r12 = r11.getBoolean(r12, r13)
            r10.f13201w = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_colorNormal
            r3 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            int r12 = r11.getColor(r12, r3)
            r10.f13202x = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_colorPressed
            r3 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            int r12 = r11.getColor(r12, r3)
            r10.f13203y = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_colorRipple
            r3 = 1728053247(0x66ffffff, float:6.0446287E23)
            int r12 = r11.getColor(r12, r3)
            r10.f13204z = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_showShadow
            boolean r12 = r11.getBoolean(r12, r13)
            r10.f13149A = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_shadowColor
            r3 = 1711276032(0x66000000, float:1.5111573E23)
            int r12 = r11.getColor(r12, r3)
            r10.f13150B = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_shadowRadius
            float r3 = r10.f13151C
            float r12 = r11.getDimension(r12, r3)
            r10.f13151C = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_shadowXOffset
            float r3 = r10.f13152D
            float r12 = r11.getDimension(r12, r3)
            r10.f13152D = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_shadowYOffset
            float r3 = r10.f13153E
            float r12 = r11.getDimension(r12, r3)
            r10.f13153E = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_colorNormal
            r3 = -2473162(0xffffffffffda4336, float:NaN)
            int r12 = r11.getColor(r12, r3)
            r10.f13154F = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_colorPressed
            r3 = -1617853(0xffffffffffe75043, float:NaN)
            int r12 = r11.getColor(r12, r3)
            r10.f13155G = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_colorRipple
            r3 = -1711276033(0xffffffff99ffffff, float:-2.6469778E-23)
            int r12 = r11.getColor(r12, r3)
            r10.f13156H = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_animationDelayPerItem
            r3 = 50
            int r12 = r11.getInt(r12, r3)
            r10.f13158J = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_icon
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            r10.f13157I = r12
            if (r12 != 0) goto L_0x01ae
            android.content.res.Resources r12 = r10.getResources()
            int r3 = com.github.clans.fab.C3813j.fab_add
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r3)
            r10.f13157I = r12
        L_0x01ae:
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_singleLine
            boolean r12 = r11.getBoolean(r12, r2)
            r10.f13162N = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_ellipsize
            int r12 = r11.getInt(r12, r2)
            r10.f13163O = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_maxLines
            int r12 = r11.getInt(r12, r1)
            r10.f13164P = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_fab_size
            int r12 = r11.getInt(r12, r2)
            r10.f13165Q = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_style
            int r12 = r11.getResourceId(r12, r2)
            r10.f13166R = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_customFont
            java.lang.String r12 = r11.getString(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ RuntimeException -> 0x0398 }
            if (r1 != 0) goto L_0x01f0
            android.content.Context r1 = r10.getContext()     // Catch:{ RuntimeException -> 0x0398 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ RuntimeException -> 0x0398 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r12)     // Catch:{ RuntimeException -> 0x0398 }
            r10.f13167S = r1     // Catch:{ RuntimeException -> 0x0398 }
        L_0x01f0:
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_openDirection
            int r12 = r11.getInt(r12, r2)
            r10.f13183m0 = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_backgroundColor
            int r12 = r11.getColor(r12, r2)
            r10.f13191q0 = r12
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_fab_label
            boolean r1 = r11.hasValue(r12)
            if (r1 == 0) goto L_0x0210
            r10.f13199u0 = r13
            java.lang.String r12 = r11.getString(r12)
            r10.f13197t0 = r12
        L_0x0210:
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_labels_padding
            boolean r1 = r11.hasValue(r12)
            if (r1 == 0) goto L_0x0224
            int r12 = r11.getDimensionPixelSize(r12, r2)
            r10.f13188p = r12
            r10.f13190q = r12
            r10.f13192r = r12
            r10.f13194s = r12
        L_0x0224:
            android.view.animation.OvershootInterpolator r12 = new android.view.animation.OvershootInterpolator
            r12.<init>()
            r10.f13159K = r12
            android.view.animation.AnticipateInterpolator r12 = new android.view.animation.AnticipateInterpolator
            r12.<init>()
            r10.f13160L = r12
            android.view.ContextThemeWrapper r12 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r10.getContext()
            int r3 = r10.f13166R
            r12.<init>(r1, r3)
            r10.f13195s0 = r12
            int r12 = r10.f13191q0
            int r12 = android.graphics.Color.alpha(r12)
            int r1 = r10.f13191q0
            int r1 = android.graphics.Color.red(r1)
            int r3 = r10.f13191q0
            int r3 = android.graphics.Color.green(r3)
            int r4 = r10.f13191q0
            int r4 = android.graphics.Color.blue(r4)
            r5 = 2
            int[] r6 = new int[r5]
            r6[r2] = r2
            r6[r13] = r12
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r6)
            r10.f13187o0 = r6
            r7 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r7)
            android.animation.ValueAnimator r6 = r10.f13187o0
            com.github.clans.fab.b r9 = new com.github.clans.fab.b
            r9.<init>(r10, r1, r3, r4)
            r6.addUpdateListener(r9)
            int[] r6 = new int[r5]
            r6[r2] = r12
            r6[r13] = r2
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofInt(r6)
            r10.f13189p0 = r12
            r12.setDuration(r7)
            android.animation.ValueAnimator r12 = r10.f13189p0
            com.github.clans.fab.c r6 = new com.github.clans.fab.c
            r6.<init>(r10, r1, r3, r4)
            r12.addUpdateListener(r6)
            com.github.clans.fab.FloatingActionButton r12 = new com.github.clans.fab.FloatingActionButton
            android.content.Context r1 = r10.getContext()
            r3 = 0
            r12.<init>(r1, r3)
            r10.f13174f = r12
            boolean r1 = r10.f13149A
            r12.f13101c = r1
            if (r1 == 0) goto L_0x02c6
            android.content.Context r1 = r10.getContext()
            float r3 = r10.f13151C
            int r1 = com.github.clans.fab.C3816m.m10117a(r1, r3)
            r12.f13103e = r1
            com.github.clans.fab.FloatingActionButton r12 = r10.f13174f
            android.content.Context r1 = r10.getContext()
            float r3 = r10.f13152D
            int r1 = com.github.clans.fab.C3816m.m10117a(r1, r3)
            r12.f13104f = r1
            com.github.clans.fab.FloatingActionButton r12 = r10.f13174f
            android.content.Context r1 = r10.getContext()
            float r3 = r10.f13153E
            int r1 = com.github.clans.fab.C3816m.m10117a(r1, r3)
            r12.f13105g = r1
        L_0x02c6:
            com.github.clans.fab.FloatingActionButton r12 = r10.f13174f
            int r1 = r10.f13154F
            int r3 = r10.f13155G
            int r4 = r10.f13156H
            r12.f13106h = r1
            r12.f13107i = r3
            r12.f13109k = r4
            int r1 = r10.f13150B
            r12.f13102d = r1
            int r1 = r10.f13165Q
            r12.f13100b = r1
            r12.mo15561n()
            com.github.clans.fab.FloatingActionButton r12 = r10.f13174f
            java.lang.String r1 = r10.f13197t0
            r12.setLabelText(r1)
            android.widget.ImageView r12 = new android.widget.ImageView
            android.content.Context r1 = r10.getContext()
            r12.<init>(r1)
            r10.f13169U = r12
            android.graphics.drawable.Drawable r1 = r10.f13157I
            r12.setImageDrawable(r1)
            com.github.clans.fab.FloatingActionButton r12 = r10.f13174f
            android.view.ViewGroup$LayoutParams r1 = super.generateDefaultLayoutParams()
            r10.addView(r12, r1)
            android.widget.ImageView r12 = r10.f13169U
            r10.addView(r12)
            int r12 = r10.f13183m0
            r1 = 1124532224(0x43070000, float:135.0)
            if (r12 != 0) goto L_0x0316
            int r12 = r10.f13193r0
            if (r12 != 0) goto L_0x0311
            r3 = -1022951424(0xffffffffc3070000, float:-135.0)
            goto L_0x0313
        L_0x0311:
            r3 = 1124532224(0x43070000, float:135.0)
        L_0x0313:
            if (r12 != 0) goto L_0x0324
            goto L_0x0322
        L_0x0316:
            int r12 = r10.f13193r0
            if (r12 != 0) goto L_0x031d
            r3 = 1124532224(0x43070000, float:135.0)
            goto L_0x031f
        L_0x031d:
            r3 = -1022951424(0xffffffffc3070000, float:-135.0)
        L_0x031f:
            if (r12 != 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r1 = -1022951424(0xffffffffc3070000, float:-135.0)
        L_0x0324:
            android.widget.ImageView r12 = r10.f13169U
            float[] r4 = new float[r5]
            r4[r2] = r3
            r4[r13] = r0
            java.lang.String r3 = "rotation"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r3, r4)
            android.widget.ImageView r4 = r10.f13169U
            float[] r5 = new float[r5]
            r5[r2] = r0
            r5[r13] = r1
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r4, r3, r5)
            android.animation.AnimatorSet r0 = r10.f13170b
            r0.play(r13)
            android.animation.AnimatorSet r13 = r10.f13171c
            r13.play(r12)
            android.animation.AnimatorSet r12 = r10.f13170b
            android.view.animation.OvershootInterpolator r13 = r10.f13159K
            r12.setInterpolator(r13)
            android.animation.AnimatorSet r12 = r10.f13171c
            android.view.animation.AnticipateInterpolator r13 = r10.f13160L
            r12.setInterpolator(r13)
            android.animation.AnimatorSet r12 = r10.f13170b
            r12.setDuration(r7)
            android.animation.AnimatorSet r12 = r10.f13171c
            r12.setDuration(r7)
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_fab_show_animation
            int r13 = com.github.clans.fab.C3811h.fab_scale_up
            int r12 = r11.getResourceId(r12, r13)
            android.content.Context r13 = r10.getContext()
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r13, r12)
            r10.setMenuButtonShowAnimation(r13)
            android.content.Context r13 = r10.getContext()
            android.view.animation.AnimationUtils.loadAnimation(r13, r12)
            int r12 = com.github.clans.fab.C3815l.FloatingActionMenu_menu_fab_hide_animation
            int r13 = com.github.clans.fab.C3811h.fab_scale_down
            int r12 = r11.getResourceId(r12, r13)
            android.content.Context r13 = r10.getContext()
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r13, r12)
            r10.setMenuButtonHideAnimation(r13)
            android.content.Context r13 = r10.getContext()
            android.view.animation.AnimationUtils.loadAnimation(r13, r12)
            r11.recycle()
            return
        L_0x0398:
            r11 = move-exception
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable to load specified custom font: "
            java.lang.String r12 = p379.C25541a.m63881k(r0, r12)
            r13.<init>(r12, r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.clans.fab.FloatingActionMenu.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
