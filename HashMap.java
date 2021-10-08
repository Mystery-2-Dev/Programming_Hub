import java.util.ArrayList;
import java.util.List;

public class HashMap {

	class Container{
		Object key;
		Object value;
		public void insert(Object k, Object v){
			this.key=k;
			this.value=v;
		}
	}
	
	private Container c;
	private List<Container> recordList;
	
	public HashMap(){
		
		this.recordList=new ArrayList<Container>();
	}
	
	public void put(Object k, Object v){
		this.c=new Container();
		c.insert(k, v);
		//check for the same key before adding
		for(int i=0; i<recordList.size(); i++){
			Container c1=recordList.get(i);
			if(c1.key.equals(k)){
				//remove the existing object
				recordList.remove(i);
				break;
			}
		}
		recordList.add(c);
	}
	
	public Object get(Object k){
		for(int i=0; i<this.recordList.size(); i++){
			Container con = recordList.get(i);
			if (k.toString()==con.key.toString()) {
				
				return con.value;
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		System.out.println(hm.get("3"));
		hm.put("3", "4");
		
		System.out.println(hm.get("1"));
		System.out.println(hm.get("3"));
		System.out.println(hm.get("8"));
	}

}