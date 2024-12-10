package PRACTICE_PROBLEMS;


public class REVERSE_STRING {

    ////================================================================================================================////
    //"""""""""""""""""""""""""""""""""""""""""" |||| SELF DEFINED METHODS |||| """""""""""""""""""""""""""""""""""""//
    ////================================================================================================================////


    //reverse Function(METHOD :2)
//public static String reverseStr(String str){
//    int n = str.length();
//    if (n==0)
//        return "";
//    return str.charAt(n-1)+reverseStr(str.substring(0,n-1));
//        }




//
//// REVERSE USING ITERATIVE (METHOD :3)
//public static String reverseStr2(String str) {
//    int n = str.length();
//    if (n==0)
//        return "";
//
//    int l = 0 , r = n-1;
//    char[] ch = str.toCharArray();
//
//    while (l<r){
//        char c = ch[l];
//        ch[l] = ch[r];
//        ch[r] = c;
//        l++;
//        r--;
//    }
//    return new String(ch);
//}



//_______________________________________________________________________________________________________________________//
//----------------------------------------------------MAIN METHOD--------------------------------------------------------//
//-----------------------------------------------------------------------------------------------------------------------//

    public static void main(String[] args) {
        String str = "WHERE";//String

        /////////////////////////////////////////////  (((METHOD 1)))  ///////////////////////////////////////////////////

//        METHOD 1: ITERATIVE  APPROCH

//        System.out.println("Origional string : "+str);
//        for (int i=str.length()-1;i>0;i--){
//            System.out.print(str.charAt(i)+" ");
//        }



        //////////////////////////////////////////       ((( METHOD 2 )))     ///////////////////////////////////////////////

//        METHOD 2: USING RECURSIVE APPROCH
//        System.out.println(reverseStr(str));



        //////////////////////////////////////////     ((( METHOD 3 )))     /////////////////////////////////////////////////

//        METHOD :3
//        THE MOST OPTAMIZE SOLUTION WHOSE TIME COMPLEXITY AND SPAC COMPLEXITY IS LESS
//        System.out.println(reverseStr2(str));

    }
}
