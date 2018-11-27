// automatically generated by the FlatBuffers compiler, do not modify

package CSProto;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class InputPedometer extends Table {
  public static InputPedometer getRootAsInputPedometer(ByteBuffer _bb) { return getRootAsInputPedometer(_bb, new InputPedometer()); }
  public static InputPedometer getRootAsInputPedometer(ByteBuffer _bb, InputPedometer obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public InputPedometer __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String startdate() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer startdateAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer startdateInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String enddate() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer enddateAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer enddateInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public float steps() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float distance() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float averageactivepace() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float currentpace() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float currentcadence() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float floorsasc() { int o = __offset(18); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float floorsdes() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createInputPedometer(FlatBufferBuilder builder,
      int startdateOffset,
      int enddateOffset,
      float steps,
      float distance,
      float averageactivepace,
      float currentpace,
      float currentcadence,
      float floorsasc,
      float floorsdes) {
    builder.startObject(9);
    InputPedometer.addFloorsdes(builder, floorsdes);
    InputPedometer.addFloorsasc(builder, floorsasc);
    InputPedometer.addCurrentcadence(builder, currentcadence);
    InputPedometer.addCurrentpace(builder, currentpace);
    InputPedometer.addAverageactivepace(builder, averageactivepace);
    InputPedometer.addDistance(builder, distance);
    InputPedometer.addSteps(builder, steps);
    InputPedometer.addEnddate(builder, enddateOffset);
    InputPedometer.addStartdate(builder, startdateOffset);
    return InputPedometer.endInputPedometer(builder);
  }

  public static void startInputPedometer(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addStartdate(FlatBufferBuilder builder, int startdateOffset) { builder.addOffset(0, startdateOffset, 0); }
  public static void addEnddate(FlatBufferBuilder builder, int enddateOffset) { builder.addOffset(1, enddateOffset, 0); }
  public static void addSteps(FlatBufferBuilder builder, float steps) { builder.addFloat(2, steps, 0.0f); }
  public static void addDistance(FlatBufferBuilder builder, float distance) { builder.addFloat(3, distance, 0.0f); }
  public static void addAverageactivepace(FlatBufferBuilder builder, float averageactivepace) { builder.addFloat(4, averageactivepace, 0.0f); }
  public static void addCurrentpace(FlatBufferBuilder builder, float currentpace) { builder.addFloat(5, currentpace, 0.0f); }
  public static void addCurrentcadence(FlatBufferBuilder builder, float currentcadence) { builder.addFloat(6, currentcadence, 0.0f); }
  public static void addFloorsasc(FlatBufferBuilder builder, float floorsasc) { builder.addFloat(7, floorsasc, 0.0f); }
  public static void addFloorsdes(FlatBufferBuilder builder, float floorsdes) { builder.addFloat(8, floorsdes, 0.0f); }
  public static int endInputPedometer(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
