package p360ah;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.client.android.camera.open.CameraFacing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p385bh.C13625a;

/* renamed from: ah.b */
public final class C13462b {

    /* renamed from: a */
    public final Context f33317a;

    /* renamed from: b */
    public Point f33318b;

    /* renamed from: c */
    public Point f33319c;

    /* renamed from: d */
    public Point f33320d;

    /* renamed from: e */
    public Point f33321e;

    /* renamed from: f */
    public int f33322f;

    /* renamed from: ah.b$a */
    public class C13463a implements Comparator<Camera.Size> {
        public final int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            if (i2 > i) {
                return 1;
            }
            return 0;
        }
    }

    public C13462b(Context context) {
        this.f33317a = context;
    }

    /* renamed from: a */
    public static Point m33780a(Camera.Parameters parameters, Point point) {
        boolean z;
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            return new Point(previewSize.width, previewSize.height);
        }
        ArrayList arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new C13463a());
        if (Log.isLoggable("CameraConfiguration", 4)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = ((Camera.Size) it.next()).width;
            }
        }
        Point point2 = null;
        float f = ((float) point.x) / ((float) point.y);
        float f2 = Float.POSITIVE_INFINITY;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Camera.Size size = (Camera.Size) it2.next();
            int i4 = size.width;
            int i5 = size.height;
            int i6 = i4 * i5;
            if (i6 >= 150400 && i6 <= 921600) {
                if (i4 > i5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = i5;
                } else {
                    i = i4;
                }
                if (z) {
                    i2 = i4;
                } else {
                    i2 = i5;
                }
                if (i == point.x && i2 == point.y) {
                    Point point3 = new Point(i4, i5);
                    point3.toString();
                    return point3;
                }
                float abs = Math.abs((((float) i) / ((float) i2)) - f);
                if (abs < f2) {
                    point2 = new Point(i4, i5);
                    f2 = abs;
                }
            }
        }
        if (point2 == null) {
            Camera.Size previewSize2 = parameters.getPreviewSize();
            point2 = new Point(previewSize2.width, previewSize2.height);
            point2.toString();
        }
        point2.toString();
        return point2;
    }

    /* renamed from: b */
    public static String m33781b(List list, String... strArr) {
        Arrays.toString(strArr);
        Objects.toString(list);
        if (list == null) {
            return null;
        }
        for (String str : strArr) {
            if (list.contains(str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m33782e(boolean z, Camera camera) {
        String str;
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = m33781b(supportedFlashModes, "torch", "on");
        } else {
            str = m33781b(supportedFlashModes, "off");
        }
        if (str != null && !str.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(str);
        }
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f = BitmapDescriptorFactory.HUE_RED;
            if (exposureCompensationStep > BitmapDescriptorFactory.HUE_RED) {
                if (!z) {
                    f = 1.5f;
                }
                int max = Math.max(Math.min(Math.round(f / exposureCompensationStep), maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() != max) {
                    parameters.setExposureCompensation(max);
                }
            }
        }
        camera.setParameters(parameters);
    }

    /* renamed from: c */
    public final void mo40366c(C13625a aVar, int i, int i2) {
        int i3;
        boolean z;
        Camera.Parameters parameters = aVar.f33592b.getParameters();
        int rotation = ((WindowManager) this.f33317a.getSystemService("window")).getDefaultDisplay().getRotation();
        boolean z2 = true;
        if (rotation == 0) {
            i3 = 0;
        } else if (rotation == 1) {
            i3 = 90;
        } else if (rotation == 2) {
            i3 = 180;
        } else if (rotation == 3) {
            i3 = 270;
        } else if (rotation % 90 == 0) {
            i3 = (rotation + 360) % 360;
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("Bad rotation: ", rotation));
        }
        int i4 = aVar.f33594d;
        CameraFacing cameraFacing = aVar.f33593c;
        CameraFacing cameraFacing2 = CameraFacing.FRONT;
        if (cameraFacing == cameraFacing2) {
            i4 = (360 - i4) % 360;
        }
        int i5 = ((i4 + 360) - i3) % 360;
        this.f33322f = i5;
        if (cameraFacing == cameraFacing2) {
            int i6 = (360 - i5) % 360;
        }
        Point point = new Point(i, i2);
        this.f33318b = point;
        Objects.toString(point);
        Point a = m33780a(parameters, this.f33318b);
        this.f33319c = a;
        Objects.toString(a);
        Point a2 = m33780a(parameters, this.f33318b);
        this.f33320d = a2;
        Objects.toString(a2);
        Point point2 = this.f33318b;
        if (point2.x < point2.y) {
            z = true;
        } else {
            z = false;
        }
        Point point3 = this.f33320d;
        if (point3.x >= point3.y) {
            z2 = false;
        }
        if (z == z2) {
            this.f33321e = point3;
        } else {
            Point point4 = this.f33320d;
            this.f33321e = new Point(point4.y, point4.x);
        }
        Objects.toString(this.f33321e);
    }

    /* renamed from: d */
    public final void mo40367d(C13625a aVar, boolean z) {
        Camera camera = aVar.f33592b;
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null) {
            parameters.flatten();
            String str = null;
            if (!z) {
                str = m33781b(parameters.getSupportedFocusModes(), "auto");
            }
            if (str != null) {
                parameters.setFocusMode(str);
            }
            Point point = this.f33320d;
            parameters.setPreviewSize(point.x, point.y);
            camera.setParameters(parameters);
            camera.setDisplayOrientation(this.f33322f);
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            if (previewSize != null) {
                Point point2 = this.f33320d;
                int i = point2.x;
                int i2 = previewSize.width;
                if (i != i2 || point2.y != previewSize.height) {
                    int i3 = previewSize.height;
                    point2.x = i2;
                    point2.y = i3;
                }
            }
        }
    }
}
