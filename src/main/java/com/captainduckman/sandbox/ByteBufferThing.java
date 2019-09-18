package com.captainduckman.sandbox;

import java.nio.ByteBuffer;

public class ByteBufferThing {
    public static void main(String[] args) {
        int inputBearing = 1250;
        ByteBuffer bearingBuffer = ByteBuffer.allocate(Integer.BYTES);
        bearingBuffer.putInt(inputBearing);
        byte[] buffer = bearingBuffer.array();
        byte[] bearing = new byte[2];
        bearing[0] = buffer[2];
        bearing[1] = buffer[3];


        byte[] bytes = new byte[] {0, 0, bearing[0], bearing[1]};
        ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.BYTES);
        byteBuffer.put(bytes);
        byteBuffer.rewind();
        System.out.println(byteBuffer.asIntBuffer().get());
    }
}
