package mf0;

import ag0.C20989e;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.Html;
import android.text.Spanned;
import androidx.lifecycle.C1015i0;
import androidx.lifecycle.C1017j0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import androidx.recyclerview.widget.RecyclerView;
import bi0.C21079q;
import ce0.C21100e;
import cg0.C21154b;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wallet.WalletConstants;
import com.google.protobuf.ByteString;
import com.moovit.MoovitExecutors;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.app.tod.model.TodSubscriptionJourneyInfo;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.moovit.transit.LocationDescriptor;
import com.nutiteq.components.MapPos;
import com.usebutton.sdk.internal.api.AppActionRequest;
import hh0.C23500l;
import j20.C17706c;
import j20.C17708e;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kh0.C23791g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.text.C24179b;
import lh0.C24281l0;
import lh0.C24284n;
import lh0.C24287o0;
import lh0.C24298r;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mh0.C24378d;
import na0.C12930h;
import p001a0.C0017h;
import p025b6.C1487b;
import p060d6.C4383d;
import p084f6.C4687a;
import p129j1.C5348a;
import p172m9.C5720b;
import p227r.C6227a;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13821j;
import p434dd.C16579t;
import p581ji.C17854a;
import p583jk.C17875h;
import p627lg.C18209h;
import p658mo.C18408b;
import p798sn.C19493a;
import p801sq.C19519h;
import p824tp.C19728f;
import rf0.C24805g;
import rf0.C24806h;
import sf0.C24855b;
import ug0.C25065b;
import ug0.C25069e;
import uh0.C25081h;
import wf0.C25138b;
import wh0.C25232y0;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25442g;

/* renamed from: mf0.g */
public class C24361g implements C13821j, C16579t, C23500l, C4687a, C18408b, C13791f, C23791g {

    /* renamed from: b */
    public static final C21079q f61673b = new C21079q("NULL");

    /* renamed from: c */
    public static final C21079q f61674c = new C21079q("UNINITIALIZED");

    /* renamed from: d */
    public static final /* synthetic */ int f61675d = 0;

    /* renamed from: e */
    public static final C24361g f61676e = new C24361g();

    /* renamed from: f */
    public static final C24361g f61677f = new C24361g();

    /* renamed from: g */
    public static final int[][] f61678g;

    /* renamed from: h */
    public static final float[][] f61679h = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: i */
    public static final float[][] f61680i = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: j */
    public static final float[] f61681j = {95.047f, 100.0f, 108.883f};

    /* renamed from: k */
    public static final float[][] f61682k = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: l */
    public static final /* synthetic */ C24361g f61683l = new C24361g();

    /* renamed from: m */
    public static final byte[] f61684m = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: n */
    public static final int[] f61685n = {1, 2, 4, 8, 16, 32, 64, RecyclerView.C1119a0.FLAG_IGNORE, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    /* renamed from: o */
    public static final C24361g f61686o = new C24361g();

    static {
        int[] iArr = new int[RecyclerView.C1119a0.FLAG_IGNORE];
        // fill-array-data instruction
        iArr[0] = 521;
        iArr[1] = 310;
        iArr[2] = 864;
        iArr[3] = 547;
        iArr[4] = 858;
        iArr[5] = 580;
        iArr[6] = 296;
        iArr[7] = 379;
        iArr[8] = 53;
        iArr[9] = 779;
        iArr[10] = 897;
        iArr[11] = 444;
        iArr[12] = 400;
        iArr[13] = 925;
        iArr[14] = 749;
        iArr[15] = 415;
        iArr[16] = 822;
        iArr[17] = 93;
        iArr[18] = 217;
        iArr[19] = 208;
        iArr[20] = 928;
        iArr[21] = 244;
        iArr[22] = 583;
        iArr[23] = 620;
        iArr[24] = 246;
        iArr[25] = 148;
        iArr[26] = 447;
        iArr[27] = 631;
        iArr[28] = 292;
        iArr[29] = 908;
        iArr[30] = 490;
        iArr[31] = 704;
        iArr[32] = 516;
        iArr[33] = 258;
        iArr[34] = 457;
        iArr[35] = 907;
        iArr[36] = 594;
        iArr[37] = 723;
        iArr[38] = 674;
        iArr[39] = 292;
        iArr[40] = 272;
        iArr[41] = 96;
        iArr[42] = 684;
        iArr[43] = 432;
        iArr[44] = 686;
        iArr[45] = 606;
        iArr[46] = 860;
        iArr[47] = 569;
        iArr[48] = 193;
        iArr[49] = 219;
        iArr[50] = 129;
        iArr[51] = 186;
        iArr[52] = 236;
        iArr[53] = 287;
        iArr[54] = 192;
        iArr[55] = 775;
        iArr[56] = 278;
        iArr[57] = 173;
        iArr[58] = 40;
        iArr[59] = 379;
        iArr[60] = 712;
        iArr[61] = 463;
        iArr[62] = 646;
        iArr[63] = 776;
        iArr[64] = 171;
        iArr[65] = 491;
        iArr[66] = 297;
        iArr[67] = 763;
        iArr[68] = 156;
        iArr[69] = 732;
        iArr[70] = 95;
        iArr[71] = 270;
        iArr[72] = 447;
        iArr[73] = 90;
        iArr[74] = 507;
        iArr[75] = 48;
        iArr[76] = 228;
        iArr[77] = 821;
        iArr[78] = 808;
        iArr[79] = 898;
        iArr[80] = 784;
        iArr[81] = 663;
        iArr[82] = 627;
        iArr[83] = 378;
        iArr[84] = 382;
        iArr[85] = 262;
        iArr[86] = 380;
        iArr[87] = 602;
        iArr[88] = 754;
        iArr[89] = 336;
        iArr[90] = 89;
        iArr[91] = 614;
        iArr[92] = 87;
        iArr[93] = 432;
        iArr[94] = 670;
        iArr[95] = 616;
        iArr[96] = 157;
        iArr[97] = 374;
        iArr[98] = 242;
        iArr[99] = 726;
        iArr[100] = 600;
        iArr[101] = 269;
        iArr[102] = 375;
        iArr[103] = 898;
        iArr[104] = 845;
        iArr[105] = 454;
        iArr[106] = 354;
        iArr[107] = 130;
        iArr[108] = 814;
        iArr[109] = 587;
        iArr[110] = 804;
        iArr[111] = 34;
        iArr[112] = 211;
        iArr[113] = 330;
        iArr[114] = 539;
        iArr[115] = 297;
        iArr[116] = 827;
        iArr[117] = 865;
        iArr[118] = 37;
        iArr[119] = 517;
        iArr[120] = 834;
        iArr[121] = 315;
        iArr[122] = 550;
        iArr[123] = 86;
        iArr[124] = 801;
        iArr[125] = 4;
        iArr[126] = 108;
        iArr[127] = 539;
        f61678g = new int[][]{new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, iArr, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 41, 656, 505, 579, 481, 173, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 251, 688, 95, 497, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, Strategy.TTL_SECONDS_DEFAULT, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 389, 244, 31, 121, 303, 263}};
    }

    /* renamed from: A */
    public static Object[] m61131A(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArr3 = (Object[]) Array.newInstance(String.class, length + length2);
        for (int i = 0; i < length; i++) {
            objArr3[i] = objArr[i];
        }
        for (int i2 = 0; i2 < length2; i2++) {
            objArr3[length + i2] = objArr2[i2];
        }
        return objArr3;
    }

