//importing required libraries
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream fileStream = new PrintStream("output.txt");
		System.setOut(fileStream);
		for(int seq=0;seq<=5;seq++) {
		System.out.println("For input"+seq+":");
		int k=2; //k-core = 2 core
		Scanner obj = new Scanner(System.in);
//		System.out.print("Enter the vertices of graph G:- ");
//		int vertices= obj.nextInt();
		int vertices=20; //maximum vertices for our system configuration
		GraphG g1 = new GraphG(vertices);  
		try {
			
			//taking input file here
			Scanner sc = new Scanner(new File("input"+String.valueOf(seq)+".txt")); //can modify the input file accordingly
			int [] inputData = new int [100];
			int i = 0;
			//storing the values from input file into inputData array
			while(sc.hasNextInt())
			{
				inputData[i++] = sc.nextInt();
			}
			//here i, i+1 is the number of edges in the given graph
			int j=0;
			while(j<i)
			{
				g1.addingEdge(inputData[j], inputData[j+1]);
				j=j+2;//input file contains each edge's vertex in each line
			}
//			g1.printGraph();//printing input graph's adjacency list
			for(k=2;k<5;k++)
			g1.printingKCores(k); // to print the adjacency list of k-core graph
			
			HierarchySkeleton hs = new HierarchySkeleton();//Calling Hierarchy Skeleton to print the pre-order 
			
//			System.out.println("aa");
//			int count=0;
//			File fname = new File("input.txt");
//			Scanner sc = new Scanner(fname);
//			int k = 3;
//			GraphG g1 = new GraphG(9);
//			while(sc.hasNextLine()) {
////				input[count]=Integer.parseInt(data);
////				input[count]=
//				count++;
//			}
//
//			System.out.println("bb");
//			Scanner scn = new Scanner(fname);
//
//			int input[] = new int[count];
//
//			System.out.println("ca");
//			while(scn.hasNextLine()) {
//				String data = scn.nextLine();
//				System.out.println(data);
//				input[count]=Integer.parseInt(data);
//			}
//
//			int i=0;
//			while(i<count)
//			{
////				int j=i+1;
//				g1.addingEdge(input[i], input[i+1]);
//				i=i+2;
//			}
//			g1.printingKCores(k);
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("***End***\n\n");
	}
		
	}
}





