package com.moovit.map;

import a20.C13387a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.image.model.ViewImage;
import com.moovit.map.LineStyle;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import p072e6.C4565c;
import p824tp.C19735m;
import p824tp.C19738p;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19745w;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20964s0;
import v10.C20065a;

/* renamed from: com.moovit.map.i */
public final class C16281i {

    /* renamed from: com.moovit.map.i$a */
    public static class C16282a extends C4565c {

        /* renamed from: b */
        public final Context f42548b;

        public C16282a(Context context) {
            super(2);
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f42548b = context;
        }

        /* renamed from: g */
        public static TransitStopPathway m41524g(Object obj) {
            if (!(obj instanceof C20944i0)) {
                return null;
            }
            C20944i0 i0Var = (C20944i0) obj;
            F f = i0Var.f52692a;
            if (f instanceof TransitStop) {
                S s = i0Var.f52693b;
                if (s instanceof ServerId) {
                    return ((TransitStop) f).f23740l.get((ServerId) s);
                }
            }
            return null;
        }

        /* renamed from: b */
        public final View mo20078b(Object obj) {
            TransitStop transitStop;
            TransitStopPathway g = m41524g(obj);
            if (g == null) {
                return null;
            }
            if (!g.mo24419c() && !g.mo24420d()) {
                return null;
            }
            if (obj instanceof C20944i0) {
                F f = ((C20944i0) obj).f52692a;
                if (f instanceof TransitStop) {
                    transitStop = (TransitStop) f;
                    View inflate = View.inflate(this.f42548b, C19742t.pathway_map_info_window, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C19740r.pathway_type)).setText(TransitStopPathway.m17847b(g.f23749c));
                    ((TextView) inflate.findViewById(C19740r.pathway_name)).setText(g.f23750d);
                    ((TextView) inflate.findViewById(C19740r.stop_name)).setText(transitStop.f23731c);
                    return inflate;
                }
            }
            transitStop = null;
            View inflate2 = View.inflate(this.f42548b, C19742t.pathway_map_info_window, (ViewGroup) null);
            ((TextView) inflate2.findViewById(C19740r.pathway_type)).setText(TransitStopPathway.m17847b(g.f23749c));
            ((TextView) inflate2.findViewById(C19740r.pathway_name)).setText(g.f23750d);
            ((TextView) inflate2.findViewById(C19740r.stop_name)).setText(transitStop.f23731c);
            return inflate2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.map.MarkerZoomStyle m41505a(com.moovit.image.model.Image r9, boolean r10) {
        /*
            if (r10 == 0) goto L_0x0005
            int r0 = p824tp.C19739q.map_general_poi_bg_selected
            goto L_0x0007
        L_0x0005:
            int r0 = p824tp.C19739q.map_general_poi_bg
        L_0x0007:
            int r0 = com.moovit.image.C16028g.m40831i(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "0"
            r2 = 0
            r3 = 1
            java.lang.String r4 = r9.f41803b     // Catch:{ Exception -> 0x005a }
            r5 = -1
            int r6 = r4.hashCode()     // Catch:{ Exception -> 0x005a }
            r7 = -421223275(0xffffffffe6e4a495, float:-5.3986778E23)
            if (r6 == r7) goto L_0x002f
            r7 = 606125519(0x2420bdcf, float:3.4855244E-17)
            if (r6 == r7) goto L_0x0025
            goto L_0x0038
        L_0x0025:
            java.lang.String r6 = "DrawableResourceImage"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0038
        L_0x002f:
            java.lang.String r6 = "RemoteImage"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0038
            r5 = 1
        L_0x0038:
            if (r5 == 0) goto L_0x004a
            if (r5 == r3) goto L_0x003d
            goto L_0x0078
        L_0x003d:
            r4 = r9
            com.moovit.image.model.RemoteImage r4 = (com.moovit.image.model.RemoteImage) r4     // Catch:{ Exception -> 0x005a }
            java.lang.Object r4 = r4.f41804c     // Catch:{ Exception -> 0x005a }
            com.moovit.network.model.ServerId r4 = (com.moovit.network.model.ServerId) r4     // Catch:{ Exception -> 0x005a }
            java.lang.String r9 = r4.mo19751c()     // Catch:{ Exception -> 0x005a }
        L_0x0048:
            r1 = r9
            goto L_0x0078
        L_0x004a:
            r4 = r9
            com.moovit.image.model.ResourceImage r4 = (com.moovit.image.model.ResourceImage) r4     // Catch:{ Exception -> 0x005a }
            int r4 = r4.mo48250c()     // Catch:{ Exception -> 0x005a }
            int r4 = com.moovit.image.C16028g.m40831i(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0048
        L_0x005a:
            r4 = move-exception
            de.f r5 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r6 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unable to find image id for: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r9 = r7.toString()
            r6.<init>(r9, r4)
            r5.mo49364c(r6)
        L_0x0078:
            if (r10 == 0) goto L_0x007d
            int r9 = p824tp.C19745w.map_general_poi_selected
            goto L_0x007f
        L_0x007d:
            int r9 = p824tp.C19745w.map_general_poi
        L_0x007f:
            com.moovit.map.MarkerZoomStyle r10 = new com.moovit.map.MarkerZoomStyle
            com.moovit.image.model.ResourceImage r4 = new com.moovit.image.model.ResourceImage
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r2] = r0
            r5[r3] = r1
            r4.<init>(r9, r5)
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.C16281i.m41505a(com.moovit.image.model.Image, boolean):com.moovit.map.MarkerZoomStyle");
    }

    /* renamed from: b */
    public static MarkerZoomStyle m41506b(int i) {
        return new MarkerZoomStyle(new ResourceImage(i, new String[0]));
    }

    /* renamed from: c */
    public static void m41507c(SparseArray<MarkerZoomStyle> sparseArray) {
        if (sparseArray.size() != 0) {
            sparseArray.put(0, sparseArray.valueAt(0));
        }
    }

    /* renamed from: d */
    public static Rect m41508d(Collection<C20065a> collection) {
        PointF pointF;
        Rect rect = new Rect();
        for (C20065a next : collection) {
            if (!(next == null || (pointF = next.f50910b) == null)) {
                Bitmap bitmap = next.f50909a;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                float f = (float) height;
                rect.top = Math.max(rect.top, Math.round(pointF.y * f));
                rect.bottom = Math.max(rect.bottom, Math.round((1.0f - pointF.y) * f));
                float f2 = (float) width;
                rect.left = Math.max(rect.left, Math.round(pointF.x * f2));
                rect.right = Math.max(rect.right, Math.round((1.0f - pointF.x) * f2));
            }
        }
        return rect;
    }

    /* renamed from: e */
    public static LineStyle m41509e(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C19738p.map_solid_line_style_thickness);
        Color.C15756a aVar = Color.f40999c;
        LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
        Color d = Color.m40220d(C19735m.colorSurfaceInverseEmphasisLow, context);
        C21100e.m49373x(d, "color");
        float f = (float) dimensionPixelSize;
        C21100e.m49357p(f, "strokeWidth");
        LineStyle.LineJoin lineJoin2 = LineStyle.LineJoin.ROUND;
        C21100e.m49373x(lineJoin2, "lineJoin");
        return new LineStyle(d, f, lineJoin2, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: f */
    public static MarkerZoomStyle m41510f(Color color, int i, Color color2, Color color3, boolean z) {
        String str;
        String str2;
        int i2;
        String str3 = "0";
        if (i != 0) {
            str = String.valueOf(C16028g.m40831i(i));
        } else {
            str = str3;
        }
        if (color3 != null) {
            str2 = String.valueOf(C16028g.m40831i(C19739q.mvf_oval_background));
        } else {
            str2 = str3;
        }
        if (color3 != null) {
            str3 = color3.mo46956l();
        }
        if (z) {
            i2 = C19745w.map_selected_circle_marker;
        } else {
            i2 = C19745w.map_circle_marker;
        }
        return new MarkerZoomStyle(new ResourceImage(i2, color.mo46956l(), str, color2.mo46956l(), str2, str3));
    }

    /* renamed from: g */
    public static LineStyle m41511g(Context context) {
        return m41519o(context, Color.m40220d(C19735m.colorSurfaceInverseEmphasisLow, context));
    }

    /* renamed from: h */
    public static MarkerZoomStyle m41512h() {
        return new MarkerZoomStyle(new ResourceImage(C19739q.ic_map_end_trip_36_secondary, new String[0]));
    }

    /* renamed from: i */
    public static MarkerZoomStyle m41513i(Context context, int i, Drawable drawable, String str) {
        String str2 = null;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, C19742t.iconified_textual_marker_layout, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(C19740r.text);
        if (!C20964s0.m49090h(str)) {
            str2 = str;
        }
        UiUtils.m40234B(textView, str2);
        ImageView imageView = (ImageView) viewGroup.findViewById(C19740r.icon);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        PointF pointF = new PointF(0.5f, 1.0f);
        return new MarkerZoomStyle(new ViewImage("iconified_textual_marker#" + i + "_" + str, viewGroup, pointF));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.map.MarkerZoomStyle m41514j(int r5, boolean r6) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            if (r6 == 0) goto L_0x0024
            android.os.Parcelable$Creator<com.moovit.transit.TransitStopPathway> r6 = com.moovit.transit.TransitStopPathway.CREATOR
            if (r5 == r2) goto L_0x0017
            if (r5 == r1) goto L_0x0014
            if (r5 == r0) goto L_0x0011
            r5 = 0
            goto L_0x0019
        L_0x0011:
            int r5 = p824tp.C19739q.ic_pathway_both_16_on_surface_emphasis_high
            goto L_0x0019
        L_0x0014:
            int r5 = p824tp.C19739q.ic_pathway_exit_16_on_surface_emphasis_high
            goto L_0x0019
        L_0x0017:
            int r5 = p824tp.C19739q.ic_pathway_entrance_16_on_surface_emphasis_high
        L_0x0019:
            if (r5 != 0) goto L_0x001c
            goto L_0x0038
        L_0x001c:
            com.moovit.image.model.ResourceImage r6 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r0 = new java.lang.String[r4]
            r6.<init>(r5, r0)
            goto L_0x0041
        L_0x0024:
            android.os.Parcelable$Creator<com.moovit.transit.TransitStopPathway> r6 = com.moovit.transit.TransitStopPathway.CREATOR
            if (r5 == r2) goto L_0x0034
            if (r5 == r1) goto L_0x0031
            if (r5 == r0) goto L_0x002e
            r5 = 0
            goto L_0x0036
        L_0x002e:
            int r5 = p824tp.C19739q.ic_pathway_both_24_on_surface_emphasis_high
            goto L_0x0036
        L_0x0031:
            int r5 = p824tp.C19739q.ic_pathway_exit_24_on_surface_emphasis_high
            goto L_0x0036
        L_0x0034:
            int r5 = p824tp.C19739q.ic_pathway_entrance_24_on_surface_emphasis_high
        L_0x0036:
            if (r5 != 0) goto L_0x003a
        L_0x0038:
            r6 = r3
            goto L_0x0041
        L_0x003a:
            com.moovit.image.model.ResourceImage r6 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r0 = new java.lang.String[r4]
            r6.<init>(r5, r0)
        L_0x0041:
            if (r6 != 0) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            com.moovit.map.MarkerZoomStyle r3 = new com.moovit.map.MarkerZoomStyle
            r5 = 255(0xff, float:3.57E-43)
            r3.<init>(r5, r6)
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.C16281i.m41514j(int, boolean):com.moovit.map.MarkerZoomStyle");
    }

    /* renamed from: k */
    public static Rect m41515k(Context context, C13387a... aVarArr) {
        Rect rect = new Rect();
        m41523s(context, rect, aVarArr);
        return rect;
    }

    /* renamed from: l */
    public static MarkerZoomStyle m41516l(Color color, Color color2, Float f) {
        ResourceImage resourceImage = new ResourceImage(C19745w.map_ring_marker, color.mo46956l(), color2.mo46956l());
        if (f == null) {
            return new MarkerZoomStyle(resourceImage);
        }
        return new MarkerZoomStyle(resourceImage, ValidationUtils.APPBOY_STRING_MAX_LENGTH, f.floatValue(), 1);
    }

    /* renamed from: m */
    public static MarkerZoomStyle m41517m(int i, Context context, TransitLineGroup transitLineGroup) {
        Color a = C7843b.m17874a(context, transitLineGroup);
        return m41510f(a, C19739q.ic_transit_type_bus_24_on_surface, C7843b.m17875b(context, a), Color.m40220d(i, context), true);
    }

    /* renamed from: n */
    public static MarkerZoomStyle m41518n(Context context, String str) {
        TextView textView = (TextView) View.inflate(context, C19742t.textual_marker_layout, (ViewGroup) null);
        textView.setText(str);
        return new MarkerZoomStyle(new ViewImage(C25541a.m63881k("textual_marker#", str), textView, new PointF(0.493f, 0.846f)));
    }

    /* renamed from: o */
    public static LineStyle m41519o(Context context, Color color) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C19738p.map_solid_line_style_thickness);
        Color.C15756a aVar = Color.f40999c;
        LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
        C21100e.m49373x(color, "color");
        float f = (float) dimensionPixelSize;
        C21100e.m49357p(f, "strokeWidth");
        LineStyle.LineJoin lineJoin2 = LineStyle.LineJoin.ROUND;
        C21100e.m49373x(lineJoin2, "lineJoin");
        return new LineStyle(color, f, lineJoin2, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: p */
    public static MarkerZoomStyle m41520p(int i, Context context, TransitLineGroup transitLineGroup) {
        return m41510f(Color.f41003g, C19739q.ic_transit_type_bus_16_on_surface, C7843b.m17874a(context, transitLineGroup), Color.m40220d(i, context), false);
    }

    /* renamed from: q */
    public static LineStyle m41521q(Context context) {
        return new LineStyle(Color.f41003g, 10.0f, LineStyle.LineJoin.NONE, (Bitmap) null, C17988b.m44610a(C19739q.map_walking, context), 0.2f);
    }

    /* renamed from: r */
    public static boolean m41522r(Location location) {
        long j;
        if (location == null) {
            return false;
        }
        if (C20943i.m49051d(17)) {
            j = TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
        } else {
            j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - location.getTime());
        }
        if (j <= 90) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static void m41523s(Context context, Rect rect, C13387a... aVarArr) {
        for (C13387a aVar : aVarArr) {
            if (aVar != null) {
                Image image = aVar.getImage();
                if (image instanceof ResourceImage) {
                    int c = ((ResourceImage) image).mo48250c();
                    Drawable b = C17988b.m44611b(c, context);
                    PointF pointF = C16019d.m40803a().f41716b.get(c);
                    if (!(b == null || pointF == null)) {
                        rect.top = Math.max(rect.top, Math.round(pointF.y * ((float) b.getIntrinsicHeight())));
                        rect.bottom = Math.max(rect.bottom, Math.round((1.0f - pointF.y) * ((float) b.getIntrinsicHeight())));
                        rect.left = Math.max(rect.left, Math.round(pointF.x * ((float) b.getIntrinsicWidth())));
                        rect.right = Math.max(rect.right, Math.round((1.0f - pointF.x) * ((float) b.getIntrinsicWidth())));
                    }
                }
            }
        }
    }
}
