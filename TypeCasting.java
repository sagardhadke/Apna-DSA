public class TypeCasting {
    public static void main(String args[]){

        //Type Casting

        //loss off data forcefully converted values
        float marks = 85.98f;
        int a = (int) marks;
        //forcefully converted values OUTPUT :- 85
        System.out.println(a);

        //get char values 
        char ch = 'B'; //OUTPUT: A = 65, B = 66,C = 67.........
        int getch = (int) ch;
        System.out.println(getch);

    }
}
