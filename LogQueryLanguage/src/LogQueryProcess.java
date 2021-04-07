import java.io.*;
import java.util.*;
import java.util.regex.*;

public class LogQueryProcess {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("/home/local/ZOHOCORP/vignesh-pt4085/Desktop/service.txt");
		int num = 1, i = 0, j = 0;

		int count = 0, count1 = 0, pos = 0;
		save obj = new save();
		Scanner scan = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		String f = scan.nextLine();
		obj.str1 = f;
		File fi = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(fi);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		FileInputStream fis = new FileInputStream(fi);
		ObjectInputStream ois = new ObjectInputStream(fis);
		save obj1 = (save) ois.readObject();
		System.out.println("the creteria stored object 2");
		System.out.println(obj1.str1);
		String[] first = f.split(" ");
		String[] stringarray = f.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		String str = sc.nextLine();
		String value = sc.nextLine();
		while (num > 0) {
			for (i = 0; i < stringarray.length; i++) {

				if (stringarray[i].equals(str)) {

					pos = i;
				}
			}

			while (scan.hasNextLine()) {
				i = 0;
				/*
				 * if(count==0) { System.out.println("Enter correct criteria"); break; }
				 */
				String[] st = scan.nextLine().split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");

				List<String> list = new ArrayList<String>();
				list = Arrays.asList(st);
				if (list.contains(value)) {
					for (String s3 : list) {

						System.out.println(stringarray[i] + ":" + s3);
						i++;
					}
				} else {

					for (j = 0; j < st.length; j++) {

						if (st[pos].contains(value)) {
							count1++;
							count++;

						}

					}
					if (count1 > 0) {
						for (String s3 : list) {

							System.out.println(stringarray[i] + ":" + s3);
							i++;
						}
					}
					count1 = 0;

				}

			}

			scan.close();
			System.out.println("if You want to continue enter one else enter zero ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}

			scan = new Scanner(file);
			str = sc.nextLine();
			value = sc.nextLine();
			value = sc.nextLine();
			count = 0;
		}

	}
}

class save implements Serializable {
	String str1;
}
