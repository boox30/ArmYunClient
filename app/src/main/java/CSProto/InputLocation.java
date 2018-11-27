// automatically generated by the FlatBuffers compiler, do not modify

package CSProto;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class InputLocation extends Table {
  public static InputLocation getRootAsInputLocation(ByteBuffer _bb) { return getRootAsInputLocation(_bb, new InputLocation()); }
  public static InputLocation getRootAsInputLocation(ByteBuffer _bb, InputLocation obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public InputLocation __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float longitude() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float latitude() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float altitude() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float floor() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float horizontalaccuracy() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float verticalaccuracy() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float speed() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float direction() { int o = __offset(18); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public String timestamp() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer timestampAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer timestampInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }

  public static int createInputLocation(FlatBufferBuilder builder,
      float longitude,
      float latitude,
      float altitude,
      float floor,
      float horizontalaccuracy,
      float verticalaccuracy,
      float speed,
      float direction,
      int timestampOffset) {
    builder.startObject(9);
    InputLocation.addTimestamp(builder, timestampOffset);
    InputLocation.addDirection(builder, direction);
    InputLocation.addSpeed(builder, speed);
    InputLocation.addVerticalaccuracy(builder, verticalaccuracy);
    InputLocation.addHorizontalaccuracy(builder, horizontalaccuracy);
    InputLocation.addFloor(builder, floor);
    InputLocation.addAltitude(builder, altitude);
    InputLocation.addLatitude(builder, latitude);
    InputLocation.addLongitude(builder, longitude);
    return InputLocation.endInputLocation(builder);
  }

  public static void startInputLocation(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addLongitude(FlatBufferBuilder builder, float longitude) { builder.addFloat(0, longitude, 0.0f); }
  public static void addLatitude(FlatBufferBuilder builder, float latitude) { builder.addFloat(1, latitude, 0.0f); }
  public static void addAltitude(FlatBufferBuilder builder, float altitude) { builder.addFloat(2, altitude, 0.0f); }
  public static void addFloor(FlatBufferBuilder builder, float floor) { builder.addFloat(3, floor, 0.0f); }
  public static void addHorizontalaccuracy(FlatBufferBuilder builder, float horizontalaccuracy) { builder.addFloat(4, horizontalaccuracy, 0.0f); }
  public static void addVerticalaccuracy(FlatBufferBuilder builder, float verticalaccuracy) { builder.addFloat(5, verticalaccuracy, 0.0f); }
  public static void addSpeed(FlatBufferBuilder builder, float speed) { builder.addFloat(6, speed, 0.0f); }
  public static void addDirection(FlatBufferBuilder builder, float direction) { builder.addFloat(7, direction, 0.0f); }
  public static void addTimestamp(FlatBufferBuilder builder, int timestampOffset) { builder.addOffset(8, timestampOffset, 0); }
  public static int endInputLocation(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
