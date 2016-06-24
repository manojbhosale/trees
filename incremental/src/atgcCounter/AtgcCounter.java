package atgcCounter;

import java.util.ArrayList;
import java.util.List;

public class AtgcCounter implements Runnable{
	
	List<String> seqList = new ArrayList<String>();
	public static BaseCount bcMain = new BaseCount();
	
	public void run(){
		
		for(String seq: seqList){
			
			BaseCount bc = countBasesFromSeq(seq);
			bcMain.setaCount(bcMain.getaCount()+bc.getaCount());
			bcMain.settCount(bcMain.gettCount()+bc.gettCount());
			bcMain.setgCount(bcMain.getgCount()+bc.getgCount());
			bcMain.setcCount(bcMain.getcCount()+bc.getcCount());
		}
		//System.out.println("thread completes!!");
		
	}
	
	public BaseCount countBasesFromSeq(String seq){
		int acount=0,tcount=0,gcount=0,ccount= 0;
		
		String[] seqSplited = seq.split("");
		for(String base: seqSplited){
			
			if(base.equalsIgnoreCase("A")){
				acount++;
			}else if(base.equalsIgnoreCase("T")){
				tcount++;
			}else if(base.equalsIgnoreCase("G")){
				gcount++;
			}else if(base.equalsIgnoreCase("C")){
				ccount++;
			}
			
			
		}
		return new BaseCount(acount, tcount, gcount, ccount);
	}

	public AtgcCounter(List<String> seqList) {
		super();
		this.seqList = seqList;
	}
	
	 
	
}
