public class Utilities {
    public static String checkStringArrayValueOfIndex(String [] array){
        String result="";
        if(array[1].equals("MAINT")){
            result = "maintenance";
        } else if (array[1].equals("TEACH")) {
            result = "teacher";
        } else if (array[1].equals("STUD")) {
            result = "student";
        } else if (array[1].equals("ADMIN")) {
            result = "administration";
        } else if (array[0].equals("WORK")) {
            result = "WORK";
        }
        return result;
    }


    public static String [] shredStringToStrings(String string){
        String[] strings = string.split(" ");

        return strings;
    }

    public static int parseStringToInteger(String string){
        return Integer.parseInt(string);
    }
//    public static String [] checkLengthOfArray(String [] arr){
//        String [] strings = null;
//        if(arr.length>4){
//            strings = a
//        }
//    }
}
