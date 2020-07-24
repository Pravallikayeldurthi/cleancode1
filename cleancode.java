import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CleanCodeTask {

			static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			public static void cleancode1(double p,double r,double t)throws Exception {
				double sim=simpleInterest(p,r,t);
				double com=compoundInterest(p,r,t);
				System.out.println("Simple Interest = "+sim+"\n");;
				System.out.println("Compound Interest = "+com+"\n");
			}
			public static double simpleInterest(double price,double rate,double time)
			{
				return((price*rate*time)/100.0);
			}
			public static double compoundInterest(double price,double rate,double time)
			{
				double x=price*Math.pow(1.0+(rate/100.0),time)-price;
				return x;
			}
			public static void main(String[] args)throws Exception{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				double p=Double.parseDouble(br.readLine());
				double r=Double.parseDouble(br.readLine());
				double t=Double.parseDouble(br.readLine());
				cleancode1(p,r,t);
				bw.flush();
			}
	}