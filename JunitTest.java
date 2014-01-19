package test;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.junit.Test;


public class JunitTest {
	
	public static void Print(String s){
		System.out.println(s);
	}
	
	@Test
	public void testTreeMapIterate(){
		TreeMap<Integer, String> idToName=new TreeMap<Integer, String>();
		idToName.put(2, "lily");
		idToName.put(1,"lucy");
		System.out.println(idToName.firstKey());
		for(Entry<Integer, String> entry:idToName.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	@Test
	public void testDate(){
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH£∫mm");
		System.out.println(sdf.format(date));
	}
	
	@Test
	public void testSplit(){
		String s="  ";
		String ss=s.trim();
		String[] words=ss.split(" ");
		Print(words[words.length-1]);
		Print(words[words.length-1].length()+" ");
	}
	
	@Test
	public void testArray(){
		int n=2,m=2;
		int[][] array=new int[n][m];
	}
	
	@Test
	public void testXor(){
		int a=2,b=3;
		int c=a|b;
		int d=a&b;
		int e=a^b;
		Print(c+" "+d+" "+e);
		int[] array;
	}
	
	@Test
	public void testArrayList(){
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("bb");
		System.out.println(arrayList);
	}
	
	@Test
	public void testHashMap(){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(1, 3);
		JunitTest.Print(map.get(1)+"");
	}
	

	public void testSelector()throws Exception{
		FileInputStream fin=new FileInputStream(new File("temp.txt"));
		FileChannel fc=fin.getChannel();
		ByteBuffer byteBuffer=ByteBuffer.allocate(4);
		Selector selector=Selector.open();
	}
	
	@Test
	public void testArrayInitial(){
		int[] arr=new int[2];
		Print(arr[0]+"");
 	}
	
	@Test
	public void testRefrence(){
		ArrayList<ArrayList<Integer>> collection=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> one=new ArrayList<Integer>();
		collection.add(one);
		one.add(1);
		one=new ArrayList<Integer>();
		one.add(2);
		collection.add(one);
		Print(collection.toString());
	}
	
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		    val = x;
	        next = null;
		}
	}
	
	@Test
	public void testfunParam(){
	    ListNode node=new ListNode(1);
	    doLink(node.next);
	    int[] a=new int[]{1,2};
	    return;
	}
	
	private void doLink(ListNode node){
		node=new ListNode(2);
		node.next=null;
	}
	
	class TreeNode2 {
		int val;
		TreeNode2 left;
		TreeNode2 right;
		TreeNode2(int x) { val = x; }
	}
	
	
	public void testAddNULL(){
		ArrayDeque<TreeNode2> queue=new ArrayDeque<TreeNode2>();
		queue.add(new TreeNode2(0));
		TreeNode2 node2=null;
		queue.add(node2);
		JunitTest.Print(queue.size()+"");
//		int front=queue.pollLast();
        return;
	}
	
	@Test
	public void testArraySet(){
		ArrayList<Integer> arrayList=new ArrayList<Integer>(2);
//		arrayList.set(1, 2);
		JunitTest.Print("end");
		int[][] twoArray=new int[0][0];
		return;
	}
	
	@Test
	public void testPattern(){
		Pattern pattern=Pattern.compile("[hgk]");
		Matcher matcher=pattern.matcher("g");
		JunitTest.Print(matcher.matches()+"");
	}
}
