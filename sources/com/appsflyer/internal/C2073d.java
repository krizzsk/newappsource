package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AFDateFormat;
import com.appsflyer.AFLogger;
import com.appsflyer.HashUtils;
import com.braze.support.WebContentUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.d */
public final class C2073d {
    private static int $$a = -2123613137;
    private static int $$b = 185;
    private static byte[] AFDateFormat = {-90, -90, -73, -92, 63, 69, 63, 98, 63, -90, -104, 63, 84, -97, 63, 95, -45, 63, 63, 63, -59, -8, -9, -118, -68, -61, -112, -93, -60, -116, -71, -57, -71, -57, -70, -58, -9, -114, -95, -9, -38, -118, -89, -35, -12, -13, -67, -12, -116, -11, -9, -119, -66, 3, 114, 10, 117, 3, 28, 92, 9, 3, 119, 8, 21, 17, 28, -83, 12, -57, 62, 109, 110, 115, 2, 122, 3, -71, 14, 56, 33, 21, 25, 25, 44, 88, 55, -49, 42, 101, -32, 15, 16, 17, 36, 28, 33, -89, 39, -77, 99, 111, -2, 109, -13, -80, -71, 112, 53, 39, 5, 95, 1, -85, 27, -29, -22, 30, -44, -74, -22, -79, -28, -77, -66, -75, -34, -90, 15, -17, -75, -65, -65, -23, -20, -108, -50, -94, -68, -117, -126, -107, -124, 119, 126, -105, 111, 69, -56, -108, 119, -114, 51, -56, -108, 111, -111, 48, -57, -115, -123, 126, -118, 63, -36, 123, -118, 67, -47, -121, 52, -52, -117, -119, Byte.MAX_VALUE, 120, 103, -67, -99, -57, -98, -51, -77, -58, -54, -59, -60, -96, 119, -27, -57, -55, -96, -101, -75, -95, -99, 125, -19, -105, -58};
    private static short[] AFDeepLinkManager = null;
    private static int getDataFormatter = 1;
    private static int getInstance = 0;
    private static int valueOf = 91;
    private static int values = -1919299811;

