package test;

import java.nio.ByteBuffer; 

public class ByteBufferTest {
	public static void main(String args[]){
		ByteBuffer buffer=ByteBuffer.allocate(10);
		print(buffer.capacity());
		print(buffer.limit());
		printBuffer(buffer);
		buffer.rewind();
		buffer.putChar('a');
		print(buffer.position());
		buffer.putChar('b');
		print(buffer.position());
		buffer.flip();
		printBuffer(buffer);
		buffer.position(1);
		buffer.compact();
		printBuffer(buffer);
		print(buffer.position());
		
	}
	
	public static void printBuffer(ByteBuffer buffer){
		int p=buffer.position();
		buffer.position(0);
		System.out.println();
		for(int i=0;i<buffer.limit();i++){
			byte b=buffer.get();
			print(Integer.toHexString(b));
		}
		System.out.println();
		buffer.position(p);
	}
	
    public static void print(Object o){
    	System.out.print(o+" ");
    }

}
