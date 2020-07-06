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

			for (int i = 1; i < items.length; i++) {
				abb.inserir(new ABBNode(items[i]), abb.getRaiz());
			}

			new HeapSort().sort(items);

			abb.balancear(items);

			for (int i = 0; i < imovel400.length; i++) {
				aux[0] = abb.search(imovel400[i]);
				s += Helper.SearchResult(imovel400[i], aux) + "\n";
			}

			long end = System.currentTimeMillis();

			FileManager.writeString(s, "ABBPesq" + testName + ".txt");

			result = new Result((end - start), "ABB" + testName);
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
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

			Hashmap hashmap = new Hashmap((int) 1.1 * size);

			for ( int i = 1 ; i < items.length; i++ ) {
				hashmap.insert(items[i]);
			}

			FileManager.write(items,"ABBSort"+Type+""+size+".txt" );

			//		for (int i = 0; i < imovel400.length ; i++) {
			//			aux[0] = abb.search(imovel400[i]);
			//			s += Helper.SearchResult(imovel400[i], aux)+"\n";
			//		}
			long end = System.currentTimeMillis();

			FileManager.writeString(s, "ABBPesq"+Type+""+size+".txt" );

			result = new Result((end - start), "ABBSort"+Type+""+size );

		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Erro ao Ler Arquivo em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
		}catch (StackOverflowError e) {
			JOptionPane.showMessageDialog(null, "Stack OverFlow em "+testName);
			result = new Result(0, "FAIL_ABB" + testName);
		}

		return result;

	}


}
