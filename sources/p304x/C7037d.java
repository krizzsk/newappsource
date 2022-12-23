package p304x;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;
import java.util.concurrent.TimeUnit;
import p001a0.C0017h;
import p054d0.C4289j0;
import p066e0.C4428g;
import p066e0.C4450p0;

/* renamed from: x.d */
public final class C7037d implements C4428g {

    /* renamed from: a */
    public final C4450p0 f21891a;

    /* renamed from: b */
    public final CaptureResult f21892b;

    public C7037d(C4450p0 p0Var, CaptureResult captureResult) {
        this.f21891a = p0Var;
        this.f21892b = captureResult;
    }

    /* renamed from: a */
    public final void mo19949a(ExifData.C0599b bVar) {
        String str;
        Integer num;
        C0017h.m70e(this, bVar);
        Rect rect = (Rect) this.f21892b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.mo2510c("ImageWidth", String.valueOf(rect.width()), bVar.f2049a);
            bVar.mo2510c("ImageLength", String.valueOf(rect.height()), bVar.f2049a);
        }
        Integer num2 = (Integer) this.f21892b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.mo2511d(num2.intValue());
        }
        Long l = (Long) this.f21892b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.mo2510c("ExposureTime", String.valueOf(((double) l.longValue()) / ((double) TimeUnit.SECONDS.toNanos(1))), bVar.f2049a);
        }
        Float f = (Float) this.f21892b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.mo2510c("FNumber", String.valueOf(f.floatValue()), bVar.f2049a);
        }
        Integer num3 = (Integer) this.f21892b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f21892b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (((float) num.intValue()) / 100.0f)));
            }
            int intValue = num3.intValue();
            bVar.mo2510c("SensitivityType", String.valueOf(3), bVar.f2049a);
            bVar.mo2510c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), bVar.f2049a);
        }
        Float f2 = (Float) this.f21892b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.mo2510c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/" + 1000, bVar.f2049a);
        }
        Integer num4 = (Integer) this.f21892b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num4.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            int i = ExifData.C0598a.f2044b[whiteBalanceMode.ordinal()];
            if (i == 1) {
                str = String.valueOf(0);
            } else if (i != 2) {
                str = null;
            } else {
                str = String.valueOf(1);
            }
            bVar.mo2510c("WhiteBalance", str, bVar.f2049a);
        }
    }

    /* renamed from: b */
    public final CaptureResult mo19950b() {
        return this.f21892b;
    }

    /* renamed from: c */
    public final CameraCaptureMetaData$AeState mo23293c() {
        Integer num = (Integer) this.f21892b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C4289j0.m11435b("C2CameraCaptureResult");
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }

    /* renamed from: d */
    public final CameraCaptureMetaData$AfMode mo23294d() {
        Integer num = (Integer) this.f21892b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C4289j0.m11435b("C2CameraCaptureResult");
                return CameraCaptureMetaData$AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AfMode.OFF;
    }

    /* renamed from: e */
    public final CameraCaptureMetaData$AfState mo23295e() {
        Integer num = (Integer) this.f21892b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return CameraCaptureMetaData$AfState.INACTIVE;
            case 1:
            case 3:
                return CameraCaptureMetaData$AfState.SCANNING;
            case 2:
                return CameraCaptureMetaData$AfState.PASSIVE_FOCUSED;
            case 4:
                return CameraCaptureMetaData$AfState.LOCKED_FOCUSED;
            case 5:
                return CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED;
            default:
                C4289j0.m11435b("C2CameraCaptureResult");
                return CameraCaptureMetaData$AfState.UNKNOWN;
        }
    }

    /* renamed from: f */
    public final CameraCaptureMetaData$AwbState mo23296f() {
        Integer num = (Integer) this.f21892b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        C4289j0.m11435b("C2CameraCaptureResult");
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    public final CameraCaptureMetaData$FlashState getFlashState() {
        Integer num = (Integer) this.f21892b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        C4289j0.m11435b("C2CameraCaptureResult");
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    public final C4450p0 getTagBundle() {
        return this.f21891a;
    }

    public final long getTimestamp() {
        Long l = (Long) this.f21892b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }
}
