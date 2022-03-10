
	class Main {

		static int count = 0;

		public static void main(String[] args) {
			if (count < 3) {
				count++;
				main(null);
			} else {
				return;
				// System.out.println("else");
			}
			System.out.println("Hello World");
		}
		public class Demo {

			public static void main(String[] args) {

				List<Boolean> list = new ArrayList<>();
				list.add(true);
				list.add(Boolean.parseBoolean("false"));
				list.add(Boolean.TRUE);
				System.out.println(list.size());
				System.out.println(list.get(1) instanceof Boolean);

			}

		}
	}
	
	
	
}
