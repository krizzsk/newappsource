package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0018\u00002\u00020\u0001Bå\u0003\u0012\b\b\u0002\u0010F\u001a\u00020\b\u0012\b\b\u0002\u0010G\u001a\u00020\b\u0012\b\b\u0002\u0010H\u001a\u00020\b\u0012\b\b\u0002\u0010I\u001a\u00020\b\u0012\b\b\u0002\u0010J\u001a\u00020\b\u0012\b\b\u0002\u0010K\u001a\u00020\b\u0012\b\b\u0002\u0010L\u001a\u00020\b\u0012\b\b\u0002\u0010M\u001a\u00020\b\u0012\b\b\u0002\u0010N\u001a\u00020\b\u0012\b\b\u0002\u0010O\u001a\u00020\b\u0012\b\b\u0002\u0010P\u001a\u00020\b\u0012\b\b\u0002\u0010Q\u001a\u00020\b\u0012\b\b\u0002\u0010R\u001a\u00020\b\u0012\b\b\u0002\u0010S\u001a\u00020\b\u0012\b\b\u0002\u0010T\u001a\u00020\b\u0012\b\b\u0002\u0010U\u001a\u00020\b\u0012\b\b\u0002\u0010V\u001a\u00020\b\u0012\b\b\u0002\u0010W\u001a\u00020\b\u0012\b\b\u0002\u0010X\u001a\u00020\b\u0012\b\b\u0002\u0010Y\u001a\u00020\b\u0012\b\b\u0002\u0010Z\u001a\u00020\u001d\u0012\b\b\u0002\u0010[\u001a\u00020\u001d\u0012\b\b\u0002\u0010\\\u001a\u00020\u001d\u0012\b\b\u0002\u0010]\u001a\u00020\u0004\u0012\b\b\u0002\u0010^\u001a\u00020\u001d\u0012\b\b\u0002\u0010_\u001a\u00020\u0004\u0012\b\b\u0002\u0010`\u001a\u00020\u001d\u0012\b\b\u0002\u0010a\u001a\u00020\u001d\u0012\b\b\u0002\u0010b\u001a\u00020\u001d\u0012\b\b\u0002\u0010c\u001a\u00020\u0004\u0012\b\b\u0002\u0010d\u001a\u00020\u0004\u0012\b\b\u0002\u0010e\u001a\u00020\u0004\u0012\b\b\u0002\u0010f\u001a\u00020\u001d\u0012\b\b\u0002\u0010g\u001a\u00020\u0004\u0012\b\b\u0002\u0010h\u001a\u00020\u001d\u0012\b\b\u0002\u0010i\u001a\u00020.\u0012\b\b\u0002\u0010j\u001a\u000200\u0012\b\b\u0002\u0010k\u001a\u000202\u0012\b\b\u0002\u0010l\u001a\u000204\u0012\u000e\b\u0002\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000207\u0012\b\b\u0002\u0010n\u001a\u00020\u001d\u0012\b\b\u0002\u0010o\u001a\u00020:\u0012\b\b\u0002\u0010p\u001a\u00020:\u0012\b\b\u0002\u0010q\u001a\u00020\u0004\u0012\b\b\u0002\u0010r\u001a\u00020\b\u0012\b\b\u0002\u0010s\u001a\u00020\b\u0012\b\b\u0002\u0010t\u001a\u00020\u0004¢\u0006\u0006\b·\u0001\u0010¸\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\t\u0010\u001f\u001a\u00020\u001dHÆ\u0003J\t\u0010 \u001a\u00020\u001dHÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u001dHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u001dHÆ\u0003J\t\u0010%\u001a\u00020\u001dHÆ\u0003J\t\u0010&\u001a\u00020\u001dHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u001dHÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u001dHÆ\u0003J\t\u0010/\u001a\u00020.HÆ\u0003J\t\u00101\u001a\u000200HÆ\u0003J\t\u00103\u001a\u000202HÆ\u0003J\t\u00105\u001a\u000204HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000207HÆ\u0003J\t\u00109\u001a\u00020\u001dHÆ\u0003J\t\u0010;\u001a\u00020:HÆ\u0003J\t\u0010<\u001a\u00020:HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003Jå\u0003\u0010u\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020\b2\b\b\u0002\u0010G\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020\b2\b\b\u0002\u0010I\u001a\u00020\b2\b\b\u0002\u0010J\u001a\u00020\b2\b\b\u0002\u0010K\u001a\u00020\b2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010M\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\b2\b\b\u0002\u0010P\u001a\u00020\b2\b\b\u0002\u0010Q\u001a\u00020\b2\b\b\u0002\u0010R\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020\b2\b\b\u0002\u0010T\u001a\u00020\b2\b\b\u0002\u0010U\u001a\u00020\b2\b\b\u0002\u0010V\u001a\u00020\b2\b\b\u0002\u0010W\u001a\u00020\b2\b\b\u0002\u0010X\u001a\u00020\b2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\u001d2\b\b\u0002\u0010[\u001a\u00020\u001d2\b\b\u0002\u0010\\\u001a\u00020\u001d2\b\b\u0002\u0010]\u001a\u00020\u00042\b\b\u0002\u0010^\u001a\u00020\u001d2\b\b\u0002\u0010_\u001a\u00020\u00042\b\b\u0002\u0010`\u001a\u00020\u001d2\b\b\u0002\u0010a\u001a\u00020\u001d2\b\b\u0002\u0010b\u001a\u00020\u001d2\b\b\u0002\u0010c\u001a\u00020\u00042\b\b\u0002\u0010d\u001a\u00020\u00042\b\b\u0002\u0010e\u001a\u00020\u00042\b\b\u0002\u0010f\u001a\u00020\u001d2\b\b\u0002\u0010g\u001a\u00020\u00042\b\b\u0002\u0010h\u001a\u00020\u001d2\b\b\u0002\u0010i\u001a\u00020.2\b\b\u0002\u0010j\u001a\u0002002\b\b\u0002\u0010k\u001a\u0002022\b\b\u0002\u0010l\u001a\u0002042\u000e\b\u0002\u0010m\u001a\b\u0012\u0004\u0012\u00020\u0002072\b\b\u0002\u0010n\u001a\u00020\u001d2\b\b\u0002\u0010o\u001a\u00020:2\b\b\u0002\u0010p\u001a\u00020:2\b\b\u0002\u0010q\u001a\u00020\u00042\b\b\u0002\u0010r\u001a\u00020\b2\b\b\u0002\u0010s\u001a\u00020\b2\b\b\u0002\u0010t\u001a\u00020\u0004HÆ\u0001R\u0017\u0010L\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010l\u001a\u0002048\u0006¢\u0006\f\n\u0004\bl\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010o\u001a\u00020:8\u0006¢\u0006\u000e\n\u0004\bo\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010n\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010p\u001a\u00020:8\u0006¢\u0006\u000e\n\u0004\bp\u0010\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010M\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bM\u0010v\u001a\u0005\b\u0001\u0010xR\u001a\u0010i\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\bi\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010h\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bh\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010g\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\bg\u0010|\u001a\u0005\b\u0001\u0010~R\u001a\u0010f\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bf\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010Y\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bY\u0010v\u001a\u0005\b\u0001\u0010xR\u001a\u0010j\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\bj\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010[\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\b[\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010Z\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bZ\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010S\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bS\u0010v\u001a\u0005\b\u0001\u0010xR\u0018\u0010V\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bV\u0010v\u001a\u0005\b\u0001\u0010xR\u0018\u0010J\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bJ\u0010v\u001a\u0005\b\u0001\u0010xR\u0018\u0010K\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bK\u0010v\u001a\u0005\b\u0001\u0010xR\u0018\u0010]\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b]\u0010|\u001a\u0005\b\u0001\u0010~R\u001a\u0010\\\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\b\\\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010P\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bP\u0010v\u001a\u0005\b\u0001\u0010xR\u0018\u0010W\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bW\u0010v\u001a\u0005\b\u0001\u0010xR\u001a\u0010^\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\b^\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010e\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\be\u0010|\u001a\u0005\b\u0001\u0010~R\u0018\u0010d\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\bd\u0010|\u001a\u0005\b\u0001\u0010~R\u0018\u0010c\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\bc\u0010|\u001a\u0005\b\u0001\u0010~R\u001a\u0010a\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\ba\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010b\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bb\u0010\u0001\u001a\u0006\b \u0001\u0010\u0001R\u0018\u0010Q\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bQ\u0010v\u001a\u0005\b¡\u0001\u0010xR\u0018\u0010R\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bR\u0010v\u001a\u0005\b¢\u0001\u0010xR\u0018\u0010_\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b_\u0010|\u001a\u0005\b£\u0001\u0010~R\u001a\u0010`\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\b`\u0010\u0001\u001a\u0006\b¤\u0001\u0010\u0001R \u0010m\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0006¢\u0006\u000f\n\u0005\bm\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010T\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bT\u0010v\u001a\u0005\b¨\u0001\u0010xR\u0018\u0010r\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\br\u0010v\u001a\u0005\b©\u0001\u0010xR\u0018\u0010s\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bs\u0010v\u001a\u0005\bª\u0001\u0010xR\u0018\u0010t\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\bt\u0010|\u001a\u0005\b«\u0001\u0010~R\u0018\u0010H\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bH\u0010v\u001a\u0005\b¬\u0001\u0010xR\u0018\u0010I\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bI\u0010v\u001a\u0005\b­\u0001\u0010xR\u0018\u0010O\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bO\u0010v\u001a\u0005\b®\u0001\u0010xR\u0018\u0010U\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bU\u0010v\u001a\u0005\b¯\u0001\u0010xR\u0018\u0010X\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bX\u0010v\u001a\u0005\b°\u0001\u0010xR\u001a\u0010k\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\bk\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0018\u0010F\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bF\u0010v\u001a\u0005\b´\u0001\u0010xR\u0018\u0010G\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bG\u0010v\u001a\u0005\bµ\u0001\u0010xR\u0018\u0010N\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bN\u0010v\u001a\u0005\b¶\u0001\u0010x¨\u0006¹\u0001"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/FeatureFlags;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "Lcom/veriff/sdk/internal/data/Resolution;", "component36", "", "component37", "Lcom/veriff/sdk/internal/data/VideoConfig;", "component38", "Lcom/veriff/sdk/internal/data/AudioConfig;", "component39", "component4", "", "component40", "component41", "", "component42", "component43", "component44", "component45", "component46", "component47", "component5", "component6", "component7", "component8", "component9", "video_enabled", "video_required", "portrait_document", "portrait_document_video_failure", "inflow_feedback_dark_room", "inflow_feedback_face_detection", "android_picture_resolution_1100", "barcode_picture", "whitelabel_enabled", "portrait_picture", "leave_user_waiting_decision", "nfc_enabled", "nfc_required", "disable_document_pictures", "no_intro_screen_android", "sdk_ui_customization_enabled", "hide_language_change_temp_android", "merged_ui_temp_android", "selfie_auto_capture_temp_android", "capture_hud_dev_android", "decision_step_delay_ms", "decision_check_delay_ms", "inflow_timeout_ms", "inflow_retry_count", "mrz_timeout_ms", "nfc_scan_retry_count", "nfc_scan_timeout_ms", "nfc_connect_time_min_threshold_ms", "nfc_connection_lost_delay_ms", "nfc_chunk_size_min", "nfc_chunk_size_max", "nfc_chunk_size_default", "barcode_scan_timeout_ms", "barcode_scan_retry_count", "barcode_result_delay_ms", "barcode_resolution", "dark_room_threshold_android", "video_config_android", "audio_config_android", "nfc_supported_countries", "autocapture_manual_fallback_timeout_ms", "autocapture_face_translation_error", "autocapture_min_face_size", "autocapture_face_orientation_error", "poa_enable_liveness_android", "poa_enable_multi_files_android", "poa_file_max_size_mb_android", "copy", "Z", "getAndroid_picture_resolution_1100", "()Z", "Lcom/veriff/sdk/internal/data/AudioConfig;", "getAudio_config_android", "()Lcom/veriff/sdk/internal/data/AudioConfig;", "I", "getAutocapture_face_orientation_error", "()I", "F", "getAutocapture_face_translation_error", "()F", "J", "getAutocapture_manual_fallback_timeout_ms", "()J", "getAutocapture_min_face_size", "getBarcode_picture", "Lcom/veriff/sdk/internal/data/Resolution;", "getBarcode_resolution", "()Lcom/veriff/sdk/internal/data/Resolution;", "getBarcode_result_delay_ms", "getBarcode_scan_retry_count", "getBarcode_scan_timeout_ms", "getCapture_hud_dev_android", "D", "getDark_room_threshold_android", "()D", "getDecision_check_delay_ms", "getDecision_step_delay_ms", "getDisable_document_pictures", "getHide_language_change_temp_android", "getInflow_feedback_dark_room", "getInflow_feedback_face_detection", "getInflow_retry_count", "getInflow_timeout_ms", "getLeave_user_waiting_decision", "getMerged_ui_temp_android", "getMrz_timeout_ms", "getNfc_chunk_size_default", "getNfc_chunk_size_max", "getNfc_chunk_size_min", "getNfc_connect_time_min_threshold_ms", "getNfc_connection_lost_delay_ms", "getNfc_enabled", "getNfc_required", "getNfc_scan_retry_count", "getNfc_scan_timeout_ms", "Ljava/util/List;", "getNfc_supported_countries", "()Ljava/util/List;", "getNo_intro_screen_android", "getPoa_enable_liveness_android", "getPoa_enable_multi_files_android", "getPoa_file_max_size_mb_android", "getPortrait_document", "getPortrait_document_video_failure", "getPortrait_picture", "getSdk_ui_customization_enabled", "getSelfie_auto_capture_temp_android", "Lcom/veriff/sdk/internal/data/VideoConfig;", "getVideo_config_android", "()Lcom/veriff/sdk/internal/data/VideoConfig;", "getVideo_enabled", "getVideo_required", "getWhitelabel_enabled", "<init>", "(ZZZZZZZZZZZZZZZZZZZZJJJIJIJJJIIIJIJLcom/veriff/sdk/internal/data/Resolution;DLcom/veriff/sdk/internal/data/VideoConfig;Lcom/veriff/sdk/internal/data/AudioConfig;Ljava/util/List;JFFIZZI)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ix */
public final class C21789ix implements Parcelable {
    public static final Parcelable.Creator<C21789ix> CREATOR = new C21790a();

