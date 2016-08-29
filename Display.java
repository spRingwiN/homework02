public class Display{

	private int value=0;
	private int limit=0;
	public Display(int limit){
 	this.limit=limit;
 	}	
	public boolean inrease(){
	boolean isJ=false;
	value++;
	if(value==limit){
	value=0;
	isJ=true;
	}
	return isJ;
    }
	public int gotValue(){
	return value;
   }
	public void setValue(int value){
	this.value=value;
  }
}
