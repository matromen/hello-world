package example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class IO_1 {
	public static void main(String[] args) {
		System.out.println("File input/output Progream...");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input : ");
		
		String line;
		int i;
				
		try {

			/////////////////////byte stream////////////////////////////////////////////
			int len=0;
			i = 0;
			long time = System.currentTimeMillis();
			
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\bgkim_n\\\\aaa.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\bgkim_n\\\\lottoCopy.txt");
						
			
			while((i=fis.read()) != -1){
				fos.write(i);
				len++;
			}
			
			time = System.currentTimeMillis() - time;
			
			fis.close(); fos.close();
			System.out.println(len + "byte" + "," + time + "millsec");
			
			
			i=0;
			len=0;
			time = System.currentTimeMillis();
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\bgkim_n\\\\aaa.jpg"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\bgkim_n\\\\lottoCopy2.txt"));
			
			
			while((i=bis.read())!=-1) {
				bos.write(i);
				len++;
			}
			
			time = System.currentTimeMillis() - time;
			
			bis.close(); bos.close();
			System.out.println(len + "byte" + "," + time + "millsec");
			
			///////////////////////////char stream/////////////////////////////////////////////////////
			
			len=0;
			time = System.currentTimeMillis();
			
			FileReader  fr = new FileReader("C:\\\\Users\\\\bgkim_n\\\\aaa.jpg");
			FileWriter  fw = new FileWriter("C:\\\\Users\\\\bgkim_n\\\\lottoCopy5.txt");
			
			while((i=fr.read())!=-1) {
				fw.write(i);
				len++;
			}
			time = System.currentTimeMillis() - time;
			
			fw.flush();
			fr.close();fw.close();
			
			System.out.println(len + "byte" + "," + time + "millsec");
			
			
			len=0;
			time = System.currentTimeMillis();
			
			FileInputStream fis2 = new FileInputStream("C:\\\\Users\\\\bgkim_n\\\\aaa.jpg");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis2));
			FileOutputStream fos2 = new FileOutputStream("C:\\\\Users\\\\bgkim_n\\\\lottoCopy3.txt");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos2));
			
						
			while((i=br.read()) != -1) {
				bw.write(i);
				len++;
			}
						
			time = System.currentTimeMillis() - time;
			
			bw.flush();

			fos2.close();bw.close();
			System.out.println(len + "byte" + "," + time + "millsec");
			
			len=0;
			time = System.currentTimeMillis();
			
			fis2 = new FileInputStream("C:\\\\Users\\\\bgkim_n\\\\aaa.jpg");
			br = new BufferedReader(new InputStreamReader(fis2));
			FileOutputStream fos3 = new FileOutputStream("C:\\\\Users\\\\bgkim_n\\\\lottoCopy4.txt");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(fos3));
			
			while((i=br.read())!=-1) {
				pw.write(i);
				len++;
			}
			pw.flush();
			
			time = System.currentTimeMillis() - time;
			System.out.println(len + "byte" + "," + time + "millsec");
			
			fis2.close();br.close(); fos3.close();pw.close();
			
			
			
			File file = new File("C:\\\\Users\\\\bgkim_n\\\\lotto\\\\kkk");
			
			if(!file.isDirectory()) {
				file.mkdirs();
			}
			if(!file.isFile()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			/*line = reader.readLine();
			
			FileWriter fileWriter = new FileWriter("C:\\Users\\bgkim_n\\char_out.txt");
			
			fileWriter.write(line);
			fileWriter.flush();
			fileWriter.close();
			
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\bgkim_n\\byte_out.txt");
			PrintWriter outWriter = new PrintWriter(new OutputStreamWriter(fileOut));
			
			outWriter.print(line);
			outWriter.flush();
			outWriter.close();
			
			
			FileInputStream fileIn = new FileInputStream("C:\\Users\\bgkim_n\\byte_out.txt");
			BufferedReader inReader = new BufferedReader(new InputStreamReader(fileIn));
			
			line = inReader.readLine();
			System.out.println(line);
			
			
			FileReader fileReader = new FileReader("C:\\Users\\bgkim_n\\char_out.txt");
			
			while((i=fileReader.read())!=-1) {
				System.out.print((char)i);
			}
			*/
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
