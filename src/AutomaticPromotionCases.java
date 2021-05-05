/*
Automatic Promotion: one type is promoted to another implicitly if no matching data type is there
 char-->int
 byte-->short-->int-->float-->double
  int-->double/long
 long-->double/float

 */
public class AutomaticPromotionCases {
   /* void show(Object a) {                   //Object parent class of all data

        System.out.println("method object" );
    } */
   void show(StringBuffer a) {
       System.out.println("method StringBuffer" );

   }

    void show(String a) {                   //String data
        System.out.println("method string" );

    }
    void show(int a) { // int data
        System.out.println("method int");
    }
    void show(int... a){
        System.out.println("method varargs");
    }

    void show(int a, float b) {
        System.out.println("method int float");
    }
    void show(float a, int b) {
        System.out.println("method  float int");
    }


        public static void main (String[]args){
            AutomaticPromotionCases p = new AutomaticPromotionCases();
            // p.show('a'); //case 1: Char Data type this ll automatically promoted to int data type
              p.show("abc");// case 2:when we pass string data type compiler will give precedence to string type argument compared to its parent object type
      // p.show(null); case3 :it ll show ambigious error both matching String and StringBuffer data type
            p.show(2,5.6f);
            p.show(5.6f,3);
           //Case4:
           // p.show(2,2);
            /*Error:(41, 14) java: reference to show is ambiguous
            both method show(int,float) in AutomaticPromotionCases and
            method show(float,int) in AutomaticPromotionCases match */
            //case 5 int and varargs
            p.show(10); // ll call int method
            p.show(10,20,30); // ll call varargs
            p.show(); // ll call varargs if nothing ll b pass
    }

}