    /* renamed from: A */
    private final long f55135A;

    /* renamed from: B */
    private final long f55136B;

    /* renamed from: C */
    private final long f55137C;

    /* renamed from: D */
    private final int f55138D;

    /* renamed from: E */
    private final int f55139E;

    /* renamed from: F */
    private final int f55140F;

    /* renamed from: G */
    private final long f55141G;

    /* renamed from: H */
    private final int f55142H;

    /* renamed from: I */
    private final long f55143I;

    /* renamed from: J */
    private final C21886js f55144J;

    /* renamed from: K */
    private final double f55145K;

    /* renamed from: L */
    private final C21903ka f55146L;

    /* renamed from: M */
    private final C21787iw f55147M;

    /* renamed from: N */
    private final List<String> f55148N;

    /* renamed from: O */
    private final long f55149O;

    /* renamed from: P */
    private final float f55150P;

    /* renamed from: Q */
    private final float f55151Q;

    /* renamed from: R */
    private final int f55152R;

    /* renamed from: S */
    private final boolean f55153S;

    /* renamed from: T */
    private final boolean f55154T;

    /* renamed from: U */
    private final int f55155U;

    /* renamed from: a */
    private final boolean f55156a;

    /* renamed from: b */
    private final boolean f55157b;

    /* renamed from: c */
    private final boolean f55158c;

