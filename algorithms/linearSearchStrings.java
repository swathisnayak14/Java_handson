public class linearSearchStrings {
    public static void main(String args[]){
        String name="Swathi";
        char target='i';
        System.out.println(stringsearch(name,target));
    }
    static boolean stringsearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i))
                return true;
        }
        return false;
    }
}
