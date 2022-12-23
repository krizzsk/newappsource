package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import java.util.List;

public interface DeadLetterListener {
    void onRecordsDropped(String str, List<byte[]> list);
}
