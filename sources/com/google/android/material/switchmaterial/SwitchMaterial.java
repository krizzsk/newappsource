package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13410k;
import p599kc.C18017a;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: o0 */
    public static final int f35363o0 = C13410k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: p0 */
    public static final int[][] f35364p0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: U */
    public final C18017a f35365U;

    /* renamed from: l0 */
    public ColorStateList f35366l0;

    /* renamed from: m0 */
    public ColorStateList f35367m0;

    /* renamed from: n0 */
    public boolean f35368n0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f35366l0 == null) {
            int c = C14256d1.m35485c(C13401b.colorSurface, this);
            int c2 = C14256d1.m35485c(C13401b.colorControlActivated, this);
            float dimension = getResources().getDimension(C13403d.mtrl_switch_thumb_elevation);
            if (this.f35365U.f46134a) {
                float f = BitmapDescriptorFactory.HUE_RED;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    f += C6333d0.C6342i.m15092i((View) parent);
                }
                dimension += f;
            }
            int a = this.f35365U.mo50512a(dimension, c);
            this.f35366l0 = new ColorStateList(f35364p0, new int[]{C14256d1.m35491i(1.0f, c, c2), a, C14256d1.m35491i(0.38f, c, c2), a});
        }
        return this.f35366l0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f35367m0 == null) {
            int[][] iArr = f35364p0;
            int c = C14256d1.m35485c(C13401b.colorSurface, this);
            int c2 = C14256d1.m35485c(C13401b.colorControlActivated, this);
            int c3 = C14256d1.m35485c(C13401b.colorOnSurface, this);
            this.f35367m0 = new ColorStateList(iArr, new int[]{C14256d1.m35491i(0.54f, c, c2), C14256d1.m35491i(0.32f, c, c3), C14256d1.m35491i(0.12f, c, c2), C14256d1.m35491i(0.12f, c, c3)});
        }
        return this.f35367m0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35368n0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f35368n0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f35368n0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f35363o0
            android.content.Context r7 = p883wc.C20289a.m47861a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            kc.a r7 = new kc.a
            r7.<init>(r0)
            r6.f35365U = r7
            int[] r2 = p355ac.C13411l.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r9 = p355ac.C13411l.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f35368n0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
