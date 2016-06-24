package atgcCounter;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDriver {


	public static void main(String args[]) throws IOException{

		BufferedReader br = null;

		long start = System.currentTimeMillis();

		try{
			br = new BufferedReader(new FileReader("C:\\Manoj\\ArrayGen\\NGS_Data\\testSameSeq.fa"));
		}catch(Exception e){
			e.printStackTrace();
		}
		String line = "";
		int seqCounter = 0;
		List<String> seqList = new ArrayList<String>();
		ExecutorService executor = Executors.newFixedThreadPool(50);
		do{

			if(seqCounter == 10000){
				seqCounter=0;
				Runnable atgcc = new AtgcCounter(seqList);
				seqList = new ArrayList<String>();
				//Thread t1 = new Thread(atgcc);
				executor.execute(atgcc);
			}

			if(line.startsWith("@")){
				String seqLine = br.readLine();
				//System.out.println(seqLine);
				seqList.add(seqLine.trim());
				seqCounter++;
			}

			if(((line=br.readLine())== null)){
				seqCounter=0;
				Runnable atgcc = new AtgcCounter(seqList);
				//Thread t1 = new Thread(atgcc);
				executor.execute(atgcc);
				break;
			}
		}while(true);

		executor.shutdown();
		
		

		while (!executor.isTerminated()) {
			//System.out.println("Going on..");
		}  
		  
        System.out.println("Finished all threads"); 
        System.out.println(AtgcCounter.bcMain);
        
        long stop = System.currentTimeMillis();
        System.out.println(((stop-start)/1000)/60);
	}

}
