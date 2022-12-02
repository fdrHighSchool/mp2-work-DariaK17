# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
  public static void repeat(String[] args) {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j <= 9; j++) {
        for(int k = 0; k < 3; k++) {
            System.out.print(j);
        }
    }
    System.out.println();
    }
  }
}


2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
  class Main {
  public static void main(String[] args) {
    for(int i = 5; i > 0; i=i-1) {
      for(int j = 9; j >= 0; j=j-1) {
        for(int k = 5; k > 0; k=k-1) {
            System.out.print(j);
        }
    }
    System.out.println();
    }
  }
}
