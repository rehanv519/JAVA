public class loop
{
    public static void main(String[] args)
    {
         int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
int j = 0;
do {
  System.out.println(j);
  j++;
}
while (j < 5);

for (int k = 0; k < 5; k++) {
  System.out.println(k);
}


  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String p : cars) {
      System.out.println(p);
    }    

   for (int s = 1; s <= 2; s++) {
  for (int t = 1; t <= 3; t++) {
    System.out.print(s + "," + t + " ");
  }
}



    }
}