    /* renamed from: B */
    public static boolean m61132B(int[] iArr, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static Map m61133C(Map map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: D */
    public static void m61134D(StringBuilder sb, Object obj, HashMap hashMap) {
        if (obj == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else if (!obj.getClass().isArray()) {
            try {
                sb.append(obj.toString());
            } catch (Throwable th) {
                StringBuilder k = C13555b.m33972k("SLF4J: Failed toString() invocation on an object of type [");
                k.append(obj.getClass().getName());
                k.append("]");
                C24368m.m61233g(k.toString(), th);
                sb.append("[FAILED toString()]");
            }
        } else {
            int i = 0;
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                sb.append('[');
                int length = zArr.length;
                while (i < length) {
                    sb.append(zArr[i]);
                    if (i != length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                sb.append('[');
                int length2 = bArr.length;
                while (i < length2) {
                    sb.append(bArr[i]);
                    if (i != length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                sb.append('[');
                int length3 = cArr.length;
                while (i < length3) {
                    sb.append(cArr[i]);
                    if (i != length3 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                sb.append('[');
                int length4 = sArr.length;
                while (i < length4) {
                    sb.append(sArr[i]);
                    if (i != length4 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                sb.append('[');
                int length5 = iArr.length;
                while (i < length5) {
                    sb.append(iArr[i]);
                    if (i != length5 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                sb.append('[');
                int length6 = jArr.length;
                while (i < length6) {
                    sb.append(jArr[i]);
                    if (i != length6 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                sb.append('[');
                int length7 = fArr.length;
                while (i < length7) {
                    sb.append(fArr[i]);
                    if (i != length7 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                sb.append('[');
                int length8 = dArr.length;
                while (i < length8) {
                    sb.append(dArr[i]);
                    if (i != length8 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append(']');
            } else {
                Object[] objArr = (Object[]) obj;
                sb.append('[');
                if (!hashMap.containsKey(objArr)) {
                    hashMap.put(objArr, (Object) null);
                    int length9 = objArr.length;
                    while (i < length9) {
                        m61134D(sb, objArr[i], hashMap);
                        if (i != length9 - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                    hashMap.remove(objArr);
                } else {
                    sb.append("...");
                }
                sb.append(']');
            }
        }
    }

    /* renamed from: E */
    public static C1040t m61135E(C1043v vVar) {
        C1040t tVar = new C1040t();
        tVar.addSource(vVar, new C1017j0(tVar));
        return tVar;
    }

    /* renamed from: F */
    public static void m61136F(int i, byte[] bArr) {
        bArr[3] = -1;
        bArr[2] = (byte) Math.round(((float) (i & 31)) * 8.225806f);
        bArr[1] = (byte) Math.round(((float) ((i >> 5) & 63)) * 4.047619f);
        bArr[0] = (byte) Math.round(((float) ((i >> 11) & 31)) * 8.225806f);
    }

    /* renamed from: G */
    public static final boolean m61137G(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static String m61138H(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte d = byteString.mo43891d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (d >= 32 && d <= 126) {
                            sb.append((char) d);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: I */
    public static final String m61139I(String str) {
        C24362h.m61211f(str, "htmlString");
        return C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(str, "<ul>", "<p>", true), "</ul>", "</p>", true), "<li>", "&nbsp;&nbsp;•&nbsp;&nbsp;", true), "</li>", "<br/>", true);
    }

    /* renamed from: J */
    public static final C24855b m61140J(Annotation annotation) {
        C24362h.m61211f(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        C24362h.m61210e(annotationType, "this as java.lang.annota…otation).annotationType()");
        C24855b a = C24365j.m61219a(annotationType);
        C24362h.m61209d(a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a;
    }

    /* renamed from: K */
    public static final Object m61141K(KPropertyImpl.C23849a aVar) {
        C24362h.m61211f(aVar, "<this>");
        KPropertyImpl h = aVar.mo59327h();
        return C13637c.m34072l(h.f60260f, h.mo59298d());
    }

    /* renamed from: L */
    public static HashMap m61142L() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        HashMap hashMap2 = hashMap;
        ArrayList n = C13555b.m33974n(arrayList, "VI", 1, hashMap2, arrayList, 2);
        n.add("RU");
        n.add("KZ");
        hashMap.put(7, n);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, C25541a.m63888s(34, hashMap, C25541a.m63888s(33, hashMap, C25541a.m63888s(32, hashMap, C25541a.m63888s(31, hashMap, C25541a.m63888s(30, hashMap, C25541a.m63888s(27, hashMap, C25541a.m63888s(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, C25541a.m63888s(41, hashMap, C25541a.m63888s(40, hashMap, C25541a.m63888s(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, C25541a.m63888s(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, C25541a.m63888s(58, hashMap, C25541a.m63888s(57, hashMap, C25541a.m63888s(56, hashMap, C25541a.m63888s(55, hashMap, C25541a.m63888s(54, hashMap, C25541a.m63888s(53, hashMap, C25541a.m63888s(52, hashMap, C25541a.m63888s(51, hashMap, C25541a.m63888s(49, hashMap, C25541a.m63888s(48, hashMap, C25541a.m63888s(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList n2 = C13555b.m33974n(arrayList7, "CX", 61, hashMap2, arrayList7, 1);
        ArrayList n3 = C13555b.m33974n(n2, "ID", 62, hashMap2, n2, 1);
        ArrayList n4 = C13555b.m33974n(n3, "PH", 63, hashMap2, n3, 1);
        ArrayList n5 = C13555b.m33974n(n4, "NZ", 64, hashMap2, n4, 1);
        ArrayList n6 = C13555b.m33974n(n5, "SG", 65, hashMap2, n5, 1);
        ArrayList n7 = C13555b.m33974n(n6, "TH", 66, hashMap2, n6, 1);
        ArrayList n8 = C13555b.m33974n(n7, "JP", 81, hashMap2, n7, 1);
        ArrayList n9 = C13555b.m33974n(n8, "KR", 82, hashMap2, n8, 1);
        ArrayList n11 = C13555b.m33974n(n9, "VN", 84, hashMap2, n9, 1);
        ArrayList n12 = C13555b.m33974n(n11, "CN", 86, hashMap2, n11, 1);
        ArrayList n13 = C13555b.m33974n(n12, "TR", 90, hashMap2, n12, 1);
        ArrayList n14 = C13555b.m33974n(n13, "IN", 91, hashMap2, n13, 1);
        ArrayList n15 = C13555b.m33974n(n14, "PK", 92, hashMap2, n14, 1);
        ArrayList n16 = C13555b.m33974n(n15, "AF", 93, hashMap2, n15, 1);
        ArrayList n17 = C13555b.m33974n(n16, "LK", 94, hashMap2, n16, 1);
        ArrayList n18 = C13555b.m33974n(n17, "MM", 95, hashMap2, n17, 1);
        ArrayList n19 = C13555b.m33974n(n18, "IR", 98, hashMap2, n18, 1);
        ArrayList n21 = C13555b.m33974n(n19, "SS", 211, hashMap2, n19, 2);
        n21.add(RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        n21.add("EH");
        hashMap.put(212, n21);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, C25541a.m63888s(260, hashMap, C25541a.m63888s(258, hashMap, C25541a.m63888s(257, hashMap, C25541a.m63888s(256, hashMap, C25541a.m63888s(ValidationUtils.APPBOY_STRING_MAX_LENGTH, hashMap, C25541a.m63888s(254, hashMap, C25541a.m63888s(253, hashMap, C25541a.m63888s(252, hashMap, C25541a.m63888s(251, hashMap, C25541a.m63888s(250, hashMap, C25541a.m63888s(249, hashMap, C25541a.m63888s(248, hashMap, C25541a.m63888s(247, hashMap, C25541a.m63888s(246, hashMap, C25541a.m63888s(245, hashMap, C25541a.m63888s(244, hashMap, C25541a.m63888s(243, hashMap, C25541a.m63888s(242, hashMap, C25541a.m63888s(241, hashMap, C25541a.m63888s(240, hashMap, C25541a.m63888s(239, hashMap, C25541a.m63888s(238, hashMap, C25541a.m63888s(237, hashMap, C25541a.m63888s(236, hashMap, C25541a.m63888s(235, hashMap, C25541a.m63888s(234, hashMap, C25541a.m63888s(233, hashMap, C25541a.m63888s(232, hashMap, C25541a.m63888s(231, hashMap, C25541a.m63888s(230, hashMap, C25541a.m63888s(229, hashMap, C25541a.m63888s(228, hashMap, C25541a.m63888s(227, hashMap, C25541a.m63888s(226, hashMap, C25541a.m63888s(225, hashMap, C25541a.m63888s(224, hashMap, C25541a.m63888s(223, hashMap, C25541a.m63888s(222, hashMap, C25541a.m63888s(221, hashMap, C25541a.m63888s(220, hashMap, C25541a.m63888s(218, hashMap, C25541a.m63888s(216, hashMap, C25541a.m63888s(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, C25541a.m63888s(268, hashMap, C25541a.m63888s(267, hashMap, C25541a.m63888s(266, hashMap, C25541a.m63888s(265, hashMap, C25541a.m63888s(264, hashMap, C25541a.m63888s(263, hashMap, C25541a.m63888s(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, C25541a.m63888s(356, hashMap, C25541a.m63888s(355, hashMap, C25541a.m63888s(354, hashMap, C25541a.m63888s(353, hashMap, C25541a.m63888s(352, hashMap, C25541a.m63888s(351, hashMap, C25541a.m63888s(350, hashMap, C25541a.m63888s(299, hashMap, C25541a.m63888s(298, hashMap, C25541a.m63888s(297, hashMap, C25541a.m63888s(291, hashMap, C25541a.m63888s(290, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, C25541a.m63888s(508, hashMap, C25541a.m63888s(507, hashMap, C25541a.m63888s(506, hashMap, C25541a.m63888s(505, hashMap, C25541a.m63888s(504, hashMap, C25541a.m63888s(503, hashMap, C25541a.m63888s(502, hashMap, C25541a.m63888s(501, hashMap, C25541a.m63888s(500, hashMap, C25541a.m63888s(423, hashMap, C25541a.m63888s(421, hashMap, C25541a.m63888s(420, hashMap, C25541a.m63888s(389, hashMap, C25541a.m63888s(387, hashMap, C25541a.m63888s(386, hashMap, C25541a.m63888s(385, hashMap, C25541a.m63888s(383, hashMap, C25541a.m63888s(382, hashMap, C25541a.m63888s(381, hashMap, C25541a.m63888s(380, hashMap, C25541a.m63888s(378, hashMap, C25541a.m63888s(377, hashMap, C25541a.m63888s(376, hashMap, C25541a.m63888s(375, hashMap, C25541a.m63888s(374, hashMap, C25541a.m63888s(373, hashMap, C25541a.m63888s(372, hashMap, C25541a.m63888s(371, hashMap, C25541a.m63888s(370, hashMap, C25541a.m63888s(359, hashMap, C25541a.m63888s(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList n22 = C13555b.m33974n(arrayList12, "MF", 590, hashMap2, arrayList12, 1);
        ArrayList n23 = C13555b.m33974n(n22, "BO", 591, hashMap2, n22, 1);
        ArrayList n24 = C13555b.m33974n(n23, "GY", 592, hashMap2, n23, 1);
        ArrayList n25 = C13555b.m33974n(n24, "EC", 593, hashMap2, n24, 1);
        ArrayList n26 = C13555b.m33974n(n25, "GF", 594, hashMap2, n25, 1);
        ArrayList n27 = C13555b.m33974n(n26, "PY", 595, hashMap2, n26, 1);
        ArrayList n28 = C13555b.m33974n(n27, "MQ", 596, hashMap2, n27, 1);
        ArrayList n29 = C13555b.m33974n(n28, "SR", 597, hashMap2, n28, 1);
        ArrayList n31 = C13555b.m33974n(n29, "UY", 598, hashMap2, n29, 2);
        n31.add("CW");
        n31.add("BQ");
        hashMap.put(599, n31);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, C25541a.m63888s(996, hashMap, C25541a.m63888s(995, hashMap, C25541a.m63888s(994, hashMap, C25541a.m63888s(993, hashMap, C25541a.m63888s(992, hashMap, C25541a.m63888s(979, hashMap, C25541a.m63888s(977, hashMap, C25541a.m63888s(976, hashMap, C25541a.m63888s(975, hashMap, C25541a.m63888s(974, hashMap, C25541a.m63888s(973, hashMap, C25541a.m63888s(972, hashMap, C25541a.m63888s(971, hashMap, C25541a.m63888s(970, hashMap, C25541a.m63888s(968, hashMap, C25541a.m63888s(967, hashMap, C25541a.m63888s(966, hashMap, C25541a.m63888s(965, hashMap, C25541a.m63888s(964, hashMap, C25541a.m63888s(963, hashMap, C25541a.m63888s(962, hashMap, C25541a.m63888s(961, hashMap, C25541a.m63888s(960, hashMap, C25541a.m63888s(888, hashMap, C25541a.m63888s(886, hashMap, C25541a.m63888s(883, hashMap, C25541a.m63888s(882, hashMap, C25541a.m63888s(881, hashMap, C25541a.m63888s(880, hashMap, C25541a.m63888s(878, hashMap, C25541a.m63888s(870, hashMap, C25541a.m63888s(856, hashMap, C25541a.m63888s(855, hashMap, C25541a.m63888s(853, hashMap, C25541a.m63888s(852, hashMap, C25541a.m63888s(850, hashMap, C25541a.m63888s(808, hashMap, C25541a.m63888s(800, hashMap, C25541a.m63888s(692, hashMap, C25541a.m63888s(691, hashMap, C25541a.m63888s(690, hashMap, C25541a.m63888s(689, hashMap, C25541a.m63888s(688, hashMap, C25541a.m63888s(687, hashMap, C25541a.m63888s(686, hashMap, C25541a.m63888s(685, hashMap, C25541a.m63888s(683, hashMap, C25541a.m63888s(682, hashMap, C25541a.m63888s(681, hashMap, C25541a.m63888s(680, hashMap, C25541a.m63888s(679, hashMap, C25541a.m63888s(678, hashMap, C25541a.m63888s(677, hashMap, C25541a.m63888s(676, hashMap, C25541a.m63888s(675, hashMap, C25541a.m63888s(674, hashMap, C25541a.m63888s(673, hashMap, C25541a.m63888s(672, hashMap, C25541a.m63888s(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, RequestConfiguration.MAX_AD_CONTENT_RATING_PG), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    /* renamed from: M */
    public static C17854a m61143M(boolean z) {
        return new C17854a(f61684m, f61685n, z);
    }

    /* renamed from: N */
    public static final Class m61144N(C24855b bVar) {
        C24362h.m61211f(bVar, "<this>");
        Class<?> a = ((C24357c) bVar).mo59301a();
        C24362h.m61209d(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a;
    }

    /* renamed from: O */
    public static final Class m61145O(C24855b bVar) {
        C24362h.m61211f(bVar, "<this>");
        Class<?> a = ((C24357c) bVar).mo59301a();
        if (!a.isPrimitive()) {
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return a;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return a;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return a;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return a;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return a;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return a;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return a;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return a;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return a;
                }
                return Short.class;
            default:
                return a;
        }
    }

    /* renamed from: P */
    public static final Class m61146P(C24855b bVar) {
        C24362h.m61211f(bVar, "<this>");
        Class<?> a = ((C24357c) bVar).mo59301a();
        if (a.isPrimitive()) {
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    /* renamed from: Q */
    public static String m61147Q() {
        return C21100e.m49304E(new byte[]{84, 105, 99, 107, 101, 116, 70, 97, 99, 101, 46, 122, 105, 112});
    }

    /* renamed from: R */
    public static String m61148R(String str) {
        return C25541a.m63881k("@", str);
    }

    /* renamed from: S */
    public static int m61149S(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f61681j;
        return C5348a.m13408d((double) (f5 * fArr[0]), (double) (f3 * fArr[1]), (double) (f4 * fArr[2]));
    }

    /* renamed from: T */
    public static boolean m61150T(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public static final boolean m61151U(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        return vVar.mo60450R0() instanceof C24284n;
    }

    /* renamed from: V */
    public static final boolean m61152V(C25432c cVar) {
        C25065b bVar;
        LinkedHashSet linkedHashSet = C25138b.f63413a;
        if (C25260c.m63395l(cVar)) {
            LinkedHashSet linkedHashSet2 = C25138b.f63413a;
            C25065b f = DescriptorUtilsKt.m60285f(cVar);
            if (f == null) {
                bVar = null;
            } else {
                bVar = f.mo61573g();
            }
            if (C23825c.m58507d0(linkedHashSet2, bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m61153W(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static boolean m61154X(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* renamed from: Y */
    public static boolean m61155Y(C12930h[] hVarArr) {
        int i = 0;
        while (i < hVarArr.length) {
            C12930h hVar = hVarArr[((hVarArr.length + i) - 1) % hVarArr.length];
            C12930h hVar2 = hVarArr[i];
            i++;
            C12930h hVar3 = hVarArr[i % hVarArr.length];
            double d = hVar2.f32028a;
            double d2 = hVar3.f32029b;
            double d3 = hVar2.f32029b;
            double d4 = ((d2 - d3) * (d - hVar.f32028a)) - ((hVar3.f32028a - d) * (d3 - hVar.f32029b));
            if (d4 < 0.0d) {
                return true;
            }
            if (d4 > 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Z */
    public static final boolean m61156Z(Throwable th) {
        Class cls = th.getClass();
        while (!C24362h.m61206a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a0 */
    public static final boolean m61157a0(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: b0 */
    public static float m61158b0(int i) {
        float f = ((float) i) / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: c0 */
    public static C1040t m61159c0(C1043v vVar, C6227a aVar) {
        C1040t tVar = new C1040t();
        tVar.addSource(vVar, new C1015i0(tVar, aVar));
        return tVar;
    }

    /* renamed from: d0 */
    public static final Task m61160d0(Context context, C19728f fVar, LocationDescriptor locationDescriptor) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        if (locationDescriptor == null) {
            Task forResult = Tasks.forResult(null);
            C24362h.m61210e(forResult, "forResult(null)");
            return forResult;
        }
        Task addOnCompleteListener = Tasks.call(MoovitExecutors.f37327IO, new C17708e(context, fVar, locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener(new C19519h(locationDescriptor, 2));
        C24362h.m61210e(addOnCompleteListener, "call(\n\t\t\tMoovitExecutors…tSuggestion.subtitle\n\t\t\t}");
        return addOnCompleteListener;
    }

    /* renamed from: e0 */
    public static final ArrayList m61161e0(Context context, C19728f fVar, List list) {
        C24362h.m61211f(context, "appContext");
        C24362h.m61211f(list, "rides");
        ArrayList arrayList = new ArrayList(list.size() * 4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TodRideJourney todRideJourney = ((TodRide) it.next()).f40267e;
            C24362h.m61210e(todRideJourney, "ride.journey");
            arrayList.add(m61160d0(context, fVar, todRideJourney.f40284b));
            arrayList.add(m61160d0(context, fVar, todRideJourney.f40285c));
            arrayList.add(m61160d0(context, fVar, todRideJourney.f40286d));
            arrayList.add(m61160d0(context, fVar, todRideJourney.f40287e));
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public static final ArrayList m61162f0(Context context, C19728f fVar, List list) {
        C24362h.m61211f(context, "appContext");
        C24362h.m61211f(list, "subscriptions");
        ArrayList arrayList = new ArrayList(list.size() * 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TodSubscription todSubscription = (TodSubscription) it.next();
            if (todSubscription instanceof TodWeeklyShuttleSubscription) {
                TodSubscriptionJourneyInfo todSubscriptionJourneyInfo = ((TodWeeklyShuttleSubscription) todSubscription).f40330e.f40326f;
                LocationDescriptor locationDescriptor = todSubscriptionJourneyInfo.f40316b;
                LocationDescriptor locationDescriptor2 = todSubscriptionJourneyInfo.f40318d;
                arrayList.add(m61160d0(context, fVar, locationDescriptor));
                arrayList.add(m61160d0(context, fVar, locationDescriptor2));
            }
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static boolean m61163g0(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: h */
    public static /* synthetic */ void m61164h(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: h0 */
    public static C25069e m61165h0(C25069e eVar, String str, String str2, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        boolean z5 = false;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f63264c) {
            String g = eVar.mo61605g();
            C24362h.m61210e(g, "methodName.identifier");
            if (C25081h.m62835F(g, str) && g.length() != str.length()) {
                char charAt = g.charAt(str.length());
                if ('a' > charAt || charAt >= '{') {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (str2 != null) {
                        return C25069e.m62820i(C24362h.m61216k(C24179b.m60573U(str, g), str2));
                    }
                    if (!z) {
                        return eVar;
                    }
                    String U = C24179b.m60573U(str, g);
                    if (U.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && C17875h.m44279C(U, 0)) {
                        if (U.length() == 1 || !C17875h.m44279C(U, 1)) {
                            if (U.length() == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                char charAt2 = U.charAt(0);
                                if ('A' <= charAt2 && charAt2 < '[') {
                                    z5 = true;
                                }
                                if (z5) {
                                    char lowerCase = Character.toLowerCase(charAt2);
                                    String substring = U.substring(1);
                                    C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
                                    U = lowerCase + substring;
                                }
                            }
                        } else {
                            C24805g p = new C24806h(0, U.length() - 1).iterator();
                            while (true) {
                                if (!p.f62733d) {
                                    obj = null;
                                    break;
                                }
                                obj = p.next();
                                if (!C17875h.m44279C(U, ((Number) obj).intValue())) {
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            if (num == null) {
                                U = C17875h.m44295V(U);
                            } else {
                                int intValue = num.intValue() - 1;
                                String substring2 = U.substring(0, intValue);
                                C24362h.m61210e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                String V = C17875h.m44295V(substring2);
                                String substring3 = U.substring(intValue);
                                C24362h.m61210e(substring3, "this as java.lang.String).substring(startIndex)");
                                U = C24362h.m61216k(substring3, V);
                            }
                        }
                    }
                    if (C25069e.m62821j(U)) {
                        return C25069e.m62820i(U);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final uf0.C25032b m61166i(kotlin.reflect.jvm.internal.KPropertyImpl.C23849a r5, boolean r6) {
        /*
            kotlin.text.Regex r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.f60224b
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r5.mo59327h()
            java.lang.String r1 = r1.f60259e
            boolean r0 = r0.mo60283b(r1)
            if (r0 == 0) goto L_0x0012
            uf0.f r5 = uf0.C25063f.f63245a
            goto L_0x01e6
        L_0x0012:
            ug0.b r0 = tf0.C24978j.f63115a
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            zf0.z r0 = r0.mo59298d()
            tf0.b r0 = tf0.C24978j.m62672b(r0)
            boolean r1 = r0 instanceof tf0.C24962b.C24965c
            if (r1 == 0) goto L_0x015b
            tf0.b$c r0 = (tf0.C24962b.C24965c) r0
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r1 = r0.f63101c
            r2 = 0
            if (r6 == 0) goto L_0x0036
            boolean r3 = r1.mo59947s()
            if (r3 == 0) goto L_0x0041
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.mo59942m()
            goto L_0x0042
        L_0x0036:
            boolean r3 = r1.mo59948t()
            if (r3 == 0) goto L_0x0041
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r1.mo59943o()
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 != 0) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            kotlin.reflect.jvm.internal.KPropertyImpl r2 = r5.mo59327h()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2 = r2.f60257c
            sg0.c r3 = r0.f63102d
            int r4 = r1.mo59934i()
            java.lang.String r3 = r3.getString(r4)
            sg0.c r0 = r0.f63102d
            int r1 = r1.mo59933h()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r2 = r2.mo59317e(r3, r0)
        L_0x0063:
            if (r2 != 0) goto L_0x00fd
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            zf0.z r0 = r0.mo59298d()
            boolean r0 = xg0.C25261d.m63409d(r0)
            if (r0 == 0) goto L_0x00d9
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            zf0.z r0 = r0.mo59298d()
            zf0.n r0 = r0.mo53429g()
            zf0.m$g r1 = zf0.C25455m.f63743d
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 == 0) goto L_0x00d9
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r5.mo59327h()
            zf0.z r6 = r6.mo59298d()
            zf0.g r6 = r6.mo53399b()
            java.lang.Class r6 = p389bl.C13637c.m34057L(r6)
            if (r6 == 0) goto L_0x00bd
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            zf0.z r0 = r0.mo59298d()
            java.lang.reflect.Method r6 = p389bl.C13637c.m34079v(r6, r0)
            boolean r0 = r5.mo59300f()
            if (r0 == 0) goto L_0x00b6
            uf0.e$a r0 = new uf0.e$a
            java.lang.Object r1 = m61141K(r5)
            r0.<init>(r1, r6)
            goto L_0x018e
        L_0x00b6:
            uf0.e$b r0 = new uf0.e$b
            r0.<init>(r6)
            goto L_0x018e
        L_0x00bd:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = "Underlying property of inline class "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r5 = r5.mo59327h()
            r0.append(r5)
            java.lang.String r5 = " should have a field"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x00d9:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            tf0.i$b<java.lang.reflect.Field> r0 = r0.f60261g
            java.lang.Object r0 = r0.invoke()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L_0x00ed
            uf0.c r0 = m61196y(r5, r6, r0)
            goto L_0x018e
        L_0x00ed:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            kotlin.reflect.jvm.internal.KPropertyImpl r5 = r5.mo59327h()
            java.lang.String r0 = "No accessors or field is found for property "
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r0)
            r6.<init>(r5)
            throw r6
        L_0x00fd:
            int r6 = r2.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L_0x011f
            boolean r6 = r5.mo59300f()
            if (r6 == 0) goto L_0x0117
            uf0.c$g$a r6 = new uf0.c$g$a
            java.lang.Object r0 = m61141K(r5)
            r6.<init>(r0, r2)
            goto L_0x011c
        L_0x0117:
            uf0.c$g$d r6 = new uf0.c$g$d
            r6.<init>(r2)
        L_0x011c:
            r0 = r6
            goto L_0x018e
        L_0x011f:
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r5.mo59327h()
            zf0.z r6 = r6.mo59298d()
            ag0.e r6 = r6.getAnnotations()
            ug0.c r0 = tf0.C24979k.f63116a
            boolean r6 = r6.mo53070b1(r0)
            if (r6 == 0) goto L_0x0145
            boolean r6 = r5.mo59300f()
            if (r6 == 0) goto L_0x013f
            uf0.c$g$b r6 = new uf0.c$g$b
            r6.<init>(r2)
            goto L_0x011c
        L_0x013f:
            uf0.c$g$e r6 = new uf0.c$g$e
            r6.<init>(r2)
            goto L_0x011c
        L_0x0145:
            boolean r6 = r5.mo59300f()
            if (r6 == 0) goto L_0x0155
            uf0.c$g$c r6 = new uf0.c$g$c
            java.lang.Object r0 = m61141K(r5)
            r6.<init>(r0, r2)
            goto L_0x011c
        L_0x0155:
            uf0.c$g$f r6 = new uf0.c$g$f
            r6.<init>(r2)
            goto L_0x011c
        L_0x015b:
            boolean r1 = r0 instanceof tf0.C24962b.C24963a
            if (r1 == 0) goto L_0x0168
            tf0.b$a r0 = (tf0.C24962b.C24963a) r0
            java.lang.reflect.Field r0 = r0.f63096a
            uf0.c r0 = m61196y(r5, r6, r0)
            goto L_0x018e
        L_0x0168:
            boolean r1 = r0 instanceof tf0.C24962b.C24964b
            if (r1 == 0) goto L_0x01a6
            if (r6 == 0) goto L_0x0173
            tf0.b$b r0 = (tf0.C24962b.C24964b) r0
            java.lang.reflect.Method r6 = r0.f63097a
            goto L_0x0179
        L_0x0173:
            tf0.b$b r0 = (tf0.C24962b.C24964b) r0
            java.lang.reflect.Method r6 = r0.f63098b
            if (r6 == 0) goto L_0x0198
        L_0x0179:
            boolean r0 = r5.mo59300f()
            if (r0 == 0) goto L_0x0189
            uf0.c$g$a r0 = new uf0.c$g$a
            java.lang.Object r1 = m61141K(r5)
            r0.<init>(r1, r6)
            goto L_0x018e
        L_0x0189:
            uf0.c$g$d r0 = new uf0.c$g$d
            r0.<init>(r6)
        L_0x018e:
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r5.mo59341g()
            r6 = 0
            uf0.b r5 = p389bl.C13637c.m34075r(r0, r5, r6)
            goto L_0x01e6
        L_0x0198:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.reflect.Method r6 = r0.f63097a
            java.lang.String r0 = "No source found for setter of Java method property: "
            java.lang.String r6 = mf0.C24362h.m61216k(r6, r0)
            r5.<init>(r6)
            throw r5
        L_0x01a6:
            boolean r1 = r0 instanceof tf0.C24962b.C24966d
            if (r1 == 0) goto L_0x0207
            if (r6 == 0) goto L_0x01b1
            tf0.b$d r0 = (tf0.C24962b.C24966d) r0
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = r0.f63105a
            goto L_0x01b7
        L_0x01b1:
            tf0.b$d r0 = (tf0.C24962b.C24966d) r0
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = r0.f63106b
            if (r6 == 0) goto L_0x01f7
        L_0x01b7:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r5.mo59327h()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.f60257c
            tg0.d$b r6 = r6.f60202a
            java.lang.String r1 = r6.f63125a
            java.lang.String r6 = r6.f63126b
            java.lang.reflect.Method r6 = r0.mo59317e(r1, r6)
            if (r6 == 0) goto L_0x01e7
            int r0 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r5.mo59300f()
            if (r0 == 0) goto L_0x01e1
            uf0.c$g$a r0 = new uf0.c$g$a
            java.lang.Object r5 = m61141K(r5)
            r0.<init>(r5, r6)
            r5 = r0
            goto L_0x01e6
        L_0x01e1:
            uf0.c$g$d r5 = new uf0.c$g$d
            r5.<init>(r6)
        L_0x01e6:
            return r5
        L_0x01e7:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            kotlin.reflect.jvm.internal.KPropertyImpl r5 = r5.mo59327h()
            java.lang.String r0 = "No accessor found for property "
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r0)
            r6.<init>(r5)
            throw r6
        L_0x01f7:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            kotlin.reflect.jvm.internal.KPropertyImpl r5 = r5.mo59327h()
            java.lang.String r0 = "No setter found for property "
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r0)
            r6.<init>(r5)
            throw r6
        L_0x0207:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24361g.m61166i(kotlin.reflect.jvm.internal.KPropertyImpl$a, boolean):uf0.b");
    }

    /* renamed from: i0 */
    public static final C24312z m61167i0(C24312z zVar, List list, C20989e eVar) {
        C24362h.m61211f(zVar, "<this>");
        C24362h.m61211f(list, "newArguments");
        C24362h.m61211f(eVar, "newAnnotations");
        if (list.isEmpty() && eVar == zVar.getAnnotations()) {
            return zVar;
        }
        if (list.isEmpty()) {
            return zVar.mo59561U0(eVar);
        }
        return KotlinTypeFactory.m60477f(eVar, zVar.mo60411O0(), list, zVar.mo60412P0(), (C24378d) null);
    }

    /* renamed from: j */
    public static final void m61168j(Object obj, AbstractCollection abstractCollection) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    /* renamed from: j0 */
    public static C24307v m61169j0(C24307v vVar, List<C24281l0> list, C20989e eVar, int i) {
        List<C24281l0> list2;
        if ((i & 1) != 0) {
            list = vVar.mo60410N0();
        }
        if ((i & 2) != 0) {
            eVar = vVar.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        } else {
            list2 = null;
        }
        C24362h.m61211f(vVar, "<this>");
        C24362h.m61211f(list, "newArguments");
        C24362h.m61211f(eVar, "newAnnotations");
        C24362h.m61211f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == vVar.mo60410N0()) && eVar == vVar.getAnnotations()) {
            return vVar;
        }
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            C24298r rVar = (C24298r) R0;
            return KotlinTypeFactory.m60474c(m61167i0(rVar.f61594c, list, eVar), m61167i0(rVar.f61595d, list2, eVar));
        } else if (R0 instanceof C24312z) {
            return m61167i0((C24312z) R0, list, eVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public static final C24312z m61170k(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C24306u0 R0 = vVar.mo60450R0();
        C24312z zVar = R0 instanceof C24312z ? (C24312z) R0 : null;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException(C24362h.m61216k(vVar, "This is should be simple type: ").toString());
    }

    /* renamed from: k0 */
    public static /* synthetic */ C24312z m61171k0(C24312z zVar, List<C24281l0> list, C20989e eVar, int i) {
        if ((i & 1) != 0) {
            list = zVar.mo60410N0();
        }
        if ((i & 2) != 0) {
            eVar = zVar.getAnnotations();
        }
        return m61167i0(zVar, list, eVar);
    }

    /* renamed from: l */
    public static final void m61172l(CoroutineContext coroutineContext, CancellationException cancellationException) {
        int i = C25232y0.f63505j0;
        C25232y0 y0Var = (C25232y0) coroutineContext.mo53081c(C25232y0.C25234b.f63506b);
        if (y0Var != null) {
            y0Var.mo61776a(cancellationException);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m61173l0(lh0.C24307v r4) {
        /*
            lh0.i0 r0 = r4.mo60411O0()
            zf0.e r0 = r0.mo53460o()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0028
        L_0x000d:
            boolean r3 = xg0.C25261d.m63407b(r0)
            if (r3 == 0) goto L_0x0023
            zf0.c r0 = (zf0.C25432c) r0
            ug0.c r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r0)
            ug0.c r3 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60326e
            boolean r0 = mf0.C24362h.m61206a(r0, r3)
            if (r0 != 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r1) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 != 0) goto L_0x004b
            lh0.i0 r4 = r4.mo60411O0()
            zf0.e r4 = r4.mo53460o()
            boolean r0 = r4 instanceof zf0.C25448i0
            if (r0 == 0) goto L_0x003a
            zf0.i0 r4 = (zf0.C25448i0) r4
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x0047
        L_0x003f:
            lh0.v r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60523h(r4)
            boolean r4 = m61173l0(r4)
        L_0x0047:
            if (r4 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24361g.m61173l0(lh0.v):boolean");
    }

    /* renamed from: m0 */
    public static TypeSubstitutor m61174m0(List list, C24287o0 o0Var, C25442g gVar, List list2) {
        if (o0Var == null) {
            m61164h(1);
            throw null;
        } else if (gVar == null) {
            m61164h(2);
            throw null;
        } else if (list2 != null) {
            TypeSubstitutor n0 = m61176n0(list, o0Var, gVar, list2, (boolean[]) null);
            if (n0 != null) {
                return n0;
            }
            throw new AssertionError("Substitution failed");
        } else {
            m61164h(3);
            throw null;
        }
    }

    /* renamed from: n */
    public static void m61175n(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1 A[SYNTHETIC] */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor m61176n0(java.util.List r17, lh0.C24287o0 r18, zf0.C25442g r19, java.util.List r20, boolean[] r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = 6
            r3 = 0
            if (r0 == 0) goto L_0x00ea
            if (r19 == 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00df
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Iterator r13 = r17.iterator()
            r14 = 0
            r9 = 0
        L_0x001c:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r13.next()
            r15 = r4
            zf0.i0 r15 = (zf0.C25448i0) r15
            ag0.e r5 = r15.getAnnotations()
            boolean r6 = r15.mo53484y()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = r15.mo53482l()
            ug0.e r8 = r15.getName()
            int r16 = r9 + 1
            kh0.h r10 = r15.mo53477P()
            r4 = r19
            cg0.k0 r4 = cg0.C21180k0.m49654Q0(r4, r5, r6, r7, r8, r9, r10)
            lh0.i0 r5 = r15.mo53481j()
            lh0.n0 r6 = new lh0.n0
            lh0.z r7 = r4.mo53412q()
            r6.<init>(r7)
            r11.put(r5, r6)
            r12.put(r15, r4)
            r1.add(r4)
            r9 = r16
            goto L_0x001c
        L_0x005e:
            lh0.k0$a r1 = lh0.C24278k0.f61571b
            lh0.j0 r1 = new lh0.j0
            r1.<init>(r11, r14)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60495f(r0, r1)
            lh0.p0 r5 = new lh0.p0
            r5.<init>(r0)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60495f(r5, r1)
            java.util.Iterator r1 = r17.iterator()
        L_0x0076:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r1.next()
            zf0.i0 r5 = (zf0.C25448i0) r5
            java.lang.Object r6 = r12.get(r5)
            cg0.k0 r6 = (cg0.C21180k0) r6
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r5 = r5.iterator()
        L_0x0090:
            boolean r7 = r5.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x00d8
            java.lang.Object r7 = r5.next()
            lh0.v r7 = (lh0.C24307v) r7
            lh0.i0 r9 = r7.mo60411O0()
            zf0.e r9 = r9.mo53460o()
            boolean r10 = r9 instanceof zf0.C25448i0
            if (r10 == 0) goto L_0x00b8
            zf0.i0 r9 = (zf0.C25448i0) r9
            java.lang.String r10 = "typeParameter"
            mf0.C24362h.m61211f(r9, r10)
            boolean r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60525j(r9, r3, r2)
            if (r9 == 0) goto L_0x00b8
            r9 = r4
            goto L_0x00b9
        L_0x00b8:
            r9 = r0
        L_0x00b9:
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            lh0.v r9 = r9.mo60251k(r7, r10)
            if (r9 != 0) goto L_0x00c2
            return r3
        L_0x00c2:
            if (r9 == r7) goto L_0x00c8
            if (r21 == 0) goto L_0x00c8
            r21[r14] = r8
        L_0x00c8:
            r6.mo53502P0()
            boolean r7 = p389bl.C13637c.m34082y(r9)
            if (r7 == 0) goto L_0x00d2
            goto L_0x0090
        L_0x00d2:
            java.util.ArrayList r7 = r6.f53086m
            r7.add(r9)
            goto L_0x0090
        L_0x00d8:
            r6.mo53502P0()
            r6.f53087n = r8
            goto L_0x0076
        L_0x00de:
            return r4
        L_0x00df:
            r0 = 8
            m61164h(r0)
            throw r3
        L_0x00e5:
            r0 = 7
            m61164h(r0)
            throw r3
        L_0x00ea:
            m61164h(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24361g.m61176n0(java.util.List, lh0.o0, zf0.g, java.util.List, boolean[]):kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor");
    }

    /* renamed from: o */
    public static void m61177o(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: o0 */
    public static boolean m61178o0(MapPos[] mapPosArr, MapPos[] mapPosArr2) {
        boolean z;
        float f;
        boolean z2;
        MapPos[] mapPosArr3 = mapPosArr;
        MapPos[] mapPosArr4 = mapPosArr2;
        int i = 0;
        while (true) {
            if (i >= mapPosArr3.length) {
                break;
            }
            MapPos mapPos = mapPosArr3[((mapPosArr3.length + i) - 1) % mapPosArr3.length];
            MapPos mapPos2 = mapPosArr3[i];
            i++;
            MapPos mapPos3 = mapPosArr3[i % mapPosArr3.length];
            double d = mapPos2.f24175b;
            double d2 = mapPos3.f24176c;
            double d3 = mapPos2.f24176c;
            double d4 = ((d2 - d3) * (d - mapPos.f24175b)) - ((mapPos3.f24175b - d) * (d3 - mapPos.f24176c));
            if (d4 >= 0.0d) {
                if (d4 > 0.0d) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        int i2 = 0;
        while (i2 < mapPosArr3.length) {
            MapPos mapPos4 = mapPosArr3[i2];
            i2++;
            MapPos mapPos5 = mapPosArr3[i2 % mapPosArr3.length];
            int i3 = 0;
            while (true) {
                if (i3 >= mapPosArr4.length) {
                    z2 = false;
                    continue;
                    break;
                }
                MapPos mapPos6 = mapPosArr4[i3];
                double d5 = mapPos5.f24175b;
                double d6 = mapPos4.f24175b;
                double d7 = mapPos6.f24176c;
                double d8 = mapPos4.f24176c;
                f = f;
                if (((double) f) * (((d7 - d8) * (d5 - d6)) - ((mapPos6.f24175b - d6) * (mapPos5.f24176c - d8))) >= 0.0d) {
                    z2 = true;
                    continue;
                    break;
                }
                i3++;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m61179p(int i, int i2, String str, int i3) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: p0 */
    public static boolean m61180p0(C12930h[] hVarArr, C12930h[] hVarArr2) {
        float f;
        int i;
        C12930h[] hVarArr3 = hVarArr;
        C12930h[] hVarArr4 = hVarArr2;
        if (m61155Y(hVarArr)) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= hVarArr3.length) {
                return true;
            }
            C12930h hVar = hVarArr3[i2];
            int i3 = i2 + 1;
            C12930h hVar2 = hVarArr3[i3 % hVarArr3.length];
            int i4 = 0;
            while (true) {
                if (i4 >= hVarArr4.length) {
                    i = i3;
                    z = false;
                    break;
                }
                C12930h hVar3 = hVarArr4[i4];
                double d = hVar2.f32028a;
                double d2 = hVar.f32028a;
                double d3 = hVar3.f32029b;
                i = i3;
                double d4 = hVar.f32029b;
                if (((double) f) * (((d3 - d4) * (d - d2)) - ((hVar3.f32028a - d2) * (hVar2.f32029b - d4))) >= 0.0d) {
                    break;
                }
                i4++;
                i3 = i;
            }
            if (!z) {
                return false;
            }
            i2 = i;
        }
    }

    /* renamed from: q */
    public static void m61181q(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: q0 */
    public static String[] m61182q0(List list) {
        return (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: r */
    public static int m61183r(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return m61187t(Binder.getCallingPid(), Binder.getCallingUid(), context, str, str2);
    }

    /* renamed from: r0 */
    public static int[] m61184r0(List list) {
        if (list == null) {
            return null;
        }
        int[] iArr = new int[list.size()];
        int i = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: s */
    public static void m61185s(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* renamed from: s0 */
    public static final Spanned m61186s0(String str) {
        C24362h.m61211f(str, "$this$toSpannedHtml");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned b = Html.fromHtml(m61139I(str), 0);
            C24362h.m61210e(b, "Html.fromHtml(fixList(th…ml.FROM_HTML_MODE_LEGACY)");
            return b;
        }
        Spanned fromHtml = Html.fromHtml(m61139I(str));
        C24362h.m61210e(fromHtml, "Html.fromHtml(fixList(this))");
        return fromHtml;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m61187t(int r5, int r6, android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r5 = r7.checkPermission(r8, r5, r6)
            r0 = -1
            if (r5 != r0) goto L_0x0008
            return r0
        L_0x0008:
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r5 < r1) goto L_0x0013
            java.lang.String r8 = p067e1.C4488h.m11713d(r8)
            goto L_0x0014
        L_0x0013:
            r8 = 0
        L_0x0014:
            r2 = 0
            if (r8 != 0) goto L_0x0018
            return r2
        L_0x0018:
            if (r9 != 0) goto L_0x002c
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            java.lang.String[] r9 = r9.getPackagesForUid(r6)
            if (r9 == 0) goto L_0x002b
            int r3 = r9.length
            if (r3 > 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r9 = r9[r2]
            goto L_0x002c
        L_0x002b:
            return r0
        L_0x002c:
            int r0 = android.os.Process.myUid()
            java.lang.String r3 = r7.getPackageName()
            r4 = 1
            if (r0 != r6) goto L_0x003f
            boolean r0 = p229r1.C6232b.m14816a(r3, r9)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x006d
            r0 = 29
            if (r5 < r0) goto L_0x005e
            android.app.AppOpsManager r5 = p067e1.C4492i.m11718c(r7)
            int r0 = android.os.Binder.getCallingUid()
            int r9 = p067e1.C4492i.m11716a(r5, r8, r0, r9)
            if (r9 == 0) goto L_0x0055
            goto L_0x007c
        L_0x0055:
            java.lang.String r7 = p067e1.C4492i.m11717b(r7)
            int r9 = p067e1.C4492i.m11716a(r5, r8, r6, r7)
            goto L_0x007c
        L_0x005e:
            if (r5 < r1) goto L_0x007b
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.Object r5 = p067e1.C4488h.m11710a(r7, r5)
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
            int r4 = p067e1.C4488h.m11712c(r5, r8, r9)
            goto L_0x007b
        L_0x006d:
            if (r5 < r1) goto L_0x007b
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.Object r5 = p067e1.C4488h.m11710a(r7, r5)
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
            int r4 = p067e1.C4488h.m11712c(r5, r8, r9)
        L_0x007b:
            r9 = r4
        L_0x007c:
            if (r9 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r2 = -2
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24361g.m61187t(int, int, android.content.Context, java.lang.String, java.lang.String):int");
    }

    /* renamed from: t0 */
    public static final Class m61188t0(ClassLoader classLoader, String str) {
        C24362h.m61211f(classLoader, "<this>");
        C24362h.m61211f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static final void m61189u(int i) {
        if (!new C24806h(2, 36).mo61258s(i)) {
            StringBuilder r = C25541a.m63887r("radix ", i, " was not in valid range ");
            r.append(new C24806h(2, 36));
            throw new IllegalArgumentException(r.toString());
        }
    }

    /* renamed from: u0 */
    public static float m61190u0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* renamed from: v */
    public static int m61191v(Context context, String str) {
        return m61187t(Process.myPid(), Process.myUid(), context, str, context.getPackageName());
    }

    /* renamed from: v0 */
    public static String m61192v0(String str, String str2) {
        return C13715c.m34245k(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* renamed from: w */
    public static void m61193w(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: w0 */
    public static String m61194w0(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        C0017h.m61R(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: x */
    public static final List m61195x(ArrayList arrayList) {
        C24362h.m61211f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.f60173b;
        }
        if (size == 1) {
            return C17875h.m44280D(C23825c.m58513j0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final uf0.C25034c m61196y(kotlin.reflect.jvm.internal.KPropertyImpl.C23849a r3, boolean r4, java.lang.reflect.Field r5) {
        /*
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r3.mo59327h()
            zf0.z r0 = r0.mo59298d()
            zf0.g r1 = r0.mo53399b()
            java.lang.String r2 = "containingDeclaration"
            mf0.C24362h.m61210e(r1, r2)
            boolean r2 = xg0.C25260c.m63395l(r1)
            if (r2 != 0) goto L_0x0018
            goto L_0x003c
        L_0x0018:
            zf0.g r1 = r1.mo53399b()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            boolean r2 = xg0.C25260c.m63397n(r1, r2)
            if (r2 != 0) goto L_0x002c
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            boolean r1 = xg0.C25260c.m63397n(r1, r2)
            if (r1 == 0) goto L_0x003a
        L_0x002c:
            boolean r1 = r0 instanceof jh0.C23733g
            if (r1 == 0) goto L_0x003c
            jh0.g r0 = (jh0.C23733g) r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.f59941A
            boolean r0 = tg0.C24991g.m62701d(r0)
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 != 0) goto L_0x009f
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x009f
        L_0x004a:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r3.mo59327h()
            zf0.z r0 = r0.mo59298d()
            ag0.e r0 = r0.getAnnotations()
            ug0.c r1 = tf0.C24979k.f63116a
            boolean r0 = r0.mo53070b1(r1)
            if (r0 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x0073
            boolean r3 = r3.mo59300f()
            if (r3 == 0) goto L_0x006d
            uf0.c$e$b r3 = new uf0.c$e$b
            r3.<init>(r5)
            goto L_0x00d5
        L_0x006d:
            uf0.c$e$d r3 = new uf0.c$e$d
            r3.<init>(r5)
            goto L_0x00d5
        L_0x0073:
            boolean r4 = r3.mo59300f()
            if (r4 == 0) goto L_0x0083
            uf0.c$f$b r4 = new uf0.c$f$b
            boolean r3 = m61197z(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x0083:
            uf0.c$f$d r4 = new uf0.c$f$d
            boolean r3 = m61197z(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x008d:
            if (r4 == 0) goto L_0x0095
            uf0.c$e$e r3 = new uf0.c$e$e
            r3.<init>(r5)
            goto L_0x00d5
        L_0x0095:
            uf0.c$f$e r4 = new uf0.c$f$e
            boolean r3 = m61197z(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x009f:
            if (r4 == 0) goto L_0x00b7
            boolean r4 = r3.mo59300f()
            if (r4 == 0) goto L_0x00b1
            uf0.c$e$a r4 = new uf0.c$e$a
            java.lang.Object r3 = m61141K(r3)
            r4.<init>(r5, r3)
            goto L_0x00d4
        L_0x00b1:
            uf0.c$e$c r3 = new uf0.c$e$c
            r3.<init>(r5)
            goto L_0x00d5
        L_0x00b7:
            boolean r4 = r3.mo59300f()
            if (r4 == 0) goto L_0x00cb
            uf0.c$f$a r4 = new uf0.c$f$a
            boolean r0 = m61197z(r3)
            java.lang.Object r3 = m61141K(r3)
            r4.<init>(r5, r0, r3)
            goto L_0x00d4
        L_0x00cb:
            uf0.c$f$c r4 = new uf0.c$f$c
            boolean r3 = m61197z(r3)
            r4.<init>(r5, r3)
        L_0x00d4:
            r3 = r4
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24361g.m61196y(kotlin.reflect.jvm.internal.KPropertyImpl$a, boolean, java.lang.reflect.Field):uf0.c");
    }

    /* renamed from: z */
    public static final boolean m61197z(KPropertyImpl.C23849a aVar) {
        return !C24299r0.m60975g(aVar.mo59327h().mo59298d().getType());
    }

    /* renamed from: a */
    public void mo58617a(CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "descriptor");
        throw new IllegalStateException(C24362h.m61216k(callableMemberDescriptor, "Cannot infer visibility for "));
    }

    /* renamed from: b */
    public void mo50863b(Context context, C19493a aVar) {
        C24362h.m61211f(context, "<anonymous parameter 0>");
        C24362h.m61211f(aVar, "<anonymous parameter 1>");
    }

    /* renamed from: c */
    public File mo20207c(C1487b bVar) {
        return null;
    }

    public void clear() {
    }

    /* renamed from: d */
    public Object[] mo49356d(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) C5720b.m14046N(obj, "makePathElements", List.class, arrayList, File.class, file, List.class, arrayList2);
    }

    /* renamed from: e */
    public void mo20209e(C1487b bVar, C4383d dVar) {
    }

    /* renamed from: f */
    public void mo58618f(C21154b bVar, ArrayList arrayList) {
        C24362h.m61211f(bVar, "descriptor");
        StringBuilder k = C13555b.m33972k("Incomplete hierarchy for class ");
        k.append(bVar.getName());
        k.append(", unresolved classes ");
        k.append(arrayList);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new LinkedHashMap();
    }

    public void lock() {
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C18209h();
    }

    public void unlock() {
    }
}
