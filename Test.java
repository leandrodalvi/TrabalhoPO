package TrabalhoPO;

import javax.swing.*;
import java.io.IOException;

public class Test {

	public long[] imovel400;

	public Test() {
		this.imovel400 = FileManager.readInputFile();
	}

	public Result heapTest(int size, String type) throws IOException {
		Result result;

		String testName = "HeapSortPesq" + type.substring(0, 1).toUpperCase() + type.substring(1) + "" + size;

		try {

			Item[] items = FileManager.read("imovel"+size+""+type+".txt");
			Item[] aux = new Item[1];
			String s = "";

			String Type = type.substring(0, 1).toUpperCase() + type.substring(1);

			long start = System.currentTimeMillis();

			new HeapSort().sort(items);

			FileManager.write(items,"HeapSort"+Type+""+size+".txt" );

			for (int i = 0; i < imovel400.length ; i++) {
				aux[0] = BinarySearch.binarySearch(items, imovel400[i]);
				s += Helper.SearchResult(imovel400[i], aux)+"\n";
			}
			long end = System.currentTimeMillis();

			FileManager.writeString(s, "HeapPesq"+Type+""+size+".txt" );

			result = new Result((end - start), "HeapSort"+Type+""+size );

		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_QuickSort" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_QuickSort" + testName);
		}

		return result;

	}

	public Result quickTest(int size, String type) throws IOException {

		Result result;
		String testName = "QuickSortPesq" + type.substring(0, 1).toUpperCase() + type.substring(1) + "" + size;

		try {

			Item[] items = FileManager.read("imovel"+size+""+type+".txt");
			Item[] aux = new Item[1];
			String s = "";

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

			result =  new Result((end - start), "QuickSort"+Type+""+size );

		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_QuickSort" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_QuickSort" + testName);
		}

		return  result;

	}

	public Result abbTest(int size, String type) {

		String testName = "ABBPesq" + type.substring(0, 1).toUpperCase() + type.substring(1) + "" + size;
		Result result;

		try {

			Item[] items = FileManager.read("imovel" + size + "" + type + ".txt");
			Item[] aux = new Item[1];
			String s = "";

			long start = System.currentTimeMillis();

			ABB abb = new ABB();

			for (int i = 0; i < items.length; i++) {
				abb.inserir(new ABBNode(items[0]), abb.getRaiz());
			}

			new HeapSort().sort(items);

			abb.balancear(items);

			for (int i = 0; i < imovel400.length; i++) {
				aux[0] = abb.search(imovel400[i]);
				s += Helper.SearchResult(imovel400[i], aux) + "\n";
			}

			long end = System.currentTimeMillis();

			FileManager.writeString(s, "ABBPesq" + testName + ".txt");

			result = new Result((end - start),  testName);
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
		}

		return result;
	}

	public Result avlTest(int size, String type) {

		String testName = "AVLPesq" + type.substring(0, 1).toUpperCase() + type.substring(1) + "" + size;
		Result result;

		try {

			Item[] items = FileManager.read("imovel" + size + "" + type + ".txt");
			Item[] aux = new Item[1];
			String s = "";

			long start = System.currentTimeMillis();

			AVL avl = new AVL();
			avl.insereRaiz(items[0]);

			for (int i = 1; i < items.length; i++) {
				avl.insert(items[i], avl.getRaiz());
			}

			for (int i = 0; i < imovel400.length; i++) {
				aux[0] = avl.search(imovel400[i]);
				s += Helper.SearchResult(imovel400[i], aux) + "\n";
			}

			long end = System.currentTimeMillis();

			FileManager.writeString(s, "AVLPesq" + testName + ".txt");

			result = new Result((end - start),  testName);
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_AVL" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_AVL" + testName);
		}

		return result;
	}

	public Result hashTest(int size, String type) throws IOException {

		String testName = "HashPesq" + type.substring(0, 1).toUpperCase() + type.substring(1) + "" + size;

		Result result;

		try {
			Item[] items = FileManager.read("imovel"+size+""+type+".txt");
			Item[] aux = new Item[1];
			String s = "";

			String Type = type.substring(0, 1).toUpperCase() + type.substring(1);

			long start = System.currentTimeMillis();

			Hashmap hashmap = new Hashmap(items.length);

			for ( int i = 1 ; i < items.length; i++ ) {
				hashmap.insert(items[i]);
			}

			FileManager.write(items,"HashSort"+Type+""+size+".txt" );

			for (int i = 0; i < imovel400.length ; i++) {
				aux[0] = hashmap.search(imovel400[i]);
				s += Helper.SearchResult(imovel400[i], aux)+"\n";
			}
			long end = System.currentTimeMillis();

			FileManager.writeString(s, "HashPesq"+Type+""+size+".txt" );

			result = new Result((end - start), "HashSort"+Type+""+size );

		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_Hash" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_Hash" + testName);
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "NullPointerException em "+testName);
			result = new Result(0, "FAIL_Hash" + testName);
		}

		return result;
	}


	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}


}
