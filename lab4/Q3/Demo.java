
class Demo {
    public static void main(String args[]) {


        String[] myString = {"AA", "BB", "CC", "AA", "DD"};


        for(int r=0;r<myString.length;r++) {

        String init = myString[r];

        for(int i=1;i<myString.length;i++) {
            if(myString[i] == init) {
                ini = myString[i];
            }
        }

    }

    System.out.println(ini);

    }
}