    /* renamed from: com.appsflyer.internal.d$c */
    public static class C2074c extends HashMap<String, Object> {
        private static int $$a = 0;
        private static int getInstance = 1;
        private static int[] valueOf = {953258076, -82406854, 2145013350, 1182214160, 1170554122, 1738025983, 298567133, 2121869447, -2107597345, 564767846, -27891503, 1404634984, -2141239180, 1267042170, 784130514, -631430338, -1299124548, 972076999};
        private static int values = 184;
        private final Context $$b;
        private final Map<String, Object> AFDateFormat;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r6 == null) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            r6 = r6.toCharArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r6 = (char[]) r6;
            r0 = new char[r9];
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r1 >= r9) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r3 = (char) (r6[r1] + r5);
            r0[r1] = r3;
            r0[r1] = (char) (r3 - values);
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            if (r7 <= 0) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            r6 = '8';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
            r6 = '5';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
            if (r6 == '5') goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            r5 = getInstance + 45;
            $$a = r5 % androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE;
            r5 = r5 % 2;
            r5 = new char[r9];
            java.lang.System.arraycopy(r0, 0, r5, 0, r9);
            r6 = r9 - r7;
            java.lang.System.arraycopy(r5, 0, r0, r6, r7);
            java.lang.System.arraycopy(r5, r7, r0, 0, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            if (r8 == false) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
            r6 = 'Z';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            r6 = '?';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            if (r6 == '?') goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
            r5 = new char[r9];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
            if (r2 >= r9) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
            r5[r2] = r0[(r9 - r2) - 1];
            r2 = r2 + 1;
            r6 = $$a + 21;
            getInstance = r6 % androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE;
            r6 = r6 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
            r0 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
            return new java.lang.String(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r6 != null) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = 75 / 0;
            r6 = r6;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String $$a(int r5, java.lang.String r6, int r7, boolean r8, int r9) {
            /*
                int r0 = $$a
                int r0 = r0 + 95
                int r1 = r0 % 128
                getInstance = r1
                int r0 = r0 % 2
                r1 = 54
                if (r0 != 0) goto L_0x0011
                r0 = 54
                goto L_0x0013
            L_0x0011:
                r0 = 88
            L_0x0013:
                r2 = 0
                if (r0 == r1) goto L_0x0019
                if (r6 == 0) goto L_0x0022
                goto L_0x001e
            L_0x0019:
                r0 = 75
                int r0 = r0 / r2
                if (r6 == 0) goto L_0x0022
            L_0x001e:
                char[] r6 = r6.toCharArray()
            L_0x0022:
                char[] r6 = (char[]) r6
                char[] r0 = new char[r9]
                r1 = 0
            L_0x0027:
                if (r1 >= r9) goto L_0x0038
                char r3 = r6[r1]
                int r3 = r3 + r5
                char r3 = (char) r3
                r0[r1] = r3
                int r4 = values
                int r3 = r3 - r4
                char r3 = (char) r3
                r0[r1] = r3
                int r1 = r1 + 1
                goto L_0x0027
            L_0x0038:
                r5 = 53
                if (r7 <= 0) goto L_0x003f
                r6 = 56
                goto L_0x0041
            L_0x003f:
                r6 = 53
            L_0x0041:
                if (r6 == r5) goto L_0x005a
                int r5 = getInstance
                int r5 = r5 + 45
                int r6 = r5 % 128
                $$a = r6
                int r5 = r5 % 2
                char[] r5 = new char[r9]
                java.lang.System.arraycopy(r0, r2, r5, r2, r9)
                int r6 = r9 - r7
                java.lang.System.arraycopy(r5, r2, r0, r6, r7)
                java.lang.System.arraycopy(r5, r7, r0, r2, r6)
            L_0x005a:
                r5 = 63
                if (r8 == 0) goto L_0x0061
                r6 = 90
                goto L_0x0063
            L_0x0061:
                r6 = 63
            L_0x0063:
                if (r6 == r5) goto L_0x007f
                char[] r5 = new char[r9]
            L_0x0067:
                if (r2 >= r9) goto L_0x007e
                int r6 = r9 - r2
                int r6 = r6 + -1
                char r6 = r0[r6]
                r5[r2] = r6
                int r2 = r2 + 1
                int r6 = $$a
                int r6 = r6 + 21
                int r7 = r6 % 128
                getInstance = r7
                int r6 = r6 % 2
                goto L_0x0067
            L_0x007e:
                r0 = r5
            L_0x007f:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0)
                return r5
            L_0x0085:
                r5 = move-exception
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2073d.C2074c.$$a(int, java.lang.String, int, boolean, int):java.lang.String");
        }

        private String $$b() {
            boolean z = true;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.AFDateFormat.get($$a(TextUtils.lastIndexOf("", '0', 0, 0) + 291, "\u0003￻\t\n￷\u0003\u0006￷￼￵\n￿", ((Process.getThreadPriority(0) + 20) >> 6) + 7, !URLUtil.isNetworkUrl(UrlPrivacyValidator.HTTP_SCHEME), TextUtils.indexOf("", '0') + 13).intern()).toString();
                String obj2 = this.AFDateFormat.get($$b(new int[]{1702894650, -1876257089, 1377582422, 772246173}, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5).intern()).toString();
                if ((obj2 == null ? (char) 21 : 9) == 21) {
                    obj2 = $$b(new int[]{915777382, 1787764142, 154569738, 1287682022}, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder values2 = values(num, obj2, sb.toString());
                int length = values2.length();
                if (length > 4) {
                    int i = $$a + 17;
                    getInstance = i % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i2 = i % 2;
                    values2.delete(4, length);
                } else {
                    while (length < 4) {
                        length++;
                        values2.append('1');
                    }
                }
                values2.insert(0, $$b(new int[]{-1981172910, 640399344}, 2 - TextUtils.indexOf("", '0')).intern());
                String obj3 = values2.toString();
                int i3 = getInstance + 55;
                $$a = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
                if (i3 % 2 == 0) {
                    z = false;
                }
                if (!z) {
                    return obj3;
                }
                throw null;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append($$b(new int[]{839389211, 1957821384, -639042205, 1610154653, -1160938208, -642406174, 1849661017, -411650205, 2133272642, 1733515448, -1285666361, 1389674260, -454955790, 846025876, 1287960659, 698878637, -484371241, 932836321, -1116028423, -1915328644, 935821655, 1925027247}, 42 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return $$a((KeyEvent.getMaxKeyCode() >> 16) + 260, "\u001f￭￭￭￭\u001a\u0019", 1 - (ViewConfiguration.getScrollBarSize() >> 8), URLUtil.isAboutUrl("about:"), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7).intern();
            }
        }

        public C2074c(Map<String, Object> map, Context context) {
            this.AFDateFormat = map;
            this.$$b = context;
            put($$b(), AFDateFormat());
        }

        private String AFDateFormat() {
            String str;
            boolean z;
            int i;
            boolean z2;
            try {
                String obj = this.AFDateFormat.get($$a((KeyEvent.getMaxKeyCode() >> 16) + 290, "\u0003￻\t\n￷\u0003\u0006￷￼￵\n￿", 6 - TextUtils.indexOf("", '0', 0), !URLUtil.isAboutUrl("about:"), (ViewConfiguration.getTapTimeout() >> 16) + 12).intern()).toString();
                String obj2 = this.AFDateFormat.get($$a(View.getDefaultSize(0, 0) + 286, "￞￻\u000e￿\u0000\u0003\f\r\u000e￦￻\u000f\b�\u0002", 4 - View.MeasureSpec.getSize(0), !URLUtil.isFileUrl(WebContentUtils.FILE_URI_SCHEME_PREFIX), 14 - ImageFormat.getBitsPerPixel(0)).intern()).toString();
                String replaceAll = $$b(new int[]{-91596703, -793198328, 1144920860, 945139266}, (KeyEvent.getMaxKeyCode() >> 16) + 5).intern().replaceAll($$b(new int[]{410320239, 891868511, 1419563067, 176603780}, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String sha256 = HashUtils.toSha256(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(sha256.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append($$a(279 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\n\u0015\u0011\u0006\u0004\u0019\u0006￁\t\u0015\n\u0018￁\u0006\u0016\r\u0002\u0017￁\u0007\u0006\f￁\b\u000f\n\u0015\u0002\u0013\u0006\u000f\u0006\b￁\u0005\u0006\r\n\u0002\u0007￁ￛ\u000f\u0010", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, !Gravity.isVertical(0), 44 - (Process.myPid() >> 22)).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append($$b(new int[]{-1538848865, -1636311489, -2114299648, 2024417906, 1931191943, -582375653, -551753000, -1344335118, -835318350, -854713326}, 22 - AndroidCharacter.getEastAsianWidth('0')).intern());
                str = sb4.toString();
            }
            String str2 = str;
            try {
                Intent registerReceiver = this.$$b.registerReceiver((BroadcastReceiver) null, new IntentFilter($$a((ViewConfiguration.getTapTimeout() >> 16) + 273, "\u0015\u0010ￕ\u000b\u0010\u0016\u0019\u000b\u0015\b￫￬￮￵￨￯￪\u0006\u0000￹￬￻￻￨￩ￕ\u0015\u0016\u0010\u001b\n\bￕ\u001b\u0015\f\u001b", (ViewConfiguration.getTouchSlop() >> 8) + 10, TextUtils.isEmpty(""), ImageFormat.getBitsPerPixel(0) + 38).intern()));
                if (registerReceiver != null) {
                    z = false;
                } else {
                    z = true;
                }
                int i2 = -2700;
                if (!z) {
                    int i3 = getInstance + 111;
                    $$a = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i4 = i3 % 2;
                    i2 = registerReceiver.getIntExtra($$b(new int[]{1308163528, -247757123, 1058563446, 925889886, -1249845914, -1196478743}, (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 10).intern(), -2700);
                }
                String str3 = this.$$b.getApplicationInfo().nativeLibraryDir;
                if (str3 != null) {
                    if (str3.contains($$a(260 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "￪￬,", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, URLUtil.isContentUrl("content:"), 2 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        int i5 = getInstance + 99;
                        $$a = i5 % RecyclerView.C1119a0.FLAG_IGNORE;
                        int i6 = i5 % 2;
                        i = 1;
                        int size = ((SensorManager) this.$$b.getSystemService($$a(295 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), "\u0003\u0000\u0004￿￶\u0004", 6 - TextUtils.getTrimmedLength(""), URLUtil.isAssetUrl("file:///android_asset/"), 6 - TextUtils.getCapsMode("", 0, 0)).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append($$b(new int[]{-1863322820, -1029211701}, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                        sb5.append(i2);
                        sb5.append($$a((ViewConfiguration.getJumpTapTimeout() >> 16) + 263, "ￗ)", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, !PhoneNumberUtils.compare("", ""), 2 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))).intern());
                        sb5.append(i);
                        sb5.append($$a(259 - TextUtils.lastIndexOf("", '0', 0), "'ￚ", -ImageFormat.getBitsPerPixel(0), !URLUtil.isHttpUrl(UrlPrivacyValidator.HTTP_SCHEME), 2 - Color.red(0)).intern());
                        sb5.append(size);
                        sb5.append($$a((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 259, "%ￛ", 1 - (ViewConfiguration.getEdgeSlop() >> 16), PhoneNumberUtils.isGlobalPhoneNumber(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2).intern());
                        sb5.append(this.AFDateFormat.size());
                        String obj3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append(C2075b.values(C2075b.valueOf(C2075b.AFDateFormat(obj3))));
                        String obj4 = sb6.toString();
                        int i7 = getInstance + 103;
                        $$a = i7 % RecyclerView.C1119a0.FLAG_IGNORE;
                        int i8 = i7 % 2;
                        return obj4;
                    }
                }
                i = 0;
                int size2 = ((SensorManager) this.$$b.getSystemService($$a(295 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), "\u0003\u0000\u0004￿￶\u0004", 6 - TextUtils.getTrimmedLength(""), URLUtil.isAssetUrl("file:///android_asset/"), 6 - TextUtils.getCapsMode("", 0, 0)).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                sb52.append($$b(new int[]{-1863322820, -1029211701}, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                sb52.append(i2);
                sb52.append($$a((ViewConfiguration.getJumpTapTimeout() >> 16) + 263, "ￗ)", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, !PhoneNumberUtils.compare("", ""), 2 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))).intern());
                sb52.append(i);
                sb52.append($$a(259 - TextUtils.lastIndexOf("", '0', 0), "'ￚ", -ImageFormat.getBitsPerPixel(0), !URLUtil.isHttpUrl(UrlPrivacyValidator.HTTP_SCHEME), 2 - Color.red(0)).intern());
                sb52.append(size2);
                sb52.append($$a((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 259, "%ￛ", 1 - (ViewConfiguration.getEdgeSlop() >> 16), PhoneNumberUtils.isGlobalPhoneNumber(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2).intern());
                sb52.append(this.AFDateFormat.size());
                String obj32 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str2);
                sb62.append(C2075b.values(C2075b.valueOf(C2075b.AFDateFormat(obj32))));
                String obj42 = sb62.toString();
                int i72 = getInstance + 103;
                $$a = i72 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i82 = i72 % 2;
                return obj42;
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append($$a(280 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), "\n\u0015\u0011\u0006\u0004\u0019\u0006￁\t\u0015\n\u0018￁\u0006\u0016\r\u0002\u0017￁\u0007\u0006\f￁\b\u000f\n\u0015\u0002\u0013\u0006\u000f\u0006\b￁\u0005\u0006\r\n\u0002\u0007￁ￛ\u000f\u0010", 40 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), URLUtil.isFileUrl(WebContentUtils.FILE_URI_SCHEME_PREFIX), 45 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append($$a(269 - TextUtils.indexOf("", "", 0), "\u001bￜ\u001bￜ\u001cￛ\u001cￛ\u0011\u0018\f\u001f\u0013\u000e￝￝", PhoneNumberUtils.toaFromString("") - 120, !URLUtil.isValidUrl((String) null), Color.blue(0) + 16).intern());
                return sb8.toString();
            }
        }

        private static StringBuilder values(String... strArr) throws Exception {
            char c;
            boolean z;
            int i;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(Integer.valueOf(strArr[i2].length()));
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            while (true) {
                if (i3 < intValue) {
                    c = '(';
                } else {
                    c = 3;
                }
                if (c == 3) {
                    return sb;
                }
                int i4 = getInstance + 103;
                $$a = i4 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i5 = i4 % 2;
                Integer num = null;
                int i6 = 0;
                while (true) {
                    if (i6 < 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                    char charAt = strArr[i6].charAt(i3);
                    if (num == null) {
                        i = getInstance + 111;
                    } else {
                        charAt ^= num.intValue();
                        i = getInstance + 71;
                    }
                    $$a = i % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i7 = i % 2;
                    num = Integer.valueOf(charAt);
                    i6++;
                }
                sb.append(Integer.toHexString(num.intValue()));
                i3++;
            }
        }

        /* renamed from: com.appsflyer.internal.d$c$b */
        public static class C2075b {
            private byte[] $$a;
            public String $$b;
            public String AFDateFormat;
            public String valueOf;

            public C2075b() {
            }

            public C2075b(String str, byte[] bArr, String str2) {
                this.valueOf = str;
                this.$$a = bArr;
                this.$$b = str2;
            }

            public static byte[] AFDateFormat(String str) throws Exception {
                return str.getBytes();
            }

            public static byte[] valueOf(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            public static String values(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bArr) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(hexString2);
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            public final byte[] valueOf() {
                return this.$$a;
            }

            public C2075b(char[] cArr) {
                Scanner scanner = new Scanner(new String(cArr));
                int i = 0;
                int i2 = 0;
                while (scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.startsWith("url=")) {
                        this.valueOf = nextLine.substring(4).trim();
                    } else if (nextLine.startsWith("version=")) {
                        this.$$b = nextLine.substring(8).trim();
                        Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.$$b);
                        if (matcher.matches()) {
                            i = Integer.parseInt(matcher.group(1));
                            i2 = Integer.parseInt(matcher.group(2));
                        }
                    } else if (nextLine.startsWith("data=")) {
                        String trim = nextLine.substring(5).trim();
                        this.$$a = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
                    }
                }
                scanner.close();
            }
        }

        private static String $$b(int[] iArr, int i) {
            int i2;
            int[] iArr2;
            char[] cArr;
            char[] cArr2;
            int i3 = getInstance + 23;
            $$a = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
            if ((i3 % 2 != 0 ? (char) 20 : 16) != 16) {
                cArr2 = new char[3];
                cArr = new char[(iArr.length - 0)];
                iArr2 = (int[]) valueOf.clone();
                i2 = 1;
            } else {
                cArr2 = new char[4];
                cArr = new char[(iArr.length << 1)];
                iArr2 = (int[]) valueOf.clone();
                i2 = 0;
            }
            while (true) {
                if ((i2 < iArr.length ? 'C' : 'R') != 'C') {
                    return new String(cArr, 0, i);
                }
                int i4 = getInstance + 17;
                $$a = i4 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i5 = i4 % 2;
                int i6 = iArr[i2];
                cArr2[0] = (char) (i6 >> 16);
                cArr2[1] = (char) i6;
                int i7 = iArr[i2 + 1];
                cArr2[2] = (char) (i7 >> 16);
                cArr2[3] = (char) i7;
                C2070ae.AFDateFormat(cArr2, iArr2, false);
                int i8 = i2 << 1;
                cArr[i8] = cArr2[0];
                cArr[i8 + 1] = cArr2[1];
                cArr[i8 + 2] = cArr2[2];
                cArr[i8 + 3] = cArr2[3];
                i2 += 2;
                int i9 = getInstance + 101;
                $$a = i9 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i11 = i9 % 2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String $$a(int r5, boolean r6, int r7, java.lang.String r8, int r9) {
        /*
            int r0 = getDataFormatter
            int r0 = r0 + 121
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % 2
            if (r8 == 0) goto L_0x0010
            char[] r8 = r8.toCharArray()
        L_0x0010:
            char[] r8 = (char[]) r8
            char[] r0 = new char[r9]
            r1 = 0
            r2 = 0
        L_0x0016:
            r3 = 1
            if (r2 >= r9) goto L_0x001b
            r4 = 0
            goto L_0x001c
        L_0x001b:
            r4 = 1
        L_0x001c:
            if (r4 == r3) goto L_0x004a
            int r3 = getInstance
            int r3 = r3 + 99
            int r4 = r3 % 128
            getDataFormatter = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x003b
            char r3 = r8[r2]
            int r3 = r7 % r3
            char r3 = (char) r3
            r0[r2] = r3
            int r4 = $$b
            int r3 = r3 * r4
            char r3 = (char) r3
            r0[r2] = r3
            int r2 = r2 + 32
            goto L_0x0016
        L_0x003b:
            char r3 = r8[r2]
            int r3 = r3 + r7
            char r3 = (char) r3
            r0[r2] = r3
            int r4 = $$b
            int r3 = r3 - r4
            char r3 = (char) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x0016
        L_0x004a:
            if (r5 <= 0) goto L_0x0063
            int r7 = getDataFormatter
            int r7 = r7 + 11
            int r8 = r7 % 128
            getInstance = r8
            int r7 = r7 % 2
            char[] r7 = new char[r9]
            java.lang.System.arraycopy(r0, r1, r7, r1, r9)
            int r8 = r9 - r5
            java.lang.System.arraycopy(r7, r1, r0, r8, r5)
            java.lang.System.arraycopy(r7, r5, r0, r1, r8)
        L_0x0063:
            if (r6 == 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 == r3) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            char[] r5 = new char[r9]
            r6 = 0
        L_0x006e:
            if (r6 >= r9) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x0072:
            r7 = 0
        L_0x0073:
            if (r7 == 0) goto L_0x007f
            int r7 = r9 - r6
            int r7 = r7 - r3
            char r7 = r0[r7]
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x006e
        L_0x007f:
            r0 = r5
        L_0x0080:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2073d.$$a(int, boolean, int, java.lang.String, int):java.lang.String");
    }

    private static String $$b(Context context, String str) {
        int i = getDataFormatter + 115;
        getInstance = i % RecyclerView.C1119a0.FLAG_IGNORE;
        int i2 = i % 2;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod($$b(TextUtils.lastIndexOf("", '0', 0, 0) - 91, 1919299988 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (-16 - AndroidCharacter.getEastAsianWidth('0')), 2123613240 - (Process.myPid() >> 22), (short) (Color.argb(0, 0, 0, 0) + 76)).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{0})).iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i3 = getInstance + 123;
                    getDataFormatter = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i4 = i3 % 2;
                    break;
                }
                if (!(!((ApplicationInfo) it.next()).packageName.equals(str))) {
                    return Boolean.TRUE.toString();
                }
                int i5 = getInstance + 77;
                getDataFormatter = i5 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i6 = i5 % 2;
            }
        } catch (IllegalAccessException e) {
            C2069ad $$a2 = C2069ad.$$a();
            String intern = $$a(View.MeasureSpec.getMode(0) + 5, !URLUtil.isAssetUrl("file:///android_asset/"), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 287, "\n\u000e\u0003\t\b￝\u0002￿�\u0005\r\u000f\u0007￬￿\u0000\u0006￿�\u000e￟\u0012�￿", Color.alpha(0) + 24).intern();
            StringBuilder sb = new StringBuilder();
            sb.append($$a(View.getDefaultSize(0, 0) + 11, !PhoneNumberUtils.isNonSeparator('0'), 328 - AndroidCharacter.getMirror('0'), "\u0006\u0019\u0004\u0006\u0011\u0015\n\u0010\u000fￛ￁￧\u0002\n\r\u0006\u0005￁\n\u000f\u0017\u0010\f\u0006￁\u0013\u0006\u0007\r\u0006\u0004\u0015\u0006\u0005￁\u000e\u0006\u0015\t\u0010\u0005￁\u0018\n\u0015\t￁", 47 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb.append(e);
            $$a2.AFDateFormat((String) null, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            C2069ad $$a3 = C2069ad.$$a();
            String intern2 = $$a(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.isModifierKey(0), ImageFormat.getBitsPerPixel(0) + 288, "\n\u000e\u0003\t\b￝\u0002￿�\u0005\r\u000f\u0007￬￿\u0000\u0006￿�\u000e￟\u0012�￿", (ViewConfiguration.getTapTimeout() >> 16) + 24).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append($$a(11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), PhoneNumberUtils.isStartsPostDial('0'), -16776936 - Color.rgb(0, 0, 0), "\u0006\u0019\u0004\u0006\u0011\u0015\n\u0010\u000fￛ￁￧\u0002\n\r\u0006\u0005￁\n\u000f\u0017\u0010\f\u0006￁\u0013\u0006\u0007\r\u0006\u0004\u0015\u0006\u0005￁\u000e\u0006\u0015\t\u0010\u0005￁\u0018\n\u0015\t￁", 48 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1))).intern());
            sb2.append(e2);
            $$a3.AFDateFormat((String) null, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            C2069ad $$a4 = C2069ad.$$a();
            String intern3 = $$a((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5, PhoneNumberUtils.isEmergencyNumber(""), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 286, "\n\u000e\u0003\t\b￝\u0002￿�\u0005\r\u000f\u0007￬￿\u0000\u0006￿�\u000e￟\u0012�￿", 23 - TextUtils.lastIndexOf("", '0')).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append($$a(11 - TextUtils.getOffsetBefore("", 0), PhoneNumberUtils.isGlobalPhoneNumber(""), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 280, "\u0006\u0019\u0004\u0006\u0011\u0015\n\u0010\u000fￛ￁￧\u0002\n\r\u0006\u0005￁\n\u000f\u0017\u0010\f\u0006￁\u0013\u0006\u0007\r\u0006\u0004\u0015\u0006\u0005￁\u000e\u0006\u0015\t\u0010\u0005￁\u0018\n\u0015\t￁", 47 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb3.append(e3);
            $$a4.AFDateFormat((String) null, intern3, sb3.toString());
        }
        return Boolean.FALSE.toString();
    }

    private static String AFDateFormat(Context context) {
        int i = getDataFormatter + 77;
        getInstance = i % RecyclerView.C1119a0.FLAG_IGNORE;
        int i2 = i % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = getInstance;
            int i4 = i3 + 33;
            getDataFormatter = i4 % RecyclerView.C1119a0.FLAG_IGNORE;
            int i5 = i4 % 2;
            int i6 = i3 + 49;
            getDataFormatter = i6 % RecyclerView.C1119a0.FLAG_IGNORE;
            int i7 = i6 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String valueOf(String str, Long l) {
        int i = getInstance;
        int i2 = i + 61;
        getDataFormatter = i2 % RecyclerView.C1119a0.FLAG_IGNORE;
        int i3 = i2 % 2;
        if (str != null) {
            if (!(l == null)) {
                int i4 = i + 85;
                getDataFormatter = i4 % RecyclerView.C1119a0.FLAG_IGNORE;
                if (!(i4 % 2 != 0) ? str.length() == 95 : str.length() == 32) {
                    StringBuilder sb = new StringBuilder(str);
                    String obj = l.toString();
                    int i5 = getDataFormatter + 73;
                    getInstance = i5 % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i6 = i5 % 2;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (!(i7 < obj.length())) {
                            break;
                        }
                        i8 += Character.getNumericValue(obj.charAt(i7));
                        i7++;
                    }
                    String hexString = Integer.toHexString(i8);
                    sb.replace(7, hexString.length() + 7, hexString);
                    long j = 0;
                    int i9 = 0;
                    while (true) {
                        if (!(i9 < sb.length())) {
                            break;
                        }
                        j += (long) Character.getNumericValue(sb.charAt(i9));
                        i9++;
                        int i11 = getInstance + 73;
                        getDataFormatter = i11 % RecyclerView.C1119a0.FLAG_IGNORE;
                        int i12 = i11 % 2;
                    }
                    while (true) {
                        if ((j > 100 ? 'U' : 'N') != 'U') {
                            break;
                        }
                        j %= 100;
                    }
                    sb.insert(23, (int) j);
                    if ((j < 10 ? 'G' : ']') == 'G') {
                        int i13 = getDataFormatter + 79;
                        getInstance = i13 % RecyclerView.C1119a0.FLAG_IGNORE;
                        int i14 = i13 % 2;
                        sb.insert(23, $$b(-92 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 1919299812, (byte) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 55), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 2123613185, (short) ((ViewConfiguration.getScrollBarSize() >> 8) - 80)).intern());
                    }
                    return sb.toString();
                }
            }
        }
        return $$b(-93 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1919299831, (byte) (-73 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 2123613235 - TextUtils.indexOf("", "", 0, 0), (short) (65519 - AndroidCharacter.getMirror('0'))).intern();
    }

    public static String values(Context context, long j) {
        int i;
        int defaultSize;
        byte rgb;
        int packedPositionChild;
        int lastIndexOf;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        String str;
        String str2;
        String $$b2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if ((valueOf($$a(TextUtils.indexOf("", "", 0, 0) + 8, PhoneNumberUtils.isReallyDialable('0') ^ true, TextUtils.getOffsetBefore("", 0) + 286, "\u0014￨￼\t￼\u0002\u0000\r￼\t￿\r\n\u0004￿￉\u000f\u0000\u0007\u0000\u000b\u0003\n\t\u0014￉￯\u0000\u0007\u0000\u000b\u0003\n\t", 34 - Color.blue(0)).intern()) ? 'Y' : 'b') != 'b') {
            i = -92 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            defaultSize = 1919299811 - (KeyEvent.getMaxKeyCode() >> 16);
            rgb = (byte) (Color.red(0) + 107);
            packedPositionChild = 50226 - AndroidCharacter.getMirror('0');
            lastIndexOf = 101 - ExpandableListView.getPackedPositionChild(0);
        } else {
            i = 37 - PhoneNumberUtils.toaFromString("");
            defaultSize = View.getDefaultSize(0, 0) + 1919299812;
            rgb = (byte) (-16777270 - Color.rgb(0, 0, 0));
            packedPositionChild = ExpandableListView.getPackedPositionChild(0) + 2123613186;
            lastIndexOf = TextUtils.lastIndexOf("", '0') - 79;
        }
        sb2.append($$b(i, defaultSize, rgb, packedPositionChild, (short) lastIndexOf).intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String values2 = values(packageName);
        sb2.append($$b(-92 - TextUtils.indexOf("", "", 0), (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 1919299810, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 107), 2123613186 - View.MeasureSpec.getMode(0), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) + 102)).intern());
        sb4.append(values2);
        if (valueOf(context) == null) {
            sb2.append($$b(-92 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1919299812 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (View.MeasureSpec.getSize(0) - 54), 2123613185 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (short) (-80 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).intern());
            sb4.append(packageName);
        } else {
            sb2.append($$b(Color.argb(0, 0, 0, 0) - 92, 1919299811 - KeyEvent.getDeadChar(0, 0), (byte) (106 - Process.getGidForName("")), 2123613187 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0', 0) + 103)).intern());
            sb4.append(packageName);
            int i6 = getInstance + 29;
            getDataFormatter = i6 % RecyclerView.C1119a0.FLAG_IGNORE;
            int i7 = i6 % 2;
        }
        String AFDateFormat2 = AFDateFormat(context);
        if (AFDateFormat2 == null) {
            int i8 = getDataFormatter + 53;
            getInstance = i8 % RecyclerView.C1119a0.FLAG_IGNORE;
            int i9 = i8 % 2;
            sb2.append($$b(-92 - TextUtils.getOffsetBefore("", 0), TextUtils.getCapsMode("", 0, 0) + 1919299812, (byte) (-53 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), 2123613184 - TextUtils.lastIndexOf("", '0', 0, 0), (short) (((Process.getThreadPriority(0) + 20) >> 6) - 80)).intern());
            sb4.append(packageName);
        } else {
            sb2.append($$b((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) - 92, 1919299811 - View.resolveSize(0, 0), (byte) (107 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.rgb(0, 0, 0) + 2140390402, (short) (103 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).intern());
            sb4.append(AFDateFormat2);
        }
        sb4.append($$b(context, packageName));
        sb.append(sb4.toString());
        try {
            sb.append(AFDateFormat.getDataFormatter($$b((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 93, 1919299813 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 47), View.MeasureSpec.getSize(0) + 2123613258, (short) (-110 - ExpandableListView.getPackedPositionGroup(0))).intern()).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb.append(j);
            if (!(!valueOf($$b(-92 - Color.red(0), AndroidCharacter.getEastAsianWidth('0') + 1919299859, (byte) (-52 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), 2123613234 - (ViewConfiguration.getScrollBarSize() >> 8), (short) (-60 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).intern()))) {
                int i11 = getInstance + 9;
                getDataFormatter = i11 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i12 = i11 % 2;
                i5 = Color.argb(0, 0, 0, 0) - 92;
                i4 = 1919299811 - (ViewConfiguration.getPressedStateDuration() >> 16);
                b = (byte) (106 - TextUtils.lastIndexOf("", '0'));
                i3 = 2123613186 - View.MeasureSpec.getMode(0);
                i2 = View.resolveSize(0, 0) + 102;
            } else {
                i5 = (Process.myTid() >> 22) - 92;
                i4 = 1919299812 - Color.green(0);
                b = (byte) ((ViewConfiguration.getTapTimeout() >> 16) - 54);
                i3 = 2123613185 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                i2 = 65504 - AndroidCharacter.getMirror('0');
            }
            sb3.append($$b(i5, i4, b, i3, (short) i2).intern());
            if (valueOf($$a(Color.green(0) + 22, PhoneNumberUtils.compare("", ""), TextUtils.getTrimmedLength("") + 285, "\n\u0000\u000e\u000b\u0005\u0000ￊ\u0004�\u000e\u0000\u0013�\u000e\u0001ￊ￯\u0001\n\u000f\u000b\u000e�", (ViewConfiguration.getFadingEdgeLength() >> 16) + 23).intern())) {
                int i13 = getDataFormatter + 89;
                getInstance = i13 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i14 = i13 % 2;
                str = $$b(TextUtils.indexOf("", '0', 0) - 91, (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 1919299810, (byte) (107 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 2123613185 - TextUtils.lastIndexOf("", '0'), (short) (102 - TextUtils.indexOf("", "", 0, 0)));
            } else {
                str = $$b(ImageFormat.getBitsPerPixel(0) - 91, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1919299812, (byte) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 55), 2123613184 - TextUtils.indexOf("", '0'), (short) (KeyEvent.getDeadChar(0, 0) - 80));
            }
            sb3.append(str.intern());
            if (!(!valueOf($$b(-91 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1919300017 - PhoneNumberUtils.toaFromString(""), (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 9), 2123613233 - TextUtils.lastIndexOf("", '0', 0), (short) (TextUtils.getTrimmedLength("") + -29)).intern()))) {
                int i15 = getInstance + 45;
                getDataFormatter = i15 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i16 = i15 % 2;
                str2 = $$b((ViewConfiguration.getWindowTouchSlop() >> 8) - 92, AndroidCharacter.getMirror('0') + 12467, (byte) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 107), 2123613186 - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (102 - Color.alpha(0)));
            } else {
                str2 = $$b(-92 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1919299812, (byte) (-54 - TextUtils.getCapsMode("", 0, 0)), 2123613185 - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (-80 - Color.red(0)));
            }
            sb3.append(str2.intern());
            if (valueOf($$a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11, !URLUtil.isAboutUrl("about:"), TextUtils.lastIndexOf("", '0', 0, 0) + 283, "\u0011\u000e\b\u0003ￍ\r\u0004\u0013ￍ￴\u0011\b\u0000\r\u0003", AndroidCharacter.getEastAsianWidth('0') + 11).intern())) {
                int i17 = getDataFormatter + 31;
                getInstance = i17 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i18 = i17 % 2;
                $$b2 = $$b(TextUtils.getOffsetBefore("", 0) - 92, (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 1919299810, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 107), 2123613186 - (ViewConfiguration.getTapTimeout() >> 16), (short) (View.getDefaultSize(0, 0) + 102));
            } else {
                $$b2 = $$b(-92 - (Process.myTid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 1919299811, (byte) (-55 - TextUtils.indexOf("", '0', 0)), 2123613189 - AndroidCharacter.getEastAsianWidth('0'), (short) (-80 - View.resolveSize(0, 0)));
            }
            sb3.append($$b2.intern());
            String md5 = HashUtils.toMD5(HashUtils.toSha256(sb.toString()));
            String obj = sb2.toString();
            StringBuilder sb5 = new StringBuilder(md5);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb5.toString();
            String obj3 = sb3.toString();
            StringBuilder sb6 = new StringBuilder(obj2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return valueOf(sb6.toString(), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return $$b(-93 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), 1919299832 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (byte) (Color.alpha(0) - 73), TextUtils.lastIndexOf("", '0', 0, 0) + 2123613236, (short) (-65 - Color.green(0))).intern();
        }
    }

    private static String $$b(int i, int i2, byte b, int i3, short s) {
        boolean z;
        short s2;
        int i4;
        StringBuilder sb = new StringBuilder();
        int i5 = valueOf;
        int i6 = i + i5;
        int i7 = 0;
        if (i6 == -1) {
            int i8 = getDataFormatter + 15;
            getInstance = i8 % RecyclerView.C1119a0.FLAG_IGNORE;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = AFDateFormat;
            if ((bArr != null ? (char) 13 : 27) != 13) {
                i6 = (short) (AFDeepLinkManager[values + i2] + i5);
            } else {
                int i11 = getDataFormatter + 89;
                getInstance = i11 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i12 = i11 % 2;
                i6 = (byte) (bArr[values + i2] + i5);
            }
        }
        if ((i6 > 0 ? 23 : 'F') == 23) {
            int i13 = ((i2 + i6) - 2) + values;
            if (z) {
                int i14 = getDataFormatter + 35;
                getInstance = i14 % RecyclerView.C1119a0.FLAG_IGNORE;
                if ((i14 % 2 != 0 ? 14 : '?') == '?') {
                    i7 = 1;
                }
            }
            int i15 = i13 + i7;
            char c = (char) (i3 + $$a);
            sb.append(c);
            int i16 = 1;
            while (i16 < i6) {
                byte[] bArr2 = AFDateFormat;
                if ((bArr2 != null ? '/' : '\'') != '\'') {
                    int i17 = getInstance + 3;
                    getDataFormatter = i17 % RecyclerView.C1119a0.FLAG_IGNORE;
                    int i18 = i17 % 2;
                    i4 = i15 - 1;
                    s2 = (byte) (bArr2[i15] + s);
                } else {
                    i4 = i15 - 1;
                    s2 = (short) (AFDeepLinkManager[i15] + s);
                }
                c = (char) (c + (s2 ^ b));
                i15 = i4;
                sb.append(c);
                i16++;
                int i19 = getDataFormatter + 1;
                getInstance = i19 % RecyclerView.C1119a0.FLAG_IGNORE;
                int i21 = i19 % 2;
            }
        }
        return sb.toString();
    }

    private static boolean valueOf(String str) {
        int i = getInstance + 51;
        getDataFormatter = i % RecyclerView.C1119a0.FLAG_IGNORE;
        if (i % 2 == 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String valueOf(Context context) {
        int i = getDataFormatter + 41;
        getInstance = i % RecyclerView.C1119a0.FLAG_IGNORE;
        int i2 = i % 2;
        if ((System.getProperties().containsKey($$b((ViewConfiguration.getMinimumFlingVelocity() >> 16) + -92, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1919299910, (byte) (-72 - Color.green(0)), 2123613244 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (78 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).intern()) ? '*' : 20) == 20) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile($$a(PhoneNumberUtils.toaFromString("") - 125, TextUtils.regionMatches("", 0, "", 0, 0), TextUtils.indexOf("", '0') + 241, "%￸￳￷￲￳￷￱￳<", (ViewConfiguration.getPressedStateDuration() >> 16) + 10).intern()).matcher(context.getCacheDir().getPath().replace($$b((ViewConfiguration.getEdgeSlop() >> 16) - 92, TextUtils.indexOf("", "", 0, 0) + 1919299924, (byte) (101 - Color.red(0)), 2123613184 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (TextUtils.indexOf("", '0') + 126)).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            int i3 = getInstance + 55;
            getDataFormatter = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
            return i3 % 2 == 0 ? matcher.group(0) : matcher.group(1);
        } catch (Exception e) {
            C2069ad $$a2 = C2069ad.$$a();
            String intern = $$b(PhoneNumberUtils.toaFromString("") - 221, (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1919299929, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 26), TextUtils.lastIndexOf("", '0') + 2123613205, (short) (46 - ImageFormat.getBitsPerPixel(0))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append($$b(-92 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionChild(0) + 1919299948, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 122), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2123613206, (short) (TextUtils.lastIndexOf("", '0') - 5)).intern());
            sb.append(e);
            $$a2.AFDateFormat((String) null, intern, sb.toString());
            return null;
        }
    }

    private static String values(String str) {
        if ((!str.contains($$a((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), URLUtil.isHttpUrl(UrlPrivacyValidator.HTTP_SCHEME) ^ true, TextUtils.getOffsetAfter("", 0) + 231, "\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 1).intern()) ? 'Q' : 6) != 'Q') {
            String[] split = str.split($$b(Drawable.resolveOpacity(0, 0) - 92, Color.alpha(0) + 1919299908, (byte) ((Process.myPid() >> 22) - 21), 2123613229 - ExpandableListView.getPackedPositionType(0), (short) (View.MeasureSpec.getSize(0) + 18)).intern());
            int length = split.length;
            StringBuilder sb = new StringBuilder();
            int i = length - 1;
            sb.append(split[i]);
            sb.append($$a(1 - TextUtils.getTrimmedLength(""), !URLUtil.isAboutUrl("about:"), 230 - ExpandableListView.getPackedPositionChild(0), "\u0000", TextUtils.indexOf("", "", 0) + 1).intern());
            int i2 = 1;
            while (i2 < i) {
                int i3 = getDataFormatter + 71;
                getInstance = i3 % RecyclerView.C1119a0.FLAG_IGNORE;
                if (i3 % 2 == 0) {
                    sb.append(split[i2]);
                    sb.append($$a(Color.alpha(0) + 1, KeyEvent.isModifierKey(0), ExpandableListView.getPackedPositionChild(0) + 232, "\u0000", (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))).intern());
                    i2++;
                } else {
                    sb.append(split[i2]);
                    sb.append($$a(1 >> Color.alpha(1), KeyEvent.isModifierKey(1), 31244 - ExpandableListView.getPackedPositionChild(1), "\u0000", (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1))).intern());
                    i2 += 95;
                }
            }
            sb.append(split[0]);
            String obj = sb.toString();
            int i4 = getInstance + 109;
            getDataFormatter = i4 % RecyclerView.C1119a0.FLAG_IGNORE;
            if (i4 % 2 != 0) {
                return obj;
            }
            int i5 = 19 / 0;
            return obj;
        }
        int i6 = getInstance + 63;
        getDataFormatter = i6 % RecyclerView.C1119a0.FLAG_IGNORE;
        int i7 = i6 % 2;
        return str;
    }
}