    /* renamed from: d */
    private final boolean f55159d;

    /* renamed from: e */
    private final boolean f55160e;

    /* renamed from: f */
    private final boolean f55161f;

    /* renamed from: g */
    private final boolean f55162g;

    /* renamed from: h */
    private final boolean f55163h;

    /* renamed from: i */
    private final boolean f55164i;

    /* renamed from: j */
    private final boolean f55165j;

    /* renamed from: k */
    private final boolean f55166k;

    /* renamed from: l */
    private final boolean f55167l;

    /* renamed from: m */
    private final boolean f55168m;

    /* renamed from: n */
    private final boolean f55169n;

    /* renamed from: o */
    private final boolean f55170o;

    /* renamed from: p */
    private final boolean f55171p;

    /* renamed from: q */
    private final boolean f55172q;

    /* renamed from: r */
    private final boolean f55173r;

    /* renamed from: s */
    private final boolean f55174s;

    /* renamed from: t */
    private final boolean f55175t;

    /* renamed from: u */
    private final long f55176u;

    /* renamed from: v */
    private final long f55177v;

    /* renamed from: w */
    private final long f55178w;

    /* renamed from: x */
    private final int f55179x;

    /* renamed from: y */
    private final long f55180y;

    /* renamed from: z */
    private final int f55181z;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ix$a */
    public static class C21790a implements Parcelable.Creator<C21789ix> {
        /* renamed from: a */
        public final C21789ix createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C24362h.m61211f(parcel2, "in");
            return new C21789ix(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), (C21886js) Enum.valueOf(C21886js.class, parcel.readString()), parcel.readDouble(), C21903ka.CREATOR.createFromParcel(parcel2), C21787iw.CREATOR.createFromParcel(parcel2), parcel.createStringArrayList(), parcel.readLong(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        /* renamed from: a */
        public final C21789ix[] newArray(int i) {
            return new C21789ix[i];
        }
    }

