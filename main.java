package TrabalhoPO;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static long[] imovel400 = FileManager.readInputFile();
	public static Result[] results = new Result[100];
	public static int count = 0;

	public static void main(String[] args) throws IOException {

		Result[] aaaa = results;

		heapTest(500, "alea");
		heapTest(500, "inv");	
		heapTest(500, "ord");

		heapTest(1000, "alea");
		heapTest(1000, "inv");		
		heapTest(1000, "ord");

		heapTest(5000, "alea");
		heapTest(5000, "inv");		
		heapTest(5000, "ord");

		heapTest(10000, "alea");
		heapTest(10000, "inv");		
		heapTest(10000, "ord");

		heapTest(50000, "alea");
		heapTest(50000, "inv");		
		heapTest(50000, "ord");

		

		quickTest(500, "alea");
		quickTest(500, "inv");	
		quickTest(500, "ord");

		quickTest(1000, "alea");
		quickTest(1000, "inv");		
		quickTest(1000, "ord");

		quickTest(5000, "alea");
		quickTest(5000, "inv");		
		quickTest(5000, "ord");

		quickTest(10000, "alea");
		quickTest(10000, "inv");		
		quickTest(10000, "ord");

		quickTest(50000, "alea");
		//		quickTest(50000, "inv");	
		//		quickTest(50000, "ord");



		abbTest(500, "alea");
		abbTest(500, "inv");
		abbTest(500, "ord");



	}





	public static void heapTest(int size, String type) throws IOException {
		Item[] items = FileManager.read("imovel"+size+""+type+".txt");
		Item[] aux = new Item[1];
		String s = null;

		String Type = type.substring(0, 1).toUpperCase() + type.substring(1);

		long start = System.currentTimeMillis();
		HeapSort heapSort = new HeapSort();
		heapSort.sort(items);

		FileManager.write(items,"HeapSort"+Type+""+size+".txt" );

		for (int i = 0; i < imovel400.length ; i++) {
			aux[0] = BinarySearch.binarySearch(items, imovel400[i]);
			s += Helper.SearchResult(imovel400[i], aux)+"\n";
		}
		long end = System.currentTimeMillis();

		FileManager.writeString(s, "HeapPesq"+Type+""+size+".txt" );

		results[count++] = new Result((end - start), "HeapSort"+Type+""+size );
	}

	public static void quickTest(int size, String type) throws IOException {
		Item[] items = FileManager.read("imovel"+size+""+type+".txt");
		Item[] aux = new Item[1];
		String s = null;

		String Type = type.substring(0, 1).toUpperCase() + type.substring(1);

		long start = System.currentTimeMillis();
		QuickSort quickSort = new QuickSort();
		quickSort.sort(items,0,items.length-1);

		FileManager.write(items,"QuickSort"+Type+""+size+".txt" );

		for (int i = 0; i < imovel400.length ; i++) {
			aux[0] = BinarySearch.binarySearch(items, imovel400[i]);
			s += Helper.SearchResult(imovel400[i], aux)+"\n";
		}
		long end = System.currentTimeMillis();

		FileManager.writeString(s, "QuickPesq"+Type+""+size+".txt" );

		results[count++] = new Result((end - start), "QuickSort"+Type+""+size );
	}
	
	public static void abbTest(int size, String type) throws IOException {
		Item[] items = FileManager.read("imovel"+size+""+type+".txt");
		Item[] aux = new Item[1];
		String s = null;

		String Type = type.substring(0, 1).toUpperCase() + type.substring(1);

		long start = System.currentTimeMillis();

		ABB abb = new ABB();
		
//		for ( int i = 1 ; i < items.length; i++ ) {
//			abb.inserir(new ABBNode(item[i]), );
//		}

		FileManager.write(items,"QuickSort"+Type+""+size+".txt" );

		for (int i = 0; i < imovel400.length ; i++) {
			aux[0] = BinarySearch.binarySearch(items, imovel400[i]);
			s += Helper.SearchResult(imovel400[i], aux)+"\n";
		}
		long end = System.currentTimeMillis();

		FileManager.writeString(s, "QuickPesq"+Type+""+size+".txt" );

		results[count++] = new Result((end - start), "QuickSort"+Type+""+size );
	}

	public static void console(String s) {
		System.out.println(s);
	}

}
