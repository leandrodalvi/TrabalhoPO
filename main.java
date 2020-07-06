package TrabalhoPO;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Test test = new Test();
		Result[] results = new Result[60];
		int count = 0;

		Result[] aux = new Result[5];

//HEAPSORT

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(500, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(500, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(500, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(1000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(1000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(1000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(5000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(5000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(5000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(10000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(10000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(10000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(50000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(50000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.heapTest(50000, "ord");
		}
		results[count++] = getAverage(aux);


		//QUICKSORT

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(500, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(500, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(500, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(1000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(1000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(1000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(5000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(5000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(5000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(10000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(10000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(10000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(50000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(50000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.quickTest(50000, "ord");
		}
		results[count++] = getAverage(aux);//


		//ABB

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(500, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(500, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(500, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(1000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(1000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(1000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(5000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(5000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(5000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(10000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(10000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(10000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(50000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(50000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.abbTest(50000, "ord");
		}
		results[count++] = getAverage(aux);//

		//AVL

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(500, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(500, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(500, "ord");
		}
		results[count++] = getAverage(aux);


		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(1000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(1000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(1000, "ord");
		}
		results[count++] = getAverage(aux);


		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(5000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(5000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(5000, "ord");
		}
		results[count++] = getAverage(aux);


		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(10000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(10000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(10000, "ord");
		}
		results[count++] = getAverage(aux);


		//AVL

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(50000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(50000, "inv");
		}

		results[count++] = getAverage(aux);
		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.avlTest(50000, "ord");
		}
		results[count++] = getAverage(aux);



		//HASHMAP-UH

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(500, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(500, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(500, "ord");
		}
		results[count++] = getAverage(aux);


		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(1000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(1000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(1000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(5000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(5000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(5000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(10000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(10000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(10000, "ord");
		}
		results[count++] = getAverage(aux);

		//div

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(50000, "alea");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(50000, "inv");
		}
		results[count++] = getAverage(aux);

		for(int i = 0;  i < 5 ; i++) {
			aux[i] = test.hashTest(50000, "ord");
		}
		results[count++] = getAverage(aux);//




		showResults(results);

	}

	public static void showResults(Result[] results){

		for (int i = 0; i < results.length && results[i] != null; i++) {
			System.out.println("Descrição: "+results[i].getDescription() +"\n" +
					"Tempo: em média "+results[i].getTime() +"ms em 5 testes\n");
		}
	}

	public static Result getAverage(Result[] results) {

		long total = 0;
		int count = 0;
		int realCount = 0;

		while(count < results.length){

			if(results[count].getTime() != 0) {
				total += results[count].getTime();
				realCount++;
			}

			count++;
		}

		return realCount == 0 ? new Result(  0 , results[0].getDescription()) :  new Result(  total / realCount , results[0].getDescription());
	}
}
