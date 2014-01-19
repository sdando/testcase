package test;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

import org.junit.Test;

public class testSocketChannel {
	
	final static int TIME_OUT=0;
	
	@Test
	public void testChannel() throws IOException{
        String address="192.168.10.127";
		int port=8000;
		ServerSocketChannel serverChannel=ServerSocketChannel.open();
		Selector selector=Selector.open();
		serverChannel.configureBlocking(false);
		serverChannel.socket().bind(new InetSocketAddress(address,port));
		serverChannel.register(selector, SelectionKey.OP_ACCEPT);
		while(true){
			try {
				selector.select();	
			} catch (Exception e) {
				// TODO: handle exception
				serverChannel.close();
				System.out.println("socket is closed!");
			}
			
			Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
			while(iterator.hasNext()){
				SelectionKey key=iterator.next();
				iterator.remove();
				if(key.isValid()){
					if(key.isAcceptable()){
						SocketChannel channel=serverChannel.accept();
						channel.configureBlocking(false);
						channel.register(selector, SelectionKey.OP_READ);
						key.interestOps(SelectionKey.OP_ACCEPT);
					}
					if(key.isReadable()){
						ByteBuffer buffer=ByteBuffer.allocate(100);
						SocketChannel channel=(SocketChannel)key.channel();
						int byteRead=channel.read(buffer);
						JunitTest.Print(byteRead+"");
					    BufferedOutputStream outStream=new BufferedOutputStream(System.out);
					    byte[] outBuffer=new byte[byteRead];
					    buffer.get(outBuffer,0,byteRead);
					    outStream.write(outBuffer);
					    outStream.flush();
						key.interestOps(SelectionKey.OP_READ);
					}
				}			
			}
			
		}
		
	}

}
