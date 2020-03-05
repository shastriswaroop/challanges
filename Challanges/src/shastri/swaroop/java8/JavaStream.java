package shastri.swaroop.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://www.youtube.com/watch?v=t1-YZ6bF-g0
public class JavaStream {

	public static void main(String[] args) throws IOException {
		// 1. Innteger Streams
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		// 2. Skip 5
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
		System.out.println();

		// 3. Sum of Integer
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println();

		// 4. Stream of, sorted and findfirst
		Stream.of("Ava", "Alberto", "Aneri").sorted().findFirst().ifPresent(System.out::print);	
		System.out.println();

		// 5. Array sort, filter and print
		String str[] = {"Swaroop", "kedar", "Mandar", "Tushar", "Sharwari"};
		Stream.of(str)
		.sorted()
		.filter(x->x.startsWith("S"))
		.forEach(System.out::println);
		System.out.println();
		
		// 6. Average of sqauare of an int array	
		Arrays.stream(new int[] {1,2,3,4,5})
		.map(x->x*x)
		.average()
		.ifPresent(System.out::println);
		System.out.println();
		
		// 7. Stream from list, filter and print
		List<String> shastris = Arrays.asList(str);
		shastris.stream()
	//	.sorted()
		.map(String::toLowerCase)
		.filter(x->x.startsWith("s"))
		.forEach(System.out::println);
		System.out.println();
		
		
		// 8. Read files and 
			Stream<String> bands = Files.lines(Paths.get("C:\\Users\\Prachi\\Documents\\GitHub\\challanges\\Challanges\\src\\shastri\\swaroop\\java8\\Cities.txt"));
			bands
			.sorted()
			.filter(x->x.length()>7)
			.forEach(System.out::println);
			bands.close();
		System.out.println();
		
		// 9. Stream rows
		List<String> cities = Files.lines(
				Paths.get("C:\\Users\\Prachi\\Documents\\GitHub\\challanges\\Challanges\\src\\shastri\\swaroop\\java8\\Cities.txt"))
				.filter(x->x.contains("Ba"))
				.collect(Collectors.toList());
		cities.forEach(System.out::println);	
		System.out.println();

//		Path path = Paths.get("C:\\Users\\Prachi\\Documents\\GitHub\\challanges\\Challanges\\src\\shastri\\swaroop\\java8\\data.txt");
		Path path = Paths.get("C:\\Users\\Prachi\\Documents\\GitHub\\challanges\\Challanges\\src\\shastri\\swaroop\\java8\\data.txt");
		// 10.Stream rows from csv file
		Stream <String> rows1 =Files.lines(path);
		int rowcount = (int)rows1
				.map(x->x.split(","))
				.filter(x->x.length==3)
				.count();
					
		System.out.println("RowCount :::: " + rowcount);
		rows1.close();
		System.out.println();

		// 11. Stream CSV file reading, using filter
		Stream <String> rows = Files.lines(path);
		rows.map(x->x.split(","))
		.filter(x->x.length==3)
		.filter(x->Integer.parseInt(x[2].trim())>1)
		.forEach(x->System.out.println(x[0] + " , " + x[1] + " , " + x[2]));
		rows.close();
		System.out.println();
		
		//12. Stream CSV file reading , collecting it in map
		Map<String,Integer> map = new HashMap<String,Integer>();
		Stream <String> rows2 = Files.lines(path);
		map = rows2.map(x->x.split(","))
		.filter(x->x.length==3)
		.filter(x->Integer.parseInt(x[2].trim())>1)
		.collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[2].trim())));
		for(Entry<String, Integer> key: map.entrySet()) {
			System.out.println(key.getKey() + " , " + key.getValue());
		}
		rows2.close();
		System.out.println();
		
		//13. Reuction - sum
		
		double total = Stream.of(7.3,1.5,4.8)
				.reduce(0.0, (Double a, Double b) -> a+b);
		System.out.println("Total = " + total);
		System.out.println();
		
		// 14. Reduction - Summary statics
		IntSummaryStatistics summary = IntStream.of(1,2,13,4,5)
				.summaryStatistics();
		System.out.println(summary);
	}

}
