package TrabalhoPO;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Test test = new Test();
		Result[] results = new Result[100];
		int count = 0;

		test.heapTest(500, "alea");
		test.heapTest(500, "inv");
		test.heapTest(500, "ord");

		test.heapTest(1000, "alea");
		test.heapTest(1000, "inv");
		test.heapTest(1000, "ord");

		test.heapTest(5000, "alea");
		test.heapTest(5000, "inv");
		test.heapTest(5000, "ord");

		test.heapTest(10000, "alea");
		test.heapTest(10000, "inv");
		test.heapTest(10000, "ord");

		test.heapTest(50000, "alea");
		test.heapTest(50000, "inv");
		test.heapTest(50000, "ord");



		test.quickTest(500, "alea");
		test.quickTest(500, "inv");
		test.quickTest(500, "ord");

		test.quickTest(1000, "alea");
		test.quickTest(1000, "inv");
		test.quickTest(1000, "ord");

		test.quickTest(5000, "alea");
		test.quickTest(5000, "inv");
		test.quickTest(5000, "ord");

		test.quickTest(10000, "alea");
		test.quickTest(10000, "inv");
		test.quickTest(10000, "ord");

		test.quickTest(50000, "alea");
		test.quickTest(50000, "inv");
		test.quickTest(50000, "ord");



		test.abbTest(500, "alea");
		test.abbTest(500, "inv");
		test.abbTest(500, "ord");

		test.abbTest(1000, "alea");
		test.abbTest(1000, "inv");
		test.abbTest(1000, "ord");

		test.abbTest(5000, "alea");
		test.abbTest(5000, "inv");
		test.abbTest(5000, "ord");

		test.abbTest(10000, "alea");
		test.abbTest(10000, "inv");
		test.abbTest(10000, "ord");

		test.abbTest(50000, "alea");
		test.abbTest(50000, "inv");
		test.abbTest(50000, "ord");


		//		test.hashTest(500, "alea");
		//		test.hashTest(500, "inv");
		//		test.hashTest(500, "ord");

		//		test.hashTest(1000, "alea");
		//		test.hashTest(1000, "inv");
		//		test.hashTest(1000, "ord");
		//
		//		test.hashTest(5000, "alea");
		//		test.hashTest(5000, "inv");
		//		test.hashTest(5000, "ord");
		//
		//		test.hashTest(10000, "alea");
		//		test.hashTest(10000, "inv");
		//		test.hashTest(10000, "ord");
		//
		//		test.hashTest(50000, "alea");
		//		test.hashTest(50000, "inv");
		//		test.hashTest(50000, "ord");

		System.out.println("oioi");

	}
}
