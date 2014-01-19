package test;


import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class Test2 {
    public static void main(String[] args){
        P p=new C();
        System.out.println(p.get());
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(11);
        List<String> inList=new ArrayList<String>();
        List int2=new ArrayList();
//      p.print(new String("aa"));
        p.print(ints);
        String s="aa";
        inList.add(s);
        s="bb";
        inList.add(s);
        System.out.println(inList); 
        List<Beans> arrBeans=new Vector<Beans>(5);
        arrBeans.add(new Beans());
        arrBeans.get(0).setName("super");
        System.out.println(arrBeans.get(0).getName());
        
    }
}

class Beans{
	String name;
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}

class P{
    public Number get(){
        return new Integer(0);
    }
    public <T extends Object> void print(List<T> param){
    	System.out.println(param.get(0));
    }
}

class C extends P{
    public Integer get(){
        return new Integer(1);
    }
}