    public C21789ix() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (C21886js) null, 0.0d, (C21903ka) null, (C21787iw) null, (List) null, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, false, false, 0, -1, 32767, (DefaultConstructorMarker) null);
    }

    public C21789ix(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, long j, long j2, long j3, int i, long j4, int i2, long j5, long j6, long j7, int i3, int i4, int i5, long j8, int i6, long j9, C21886js jsVar, double d, C21903ka kaVar, C21787iw iwVar, List<String> list, long j10, float f, float f2, int i7, boolean z23, boolean z24, int i8) {
        C21886js jsVar2 = jsVar;
        C21903ka kaVar2 = kaVar;
        C21787iw iwVar2 = iwVar;
        List<String> list2 = list;
        C24362h.m61211f(jsVar2, "barcode_resolution");
        C24362h.m61211f(kaVar2, "video_config_android");
        C24362h.m61211f(iwVar2, "audio_config_android");
        C24362h.m61211f(list2, "nfc_supported_countries");
        this.f55156a = z;
        this.f55157b = z2;
        this.f55158c = z3;
        this.f55159d = z4;
        this.f55160e = z5;
        this.f55161f = z6;
        this.f55162g = z7;
        this.f55163h = z8;
        this.f55164i = z9;
        this.f55165j = z11;
        this.f55166k = z12;
        this.f55167l = z13;
        this.f55168m = z14;
        this.f55169n = z15;
        this.f55170o = z16;
        this.f55171p = z17;
        this.f55172q = z18;
        this.f55173r = z19;
        this.f55174s = z21;
        this.f55175t = z22;
        this.f55176u = j;
        this.f55177v = j2;
        this.f55178w = j3;
        this.f55179x = i;
        this.f55180y = j4;
        this.f55181z = i2;
        this.f55135A = j5;
        this.f55136B = j6;
        this.f55137C = j7;
        this.f55138D = i3;
        this.f55139E = i4;
        this.f55140F = i5;
        this.f55141G = j8;
        this.f55142H = i6;
        this.f55143I = j9;
        this.f55144J = jsVar2;
        this.f55145K = d;
        this.f55146L = kaVar2;
        this.f55147M = iwVar2;
        this.f55148N = list2;
        this.f55149O = j10;
        this.f55150P = f;
        this.f55151Q = f2;
        this.f55152R = i7;
        this.f55153S = z23;
        this.f55154T = z24;
        this.f55155U = i8;
    }

    /* renamed from: A */
    public final long mo55424A() {
        return this.f55135A;
    }

    /* renamed from: B */
    public final long mo55425B() {
        return this.f55136B;
    }

    /* renamed from: C */
    public final long mo55426C() {
        return this.f55137C;
    }

    /* renamed from: D */
    public final int mo55427D() {
        return this.f55138D;
    }

    /* renamed from: E */
    public final int mo55428E() {
        return this.f55139E;
    }

    /* renamed from: F */
    public final int mo55429F() {
        return this.f55140F;
    }

    /* renamed from: G */
    public final long mo55430G() {
        return this.f55141G;
    }

    /* renamed from: H */
    public final int mo55431H() {
        return this.f55142H;
    }

    /* renamed from: I */
    public final long mo55432I() {
        return this.f55143I;
    }

    /* renamed from: J */
    public final C21886js mo55433J() {
        return this.f55144J;
    }

    /* renamed from: K */
    public final double mo55434K() {
        return this.f55145K;
    }

    /* renamed from: L */
    public final C21903ka mo55435L() {
        return this.f55146L;
    }

    /* renamed from: M */
    public final C21787iw mo55436M() {
        return this.f55147M;
    }

    /* renamed from: N */
    public final List<String> mo55437N() {
        return this.f55148N;
    }

    /* renamed from: O */
    public final long mo55438O() {
        return this.f55149O;
    }

    /* renamed from: P */
    public final float mo55439P() {
        return this.f55150P;
    }

    /* renamed from: Q */
    public final float mo55440Q() {
        return this.f55151Q;
    }

    /* renamed from: R */
    public final int mo55441R() {
        return this.f55152R;
    }

    /* renamed from: S */
    public final boolean mo55442S() {
        return this.f55153S;
    }

    /* renamed from: T */
    public final boolean mo55443T() {
        return this.f55154T;
    }

    /* renamed from: U */
    public final int mo55444U() {
        return this.f55155U;
    }

    /* renamed from: a */
    public final C21789ix mo55445a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, long j, long j2, long j3, int i, long j4, int i2, long j5, long j6, long j7, int i3, int i4, int i5, long j8, int i6, long j9, C21886js jsVar, double d, C21903ka kaVar, C21787iw iwVar, List<String> list, long j10, float f, float f2, int i7, boolean z23, boolean z24, int i8) {
        boolean z25 = z;
        C24362h.m61211f(jsVar, "barcode_resolution");
        C24362h.m61211f(kaVar, "video_config_android");
        C24362h.m61211f(iwVar, "audio_config_android");
        C24362h.m61211f(list, "nfc_supported_countries");
        return new C21789ix(z, z2, z3, z4, z5, z6, z7, z8, z9, z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, j, j2, j3, i, j4, i2, j5, j6, j7, i3, i4, i5, j8, i6, j9, jsVar, d, kaVar, iwVar, list, j10, f, f2, i7, z23, z24, i8);
    }

    /* renamed from: a */
    public final boolean mo55446a() {
        return this.f55156a;
    }

    /* renamed from: b */
    public final boolean mo55447b() {
        return this.f55157b;
    }

    /* renamed from: c */
    public final boolean mo55448c() {
        return this.f55158c;
    }

    /* renamed from: d */
    public final boolean mo55449d() {
        return this.f55159d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo55451e() {
        return this.f55160e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21789ix)) {
            return false;
        }
        C21789ix ixVar = (C21789ix) obj;
        return this.f55156a == ixVar.f55156a && this.f55157b == ixVar.f55157b && this.f55158c == ixVar.f55158c && this.f55159d == ixVar.f55159d && this.f55160e == ixVar.f55160e && this.f55161f == ixVar.f55161f && this.f55162g == ixVar.f55162g && this.f55163h == ixVar.f55163h && this.f55164i == ixVar.f55164i && this.f55165j == ixVar.f55165j && this.f55166k == ixVar.f55166k && this.f55167l == ixVar.f55167l && this.f55168m == ixVar.f55168m && this.f55169n == ixVar.f55169n && this.f55170o == ixVar.f55170o && this.f55171p == ixVar.f55171p && this.f55172q == ixVar.f55172q && this.f55173r == ixVar.f55173r && this.f55174s == ixVar.f55174s && this.f55175t == ixVar.f55175t && this.f55176u == ixVar.f55176u && this.f55177v == ixVar.f55177v && this.f55178w == ixVar.f55178w && this.f55179x == ixVar.f55179x && this.f55180y == ixVar.f55180y && this.f55181z == ixVar.f55181z && this.f55135A == ixVar.f55135A && this.f55136B == ixVar.f55136B && this.f55137C == ixVar.f55137C && this.f55138D == ixVar.f55138D && this.f55139E == ixVar.f55139E && this.f55140F == ixVar.f55140F && this.f55141G == ixVar.f55141G && this.f55142H == ixVar.f55142H && this.f55143I == ixVar.f55143I && C24362h.m61206a(this.f55144J, ixVar.f55144J) && Double.compare(this.f55145K, ixVar.f55145K) == 0 && C24362h.m61206a(this.f55146L, ixVar.f55146L) && C24362h.m61206a(this.f55147M, ixVar.f55147M) && C24362h.m61206a(this.f55148N, ixVar.f55148N) && this.f55149O == ixVar.f55149O && Float.compare(this.f55150P, ixVar.f55150P) == 0 && Float.compare(this.f55151Q, ixVar.f55151Q) == 0 && this.f55152R == ixVar.f55152R && this.f55153S == ixVar.f55153S && this.f55154T == ixVar.f55154T && this.f55155U == ixVar.f55155U;
    }

    /* renamed from: f */
    public final boolean mo55453f() {
        return this.f55161f;
    }

    /* renamed from: g */
    public final boolean mo55454g() {
        return this.f55162g;
    }

    /* renamed from: h */
    public final boolean mo55455h() {
        return this.f55163h;
    }

    public int hashCode() {
        boolean z = this.f55156a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f55157b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f55158c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f55159d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f55160e;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f55161f;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f55162g;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f55163h;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z11 = this.f55164i;
        if (z11) {
            z11 = true;
        }
        int i9 = (i8 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f55165j;
        if (z12) {
            z12 = true;
        }
        int i11 = (i9 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f55166k;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f55167l;
        if (z14) {
            z14 = true;
        }
        int i13 = (i12 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.f55168m;
        if (z15) {
            z15 = true;
        }
        int i14 = (i13 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.f55169n;
        if (z16) {
            z16 = true;
        }
        int i15 = (i14 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.f55170o;
        if (z17) {
            z17 = true;
        }
        int i16 = (i15 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.f55171p;
        if (z18) {
            z18 = true;
        }
        int i17 = (i16 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.f55172q;
        if (z19) {
            z19 = true;
        }
        int i18 = (i17 + (z19 ? 1 : 0)) * 31;
        boolean z21 = this.f55173r;
        if (z21) {
            z21 = true;
        }
        int i19 = (i18 + (z21 ? 1 : 0)) * 31;
        boolean z22 = this.f55174s;
        if (z22) {
            z22 = true;
        }
        int i21 = (i19 + (z22 ? 1 : 0)) * 31;
        boolean z23 = this.f55175t;
        if (z23) {
            z23 = true;
        }
        long j = this.f55176u;
        long j2 = this.f55177v;
        long j3 = this.f55178w;
        long j4 = this.f55180y;
        long j5 = this.f55135A;
        long j6 = this.f55136B;
        long j7 = this.f55137C;
        long j8 = this.f55141G;
        long j9 = this.f55143I;
        int i22 = (((((((((((((((((((((((((((((((i21 + (z23 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f55179x) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f55181z) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f55138D) * 31) + this.f55139E) * 31) + this.f55140F) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f55142H) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        C21886js jsVar = this.f55144J;
        int i23 = 0;
        int hashCode = jsVar != null ? jsVar.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f55145K);
        int i24 = (((i22 + hashCode) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        C21903ka kaVar = this.f55146L;
        int hashCode2 = (i24 + (kaVar != null ? kaVar.hashCode() : 0)) * 31;
        C21787iw iwVar = this.f55147M;
        int hashCode3 = (hashCode2 + (iwVar != null ? iwVar.hashCode() : 0)) * 31;
        List<String> list = this.f55148N;
        if (list != null) {
            i23 = list.hashCode();
        }
        long j10 = this.f55149O;
        int floatToIntBits = (((Float.floatToIntBits(this.f55151Q) + ((Float.floatToIntBits(this.f55150P) + ((((hashCode3 + i23) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31) + this.f55152R) * 31;
        boolean z24 = this.f55153S;
        if (z24) {
            z24 = true;
        }
        int i25 = (floatToIntBits + (z24 ? 1 : 0)) * 31;
        boolean z25 = this.f55154T;
        if (!z25) {
            z2 = z25;
        }
        return ((i25 + (z2 ? 1 : 0)) * 31) + this.f55155U;
    }

    /* renamed from: i */
    public final boolean mo55457i() {
        return this.f55164i;
    }

    /* renamed from: j */
    public final boolean mo55458j() {
        return this.f55165j;
    }

    /* renamed from: k */
    public final boolean mo55459k() {
        return this.f55166k;
    }

    /* renamed from: l */
    public final boolean mo55460l() {
        return this.f55167l;
    }

    /* renamed from: m */
    public final boolean mo55461m() {
        return this.f55168m;
    }

    /* renamed from: n */
    public final boolean mo55462n() {
        return this.f55169n;
    }

    /* renamed from: o */
    public final boolean mo55463o() {
        return this.f55170o;
    }

    /* renamed from: p */
    public final boolean mo55464p() {
        return this.f55171p;
    }

    /* renamed from: q */
    public final boolean mo55465q() {
        return this.f55172q;
    }

    /* renamed from: r */
    public final boolean mo55466r() {
        return this.f55173r;
    }

    /* renamed from: s */
    public final boolean mo55467s() {
        return this.f55174s;
    }

    /* renamed from: t */
    public final boolean mo55468t() {
        return this.f55175t;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("FeatureFlags(video_enabled=");
        k.append(this.f55156a);
        k.append(", video_required=");
        k.append(this.f55157b);
        k.append(", portrait_document=");
        k.append(this.f55158c);
        k.append(", portrait_document_video_failure=");
        k.append(this.f55159d);
        k.append(", inflow_feedback_dark_room=");
        k.append(this.f55160e);
        k.append(", inflow_feedback_face_detection=");
        k.append(this.f55161f);
        k.append(", android_picture_resolution_1100=");
        k.append(this.f55162g);
        k.append(", barcode_picture=");
        k.append(this.f55163h);
        k.append(", whitelabel_enabled=");
        k.append(this.f55164i);
        k.append(", portrait_picture=");
        k.append(this.f55165j);
        k.append(", leave_user_waiting_decision=");
        k.append(this.f55166k);
        k.append(", nfc_enabled=");
        k.append(this.f55167l);
        k.append(", nfc_required=");
        k.append(this.f55168m);
        k.append(", disable_document_pictures=");
        k.append(this.f55169n);
        k.append(", no_intro_screen_android=");
        k.append(this.f55170o);
        k.append(", sdk_ui_customization_enabled=");
        k.append(this.f55171p);
        k.append(", hide_language_change_temp_android=");
        k.append(this.f55172q);
        k.append(", merged_ui_temp_android=");
        k.append(this.f55173r);
        k.append(", selfie_auto_capture_temp_android=");
        k.append(this.f55174s);
        k.append(", capture_hud_dev_android=");
        k.append(this.f55175t);
        k.append(", decision_step_delay_ms=");
        k.append(this.f55176u);
        k.append(", decision_check_delay_ms=");
        k.append(this.f55177v);
        k.append(", inflow_timeout_ms=");
        k.append(this.f55178w);
        k.append(", inflow_retry_count=");
        k.append(this.f55179x);
        k.append(", mrz_timeout_ms=");
        k.append(this.f55180y);
        k.append(", nfc_scan_retry_count=");
        k.append(this.f55181z);
        k.append(", nfc_scan_timeout_ms=");
        k.append(this.f55135A);
        k.append(", nfc_connect_time_min_threshold_ms=");
        k.append(this.f55136B);
        k.append(", nfc_connection_lost_delay_ms=");
        k.append(this.f55137C);
        k.append(", nfc_chunk_size_min=");
        k.append(this.f55138D);
        k.append(", nfc_chunk_size_max=");
        k.append(this.f55139E);
        k.append(", nfc_chunk_size_default=");
        k.append(this.f55140F);
        k.append(", barcode_scan_timeout_ms=");
        k.append(this.f55141G);
        k.append(", barcode_scan_retry_count=");
        k.append(this.f55142H);
        k.append(", barcode_result_delay_ms=");
        k.append(this.f55143I);
        k.append(", barcode_resolution=");
        k.append(this.f55144J);
        k.append(", dark_room_threshold_android=");
        k.append(this.f55145K);
        k.append(", video_config_android=");
        k.append(this.f55146L);
        k.append(", audio_config_android=");
        k.append(this.f55147M);
        k.append(", nfc_supported_countries=");
        k.append(this.f55148N);
        k.append(", autocapture_manual_fallback_timeout_ms=");
        k.append(this.f55149O);
        k.append(", autocapture_face_translation_error=");
        k.append(this.f55150P);
        k.append(", autocapture_min_face_size=");
        k.append(this.f55151Q);
        k.append(", autocapture_face_orientation_error=");
        k.append(this.f55152R);
        k.append(", poa_enable_liveness_android=");
        k.append(this.f55153S);
        k.append(", poa_enable_multi_files_android=");
        k.append(this.f55154T);
        k.append(", poa_file_max_size_mb_android=");
        return C13437d.m33707l(k, this.f55155U, ")");
    }

    /* renamed from: u */
    public final long mo55470u() {
        return this.f55176u;
    }

    /* renamed from: v */
    public final long mo55471v() {
        return this.f55177v;
    }

    /* renamed from: w */
    public final long mo55472w() {
        return this.f55178w;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeInt(this.f55156a ? 1 : 0);
        parcel.writeInt(this.f55157b ? 1 : 0);
        parcel.writeInt(this.f55158c ? 1 : 0);
        parcel.writeInt(this.f55159d ? 1 : 0);
        parcel.writeInt(this.f55160e ? 1 : 0);
        parcel.writeInt(this.f55161f ? 1 : 0);
        parcel.writeInt(this.f55162g ? 1 : 0);
        parcel.writeInt(this.f55163h ? 1 : 0);
        parcel.writeInt(this.f55164i ? 1 : 0);
        parcel.writeInt(this.f55165j ? 1 : 0);
        parcel.writeInt(this.f55166k ? 1 : 0);
        parcel.writeInt(this.f55167l ? 1 : 0);
        parcel.writeInt(this.f55168m ? 1 : 0);
        parcel.writeInt(this.f55169n ? 1 : 0);
        parcel.writeInt(this.f55170o ? 1 : 0);
        parcel.writeInt(this.f55171p ? 1 : 0);
        parcel.writeInt(this.f55172q ? 1 : 0);
        parcel.writeInt(this.f55173r ? 1 : 0);
        parcel.writeInt(this.f55174s ? 1 : 0);
        parcel.writeInt(this.f55175t ? 1 : 0);
        parcel.writeLong(this.f55176u);
        parcel.writeLong(this.f55177v);
        parcel.writeLong(this.f55178w);
        parcel.writeInt(this.f55179x);
        parcel.writeLong(this.f55180y);
        parcel.writeInt(this.f55181z);
        parcel.writeLong(this.f55135A);
        parcel.writeLong(this.f55136B);
        parcel.writeLong(this.f55137C);
        parcel.writeInt(this.f55138D);
        parcel.writeInt(this.f55139E);
        parcel.writeInt(this.f55140F);
        parcel.writeLong(this.f55141G);
        parcel.writeInt(this.f55142H);
        parcel.writeLong(this.f55143I);
        parcel.writeString(this.f55144J.name());
        parcel.writeDouble(this.f55145K);
        this.f55146L.writeToParcel(parcel, 0);
        this.f55147M.writeToParcel(parcel, 0);
        parcel.writeStringList(this.f55148N);
        parcel.writeLong(this.f55149O);
        parcel.writeFloat(this.f55150P);
        parcel.writeFloat(this.f55151Q);
        parcel.writeInt(this.f55152R);
        parcel.writeInt(this.f55153S ? 1 : 0);
        parcel.writeInt(this.f55154T ? 1 : 0);
        parcel.writeInt(this.f55155U);
    }

    /* renamed from: x */
    public final int mo55474x() {
        return this.f55179x;
    }

    /* renamed from: y */
    public final long mo55475y() {
        return this.f55180y;
    }

    /* renamed from: z */
    public final int mo55476z() {
        return this.f55181z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21789ix(boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, long r78, long r80, long r82, int r84, long r85, int r87, long r88, long r90, long r92, int r94, int r95, int r96, long r97, int r99, long r100, com.veriff.sdk.internal.C21886js r102, double r103, com.veriff.sdk.internal.C21903ka r105, com.veriff.sdk.internal.C21787iw r106, java.util.List r107, long r108, float r110, float r111, int r112, boolean r113, boolean r114, int r115, int r116, int r117, kotlin.jvm.internal.DefaultConstructorMarker r118) {
        /*
            r57 = this;
            r0 = r116
            r1 = r117
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r58
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r59
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 1
            goto L_0x001c
        L_0x001a:
            r5 = r60
        L_0x001c:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0022
            r7 = 0
            goto L_0x0024
        L_0x0022:
            r7 = r61
        L_0x0024:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002a
            r8 = 0
            goto L_0x002c
        L_0x002a:
            r8 = r62
        L_0x002c:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0032
            r9 = 1
            goto L_0x0034
        L_0x0032:
            r9 = r63
        L_0x0034:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003a
            r10 = 1
            goto L_0x003c
        L_0x003a:
            r10 = r64
        L_0x003c:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0042
            r11 = 0
            goto L_0x0044
        L_0x0042:
            r11 = r65
        L_0x0044:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004a
            r12 = 0
            goto L_0x004c
        L_0x004a:
            r12 = r66
        L_0x004c:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0052
            r13 = 1
            goto L_0x0054
        L_0x0052:
            r13 = r67
        L_0x0054:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005a
            r14 = 1
            goto L_0x005c
        L_0x005a:
            r14 = r68
        L_0x005c:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0062
            r15 = 0
            goto L_0x0064
        L_0x0062:
            r15 = r69
        L_0x0064:
            r3 = r0 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x006a
            r3 = 0
            goto L_0x006c
        L_0x006a:
            r3 = r70
        L_0x006c:
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0072
            r6 = 0
            goto L_0x0074
        L_0x0072:
            r6 = r71
        L_0x0074:
            r16 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r72
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0088
            r17 = 1
            goto L_0x008a
        L_0x0088:
            r17 = r73
        L_0x008a:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0093
            r18 = 0
            goto L_0x0095
        L_0x0093:
            r18 = r74
        L_0x0095:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x009e
            r19 = 0
            goto L_0x00a0
        L_0x009e:
            r19 = r75
        L_0x00a0:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a9
            r20 = 0
            goto L_0x00ab
        L_0x00a9:
            r20 = r76
        L_0x00ab:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00b4
            r21 = 0
            goto L_0x00b6
        L_0x00b4:
            r21 = r77
        L_0x00b6:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00bf
            r22 = 15000(0x3a98, double:7.411E-320)
            goto L_0x00c1
        L_0x00bf:
            r22 = r78
        L_0x00c1:
            r24 = 2097152(0x200000, float:2.938736E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00ca
            r24 = 10000(0x2710, double:4.9407E-320)
            goto L_0x00cc
        L_0x00ca:
            r24 = r80
        L_0x00cc:
            r26 = 4194304(0x400000, float:5.877472E-39)
            r26 = r0 & r26
            r27 = 4000(0xfa0, double:1.9763E-320)
            if (r26 == 0) goto L_0x00d7
            r29 = r27
            goto L_0x00d9
        L_0x00d7:
            r29 = r82
        L_0x00d9:
            r26 = 8388608(0x800000, float:1.17549435E-38)
            r26 = r0 & r26
            r31 = 3
            if (r26 == 0) goto L_0x00e4
            r26 = 3
            goto L_0x00e6
        L_0x00e4:
            r26 = r84
        L_0x00e6:
            r32 = 16777216(0x1000000, float:2.3509887E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00ef
            r32 = 8000(0x1f40, double:3.9525E-320)
            goto L_0x00f1
        L_0x00ef:
            r32 = r85
        L_0x00f1:
            r34 = 33554432(0x2000000, float:9.403955E-38)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r31 = r87
        L_0x00fa:
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0103
            r34 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0105
        L_0x0103:
            r34 = r88
        L_0x0105:
            r36 = 134217728(0x8000000, float:3.85186E-34)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x010e
            r36 = r27
            goto L_0x0110
        L_0x010e:
            r36 = r90
        L_0x0110:
            r38 = 268435456(0x10000000, float:2.5243549E-29)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0119
            r38 = r27
            goto L_0x011b
        L_0x0119:
            r38 = r92
        L_0x011b:
            r40 = 536870912(0x20000000, float:1.0842022E-19)
            r40 = r0 & r40
            if (r40 == 0) goto L_0x0124
            r40 = 128(0x80, float:1.794E-43)
            goto L_0x0126
        L_0x0124:
            r40 = r94
        L_0x0126:
            r41 = 1073741824(0x40000000, float:2.0)
            r41 = r0 & r41
            if (r41 == 0) goto L_0x012f
            r41 = 1024(0x400, float:1.435E-42)
            goto L_0x0131
        L_0x012f:
            r41 = r95
        L_0x0131:
            r42 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r42
            if (r0 == 0) goto L_0x013a
            r0 = 230(0xe6, float:3.22E-43)
            goto L_0x013c
        L_0x013a:
            r0 = r96
        L_0x013c:
            r42 = r1 & 1
            if (r42 == 0) goto L_0x0144
            r42 = 60000(0xea60, double:2.9644E-319)
            goto L_0x0146
        L_0x0144:
            r42 = r97
        L_0x0146:
            r44 = r1 & 2
            if (r44 == 0) goto L_0x014d
            r44 = 4
            goto L_0x014f
        L_0x014d:
            r44 = r99
        L_0x014f:
            r45 = r1 & 4
            if (r45 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r27 = r100
        L_0x0156:
            r45 = r1 & 8
            if (r45 == 0) goto L_0x015d
            com.veriff.sdk.internal.js r45 = com.veriff.sdk.internal.C21886js.R1080P
            goto L_0x015f
        L_0x015d:
            r45 = r102
        L_0x015f:
            r46 = r1 & 16
            if (r46 == 0) goto L_0x0166
            r46 = 4617315517961601024(0x4014000000000000, double:5.0)
            goto L_0x0168
        L_0x0166:
            r46 = r103
        L_0x0168:
            r48 = r1 & 32
            if (r48 == 0) goto L_0x0190
            com.veriff.sdk.internal.ka r48 = new com.veriff.sdk.internal.ka
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 31
            r56 = 0
            r58 = r48
            r59 = r49
            r60 = r50
            r61 = r51
            r62 = r52
            r63 = r53
            r65 = r55
            r66 = r56
            r58.<init>(r59, r60, r61, r62, r63, r65, r66)
            goto L_0x0192
        L_0x0190:
            r48 = r105
        L_0x0192:
            r49 = r1 & 64
            if (r49 == 0) goto L_0x01b2
            com.veriff.sdk.internal.iw r49 = new com.veriff.sdk.internal.iw
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 7
            r54 = 0
            r58 = r49
            r59 = r50
            r60 = r51
            r61 = r52
            r62 = r53
            r63 = r54
            r58.<init>(r59, r60, r61, r62, r63)
            goto L_0x01b4
        L_0x01b2:
            r49 = r106
        L_0x01b4:
            r116 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c1
            mobi.lab.veriff.a r0 = mobi.lab.veriff.C24418a.f61785d
            java.util.List r0 = r0.mo60540a()
            goto L_0x01c3
        L_0x01c1:
            r0 = r107
        L_0x01c3:
            r50 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01cc
            r51 = 20000(0x4e20, double:9.8813E-320)
            goto L_0x01ce
        L_0x01cc:
            r51 = r108
        L_0x01ce:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01d6
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x01d8
        L_0x01d6:
            r0 = r110
        L_0x01d8:
            r53 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01e2
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            goto L_0x01e4
        L_0x01e2:
            r0 = r111
        L_0x01e4:
            r54 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01ed
            r0 = 10
            goto L_0x01ef
        L_0x01ed:
            r0 = r112
        L_0x01ef:
            r55 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01f7
            r0 = 0
            goto L_0x01f9
        L_0x01f7:
            r0 = r113
        L_0x01f9:
            r56 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0201
            r0 = 0
            goto L_0x0203
        L_0x0201:
            r0 = r114
        L_0x0203:
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x020a
            r1 = 12
            goto L_0x020c
        L_0x020a:
            r1 = r115
        L_0x020c:
            r58 = r57
            r59 = r2
            r60 = r4
            r61 = r5
            r62 = r7
            r63 = r8
            r64 = r9
            r65 = r10
            r66 = r11
            r67 = r12
            r68 = r13
            r69 = r14
            r70 = r15
            r71 = r3
            r72 = r16
            r73 = r6
            r74 = r17
            r75 = r18
            r76 = r19
            r77 = r20
            r78 = r21
            r79 = r22
            r81 = r24
            r83 = r29
            r85 = r26
            r86 = r32
            r88 = r31
            r89 = r34
            r91 = r36
            r93 = r38
            r95 = r40
            r96 = r41
            r97 = r116
            r98 = r42
            r100 = r44
            r101 = r27
            r103 = r45
            r104 = r46
            r106 = r48
            r107 = r49
            r108 = r50
            r109 = r51
            r111 = r53
            r112 = r54
            r113 = r55
            r114 = r56
            r115 = r0
            r116 = r1
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r81, r83, r85, r86, r88, r89, r91, r93, r95, r96, r97, r98, r100, r101, r103, r104, r106, r107, r108, r109, r111, r112, r113, r114, r115, r116)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21789ix.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, long, long, long, int, long, int, long, long, long, int, int, int, long, int, long, com.veriff.sdk.internal.js, double, com.veriff.sdk.internal.ka, com.veriff.sdk.internal.iw, java.util.List, long, float, float, int, boolean, boolean, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
