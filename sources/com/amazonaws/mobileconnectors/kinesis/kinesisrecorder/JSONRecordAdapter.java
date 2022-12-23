package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import android.util.Base64;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
class JSONRecordAdapter {
    public static final String DATA_FIELD_KEY = "Data";
    public static final String EXPLICIT_HASH_FIELD = "ExplicitHash";
    private static final Log LOGGER = LogFactory.getLog((Class<?>) JSONRecordAdapter.class);
    public static final String PARTITION_KEY_FIELD = "PartitionKey";
    public static final String SEQUENCE_NUMBER_FIELD = "SequenceNumber";
    public static final String STREAM_NAME_FIELD = "StreamName";

    public static ByteBuffer getData(JSONObject jSONObject) throws JSONException {
        return ByteBuffer.wrap(Base64.decode(jSONObject.getString(DATA_FIELD_KEY), 0));
    }

    public static String getPartitionKey(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(PARTITION_KEY_FIELD);
    }

    public static String getStreamName(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(STREAM_NAME_FIELD);
    }

    public JSONObject translateFromRecord(PutRecordRequest putRecordRequest) {
        if (putRecordRequest == null) {
            LOGGER.warn("The Record provided was null");
            return null;
        } else if (putRecordRequest.getData() == null || putRecordRequest.getPartitionKey() == null || putRecordRequest.getPartitionKey().isEmpty() || putRecordRequest.getStreamName() == null || putRecordRequest.getStreamName().isEmpty()) {
            throw new AmazonClientException("RecordRequests must specify a partition key, stream name, and data");
        } else if (putRecordRequest.getData().hasArray()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(DATA_FIELD_KEY, Base64.encodeToString(putRecordRequest.getData().array(), 0));
                jSONObject.put(STREAM_NAME_FIELD, putRecordRequest.getStreamName());
                jSONObject.put(PARTITION_KEY_FIELD, putRecordRequest.getPartitionKey());
                jSONObject.putOpt(EXPLICIT_HASH_FIELD, putRecordRequest.getExplicitHashKey());
                jSONObject.putOpt(SEQUENCE_NUMBER_FIELD, putRecordRequest.getSequenceNumberForOrdering());
                return jSONObject;
            } catch (JSONException e) {
                StringBuilder k = C13555b.m33972k("Unable to convert KinesisRecord to JSON ");
                k.append(e.getMessage());
                throw new AmazonClientException(k.toString());
            }
        } else {
            throw new AmazonClientException("ByteBuffer must be based on array for proper storage");
        }
    }
}
